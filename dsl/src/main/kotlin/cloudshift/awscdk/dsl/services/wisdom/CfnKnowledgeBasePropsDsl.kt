@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps

/**
 * Properties for defining a `CfnKnowledgeBase`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * CfnKnowledgeBaseProps cfnKnowledgeBaseProps = CfnKnowledgeBaseProps.builder()
 * .knowledgeBaseType("knowledgeBaseType")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .renderingConfiguration(RenderingConfigurationProperty.builder()
 * .templateUri("templateUri")
 * .build())
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .sourceConfiguration(SourceConfigurationProperty.builder()
 * .appIntegrations(AppIntegrationsConfigurationProperty.builder()
 * .appIntegrationArn("appIntegrationArn")
 * // the properties below are optional
 * .objectFields(List.of("objectFields"))
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-knowledgebase.html)
 */
@CdkDslMarker
public class CfnKnowledgeBasePropsDsl {
  private val cdkBuilder: CfnKnowledgeBaseProps.Builder = CfnKnowledgeBaseProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param knowledgeBaseType The type of knowledge base. 
   * Only CUSTOM knowledge bases allow you to upload your own content. EXTERNAL knowledge bases
   * support integrations with third-party systems whose content is synchronized automatically.
   */
  public fun knowledgeBaseType(knowledgeBaseType: String) {
    cdkBuilder.knowledgeBaseType(knowledgeBaseType)
  }

  /**
   * @param name The name of the knowledge base. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param renderingConfiguration Information about how to render the content.
   */
  public fun renderingConfiguration(renderingConfiguration: IResolvable) {
    cdkBuilder.renderingConfiguration(renderingConfiguration)
  }

  /**
   * @param renderingConfiguration Information about how to render the content.
   */
  public
      fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty) {
    cdkBuilder.renderingConfiguration(renderingConfiguration)
  }

  /**
   * @param serverSideEncryptionConfiguration The KMS key used for encryption.
   */
  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  /**
   * @param serverSideEncryptionConfiguration The KMS key used for encryption.
   */
  public
      fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  /**
   * @param sourceConfiguration The source of the knowledge base content.
   * Only set this argument for EXTERNAL knowledge bases.
   */
  public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  /**
   * @param sourceConfiguration The source of the knowledge base content.
   * Only set this argument for EXTERNAL knowledge bases.
   */
  public
      fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnKnowledgeBaseProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
