package com.test.sportsupdates.Model


import com.google.gson.annotations.SerializedName

data class Match2Response(
    @SerializedName("Matchdetail")
    var matchdetail: Matchdetail? = null,
    @SerializedName("Nuggets")
    var nuggets: List<String>? = null,
    @SerializedName("Innings")
    var innings: List<Inning>? = null,
    @SerializedName("Teams")
    var teams: Teams? = null,
    @SerializedName("Notes")
    var notes: Notes? = null
) {
    data class Matchdetail(
        @SerializedName("Team_Home")
        var teamHome: String? = null,
        @SerializedName("Team_Away")
        var teamAway: String? = null,
        @SerializedName("Match")
        var match: Match? = null,
        @SerializedName("Series")
        var series: Series? = null,
        @SerializedName("Venue")
        var venue: Venue? = null,
        @SerializedName("Officials")
        var officials: Officials? = null,
        @SerializedName("Weather")
        var weather: String? = null,
        @SerializedName("Tosswonby")
        var tosswonby: String? = null,
        @SerializedName("Status")
        var status: String? = null,
        @SerializedName("Status_Id")
        var statusId: String? = null,
        @SerializedName("Player_Match")
        var playerMatch: String? = null,
        @SerializedName("Result")
        var result: String? = null,
        @SerializedName("Winningteam")
        var winningteam: String? = null,
        @SerializedName("Winmargin")
        var winmargin: String? = null,
        @SerializedName("Equation")
        var equation: String? = null
    ) {
        data class Match(
            @SerializedName("Livecoverage")
            var livecoverage: String? = null,
            @SerializedName("Id")
            var id: String? = null,
            @SerializedName("Code")
            var code: String? = null,
            @SerializedName("League")
            var league: String? = null,
            @SerializedName("Number")
            var number: String? = null,
            @SerializedName("Type")
            var type: String? = null,
            @SerializedName("Date")
            var date: String? = null,
            @SerializedName("Time")
            var time: String? = null,
            @SerializedName("Offset")
            var offset: String? = null,
            @SerializedName("Daynight")
            var daynight: String? = null
        )

        data class Series(
            @SerializedName("Id")
            var id: String? = null,
            @SerializedName("Name")
            var name: String? = null,
            @SerializedName("Status")
            var status: String? = null,
            @SerializedName("Tour")
            var tour: String? = null,
            @SerializedName("Tour_Name")
            var tourName: String? = null
        )

        data class Venue(
            @SerializedName("Id")
            var id: String? = null,
            @SerializedName("Name")
            var name: String? = null
        )

        data class Officials(
            @SerializedName("Umpires")
            var umpires: String? = null,
            @SerializedName("Referee")
            var referee: String? = null
        )
    }

    data class Inning(
        @SerializedName("Number")
        var number: String? = null,
        @SerializedName("Battingteam")
        var battingteam: String? = null,
        @SerializedName("Total")
        var total: String? = null,
        @SerializedName("Wickets")
        var wickets: String? = null,
        @SerializedName("Overs")
        var overs: String? = null,
        @SerializedName("Runrate")
        var runrate: String? = null,
        @SerializedName("Byes")
        var byes: String? = null,
        @SerializedName("Legbyes")
        var legbyes: String? = null,
        @SerializedName("Wides")
        var wides: String? = null,
        @SerializedName("Noballs")
        var noballs: String? = null,
        @SerializedName("Penalty")
        var penalty: String? = null,
        @SerializedName("AllottedOvers")
        var allottedOvers: String? = null,
        @SerializedName("Batsmen")
        var batsmen: List<Batsmen?>? = null,
        @SerializedName("Partnership_Current")
        var partnershipCurrent: PartnershipCurrent? = null,
        @SerializedName("Bowlers")
        var bowlers: List<Bowler?>? = null,
        @SerializedName("FallofWickets")
        var fallofWickets: List<FallofWicket?>? = null,
        @SerializedName("PowerPlay")
        var powerPlay: PowerPlay? = null,
        @SerializedName("Target")
        var target: String? = null
    ) {
        data class Batsmen(
            @SerializedName("Batsman")
            var batsman: String? = null,
            @SerializedName("Runs")
            var runs: String? = null,
            @SerializedName("Balls")
            var balls: String? = null,
            @SerializedName("Fours")
            var fours: String? = null,
            @SerializedName("Sixes")
            var sixes: String? = null,
            @SerializedName("Dots")
            var dots: String? = null,
            @SerializedName("Strikerate")
            var strikerate: String? = null,
            @SerializedName("Dismissal")
            var dismissal: String? = null,
            @SerializedName("Howout")
            var howout: String? = null,
            @SerializedName("Bowler")
            var bowler: String? = null,
            @SerializedName("Fielder")
            var fielder: String? = null,
            @SerializedName("Isonstrike")
            var isonstrike: Boolean? = null
        )

        data class PartnershipCurrent(
            @SerializedName("Runs")
            var runs: String? = null,
            @SerializedName("Balls")
            var balls: String? = null,
            @SerializedName("Batsmen")
            var batsmen: List<Batsmen?>? = null
        ) {
            data class Batsmen(
                @SerializedName("Batsman")
                var batsman: String? = null,
                @SerializedName("Runs")
                var runs: String? = null,
                @SerializedName("Balls")
                var balls: String? = null
            )
        }

        data class Bowler(
            @SerializedName("Bowler")
            var bowler: String? = null,
            @SerializedName("Overs")
            var overs: String? = null,
            @SerializedName("Maidens")
            var maidens: String? = null,
            @SerializedName("Runs")
            var runs: String? = null,
            @SerializedName("Wickets")
            var wickets: String? = null,
            @SerializedName("Economyrate")
            var economyrate: String? = null,
            @SerializedName("Noballs")
            var noballs: String? = null,
            @SerializedName("Wides")
            var wides: String? = null,
            @SerializedName("Dots")
            var dots: String? = null,
            @SerializedName("Isbowlingtandem")
            var isbowlingtandem: Boolean? = null,
            @SerializedName("Isbowlingnow")
            var isbowlingnow: Boolean? = null,
            @SerializedName("ThisOver")
            var thisOver: List<ThisOver?>? = null
        ) {
            data class ThisOver(
                @SerializedName("T")
                var t: String? = null,
                @SerializedName("B")
                var b: String? = null
            )
        }

        data class FallofWicket(
            @SerializedName("Batsman")
            var batsman: String? = null,
            @SerializedName("Score")
            var score: String? = null,
            @SerializedName("Overs")
            var overs: String? = null
        )

        data class PowerPlay(
            @SerializedName("PP1")
            var pP1: String? = null,
            @SerializedName("PP2")
            var pP2: String? = null
        )
    }

    data class Teams(
        @SerializedName("4")
        var x4: X4? = null,
        @SerializedName("5")
        var x5: X5? = null
    ) {
        data class X4(
            @SerializedName("Name_Full")
            var nameFull: String? = null,
            @SerializedName("Name_Short")
            var nameShort: String? = null,
            @SerializedName("Players")
            var players: Players? = null
        ) {
            data class Players(
                @SerializedName("3852")
                var x3852: X3852? = null,
                @SerializedName("3722")
                var x3722: X3722? = null,
                @SerializedName("66818")
                var x66818: X66818? = null,
                @SerializedName("4176")
                var x4176: X4176? = null,
                @SerializedName("3632")
                var x3632: X3632? = null,
                @SerializedName("4532")
                var x4532: X4532? = null,
                @SerializedName("63751")
                var x63751: X63751? = null,
                @SerializedName("63187")
                var x63187: X63187? = null,
                @SerializedName("9844")
                var x9844: X9844? = null,
                @SerializedName("5132")
                var x5132: X5132? = null,
                @SerializedName("65867")
                var x65867: X65867? = null
            ) {
                data class X3852(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Iscaptain")
                    var iscaptain: Boolean? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X3722(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X66818(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X4176(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X3632(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Iskeeper")
                    var iskeeper: Boolean? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X4532(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X63751(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X63187(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X9844(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X5132(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X65867(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }
            }
        }

        data class X5(
            @SerializedName("Name_Full")
            var nameFull: String? = null,
            @SerializedName("Name_Short")
            var nameShort: String? = null,
            @SerializedName("Players")
            var players: Players? = null
        ) {
            data class Players(
                @SerializedName("4964")
                var x4964: X4964? = null,
                @SerializedName("57594")
                var x57594: X57594? = null,
                @SerializedName("4330")
                var x4330: X4330? = null,
                @SerializedName("3752")
                var x3752: X3752? = null,
                @SerializedName("10167")
                var x10167: X10167? = null,
                @SerializedName("10172")
                var x10172: X10172? = null,
                @SerializedName("57903")
                var x57903: X57903? = null,
                @SerializedName("11703")
                var x11703: X11703? = null,
                @SerializedName("11706")
                var x11706: X11706? = null,
                @SerializedName("60544")
                var x60544: X60544? = null,
                @SerializedName("4338")
                var x4338: X4338? = null
            ) {
                data class X4964(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X57594(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X4330(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Iscaptain")
                    var iscaptain: Boolean? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X3752(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X10167(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Iskeeper")
                    var iskeeper: Boolean? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X10172(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X57903(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X11703(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X11706(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X60544(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }

                data class X4338(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Batting")
                    var batting: Batting? = null,
                    @SerializedName("Bowling")
                    var bowling: Bowling? = null
                ) {
                    data class Batting(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Strikerate")
                        var strikerate: String? = null,
                        @SerializedName("Runs")
                        var runs: String? = null
                    )

                    data class Bowling(
                        @SerializedName("Style")
                        var style: String? = null,
                        @SerializedName("Average")
                        var average: String? = null,
                        @SerializedName("Economyrate")
                        var economyrate: String? = null,
                        @SerializedName("Wickets")
                        var wickets: String? = null
                    )
                }
            }
        }
    }

    data class Notes(
        @SerializedName("1")
        var x1: List<String?>? = null,
        @SerializedName("2")
        var x2: List<String?>? = null
    )
}