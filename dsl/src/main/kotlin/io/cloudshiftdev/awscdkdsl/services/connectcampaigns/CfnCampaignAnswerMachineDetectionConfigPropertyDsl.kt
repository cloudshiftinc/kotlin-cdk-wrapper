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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

/**
 * Contains information about answering machine detection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * AnswerMachineDetectionConfigProperty answerMachineDetectionConfigProperty =
 * AnswerMachineDetectionConfigProperty.builder()
 * .enableAnswerMachineDetection(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-answermachinedetectionconfig.html)
 */
@CdkDslMarker
public class CfnCampaignAnswerMachineDetectionConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.AnswerMachineDetectionConfigProperty.Builder =
        CfnCampaign.AnswerMachineDetectionConfigProperty.builder()

    /** @param enableAnswerMachineDetection Whether answering machine detection is enabled. */
    public fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection)
    }

    /** @param enableAnswerMachineDetection Whether answering machine detection is enabled. */
    public fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection)
    }

    public fun build(): CfnCampaign.AnswerMachineDetectionConfigProperty = cdkBuilder.build()
}
