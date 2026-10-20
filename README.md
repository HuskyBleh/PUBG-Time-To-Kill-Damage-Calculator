# PUBG Time-To-Kill Damage Calculator ｜ PUBG武器伤害计算器
English Below

原作者：哔哩哔哩的 "HuskyBleh" https://space.bilibili.com/453575851

这里所有的代码都是我自己一个人写的。如果你想要在什么地方用这个软件，还请写上出处，谢谢啦～

这个软件会根据用户输入的枪械数据模拟击杀敌人，然后计算理论最短击杀时间 (TTK)。模拟800万次之后取平均值，然后计算出一个平均TTK。因为TTK越低武器的伤害越高可能会有点反直觉，所以也会计算一个 “伤害得分”，也就是1/TTK。这样可以看出一把全自动武器在实战中的伤害输出表现。请注意，因为计算TTK的前提是全枪全中，计算出来的伤害只适用于近距离。中远距离下，武器后坐力和子弹飞行速度会更重要。

我一共计算了我认为最具有代表性的8种装备和血量组合。这包括了2级和3级装备，以及75和100血。我没有计算一级装备的数据，因为当你可以选择武器，大概率不会面对一级装备的敌人。

这个软件只适用于计算Steam版本端游PUBG的全自动武器伤害输出，不能用于手游或者任何其他游戏。如果你下载并修改了这个软件，请记住这里面所有的武器伤害系数都和PUBG游戏内完全符合。如果你修改了这些参数，最终算出来的伤害会和游戏中的实际伤害不一样。因此，如果你修改了软件里面计算伤害用的数据，做出武器伤害结论的时候一定要非常小心。

-----------------------------

Original creator: "HuskyBleh" from https://space.bilibili.com/453575851

All code here was created by myself. If you wish to use this program, please mention me somewhere, thank you :)

This program uses weapon base stats from the user to simulate shooting players, then calculates the minimum time to kill a player (TTK). After 8 million simulations, it calculates an average TTK. Since a lower TTK means higher damage, it is a bit confusing, so the program also calculates a "Damage Score", which is just 1/TTK. This value is used to determine the true damage output of a weapon. Keep in mind that because TTK requires all shots to connect, damage caluclations are only valid for close range fights. At further distances, weapon recoil and bullet velocity become much more important.

This program takes into account a total of 8 armor and health variations that I believe the be the most common and relevant. This included different combinations of LV2 and LV3 armor, and both 75 and 100 HP. I chose to not include variations with LV1 gear because by the time you can choose a weapon, you wouldn't be fighting players with LV1 gear.

It should be noted that this calculator ONLY works for the game PUBG found on Steam; the mobile version is a completely different game. If you were to download and modify this program, please keep in mind that all weapon multipliers are one to one accurate with the game, and if changed, will not represent what actually happens in-game. Therefore, please be cautious when making any claims about weapon damage if you decide to modify this program.
