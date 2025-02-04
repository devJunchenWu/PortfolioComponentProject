# Portfolio Part 1: Component Brainstorming

- **Name**: Junchen Wu
- **Dot Number**: 5837 (wu.5837)
- **Due Date**: 2/4/2025, by 3:00 PM EST

## Assignment Overview

The overall goal of the portfolio project is to have you design and implement
your own OSU component. There are no limits to what you choose to design and
implement, but your component must fit within the constraints of our software
sequence discipline. In other words, the component must extend from Standard and
must include both a kernel and a secondary interface.

Because this is a daunting project, we will be providing you with a series of
activities to aid in your design decisions. For example, the point of this
assignment is to help you brainstorm a few possible components and get some
feedback. For each of these components, you will need to specify the high-level
design in terms of the software sequence discipline. In other words, you will
describe a component, select a few kernel methods for your component, and select
a few secondary methods to layer on top of your kernel methods.

You are not required to specify contracts at this time. However, you are welcome
to be as detailed as you'd like. More detail means you will be able to get more
detailed feedback, which may help you decide which component to ultimately
implement.

## Assignment Checklist

To be sure you have completed everything on this assignment, we have littered
this document with TODO comments. You can browse all of them in VSCode by
opening the TODOs window from the sidebar. The icon looks like a tree and will
likely have a large number next to it indicating the number of TODOS. You'll
chip away at that number over the course of the semester. However, if you'd
like to remove this number, you can disable it by removing the following
line from the `settings.json` file:

```json
"todo-tree.general.showActivityBarBadge": true,
```

Which is not to be confused with the following setting that adds the counts
to the tree diagram (you may remove this one as well):

```json
"todo-tree.tree.showCountsInTree": true,
```

## Assignment Learning Objectives

Without learning objectives, there really is no clear reason why a particular
assessment or activity exists. Therefore, to be completely transparent, here is
what we're hoping you will learn through this particular aspect of the portfolio
project. Specifically, students should be able to:

1. Integrate their areas of interest in their personal lives and/or careers with
   their knowledge of software design
2. Determine the achievablility of a software design given time constraints
3. Design high-level software components following the software sequence
   discipline

## Assignment Rubric: 10 Points

Again, to be completely transparent, most of the portfolio project, except the
final submission, is designed as a formative assessment. Formative assessments
are meant to provide ongoing feedback in the learning process. Therefore,
the rubric is designed to assess the learning objectives _directly_ in a way
that is low stakes—meaning you shouldn't have to worry about the grade. Just
do good work.

| Learning Objective                                                                                        | Subcategory                 | Weight | Missing                                                     | Beginning                                                                              | Developing                                                                                     | Meeting                                                                                 |
| --------------------------------------------------------------------------------------------------------- | --------------------------- | ------ | ----------------------------------------------------------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| Students should be able to identify their values, interests, and/or goals as they relate to their designs | Metacognitive Memory        | 3      | (0) No attempt to summarize values, interests, and/or goals | (1) A brief description of values, interests, and/or goals is provided but lacks depth | (2) A description of values, interests, and/or goals is provided by are not related to designs | (3) A description of values, interests, and/or goals is provided and relates to designs |
| Students should be able to predict the feasibility of their designs                                       | Metacognitive Understanding | 3      | (0) No attempt to design components that are feasible       | (1) At least one component is feasible                                                 | (2) At least two components are feasible                                                       | (3) All three components are feasible                                                   |
| Students should be able to use the OSU discipline in all three designs                                    | Metacognitive Application   | 4      | (0) No attempt to follow the OSU discipline in designs      | (1) At least one design follows the OSU discipline                                     | (3) At least two designs follow the OSU discipline                                             | (4) All three designs follow the OSU discipline                                         |

Below is further rationale/explanation for the rubric items above:

1. Each design must align with your personal values and long-term
   goals. Because the goal of this project is to help your build out a
   portfolio, you really ought to care about what you're designing. We'll give
   you a chance to share your personal values, interests, and long-term goals
   below.
2. Each design must be achievable over the course of a single
   semester. Don't be afraid to design something very small. There is no shame
   in keeping it simple.
3. Each design must fit within the software sequence discipline. In
   other words, your design should expect to inherit from Standard, and it
   should contain both kernel and secondary methods. Also, null and aliasing
   must be avoided, when possible. The methods themselves must also be in
   justifiable locations, such as kernel or secondary.

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

