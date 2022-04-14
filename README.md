# A domain‐specific language for farm management information systems

## Introduction

We devise an agricultural domain modelling language which is used to design and develop a Farm Management Information System (FMIS). This language can be used to develop a system that helps coordinate and manage farms by integrating data collection and processing functions.

## Requirements

Our project environment is AdoptOpenJDK 11.0.11.

## Usage

### Example project

- Run in command line:

  ```
  java -jar ./FarmTest/lib/farm_lib.jar ./FarmTest/src-gen/test.farm
  ```

  Then you can see the result has been generated in folder `./FarmTest/src-gen/`

- Run with Eclipse

  1. Open the project `FarmTest` with Eclipse
  2. Right click the project `FarmTest` and select "Run As > Run Configuration"
     ![](https://raw.githubusercontent.com/zolars/pic-bed/master/202204142010486.png)
  3. In Tab Arguments, input the src file you want to run the interpreter
     ![](https://raw.githubusercontent.com/zolars/pic-bed/master/202204142010488.png)
  4. Click the "Run" button and you can see the result have been generated in folder `./FarmTest/src-gen/`
     ![](https://raw.githubusercontent.com/zolars/pic-bed/master/202204142010489.png)

### Compile

1. Open projects with Eclipse.
2. Generate Xtext Artifacts
3. Build Xtend files
4. Run the project `uk.ac.kcl.farm` as Eclipse Application

### Testing with Runtime Eclipse

With the runtime Eclipse, you can open the project `uk.ac.kcl.farm.xpect` to run our test.

With XPect, the junit can run test and give feedback in order to automatically test whether the interpreter works as we wanted.
