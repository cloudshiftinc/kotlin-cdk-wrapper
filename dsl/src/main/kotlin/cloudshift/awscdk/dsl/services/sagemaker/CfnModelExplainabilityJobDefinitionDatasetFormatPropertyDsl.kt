@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionDatasetFormatPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.DatasetFormatProperty.Builder =
      CfnModelExplainabilityJobDefinition.DatasetFormatProperty.builder()

  public fun csv(csv: IResolvable) {
    cdkBuilder.csv(csv)
  }

  public fun csv(csv: CfnModelExplainabilityJobDefinition.CsvProperty) {
    cdkBuilder.csv(csv)
  }

  public fun json(json: IResolvable) {
    cdkBuilder.json(json)
  }

  public fun json(json: CfnModelExplainabilityJobDefinition.JsonProperty) {
    cdkBuilder.json(json)
  }

  public fun parquet(parquet: Boolean) {
    cdkBuilder.parquet(parquet)
  }

  public fun parquet(parquet: IResolvable) {
    cdkBuilder.parquet(parquet)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.DatasetFormatProperty = cdkBuilder.build()
}
