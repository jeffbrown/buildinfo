package demo

import org.springframework.boot.actuate.info.BuildInfoContributor

class BuildInfoTagLib {
    static defaultEncodeAs = [taglib:'html']

    static namespace = 'build'

    BuildInfoContributor buildInfoContributor

    def meta = { attrs ->
        out << buildInfoContributor.properties.get(attrs.name)
    }
}
