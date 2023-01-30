package com.user.sportdetailapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rozana.coustomer.Network.ApiHelperImpl
import com.rozana.coustomer.Network.RetrofitBuilder
import com.test.sportsupdates.Model.Match2Response
import com.test.sportsupdates.Model.MatchResponse


import com.user.sportdetailapp.databinding.ActivityMainBinding
import com.user.sportdetailapp.viewmodels.MatchDetail1Model
import com.user.sportdetailapp.viewmodels.ViewModelFactoryActivity

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding!!
    private lateinit var viewModel: MatchDetail1Model



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = _binding!!.getRoot()
        setContentView(view)



        setupViewModel()
        setupObservers()

        _binding.lytmatchdetailcard1.btnViewMatchDetails.setOnClickListener(View.OnClickListener {


            val i = Intent(this@MainActivity, MatchDetailActivity::class.java)
            startActivity(i)


        })

        _binding.lytmatchdetailcard2.btnViewMatchDetails.setOnClickListener(View.OnClickListener {

            val i = Intent(this@MainActivity, MatchDetailActivity::class.java)
            startActivity(i)

        })

    }

    fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactoryActivity(
                ApiHelperImpl(RetrofitBuilder.apiService),

                )

        ).get(MatchDetail1Model::class.java)
    }

    private fun setupObservers() {


        MatchDetail1();
        MatchDetail2();


    }

    private fun MatchDetail1() {
        viewModel.setMatchData1teamTeams.observe(this) {

            setTeams(it);

        }


        viewModel.setMatchData1teamMatchdetail.observe(this) {
            setMatchdetail(it);

        }


        viewModel.errorMessage.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }

        viewModel.loading.observe(this, Observer {
            //Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
        viewModel.getMatch1Response()

    }

    private fun MatchDetail2() {
        viewModel.setMatchData2teamTeams.observe(this) {

            setTeams2(it);

        }


        viewModel.setMatchData2teamMatchdetail.observe(this) {
            setMatchdetail2(it);

        }


        viewModel.errorMessage.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }

        viewModel.loading.observe(this, Observer {
            //Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
        viewModel.getMatch2Response()

    }

    private fun setMatchdetail2(it: List<Match2Response.Matchdetail>?) {


        if (it != null) {
            _binding.lytmatchdetailcard2.txtMatchTitle.setText(it.get(0).series?.name)
            _binding.lytmatchdetailcard2.txtOdi.setText(it.get(0).match?.number)
            _binding.lytmatchdetailcard2.txtdatetime.setText(it.get(0).match?.date + "" + it.get(0).match?.time)
            _binding.lytmatchdetailcard2.txtMatchResult.setText(it.get(0).result)
            _binding.lytmatchdetailcard2.txtMatchVenue.setText(it.get(0).venue?.name)

        }
    }

    private fun setTeams2(it: List<Match2Response.Teams>?) {

        if (it != null) {
            _binding.lytmatchdetailcard2.txtTeamName1.setText(it.get(0).x4?.nameFull)
            _binding.lytmatchdetailcard2.txtTeamName2.setText(it.get(0).x5?.nameFull)
        }
    }

    private fun setTeams(it: List<MatchResponse.Teams>?) {

        if (it != null) {
            _binding.lytmatchdetailcard1.txtTeamName1.setText(it.get(0).x6?.nameFull)
            _binding.lytmatchdetailcard1.txtTeamName2.setText(it.get(0).x7?.nameFull)
        }

    }


    private fun setMatchdetail(it: List<MatchResponse.Matchdetail>?) {
        if (it != null) {
            _binding.lytmatchdetailcard1.txtMatchTitle.setText(it.get(0).series?.name)
            _binding.lytmatchdetailcard1.txtOdi.setText(it.get(0).match?.number)
            _binding.lytmatchdetailcard1.txtdatetime.setText(it.get(0).match?.date + "" + it.get(0).match?.time)
            _binding.lytmatchdetailcard1.txtMatchResult.setText(it.get(0).result)
            _binding.lytmatchdetailcard1.txtMatchVenue.setText(it.get(0).venue?.name)

        }
    }


}


