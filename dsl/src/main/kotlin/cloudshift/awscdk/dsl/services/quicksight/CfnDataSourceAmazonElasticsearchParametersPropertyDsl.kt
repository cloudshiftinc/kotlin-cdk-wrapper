@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceAmazonElasticsearchParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.AmazonElasticsearchParametersProperty.Builder =
      CfnDataSource.AmazonElasticsearchParametersProperty.builder()

  /**
   * @param domain The OpenSearch domain. 
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun build(): CfnDataSource.AmazonElasticsearchParametersProperty = cdkBuilder.build()
}
