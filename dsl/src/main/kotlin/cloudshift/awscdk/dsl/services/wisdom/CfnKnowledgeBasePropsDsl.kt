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

@CdkDslMarker
public class CfnKnowledgeBasePropsDsl {
  private val cdkBuilder: CfnKnowledgeBaseProps.Builder = CfnKnowledgeBaseProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun knowledgeBaseType(knowledgeBaseType: String) {
    cdkBuilder.knowledgeBaseType(knowledgeBaseType)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun renderingConfiguration(renderingConfiguration: IResolvable) {
    cdkBuilder.renderingConfiguration(renderingConfiguration)
  }

  public
      fun renderingConfiguration(renderingConfiguration: CfnKnowledgeBase.RenderingConfigurationProperty) {
    cdkBuilder.renderingConfiguration(renderingConfiguration)
  }

  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public
      fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  public
      fun sourceConfiguration(sourceConfiguration: CfnKnowledgeBase.SourceConfigurationProperty) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnKnowledgeBaseProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
