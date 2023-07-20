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

@CdkDslMarker
public class CfnDataSetDatasetParameterPropertyDsl {
    private val cdkBuilder: CfnDataSet.DatasetParameterProperty.Builder =
        CfnDataSet.DatasetParameterProperty.builder()

    public fun dateTimeDatasetParameter(dateTimeDatasetParameter: IResolvable) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter)
    }

    public fun dateTimeDatasetParameter(dateTimeDatasetParameter: CfnDataSet.DateTimeDatasetParameterProperty) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter)
    }

    public fun decimalDatasetParameter(decimalDatasetParameter: IResolvable) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter)
    }

    public fun decimalDatasetParameter(decimalDatasetParameter: CfnDataSet.DecimalDatasetParameterProperty) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter)
    }

    public fun integerDatasetParameter(integerDatasetParameter: IResolvable) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter)
    }

    public fun integerDatasetParameter(integerDatasetParameter: CfnDataSet.IntegerDatasetParameterProperty) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter)
    }

    public fun stringDatasetParameter(stringDatasetParameter: IResolvable) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter)
    }

    public fun stringDatasetParameter(stringDatasetParameter: CfnDataSet.StringDatasetParameterProperty) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter)
    }

    public fun build(): CfnDataSet.DatasetParameterProperty = cdkBuilder.build()
}
