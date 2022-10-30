package com.example.mygenshinproject

object CharacterData {
    object CharacterData{
        private val characterNames = arrayOf("Ayaka",
            "Ayato",
            "Kazuha",
            "Kokomi",
            "Shogun",
            "Tighnari",
            "Venti",
            "Yae Miko",
            "Yoimiya",
            "Zhongli"
        )

        private val characterDetails = arrayOf("Daughter of the Yashiro Commission's Kamisato Clan. Dignified and elegant, as well as wise and strong.",
            "The young but highly accomplished head of the Yashiro Commission's Kamisato Clan. Cultured and polite, he is a man of many ways and means.",
            "A wandering samurai from Inazuma who is currently with Liyue's Crux Fleet. A gentle and carefree soul whose heart hides a great many burdens from the past.",
            "The Divine Priestess of Watatsumi Island. All of the island's affairs are at this young lady's fingertips.",
            "Her Excellency, the Almighty Narukami Ogosho, who promised the people of Inazuma an unchanging Eternity.",
            "A young researcher well-versed in botany who currently serves as a Forest Watcher in Avidya Forest. He is a straight shooter with a warm heart — and a dab hand at guiding even the dullest of pupils.",
            "One of the many bards of Mondstadt, who freely wanders the city's streets and alleys.",
            "Lady Guuji of the Grand Narukami Shrine. Also serves as the editor-in-chief of Yae Publishing House. Unimaginable intelligence and cunning are hidden under her beautiful appearance.",
            "Owner of Naganohara Fireworks. Known as the Queen of the Summer Festival,  she excels in her craft of creating fireworks that symbolize people's hopes and dreams.",
            "A mysterious expert contracted by the Wangsheng Funeral Parlor. Extremely knowledgeable in all things."
        )

        private val characterImages = intArrayOf(
            R.drawable.ayaka,
            R.drawable.ayato,
            R.drawable.kazuha,
            R.drawable.kokomi,
            R.drawable.shogun,
            R.drawable.tighnari,
            R.drawable.venti,
            R.drawable.yae,
            R.drawable.yoimiya,
            R.drawable.zhongli
        )

        private val characterBanner = intArrayOf(
            R.drawable.ayaka_banner,
            R.drawable.ayato_banner,
            R.drawable.kazuha_banner,
            R.drawable.kokomi_banner,
            R.drawable.shogun_banner,
            R.drawable.tighnari_banner,
            R.drawable.venti_banner,
            R.drawable.yae_banner,
            R.drawable.yoimiya_banner,
            R.drawable.zhongli_banner
        )

        private val characterAffiliation = arrayOf(
            "Yashiro Commission",
            "Yashiro Commission",
            "The Crux",
            "Watatsumi Island",
            "Inazuma City",
            "Gandharva Ville",
            "Monstadt",
            "Grand Narukami Shrine",
            "Naganohara Fireworks",
            "Liyue Harbor",
        )

        private val characterBaseHP = arrayOf(
            "12858",
            "13715",
            "13348",
            "13471",
            "12907",
            "10850",
            "10531",
            "10372",
            "10164",
            "14695",
        )

        private val characterBaseAtk = arrayOf(
            "342",
            "299",
            "297",
            "234",
            "337",
            "268",
            "263",
            "340",
            "323",
            "251",
        )

        private val characterBaseDef = arrayOf(
            "784",
            "769",
            "807",
            "657",
            "789",
            "630",
            "669",
            "569",
            "615",
            "738",
        )

        private val characterElement = arrayOf(
            "Cryo",
            "Hydro",
            "Anemo",
            "Hydro",
            "Electro",
            "Dendro",
            "Anemo",
            "Electro",
            "Pyro",
            "Geo",
        )

