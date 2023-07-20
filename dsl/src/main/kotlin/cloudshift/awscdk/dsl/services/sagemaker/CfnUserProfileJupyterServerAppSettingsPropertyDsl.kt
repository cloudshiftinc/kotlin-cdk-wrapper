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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@CdkDslMarker
public class CfnUserProfileJupyterServerAppSettingsPropertyDsl {
    private val cdkBuilder: CfnUserProfile.JupyterServerAppSettingsProperty.Builder =
        CfnUserProfile.JupyterServerAppSettingsProperty.builder()

    public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    public fun defaultResourceSpec(defaultResourceSpec: CfnUserProfile.ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    public fun build(): CfnUserProfile.JupyterServerAppSettingsProperty = cdkBuilder.build()
}
