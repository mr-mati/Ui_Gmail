package com.mati.gmail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mati.gmail.databinding.FragmentHomeBinding
import com.mati.wikiapp.adapter.MailAdapter
import com.mati.wikiapp.data.MailData

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.menu.setOnClickListener { view ->
            (activity as MainActivity).openAndCloseNavigationDrawer(view)
        }

        val data = arrayListOf(
            MailData(
                "Jobinja.ir",
                "Mahdi Mohammadi عزیز، شرکت \"داده گستر خط روشن\" و ۱۰ شرکت دیگر به دنبال استخدام فردی مثل شما هستند:",
                "فرصت\u200Cهای شغلی بالا براساس تنظیمات اطلاع\u200Cرسانی شما با عنوان \"کارآموز برنامه\u200Cنویس اندروید در دسته\u200Cبندی وب،\u200C برنامه\u200Cنویسی و نرم\u200Cافزار در تهران\" ارسال شده\u200Cاند، با ارسال رزومه\u200Cی خود اولین نفری باشید که برای فرصت\u200Cهای شغلی اقدام می\u200Cکند.",
                "23:12",
                false
            ),
            MailData(
                "Over the Reality",
                "\uD83C\uDF10 OVER Metaverse Fashion Week starts today!\u200F\u200F",
                "Top stories in the Crypto Roundup today:\n" +
                        "\n" +
                        "CFTC Files Lawsuit Against Binance\n" +
                        "Polygon Releases zkEVM Layer-2 Network\n" +
                        "MakerDAO Approves New ‘Constitution’\n" +
                        "Chart of the Week: Bitcoin Outperformance",
                "21:12",
                true
            ),
            MailData(
                "Jobinja.ir",
                "Mahdi Mohammadi عزیز، شرکت \"داده گستر خط روشن\" و ۱۰ شرکت دیگر به دنبال استخدام فردی مثل شما هستند:",
                "فرصت\u200Cهای شغلی بالا براساس تنظیمات اطلاع\u200Cرسانی شما با عنوان \"کارآموز برنامه\u200Cنویس اندروید در دسته\u200Cبندی وب،\u200C برنامه\u200Cنویسی و نرم\u200Cافزار در تهران\" ارسال شده\u200Cاند، با ارسال رزومه\u200Cی خود اولین نفری باشید که برای فرصت\u200Cهای شغلی اقدام می\u200Cکند.",
                "Mar 28",
                true
            ),
            MailData(
                "Jobinja.ir",
                "Mahdi Mohammadi عزیز، شرکت \"داده گستر خط روشن\" و ۱۰ شرکت دیگر به دنبال استخدام فردی مثل شما هستند:",
                "فرصت\u200Cهای شغلی بالا براساس تنظیمات اطلاع\u200Cرسانی شما با عنوان \"کارآموز برنامه\u200Cنویس اندروید در دسته\u200Cبندی وب،\u200C برنامه\u200Cنویسی و نرم\u200Cافزار در تهران\" ارسال شده\u200Cاند، با ارسال رزومه\u200Cی خود اولین نفری باشید که برای فرصت\u200Cهای شغلی اقدام می\u200Cکند.",
                "Mar 28",
                false
            ),
            MailData(
                "Jobinja.ir",
                "Mahdi Mohammadi عزیز، شرکت \"داده گستر خط روشن\" و ۱۰ شرکت دیگر به دنبال استخدام فردی مثل شما هستند:",
                "فرصت\u200Cهای شغلی بالا براساس تنظیمات اطلاع\u200Cرسانی شما با عنوان \"کارآموز برنامه\u200Cنویس اندروید در دسته\u200Cبندی وب،\u200C برنامه\u200Cنویسی و نرم\u200Cافزار در تهران\" ارسال شده\u200Cاند، با ارسال رزومه\u200Cی خود اولین نفری باشید که برای فرصت\u200Cهای شغلی اقدام می\u200Cکند.",
                "Mar 27",
                false
            ),
            MailData(
                "Jobinja.ir",
                "Mahdi Mohammadi عزیز، شرکت \"داده گستر خط روشن\" و ۱۰ شرکت دیگر به دنبال استخدام فردی مثل شما هستند:",
                "فرصت\u200Cهای شغلی بالا براساس تنظیمات اطلاع\u200Cرسانی شما با عنوان \"کارآموز برنامه\u200Cنویس اندروید در دسته\u200Cبندی وب،\u200C برنامه\u200Cنویسی و نرم\u200Cافزار در تهران\" ارسال شده\u200Cاند، با ارسال رزومه\u200Cی خود اولین نفری باشید که برای فرصت\u200Cهای شغلی اقدام می\u200Cکند.",
                "Mar 12",
                false
            ),
            MailData(
                "Jobinja.ir",
                "Mahdi Mohammadi عزیز، شرکت \"داده گستر خط روشن\" و ۱۰ شرکت دیگر به دنبال استخدام فردی مثل شما هستند:",
                "فرصت\u200Cهای شغلی بالا براساس تنظیمات اطلاع\u200Cرسانی شما با عنوان \"کارآموز برنامه\u200Cنویس اندروید در دسته\u200Cبندی وب،\u200C برنامه\u200Cنویسی و نرم\u200Cافزار در تهران\" ارسال شده\u200Cاند، با ارسال رزومه\u200Cی خود اولین نفری باشید که برای فرصت\u200Cهای شغلی اقدام می\u200Cکند.",
                "Mar 12",
                false
            ),
            MailData(
                "Jobinja.ir",
                "Mahdi Mohammadi عزیز، شرکت \"داده گستر خط روشن\" و ۱۰ شرکت دیگر به دنبال استخدام فردی مثل شما هستند:",
                "فرصت\u200Cهای شغلی بالا براساس تنظیمات اطلاع\u200Cرسانی شما با عنوان \"کارآموز برنامه\u200Cنویس اندروید در دسته\u200Cبندی وب،\u200C برنامه\u200Cنویسی و نرم\u200Cافزار در تهران\" ارسال شده\u200Cاند، با ارسال رزومه\u200Cی خود اولین نفری باشید که برای فرصت\u200Cهای شغلی اقدام می\u200Cکند.",
                "Mar 12",
                true
            )
        )

        val myAdapter = MailAdapter(data, requireContext())
        binding.showMail.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.showMail.adapter = myAdapter

    }

}