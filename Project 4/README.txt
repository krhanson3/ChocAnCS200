OBJECTS AND CLASSES:
Person -> Member, Provider, and Operator should all inherit
Person functions:
VerifyIdentity

    Operator functions:
    CRUD functionality for Provider and Member
    (Create, Update, Delete)

    Provider functions:
    ProviderReportRequest

    Manager functions:
    ManagerReportRequest

Accounting -> ProviderServiceReportCreation, MemberServiceReportCreation, and WeeklySummaryReportCreation  
		should inherit Accounting functions

*Please note that a function that sends a report is different
from a report object, therefore ProviderReport can 
be a type of report and also a function that a Provider
can use to request a report. We should update our 
naming conventions to fix that confusion LOL
ORGANIZATION:

SoftwareOperator
	- Provider.java
    - Manager.java
    - Member.java
DataCenter (TEXT FILES ONLY)
    - MemberData.txt
    - ProviderData.txt
    - OperatorData
    - Manager
LoginVerifier
    - LoginVerifier.java
ReportGenerator
    - Report.java  
    - ReportGenerator.java
ReportCenter (TEXT FILES)
	- M.Kaitlyn.12158094.txt : contains member info & all services received sorted by date of service


Main
    - Main.java (ChocAn Software Class)


