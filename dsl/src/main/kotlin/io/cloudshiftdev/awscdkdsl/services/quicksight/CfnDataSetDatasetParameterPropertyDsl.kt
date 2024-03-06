@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * The parameter declarations of the dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DatasetParameterProperty datasetParameterProperty = DatasetParameterProperty.builder()
 * .dateTimeDatasetParameter(DateTimeDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(DateTimeDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build())
 * .timeGranularity("timeGranularity")
 * .build())
 * .decimalDatasetParameter(DecimalDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(DecimalDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of(123))
 * .build())
 * .build())
 * .integerDatasetParameter(IntegerDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(IntegerDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of(123))
 * .build())
 * .build())
 * .stringDatasetParameter(StringDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(StringDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html)
 */
@CdkDslMarker
public class CfnDataSetDatasetParameterPropertyDsl {
    private val cdkBuilder: CfnDataSet.DatasetParameterProperty.Builder =
        CfnDataSet.DatasetParameterProperty.builder()

    /** @param dateTimeDatasetParameter A date time parameter that is created in the dataset. */
    public fun dateTimeDatasetParameter(dateTimeDatasetParameter: IResolvable) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter)
    }

    /** @param dateTimeDatasetParameter A date time parameter that is created in the dataset. */
    public fun dateTimeDatasetParameter(
        dateTimeDatasetParameter: CfnDataSet.DateTimeDatasetParameterProperty
    ) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter)
    }

    /** @param decimalDatasetParameter A decimal parameter that is created in the dataset. */
    public fun decimalDatasetParameter(decimalDatasetParameter: IResolvable) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter)
    }

    /** @param decimalDatasetParameter A decimal parameter that is created in the dataset. */
    public fun decimalDatasetParameter(
        decimalDatasetParameter: CfnDataSet.DecimalDatasetParameterProperty
    ) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter)
    }

    /** @param integerDatasetParameter An integer parameter that is created in the dataset. */
    public fun integerDatasetParameter(integerDatasetParameter: IResolvable) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter)
    }

    /** @param integerDatasetParameter An integer parameter that is created in the dataset. */
    public fun integerDatasetParameter(
        integerDatasetParameter: CfnDataSet.IntegerDatasetParameterProperty
    ) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter)
    }

    /** @param stringDatasetParameter A string parameter that is created in the dataset. */
    public fun stringDatasetParameter(stringDatasetParameter: IResolvable) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter)
    }

    /** @param stringDatasetParameter A string parameter that is created in the dataset. */
    public fun stringDatasetParameter(
        stringDatasetParameter: CfnDataSet.StringDatasetParameterProperty
    ) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter)
    }

    public fun build(): CfnDataSet.DatasetParameterProperty = cdkBuilder.build()
}
