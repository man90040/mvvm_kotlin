package com.test.sportsupdates.Model


import com.google.gson.annotations.SerializedName

data class MatchResponse(
    @SerializedName("Matchdetail")
    var matchdetail: Matchdetail? = null,
    @SerializedName("Nuggets")
    var nuggets: List<String?>? = null,
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

     class Inning(
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
        @SerializedName("6")
        var x6: X6? = null,
        @SerializedName("7")
        var x7: X7? = null
    ) {
        data class X6(
            @SerializedName("Name_Full")
            var nameFull: String? = null,
            @SerializedName("Name_Short")
            var nameShort: String? = null,
            @SerializedName("Players")
            var players: Players? = null
        ) {
            data class Players(
                @SerializedName("63084")
                var x63084: X63084? = null,
                @SerializedName("57492")
                var x57492: X57492? = null,
                @SerializedName("59429")
                var x59429: X59429? = null,
                @SerializedName("3472")
                var x3472: X3472? = null,
                @SerializedName("2734")
                var x2734: X2734? = null,
                @SerializedName("4038")
                var x4038: X4038? = null,
                @SerializedName("65739")
                var x65739: X65739? = null,
                @SerializedName("64073")
                var x64073: X64073? = null,
                @SerializedName("64321")
                var x64321: X64321? = null,
                @SerializedName("64306")
                var x64306: X64306? = null,
                @SerializedName("66833")
                var x66833: X66833? = null
            ) {
                data class X63084(
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

                data class X57492(
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

                data class X59429(
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

                data class X3472(
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

                data class X2734(
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

                data class X4038(
                    @SerializedName("Position")
                    var position: String? = null,
                    @SerializedName("Name_Full")
                    var nameFull: String? = null,
                    @SerializedName("Iscaptain")
                    var iscaptain: Boolean? = null,
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

                data class X65739(
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

                data class X64073(
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

                data class X64321(
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

                data class X64306(
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

                data class X66833(
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

        data class X7(
            @SerializedName("Name_Full")
            var nameFull: String? = null,
            @SerializedName("Name_Short")
            var nameShort: String? = null,
            @SerializedName("Players")
            var players: Players? = null
        ) {
            data class Players(
                @SerializedName("3667")
                var x3667: X3667? = null,
                @SerializedName("4356")
                var x4356: X4356? = null,
                @SerializedName("12518")
                var x12518: X12518? = null,
                @SerializedName("28891")
                var x28891: X28891? = null,
                @SerializedName("5313")
                var x5313: X5313? = null,
                @SerializedName("59736")
                var x59736: X59736? = null,
                @SerializedName("64221")
                var x64221: X64221? = null,
                @SerializedName("63611")
                var x63611: X63611? = null,
                @SerializedName("24669")
                var x24669: X24669? = null,
                @SerializedName("48191")
                var x48191: X48191? = null,
                @SerializedName("57458")
                var x57458: X57458? = null
            ) {
                data class X3667(
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

                data class X4356(
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

                data class X12518(
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

                data class X28891(
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

                data class X5313(
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

                data class X59736(
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

                data class X64221(
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

                data class X63611(
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

                data class X24669(
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

                data class X48191(
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

                data class X57458(
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