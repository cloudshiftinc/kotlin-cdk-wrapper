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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * The storage settings for a private space.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SpaceStorageSettingsProperty spaceStorageSettingsProperty =
 * SpaceStorageSettingsProperty.builder()
 * .ebsStorageSettings(EbsStorageSettingsProperty.builder()
 * .ebsVolumeSizeInGb(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacestoragesettings.html)
 */
@CdkDslMarker
public class CfnSpaceSpaceStorageSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.SpaceStorageSettingsProperty.Builder =
        CfnSpace.SpaceStorageSettingsProperty.builder()

    /** @param ebsStorageSettings A collection of EBS storage settings for a private space. */
    public fun ebsStorageSettings(ebsStorageSettings: IResolvable) {
        cdkBuilder.ebsStorageSettings(ebsStorageSettings)
    }

    /** @param ebsStorageSettings A collection of EBS storage settings for a private space. */
    public fun ebsStorageSettings(ebsStorageSettings: CfnSpace.EbsStorageSettingsProperty) {
        cdkBuilder.ebsStorageSettings(ebsStorageSettings)
    }

    public fun build(): CfnSpace.SpaceStorageSettingsProperty = cdkBuilder.build()
}
