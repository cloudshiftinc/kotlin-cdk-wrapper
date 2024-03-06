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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

/**
 * Contains outbound call configuration for an outbound campaign.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * OutboundCallConfigProperty outboundCallConfigProperty = OutboundCallConfigProperty.builder()
 * .connectContactFlowArn("connectContactFlowArn")
 * // the properties below are optional
 * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
 * .enableAnswerMachineDetection(false)
 * .build())
 * .connectQueueArn("connectQueueArn")
 * .connectSourcePhoneNumber("connectSourcePhoneNumber")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html)
 */
@CdkDslMarker
public class CfnCampaignOutboundCallConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.OutboundCallConfigProperty.Builder =
        CfnCampaign.OutboundCallConfigProperty.builder()

    /** @param answerMachineDetectionConfig Whether answering machine detection has been enabled. */
    public fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig)
    }

    /** @param answerMachineDetectionConfig Whether answering machine detection has been enabled. */
    public fun answerMachineDetectionConfig(
        answerMachineDetectionConfig: CfnCampaign.AnswerMachineDetectionConfigProperty
    ) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig)
    }

    /** @param connectContactFlowArn The Amazon Resource Name (ARN) of the flow. */
    public fun connectContactFlowArn(connectContactFlowArn: String) {
        cdkBuilder.connectContactFlowArn(connectContactFlowArn)
    }

    /** @param connectQueueArn The Amazon Resource Name (ARN) of the queue. */
    public fun connectQueueArn(connectQueueArn: String) {
        cdkBuilder.connectQueueArn(connectQueueArn)
    }

    /**
     * @param connectSourcePhoneNumber The phone number associated with the outbound call. This is
     *   the caller ID that is displayed to customers when an agent calls them.
     */
    public fun connectSourcePhoneNumber(connectSourcePhoneNumber: String) {
        cdkBuilder.connectSourcePhoneNumber(connectSourcePhoneNumber)
    }

    public fun build(): CfnCampaign.OutboundCallConfigProperty = cdkBuilder.build()
}
