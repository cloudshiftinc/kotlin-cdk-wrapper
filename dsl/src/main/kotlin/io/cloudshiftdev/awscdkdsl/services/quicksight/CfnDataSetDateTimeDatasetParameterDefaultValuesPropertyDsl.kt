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
 * List of default values defined for a given string date time parameter type.
 *
 * Currently only static values are supported.</p>
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimeDatasetParameterDefaultValuesProperty dateTimeDatasetParameterDefaultValuesProperty =
 * DateTimeDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameterdefaultvalues.html)
 */
@CdkDslMarker
public class CfnDataSetDateTimeDatasetParameterDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.Builder =
        CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.builder()

    private val _staticValues: MutableList<String> = mutableListOf()

    /**
     * @param staticValues A list of static default values for a given date time parameter. The
     *   valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
     */
    public fun staticValues(vararg staticValues: String) {
        _staticValues.addAll(listOf(*staticValues))
    }

    /**
     * @param staticValues A list of static default values for a given date time parameter. The
     *   valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
     */
    public fun staticValues(staticValues: Collection<String>) {
        _staticValues.addAll(staticValues)
    }

    public fun build(): CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty {
        if (_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
        return cdkBuilder.build()
    }
}
