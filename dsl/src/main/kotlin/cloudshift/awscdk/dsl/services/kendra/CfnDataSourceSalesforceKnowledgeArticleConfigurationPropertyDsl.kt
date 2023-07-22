@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

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
