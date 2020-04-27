import os
import pathlib
import shutil
import tkinter as tkinter
from tkinter import filedialog
import sys

def clean(dir_path):
    entries = os.listdir(dir_path)

    for files in entries:

        source = os.path.join('C:/Users/alaa afifi/Downloads/', files)
        ext = pathlib.Path(files).suffix

        if ext == ".zip":
            destination = os.path.join('E:/archives/',files)
            shutil.move(source, destination)

        if ext == ".exe":
            destination = os.path.join('E:/executables/',files)
            shutil.move(source, destination)

        if ext == ".mp3":
            destination = os.path.join('E:/audio/', files)
            shutil.move(source, destination)

        if ext == ".pdf":
            destination = os.path.join('E:/pdf/', files)
            shutil.move(source, destination)

        if ext == ".mp4":
            destination = os.path.join('E:/videos/', files)
            shutil.move(source, destination)

dir_path = filedialog.askdirectory()
if dir_path == "":
    sys.exit(0)
clean(dir_path)
