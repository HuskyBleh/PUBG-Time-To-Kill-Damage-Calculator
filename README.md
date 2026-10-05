# PUBG Time-To-Kill Damage Calculator ｜ PUBG武器伤害计算器
English Below

原作者：哔哩哔哩的 "HuskyBleh" https://space.bilibili.com/453575851

这里所有的代码都是我自己一个人写的。如果你想要在什么地方用这个软件，还请写上出处，谢谢啦。

请注意，这个软件只能用于计算Steam版本端游PUBG的武器伤害，不能用于手游或者任何其他游戏。如果你下载并修改了这个软件，请记住这里面所有的武器伤害系数都和PUBG游戏内完全符合。如果你修改了这些参数，最终算出来的伤害会和游戏中的实际伤害不一样。因此，如果你修改了软件里面计算伤害用的数据，做出武器伤害结论的时候一定要非常小心。

这个软件会问你要武器的基础数据，然后假设全枪命中的前提下，计算平均打死一个人所需要的时间。这个时间叫 ”击杀时间“，或者 ”TTK“。TTK越低武器的伤害越高，可能会有点反直觉，所以程序也会计算一个 “伤害得分”。其实就是 1/TTK x 100啦。要注意，因为计算TTK的前提是全枪命中，所以这个软件计算的伤害只适用于近距离，大概15米以内吧。

我一共计算了我认为最具有代表性的8种装备和血量组合。这包括了2级和3级装备，以及75和100血。不过... 以后有空可能会再优化一下。

-----------------------------

Original creator: "HuskyBleh" from https://space.bilibili.com/453575851

All code here was created by myself. If you wish to use this program, please mention me somewhere, thank you :)

It should be noted that this calculator ONLY works for the game PUBG found on Steam; the mobile version is a completely different game. If you were to download and modify this program, please keep in mind that all weapon multipliers are one to one accurate with the game, and if changed, will not represent what actually happens in-game. Therefore, please be cautious when making any claims about weapon damage if you decide to modify this program.

This program asks the user for a weapon's base states, then calculates the average time it takes to kill a player, assuming that all shots connect. This is known as Time To Kill, or TTK for short. A lower TTK value corresponds to a higher damage output, which may be a bit confusing, so the program also calculates a "Damage Score", which is just 1/TTK x 100. This value is slightly more accurate than the average TTK displayed because it is not rounded.

Please not that because TTK assumes that all shots hit, the damage calculated of each weapon is only applicable for very close range. Think anything within ~15 meters. At longer distances, weapon recoil and bullet velocity will be much more impactful than pure damage output.

This program takes into account a total of 8 armor and health variations that I believe the be the most common and relevant. This included different combinations of LV2 and LV3 armor, and both 75 and 100 HP. I chose to not include variations with LV1 gear because by the time you can choose a weapon, you wouldn't be fighting players with LV1 gear.
