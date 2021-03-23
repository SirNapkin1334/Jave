import requests, re
cd = re.compile("filename=(.+)")

def get_filename(cont):
    name = re.findall(cd, cont)
    if len(name) == 0: raise Exception("No filename in header")
    elif len(name) > 1: print(f"Warning: multiple filenames found in {name[0]} header")
    return name[0]

with open(input("Enter the filename >"), "r") as f:
    for url in f.read().splitlines():
        r = requests.get(url)
        with open(get_filename(r.headers.get("content-disposition")), "wb") as o:
            o.write(r.content)
