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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeNetworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnPipe.NetworkConfigurationProperty.Builder =
        CfnPipe.NetworkConfigurationProperty.builder()

    public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
    }

    public fun awsvpcConfiguration(awsvpcConfiguration: CfnPipe.AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
    }

    public fun build(): CfnPipe.NetworkConfigurationProperty = cdkBuilder.build()
}
