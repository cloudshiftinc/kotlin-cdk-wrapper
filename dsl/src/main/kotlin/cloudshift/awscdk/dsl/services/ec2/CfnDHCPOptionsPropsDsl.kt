@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDHCPOptionsPropsDsl {
    private val cdkBuilder: CfnDHCPOptionsProps.Builder = CfnDHCPOptionsProps.builder()

    private val _domainNameServers: MutableList<String> = mutableListOf()

    private val _netbiosNameServers: MutableList<String> = mutableListOf()

    private val _ntpServers: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun domainNameServers(vararg domainNameServers: String) {
        _domainNameServers.addAll(listOf(*domainNameServers))
    }

    public fun domainNameServers(domainNameServers: Collection<String>) {
        _domainNameServers.addAll(domainNameServers)
    }

    public fun netbiosNameServers(vararg netbiosNameServers: String) {
        _netbiosNameServers.addAll(listOf(*netbiosNameServers))
    }

    public fun netbiosNameServers(netbiosNameServers: Collection<String>) {
        _netbiosNameServers.addAll(netbiosNameServers)
    }

    public fun netbiosNodeType(netbiosNodeType: Number) {
        cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    public fun ntpServers(vararg ntpServers: String) {
        _ntpServers.addAll(listOf(*ntpServers))
    }

    public fun ntpServers(ntpServers: Collection<String>) {
        _ntpServers.addAll(ntpServers)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDHCPOptionsProps {
        if (_domainNameServers.isNotEmpty()) cdkBuilder.domainNameServers(_domainNameServers)
        if (_netbiosNameServers.isNotEmpty()) cdkBuilder.netbiosNameServers(_netbiosNameServers)
        if (_ntpServers.isNotEmpty()) cdkBuilder.ntpServers(_ntpServers)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
