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

package cloudshift.awscdk.dsl.services.wisdom

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps
import software.amazon.awscdk.services.wisdom.CfnAssistantProps
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBaseProps
import software.constructs.Construct

public object wisdom {
    /**
     * Specifies an Amazon Connect Wisdom assistant.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * CfnAssistant cfnAssistant = CfnAssistant.Builder.create(this, "MyCfnAssistant")
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html)
     */
    public inline fun cfnAssistant(
        scope: Construct,
        id: String,
        block: CfnAssistantDsl.() -> Unit = {},
    ): CfnAssistant {
        val builder = CfnAssistantDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an association between an Amazon Connect Wisdom assistant and another resource.
     *
     * Currently, the only supported association is with a knowledge base. An assistant can have
     * only a single association.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * CfnAssistantAssociation cfnAssistantAssociation = CfnAssistantAssociation.Builder.create(this,
     * "MyCfnAssistantAssociation")
     * .assistantId("assistantId")
     * .association(AssociationDataProperty.builder()
     * .knowledgeBaseId("knowledgeBaseId")
     * .build())
     * .associationType("associationType")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html)
     */
    public inline fun cfnAssistantAssociation(
        scope: Construct,
        id: String,
        block: CfnAssistantAssociationDsl.() -> Unit = {},
    ): CfnAssistantAssociation {
        val builder = CfnAssistantAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A union type that currently has a single argument, which is the knowledge base ID.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * AssociationDataProperty associationDataProperty = AssociationDataProperty.builder()
     * .knowledgeBaseId("knowledgeBaseId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-assistantassociation-associationdata.html)
     */
    public inline fun cfnAssistantAssociationAssociationDataProperty(
        block: CfnAssistantAssociationAssociationDataPropertyDsl.() -> Unit = {}
    ): CfnAssistantAssociation.AssociationDataProperty {
        val builder = CfnAssistantAssociationAssociationDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAssistantAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * CfnAssistantAssociationProps cfnAssistantAssociationProps =
     * CfnAssistantAssociationProps.builder()
     * .assistantId("assistantId")
     * .association(AssociationDataProperty.builder()
     * .knowledgeBaseId("knowledgeBaseId")
     * .build())
     * .associationType("associationType")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html)
     */
    public inline fun cfnAssistantAssociationProps(
        block: CfnAssistantAssociationPropsDsl.() -> Unit = {}
    ): CfnAssistantAssociationProps {
        val builder = CfnAssistantAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAssistant`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * CfnAssistantProps cfnAssistantProps = CfnAssistantProps.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html)
     */
    public inline fun cfnAssistantProps(
        block: CfnAssistantPropsDsl.() -> Unit = {}
    ): CfnAssistantProps {
        val builder = CfnAssistantPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The KMS key used for encryption.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
     * ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-assistant-serversideencryptionconfiguration.html)
     */
    public inline fun cfnAssistantServerSideEncryptionConfigurationProperty(
        block: CfnAssistantServerSideEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAssistant.ServerSideEncryptionConfigurationProperty {
        val builder = CfnAssistantServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a knowledge base.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * CfnKnowledgeBase cfnKnowledgeBase = CfnKnowledgeBase.Builder.create(this, "MyCfnKnowledgeBase")
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
    public inline fun cfnKnowledgeBase(
        scope: Construct,
        id: String,
        block: CfnKnowledgeBaseDsl.() -> Unit = {},
    ): CfnKnowledgeBase {
        val builder = CfnKnowledgeBaseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for Amazon AppIntegrations to automatically ingest content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * AppIntegrationsConfigurationProperty appIntegrationsConfigurationProperty =
     * AppIntegrationsConfigurationProperty.builder()
     * .appIntegrationArn("appIntegrationArn")
     * // the properties below are optional
     * .objectFields(List.of("objectFields"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-appintegrationsconfiguration.html)
     */
    public inline fun cfnKnowledgeBaseAppIntegrationsConfigurationProperty(
        block: CfnKnowledgeBaseAppIntegrationsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnKnowledgeBase.AppIntegrationsConfigurationProperty {
        val builder = CfnKnowledgeBaseAppIntegrationsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnKnowledgeBase`.
     *
     * Example:
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
    public inline fun cfnKnowledgeBaseProps(
        block: CfnKnowledgeBasePropsDsl.() -> Unit = {}
    ): CfnKnowledgeBaseProps {
        val builder = CfnKnowledgeBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about how to render the content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * RenderingConfigurationProperty renderingConfigurationProperty =
     * RenderingConfigurationProperty.builder()
     * .templateUri("templateUri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-renderingconfiguration.html)
     */
    public inline fun cfnKnowledgeBaseRenderingConfigurationProperty(
        block: CfnKnowledgeBaseRenderingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnKnowledgeBase.RenderingConfigurationProperty {
        val builder = CfnKnowledgeBaseRenderingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The KMS key used for encryption.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
     * ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-serversideencryptionconfiguration.html)
     */
    public inline fun cfnKnowledgeBaseServerSideEncryptionConfigurationProperty(
        block: CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty {
        val builder = CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information about the external data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wisdom.*;
     * SourceConfigurationProperty sourceConfigurationProperty = SourceConfigurationProperty.builder()
     * .appIntegrations(AppIntegrationsConfigurationProperty.builder()
     * .appIntegrationArn("appIntegrationArn")
     * // the properties below are optional
     * .objectFields(List.of("objectFields"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-sourceconfiguration.html)
     */
    public inline fun cfnKnowledgeBaseSourceConfigurationProperty(
        block: CfnKnowledgeBaseSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnKnowledgeBase.SourceConfigurationProperty {
        val builder = CfnKnowledgeBaseSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
