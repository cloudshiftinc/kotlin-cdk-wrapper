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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.wafv2.CfnIPSetProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIPSetPropsDsl {
    private val cdkBuilder: CfnIPSetProps.Builder = CfnIPSetProps.builder()

    private val _addresses: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun addresses(vararg addresses: String) {
        _addresses.addAll(listOf(*addresses))
    }

    public fun addresses(addresses: Collection<String>) {
        _addresses.addAll(addresses)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun ipAddressVersion(ipAddressVersion: String) {
        cdkBuilder.ipAddressVersion(ipAddressVersion)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIPSetProps {
        if (_addresses.isNotEmpty()) cdkBuilder.addresses(_addresses)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
