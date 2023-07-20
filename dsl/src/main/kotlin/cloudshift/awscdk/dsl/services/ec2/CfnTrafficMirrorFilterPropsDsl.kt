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
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTrafficMirrorFilterPropsDsl {
    private val cdkBuilder: CfnTrafficMirrorFilterProps.Builder =
        CfnTrafficMirrorFilterProps.builder()

    private val _networkServices: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun networkServices(vararg networkServices: String) {
        _networkServices.addAll(listOf(*networkServices))
    }

    public fun networkServices(networkServices: Collection<String>) {
        _networkServices.addAll(networkServices)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrafficMirrorFilterProps {
        if (_networkServices.isNotEmpty()) cdkBuilder.networkServices(_networkServices)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
