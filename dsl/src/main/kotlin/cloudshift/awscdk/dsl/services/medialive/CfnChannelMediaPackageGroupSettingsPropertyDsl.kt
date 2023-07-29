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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for the MediaPackage group.
 *
 * The parent of this entity is OutputGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MediaPackageGroupSettingsProperty mediaPackageGroupSettingsProperty =
 * MediaPackageGroupSettingsProperty.builder()
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackagegroupsettings.html)
 */
@CdkDslMarker
public class CfnChannelMediaPackageGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MediaPackageGroupSettingsProperty.Builder =
        CfnChannel.MediaPackageGroupSettingsProperty.builder()

    /** @param destination The MediaPackage channel destination. */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /** @param destination The MediaPackage channel destination. */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    public fun build(): CfnChannel.MediaPackageGroupSettingsProperty = cdkBuilder.build()
}
