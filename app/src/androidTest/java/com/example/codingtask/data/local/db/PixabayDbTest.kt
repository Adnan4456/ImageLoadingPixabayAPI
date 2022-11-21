package com.example.codingtask.data.local.db

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.codingtask.data.local.dao.PixabayDao
import com.example.codingtask.data.local.entity.Pixabay
import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException


@RunWith(AndroidJUnit4::class)
class PixabayDbTest: TestCase(){

    private lateinit var dao: PixabayDao
    private lateinit var db:PixabayDb

    @Before
    public override fun setUp() {

        //first we need to create context
        val context = ApplicationProvider.getApplicationContext<Context>()

        db =  Room.inMemoryDatabaseBuilder(context, PixabayDb::class.java)
            .allowMainThreadQueries() // all query run on main thread
            .build()
        dao = db.pixabayDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDB(){
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun saveImageAndGetImages() = runBlocking {
        val image = Pixabay(      794978,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"fruit",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image1 = Pixabay(      7911978,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image2 = Pixabay(      79,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image3 = Pixabay(      7949,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image4 = Pixabay(      7998,6791,519,281326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image5 = Pixabay(      791178,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)

        val listPixabay = listOf(image,image1 , image2 ,image3, image4, image5)
        db.pixabayDao().saveImage(listPixabay)

        val tagList  = db.pixabayDao().fetchImages("dog")
        //The Page source should not be null
        assertThat(tagList).isNotNull()
    }

    @Test
    @Throws(Exception::class)
    fun deleteRecord() = runBlocking{

        val image = Pixabay(      794978,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image1 = Pixabay(      7911978,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)

        val image2 = Pixabay(      79,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"dog",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image3 = Pixabay(      7949,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"cat",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image4 = Pixabay(      7998,6791,519,281326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"shoe",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)
        val image5 = Pixabay(      791178,6791,5119,21326,1688,
            1628041,3000,       "https://pixabay.com/get/g4781fa0eb6cdff0742b304de44772685663c5f2944a6a7a5df2f7be3fad0bdc01fd3d8e859ea87a2a637cf07c173bceec7b7f6aea07cfb03369b6cbe50bc0099_1280.jpg",
            2881,"https://pixabay.com/illustrations/book-dog-fairy-tales-child-kid-794978/",84,
            "https://cdn.pixabay.com/photo/2015/06/02/12/59/book-794978_150.jpg",150,"fruit",
            "illustration","Comfreak",51581,"https://cdn.pixabay.com/user/2020/04/09/10-26-16-313_250x250.jpg",
            712654,360,"https://pixabay.com/get/g6d33dfc3acfbe8820dadaac809b0de241408746b977463e2d98c0e171f4f99e39340517f8f16d983b80dc3ab9aff17da_640.jpg",
            640)

        val listPixabay = listOf(image,image1 , image2 ,image3, image4, image5)
        db.pixabayDao().saveImage(listPixabay)

        val result = db.pixabayDao().deleteAll()
        assertThat(result>0).isTrue()
    }
}