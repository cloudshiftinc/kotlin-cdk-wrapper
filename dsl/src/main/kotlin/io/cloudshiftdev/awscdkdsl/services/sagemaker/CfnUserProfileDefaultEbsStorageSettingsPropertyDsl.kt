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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * A collection of default EBS storage settings that applies to private spaces created within a
 * domain or user profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DefaultEbsStorageSettingsProperty defaultEbsStorageSettingsProperty =
 * DefaultEbsStorageSettingsProperty.builder()
 * .defaultEbsVolumeSizeInGb(123)
 * .maximumEbsVolumeSizeInGb(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultebsstoragesettings.html)
 */
@CdkDslMarker
public class CfnUserProfileDefaultEbsStorageSettingsPropertyDsl {
    private val cdkBuilder: CfnUserProfile.DefaultEbsStorageSettingsProperty.Builder =
        CfnUserProfile.DefaultEbsStorageSettingsProperty.builder()

    /**
     * @param defaultEbsVolumeSizeInGb The default size of the EBS storage volume for a private
     *   space.
     */
    public fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number) {
        cdkBuilder.defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb)
    }

    /**
     * @param maximumEbsVolumeSizeInGb The maximum size of the EBS storage volume for a private
     *   space.
     */
    public fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number) {
        cdkBuilder.maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb)
    }

    public fun build(): CfnUserProfile.DefaultEbsStorageSettingsProperty = cdkBuilder.build()
}
