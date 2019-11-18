package com.example.myfootballapp

import com.example.myfootballapp.Model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}