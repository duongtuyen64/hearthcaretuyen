package com.example.healthcare2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.healthcare2.R
import com.example.healthcare2.adapter.NotificationAdapter
import com.example.healthcare2.data.model.Post
import com.example.healthcare2.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {
    private  var binding : FragmentNotificationBinding? = null
    private lateinit var notificationAdapter: NotificationAdapter
    private lateinit var postList: List<Post>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationBinding.inflate(layoutInflater)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.recycleViewListNotification?.setLayoutManager(LinearLayoutManager(requireContext()))
        postList = ArrayList<Post>()
        val post1 = Post(R.drawable.avatar, "Dương Tuyến", "commented on your", "post")
        val post2 = Post(R.drawable.avatar, "Luân Ngu", "commented on your", "post")
        val post3 = Post(R.drawable.avatar, "Tú Ngu", "commented on your", "post")
        val post4 = Post(R.drawable.avatar, "Đoàn Ngu", "commented on your", "post")
        val post5 = Post(R.drawable.avatar, "Dương Tuyến", "commented on your", "post")
        val post6 = Post(R.drawable.avatar, "Luân Ngu", "commented on your", "post")
        val post7 = Post(R.drawable.avatar, "Tú Ngu", "commented on your", "post")
        val post8 = Post(R.drawable.avatar, "Đoàn Ngu", "commented on your", "post")
        val post9 = Post(R.drawable.avatar, "Luân Ngu", "commented on your", "post")
        (postList as ArrayList<Post>).add(post1)
        (postList as ArrayList<Post>).add(post2)
        (postList as ArrayList<Post>).add(post3)
        (postList as ArrayList<Post>).add(post4)
        (postList as ArrayList<Post>).add(post5)
        (postList as ArrayList<Post>).add(post6)
        (postList as ArrayList<Post>).add(post7)
        (postList as ArrayList<Post>).add(post8)
        (postList as ArrayList<Post>).add(post9)
        notificationAdapter = NotificationAdapter(
            requireContext(),
            postList,
            R.layout.item_notification
        )

        binding?.recycleViewListNotification?.setAdapter(notificationAdapter)
        notificationAdapter.notifyDataSetChanged()
    }
}