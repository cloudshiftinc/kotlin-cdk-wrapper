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

package io.cloudshiftdev.awscdkdsl.services.connectcampaigns

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign
import software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps

/**
 * Properties for defining a `CfnCampaign`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
 * .connectInstanceArn("connectInstanceArn")
 * .dialerConfig(DialerConfigProperty.builder()
 * .predictiveDialerConfig(PredictiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .progressiveDialerConfig(ProgressiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .build())
 * .name("name")
 * .outboundCallConfig(OutboundCallConfigProperty.builder()
 * .connectContactFlowArn("connectContactFlowArn")
 * .connectQueueArn("connectQueueArn")
 * // the properties below are optional
 * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
 * .enableAnswerMachineDetection(false)
 * .build())
 * .connectSourcePhoneNumber("connectSourcePhoneNumber")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html)
 */
@CdkDslMarker
public class CfnCampaignPropsDsl {
    private val cdkBuilder: CfnCampaignProps.Builder = CfnCampaignProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param connectInstanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. */
    public fun connectInstanceArn(connectInstanceArn: String) {
        cdkBuilder.connectInstanceArn(connectInstanceArn)
    }

    /** @param dialerConfig Contains information about the dialer configuration. */
    public fun dialerConfig(dialerConfig: IResolvable) {
        cdkBuilder.dialerConfig(dialerConfig)
    }

    /** @param dialerConfig Contains information about the dialer configuration. */
    public fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty) {
        cdkBuilder.dialerConfig(dialerConfig)
    }

    /** @param name The name of the campaign. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param outboundCallConfig Contains information about the outbound call configuration. */
    public fun outboundCallConfig(outboundCallConfig: IResolvable) {
        cdkBuilder.outboundCallConfig(outboundCallConfig)
    }

    /** @param outboundCallConfig Contains information about the outbound call configuration. */
    public fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty) {
        cdkBuilder.outboundCallConfig(outboundCallConfig)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCampaignProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
