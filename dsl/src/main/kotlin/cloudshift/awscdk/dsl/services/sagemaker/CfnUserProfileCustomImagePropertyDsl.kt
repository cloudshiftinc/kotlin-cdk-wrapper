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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnUserProfileCustomImagePropertyDsl {
    private val cdkBuilder: CfnUserProfile.CustomImageProperty.Builder =
        CfnUserProfile.CustomImageProperty.builder()

    public fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
    }

    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    public fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
    }

    public fun build(): CfnUserProfile.CustomImageProperty = cdkBuilder.build()
}
