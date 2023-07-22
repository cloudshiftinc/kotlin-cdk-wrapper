@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionStatisticsResourcePropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.StatisticsResourceProperty.Builder =
      CfnDataQualityJobDefinition.StatisticsResourceProperty.builder()

  /**
   * @param s3Uri The Amazon S3 URI for the statistics resource.
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnDataQualityJobDefinition.StatisticsResourceProperty = cdkBuilder.build()
}
