package com.ifs21015.lostfound.data.remote.response

import com.google.gson.annotations.SerializedName

data class DelcomResponse(

	@field:SerializedName("success")
	val success: Boolean,

	@field:SerializedName("message")
	val message: String
)
