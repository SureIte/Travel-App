package kh.edu.rupp.ite.mytravel.Domains

import java.io.Serializable

class itemsDomain(var title:

String, var location:

String, var description:

String, var bed:

Int, var isGuide:

Boolean, var scare:

Double, var pic:

String, var place:

String) : Serializable {
    override fun toString(): String {
        return "itemsDomain(title='$title', " +
                "location='$location', " +
                "description='$description', " +
                "bed=$bed, " +
                "isGuide=$isGuide, " +
                "scare=$scare, " +
                "pic='$pic', " +
                "place='$place')"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}