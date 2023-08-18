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
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * A collection of settings that configure user interaction with the `RStudioServerPro` app.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * RStudioServerProAppSettingsProperty rStudioServerProAppSettingsProperty =
 * RStudioServerProAppSettingsProperty.builder()
 * .accessStatus("accessStatus")
 * .userGroup("userGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-rstudioserverproappsettings.html)
 */
@CdkDslMarker
public class CfnUserProfileRStudioServerProAppSettingsPropertyDsl {
    private val cdkBuilder: CfnUserProfile.RStudioServerProAppSettingsProperty.Builder =
        CfnUserProfile.RStudioServerProAppSettingsProperty.builder()

    /**
     * @param accessStatus Indicates whether the current user has access to the `RStudioServerPro`
     *   app.
     */
    public fun accessStatus(accessStatus: String) {
        cdkBuilder.accessStatus(accessStatus)
    }

    /**
     * @param userGroup The level of permissions that the user has within the `RStudioServerPro`
     *   app. This value defaults to `User`. The `Admin` value allows the user access to the RStudio
     *   Administrative Dashboard.
     */
    public fun userGroup(userGroup: String) {
        cdkBuilder.userGroup(userGroup)
    }

    public fun build(): CfnUserProfile.RStudioServerProAppSettingsProperty = cdkBuilder.build()
}
