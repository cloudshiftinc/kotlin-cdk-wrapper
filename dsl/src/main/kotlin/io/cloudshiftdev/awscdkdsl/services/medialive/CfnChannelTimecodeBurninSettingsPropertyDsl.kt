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
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * TimecodeBurninSettingsProperty timecodeBurninSettingsProperty =
 * TimecodeBurninSettingsProperty.builder()
 * .fontSize("fontSize")
 * .position("position")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-timecodeburninsettings.html)
 */
@CdkDslMarker
public class CfnChannelTimecodeBurninSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.TimecodeBurninSettingsProperty.Builder =
        CfnChannel.TimecodeBurninSettingsProperty.builder()

    /** @param fontSize the value to be set. */
    public fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
    }

    /** @param position the value to be set. */
    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    /** @param prefix the value to be set. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnChannel.TimecodeBurninSettingsProperty = cdkBuilder.build()
}
