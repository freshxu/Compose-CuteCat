/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

object CatRepo {
    fun get(): List<Cat> =
        listOf(
            Cat(
                R.drawable.cat_1,
                "秒秒-天津宠物领养\n" +
                        "待领养\n" +
                        "No.66994 天津/河北区\n" +
                        "品种: 小猫性别: 母",
                "秒秒好像是走失的猫咪 看起来像是英短 那天天津下雪 就把她接回家了 但是一直没有找到主人 胆子很小 很乖 不会随便碰任何东西 会用猫砂 自己吃饭喝水 熟了之后就会来蹭你的腿 带她到医院检查身体无异常 疫苗也打了 因为室友猫毛过敏所以可能没办法养 希望给她找了负责人的主人",
            ),

            Cat(
                R.drawable.cat_2,
                "上海地区橘猫弟弟免费领养-上海宠物领养\n" +
                        "待领养\n" +
                        "No.66993 上海/上海\n" +
                        "品种: 小猫性别: 公",
                "已绝育已驱虫已疫苗\n" +
                        "一岁多的弟弟 由于本人过敏性哮喘，忍痛把家里肥橘免费送给有缘人。 虽然是中华田园猫但是希望你不要差别待遇，不奢望给他吃多贵的粮但是不要让孩子饿肚子。 必须有稳定工作，学生党不接受。 胖橘小时候被虐待过希望你不要再让他受伤。 认真负责。 是个粘人精，希望你不要嫌弃。",
            ),

            Cat(
                R.drawable.cat_3,
                "起司姐妹花-杭州宠物领养\n" +
                        "待领养\n" +
                        "No.66991 杭州/下城区\n" +
                        "品种: 小猫性别: 母",
                "小可爱和奥利奥是一对美短起司姐妹花，从小一起长大的，形影不离，被主人遗弃了。现在一岁多点，性格温顺，亲人。目前寄养在宠物店里，领养的话要两只一起领养。仅限杭州及周边地区领养。",
            ),

            Cat(
                R.drawable.cat_4,
                "广佛地区 超粘人小猫找领养-北京宠物领养\n" +
                        "待领养\n" +
                        "No.66989 北京/北京\n" +
                        "品种: 小猫性别: 公",
                "猫猫是1月27号晚上在花园里面遇到的，在草地方趴着一点也不怕人，人一靠近就拼命的过来蹭、发出很大的呼噜声，抱它也不会抗拒。\n" +
                        "本来以为是花园里那个业主的，就打算先带回家等主人来认领，但是一直都没有人来认领\n" +
                        "接回家后做好了驱虫绝育，有轻微耳螨也已经治好。也同时在网上找领养，但是也一直没有人来领养。到了过年，家里人都要出去，没办法就把小黑放回花园里了。\n" +
                        "过完年后，2月28号在花园里散步，小黑似乎听到了我的声音，喵的钻出草丛朝我跑过来，躺在地上让我随便撸，真的是一只好懂事好粘人丢小猫咪然后在花园里吗也一直跟着我们走回了家。舍不得它继续在外面流浪了所以又把它带回了家，希望过完年后应该比较好找领养了吧。\n" +
                        "是一只成年公猫，大概一岁，捡回来以后吃喝拉撒都正常，已内外驱虫，做好绝育，会用猫砂，胃口很好。猫猫特别粘人，看到人来了就一直蹭一直蹭，发出很大的呼噜声，性格很好，怎么撸都不伸爪子。\n" +
                        "希望有好心人给这只黏人的小可爱一个家",
            ),

            Cat(
                R.drawable.cat_5,
                "小猫找领养 坐标西宁-西宁宠物领养\n" +
                        "待领养\n" +
                        "No.36680 西宁/西宁\n" +
                        "品种: 小猫性别: 公",
                "#西宁领养# 四十天大的三花小猫找领养，要求领养人必须是经济独立且家里同意养猫，做好领养她一辈子的准备，不散养不笼养，不会因各种原因抛弃猫咪，满足以上条件可联系我，还有很多照片",
            ),

            Cat(
                R.drawable.cat_6,
                "长毛蓝猫弟弟找新家-广州宠物领养\n" +
                        "待领养\n" +
                        "No.66969 广州/广州\n" +
                        "品种: 小猫性别: 公",
                "坐标番禺，非常可爱又健康的弟弟找新家。自己家大猫生的宝宝。无病无癣，已经两个月已打一针疫苗，只有这一只了。",
            ),
        )
}