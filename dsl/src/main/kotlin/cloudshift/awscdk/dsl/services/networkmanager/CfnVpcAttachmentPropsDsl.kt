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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVpcAttachmentPropsDsl {
    private val cdkBuilder: CfnVpcAttachmentProps.Builder = CfnVpcAttachmentProps.builder()

    private val _subnetArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun coreNetworkId(coreNetworkId: String) {
        cdkBuilder.coreNetworkId(coreNetworkId)
    }

    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    public fun options(options: CfnVpcAttachment.VpcOptionsProperty) {
        cdkBuilder.options(options)
    }

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    public fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    public fun subnetArns(vararg subnetArns: String) {
        _subnetArns.addAll(listOf(*subnetArns))
    }

    public fun subnetArns(subnetArns: Collection<String>) {
        _subnetArns.addAll(subnetArns)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpcArn(vpcArn: String) {
        cdkBuilder.vpcArn(vpcArn)
    }

    public fun build(): CfnVpcAttachmentProps {
        if (_subnetArns.isNotEmpty()) cdkBuilder.subnetArns(_subnetArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
