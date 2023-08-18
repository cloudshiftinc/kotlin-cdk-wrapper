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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents a single entry in the path parameters of a dataset.
 *
 * Each `PathParameter` consists of a name and a parameter definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * PathParameterProperty pathParameterProperty = PathParameterProperty.builder()
 * .datasetParameter(DatasetParameterProperty.builder()
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
 * .build())
 * .pathParameterName("pathParameterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathparameter.html)
 */
@CdkDslMarker
public class CfnDatasetPathParameterPropertyDsl {
    private val cdkBuilder: CfnDataset.PathParameterProperty.Builder =
        CfnDataset.PathParameterProperty.builder()

    /** @param datasetParameter The path parameter definition. */
    public fun datasetParameter(datasetParameter: IResolvable) {
        cdkBuilder.datasetParameter(datasetParameter)
    }

    /** @param datasetParameter The path parameter definition. */
    public fun datasetParameter(datasetParameter: CfnDataset.DatasetParameterProperty) {
        cdkBuilder.datasetParameter(datasetParameter)
    }

    /** @param pathParameterName The name of the path parameter. */
    public fun pathParameterName(pathParameterName: String) {
        cdkBuilder.pathParameterName(pathParameterName)
    }

    public fun build(): CfnDataset.PathParameterProperty = cdkBuilder.build()
}
