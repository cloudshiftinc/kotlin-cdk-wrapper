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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A list of default values for a given string dataset parameter type.
 *
 * This structure only accepts static values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * StringDatasetParameterDefaultValuesProperty stringDatasetParameterDefaultValuesProperty =
 * StringDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameterdefaultvalues.html)
 */
@CdkDslMarker
public class CfnDataSetStringDatasetParameterDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnDataSet.StringDatasetParameterDefaultValuesProperty.Builder =
        CfnDataSet.StringDatasetParameterDefaultValuesProperty.builder()

    private val _staticValues: MutableList<String> = mutableListOf()

    /** @param staticValues A list of static default values for a given string parameter. */
    public fun staticValues(vararg staticValues: String) {
        _staticValues.addAll(listOf(*staticValues))
    }

    /** @param staticValues A list of static default values for a given string parameter. */
    public fun staticValues(staticValues: Collection<String>) {
        _staticValues.addAll(staticValues)
    }

    public fun build(): CfnDataSet.StringDatasetParameterDefaultValuesProperty {
        if (_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
        return cdkBuilder.build()
    }
}
