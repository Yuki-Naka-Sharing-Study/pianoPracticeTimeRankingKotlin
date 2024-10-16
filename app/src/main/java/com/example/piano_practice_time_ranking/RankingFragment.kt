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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ranking, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ListViewの参照を取得
        val listView: ListView = binding.myListView

        // 表示するデータを用意
        val data = listOf("Item 1", "Item 2", "Item 3", "Item 4")

        // ArrayAdapterを作成
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, data)

        // ListViewにアダプターをセット
        listView.adapter = adapter
    }
}