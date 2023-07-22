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

  /**
   * @param csv The CSV format.
   */
  public fun csv(csv: IResolvable) {
    cdkBuilder.csv(csv)
  }

  /**
   * @param csv The CSV format.
   */
  public fun csv(csv: CfnModelBiasJobDefinition.CsvProperty) {
    cdkBuilder.csv(csv)
  }

  /**
   * @param json The Json format.
   */
  public fun json(json: IResolvable) {
    cdkBuilder.json(json)
  }

  /**
   * @param json The Json format.
   */
  public fun json(json: CfnModelBiasJobDefinition.JsonProperty) {
    cdkBuilder.json(json)
  }

  /**
   * @param parquet A flag indicate if the dataset format is Parquet.
   */
  public fun parquet(parquet: Boolean) {
    cdkBuilder.parquet(parquet)
  }

  /**
   * @param parquet A flag indicate if the dataset format is Parquet.
   */
  public fun parquet(parquet: IResolvable) {
    cdkBuilder.parquet(parquet)
  }

  public fun build(): CfnModelBiasJobDefinition.DatasetFormatProperty = cdkBuilder.build()
}
