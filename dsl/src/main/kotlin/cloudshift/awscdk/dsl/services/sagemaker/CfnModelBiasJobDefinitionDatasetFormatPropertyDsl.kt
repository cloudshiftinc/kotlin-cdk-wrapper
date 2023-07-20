@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionDatasetFormatPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.DatasetFormatProperty.Builder =
      CfnModelBiasJobDefinition.DatasetFormatProperty.builder()

  public fun csv(csv: IResolvable) {
    cdkBuilder.csv(csv)
  }

  public fun csv(csv: CfnModelBiasJobDefinition.CsvProperty) {
    cdkBuilder.csv(csv)
  }

  public fun json(json: IResolvable) {
    cdkBuilder.json(json)
  }

  public fun json(json: CfnModelBiasJobDefinition.JsonProperty) {
    cdkBuilder.json(json)
  }

  public fun parquet(parquet: Boolean) {
    cdkBuilder.parquet(parquet)
  }

  public fun parquet(parquet: IResolvable) {
    cdkBuilder.parquet(parquet)
  }

  public fun build(): CfnModelBiasJobDefinition.DatasetFormatProperty = cdkBuilder.build()
}
