@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.wisdom

import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps
import software.amazon.awscdk.services.wisdom.CfnAssistantProps
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object wisdom {
    public inline fun cfnAssistant(
        scope: Construct,
        id: String,
        block: CfnAssistantDsl.() -> Unit = {},
    ): CfnAssistant {
        val builder = CfnAssistantDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAssistantAssociation(
        scope: Construct,
        id: String,
        block: CfnAssistantAssociationDsl.() -> Unit = {},
    ): CfnAssistantAssociation {
        val builder = CfnAssistantAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAssistantAssociationAssociationDataProperty(
        block: CfnAssistantAssociationAssociationDataPropertyDsl.() -> Unit =
            {},
    ): CfnAssistantAssociation.AssociationDataProperty {
        val builder = CfnAssistantAssociationAssociationDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAssistantAssociationProps(
        block: CfnAssistantAssociationPropsDsl.() -> Unit =
            {},
    ): CfnAssistantAssociationProps {
        val builder = CfnAssistantAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAssistantProps(block: CfnAssistantPropsDsl.() -> Unit = {}): CfnAssistantProps {
        val builder = CfnAssistantPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAssistantServerSideEncryptionConfigurationProperty(
        block: CfnAssistantServerSideEncryptionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnAssistant.ServerSideEncryptionConfigurationProperty {
        val builder = CfnAssistantServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKnowledgeBase(
        scope: Construct,
        id: String,
        block: CfnKnowledgeBaseDsl.() -> Unit = {},
    ): CfnKnowledgeBase {
        val builder = CfnKnowledgeBaseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKnowledgeBaseAppIntegrationsConfigurationProperty(
        block: CfnKnowledgeBaseAppIntegrationsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnKnowledgeBase.AppIntegrationsConfigurationProperty {
        val builder = CfnKnowledgeBaseAppIntegrationsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKnowledgeBaseProps(block: CfnKnowledgeBasePropsDsl.() -> Unit = {}): CfnKnowledgeBaseProps {
        val builder = CfnKnowledgeBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKnowledgeBaseRenderingConfigurationProperty(
        block: CfnKnowledgeBaseRenderingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnKnowledgeBase.RenderingConfigurationProperty {
        val builder = CfnKnowledgeBaseRenderingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKnowledgeBaseServerSideEncryptionConfigurationProperty(
        block: CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty {
        val builder = CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKnowledgeBaseSourceConfigurationProperty(
        block: CfnKnowledgeBaseSourceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnKnowledgeBase.SourceConfigurationProperty {
        val builder = CfnKnowledgeBaseSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
