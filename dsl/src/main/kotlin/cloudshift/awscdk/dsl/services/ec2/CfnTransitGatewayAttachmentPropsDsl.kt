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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps

/**
 * Properties for defining a `CfnTransitGatewayAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayAttachmentProps cfnTransitGatewayAttachmentProps =
 * CfnTransitGatewayAttachmentProps.builder()
 * .subnetIds(List.of("subnetIds"))
 * .transitGatewayId("transitGatewayId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .options(options)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html)
 */
@CdkDslMarker
public class CfnTransitGatewayAttachmentPropsDsl {
    private val cdkBuilder: CfnTransitGatewayAttachmentProps.Builder =
        CfnTransitGatewayAttachmentProps.builder()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param options The VPC attachment options. */
    public fun options(options: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(options)
        cdkBuilder.options(builder.map)
    }

    /** @param options The VPC attachment options. */
    public fun options(options: Any) {
        cdkBuilder.options(options)
    }

    /**
     * @param subnetIds The IDs of one or more subnets. You can specify only one subnet per
     *   Availability Zone. You must specify at least one subnet, but we recommend that you specify
     *   two subnets for better availability. The transit gateway uses one IP address from each
     *   specified subnet.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds The IDs of one or more subnets. You can specify only one subnet per
     *   Availability Zone. You must specify at least one subnet, but we recommend that you specify
     *   two subnets for better availability. The transit gateway uses one IP address from each
     *   specified subnet.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param tags The tags for the attachment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the attachment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param transitGatewayId The ID of the transit gateway. */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /** @param vpcId The ID of the VPC. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnTransitGatewayAttachmentProps {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
