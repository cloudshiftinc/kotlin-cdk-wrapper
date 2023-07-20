@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceSalesforceConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.SalesforceConfigurationProperty.Builder =
      CfnDataSource.SalesforceConfigurationProperty.builder()

  private val _excludeAttachmentFilePatterns: MutableList<String> = mutableListOf()

  private val _includeAttachmentFilePatterns: MutableList<String> = mutableListOf()

  private val _standardObjectConfigurations: MutableList<Any> = mutableListOf()

  public fun chatterFeedConfiguration(chatterFeedConfiguration: IResolvable) {
    cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration)
  }

  public
      fun chatterFeedConfiguration(chatterFeedConfiguration: CfnDataSource.SalesforceChatterFeedConfigurationProperty) {
    cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration)
  }

  public fun crawlAttachments(crawlAttachments: Boolean) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  public fun crawlAttachments(crawlAttachments: IResolvable) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String) {
    _excludeAttachmentFilePatterns.addAll(listOf(*excludeAttachmentFilePatterns))
  }

  public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: Collection<String>) {
    _excludeAttachmentFilePatterns.addAll(excludeAttachmentFilePatterns)
  }

  public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String) {
    _includeAttachmentFilePatterns.addAll(listOf(*includeAttachmentFilePatterns))
  }

  public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: Collection<String>) {
    _includeAttachmentFilePatterns.addAll(includeAttachmentFilePatterns)
  }

  public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  public
      fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun serverUrl(serverUrl: String) {
    cdkBuilder.serverUrl(serverUrl)
  }

  public
      fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: IResolvable) {
    cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration)
  }

  public
      fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty) {
    cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration)
  }

  public fun standardObjectConfigurations(vararg standardObjectConfigurations: Any) {
    _standardObjectConfigurations.addAll(listOf(*standardObjectConfigurations))
  }

  public fun standardObjectConfigurations(standardObjectConfigurations: Collection<Any>) {
    _standardObjectConfigurations.addAll(standardObjectConfigurations)
  }

  public fun standardObjectConfigurations(standardObjectConfigurations: IResolvable) {
    cdkBuilder.standardObjectConfigurations(standardObjectConfigurations)
  }

  public fun build(): CfnDataSource.SalesforceConfigurationProperty {
    if(_excludeAttachmentFilePatterns.isNotEmpty())
        cdkBuilder.excludeAttachmentFilePatterns(_excludeAttachmentFilePatterns)
    if(_includeAttachmentFilePatterns.isNotEmpty())
        cdkBuilder.includeAttachmentFilePatterns(_includeAttachmentFilePatterns)
    if(_standardObjectConfigurations.isNotEmpty())
        cdkBuilder.standardObjectConfigurations(_standardObjectConfigurations)
    return cdkBuilder.build()
  }
}
