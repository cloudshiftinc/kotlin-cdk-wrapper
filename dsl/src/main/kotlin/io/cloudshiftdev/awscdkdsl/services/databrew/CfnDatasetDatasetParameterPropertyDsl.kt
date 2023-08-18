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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents a dataset paramater that defines type and conditions for a parameter in the Amazon S3
 * path of the dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * DatasetParameterProperty datasetParameterProperty = DatasetParameterProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .createColumn(false)
 * .datetimeOptions(DatetimeOptionsProperty.builder()
 * .format("format")
 * // the properties below are optional
 * .localeCode("localeCode")
 * .timezoneOffset("timezoneOffset")
 * .build())
 * .filter(FilterExpressionProperty.builder()
 * .expression("expression")
 * .valuesMap(List.of(FilterValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html)
 */
@CdkDslMarker
public class CfnDatasetDatasetParameterPropertyDsl {
    private val cdkBuilder: CfnDataset.DatasetParameterProperty.Builder =
        CfnDataset.DatasetParameterProperty.builder()

    /**
     * @param createColumn Optional boolean value that defines whether the captured value of this
     *   parameter should be loaded as an additional column in the dataset.
     */
    public fun createColumn(createColumn: Boolean) {
        cdkBuilder.createColumn(createColumn)
    }

    /**
     * @param createColumn Optional boolean value that defines whether the captured value of this
     *   parameter should be loaded as an additional column in the dataset.
     */
    public fun createColumn(createColumn: IResolvable) {
        cdkBuilder.createColumn(createColumn)
    }

    /**
     * @param datetimeOptions Additional parameter options such as a format and a timezone. Required
     *   for datetime parameters.
     */
    public fun datetimeOptions(datetimeOptions: IResolvable) {
        cdkBuilder.datetimeOptions(datetimeOptions)
    }

    /**
     * @param datetimeOptions Additional parameter options such as a format and a timezone. Required
     *   for datetime parameters.
     */
    public fun datetimeOptions(datetimeOptions: CfnDataset.DatetimeOptionsProperty) {
        cdkBuilder.datetimeOptions(datetimeOptions)
    }

    /**
     * @param filter The optional filter expression structure to apply additional matching criteria
     *   to the parameter.
     */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param filter The optional filter expression structure to apply additional matching criteria
     *   to the parameter.
     */
    public fun filter(filter: CfnDataset.FilterExpressionProperty) {
        cdkBuilder.filter(filter)
    }

    /** @param name The name of the parameter that is used in the dataset's Amazon S3 path. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param type The type of the dataset parameter, can be one of a 'String', 'Number' or
     *   'Datetime'.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataset.DatasetParameterProperty = cdkBuilder.build()
}
