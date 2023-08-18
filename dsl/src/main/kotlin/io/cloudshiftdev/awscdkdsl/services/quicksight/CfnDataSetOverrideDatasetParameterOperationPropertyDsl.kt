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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A transform operation that overrides the dataset parameter values defined in another
 * dataset.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * OverrideDatasetParameterOperationProperty overrideDatasetParameterOperationProperty =
 * OverrideDatasetParameterOperationProperty.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .newDefaultValues(NewDefaultValuesProperty.builder()
 * .dateTimeStaticValues(List.of("dateTimeStaticValues"))
 * .decimalStaticValues(List.of(123))
 * .integerStaticValues(List.of(123))
 * .stringStaticValues(List.of("stringStaticValues"))
 * .build())
 * .newParameterName("newParameterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html)
 */
@CdkDslMarker
public class CfnDataSetOverrideDatasetParameterOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.OverrideDatasetParameterOperationProperty.Builder =
        CfnDataSet.OverrideDatasetParameterOperationProperty.builder()

    /** @param newDefaultValues the value to be set. */
    public fun newDefaultValues(newDefaultValues: IResolvable) {
        cdkBuilder.newDefaultValues(newDefaultValues)
    }

    /** @param newDefaultValues the value to be set. */
    public fun newDefaultValues(newDefaultValues: CfnDataSet.NewDefaultValuesProperty) {
        cdkBuilder.newDefaultValues(newDefaultValues)
    }

    /** @param newParameterName Name of the parameter created in the dataset.</p>. */
    public fun newParameterName(newParameterName: String) {
        cdkBuilder.newParameterName(newParameterName)
    }

    /** @param parameterName Name of the parameter created in the dataset.</p>. */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun build(): CfnDataSet.OverrideDatasetParameterOperationProperty = cdkBuilder.build()
}
