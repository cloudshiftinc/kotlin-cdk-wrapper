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
 * An integer parameter that is created in the dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * IntegerDatasetParameterProperty integerDatasetParameterProperty =
 * IntegerDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(IntegerDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of(123))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html)
 */
@CdkDslMarker
public class CfnDataSetIntegerDatasetParameterPropertyDsl {
    private val cdkBuilder: CfnDataSet.IntegerDatasetParameterProperty.Builder =
        CfnDataSet.IntegerDatasetParameterProperty.builder()

    /**
     * @param defaultValues A list of default values for a given integer parameter. This structure
     *   only accepts static values.
     */
    public fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues)
    }

    /**
     * @param defaultValues A list of default values for a given integer parameter. This structure
     *   only accepts static values.
     */
    public fun defaultValues(
        defaultValues: CfnDataSet.IntegerDatasetParameterDefaultValuesProperty
    ) {
        cdkBuilder.defaultValues(defaultValues)
    }

    /** @param id An identifier for the integer parameter created in the dataset. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param name The name of the integer parameter that is created in the dataset. */
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

    public fun build(): CfnDataSet.IntegerDatasetParameterProperty = cdkBuilder.build()
}
