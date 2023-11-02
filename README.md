![Logo](https://raw.githubusercontent.com/Robbna/muggle-api/master/banner.png)
# 🔎 Muggle API 
MuggleAPI is a JSON based API with data from the Harry Potter Universe! 🤓

## API Reference
### Base URL
```https
https://[...]/api
```

---

#### 🙋 Get all characters
```https
GET /characters
```
<details>
<summary>Example</summary>

```JSON
{
    "name": "Harry James Potter",
    "gender": "Male",
    "born": "31 July 1980, Godric's Hollow, West Country, England, Great Britain",
    "died": null,
    "species": "Human",
    "height": null,
    "weight": null,
    "hair_color": "Jet-black",
    "eye_color": "Bright green",
    "skin_color": "Light",
    "blood_status": "Half-blood",
    "marital_status": "Married",
    "nationality": "English",
    "animagus": null,
    "boggart": "Dementor",
    "house": "Gryffindor",
    "patronus": "Stag",
    "alias_names": [
      "The Boy Who Lived",
      "The Chosen One",
      "Undesirable No. 1",
      "Lightning (by Potterwatch)",
      "The Boy Who Lied (by the Daily Prophet)",
      "Gregory Goyle (under disguise of Polyjuice Potion)",
      "Neville Longbottom (the name he told Stanley Shunpike in his third year)",
      "Barny Weasley (under disguise of Polyjuice Potion)",
      "Vernon Dudley (the name he used to disguise his identity from Snatchers)",
      "Albert Runcorn (under disguise of Polyjuice Potion)",
      "Potty (by Peeves and Slytherins)"
    ],
    "jobs": [
      "Head of British Auror Office (formerly)",
      "Guest lecturer on Defence Against the Dark Arts",
      "Head of the Department of Magical Law Enforcement"
    ],
    "titles": [
      "Triwizard Champion",
      "Seeker",
      "Quidditch Captain",
      "Master of Death"
    ],
    "family_members": [
      "James Potter I (father) †",
      "Lily J. Potter (née Evans) (mother) †",
      "Ginevra Potter (née Weasley) (wife)",
      "James Potter II (son)",
      "Albus Potter (son)",
      "Lily L. Potter (daughter)",
      "Arthur Weasley (father-in-law)",
      "Molly Weasley (née Prewett) (mother-in-law)",
      "William Weasley (brother-in-law)",
      "Charles Weasley (brother-in-law)",
      "Percy Weasley (brother-in-law)",
      "Fred Weasley (brother-in-law) †",
      "George Weasley (brother-in-law)",
      "Ronald Weasley (brother-in-law)",
      "Fleur Weasley (née Delacour) (sister-in-law)",
      "Audrey Weasley (sister-in-law)",
      "Angelina Weasley (née Johnson) (sister-in-law)",
      "Hermione Granger (sister-in-law)",
      "Victoire Weasley (niece-in-law)",
      "Dominique Weasley (niece-in-law)",
      "Louis Weasley (nephew-in-law)",
      "Molly Weasley II (niece-in-law)",
      "Lucy Weasley (niece-in-law)",
      "Fred Weasley II (nephew-in-law)",
      "Roxanne Weasley (niece-in-law)",
      "Rose Granger-Weasley (niece-in-law)",
      "Hugo Granger-Weasley (nephew-in-law)",
      "Fleamont Potter (paternal grandfather) †",
      "Euphemia Potter (paternal grandmother) †",
      "Mr Evans (maternal grandfather) †",
      "Mrs Evans (maternal grandmother) †",
      "Petunia Dursley (née Evans) (maternal aunt/guardian) †",
      "Vernon Dursley (maternal uncle by marriage/guardian)",
      "Dudley Dursley (maternal first cousin)",
      "Mrs Dursley (maternal first cousin-in-law)",
      "Hardwin Potter (paternal ancestor) †",
      "Iolanthe Potter (née Peverell) (paternal ancestor) †",
      "Linfred of Stinchcombe (paternal ancestor) †",
      "Mr Peverell (paternal ancestor) †",
      "Ignotus Peverell (paternal ancestor) †",
      "Lord Voldemort (paternal distant cousin) †",
      "Delphini (paternal distant cousin)",
      "Potter family",
      "Evans family (maternal family)",
      "Fleamont family (paternal ancestors)",
      "Peverell family (paternal ancestors)",
      "Weasley family (in-laws)",
      "Prewett family (in-laws)",
      "House of Black (in-laws)"
    ],
    "romances": ["Cho Chang (ex-girlfriend)", "Ginevra Potter (wife)"],
    "wands": [
      "11', Holly, phoenix feather",
      "10¾', Vine, dragon heartstring (temporarily)",
      "10', Blackthorn, unknown core (temporarily)",
      "10', Hawthorn, unicorn hair (temporarily)",
      "15', Elder, thestral hair (temporarily)"
    ],
    "image": "https://static.wikia.nocookie.net/harrypotter/images/9/97/Harry_Potter.jpg",
    "wiki": "https://harrypotter.fandom.com/wiki/Harry_Potter"
  }
```

</details>

---

#### 🫖 Get all potions 
```https
GET /potions
```
<details>
<summary>Example</summary>

```JSON
{
    "name": "Polyjuice Potion",
    "description": "Temporarily transforms the drinker into another person. The drinker will take on the appearance of the person whose hair, fingernails, etc., are added to the potion. Not to be used for transforming into an animal. Seen/Mentioned: In 1992 used by Harry and Ron to enter Slytherin common Room; Severus Snape thought Harry was stealing his ingredients to make a polyjuice potion; Used multiple times in 1997 and 1998."
}
```

</details>

---

#### ✨ Get all spells 
```https
GET /spells
```
<details>
<summary>Example</summary>

```JSON
{
    "name": "Avada Kedavra",
    "other_name": "Killing Curse",
    "pronunciation": "ah-VAH-dah keh-DAV-rah",
    "spell_type": "Curse",
    "description": "",
    "mention": "Used by Tom Riddle to murder many of his victims without remorse.",
    "etymology": null,
    "note": null
}
```
</details>

---

#### 📚 Get all books 
```https
GET /books
```
<details>
<summary>Example</summary>

```JSON
{
    "id": 4,
    "title": "Harry Potter and the Goblet of Fire",
    "author": "J.K. Rowling",
    "publish_date": [
      {
        "UK": "07-08-2000"
      },
      {
        "US": "07-08-2000"
      }
    ],
    "plot_take_place_years": ["1994", "1995"],
    "book_covers": [
      {
        "id": 1,
        "country": "UK",
        "edition": "1st",
        "artist": "Giles Greenfield",
        "URL": "https://res.cloudinary.com/the-harry-potter-database/image/upload/c_fill,h_390,w_250/v1590249790/Harry_Potter_4_-_Harry_Potter_and_the_Goblet_of_Fire_-_Giles_Greenfield_lb38dj.jpg"
      },
      {
        "id": 2,
        "country": "US",
        "edition": "1st",
        "artist": "Mary GrandPré",
        "URL": "https://res.cloudinary.com/the-harry-potter-database/image/upload/c_fill,h_390,w_300/v1590237797/Harry_Potter_4_-_Harry_Potter_and_the_Goblet_of_Fire_-_Mary_Grandpre_dvcyl1.jpg"
      }
    ],
    "characters": [
      2, 18, 19, 20, 22, 23, 24, 26, 29, 30, 42, 50, 52, 55, 65, 66, 69, 70, 71,
      73, 81, 87, 90, 91, 92, 93, 97, 98, 99, 100, 101, 102, 105, 116, 117, 119,
      123, 125, 127, 130, 131, 133, 134, 139, 144, 145, 146, 147, 150, 151, 154,
      158, 160, 161, 162, 168, 185, 186, 188, 192, 204, 205, 211, 219, 222, 224,
      225, 227, 228, 232, 233, 237, 239, 243, 244, 245, 246, 247, 250, 253, 254,
      255, 258, 260, 262, 263, 267, 268, 270, 274, 277, 279, 281, 285, 288, 295,
      297, 298, 302, 303, 306, 308, 309, 311, 312, 319, 321, 323, 326, 327, 336,
      337, 344, 345, 349, 350, 351, 354, 355, 358, 360, 364, 368, 373, 382, 384,
      387, 397, 400, 407, 408, 409, 411, 450, 456, 457, 460, 463, 469, 471, 472,
      473, 475, 476, 477, 479, 483, 485, 486, 487, 488, 495, 498, 500, 507, 518,
      519, 521, 533, 542, 545, 546, 547, 548, 550, 551, 553, 556, 559, 565, 566,
      569, 571, 573, 574, 576, 578, 585, 587, 591, 595, 602, 605, 607, 609, 610,
      613, 614, 617, 620, 622, 623, 624, 625, 629, 630, 631, 634, 641, 642, 643,
      644, 645, 649, 654, 656, 657, 660, 662, 663, 664, 666, 668, 669, 672, 674,
      676, 677, 680, 687, 689, 691, 692, 693, 694, 695, 698, 699, 700, 701, 705,
      708, 710, 717, 721, 723, 725, 730, 732, 734, 740, 743, 744, 749, 750, 751,
      752, 756
    ]
}
```

</details>

---

## License
[MIT](https://choosealicense.com/licenses/mit/)