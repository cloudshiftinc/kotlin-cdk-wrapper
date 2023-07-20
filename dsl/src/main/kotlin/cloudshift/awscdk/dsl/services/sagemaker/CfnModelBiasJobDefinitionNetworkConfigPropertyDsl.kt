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
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import kotlin.Boolean

@CdkDslMarker
public class CfnModelBiasJobDefinitionNetworkConfigPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.NetworkConfigProperty.Builder =
        CfnModelBiasJobDefinition.NetworkConfigProperty.builder()

    public fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
    }

    public fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
    }

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun vpcConfig(vpcConfig: CfnModelBiasJobDefinition.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnModelBiasJobDefinition.NetworkConfigProperty = cdkBuilder.build()
}