        private val characterStory = arrayOf(
            "A pair of siblings have inherited the Kamisato Clan, one of the three most respected and prestigious clans in Inazuma City.The elder brother, Ayato, is the head of the clan and is in charge of government affairs. While his younger sister, Ayaka, known by all as the Princess, takes care of the clan's internal and external affairs.Ayaka often appears at social occasions and has more interactions with the common folk. As such, she is better known by the people and has gained a higher reputation than her elder brother. This has earned her the elegant title of Shirasagi Himegimi.As is known to all, Ayaka, the daughter of the Kamisato family, is a figure greatly admired by the people for her beauty, dignified demeanor, and noble character.",
            "As clan head of the Kamisato Clan, one of the great clans of the Tri-Commission, Kamisato Ayato is a household name in Inazuma.However, people do not have quite the same clear impression of him as they do of the Shirasagi Himegimi, the elegant and kind Ayaka.Most only know that he is an important figure in the Shogunate and the head of a famed noble house. But as for the details, there's little that they can say for sure.Some people say that the Yashiro Commission's festivals and events are ever meticulous and have been full of consideration for the people. Surely the Commissioner's hand is in all such matters.But others also say ah, but there is much to politics that should never see the light of day. And how could he have kept such a lofty position without a few tricks up his sleeve, hmm?Ayato himself is unfazed by such comments.Well, I consider myself merely a serious, dutiful public servant who owes his allegiance to the Almighty Shogun.",
            "Most people who meet Kaedehara Kazuha for the first time might be inclined to assume that he is just a trainee sailor with the Crux Fleet.After all, he is a gentle soul who enjoys reciting poetry when idle, and who speaks to everyone in a leisurely manner. Who could tell that he is a wanted man throughout Inazuma?Even Beidou, ever the good judge of character, could not tell that Kazuha could wield a sword with the skill of a seasoned warrior when she first decided to take him in.Who knows if it was the storms of life that smoothed out his rough edges, or if his natural restraint has kept his edge sheathed.",
            "The inhabitants of Watatsumi Island once lived in Enkanomiya, at the bottom of the sea.It was only by the grace of the god Orobaxi bringing them up to the surface that the civilization of Watatsumi Island exists today.When Orobaxi was slain by the Electro Archon, its body was left as a skeleton and its resentment permeated the land, giving rise to Tatarigami.Yet its desire to protect Watatsumi Island never faded. This will lives on in the bloodline of the Sangonomiya Clan, and follows them from generation to generation.The current heir to this bloodline is known as the Divine Priestess.The meaning behind this is as such: to inherit the will of a god in a mortal's body, and to defend this land and its people in that god's stead.",
            "Since the dawn of life, humankind has always borne an intense yearning for and curiosity about the world. This is the anchor point of their cognition and is the foundation of all reason.The world of the people of Inazuma is also thus. There, thunder, lightning, wind, and rain were primordial facts of life, as well as light, and the sea... and the Raiden Shogun.Babes nestling in their mothers' arms hear tales of the Shogun's slaying of many gods and conquering of other races.When young men and women roam the islands, they see the gorge split asunder by a blade of lightning and the pale, still-standing bones of the giant snake.Soldiers take to the battlefield with glory to the Shogun and her everlasting reign! upon their lips.The people work in contentment and peace, knowing that the Shogun and her loyal Tri-Commission are there.The great name of the Raiden Shogun has long shaken off the shackles of mere life, becoming the eternal traditional belief of Inazuma.People trust in this great name and its might, believing that their descendants shall witness the same sights, that the same faith will form the foundations of their inner worlds, and that this will pass on from generation to generation.This is the eternal paradise that the Almighty Shogun promised her people.",
            "Those who travel through Avidya Forest will sometimes meet a rather special Forest Watcher.He has large ears, a long tail, and a slightly delicate face. If a less discerning eye were to appraise him, he might even look like some kind of small, rare animal native to the forests.But anyone who has even been acquainted with him will know that there is clarity to his words and steadiness in his bearing.One moment, please. Judging from your equipment, you're a traveling merchant bound for Sumeru City, aren't you? Come back, please, you're going the wrong way.I mean, just look over there. The leaves are dense and the air grows damper. That doesn't seem like the main road leading to the city, no matter how you slice it.Oh dear, your waterskin is empty, isn't it?Come, let me share some with you. Being in a rainforest is no reason to skimp on your water supply.If you drink any old water you find out here, you might next find yourself at Bimarstan, you know?Of course, if that is part of your itinerary, then I suppose you have... interesting opinions.Amidst the flurry of instructions, the lost lamb will have all the arrangements made for them before they know it.Um... Thank you so much! Still, uh, might I ask who you are...?As the other Forest Rangers look upon the traveling merchant bowing to the diminutive Forest Watcher, they cannot help but laugh.Pfft-haha! Ahem. This is our G— Well, Forest Watcher Tighnari.",
            "Back when traveling bard Venti had only been in Mondstadt for a few months, his income was far less than the other more established bards in town. But once he had a few Mora in the pot from his performance, you could be sure he would hurry off to spend it at the same place every time — one of the city's taverns.Unfortunately for Venti, his childlike appearance meant that his attempts to acquire alcohol failed at every turn.The first time he was refused service, he was heard grumbling: I'm sure there were no such preposterous regulations last time I was here... Once he realized that the same rule applied to all taverns in town, he decided he would have to change his approach...The strategy he developed was drinking on the job — that is to say, playing the lyre while holding a wine cup in his mouth, urging his audience to buy him a drink from the bar if they liked his performances instead of giving him Mora.The novelty of this made him quite popular in Mondstadt.There was just one snag — he couldn't help but sneeze if a cat came close...And if he happened to be holding a wine cup in his mouth when it happened... needless to say, it would spell disaster.Venti, therefore, has one golden rule when selecting a spot to perform, and that is that there must be no cats in the vicinity.Easier said than done — the stray cats of Mondstadt seem to be quite drawn to him.",
            "The head shrine maiden of the Grand Narukami Shrine, descendant of Hakushin's lineage, Eternity's servant and friend, and the intimidating editor-in-chief of Yae Publishing House, a publisher of light novels...Come to think of it, Yae Miko's nicknames are as myriad as her changeable moods.The number of people who have tried to figure her out for various reasons could fill the streets from the Tenryou Commission estate to Yae Publishing House if you were to line them all up, but to this day, very few indeed have succeeded.Not that Miko has ever intended to conceal anything, of course. Any capriciousness is but the result of doing as she wills and pleases. A riddle with no solution is no riddle at all, in any case!You just need to remember that she will always be none other than the wise and beautiful Yae Miko.",
            "Yoimiya's name is renowned throughout Hanamizaka.She is the most skilled pyrotechnician in Inazuma and is known as the Queen of the Summer Festival.Yoimiya, who has inherited the mantle of Naganohara, is able to give people an unparalleled experience with her ever-changing and spectacular fireworks.In addition to being a craftsperson, she is also the heroic sister in the eyes of many children. No matter how big the problem is, Yoimiya always has a solution to save the day.Be it the illusions of fear or the shadows of cold reality, they will all dissipate under the starlight magic of Yoimiya's fireworks.The children are not the only ones she helps — as long as one is willing to talk to her about their troubles, she will lend a helping hand, and try her best to help them through the crisis.Splendid fireworks, warm starlight and passionate lights all join in a swirling dance in Yoimiya's hands. Her bright smile is always able to inspire fellow travelers and light up the way for them.",
            "In Liyue's traditional customs, receiving adepti and sending adepti off are equally important.The Hus of the Wangsheng Funeral Parlor, who have been in this business for 77 generations, are the masters of handling funerals. However, Hu Tao, the current owner of Wangsheng Funeral Parlor, primarily focuses on the art of sending mortals on their way.For the various ceremonies for sending adepti off, Hu Tao usually employs the help of a friend in more or less the same business. That person's name is Zhongli. The adepti have been with Liyue for millennia, but only a handful have ascended in the past three thousand years, which means that everything regarding the traditions now only exists in texts. This is not something one would likely witness twice in their entire lifetime.Not even the most particular and learned of researchers or scholars could find one fault in Wangsheng Funeral Parlor's ceremonies for sending adepti off.Everything must be perfect, from the costumes, the time, the place, the items, the weather, the scheduled length, the size of the permitted audience, to the stature, profession, and age of said audience. Nothing can be overlooked.When folk describe Zhongli as living history, the latter usually only smiles and sighs.I... just have a good memory.",
        )

        val listData: ArrayList<Character>
            get(){
                val list = arrayListOf<Character>()
                for (position in characterNames.indices){
                    val character = Character()
                    character.name = characterNames[position]
                    character.detail = characterDetails[position]
                    character.photo = characterImages[position]
                    character.banner = characterBanner[position]
                    character.affiliation = characterAffiliation[position]
                    character.baseHP = characterBaseHP[position]
                    character.baseAtk = characterBaseAtk[position]
                    character.baseDef = characterBaseDef[position]
                    character.element = characterElement[position]
                    character.story = characterStory[position]
                    list.add(character)
                }
                return list
            }
    }

}