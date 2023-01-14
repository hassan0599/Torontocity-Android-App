package com.example.torontocity.data.local

import com.example.torontocity.R
import com.example.torontocity.data.Category
import com.example.torontocity.data.Recommendation

object LocalRecommendationsDataProvider {
    val allCategories = LocalCategoriesDataProvider.allCategories
    val allRecommendations = mutableListOf(
        Recommendation(
            name = "Pilot Coffee Roasters",
            address = "117 Ossington Ave, Toronto, ON M6J 2Z2",
            category = allCategories[0],
            description = """
                With a passion for great coffee, Pilot Coffee Roasters was founded in 2009 with the goal of introducing specialty coffee to Toronto.
                With our first location and original roastery located in Toronto’s Leslieville neighbourhood, Pilot was built around our core values of sourcing ethical, Direct Trade coffee and building transparency in the process from farm to cup. Pilot operated as a specialty café and roastery, supplying coffee, equipment, training, technical support, and consulting services for new café owners across the city. Two years later, a second café was opened on the Ossington strip in Toronto’s west end, and by 2013, having outgrown the original location, the roastery operations moved to our current headquarters at 50 Wagstaff Drive.
            """.trimIndent(),
            image = R.drawable.coffee_1,
            id = 1
        ),
        Recommendation(
            name = "Sam James Coffee Bar",
            address = "297 Harbord St, Toronto, ON M6G 1G7",
            category = allCategories[0],
            description = """
                Consistently roasting naturally sweet, chocolatey coffee is at the heart of what we do. Excellent quality comes from experience, and we've been offering Toronto's best coffee for over a decade. What separates us from the rest is our commitment to highly accessible medium roasts that are easy to brew and, most importantly, delicious to drink.
                Too often, specialty coffee moves in the direction of lightly roasted coffee which is challenging to brew. We think coffee should be sweet, not sour, earthy, smoky, or grassy. We have a simple menu and roast in small batches, so we can promise that the bag of beans you enjoyed last time will taste the same as the bag you just ordered.
            """.trimIndent(),
            image = R.drawable.coffee_2,
            id = 2
        ),
        Recommendation(
            name = "De Mello Coffee",
            address = "2489 Yonge St, Toronto, ON M4P 2H6",
            category = allCategories[0],
            description = """
                De Mello Coffee is an award-winning roastery that specializes in specialty coffee. We believe in sourcing the best coffee from around the world and roasting them to perfection. Our passion for coffee is evident in everything we do, from our meticulous sourcing process to our artisanal roasting methods. Our goal is to share our love of coffee with the world and help people discover the joys of a perfect cup of coffee.
            """.trimIndent(),
            image = R.drawable.coffee_3,
            id = 3
        ),
        Recommendation(
            name = "Neo Coffee Bar",
            address = "770 Bay St. Unit 3, Toronto, ON M5G 0A6",
            category = allCategories[0],
            description = """
                NEO COFFEE BAR opened in August of 2015. Located in St. Lawrence Market neighborhood on Frederick Street and open 7 days a week, it is the perfect spot to sit and catch up on the day’s news while enjoying your caffeine fix. We are neighbors with schools and big offices alike, and we make everyone feel like they have a community space to share. We look forward to making NEO COFFFEE BAR your new local.
                At NEO COFFEE BAR, we want to serve you with a serene coffee experience. Tastefully designed aesthetic where you find respite from the city is a pillar of focus for us. Enhanced by curvilinear concrete walls, warm wood accents, and modern furniture, our refreshingly minimalist, light-filled coffee bar is beautifully furnished with bench seating, pedestal tables, and spacious booths. The space provides a unique, out of the mold, look and feel, and provides a coffee oasis away from the hustle of downtown Toronto.
            """.trimIndent(),
            image = R.drawable.coffee_4,
            id = 4
        ),
        Recommendation(
            name = "Boxcar Social",
            address = "235 Queens Quay W, Toronto, ON M5J 2G8",
            category = allCategories[0],
            description = """
                This space is easily our most ambitious, with an inside capacity of more than two hundred and a patio that looks out onto Lake Ontario. Bringing our coffee program, a full lunch and dinner menu, and exciting alcohol programs to a reimagined waterfront is a challenge we couldn’t wait to take on.
                The reward was immediate upon opening: a coffee on the boardwalk in the summer, chasing a skate on the outdoor rink before grabbing a glass of wine; these are experiences unique to our small plot of real estate.
                We’re so excited to be a part of the reinvigoration of Toronto's waterfront.
            """.trimIndent(),
            image = R.drawable.coffee_5,
            id = 5
        ),
        Recommendation(
            name = "Hale Coffee Company",
            address = "300 Campbell Ave Unit #103, Toronto, ON M6P 3V6",
            category = allCategories[0],
            description = """
                Born out of the dynamism and unstoppable energy of Toronto, Hale Coffee has emerged as an independent coffee roaster dedicated to educating our customers that specialty, quality coffee, has a rightful place in our city. Everyone on our team shares a genuine belief in the potential for coffee to bring people together and inspire a creative community - one as diverse as coffee itself.
            """.trimIndent(),
            image = R.drawable.coffee_6,
            id = 6
        ),
        Recommendation(
            name = "RGLR",
            address = "548 Annette St, Toronto, ON M6S 2C2",
            category = allCategories[0],
            description = """
                RGLR (AKA The Regular) serves up coffee, music and vibes in a relatively sleepy stretch of the city. Nestled between the Junction and Bloor West Village, the space is a third wave coffee shop but also a blank canvas for creativity. Situated in a former furniture store, photography hangs on the walls and a turntable takes up residence in one corner.
            """.trimIndent(),
            image = R.drawable.coffee_7,
            id = 7
        ),
        Recommendation(
            name = "Ninetails Coffee Bar",
            address = "651 Bloor St W, Toronto, ON M6G 1L1",
            category = allCategories[0],
            description = """
                Ninetails Coffee Bar is a cafe specializing in dorayaki: Japanese honey pancake sandwiches. This sleek cafe on Bloor Street gets it name from the mythical fox spirit originating from East Asian folklore (which was the inspiration for the Pokemon of the same name, for the anime nerds). 
                Owner Tabare Orti  is not a huge Pokemon fan, but he is a huge fan of Japanese culture, hence the decorations bamboo lights, umbrellas from Kyoto, and a menu largely served on tatami mats.
            """.trimIndent(),
            image = R.drawable.coffee_8,
            id = 8
        ),
        Recommendation(
            name = "Ethica Coffee Roasters",
            address = "213 Sterling Rd, Toronto, ON M6R 2B2",
            category = allCategories[0],
            description = """
                We really love what we do; coffee is our life. Our mission is to provide you with the best variety of coffee that the world has to offer. At Ethica Coffee Roasters, we absolutely refuse to be satisfied with anything except for what is true. Coffee moves us. And the way it's cared for speaks volumes about the delicate process of being cultivated, roasted, and brewed – an art form in its own right.
                At Ethica Coffee Roasters you’ll find yourself leaving your daily tensions behind, inspired by a moment of honest, thoughtful reflection.
            """.trimIndent(),
            image = R.drawable.coffee_9,
            id = 9
        ),
        Recommendation(
            name = "Hot Black Coffee",
            address = "245 Queen St W, Toronto, ON M5V 1Z4",
            category = allCategories[0],
            description = """
                We are, above all, a friendly place with sincere professional service. Led by Momi, our National competition barista, our mission is to provide consistently world-class coffee and innovative drinks. All natural and prepared daily from scratch with fresh seasonal ingredients – our food is simply great.
            """.trimIndent(),
            image = R.drawable.coffee_10,
            id = 10
        ),
        Recommendation(
            name = "Thor Espresso Bar",
            address = "245 Queen St W, Toronto, ON M5V 1Z4",
            category = allCategories[0],
            description = """
                Thor Espresso Bar was launched in 2010 - a progressive, third-wave independent coffee shop with a laser focus on providing great coffee while setting ambitious sustainability goals and lessening its environmental impact.
                Sharing in this same commitment and values, flagship Odin Café + Bar was introduced to Corktown in 2015-2020 and a second Thor Espresso to trendy Queen West in 2018. Each boasts coffee industry “firsts”: the first Slayer espresso machine in Toronto; the first Ritual mobile ordering merchant; the first third-wave café with a completely plant-based menu.
            """.trimIndent(),
            image = R.drawable.coffee_11,
            id = 11
        ),
        Recommendation(
            name = "Arvo Coffee & Wine",
            address = "80 Atlantic Ave, Toronto, ON M6K 1X9",
            category = allCategories[0],
            description = """
                Arvo has been serving up good coffee and community in the Distillery District since they opened in 2016 but for their Liberty Village location they've added a huge patio and wine to the mix.
                Caffeinated drinks and brunch options are available during the day starting at 8 a.m. Then the Liberty Village location turns into a full wine bar right in time for happy hour Tuesday to Saturday.
            """.trimIndent(),
            image = R.drawable.coffee_12,
            id = 12
        ),
        Recommendation(
            name = "Milky's",
            address = "760 Dundas St W, Toronto, ON M6J 1T8",
            category = allCategories[0],
            description = """
                Milky's is a Toronto café that serves thoughtfully crafted coffee and seasonal specialty drinks. Our flavours are unconventional, our presentation is considered and our interior is cozy.
                Coffee can be fuel, but it can also be more. Every season we create new drinks to match the weather. From our Chinatown Fog to the Cha Cha Cha, we invest time in finding the best ingredients for the most enjoyable quench.
                The experience of a drink goes beyond the tongue. Its appearance creates desire, expectations, and more. We researched the perfect ceramic vessels that have the appearance, and performance, for our drinks. We found it in Arita 2016, a collection of contemporary ceramics handmade in the history-rich Arita area of Japan.
            """.trimIndent(),
            image = R.drawable.coffee_13,
            id = 13
        ),
        Recommendation(
            name = "Fahrenheit Coffee",
            address = "120 Lombard St, Toronto, ON M5C 3H5",
            category = allCategories[0],
            description = """
                Voted Best Specialty Coffee House in Toronto since 2012. Fahrenheit Coffee offers three different espresso origins which rotate seasonally. Expertly crafted. Our favorite beverage is the Cortado.
            """.trimIndent(),
            image = R.drawable.coffee_14,
            id = 14
        ),
        Recommendation(
            name = "Hamers Coffee",
            address = "870 Dundas St W, Toronto, ON M6J 1V7",
            category = allCategories[0],
            description = """
                Hamers Coffee serves a curated selection of coffees and teas in an intentionally designed space. They also serve artisanal breakfast sandwiches made in house, the idea being to modernize and elevate cafe staples.
                Everything is set up for efficiency in the colourful space designed with help from Company Company and Jaime McQuaig of GUNNAR. Jutting placement of the angular bar is intended to create an opportunity for conversation.
            """.trimIndent(),
            image = R.drawable.coffee_15,
            id = 15
        ),
        Recommendation(
            name = "Mildred's Temple Kitchen",
            address = "870 Dundas St W, Toronto, ON M6J 1V7",
            category = allCategories[1],
            description = """
                Mildred’s Temple Kitchen opened with a heartfelt philosophy. We’re here because we love food, people and the simple pleasures of life: our temple is the place where we practice our devotion.
                Well hidden in the heart of Liberty Village, Mildred’s Temple Kitchen reflects our commitment to providing locally sourced, seasonal ingredients, simply and sumptuously prepared. Bright and industrial, yet relaxing and intimate, the warmth of Mildred’s lingers long after the guests have gone home.
                Dedicated to providing a gathering place that offers delicious food and unique culinary memories, we’re glad you discovered us.
            """.trimIndent(),
            image = R.drawable.restaurant_1,
            id = 16
        ),
        Recommendation(
            name = "Edulis Restaurant",
            address = "169 Niagara St, Toronto, ON M5V 1C9",
            category = allCategories[1],
            description = """
                Edulis is about many things – the pleasure of enjoying a gathering around the table to share authentic dishes and to be greeted like a friend; conviviality, feasting, celebrating the craft and tradition of cooking, honesty, and spectacular ingredients.
                Listening to your preferences, aversions, appetite, and making you a beautiful feast. As the season unfolds, so does our inspiration. Our menus change to showcase the ingredients of the moment - with a strong focus on seafood, vegetables, and wild mushrooms.
            """.trimIndent(),
            image = R.drawable.restaurant_2,
            id = 17
        ),
        Recommendation(
            name = "Mamakas Taverna",
            address = "80 Ossington Ave, Toronto, ON M6J 2Y7",
            category = allCategories[1],
            description = """
                It all started with Mamakas Taverna, founded in 2014 by owner and operator Thanos Tripi. A tribute to the matriarchs of his family, Mamakas provided Thanos an opportunity to further connect with his Greek heritage whilst channeling the most authentic representation of Aegean cuisine to a new generation of food lovers and culturalists.
                As the Aegean region evolved and expanded its worldly appeal, so to the identity of MFG. The Agora and Bar Koukla were soon added to the stable to build on the cultural renaissance of the Aegean region. The iconic islands of Mykonos and Santorini have brought a new wave of guests to our tables, and with them a wider appreciation of Aegean music, art, food and wine.
            """.trimIndent(),
            image = R.drawable.restaurant_3,
            id = 18
        ),
        Recommendation(
            name = "Richmond Station",
            address = "1 Richmond St W, Toronto, ON M5H 3W4",
            category = allCategories[1],
            description = """
                Richmond Station is a neighbourhood restaurant. We grew up with a passion for those romantic neighbourhood spots where you could reliably grab a bite to eat once a month, two nights in a row or whenever the fridge was bare. A neighbourhood spot means the owners are around most days, the staff maintain their position for years and there’s too many familiar faces to really just “be in and out”. Your favourite items never leave the menu and if they do, the chef wants to make it for you all the same.
            """.trimIndent(),
            image = R.drawable.restaurant_4,
            id = 19
        ),
        Recommendation(
            name = "Fresh Restaurants",
            address = "47 Front St E, Toronto, ON M5E 1B3",
            category = allCategories[1],
            description = """
                Since 1999, Fresh has been Toronto’s original source for modern plant-based food. We offer a full line of raw, organic cold pressed juices, and craft cocktails made with local artisanal ingredients. For 20 years it’s been our mission to prove that a plant-based diet can be satisfying, energizing and crave-able. Our food is made daily, in-house, from whole, natural ingredients.
            """.trimIndent(),
            image = R.drawable.restaurant_5,
            id = 20
        ),
        Recommendation(
            name = "Bar Raval",
            address = "505 College St, Toronto, ON M6J 2J3",
            category = allCategories[1],
            description = """
                With its Gaudi-esque organic, skeletal decor and authentic tapas-bar vibes, Raval isn't just a bar – it feels like a whole independent world. Several years after it first opened, rituals like a morning cortado standing at the bar or after-work pintxos around Raval's high-top tables have become ingrained into days on this eclectic stretch of Toronto's Little Italy.
            """.trimIndent(),
            image = R.drawable.restaurant_6,
            id = 21
        ),
        Recommendation(
            name = "Terroni",
            address = "57 Adelaide St E, Toronto, ON M5C 1K6",
            category = allCategories[1],
            description = """
                From day one, our mission was to offer a true, authentic Italian food experience. As a result, we found ourselves saying “no” to some requests by our customers. While it is fully embraced by some, at times it is met with resistance.
                There are two reasons why we do this. The first one is because many of the dishes we make are deeply rooted in Italian regional cooking and we’ve never been interested in re-inventing them. If we accommodated modifications, the dishes would no longer be authentic, they’d no longer be something we felt confident serving to one of our guests; and they’d no longer be “Terroni”. At times, this attention has been confused with poor customer service. On the contrary, it has little to do with a lack of decorum and everything to do with the desire to stay true to what has been passed on to us.
            """.trimIndent(),
            image = R.drawable.restaurant_7,
            id = 22
        ),
        Recommendation(
            name = "Banjara Indian Cuisine",
            address = "796 Bloor St W, Toronto, ON M6G 1L7",
            category = allCategories[1],
            description = """
                From the breads and biryanis to the sizzlers and curries one will experience a unique taste at Banjara. A nearly 70 item a-la-carte dinner menu, offers succulent Tandoori sizzlers, a variety of red meat, chicken and vegetable curries, biryanis and naans, etc. A variety of vegetarian dishes are also made available in the menu to meet the vegetarians' needs.
                Banjara Indian Cuisine is conveniently located in the heart of the Toronto city surrounded by major banks, shopping centers, between Ossington and Christie subway stations, and the major intersections of the city. The restaurant has been regularly catering to University of Toronto Food Services, Faculty of Law and many other law firms in Toronto for the last 3 years. This 147-seater restaurant offers special deals for in-house parties and for catering.
            """.trimIndent(),
            image = R.drawable.restaurant_8,
            id = 23
        ),
        Recommendation(
            name = "Bernhardt's",
            address = "202 Dovercourt Rd, Toronto, ON M6J 3C8",
            category = allCategories[1],
            description = """
                Opened amid the pandemic, Taverne Bernhardt’s has quickly evolved into a restaurant so dear to Toronto’s food scene that it is hard to imagine Dovercourt without the neighbourhood gem. Helmed by duo Carmelina Imola and chef Zach Kolomeir, who are also responsible for Harbord Village’s ‘French-ish’ restaurant Dreyfus, Bernhardt’s is precisely what Toronto needed in a restaurant. It is an unpretentious, convivial spot that injects seamless ease into the way it operates, with late summer dinners feeling more like a friend’s dinner party. The co-owners spent time working in Montreal, with chef Kolomeir holding a prior title of chef de cuisine at Joe Beef, which translates into how Bernhardt’s functions, that certain joie de vivre.
            """.trimIndent(),
            image = R.drawable.restaurant_9,
            id = 24
        ),
        Recommendation(
            name = "Sushi Kaji",
            address = "860 The Queensway, Etobicoke, ON M8Z 1N7",
            category = allCategories[1],
            description = """
                At Sushi Kaji, we are particular about authenticity. Kaji handpicks fish imported from Japan daily for the freshest and the best quality. Garnishes and condiments are exclusively imported from Japan. Although we do not serve "popular Japanese food" like "California roll" and "Teriyaki,” we will be pleased to introduce you to the authentic Japanese food culture.
                To maintain the highest quality of food and service, only a limited number of seats are available each evening. Reservations are highly recommended in advance.
            """.trimIndent(),
            image = R.drawable.restaurant_10,
            id = 25
        ),
        Recommendation(
            name = "Rasta Pasta",
            address = "61 Kensington Ave, Toronto, ON M5T 2K1",
            category = allCategories[1],
            description = """
                Rasta Pasta is an innovative fusion restaurant that combines the essence of Jamaican and Italian culture to give you a unique experience.
                The Rasta Pasta recipe has garnered a high rating on yelp, zamato, google reviews and more. We pride our selves on creating and serving good quality, savouring food to give customers a top notch experience they can recommend to others.
            """.trimIndent(),
            image = R.drawable.restaurant_11,
            id = 26
        ),
        Recommendation(
            name = "Ristorante Sotto Sotto",
            address = "120 Avenue Rd, Toronto, ON M5R 2H4",
            category = allCategories[1],
            description = """
                A restaurant so nice they named it twice! Ristorante Sotto Sotto is the Annex's long-established destination for upscale, south-central Italian fare with all food made as if it were the old country. Owner and founder Marisa Rocca moved to Toronto from Rome over 25 years ago and, through much hard work and determination, has an established a clientele base and made a name for herself as one of Toronto's best. 
                To maintain the integrity and authenticity of its dishes, Sotto Sotto uses only freshest ingredients and does not allow for substitutions. But with options like the carbonara made with artisanal Zaccagni spaghetti tossed with crispy pork cheek, Sarawak black pepper and Roman pecorino cheese, what would you want to change? Worth noting is their partnership with the non-profit Mealshare Canada wherein ordering certain indicated menu items provides a meal to a youth in need.
            """.trimIndent(),
            image = R.drawable.restaurant_12,
            id = 27
        ),
        Recommendation(
            name = "Bar Isabel",
            address = "797 College St, Toronto, ON M6G 1C7",
            category = allCategories[1],
            description = """
                Bar Isabel is a Spanish Inspired small plates restaurant, with a focus on Catalan cuisine. Our entire menu is designed to be shared, and the food is served "Family Style". We recommend 2-4 dishes per person to form a complete meal. Most of our dishes can be made gluten & dairy free, with some exceptions.
            """.trimIndent(),
            image = R.drawable.restaurant_13,
            id = 28
        ),
        Recommendation(
            name = "Pizzeria Libretto",
            address = "221 Ossington Ave, Toronto, ON M6J 2Z8",
            category = allCategories[1],
            description = """
                While we are best known for bringing authentic Neapolitan pizza to Toronto, that’s only the beginning of our story. After drawing inspiration from the Neapolitan pizza tradition native to Naples, Pizzeria Libretto opened its Ossington location in August of 2008. Committed to delivering a true southern Italian experience, we were one of the first restaurants in Toronto to proudly serve VPN certified pizza within the strict guidelines laid out by the Napoli government.
            """.trimIndent(),
            image = R.drawable.restaurant_14,
            id = 29
        ),
        Recommendation(
            name = "PAI",
            address = "18 Duncan St, Toronto, ON M5H 3G8\n",
            category = allCategories[1],
            description = """
                PAI is something of a Toronto institution. Since opening the doors of their first restaurant — Sukhothai — in 2008, the husband and wife co-owners have been sharing their passion for Thai cuisine and culture with local diners.
                The story behind how the dynamic duo, comprised of Chef Nuit (Executive Chef and co-owner) and her husband Jeff Regular (co-owner), came to serve up some of the most authentic Thai cuisines in the city is nearly as remarkable as the food itself.
                Before journeying to Canada to pursue life as a chef and entrepreneur, Nuit was a self-taught chef and practicing nurse in Northern Thailand. Backpacking through the area years ago, Regular “met the girl of [his] dreams.” The pair fell in love, eventually opening up a cozy little restaurant in Pai, Thailand, called the Curry Shack where Nuit would spend her nights cooking after shifts at the local hospital.
                Soon after, the couple relocated to Toronto, where they opened their first restaurant with the help of friends and family. Astounded by the overwhelmingly positive response from locals, they continued to expand throughout the city. Today, their family of restaurants includes Sukhothai, Sabai Sabai, Kiin, and PAI — each offering unique takes on Thai cuisine.
            """.trimIndent(),
            image = R.drawable.restaurant_15,
            id = 30
        ),
        Recommendation(
            name = "Sunnybrook Park",
            address = "1132 Leslie St, Toronto, ON",
            category = allCategories[2],
            description = """
                Sunnybrook Farm was the 154-hectare country estate of Joseph Kilgour in the late 1800s. It is located north of Leaside and south of the Bridle Path. After Kilgour's passing, his wife Alice donated Sunnybrook Farms to the city in 1928 to be used as a park. The Kilgour barns were preserved and currently serve as a public riding school. The Metropolitan Police stabled here until moving to the stables at Exhibition Place in 2005.
            """.trimIndent(),
            image = R.drawable.park_1,
            id = 31
        ),
        Recommendation(
            name = "Kew Gardens",
            address = "2075 Queen St E, Toronto, ON M4E 2N9",
            category = allCategories[2],
            description = """
                This busy 6.5 hectare park lies in Toronto's Beach neighbourhood and stretches from Queen Street East down to the Lakeshore. Along it's Queen Street edge you'll find a cenotaph, seasonal flower beds and a library. The park interior features a wading pool and playground, trails, naturalized and open grassy areas, baseball diamond and a bandstand used for some of the many events that happen in this park. Where the park meets the beach there are tennis courts, a sports pad used as a sports area in summer and artificial ice rink in winter, an enclosed seasonal winter fire pit, and a building with change rooms, washrooms, a snack bar and a water bottle filling station.
            """.trimIndent(),
            image = R.drawable.park_2,
            id = 32
        ),
        Recommendation(
            name = "Dufferin Grove Park",
            address = "875 Dufferin St, Toronto, ON M6H 3K8",
            category = allCategories[2],
            description = """
                A 5.3 hectare park on Dufferin Street just south of Bloor Street West with large mature forest canopy. The park features a multipurpose sports field, basketball court, picnic area, wading pool, children's playground and reflexology footpath. At the north end of the park is the Dufferin Grove Park Artificial Ice Rink and Clubhouse.
            """.trimIndent(),
            image = R.drawable.park_3,
            id = 33
        ),
        Recommendation(
            name = "High Park",
            address = "1873 Bloor St W, Toronto, ON M6R 2Z3",
            category = allCategories[2],
            description = """
                High Park is Toronto's largest public park featuring many hiking trails, sports facilities, diverse vegetation, a beautiful lakefront, convenient parking, easy public transit access, a dog park, a zoo, playgrounds for children, a couple of eateries, greenhouses, picnic areas, a bunch of squirrels and various events throughout the year.
            """.trimIndent(),
            image = R.drawable.park_4,
            id = 34
        ),
        Recommendation(
            name = "Canoe Landing Park",
            address = "45 Fort York Blvd, Toronto, ON M5V 3Y2",
            category = allCategories[2],
            description = """
                A 3.1 hectare park near Spadina Avenue and Lake Shore Boulevard West. It features two multipurpose sports fields and many walking paths.
            """.trimIndent(),
            image = R.drawable.park_5,
            id = 35
        ),
        Recommendation(
            name = "Corktown Common",
            address = "155 Bayview Ave, Toronto, ON M5A 0G4\n",
            category = allCategories[2],
            description = """
                The jewel in the landscape of the West Don Lands, Corktown Common is a 7.3 hectare (18 acre) park located at the foot of Lower River Street and Bayview Avenue.
                Situated on former industrial lands, the park has transformed an underutilized brownfield into a spectacular park and community meeting place featuring a marsh, sprawling lawns, urban prairies, playground areas, a splash pad and a variety of inviting features like a fireplace, permanent barbeque, large communal picnic tables and washrooms.
                Built as part of the revitalization of the West Don Lands by Waterfront Toronto, this sophisticated park was designed by Michael Van Valkenburgh Associates.
            """.trimIndent(),
            image = R.drawable.park_6,
            id = 36
        ),
        Recommendation(
            name = "Earlscourt Park",
            address = "Lansdowne Ave, Toronto, ON M6H 3Z8",
            category = allCategories[2],
            description = """
                A 12.6-hectare park at Caledonia Road and St. Clair Avenue West. This park feature a lit artificial turf soccer field, a lit multipurpose sports field and track, a ball diamond, four tennis courts, basketball court, volleyball court, a children's playground, a wading pool and many walking paths.
            """.trimIndent(),
            image = R.drawable.park_7,
            id = 37
        ),
        Recommendation(
            name = "Withrow Park",
            address = "725 Logan Ave, Toronto, ON M4K 3B9",
            category = allCategories[2],
            description = """
                An 8 hectare park on Logan Avenue just south of Danforth Avenue featuring two ball diamonds, a multipurpose sports field, two outdoor tennis courts, a volleyball court, a dog off-leash area, a wading pool and a children's playground. In the middle of the park is the Withrow Park Outdoor Artificial Ice Rink.
            """.trimIndent(),
            image = R.drawable.park_8,
            id = 38
        ),
        Recommendation(
            name = "Riverdale Park East",
            address = "550 Broadview Ave, Toronto, ON M4K 2N6",
            category = allCategories[2],
            description = """
                This 18-hectare park near Danforth Avenue and Broadview Avenue is popular for winter tobogganing and views of downtown Toronto skyline. Riverdale Park East features two ball diamonds, three multipurpose sports fields, a running track, seven tennis courts, an artificial outdoor ice rink and ball hockey pad, a picnic area and a children's playground. The ice rink features a hockey pad which is also a pleasure pad. There are change rooms for changing into skates. There is a nice playground to the east of the rink. A naturalized area at the north end of the park has many recreational trails ideal for walking. Located at the north entrance to the park on Broadview Avenue is the Riverdale Park East Outdoor Pool.
                The north side of the park was once just a grassy slope, but in 1990 the City of Toronto and Taskforce to Bring Back the Don planted native trees and shrubs. The slope has since developed into mature maple-ash woodland. In 2002, a small marsh was added at the bottom of the slope to collect and clean storm water and provide habitat for native plants and animals. An eroded hillside path was replaced with a rock-lined trough that directs water to flow into the wetland area. Volunteers have helped to plant trees and shrubs in the marsh site, as well as native flowers, sedges, and rushes. Having a wide range of diverse habitats is very important to provide our natural areas with resilience against the establishment of invasive species, as well as provide us with other more extensive ecological services.
            """.trimIndent(),
            image = R.drawable.park_9,
            id = 39
        ),
        Recommendation(
            name = "Taylor Creek Park",
            address = "260 Dawes Rd, East York, ON M4C 5C4",
            category = allCategories[2],
            description = """
                Come here to take in and appreciate the outdoors. Take a hike or bring your bike in the spring, summer and fall to use one of the many paths that give a route to follow through this park. Take your time and notice the trees, plants and wildlife that are found in Taylor Creek Park. This is a linear park that begins at Don Mills Road in the west and wanders to Dawes Road in the east. There are vehicle parking lots at either end of the park.
            """.trimIndent(),
            image = R.drawable.park_10,
            id = 40
        ),
        Recommendation(
            name = "Humber Bay Park East",
            address = "100 Humber Bay Park Road East, Toronto, ON M8V 3X7",
            category = allCategories[2],
            description = """
                The Humber Bay Butterfly Habitat is an ecological restoration project that provides critical habitat for a variety of native butterfly species. Located along the shores of Lake Ontario in Toronto's west end, the Humber Bay Butterfly Habitat incorporates a diversity of native wildflowers, shrubs, trees, grasses, sedges and a variety of physical features known to support butterflies throughout all life cycles.
                What is now the Humber Bay Butterfly Habitat was once a barren piece of land created by the deposition of lakefill by the Toronto and Region Conservation Authority (TRCA) at the mouth of Mimico Creek. The newness of this area provided an opportunity for naturalization in an area experiencing urbanization, and through inter-agency, federal, provincial and volunteer efforts the land was transformed into habitat for butterflies and other wildlife. The area is now comprised of many different plant communities, including wildflower meadow, short grass prairie, woodland, and wetland.
                The Humber Bay Butterfly Habitat opened in 2002 and a key component of the success of the project was the involvement of volunteer stewards. Dedicated volunteers have played a very large role in restoration efforts through planting native wildflowers, shrubs, trees, grasses and sedges, as well as removing invasive species and monitoring the plant and wildlife communities in the park.
            """.trimIndent(),
            image = R.drawable.park_11,
            id = 41
        ),
        Recommendation(
            name = "Trillium Park",
            address = "955 Lake Shore Blvd W, Toronto, ON M6K 3B9",
            category = allCategories[2],
            description = """
                The Trillium Park and William G. Davis Trail is 7.5 acres of public green space on a spectacular part of Toronto’s waterfront. Previously a parking lot, it’s now full of life, ready to be enjoyed by morning joggers, picnic-goers, strolling families and everyone in between.
                The 1.3 kilometre trail is named in honour of Bill Davis, who was the Premier when Ontario Place first opened in 1971. It’s surrounded by native trees, plants, flowers and beautiful sedimentary rocks and boulders. Inspired by the Ontario landscape itself, the park was designed in consultation with people from across Ontario, including the Mississaugas of the Credit First Nation. It’s a breathtaking tribute to our province and a gift to the people who love it.
            """.trimIndent(),
            image = R.drawable.park_12,
            id = 42
        ),
        Recommendation(
            name = "Baird Park",
            address = "275 Keele St, Toronto, ON",
            category = allCategories[2],
            description = """
                A small park with mature trees on Keele Street at Humberside Drive featuring a children's playground, a wading pool and a dog off-leash area. The park is also home to West Toronto Lawn Bowling Club.
            """.trimIndent(),
            image = R.drawable.park_13,
            id = 43
        ),
        Recommendation(
            name = "Campbell Park",
            address = "225 Campbell Ave, Toronto, ON M6P 3V5",
            category = allCategories[2],
            description = """
                A 1.3 hectare park near Lansdowne Avenue and Dupont Street featuring three sports fields, a basketball court, wading pool and a children's playground. In the winter there is an outdoor artificial ice rink.
            """.trimIndent(),
            image = R.drawable.park_14,
            id = 44
        ),
        Recommendation(
            name = "St. James Park",
            address = "120 King St E, Toronto, ON M5C 1G6",
            category = allCategories[2],
            description = """
                Located next to St. James Cathedral in downtown Toronto, this park is a series of formal gardens and are is beautiful place to stroll and relax. A grand gazebo can be found in the centre of the park, and walking trails traverse the grass and tree dotted area. The garden's design has a Victorian feel with a central fountain that takes you back to a time when Toronto was young. 
            """.trimIndent(),
            image = R.drawable.park_15,
            id = 45
        ),
        Recommendation(
            name = "CF Toronto Eaton Centre",
            address = "220 Yonge St, Toronto, ON M5B 2H1",
            category = allCategories[3],
            description = """
                Start your day off at one of the city’s most iconic shopping hubs—Toronto Eaton Centre. Conveniently located downtown on Yonge Street between Queen and Dundas, this stylish mall is a Toronto landmark. Snap a photo in front of the famous Canada Geese sculpture flying overhead before strolling beneath the spectacular glass galleria and exploring the more than 230 retailers, restaurants and services.
                Begin at Hudson’s Bay on Queen Street (the company’s flagship location) where you can find high-end designer items in The Room, a Saks Fifth Avenue as well as mid-priced merchandise throughout the store. Then explore some of the mall’s many other highlights, including a flagship H&M and the Apple Store. Once you’ve worked up an appetite, head to the sprawling food court where numerous culinary options await.
            """.trimIndent(),
            image = R.drawable.shopping_centre_1,
            id = 46
        ),
        Recommendation(
            name = "Bloor-Yorkville",
            address = "1200 Bay St., Toronto, ON M5R 2A5",
            category = allCategories[3],
            description = """
                Make your way to Toronto’s most upscale shopping district—Bloor-Yorkville, also known as the “Mink Mile.” With price tags ranging into the thousands of dollars, this is not shopping for the faint of heart (or the budget-constrained).
                Explore the many designer stores lining Bloor Street—Tiffany & Co., Prada, Chanel and Louis Vuitton, to name a few. Window shopping is encouraged!
            """.trimIndent(),
            image = R.drawable.shopping_centre_2,
            id = 47
        ),
        Recommendation(
            name = "Yorkdale Shopping Centre",
            address = "3401 Dufferin St, Toronto, ON M6A 2T9",
            category = allCategories[3],
            description = """
                Take a short drive (or subway ride) northwest to Yorkdale Shopping Centre. This mall packs an impressive range of merchandise – everything from books to toys to fashion to kitchenware – into its 250-plus stores. It has the highest concentration of luxury brands in Toronto. In addition to an array of fashion and accessory stores, Yorkdale has opened its doors to unique retailers like The LEGO Store and Zara Home.
            """.trimIndent(),
            image = R.drawable.shopping_centre_3,
            id = 48
        ),
        Recommendation(
            name = "Vaughan Mills",
            address = "1 Bass Pro Mills Dr, Vaughan, ON L4K 5W4",
            category = allCategories[3],
            description = """
                A bit north of Toronto in the city of Vaughan lies Vaughan Mills shopping centre. Anchored by fifteen retailers including Saks OFF 5th, The Children’s Place and Victoria’s Secret, this outlet retail complex is a shopper’s dream.
                Outdoorsy types should be sure to head to the massive Bass Pro Shops Outdoor World, replete with hunting, fishing and camping gear. And if you’re toting tots, treat them with a trip to the 40,000 square foot LEGOLAND Discovery Centre, complete with rides, 4D cinema, Master Model Builder workshops and impressive LEGO reconstructions of Toronto’s most iconic attractions.
            """.trimIndent(),
            image = R.drawable.shopping_centre_4,
            id = 49
        ),
        Recommendation(
            name = "CF Sherway Gardens",
            address = "25 The West Mall, Etobicoke, ON M9C 1B8",
            category = allCategories[3],
            description = """
                A short hop, skip and a jump from Square One lies Sherway Gardens. Easy to spot due to its distinctive tented roof, Sherway Gardens has a geometric layout that makes it feel like you’re strolling the streets of a well-maintained shopping district.
                Check out Saks Fifth Avenue or Rinascimento women’s wear. For high-end men’s apparel, head to Harry Rosen. If you prefer a one-stop shopping experience, it’s hard to beat the selection of quality merchandise at Holt Renfrew.
            """.trimIndent(),
            image = R.drawable.shopping_centre_5,
            id = 50
        ),
        Recommendation(
            name = "CF Fairview Mall",
            address = "1800 Sheppard Ave E, Toronto, ON M2J 5A7",
            category = allCategories[3],
            description = """
                The mall is on two levels east to west with a vacant space (formerly Sears) at the west end and the Hudson's Bay at the east end. Its 170 stores include numerous clothing stores, speciality shops and kiosks.[2] The mall also has a multiplex cinema, a food court and a few restaurants.[2] The shopping centre also provides a personal style program that offers clients individual image consultations, personal shopping sessions, and other customized services for a fee.
            """.trimIndent(),
            image = R.drawable.shopping_centre_6,
            id = 51
        ),
        Recommendation(
            name = "Bayview Village Shopping Centre",
            address = "2901 Bayview Ave, North York, ON M2K 1E6\n",
            category = allCategories[3],
            description = """
                Bayview Village was built in the 1960s as an open-air mall. It was one of the numerous post-World War II small neighbourhood community malls that were built in the inner suburbs of Toronto where residential neighbourhoods were growing. All of these community plazas were strip malls with one or two anchors.
                Bayview Village Mall is located in the affluent neighbourhood of Bayview Village where significant transit-oriented condominium development has enabled it to thrive despite being close to the larger Fairview Mall.[2] Since its redevelopment in 1998, the tenants of the mall have become more exclusive and aimed at the more affluent shoppers from the nearby areas of Bayview Village, Willowdale, York Mills, the Bridle Path, and Lawrence Park. It contains the "only North American outpost" of a number of high-end fashion designers, as well as outlets for luxury American designers such as Brooks Brothers and a branch of the expensive Toronto grocery store Pusateri's.
            """.trimIndent(),
            image = R.drawable.shopping_centre_7,
            id = 52
        ),
        Recommendation(
            name = "Dufferin Mall",
            address = "900 Dufferin St, Toronto, ON M6H 4A9",
            category = allCategories[3],
            description = """
                Dufferin Mall is a shopping mall in Toronto, Ontario, Canada. It is located on the west side of Dufferin Street, south of the intersection of Bloor Street West, in the Brockton Village neighbourhood. It was first built as a shopping plaza in the 1950s on the site of the Dufferin Park Racetrack. It was later enclosed and made into a mall, in the 1970s.
            """.trimIndent(),
            image = R.drawable.shopping_centre_8,
            id = 53
        ),
        Recommendation(
            name = "Eglinton Square Shopping Centre",
            address = "20 Eglinton Square, Toronto, ON M1L 2K1",
            category = allCategories[3],
            description = """
                Eglinton Square Shopping Centre is an enclosed shopping mall in Toronto, Ontario, Canada, located at Eglinton Avenue East and Victoria Park Avenue in Scarborough's Golden Mile neighbourhood. It opened in 1954 as a strip plaza, like most retail space at the time, and was later converted to mall. It was notable for having a parking garage attached to Morgans department store, with a steep winding ramp. Morgan's was bought by the Hudson's Bay Company and eventually became a Bay.
            """.trimIndent(),
            image = R.drawable.shopping_centre_9,
            id = 54
        ),
        Recommendation(
            name = "CF Shops at Don Mills",
            address = "1090 Don Mills Rd., Toronto, ON M3C 3R6",
            category = allCategories[3],
            description = """
                The Shops at Don Mills (corporately known as CF Shops at Don Mills)[2] is a lifestyle centre-type shopping centre in Toronto, Ontario, Canada, located at Don Mills Road and Lawrence Avenue East in Toronto. There are 72 retail stores with a total floor space of 47,550 square metres (or 511,824 square feet).
                Storefronts face a network of private internal streets, and the centre layout is centred on a square which includes interpretive historical plaques and commissioned art by Douglas Coupland. The layout is similar to a regular neighbourhood retail strip. Anchors include Salomon Toronto, McEwans Gourmet Market, Anthropologie, Joey's west coast restaurant and other shops and restaurants. Parking along the internal streets is limited but a multi-level parkade is located on site.
            """.trimIndent(),
            image = R.drawable.shopping_centre_10,
            id = 55
        ),
        Recommendation(
            name = "St. Lawrence Market",
            address = "93 Front St E, Toronto, ON M5E 1C3",
            category = allCategories[3],
            description = """
                The St. Lawrence Market in the southeast end of the city's downtown core has the globe's greatest collection of vendors selling all manner of food. Walk around the indoor marketplace, in operation since 1803, and you'll find permanent vendors hawking the freshest seafood, cheeses from around the world, and meats and produce grown just outside the city. But as glorious as the St. Lawrence Market's food selection is, that's not all you'll find here. There is one-of-a-kind jewellery, fresh flowers, clothing, gifts and souvenirs. Join one of the market's daily walking tours to discover the area's fascinating history and its importance in Toronto's growth as a city.
            """.trimIndent(),
            image = R.drawable.shopping_centre_11,
            id = 56
        ),
        Recommendation(
            name = "Kensington Market",
            address = "Kensington Market, Toronto, ON",
            category = allCategories[3],
            description = """
                Kensington Market is a walkable bohemian neighbourhood that draws artists and tourists to its indie shops, vintage boutiques and arts spaces. The Market is also home to a wide array of specialty grocers, bakeries and cheese shops. Hipsters frequent trendy bars, cafes and international restaurants that range from casual to fine dining. Students and families populate Victorian houses along tree-lined streets.
            """.trimIndent(),
            image = R.drawable.shopping_centre_12,
            id = 57
        ),
        Recommendation(
            name = "Old City Hall",
            address = "60 Queen St W, Toronto, ON M5H 2M3",
            category = allCategories[4],
            description = """
                The Old City Hall is a Romanesque-style civic building and court house in Toronto, Ontario, Canada. It was the home of the Toronto City Council from 1899 to 1966 and remains one of the city's most prominent structures.
                The building is located at the corner of Queen and Bay Streets, across Bay Street from Nathan Phillips Square and the present City Hall in Downtown Toronto. The heritage landmark has a distinctive clock tower which heads the length of Bay Street from Front Street to Queen Street as a terminating vista. Old City Hall was designated a National Historic Site in 1984.
            """.trimIndent(),
            image = R.drawable.historic_site_1,
            id = 58
        ),
        Recommendation(
            name = "Gooderham Building",
            address = "49 Wellington St E, Toronto, ON M5E 1C9",
            category = allCategories[4],
            description = """
                The Gooderham Building, also known as the Flatiron Building, is an historic office building at 49 Wellington Street East in Toronto, Ontario, Canada. It is located on the eastern edge of the city's Financial District (east of Yonge Street) in the St. Lawrence neighbourhood, wedged between Front Street and Wellington Street in Downtown Toronto, where they join up to form a triangular intersection. Completed in 1892, the red-brick edifice was an early example of a prominent flatiron building.
                The Gooderham Building is the focal point of one of Toronto's most iconic vistas: looking west down Front Street towards the building's prominent rounded corner, framed on the sides by the heritage commercial blocks along Front Street, and with the skyscrapers of the Financial District towering in the background. The CN Tower is also visible from certain angles behind Brookfield Place. This vista frequently appears in imagery of the city.
            """.trimIndent(),
            image = R.drawable.historic_site_2,
            id = 59
        ),
        Recommendation(
            name = "Osgoode Hall",
            address = "130 Queen St W, Toronto, ON M5H 2N5",
            category = allCategories[4],
            description = """
                Osgoode Hall is a landmark building in downtown Toronto, Ontario, Canada. The original 2+1⁄2-storey building was started in 1829 and finished in 1832 from a design by John Ewart and William Warren Baldwin. The structure is named for William Osgoode, the first Chief Justice of Upper Canada (now the province of Ontario).
                It originally served to house the regulatory body for lawyers in Ontario along with its law school, formally established as Osgoode Hall Law School in 1889, which was the only recognized professional law school for the province at the time.
            """.trimIndent(),
            image = R.drawable.historic_site_3,
            id = 60
        ),
        Recommendation(
            name = "Casa Loma",
            address = "1 Austin Terrace, Toronto, ON M5R 1X8",
            category = allCategories[4],
            description = """
                Casa Loma (improper Spanish for "Hill House") is a Gothic Revival castle-style mansion and garden in midtown Toronto, Ontario, Canada, that is now a historic house museum and landmark. It was constructed from 1911 to 1914 as a residence for financier Sir Henry Pellatt. The architect was E. J. Lennox, who designed several other city landmarks. Casa Loma sits at an elevation of 140 metres (460 ft) above sea level, 66 metres (217 ft) above Lake Ontario.
                Due to its unique architectural character in Toronto, Casa Loma has been a popular filming location for movies and television. It is also a popular venue for wedding ceremonies,[3] and Casa Loma can be rented in the evenings after the museum closes to the public.
            """.trimIndent(),
            image = R.drawable.historic_site_4,
            id = 61
        ),
        Recommendation(
            name = "Commerce Court North",
            address = "25 King St W, Toronto, ON M5L 2A1",
            category = allCategories[4],
            description = """
                Commerce Court is a rare complex that intersects and inspires the worlds of business and architecture. Its history reaches back to 1931 when at that time, The North Tower, designed by the firm Pearson and Darling, was the tallest building in the British Empire and today remains a historical Beaux-Arts jewel.
                Today, the North Tower’s stunning vaulted gold-coffered ceiling and classic Art-Deco style remains a heritage building. With the other three modern buildings designed by Pei, with his understanding and foresight that buildings must be designed with an efficient floor plate so as to serve the practical needs of today and the unknown potential of the future, Commerce Court remains a marvel and showpiece in the heart of Toronto’s Financial District - rich in tradition, focused on the future.
            """.trimIndent(),
            image = R.drawable.historic_site_5,
            id = 62
        ),
        Recommendation(
            name = "Queen's Park",
            address = "110 Wellesley St W, Toronto, ON M7A 1A2",
            category = allCategories[4],
            description = """
                Queen's Park is an urban park in Downtown Toronto, Ontario, Canada. Opened in 1860 by Edward, Prince of Wales, it was named in honour of Queen Victoria. The park is the site of the Ontario Legislative Building, which houses the Legislative Assembly of Ontario. The phrase "Queen's Park" is regularly used as a metonym for the Government of Ontario or the Legislative Assembly of Ontario.
            """.trimIndent(),
            image = R.drawable.historic_site_6,
            id = 63
        ),
        Recommendation(
            name = "The Cathedral Church of St. James",
            address = "106 King St E, Toronto, ON M5C 2E9",
            category = allCategories[4],
            description = """
                The Cathedral Church of St. James is an Anglican cathedral in Downtown Toronto, Ontario, Canada. It is the location of the oldest congregation in the city, with the parish being established in 1797. The cathedral, with construction beginning in 1850 and opening for services on June 19, 1853, was one of the largest buildings in the city at that time. It was designed by Frederick William Cumberland and is a prime example of Gothic Revival architecture.
            """.trimIndent(),
            image = R.drawable.historic_site_7,
            id = 64
        ),
        Recommendation(
            name = "Union Station Toronto",
            address = "65 Front St W, Toronto, ON M5J 1E6",
            category = allCategories[4],
            description = """
                Union Station is a major railway station and intermodal transportation hub in Toronto, Ontario, Canada. It is located on Front Street West, on the south side of the block bounded by Bay Street and York Street in downtown Toronto. The municipal government of Toronto owns the station building while the provincial transit agency Metrolinx owns the train shed and trackage. Union Station has been a National Historic Site of Canada since 1975, and a Heritage Railway Station since 1989. It is operated by the Toronto Terminals Railway, a joint venture of the Canadian National Railway and Canadian Pacific Railway that directs and controls train movement along the Union Station Rail Corridor, the largest and busiest rail corridor in Canada.
                Its central position in Canada's busiest inter-city rail service area, "The Corridor", as well as being the central hub of GO Transit's commuter rail service, makes Union Station Canada's busiest transportation facility and the third-busiest railway station in North America.
            """.trimIndent(),
            image = R.drawable.historic_site_8,
            id = 65
        ),
        Recommendation(
            name = "R.C. Harris Water Treatment Plant",
            address = "2701 Queen St E, Scarborough, ON M4E 1H4",
            category = allCategories[4],
            description = """
                The R. C. Harris Water Treatment Plant in Toronto, Ontario, Canada, is both a crucial piece of infrastructure and an architecturally acclaimed historic building named after the longtime commissioner of Toronto's public works Roland Caldwell Harris. The plant's architect was Thomas C. Pomphrey with engineers H.G. Acres and William Gore. It is located in the east of the city at the eastern end of Queen Street and at the foot of Victoria Park Avenue along the shore of Lake Ontario in the Beaches neighbourhood in the former city of Scarborough.
                The land was once owned by Peter Patterson and George Monro. Prior to the construction of a water treatment plant, the area was the site of Victoria Park, a waterfront amusement park that operated from 1878 until 1906. It closed the same year as rival Munro Park ceased operations. The amusement park was initially served by ferry from York Street (same docks serving Toronto Islands) until 1895 when streetcar service commenced.
            """.trimIndent(),
            image = R.drawable.historic_site_9,
            id = 66
        ),
        Recommendation(
            name = "St. Michael's Cathedral Basilica",
            address = "65 Bond St, Toronto, ON M5B 1X1",
            category = allCategories[4],
            description = """
                St. Michael's Cathedral Basilica is the cathedral church of the Roman Catholic Archdiocese of Toronto, Canada, and one of the oldest churches in Toronto. It is located at 65 Bond Street in Toronto's Garden District. St. Michael's was designed by William Thomas, designer of eight other churches in the city, and was primarily financed by Irish immigrants who resided in the area. The cathedral has a capacity of 1600. John Cochrane and Brothers undertook the work on the stone and stucco ornamentation of the interior.
                St. Michael's Cathedral is a major building of faith in downtown Toronto. It was originally constructed away from the city's centre, but over time the city has grown to encompass it. It was constructed to better serve the growing Roman Catholic population of Toronto. It is a prime example of the English Gothic Revival style of architecture. On September 29, 2016, the feast day of Saint Michael the Archangel, the cathedral was elevated to a minor basilica.
            """.trimIndent(),
            image = R.drawable.historic_site_10,
            id = 67
        ),
        Recommendation(
            name = "Fairmont Royal York",
            address = "100 Front St W, Toronto, ON M5J 1E3",
            category = allCategories[4],
            description = """
                The Fairmont Royal York, formerly and still commonly known as the Royal York, is a large historic luxury hotel in Toronto, Ontario, Canada. Located along Front Street West, the hotel is situated at the southern end of the Financial District, in Downtown Toronto. The Royal York was designed by Ross and Macdonald, in association with Sproatt and Rolph, and built by the Canadian Pacific Railway company. The hotel is currently managed by Fairmont Hotels and Resorts.
                Opened on 11 June 1929, the Châteauesque-styled building is 124 metres (407 ft) tall, and contains 28 floors. It is considered one of Canada's grand railway hotels. After its completion, the building was briefly the tallest building in Toronto, as well as the tallest building in the country, and the British Empire, until the nearby Canadian Bank of Commerce Tower was built the following year. The building has undergone several extensive renovations since it first opened, with its first major renovation in 1972. An underground walkway linking the hotel with the Royal Bank Plaza and Union Station form part of Toronto's PATH underground city system.
            """.trimIndent(),
            image = R.drawable.historic_site_11,
            id = 68
        ),
        Recommendation(
            name = "Massey Hall",
            address = "178 Victoria St, Toronto, ON M5B 1T7",
            category = allCategories[4],
            description = """
                Massey Hall is a performing arts theatre in Toronto, Ontario, Canada. Opened in 1894, it is known for its outstanding acoustics and was the long-time hall of the Toronto Symphony Orchestra. An intimate theatre, it was originally designed to seat 3,500 patrons, but after extensive renovations in the 1940s, it now seats up to 2,765. It has an extensive history of concerts by artists of many musical genres which continues today. Massey Hall was a gift to the people of Toronto from industrialist Hart Massey.
            """.trimIndent(),
            image = R.drawable.historic_site_12,
            id = 69
        ),
        Recommendation(
            name = "St. Lawrence Hall",
            address = "157 King St E, Toronto, ON M5C 1G9",
            category = allCategories[4],
            description = """
                St. Lawrence Hall is a meeting hall in Toronto, Ontario, Canada, located at the corner of King Street East and Jarvis Street. It was created to be Toronto's public meeting hall home to public gatherings, concerts, and exhibitions. Its main feature was a thousand-seat amphitheatre. For decades the hall was the centre of Toronto's social life before larger venues took over much of this business. Today the hall continues as a venue for events including weddings, conferences, and art shows.
            """.trimIndent(),
            image = R.drawable.historic_site_13,
            id = 70
        ),
        Recommendation(
            name = "Royal Alexandra Theatre",
            address = "260 King St W, Toronto, ON M5V 1H9",
            category = allCategories[4],
            description = """
                The Royal Alexandra Theatre, commonly known as the Royal Alex, is a theatre in Toronto, Ontario, Canada, located near King and Simcoe Street. Built in 1907, the 1,244-seat Royal Alex is the oldest continuously operating legitimate theatre in North America.
                The Royal Alex is a 1,244-seat, beaux-arts style, proscenium-stage theatre, with two balcony levels, built in the style typical of 19th century British theatres. Construction began in 1905 and was completed in 1907. Since 1963 it has been owned by Ed Mirvish Enterprises, a company established by Toronto department store owner Edwin Mirvish. Since 1986, the theatre has been managed and operated by Mirvish Productions, the theatre production company headed by Ed's son, David Mirvish. The theatre, commonly known as the "Royal Alex", "the Alex" or "the R.A.T." is named for Queen Alexandra, a Danish princess and the wife of King Ed ward VII, great-great-grandmother to the King of Canada, Charles III. The theatre received letters patent from Edward VII entitling it to the royal designation. Its present owners believe that it is the only remaining legally "royal theatre" in North America.
            """.trimIndent(),
            image = R.drawable.historic_site_14,
            id = 71
        ),
        Recommendation(
            name = "Canada Life Building",
            address = "330 University Ave, Toronto, ON M5G 1R8",
            category = allCategories[4],
            description = """
                The Canada Life Building is a historic office building in Toronto, Ontario, Canada. The fifteen-floor Beaux Arts building was built by Sproatt & Rolph and stands at 285 feet (87 m), 321 feet (97.8 m) including its weather beacon.
                It is located at University and Queen Street in the city's downtown core. Work on the new headquarters of the Canada Life Assurance Company began in 1929 and it opened in 1931. It was the fourth building to serve as the headquarters of Canada Life, Canada's oldest, and at the time largest insurance company. Previously it had been housed in offices at Bay and King Street.
                The Beaux Arts structure was the first of a series of planned structures along University Avenue, but the Great Depression halted these plans. When it was completed it was one of the tallest buildings in Toronto. It remains one of the largest office buildings in Toronto with windows that can be opened by its occupants.
            """.trimIndent(),
            image = R.drawable.historic_site_15,
            id = 72
        ),
        Recommendation(
            name = "Art Gallery of Ontario",
            address = "317 Dundas St W, Toronto, ON M5T 1G4",
            category = allCategories[5],
            description = """
                The Art Gallery of Ontario (AGO; French: Musée des beaux-arts de l'Ontario) is an art museum in Toronto, Ontario, Canada. The museum is located in the Grange Park neighbourhood of downtown Toronto, on Dundas Street West between McCaul and Beverley streets just east of Chinatown and just west of Little Japan. The museum's building complex takes up 45,000 square metres (480,000 sq ft) of physical space, making it one of the largest art museums in North America and the second-largest art museum in Toronto after the Royal Ontario Museum. In addition to exhibition spaces, the museum also houses an artist-in-residence office and studio, dining facilities, event spaces, gift shop, library and archives, theatre and lecture hall, research centre, and a workshop.
            """.trimIndent(),
            image = R.drawable.gallery_1,
            id = 73
        ),
        Recommendation(
            name = "Royal Ontario Museum",
            address = "100 Queens Park, Toronto, ON M5S 2C6",
            category = allCategories[5],
            description = """
                The Royal Ontario Museum (ROM) is a museum of art, world culture and natural history in Toronto, Ontario, Canada. It is one of the largest museums in North America and the largest in Canada. It attracts more than one million visitors every year, making the ROM the most-visited museum in Canada. The museum is north of Queen's Park, in the University of Toronto district, with its main entrance on Bloor Street West. Museum subway station is named after the ROM and, since a 2008 renovation, is decorated to resemble the institution's collection at the platform level.
                With more than 6,000,000 items and 40 galleries, the museum's diverse collections of world culture and natural history contribute to its international reputation. The museum contains a collection of dinosaurs, minerals and meteorites; Canadian, and European historical artifacts; as well as African, Near Eastern, and East Asian art.
            """.trimIndent(),
            image = R.drawable.gallery_2,
            id = 74
        ),
        Recommendation(
            name = "Textile Museum of Canada",
            address = "55 Centre Ave, Toronto, ON M5G 2H5",
            category = allCategories[5],
            description = """
                The Textile Museum of Canada, located in Toronto, Ontario, Canada, is a museum dedicated to the collection, exhibition, and documentation of textiles.
                The Textile Museum of Canada was founded as the Canadian Museum of Carpets and Textiles in 1975 by Max Allen and Simon Waegemaekers. Located above an ice cream shop in Mirvish Village the museum's collection was initially based on textiles collected during business trips. The museum relocated to its current location as in 1989. It now includes exhibitions of international contemporary art, craft, and design. It recently acknowledged the history of the land, stating on their homepage, "The Textile Museum of Canada operates on the traditional territories of the Mississaugas of the Credit, the Anishinaabe, the Chippewa, the Haudenosaunee, and the Wendat."
            """.trimIndent(),
            image = R.drawable.gallery_3,
            id = 75
        ),
        Recommendation(
            name = "Gardiner Museum",
            address = "111 Queens Park, Toronto, ON M5S 2C7",
            category = allCategories[5],
            description = """
                The George R. Gardiner Museum of Ceramic Art (commonly shortened to the Gardiner Museum) is a ceramics museum in Toronto, Ontario, Canada. The museum is situated within University of Toronto's St. George campus, in downtown Toronto. The 4,299.2-square-metre (46,276 sq ft) museum building was designed by Keith Wagland, with further expansions and renovations done by KPMB Architects.
            """.trimIndent(),
            image = R.drawable.gallery_4,
            id = 76
        ),
        Recommendation(
            name = "Bata Shoe Museum",
            address = "327 Bloor St W, Toronto, ON M5S 1W7",
            category = allCategories[5],
            description = """
                The Bata Shoe Museum (BSM) is a museum of footwear and calceology in Toronto, Ontario, Canada. The museum's building is situated near the northwest of the University of Toronto's St. George campus, in downtown Toronto. The 3,665-square-metre (39,450 sq ft) museum building was designed by Moriyama & Teshima Architects, with Raymond Moriyama as the lead architect.
                The museum's collection of footwear originated from the personal collections of Sonja Bata, started in the mid-1940s. In 1979, Bata provided an endowment to create the Bata Shoe Museum Foundation, with the aim of having the collection professionally managed, and to establish a shoe museum to house, store, and exhibit the collection. The foundation exhibited the collection to the public for the first time in 1992, although it did not open a permanent facility for its museum until May 1995.
                As of 2018, the museum's permanent collection includes over 13,000 shoes, and other footwear related items dating back 4,500 years; providing the museum with the largest collection of footwear in the world. Items in the museum's collection are either held in storage, or placed on display in its permanent exhibition. The museum also hosts and organizes a number of temporary and travelling exhibitions, and outreach programs.
            """.trimIndent(),
            image = R.drawable.gallery_5,
            id = 77
        ),
        Recommendation(
            name = "Aga Khan Museum",
            address = "77 Wynford Dr, North York, ON M3C 1K1",
            category = allCategories[5],
            description = """
                The Aga Khan Museum (French: Musée Aga Khan) is a museum of Islamic art, Iranian (Persian) art and Muslim culture located at 77 Wynford Drive in the North York district of Toronto, Ontario, Canada. The museum is dedicated to Islamic art and objects, and it houses approximately 1,200 rare objects assembled by His Highness the Aga Khan and Prince Sadruddin Aga Khan. As an initiative of the Aga Khan Trust for Culture, an agency of the Aga Khan Development Network, the museum is dedicated to presenting an overview of the artistic, intellectual, and scientific contributions that Muslim civilizations have made to world heritage. In addition to the Permanent Collection, the Aga Khan Museum features several temporary exhibitions each year that respond to current scholarship, emerging themes, and new artistic developments. The Museum Collection and exhibitions are complemented by educational programs and performing arts events.
            """.trimIndent(),
            image = R.drawable.gallery_6,
            id = 78
        ),
        Recommendation(
            name = "Museum of Contemporary Art Toronto Canada",
            address = "158 Sterling Rd #100, Toronto, ON M6R 2B7",
            category = allCategories[5],
            description = """
                The Museum of Contemporary Art Toronto Canada (MOCA), formerly known as the Museum of Contemporary Canadian Art (MOCCA), is a museum and art gallery in Toronto, Ontario. It is an independent, registered charitable organization.
                The museum, originally known as the Museum of Contemporary Canadian Art (MOCCA), was founded from the former Art Gallery of North York in 1999. In 2005, MOCCA relocated to a repurposed textile factory in the West Queen West Art + Design District in downtown Toronto. The City of Toronto government funded the half-million-dollar renovation of the building.
                In 2015, with its building about to be demolished and replaced by condominiums, MOCCA hosted an interactive exhibit by Dean Baldwin entitled Queen West Yacht Club. At its former location on Queen West, the museum functioned as a hub for creative exchange and played a critical role in shaping the city's contemporary art scene. Through a commitment to collaborative partnerships with leading like-minded artists, organizations, institutions, and festivals from Toronto and further afield, MOCCA connected the city to a national and global network of peers.
                MOCCA featured the work of over 1,100 Canadian and other international artists, hosted 200+ exhibitions, and welcomed 40,000 annual visitors. As the lease on Queen West wound down, the need to move provided an opportunity to seek a larger space that could accommodate the museum's ever-growing aspirations and significance.
                In September 2018, the museum was moved to the Tower Automotive Building.
                In 2016, the museum changed its name to the Museum of Contemporary Art Toronto Canada (MOCA). In September 2018, MOCA moved into a 55,000 square foot facility in a renovated former factory in the Lower Junction district. The museum received funding from the Canada Cultural Spaces Fund.
                The museum is affiliated with the Canadian Museums Association, the Ontario Museum Association, and the Ontario Association of Art Galleries.
            """.trimIndent(),
            image = R.drawable.gallery_7,
            id = 79
        ),
        Recommendation(
            name = "Hockey Hall of Fame",
            address = "30 Yonge St, Toronto, ON M5E 1X8",
            category = allCategories[5],
            description = """
                The Hockey Hall of Fame (French: Temple de la renommée du hockey) is a museum and hall of fame located in Toronto, Ontario, Canada. Dedicated to the history of ice hockey, it holds exhibits about players, teams, National Hockey League (NHL) records, memorabilia and NHL trophies, including the Stanley Cup. Founded in Kingston, Ontario, the Hockey Hall of Fame was established in 1943 under the leadership of James T. Sutherland. The first class of honoured members was inducted in 1945, before the Hall of Fame had a permanent location. It moved to Toronto in 1958 after the NHL withdrew its support for the International Hockey Hall of Fame in Kingston, Ontario, due to funding issues. Its first permanent building opened at Exhibition Place in 1961. The hall was relocated in 1993, and is now in Downtown Toronto, inside Brookfield Place, and a historic Bank of Montreal building. The Hockey Hall of Fame has hosted International Ice Hockey Federation (IIHF) exhibits and the IIHF Hall of Fame since 1998.
            """.trimIndent(),
            image = R.drawable.gallery_8,
            id = 80
        ),
        Recommendation(
            name = "Spadina Museum",
            address = "285 Spadina Rd, Toronto, ON M5R 2V5",
            category = allCategories[5],
            description = """
                Spadina Museum: Historic House & Gardens, also known as Spadina House, is a historic mansion at 285 Spadina Road in Toronto, Ontario, Canada, that is now a historic house museum operated by the City of Toronto's Economic Development & Culture division. The museum preserves the house much as it existed and developed historically. The art, decor and architecture of the house used to reflect the contemporary styles of the 1860s through the 1930s, including Victorian, Edwardian, Arts and Crafts, Art Deco, Art Nouveau and Colonial Revival styles. The museum closed for a year for extensive interior and exterior renovations. When it re-opened to the public on October 24, 2010, it was decorated in the style of the inter-war era of the 1920s and 1930s. The estate's gardens reflect the landscape during the Austin family's occupation of the house.
            """.trimIndent(),
            image = R.drawable.gallery_9,
            id = 81
        ),
        Recommendation(
            name = "Ontario Science Centre",
            address = "770 Don Mills Rd., North York, ON M3C 1T3",
            category = allCategories[5],
            description = """
                The Ontario Science Centre, formally the Centennial Museum of Science and Technology, is a science museum in Toronto, Ontario, Canada. It is located near the Don Valley Parkway about 11 kilometres (6.8 mi) northeast of downtown on Don Mills Road just south of Eglinton Avenue East in the former city of North York. It is built down the side of a wooded ravine formed by one branch of the Don River located in Flemingdon Park.
                The Science Centre has hosted a number of traveling exhibits since its opening. In 1982, the exhibition China: 7,000 Years of Discovery broke all attendance records and attracted more than 1.5 million visitors.
                In 2003, the Strange Matter exhibition opened,[ and the Body Worlds 2 exhibition attracted almost half a million visitors over five months when it came to the Centre in 2005. The exhibition Facing Mars ran in 2008. The Centre hosted Harry Potter: The Exhibition, a collection of props from the film series in 2010. Leonardo da Vinci's Workshop (2011) featured physical models of da Vinci's inventions, built from drawings in his Codices. It also included interactive touch-screen digital reproductions of his Codices, the Mona Lisa and The Last Supper. Circus: The Exhibition ran in 2012. Game On 2.0, a video game history exhibition, ran March 9 to September 2, 2013.
            """.trimIndent(),
            image = R.drawable.gallery_10,
            id = 82
        ),
        Recommendation(
            name = "Gallery Arcturus",
            address = "80 Gerrard St E, Toronto, ON M5B 1G6",
            category = allCategories[5],
            description = """
                Gallery Arcturus is an art gallery and museum in downtown Toronto, Ontario, Canada. It is located near Toronto Metropolitan University and Church and Wellesley in the Garden District neighbourhood, on Gerrard Street East. The gallery is a member of the Ontario Association of Art Galleries and the Ontario Museum Association.
                The museum operates as a public, not-for-profit contemporary art gallery with a permanent art collection of over 200 works including drawings, paintings, collages, photographs and sculptures made by notable North American artists including the photographer Simeon Posen, the Inuit art sculptor Floyd Kuptana, and the renowned artist, teacher, writer, and founder of the School of Reductionism, E.J. Gold. Established in 1994, Gallery Arcturus has held many notable public exhibitions including Thomas Henrickson "Inner Mirror", E.J. Gold "Large As Life", Peter Banks "Emergence", Carol George "Asia Calling", Deborah Harris "Toward the One", and Dominique Cruchet & Joan Cullen "Crossing the Great Waters". The artist-in-residence and curator of the gallery is Deborah Harris.
            """.trimIndent(),
            image = R.drawable.gallery_11,
            id = 83
        ),
        Recommendation(
            name = "Mackenzie House",
            address = "82 Bond St, Toronto, ON M5B 1X2",
            category = allCategories[5],
            description = """
                Mackenzie House is a historic building and museum in Toronto, Ontario, Canada that was the last home of William Lyon Mackenzie, the city's first mayor. It is now a museum operated by the City of Toronto's Museum and Heritage Services.
                The house at 82 Bond Street was bought for Mackenzie by his friends and supporters in 1858. He died in the house in 1861.
                In March 1864 the sheriff of Toronto seized the property due to unpaid financial obligations. The property was bought by John Taylor who allowed the Mackenzie family to remain in the house without paying rent. Four years later Isabel Mackenzie repurchased the home with expenses paid by the Ontario Legislature for William's pilgrimage to London in the 1830s.
                The neighbouring row houses were demolished in 1936, while Mackenzie's grandson, William Lyon Mackenzie King, was Prime Minister. However, this house was saved because of its historical significance.
            """.trimIndent(),
            image = R.drawable.gallery_12,
            id = 84
        ),
        Recommendation(
            name = "Toronto Railway Museum",
            address = "255 Bremner Blvd, Toronto, ON M5V 3M9",
            category = allCategories[5],
            description = """
                The Toronto Railway Historical Association (TRHA) was established in 2001 and is now incorporated as a federally registered charity. Its primary focus is the development of the Toronto Railway Museum (TRM).
                The museum opened on May 28, 2010. The TRM operates year-round. Cabin D has also been moved to Roundhouse Park from the City's collection of historic buildings and was repainted and repaired but remains in its original structural state.
            """.trimIndent(),
            image = R.drawable.gallery_13,
            id = 85
        ),
        Recommendation(
            name = "The Image Centre",
            address = "33 Gould St, Toronto, ON M5B 1E9",
            category = allCategories[5],
            description = """
                The Image Centre (formerly known as the Ryerson Image Centre and the Ryerson Gallery and Research Centre) is an photography and art museum in Toronto, Ontario, Canada. The centre is a university museum operated by Toronto Metropolitan University (TMU), and is housed in a renovated and remodelled former warehouse building at Gould and Bond Streets on TMU's campus. The centre includes gallery, collections, teaching, research and exhibition spaces and shares the building with the School of Image Arts.
            """.trimIndent(),
            image = R.drawable.gallery_14,
            id = 86
        ),
        Recommendation(
            name = "Toronto Police Museum and Discovery Centre",
            address = "40 College St, Toronto, ON M5G 2J3",
            category = allCategories[5],
            description = """
                Occupying 3,000 square feet in the atrium at police headquarters at 40 College St., the Museum reflects the rich tradition and history of policing in our great city. The Toronto Police Museum & Discovery Centre is a not-for-profit registered charity, operating in close partnership with, but separate from the Toronto Police Service that was built entirely from private donations.
                The Museum is funded solely through guided tours, donations, sales from our gift shop and research requests. Our facility offers a vibrant blend of the new and old, with interesting interactive displays dedicated to expanding the community's understanding of past and present policing in Toronto.
            """.trimIndent(),
            image = R.drawable.gallery_15,
            id = 87
        )
    )
    val defaultRecommendation = Recommendation(
        name = "",
        address = "",
        category = LocalCategoriesDataProvider.defaultCategory,
        description = """
            
        """.trimIndent(),
        image = R.drawable.resource_default,
        id = -1
    )
}