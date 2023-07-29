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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * MediaLive will perform a failover if content is not detected in this input for the specified
 * period.
 *
 * The parent of this entity is FailoverConditionSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputLossFailoverSettingsProperty inputLossFailoverSettingsProperty =
 * InputLossFailoverSettingsProperty.builder()
 * .inputLossThresholdMsec(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputlossfailoversettings.html)
 */
@CdkDslMarker
public class CfnChannelInputLossFailoverSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.InputLossFailoverSettingsProperty.Builder =
        CfnChannel.InputLossFailoverSettingsProperty.builder()

    /**
     * @param inputLossThresholdMsec The amount of time (in milliseconds) that no input is detected.
     *   After that time, an input failover will occur.
     */
    public fun inputLossThresholdMsec(inputLossThresholdMsec: Number) {
        cdkBuilder.inputLossThresholdMsec(inputLossThresholdMsec)
    }

    public fun build(): CfnChannel.InputLossFailoverSettingsProperty = cdkBuilder.build()
}
