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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment
import software.constructs.Construct

/**
 * Specifies a VPC attachment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayVpcAttachment cfnTransitGatewayVpcAttachment =
 * CfnTransitGatewayVpcAttachment.Builder.create(this, "MyCfnTransitGatewayVpcAttachment")
 * .subnetIds(List.of("subnetIds"))
 * .transitGatewayId("transitGatewayId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .addSubnetIds(List.of("addSubnetIds"))
 * .options(options)
 * .removeSubnetIds(List.of("removeSubnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html)
 */
@CdkDslMarker
public class CfnTransitGatewayVpcAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayVpcAttachment.Builder =
        CfnTransitGatewayVpcAttachment.Builder.create(scope, id)

    private val _addSubnetIds: MutableList<String> = mutableListOf()

    private val _removeSubnetIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The IDs of one or more subnets to add.
     *
     * You can specify at most one subnet per Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
     *
     * @param addSubnetIds The IDs of one or more subnets to add.
     */
    public fun addSubnetIds(vararg addSubnetIds: String) {
        _addSubnetIds.addAll(listOf(*addSubnetIds))
    }

    /**
     * The IDs of one or more subnets to add.
     *
     * You can specify at most one subnet per Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
     *
     * @param addSubnetIds The IDs of one or more subnets to add.
     */
    public fun addSubnetIds(addSubnetIds: Collection<String>) {
        _addSubnetIds.addAll(addSubnetIds)
    }

    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-options)
     *
     * @param options The VPC attachment options.
     */
    public fun options(options: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(options)
        cdkBuilder.options(builder.map)
    }

    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-options)
     *
     * @param options The VPC attachment options.
     */
    public fun options(options: Any) {
        cdkBuilder.options(options)
    }

    /**
     * The IDs of one or more subnets to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
     *
     * @param removeSubnetIds The IDs of one or more subnets to remove.
     */
    public fun removeSubnetIds(vararg removeSubnetIds: String) {
        _removeSubnetIds.addAll(listOf(*removeSubnetIds))
    }

    /**
     * The IDs of one or more subnets to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
     *
     * @param removeSubnetIds The IDs of one or more subnets to remove.
     */
    public fun removeSubnetIds(removeSubnetIds: Collection<String>) {
        _removeSubnetIds.addAll(removeSubnetIds)
    }

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
     *
     * @param subnetIds The IDs of the subnets.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
     *
     * @param subnetIds The IDs of the subnets.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * The tags for the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
     *
     * @param tags The tags for the VPC attachment.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
     *
     * @param tags The tags for the VPC attachment.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-transitgatewayid)
     *
     * @param transitGatewayId The ID of the transit gateway.
     */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-vpcid)
     *
     * @param vpcId The ID of the VPC.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnTransitGatewayVpcAttachment {
        if (_addSubnetIds.isNotEmpty()) cdkBuilder.addSubnetIds(_addSubnetIds)
        if (_removeSubnetIds.isNotEmpty()) cdkBuilder.removeSubnetIds(_removeSubnetIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
