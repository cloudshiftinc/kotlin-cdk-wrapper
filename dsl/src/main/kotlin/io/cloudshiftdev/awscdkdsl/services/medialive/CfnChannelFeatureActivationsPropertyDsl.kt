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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to enable specific features. You can't configure these features until you have enabled
 * them in the channel.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FeatureActivationsProperty featureActivationsProperty = FeatureActivationsProperty.builder()
 * .inputPrepareScheduleActions("inputPrepareScheduleActions")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-featureactivations.html)
 */
@CdkDslMarker
public class CfnChannelFeatureActivationsPropertyDsl {
    private val cdkBuilder: CfnChannel.FeatureActivationsProperty.Builder =
        CfnChannel.FeatureActivationsProperty.builder()

    /**
     * @param inputPrepareScheduleActions Enables the Input Prepare feature. You can create Input
     *   Prepare actions in the schedule only if this feature is enabled. If you disable the feature
     *   on an existing schedule, make sure that you first delete all input prepare actions from the
     *   schedule.
     */
    public fun inputPrepareScheduleActions(inputPrepareScheduleActions: String) {
        cdkBuilder.inputPrepareScheduleActions(inputPrepareScheduleActions)
    }

    public fun build(): CfnChannel.FeatureActivationsProperty = cdkBuilder.build()
}
