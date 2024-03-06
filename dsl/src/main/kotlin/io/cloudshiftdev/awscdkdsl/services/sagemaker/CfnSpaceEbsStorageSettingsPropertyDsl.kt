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
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * A collection of EBS storage settings that applies to private spaces.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * EbsStorageSettingsProperty ebsStorageSettingsProperty = EbsStorageSettingsProperty.builder()
 * .ebsVolumeSizeInGb(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ebsstoragesettings.html)
 */
@CdkDslMarker
public class CfnSpaceEbsStorageSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.EbsStorageSettingsProperty.Builder =
        CfnSpace.EbsStorageSettingsProperty.builder()

    /** @param ebsVolumeSizeInGb The size of an EBS storage volume for a private space. */
    public fun ebsVolumeSizeInGb(ebsVolumeSizeInGb: Number) {
        cdkBuilder.ebsVolumeSizeInGb(ebsVolumeSizeInGb)
    }

    public fun build(): CfnSpace.EbsStorageSettingsProperty = cdkBuilder.build()
}
