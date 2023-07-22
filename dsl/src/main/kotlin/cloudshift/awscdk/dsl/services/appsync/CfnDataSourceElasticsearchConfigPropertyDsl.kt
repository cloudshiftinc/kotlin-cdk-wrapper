@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceElasticsearchConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.ElasticsearchConfigProperty.Builder =
      CfnDataSource.ElasticsearchConfigProperty.builder()

  /**
   * @param awsRegion The AWS Region. 
   */
  public fun awsRegion(awsRegion: String) {
    cdkBuilder.awsRegion(awsRegion)
  }

  /**
   * @param endpoint The endpoint. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun build(): CfnDataSource.ElasticsearchConfigProperty = cdkBuilder.build()
}
