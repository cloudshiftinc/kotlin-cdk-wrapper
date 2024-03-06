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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps

/**
 * Properties for defining a `CfnVpcAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnVpcAttachmentProps cfnVpcAttachmentProps = CfnVpcAttachmentProps.builder()
 * .coreNetworkId("coreNetworkId")
 * .subnetArns(List.of("subnetArns"))
 * .vpcArn("vpcArn")
 * // the properties below are optional
 * .options(VpcOptionsProperty.builder()
 * .applianceModeSupport(false)
 * .ipv6Support(false)
 * .build())
 * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
 * .attachmentPolicyRuleNumber(123)
 * .segmentName("segmentName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html)
 */
@CdkDslMarker
public class CfnVpcAttachmentPropsDsl {
    private val cdkBuilder: CfnVpcAttachmentProps.Builder = CfnVpcAttachmentProps.builder()

    private val _subnetArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param coreNetworkId The core network ID. */
    public fun coreNetworkId(coreNetworkId: String) {
        cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /** @param options Options for creating the VPC attachment. */
    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    /** @param options Options for creating the VPC attachment. */
    public fun options(options: CfnVpcAttachment.VpcOptionsProperty) {
        cdkBuilder.options(options)
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change. In some cases, the segment
     *   change must first be evaluated and accepted.
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change. In some cases, the segment
     *   change must first be evaluated and accepted.
     */
    public fun proposedSegmentChange(
        proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty
    ) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /** @param subnetArns The subnet ARNs. */
    public fun subnetArns(vararg subnetArns: String) {
        _subnetArns.addAll(listOf(*subnetArns))
    }

    /** @param subnetArns The subnet ARNs. */
    public fun subnetArns(subnetArns: Collection<String>) {
        _subnetArns.addAll(subnetArns)
    }

    /** @param tags The tags associated with the VPC attachment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags associated with the VPC attachment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vpcArn The ARN of the VPC attachment. */
    public fun vpcArn(vpcArn: String) {
        cdkBuilder.vpcArn(vpcArn)
    }

    public fun build(): CfnVpcAttachmentProps {
        if (_subnetArns.isNotEmpty()) cdkBuilder.subnetArns(_subnetArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
