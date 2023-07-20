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
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVpcAttachmentProposedSegmentChangePropertyDsl {
    private val cdkBuilder: CfnVpcAttachment.ProposedSegmentChangeProperty.Builder =
        CfnVpcAttachment.ProposedSegmentChangeProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
        cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
    }

    public fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnVpcAttachment.ProposedSegmentChangeProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
