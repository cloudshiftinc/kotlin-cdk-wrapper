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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Rec709 Settings.
 *
 * The parents of this entity are H264ColorSpaceSettings and H265ColorSpaceSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Rec709SettingsProperty rec709SettingsProperty = Rec709SettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rec709settings.html)
 */
@CdkDslMarker
public class CfnChannelRec709SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Rec709SettingsProperty.Builder =
        CfnChannel.Rec709SettingsProperty.builder()

    public fun build(): CfnChannel.Rec709SettingsProperty = cdkBuilder.build()
}
