@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceServiceNowConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ServiceNowConfigurationProperty.Builder =
      CfnDataSource.ServiceNowConfigurationProperty.builder()

  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  public fun hostUrl(hostUrl: String) {
    cdkBuilder.hostUrl(hostUrl)
  }

  public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  public
      fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun serviceCatalogConfiguration(serviceCatalogConfiguration: IResolvable) {
    cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration)
  }

  public
      fun serviceCatalogConfiguration(serviceCatalogConfiguration: CfnDataSource.ServiceNowServiceCatalogConfigurationProperty) {
    cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration)
  }

  public fun serviceNowBuildVersion(serviceNowBuildVersion: String) {
    cdkBuilder.serviceNowBuildVersion(serviceNowBuildVersion)
  }

  public fun build(): CfnDataSource.ServiceNowConfigurationProperty = cdkBuilder.build()
}
