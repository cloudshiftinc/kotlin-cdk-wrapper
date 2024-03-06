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
 * A string parameter that is created in the dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * StringDatasetParameterProperty stringDatasetParameterProperty =
 * StringDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(StringDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html)
 */
@CdkDslMarker
public class CfnDataSetStringDatasetParameterPropertyDsl {
    private val cdkBuilder: CfnDataSet.StringDatasetParameterProperty.Builder =
        CfnDataSet.StringDatasetParameterProperty.builder()

    /**
     * @param defaultValues A list of default values for a given string dataset parameter type. This
     *   structure only accepts static values.
     */
    public fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues)
    }

    /**
     * @param defaultValues A list of default values for a given string dataset parameter type. This
     *   structure only accepts static values.
     */
    public fun defaultValues(
        defaultValues: CfnDataSet.StringDatasetParameterDefaultValuesProperty
    ) {
        cdkBuilder.defaultValues(defaultValues)
    }

    /** @param id An identifier for the string parameter that is created in the dataset. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param name The name of the string parameter that is created in the dataset. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param valueType The value type of the dataset parameter. Valid values are `single value` or
     *   `multi value` .
     */
    public fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
    }

    public fun build(): CfnDataSet.StringDatasetParameterProperty = cdkBuilder.build()
}
