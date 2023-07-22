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

  /**
   * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
   */
  public fun chatterFeedConfiguration(chatterFeedConfiguration: IResolvable) {
    cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration)
  }

  /**
   * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
   */
  public
      fun chatterFeedConfiguration(chatterFeedConfiguration: CfnDataSource.SalesforceChatterFeedConfigurationProperty) {
    cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration)
  }

  /**
   * @param crawlAttachments Indicates whether Amazon Kendra should index attachments to Salesforce
   * objects.
   */
  public fun crawlAttachments(crawlAttachments: Boolean) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  /**
   * @param crawlAttachments Indicates whether Amazon Kendra should index attachments to Salesforce
   * objects.
   */
  public fun crawlAttachments(crawlAttachments: IResolvable) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  /**
   * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude certain
   * documents in your Salesforce.
   * Documents that match the patterns are excluded from the index. Documents that don't match the
   * patterns are included in the index. If a document matches both an inclusion and exclusion pattern,
   * the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the name of the attached file.
   */
  public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String) {
    _excludeAttachmentFilePatterns.addAll(listOf(*excludeAttachmentFilePatterns))
  }

  /**
   * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude certain
   * documents in your Salesforce.
   * Documents that match the patterns are excluded from the index. Documents that don't match the
   * patterns are included in the index. If a document matches both an inclusion and exclusion pattern,
   * the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the name of the attached file.
   */
  public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: Collection<String>) {
    _excludeAttachmentFilePatterns.addAll(excludeAttachmentFilePatterns)
  }

  /**
   * @param includeAttachmentFilePatterns A list of regular expression patterns to include certain
   * documents in your Salesforce.
   * Documents that match the patterns are included in the index. Documents that don't match the
   * patterns are excluded from the index. If a document matches both an inclusion and exclusion
   * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the name of the attached file.
   */
  public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String) {
    _includeAttachmentFilePatterns.addAll(listOf(*includeAttachmentFilePatterns))
  }

  /**
   * @param includeAttachmentFilePatterns A list of regular expression patterns to include certain
   * documents in your Salesforce.
   * Documents that match the patterns are included in the index. Documents that don't match the
   * patterns are excluded from the index. If a document matches both an inclusion and exclusion
   * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
   *
   * The pattern is applied to the name of the attached file.
   */
  public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: Collection<String>) {
    _includeAttachmentFilePatterns.addAll(includeAttachmentFilePatterns)
  }

  /**
   * @param knowledgeArticleConfiguration Configuration information for the knowledge article types
   * that Amazon Kendra indexes.
   * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
   * articles, or the custom fields of custom knowledge articles, but not both.
   */
  public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  /**
   * @param knowledgeArticleConfiguration Configuration information for the knowledge article types
   * that Amazon Kendra indexes.
   * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
   * articles, or the custom fields of custom knowledge articles, but not both.
   */
  public
      fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty) {
    cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration)
  }

  /**
   * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains
   * the key/value pairs required to connect to your Salesforce instance. 
   * The secret must contain a JSON structure with the following keys:
   *
   * * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
   * * consumerKey - The application public key generated when you created your Salesforce
   * application.
   * * consumerSecret - The application private key generated when you created your Salesforce
   * application.
   * * password - The password associated with the user logging in to the Salesforce instance.
   * * securityToken - The token associated with the user logging in to the Salesforce instance.
   * * username - The user name of the user logging in to the Salesforce instance.
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  /**
   * @param serverUrl The instance URL for the Salesforce site that you want to index. 
   */
  public fun serverUrl(serverUrl: String) {
    cdkBuilder.serverUrl(serverUrl)
  }

  /**
   * @param standardObjectAttachmentConfiguration Configuration information for processing
   * attachments to Salesforce standard objects.
   */
  public
      fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: IResolvable) {
    cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration)
  }

  /**
   * @param standardObjectAttachmentConfiguration Configuration information for processing
   * attachments to Salesforce standard objects.
   */
  public
      fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty) {
    cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration)
  }

  /**
   * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
   * Amazon Kendra indexes.
   */
  public fun standardObjectConfigurations(vararg standardObjectConfigurations: Any) {
    _standardObjectConfigurations.addAll(listOf(*standardObjectConfigurations))
  }

  /**
   * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
   * Amazon Kendra indexes.
   */
  public fun standardObjectConfigurations(standardObjectConfigurations: Collection<Any>) {
    _standardObjectConfigurations.addAll(standardObjectConfigurations)
  }

  /**
   * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
   * Amazon Kendra indexes.
   */
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