I have a couple of hobbies! When I get the time, I enjoy meeting up with friends and playing tabletop games and board games. I used to participate in DnD campaigns, although after college started I haven't had the time to join another campaign (although I have played Baldur's Gate). I enjoy watching sci-fi movies; some of my favorites are Tenet and The Martian. I also enjoy going on walks.

In terms of academics, I hope to pursue graduate studies in computer science or data analysis. I see myself working as a backend software developer or an AI researcher. I hope to apply my programming skills from courses to projects with positive impacts. My goals related to programming are to design products that are user-friendly, flexible tools. I also want my code to be well-documented and reliable for different use cases.

## Assignment

As previously stated, you are tasked with brainstorming 3 possible components.
To aid you in this process, we have provided [some example components][example-components]
that may help you in your brainstorming. All of these components were made at
some point by one of your peers, so you should feel confident that you can
accomplish any of them.

There is no requirement that you use any of the components listed above.
If you want to model something else, go for it! Very common early object
projects usually attempt to model real-world systems like banks, cars,
etc. Make of this whatever seems interesting to you, and keep in mind that
you're just brainstorming right now. You do not have to commit to anything.

### Example Component

To help you brainstorm a few components, we've provided an example below of a
component you already know well: NaturalNumber. We highly recommend that you
mirror the formatting as close as possible in your designs. By following this
format, we can be more confident that your designs will be possible.

