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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String

@CdkDslMarker
public class CfnDataSetOverrideDatasetParameterOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.OverrideDatasetParameterOperationProperty.Builder =
        CfnDataSet.OverrideDatasetParameterOperationProperty.builder()

    public fun newDefaultValues(newDefaultValues: IResolvable) {
        cdkBuilder.newDefaultValues(newDefaultValues)
    }

    public fun newDefaultValues(newDefaultValues: CfnDataSet.NewDefaultValuesProperty) {
        cdkBuilder.newDefaultValues(newDefaultValues)
    }

    public fun newParameterName(newParameterName: String) {
        cdkBuilder.newParameterName(newParameterName)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun build(): CfnDataSet.OverrideDatasetParameterOperationProperty = cdkBuilder.build()
}
