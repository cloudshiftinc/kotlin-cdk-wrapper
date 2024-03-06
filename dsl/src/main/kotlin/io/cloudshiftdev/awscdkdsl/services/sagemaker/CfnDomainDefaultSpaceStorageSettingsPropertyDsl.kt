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
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * The default storage settings for a private space.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DefaultSpaceStorageSettingsProperty defaultSpaceStorageSettingsProperty =
 * DefaultSpaceStorageSettingsProperty.builder()
 * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
 * .defaultEbsVolumeSizeInGb(123)
 * .maximumEbsVolumeSizeInGb(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacestoragesettings.html)
 */
@CdkDslMarker
public class CfnDomainDefaultSpaceStorageSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.DefaultSpaceStorageSettingsProperty.Builder =
        CfnDomain.DefaultSpaceStorageSettingsProperty.builder()

    /** @param defaultEbsStorageSettings The default EBS storage settings for a private space. */
    public fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings)
    }

    /** @param defaultEbsStorageSettings The default EBS storage settings for a private space. */
    public fun defaultEbsStorageSettings(
        defaultEbsStorageSettings: CfnDomain.DefaultEbsStorageSettingsProperty
    ) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings)
    }

    public fun build(): CfnDomain.DefaultSpaceStorageSettingsProperty = cdkBuilder.build()
}
