@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import kotlin.String

@CdkDslMarker
public class CfnUserProfileRStudioServerProAppSettingsPropertyDsl {
    private val cdkBuilder: CfnUserProfile.RStudioServerProAppSettingsProperty.Builder =
        CfnUserProfile.RStudioServerProAppSettingsProperty.builder()

    public fun accessStatus(accessStatus: String) {
        cdkBuilder.accessStatus(accessStatus)
    }

    public fun userGroup(userGroup: String) {
        cdkBuilder.userGroup(userGroup)
    }

    public fun build(): CfnUserProfile.RStudioServerProAppSettingsProperty = cdkBuilder.build()
}
