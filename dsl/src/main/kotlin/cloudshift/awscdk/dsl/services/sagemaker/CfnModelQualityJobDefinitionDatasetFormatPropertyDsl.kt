@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import kotlin.Boolean

@CdkDslMarker
public class CfnModelQualityJobDefinitionDatasetFormatPropertyDsl {
    private val cdkBuilder: CfnModelQualityJobDefinition.DatasetFormatProperty.Builder =
        CfnModelQualityJobDefinition.DatasetFormatProperty.builder()

    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    public fun csv(csv: CfnModelQualityJobDefinition.CsvProperty) {
        cdkBuilder.csv(csv)
    }

    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    public fun json(json: CfnModelQualityJobDefinition.JsonProperty) {
        cdkBuilder.json(json)
    }

    public fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
    }

    public fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet)
    }

    public fun build(): CfnModelQualityJobDefinition.DatasetFormatProperty = cdkBuilder.build()
}
