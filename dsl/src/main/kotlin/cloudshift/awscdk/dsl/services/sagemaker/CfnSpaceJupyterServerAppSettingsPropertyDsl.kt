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
import software.amazon.awscdk.services.sagemaker.CfnSpace

@CdkDslMarker
public class CfnSpaceJupyterServerAppSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.JupyterServerAppSettingsProperty.Builder =
        CfnSpace.JupyterServerAppSettingsProperty.builder()

    public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    public fun defaultResourceSpec(defaultResourceSpec: CfnSpace.ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    public fun build(): CfnSpace.JupyterServerAppSettingsProperty = cdkBuilder.build()
}
