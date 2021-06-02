import sys, pandas



input_n = sys.argv[1]
output_t = ".".join(input_n.split(".")[:-1])
doc = pandas.read_excel(input_n, sheet_name=None)

for sheet in list(doc.keys()):
   doc[sheet].to_csv(f"{output_t}_{sheet}.csv")
