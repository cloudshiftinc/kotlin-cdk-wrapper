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
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import kotlin.String

@CdkDslMarker
public class CfnAppImageConfigKernelSpecPropertyDsl {
    private val cdkBuilder: CfnAppImageConfig.KernelSpecProperty.Builder =
        CfnAppImageConfig.KernelSpecProperty.builder()

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAppImageConfig.KernelSpecProperty = cdkBuilder.build()
}
