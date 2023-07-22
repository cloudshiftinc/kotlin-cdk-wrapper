@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionDatasetFormatPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.DatasetFormatProperty.Builder =
      CfnModelQualityJobDefinition.DatasetFormatProperty.builder()

  /**
   * @param csv The CSV format.
   */
  public fun csv(csv: IResolvable) {
    cdkBuilder.csv(csv)
  }

  /**
   * @param csv The CSV format.
   */
  public fun csv(csv: CfnModelQualityJobDefinition.CsvProperty) {
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
  public fun json(json: CfnModelQualityJobDefinition.JsonProperty) {
    cdkBuilder.json(json)
  }

  /**
   * @param parquet A flag indicating if the dataset format is Parquet.
   */
  public fun parquet(parquet: Boolean) {
    cdkBuilder.parquet(parquet)
  }

  /**
   * @param parquet A flag indicating if the dataset format is Parquet.
   */
  public fun parquet(parquet: IResolvable) {
    cdkBuilder.parquet(parquet)
  }

  public fun build(): CfnModelQualityJobDefinition.DatasetFormatProperty = cdkBuilder.build()
}
