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
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A list of default values for a given integer parameter.
 *
 * This structure only accepts static values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * IntegerDatasetParameterDefaultValuesProperty integerDatasetParameterDefaultValuesProperty =
 * IntegerDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of(123))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameterdefaultvalues.html)
 */
@CdkDslMarker
public class CfnDataSetIntegerDatasetParameterDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.Builder =
        CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.builder()

    private val _staticValues: MutableList<Number> = mutableListOf()

    /** @param staticValues A list of static default values for a given integer parameter. */
    public fun staticValues(vararg staticValues: Number) {
        _staticValues.addAll(listOf(*staticValues))
    }

    /** @param staticValues A list of static default values for a given integer parameter. */
    public fun staticValues(staticValues: Collection<Number>) {
        _staticValues.addAll(staticValues)
    }

    /** @param staticValues A list of static default values for a given integer parameter. */
    public fun staticValues(staticValues: IResolvable) {
        cdkBuilder.staticValues(staticValues)
    }

    public fun build(): CfnDataSet.IntegerDatasetParameterDefaultValuesProperty {
        if (_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
        return cdkBuilder.build()
    }
}
