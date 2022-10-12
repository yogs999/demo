package com.example.buttomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buttomnavigation.adapter.Course
import com.example.buttomnavigation.adapter.viewmodel
import com.example.buttomnavigation.databinding.FragmentHomeBinding

class dashboard : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var viewHolder: viewmodel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding=FragmentHomeBinding.inflate(layoutInflater,container,false)


        val list = arrayListOf<Course>()

        list.add(Course(R.drawable.php,"PHP code is usually processed on a web server by a PHP interpreter implemented as a module, a daemon or as a Common Gateway Interface (CGI) executable. On a web server, the result of the interpreted and executed PHP code – which may be any type of data, such as generated HTML or binary image data – would form the whole or part of an HTTP response. Various web template systems, web content management systems, and web frameworks exist which can be employed to orchestrate or facilitate the generation of that response. Additionally, PHP can be used for many programming tasks outside the web context, such as standalone graphical applications[9] and robotic drone control.[10] PHP code can also be directly executed from the command line."))
        list.add(Course(R.drawable.android,"Android software development is the process by which applications are created for devices running the Android operating system. Google states that[3] \"Android apps can be written using Kotlin, Java, and C++ languages\" using the Android software development kit (SDK), while using other languages is also possible. All non-Java virtual machine (JVM) languages, such as Go, JavaScript, C, C++ or assembly, need the help of JVM language code, that may be supplied by tools, likely with restricted API support. Some programming languages and tools allow cross-platform app support (i.e. for both Android and iOS). Third party tools, development environments, and language support have also continued to evolve and expand since the initial SDK was released in 2008. The official Android app distribution mechanism to end users is Google Play; it also allows staged gradual app release, as well as distribution of pre-release app versions to testers."))
        list.add(Course(R.drawable.java,"ava is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.\n" +
                "\n" +
                "While most modern Java applications combine the Java runtime and application together, there are still many applications and even some websites that will not function unless you have a desktop Java installed. Java.com, this website, is intended for consumers who may still require Java for their desktop applications – specifically applications targeting Java 8. Developers as well as users that would like to learn Java programming should visit the dev.java website instead and business users should visit oracle.com/java for more information."))
        list.add(Course(R.drawable.net,".NET is a software framework that is designed and developed by Microsoft. The first version of the .Net framework was 1.0 which came in the year 2002. In easy words, it is a virtual machine for compiling and executing programs written in different languages like C#, VB.Net, etc. \n" +
                "\n" +
                "It is used to develop Form-based applications, Web-based applications, and Web services. There is a variety of programming languages available on the .Net platform, VB.Net and C# being the most common ones. It is used to build applications for Windows, phones, web, etc. It provides a lot of functionalities and also supports industry standards. "))

        val recycler=binding.recyclerview.findViewById<RecyclerView>(R.id.recyclerview)

        recycler.setHasFixedSize(true)
        viewHolder = viewmodel(requireContext(),list)
        recycler.adapter = viewHolder
        recycler.layoutManager = LinearLayoutManager(context)


        return binding.root

    }

}