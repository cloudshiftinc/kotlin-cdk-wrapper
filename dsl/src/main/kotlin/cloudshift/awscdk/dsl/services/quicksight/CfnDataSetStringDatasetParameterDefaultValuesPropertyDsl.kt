@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * List of default values defined for a given string dataset parameter type.
 *
 * Currently only static values are supported.</p>
 *
 * Example:
 *
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

    /**
     * @param staticValues the value to be set.
     */
    public fun staticValues(vararg staticValues: String) {
        _staticValues.addAll(listOf(*staticValues))
    }

    /**
     * @param staticValues the value to be set.
     */
    public fun staticValues(staticValues: Collection<String>) {
        _staticValues.addAll(staticValues)
    }

    public fun build(): CfnDataSet.StringDatasetParameterDefaultValuesProperty {
        if (_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
        return cdkBuilder.build()
    }
}
