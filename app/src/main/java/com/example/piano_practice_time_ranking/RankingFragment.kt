package com.example.piano_practice_time_ranking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.piano_practice_time_ranking.databinding.FragmentRankingBinding

class RankingFragment : Fragment() {

    private var _binding: FragmentRankingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRankingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ListViewの参照を取得
        val listView: ListView = binding.todayPracticeTimeRankingListView

        // 表示するデータを用意
        val data = listOf("Item 1", "Item 2", "Item 3", "Item 4")

        // ArrayAdapterを作成
        val adapter = ArrayAdapter(requireContext(), R.layout.today_practice_time_ranking_list_item, data)

        // ListViewにアダプターをセット
        listView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // メモリリークを防ぐためにbindingをクリア
    }
}