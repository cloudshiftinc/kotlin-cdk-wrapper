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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * The dataset format of the data to monitor.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DatasetFormatProperty datasetFormatProperty = DatasetFormatProperty.builder()
 * .csv(CsvProperty.builder()
 * .header(false)
 * .build())
 * .json(JsonProperty.builder()
 * .line(false)
 * .build())
 * .parquet(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-datasetformat.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionDatasetFormatPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.DatasetFormatProperty.Builder =
        CfnDataQualityJobDefinition.DatasetFormatProperty.builder()

    /** @param csv The CSV format. */
    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    /** @param csv The CSV format. */
    public fun csv(csv: CfnDataQualityJobDefinition.CsvProperty) {
        cdkBuilder.csv(csv)
    }

    /** @param json The Json format. */
    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    /** @param json The Json format. */
    public fun json(json: CfnDataQualityJobDefinition.JsonProperty) {
        cdkBuilder.json(json)
    }

    /** @param parquet A flag indicate if the dataset format is Parquet. */
    public fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
    }

    /** @param parquet A flag indicate if the dataset format is Parquet. */
    public fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet)
    }

    public fun build(): CfnDataQualityJobDefinition.DatasetFormatProperty = cdkBuilder.build()
}
