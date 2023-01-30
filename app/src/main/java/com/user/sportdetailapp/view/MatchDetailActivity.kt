package com.user.sportdetailapp.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.rozana.coustomer.Network.ApiHelperImpl
import com.rozana.coustomer.Network.RetrofitBuilder
import com.test.sportsupdates.Model.Match2Response
import com.test.sportsupdates.Model.MatchResponse
import com.user.sportdetailapp.viewmodels.MatchDetail1Model
import com.user.sportdetailapp.databinding.ActivityMatchdetailBinding
import com.user.sportdetailapp.viewmodels.ViewModelFactoryActivity

class MatchDetailActivity:AppCompatActivity() {

    private lateinit var _binding: ActivityMatchdetailBinding
    private val binding get() = _binding!!
    private lateinit var viewModel: MatchDetail1Model


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMatchdetailBinding.inflate(layoutInflater)
        val view: View = _binding!!.getRoot()
        setContentView(view)


        val horizontalLayoutManager = LinearLayoutManager(this)
        _binding.listplayerlist.rvTeam1.setLayoutManager(horizontalLayoutManager)
        _binding.listplayerlist.rvTeam2.setLayoutManager(horizontalLayoutManager)

        setupViewModel()
        setupObservers()

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


        viewModel.setMatchData2teamMatchdetail.observe(this) {
            setMatchdetail2(it);

        }
        viewModel.setMatchData2teamTeams.observe(this) {
            setTeams2(it);

        }
        viewModel.setMatchData2teamInning.observe(this) {
            setInning2(it);

        }
        viewModel.setMatchData2teamNotes.observe(this) {
            setNotes2(it);

        }


        viewModel.errorMessage.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }

        viewModel.loading.observe(this, Observer {
            //Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
        viewModel.getMatch2Response()

    }

    private fun setInning2(it: List<Match2Response.Inning>?) {

    }

    private fun setNotes2(it: List<Match2Response.Notes>?) {

    }

    private fun setTeams2(it: List<Match2Response.Teams>?) {

    }

    private fun setMatchdetail2(it: List<Match2Response.Matchdetail>?) {


        if (it != null) {
            

        }
    }



    private fun setTeams(it: List<MatchResponse.Teams>?) {

        if (it != null) {
          
        }

    }


    private fun setMatchdetail(it: List<MatchResponse.Matchdetail>?) {
        if (it != null) {
         
        }
    }

    
}