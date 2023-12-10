package com.waitring.waitring.common.repository

import com.waitring.waitring.common.domain.Image

interface ImageRepositoryCustom {
    fun getImage(storeId : Long) : Image?
}