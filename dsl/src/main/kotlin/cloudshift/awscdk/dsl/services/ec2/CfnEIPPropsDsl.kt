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
import software.amazon.awscdk.services.ec2.CfnEIPProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEIPPropsDsl {
    private val cdkBuilder: CfnEIPProps.Builder = CfnEIPProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun networkBorderGroup(networkBorderGroup: String) {
        cdkBuilder.networkBorderGroup(networkBorderGroup)
    }

    public fun publicIpv4Pool(publicIpv4Pool: String) {
        cdkBuilder.publicIpv4Pool(publicIpv4Pool)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun transferAddress(transferAddress: String) {
        cdkBuilder.transferAddress(transferAddress)
    }

    public fun build(): CfnEIPProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
