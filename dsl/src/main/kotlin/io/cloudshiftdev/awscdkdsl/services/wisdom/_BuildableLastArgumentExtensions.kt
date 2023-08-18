@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.wisdom

import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

/** The KMS key used for encryption. */
public inline fun CfnAssistant.setServerSideEncryptionConfiguration(
    block: CfnAssistantServerSideEncryptionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAssistantServerSideEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setServerSideEncryptionConfiguration(builder.build())
}

/** The identifier of the associated resource. */
public inline fun CfnAssistantAssociation.setAssociation(
    block: CfnAssistantAssociationAssociationDataPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAssistantAssociationAssociationDataPropertyDsl()
    builder.apply(block)
    return setAssociation(builder.build())
}

/** Information about how to render the content. */
public inline fun CfnKnowledgeBase.setRenderingConfiguration(
    block: CfnKnowledgeBaseRenderingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnKnowledgeBaseRenderingConfigurationPropertyDsl()
    builder.apply(block)
    return setRenderingConfiguration(builder.build())
}

/** The KMS key used for encryption. */
public inline fun CfnKnowledgeBase.setServerSideEncryptionConfiguration(
    block: CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setServerSideEncryptionConfiguration(builder.build())
}

/** The source of the knowledge base content. */
public inline fun CfnKnowledgeBase.setSourceConfiguration(
    block: CfnKnowledgeBaseSourceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnKnowledgeBaseSourceConfigurationPropertyDsl()
    builder.apply(block)
    return setSourceConfiguration(builder.build())
}
