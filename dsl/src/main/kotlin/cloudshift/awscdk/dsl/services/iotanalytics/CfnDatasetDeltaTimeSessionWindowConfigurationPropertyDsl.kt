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
import kotlin.Number

@CdkDslMarker
public class CfnDatasetDeltaTimeSessionWindowConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.DeltaTimeSessionWindowConfigurationProperty.Builder =
        CfnDataset.DeltaTimeSessionWindowConfigurationProperty.builder()

    public fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): CfnDataset.DeltaTimeSessionWindowConfigurationProperty = cdkBuilder.build()
}
