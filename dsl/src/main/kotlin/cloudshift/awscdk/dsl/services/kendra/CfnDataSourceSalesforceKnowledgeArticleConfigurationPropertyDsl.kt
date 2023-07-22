@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for the knowledge article types that Amazon Kendra
 * indexes.
 *
 * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge articles,
 * or the custom fields of custom knowledge articles, but not both
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * SalesforceKnowledgeArticleConfigurationProperty salesforceKnowledgeArticleConfigurationProperty =
 * SalesforceKnowledgeArticleConfigurationProperty.builder()
 * .includedStates(List.of("includedStates"))
 * // the properties below are optional
 * .customKnowledgeArticleTypeConfigurations(List.of(SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
 * .name("name")
 * // the properties below are optional
 * .documentTitleFieldName("documentTitleFieldName")
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build()))
 * .standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
 * // the properties below are optional
 * .documentTitleFieldName("documentTitleFieldName")
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceSalesforceKnowledgeArticleConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty.Builder =
      CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty.builder()

  private val _customKnowledgeArticleTypeConfigurations: MutableList<Any> = mutableListOf()

  private val _includedStates: MutableList<String> = mutableListOf()

  /**
   * @param customKnowledgeArticleTypeConfigurations Configuration information for custom Salesforce
   * knowledge articles.
   */
  public fun customKnowledgeArticleTypeConfigurations(vararg
      customKnowledgeArticleTypeConfigurations: Any) {
    _customKnowledgeArticleTypeConfigurations.addAll(listOf(*customKnowledgeArticleTypeConfigurations))
  }

  /**
   * @param customKnowledgeArticleTypeConfigurations Configuration information for custom Salesforce
   * knowledge articles.
   */
  public
      fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: Collection<Any>) {
    _customKnowledgeArticleTypeConfigurations.addAll(customKnowledgeArticleTypeConfigurations)
  }

  /**
   * @param customKnowledgeArticleTypeConfigurations Configuration information for custom Salesforce
   * knowledge articles.
   */
  public
      fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: IResolvable) {
    cdkBuilder.customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations)
  }

  /**
   * @param includedStates Specifies the document states that should be included when Amazon Kendra
   * indexes knowledge articles. 
   * You must specify at least one state.
   */
  public fun includedStates(vararg includedStates: String) {
    _includedStates.addAll(listOf(*includedStates))
  }

  /**
   * @param includedStates Specifies the document states that should be included when Amazon Kendra
   * indexes knowledge articles. 
   * You must specify at least one state.
   */
  public fun includedStates(includedStates: Collection<String>) {
    _includedStates.addAll(includedStates)
  }

  /**
   * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
   * Salesforce knowledge articles.
   */
  public
      fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: IResolvable) {
    cdkBuilder.standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration)
  }

  /**
   * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
   * Salesforce knowledge articles.
   */
  public
      fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty) {
    cdkBuilder.standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration)
  }

  public fun build(): CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty {
    if(_customKnowledgeArticleTypeConfigurations.isNotEmpty())
        cdkBuilder.customKnowledgeArticleTypeConfigurations(_customKnowledgeArticleTypeConfigurations)
    if(_includedStates.isNotEmpty()) cdkBuilder.includedStates(_includedStates)
    return cdkBuilder.build()
  }
}
