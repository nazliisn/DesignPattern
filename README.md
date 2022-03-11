# DesignPattern - TechnologyStore

 You can watch the video for detailed information about the project => [Technology Store](https://www.youtube.com/watch?v=WA3NYtGgfOU&t=4s)


## Statement of Work
It is a store where Laptop and Phone are sold in the created store. In addition, accessories that can be used with the phone and laptop are also sold. The customer is first asked whether he wants to buy a Phone or a Laptop. If he chose the Phone option, 2 brands are presented in front of him. These are iPhone and Samsung. According to the brand chosen, phone options are brought to him. The customer selects a product and sees some features and price of the product. He is asked if he wants to buy it. If he wants to buy this product, the product is started to be prepared. Preparation steps vary according to product brands. For example, if a Samsung product is selected, android information is entered. If a feature of Iphone is selected, IOS information is entered. When the Laptop option is selected, the brands are displayed, just like on the Phone. 2 laptop brands appear in front of the user. These are Lenovo and MSI. In addition, in the project, the user can return to the previous menu from all lists. Then, according to the product he wants to buy, the accessories are listed in front of him by using the Phone and Laptop Decorators. And the customer sees the price together with the accessories of the Phone or Laptop. If he wants to continue, he can return from the menu. If he doesn't want to, he can finish his shopping.


## Design Patterns.
Two design patterns were used for the problem in the project. These are the Simple Factory Pattern and the Decorator pattern.
The user first chooses whether he wants a Phone or a Laptop. According to the user's choice, it goes to the Phone factory or the Laptop factory. Then the user is asked to choose a brand. There are 4 factories in front of us. These are the Iphone factory, the Samsung factory, connected to the Phone factory, and the Lenovo factory and MSI factory, which are connected to the Laptop factory. The reason why I used the Factory model while creating the project is that if a new brand phone or laptop is wanted to be added to the store, the only thing to add is the codes related to the new brand, since the other codes are not connected to each other. When we add a new brand in this way, the factories we call creator are not affected by this. The user makes his choice. Samsung iPhone and Lenovo Msi brands will appear in front of you. The user chooses one of these products. Then he sees the prices and features of the products. Based on this, he decides whether he wants to buy it or not.
Our user may want to add an extra product next to his phone or laptop. We use the decorator pattern for this. At this point, when we want to add to the product we actually bought, we want to add this product directly to the price of the product and to our basket. In this way, when a new accessory arrives, we can add it using our Decorator. In this way, the user can add as many accessories as they want.


## UML

<img src="https://github.com/nazliisn/DesignPattern/blob/master/DesignUML.png" width="70%">
