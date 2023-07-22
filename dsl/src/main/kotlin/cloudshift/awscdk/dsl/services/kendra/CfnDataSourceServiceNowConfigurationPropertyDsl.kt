@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to ServiceNow as your data source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ServiceNowConfigurationProperty serviceNowConfigurationProperty =
 * ServiceNowConfigurationProperty.builder()
 * .hostUrl("hostUrl")
 * .secretArn("secretArn")
 * .serviceNowBuildVersion("serviceNowBuildVersion")
 * // the properties below are optional
 * .authenticationType("authenticationType")
 * .knowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
 * // the properties below are optional
 * .crawlAttachments(false)
 * .documentTitleFieldName("documentTitleFieldName")
 * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .filterQuery("filterQuery")
 * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
 * .build())
 * .serviceCatalogConfiguration(ServiceNowServiceCatalogConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
 * // the properties below are optional
 * .crawlAttachments(false)
 * .documentTitleFieldName("documentTitleFieldName")
 * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceServiceNowConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ServiceNowConfigurationProperty.Builder =
      CfnDataSource.ServiceNowConfigurationProperty.builder()

  /**
   * @param authenticationType The type of authentication used to connect to the ServiceNow
   * instance.
   * If you choose `HTTP_BASIC` , Amazon Kendra is authenticated using the user name and password
   * provided in the AWS Secrets Manager secret in the `SecretArn` field. If you choose `OAUTH2` ,
   * Amazon Kendra is authenticated using the credentials of client ID, client secret, user name and
   * password.
   *
   * When you use `OAUTH2` authentication, you must generate a token and a client secret using the
   * ServiceNow console. For more information, see [Using a ServiceNow data
   * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
   */
  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  /**
   * @param hostUrl The ServiceNow instance that the data source connects to. 
   * The host endpoint should look like the following: *{instance}.service-now.com.*
   */
  public fun hostUrl(hostUrl: String) {
    cdkBuilder.hostUrl(hostUrl)
  }

  /**
   * @param knowledgeArticleConfiguration Configuration information for crawling knowledge articles
   * in the ServiceNow site.
   */
  public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  /**
   * @param knowledgeArticleConfiguration Configuration information for crawling knowledge articles
   * in the ServiceNow site.
   */
  public
      fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  /**
   * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains
   * the user name and password required to connect to the ServiceNow instance. 
   * You can also provide OAuth authentication credentials of user name, password, client ID, and
   * client secret. For more information, see [Using a ServiceNow data
   * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  /**
   * @param serviceCatalogConfiguration Configuration information for crawling service catalogs in
   * the ServiceNow site.
   */
  public fun serviceCatalogConfiguration(serviceCatalogConfiguration: IResolvable) {
    cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration)
  }

  /**
   * @param serviceCatalogConfiguration Configuration information for crawling service catalogs in
   * the ServiceNow site.
   */
  public
      fun serviceCatalogConfiguration(serviceCatalogConfiguration: CfnDataSource.ServiceNowServiceCatalogConfigurationProperty) {
    cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration)
  }

  /**
   * @param serviceNowBuildVersion The identifier of the release that the ServiceNow host is
   * running. 
   * If the host is not running the `LONDON` release, use `OTHERS` .
   */
  public fun serviceNowBuildVersion(serviceNowBuildVersion: String) {
    cdkBuilder.serviceNowBuildVersion(serviceNowBuildVersion)
  }

  public fun build(): CfnDataSource.ServiceNowConfigurationProperty = cdkBuilder.build()
}
