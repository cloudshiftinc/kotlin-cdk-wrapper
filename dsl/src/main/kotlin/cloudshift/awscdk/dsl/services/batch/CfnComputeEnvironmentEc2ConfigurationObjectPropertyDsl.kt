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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import kotlin.String

@CdkDslMarker
public class CfnComputeEnvironmentEc2ConfigurationObjectPropertyDsl {
    private val cdkBuilder: CfnComputeEnvironment.Ec2ConfigurationObjectProperty.Builder =
        CfnComputeEnvironment.Ec2ConfigurationObjectProperty.builder()

    public fun imageIdOverride(imageIdOverride: String) {
        cdkBuilder.imageIdOverride(imageIdOverride)
    }

    public fun imageKubernetesVersion(imageKubernetesVersion: String) {
        cdkBuilder.imageKubernetesVersion(imageKubernetesVersion)
    }

    public fun imageType(imageType: String) {
        cdkBuilder.imageType(imageType)
    }

    public fun build(): CfnComputeEnvironment.Ec2ConfigurationObjectProperty = cdkBuilder.build()
}
