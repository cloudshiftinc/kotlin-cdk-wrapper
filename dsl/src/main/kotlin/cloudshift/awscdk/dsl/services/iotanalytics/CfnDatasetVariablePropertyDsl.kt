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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDatasetVariablePropertyDsl {
    private val cdkBuilder: CfnDataset.VariableProperty.Builder =
        CfnDataset.VariableProperty.builder()

    public fun datasetContentVersionValue(datasetContentVersionValue: IResolvable) {
        cdkBuilder.datasetContentVersionValue(datasetContentVersionValue)
    }

    public fun datasetContentVersionValue(datasetContentVersionValue: CfnDataset.DatasetContentVersionValueProperty) {
        cdkBuilder.datasetContentVersionValue(datasetContentVersionValue)
    }

    public fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
    }

    public fun outputFileUriValue(outputFileUriValue: IResolvable) {
        cdkBuilder.outputFileUriValue(outputFileUriValue)
    }

    public fun outputFileUriValue(outputFileUriValue: CfnDataset.OutputFileUriValueProperty) {
        cdkBuilder.outputFileUriValue(outputFileUriValue)
    }

    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
    }

    public fun build(): CfnDataset.VariableProperty = cdkBuilder.build()
}