- Example Component: `NaturalNumber`
  - **Description**:
    - The purpose of this component is to model a non-negative
      integer. Our intent with this design was to keep a simple kernel that
      provides the minimum functionality needed to represent a natural number.
      Then, we provide more complex mathematical operations in the secondary
      interface.
  - **Kernel Methods**:
    - `void multiplyBy10(int k)`: multiplies `this` by 10 and adds `k`
    - `int divideBy10()`: divides `this` by 10 and reports the remainder
    - `boolean isZero()`: reports whether `this` is zero
  - **Secondary Methods**:
    - `void add(NaturalNumber n)`: adds `n` to `this`
    - `void subtract(NaturalNumber n)`: subtracts `n` from `this`
    - `void multiply(NaturalNumber n)`: multiplies `this` by `n`
    - `NaturalNumber divide(NaturalNumber n)`: divides `this` by `n`, returning
      the remainder
    - ...
  - **Additional Considerations** (_note_: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, basically all OSU components have to be mutable as long as they
        inherit from Standard. `clear`, `newInstance`, and `transferFrom` all
        mutate `this`.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - No. All methods work with integers or other NaturalNumbers.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - Yes. NaturalNumber is base 10, and we track that in a constant called
        `RADIX`.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes. The kernel methods `multiplyBy10` and `divideBy10` can be used to
        manipulate our natural number as needed. For example, to implement
        `increment`, we can trim the last digit off with `divideBy10`, add 1 to
        it, verify that the digit hasn't overflown, and multiply the digit back.
        If the digit overflows, we reset it to zero and recursively call
        `increment`.

Keep in mind that the general idea when putting together these layered designs
is to put the minimal implementation in the kernel. In this case, the kernel is
only responsible for manipulating a digit at a time in the number. The secondary
methods use these manipulations to perform more complex operations like
adding two numbers together.

Also, keep in mind that we don't know the underlying implementation. It would be
completely reasonable to create a `NaturalNumber1L` class which layers the
kernel on top of the existing `BigInteger` class in Java. It would also be
reasonable to implement `NaturalNumber2` on top of `String` as seen in
Project 2. Do not worry about your implementations at this time.

On top of everything above, there is no expectation that you have a perfect
design. Part of the goal of this project is to have you actually use your
component once it's implemented to do something interesting. At which point, you
will likely refine your design to make your implementation easier to use.

### Component Designs

> Please use this section to share your designs.

- Component Design #1: DnD Character Tracker Component

  - **Description**: This would be a container that stores and tracks the relevant statistics, items, and information pertaining to a single character in a Dungeons and Dragons (DnD) campaign. The container would store relevant progression information including level, experience points, and any other important information for the character.

  - **Kernel Methods**:

    - addHealthPoints(int amt): increases total health points of a character
    - removeHealthPoints(int amt): decreases total health points of a character
    - increaseAbility(String abilityName, int amt): increases the ability score of a character; this can occur when characters gain levels

  - **Secondary Methods**:

    - addItem(String name, int amt): adds items to a character's inventory
    - removeItem(String name, int amt): deletes items from a character's inventory, or "consumes" the item when characters use them
    - addGold(int amt): increases a character's gold count
    - removeGold(int amt): decreases a character's gold count
    - levelUpChar(): makes appropriate changes to a character's stats when they level up, such as increasing their total health points.
    - attackRoll(String attackName): simulates an attack roll that a character makes during a round of combat. attackName parameter is needed because characters can have multiple attack options available

  - **Additional Considerations** (_note_: "I don't know" is an acceptable
    answer for each of the following questions):

    - Would this component be mutable? Answer and explain: This component will likely be mutable because as a campaign progresses, characters will change, level up, and become stronger. They would also gain new items and additional abilities.

    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain: Yes, I believe using internal classes would make it easier for this component to store character information. For example, I could program a map to track the amount of each item belonging to a character.

    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain: One possible case for using constants is to track the statistics for different types of dice. We could use a constant to hold 20 for a d20, and 12 for a d12.

    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example: Yes, some of the secondary methods can be implemented using kernel methods. For instance, the levelUpChar() method could be implemented using addHealthPoints and increaseAbility methods. As characters level up, they gain health points and can gain certain feats that improve certain ability scores. However, other secondary methods don't require the kernel methods. For example, addGold and removeGold methods just need arithmetic and don't require other methods to implement.

- Component Design #2: Tower Defense Unit Tracker

  - **Description**: This component would store the relevant statistics of a "tower" unit in tower defense games, such as Balloons Tower Defense 5 or other similar games in the genre. This component would store attack damage, time to attack, range, and other relevant information. It would handle changing the stats when a tower levels up, and keeping track of any special abilities.

  - **Kernel Methods**:

    - increaseAttack(int amt): improves the damage for the tower's "attack" move.
    - increaseRange(int amt): improves the range stat, which this component stores as a radius. When calculating whether an enemy is "in range", the component will calculate the range as a circle area around the tower.
    - increaseTimeToAttack: increases the time taken to launch an attack, measured in seconds.
    - decreaseTimeToAttack: decreases time taken to attack.

  - **Secondary Methods**:

    - levelUpTower(): changes the relevant stats when a tower is "upgraded."
    - calculateRangeArea(): calculates the total range, measured as the area of a circle with the tower unit at its center. This is useful when towers need to determine whether they can launch attacks at enemy units.
    - sellTower(): "sells" the tower and resets the variable to all default values.

  - **Additional Considerations** (_note_: "I don't know" is an acceptable
    answer for each of the following questions):

    - Would this component be mutable? Answer and explain: This component would be mutable because the damage, range, and seconds per attack for a tower would change as the tower is "upgraded."

    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain: I likely wouldn't need to use internal classes for this component, because the information that needs to be stored isn't too complicated. Keeping track of stats like damage or range wouldn't require using other containers.

    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain: I don't think so, because at this time I don't know of any consistent numbers that could be tracked using constant variables.

    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example: Yes, most of the secondary methods can be implemented using kernel methods. For example, calculateRangeArea method can be implemented using the increaseRange method. When a tower is "upgraded", the component first calls increaseRange to update that amount; then it immediately calculates the range area of the tower.

- Component Design #3: 3D Coordinate Plane Model Component

  - **Description**: This component is a bit different from the other two ideas. It creates a 3D plane and tracks the coordinates of points graphed on that plane. It can also accept two points as parameters to create a vector between the two points.

  - **Kernel Methods**:

    - graphNewPoint(double x, double y, double z): graphs a new point on the 3D plane. User specifies the coordinates.
    - createUnitVector(String axisName): creates a unit vector on the X, Y, or Z axis as specified by the user.

  - **Secondary Methods**:

    - createVector();
    - magnitude(double x, double y, double z): returns the length of a straight line from the origin to a point at the specified coordinates.

  - **Additional Considerations** (_note_: "I don't know" is an acceptable
    answer for each of the following questions):

    - Would this component be mutable? Answer and explain: I feel that this component should not be mutable. Once a user graphs a point on the 3D plane, they shouldn't need to modify the coordinates unless they want to delete that point.

    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain: At this point, I'm a little unsure. I think using other containers would be effective for storing the coordinate of points, however I am unsure which container would be the best. I believe that Sequence and Map would be the best candidates.

    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain: Yes, I think constants would be appropriate to track the coordinates of the origin, and to store the unit vectors since they always have a length of one.

    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example: Yes, some of my secondary methods can be implemented using kernel methods. I'm not 100% set on what parameters should be passed to the createVector method, however the graphNewPoint method can be used to implement the createVector method.

## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

### Changelog

<!-- TODO: create CHANGELOG then delete this comment -->

At the end of every assignment, you should update the
[CHANGELOG.md](../../CHANGELOG.md) file found in the root of the project folder.
Since this is likely the first time you've done this, we would recommend
browsing the existing file. It includes all of the changes made to the portfolio
project template. When you're ready, you should delete this file and start your
own. Here's what I would expect to see at the minimum:

```markdown
# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## YYYY.MM.DD

### Added

- Designed a <!-- insert name of component 1 here --> component
- Designed a <!-- insert name of component 2 here --> component
- Designed a <!-- insert name of component 3 here --> component
```

Here `YYYY.MM.DD` would be the date of your submission, such as 2024.04.21.

You may notice that things are nicely linked in the root CHANGELOG. If you'd
like to accomplish that, you will need to make GitHub releases after each pull
request merge (or at least tag your commits). This is not required.

In the future, the CHANGELOG will be used to document changes in your
designs, so we can gauge your progress. Please keep it updated at each stage
of development.

### Submission

<!-- TODO: read the submission instructions then delete this comment -->

If you have completed the assignment using this template, we recommend that
you convert it to a PDF before submission. If you're not sure how, check out
this [Markdown to PDF guide][markdown-to-pdf-guide]. However, PDFs should be
created for you automatically every time you save, so just double check that
all your work is there before submitting. For future assignments, you will
just be submitting a link to a pull request. This will be the only time
you have to submit any PDFs.

<!-- TODO: upload a PDF of this document and the CHANGELOG to Carmen then delete this comment -->

### Peer Review

<!-- TODO: review the peer review guidelines then delete this comment -->

Following the completion of this assignment, you will be assigned three
students' component brainstorming assignments for review. Your job during the
peer review process is to help your peers flesh out their designs. Specifically,
you should be helping them determine which of their designs would be most
practical to complete this semester. When reviewing your peers' assignments,
please treat them with respect. Note also that we can see your comments, which
could help your case if you're looking to become a grader. Ultimately, we
recommend using the following feedback rubric to ensure that your feedback is
both helpful and respectful (you may want to render the markdown as HTML or a
PDF to read this rubric as a table).

| Criteria of Constructive Feedback | Missing                                                                                                                           | Developing                                                                                                                                                                                                                                | Meeting                                                                                                                                                               |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Specific                          | All feedback is general (not specific)                                                                                            | Some (but not all) feedback is specific and some examples may be provided.                                                                                                                                                                | All feedback is specific, with examples provided where possible                                                                                                       |
| Actionable                        | None of the feedback provides actionable items or suggestions for improvement                                                     | Some feedback provides suggestions for improvement, while some do not                                                                                                                                                                     | All (or nearly all) feedback is actionable; most criticisms are followed by suggestions for improvement                                                               |
| Prioritized                       | Feedback provides only major or minor concerns, but not both. Major and minar concerns are not labeled or feedback is unorganized | Feedback provides both major and minor concerns, but it is not clear which is which and/or the feedback is not as well organized as it could be                                                                                           | Feedback clearly labels major and minor concerns. Feedback is organized in a way that allows the reader to easily understand which points to prioritize in a revision |
| Balanced                          | Feedback describes either strengths or areas of improvement, but not both                                                         | Feedback describes both strengths and areas for improvement, but it is more heavily weighted towards one or the other, and/or descusses both but does not clearly identify which part of the feedback is a strength/area for improvement  | Feedback provides balanced discussion of the document's strengths and areas for improvement. It is clear which piece of feedback is which                             |
| Tactful                           | Overall tone and language are not appropriate (e.g., not considerate, could be interpreted as personal criticism or attack)       | Overall feedback tone and language are general positive, tactul, and non-threatening, but one or more feedback comments could be interpretted as not tactful and/or feedback leans toward personal criticism, not focused on the document | Feedback tone and language are positive, tactful, and non-threatening. Feedback addesses the document, not the writer                                                 |

### Assignment Feedback

If you'd like to give feedback for this assignment (or any assignment, really),
make use of [this survey][survey]. Your feedback helps make assignments
better for future students.

<!-- TODO: follow the link to share your feedback then delete this comment -->

[example-components]: https://therenegadecoder.com/code/the-never-ending-list-of-small-programming-project-ideas/
[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
[survey]: https://forms.gle/dumXHo6A4Enucdkq9
