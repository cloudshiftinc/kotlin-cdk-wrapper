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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain
import software.constructs.Construct

/**
 * Creates a multicast domain using the specified transit gateway.
 *
 * The transit gateway must be in the available state before you create a domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayMulticastDomain cfnTransitGatewayMulticastDomain =
 * CfnTransitGatewayMulticastDomain.Builder.create(this, "MyCfnTransitGatewayMulticastDomain")
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
public class CfnTransitGatewayMulticastDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayMulticastDomain.Builder =
        CfnTransitGatewayMulticastDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The options for the transit gateway multicast domain.
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-options)
     *
     * @param options The options for the transit gateway multicast domain.
     */
    public fun options(options: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(options)
        cdkBuilder.options(builder.map)
    }

    /**
     * The options for the transit gateway multicast domain.
     * * AutoAcceptSharedAssociations (enable | disable)
     * * Igmpv2Support (enable | disable)
     * * StaticSourcesSupport (enable | disable)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-options)
     *
     * @param options The options for the transit gateway multicast domain.
     */
    public fun options(options: Any) {
        cdkBuilder.options(options)
    }

    /**
     * The tags for the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
     *
     * @param tags The tags for the transit gateway multicast domain.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-tags)
     *
     * @param tags The tags for the transit gateway multicast domain.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomain.html#cfn-ec2-transitgatewaymulticastdomain-transitgatewayid)
     *
     * @param transitGatewayId The ID of the transit gateway.
     */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): CfnTransitGatewayMulticastDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
