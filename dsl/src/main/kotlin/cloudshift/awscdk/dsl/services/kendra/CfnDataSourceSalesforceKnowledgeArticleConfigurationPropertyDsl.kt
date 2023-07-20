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

  public fun customKnowledgeArticleTypeConfigurations(vararg
      customKnowledgeArticleTypeConfigurations: Any) {
    _customKnowledgeArticleTypeConfigurations.addAll(listOf(*customKnowledgeArticleTypeConfigurations))
  }

  public
      fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: Collection<Any>) {
    _customKnowledgeArticleTypeConfigurations.addAll(customKnowledgeArticleTypeConfigurations)
  }

  public
      fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: IResolvable) {
    cdkBuilder.customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations)
  }

  public fun includedStates(vararg includedStates: String) {
    _includedStates.addAll(listOf(*includedStates))
  }

  public fun includedStates(includedStates: Collection<String>) {
    _includedStates.addAll(includedStates)
  }

  public
      fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: IResolvable) {
    cdkBuilder.standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration)
  }

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
