@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps

/**
 * Properties for defining a `CfnTransitGatewayMulticastDomain`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayMulticastDomainProps cfnTransitGatewayMulticastDomainProps =
 * CfnTransitGatewayMulticastDomainProps.builder()
 * .transitGatewayId("transitGatewayId")
 * // the properties below are optional
 * .options(options)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html)
 */
@CdkDslMarker
public class CfnTransitGatewayMulticastDomainPropsDsl {
    private val cdkBuilder: CfnTransitGatewayMulticastDomainProps.Builder =
        CfnTransitGatewayMulticastDomainProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param options The options for the transit gateway multicast domain.
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     */
    public fun options(options: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(options)
        cdkBuilder.options(builder.map)
    }

    /**
     * @param options The options for the transit gateway multicast domain.
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     */
    public fun options(options: Any) {
        cdkBuilder.options(options)
    }

    /** @param tags The tags for the transit gateway multicast domain. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the transit gateway multicast domain. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param transitGatewayId The ID of the transit gateway. */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): CfnTransitGatewayMulticastDomainProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
