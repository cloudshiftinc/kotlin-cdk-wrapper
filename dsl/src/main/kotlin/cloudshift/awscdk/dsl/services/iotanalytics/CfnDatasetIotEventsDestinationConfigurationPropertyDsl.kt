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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetIotEventsDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.IotEventsDestinationConfigurationProperty.Builder =
        CfnDataset.IotEventsDestinationConfigurationProperty.builder()

    public fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDataset.IotEventsDestinationConfigurationProperty = cdkBuilder.build()
}
