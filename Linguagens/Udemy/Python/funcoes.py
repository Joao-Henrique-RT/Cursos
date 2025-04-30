import os
import ssl
from pytube import YouTube
from pydub import AudioSegment

# Corrigir erro de SSL no pytube
ssl._create_default_https_context = ssl._create_unverified_context

def baixar_e_converter_para_mp3(url, pasta_saida="downloads"):
    try:
        # Criar a pasta de saída se não existir
        if not os.path.exists(pasta_saida):
            os.makedirs(pasta_saida)
        
        print("Baixando vídeo...")
        yt = YouTube(url)
        stream = yt.streams.filter(only_audio=True).first()
        arquivo_video = stream.download(output_path=pasta_saida)
        
        # Converter para MP3
        print("Convertendo para MP3...")
        arquivo_mp3 = os.path.splitext(arquivo_video)[0] + ".mp3"
        audio = AudioSegment.from_file(arquivo_video)
        audio.export(arquivo_mp3, format="mp3")
        
        # Remover arquivo de vídeo após conversão
        os.remove(arquivo_video)
        
        print(f"Download e conversão concluídos! Arquivo salvo em: {arquivo_mp3}")
    except Exception as e:
        print(f"Erro: {e}")

# Exemplo de uso
if __name__ == "__main__":
    link = input("Digite o link do vídeo: ")
    baixar_e_converter_para_mp3(link)
