##4. Load the Titanic dataset into one of the data structures (NumPy or Pandas).
##Display header rows and description of the loaded dataset.
##Remove unnecessary features (E.g. drop unwanted columns) from the dataset.
##Manipulate data by replacing empty column values with a default value.

##Pandas for structured data operations and manipulations.

import pandas as pd
from pandas import Series, DataFrame
import matplotlib.pyplot as plt

titanic_df = pd.read_csv("titanic.csv")

print("======DATA HEADERS======")
print(titanic_df.head())

print("======DATA INFO=====")
titanic_df.info()

print("======DATA DESCRIPTION=====")
print(titanic_df.describe())

#replacing empty column values with default value Q
titanic_df["Embarked"] = titanic_df["Embarked"].fillna("Q")
print(titanic_df["Embarked"])
