- Exam

- ExamCenters

  - Exam --- Centers (1 : n)

- ClassRooms

  - ExamCenter --- ClassRooms (1 : n)

- SuperVisor

  - ExamCenter --- SuperVisor (1 : 1)
  - SuperVisor is a staff member

- Inviligator

  - Classroom --- Inviligator (1 : 1)
  - Inviligator is a staff member

- Student

  - Classroom --- Students (1 : n)
  - Studnets can be add / remove

- Need to note down:
  - interfaces
  - class signatures, inheitance relationships
  - methods singatures
  - key fields and relationships, aggregations, compositions, cardinalities between entities
