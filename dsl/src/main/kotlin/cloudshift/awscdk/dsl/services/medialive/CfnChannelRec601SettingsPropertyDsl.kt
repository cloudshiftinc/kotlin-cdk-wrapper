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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Rec601 Settings.
 *
 * The parents of this entity are H264ColorSpaceSettings and H265ColorSpaceSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Rec601SettingsProperty rec601SettingsProperty = Rec601SettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rec601settings.html)
 */
@CdkDslMarker
public class CfnChannelRec601SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Rec601SettingsProperty.Builder =
        CfnChannel.Rec601SettingsProperty.builder()

    public fun build(): CfnChannel.Rec601SettingsProperty = cdkBuilder.build()
}
