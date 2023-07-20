@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

public inline
    fun CfnAssistant.setServerSideEncryptionConfiguration(block: CfnAssistantServerSideEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAssistantServerSideEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setServerSideEncryptionConfiguration(builder.build())
}

public inline
    fun CfnKnowledgeBase.setRenderingConfiguration(block: CfnKnowledgeBaseRenderingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnKnowledgeBaseRenderingConfigurationPropertyDsl()
  builder.apply(block)
  return setRenderingConfiguration(builder.build())
}

public inline
    fun CfnKnowledgeBase.setServerSideEncryptionConfiguration(block: CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setServerSideEncryptionConfiguration(builder.build())
}

public inline
    fun CfnKnowledgeBase.setSourceConfiguration(block: CfnKnowledgeBaseSourceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnKnowledgeBaseSourceConfigurationPropertyDsl()
  builder.apply(block)
  return setSourceConfiguration(builder.build())
}

public inline
    fun CfnAssistantAssociation.setAssociation(block: CfnAssistantAssociationAssociationDataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAssistantAssociationAssociationDataPropertyDsl()
  builder.apply(block)
  return setAssociation(builder.build())
}
