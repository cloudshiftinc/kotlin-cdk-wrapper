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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetDatasetContentDeliveryRulePropertyDsl {
    private val cdkBuilder: CfnDataset.DatasetContentDeliveryRuleProperty.Builder =
        CfnDataset.DatasetContentDeliveryRuleProperty.builder()

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnDataset.DatasetContentDeliveryRuleDestinationProperty) {
        cdkBuilder.destination(destination)
    }

    public fun entryName(entryName: String) {
        cdkBuilder.entryName(entryName)
    }

    public fun build(): CfnDataset.DatasetContentDeliveryRuleProperty = cdkBuilder.build()
}
