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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * The collection of ownership settings for a space.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * OwnershipSettingsProperty ownershipSettingsProperty = OwnershipSettingsProperty.builder()
 * .ownerUserProfileName("ownerUserProfileName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ownershipsettings.html)
 */
@CdkDslMarker
public class CfnSpaceOwnershipSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.OwnershipSettingsProperty.Builder =
        CfnSpace.OwnershipSettingsProperty.builder()

    /** @param ownerUserProfileName The user profile who is the owner of the private space. */
    public fun ownerUserProfileName(ownerUserProfileName: String) {
        cdkBuilder.ownerUserProfileName(ownerUserProfileName)
    }

    public fun build(): CfnSpace.OwnershipSettingsProperty = cdkBuilder.build()
}
