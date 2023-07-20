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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import software.amazon.awscdk.services.iotsitewise.CfnGatewayProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGatewayPropsDsl {
    private val cdkBuilder: CfnGatewayProps.Builder = CfnGatewayProps.builder()

    private val _gatewayCapabilitySummaries: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any) {
        _gatewayCapabilitySummaries.addAll(listOf(*gatewayCapabilitySummaries))
    }

    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: Collection<Any>) {
        _gatewayCapabilitySummaries.addAll(gatewayCapabilitySummaries)
    }

    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable) {
        cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries)
    }

    public fun gatewayName(gatewayName: String) {
        cdkBuilder.gatewayName(gatewayName)
    }

    public fun gatewayPlatform(gatewayPlatform: IResolvable) {
        cdkBuilder.gatewayPlatform(gatewayPlatform)
    }

    public fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty) {
        cdkBuilder.gatewayPlatform(gatewayPlatform)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGatewayProps {
        if (_gatewayCapabilitySummaries.isNotEmpty()) {
            cdkBuilder.gatewayCapabilitySummaries(_gatewayCapabilitySummaries)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
