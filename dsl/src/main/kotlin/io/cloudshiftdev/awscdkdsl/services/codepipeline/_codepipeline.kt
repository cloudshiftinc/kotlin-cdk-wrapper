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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.ActionArtifactBounds
import software.amazon.awscdk.services.codepipeline.ActionBindOptions
import software.amazon.awscdk.services.codepipeline.ActionConfig
import software.amazon.awscdk.services.codepipeline.ActionProperties
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.amazon.awscdk.services.codepipeline.CfnPipelineProps
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.amazon.awscdk.services.codepipeline.CfnWebhookProps
import software.amazon.awscdk.services.codepipeline.CommonActionProps
import software.amazon.awscdk.services.codepipeline.CommonAwsActionProps
import software.amazon.awscdk.services.codepipeline.CrossRegionSupport
import software.amazon.awscdk.services.codepipeline.CustomActionProperty
import software.amazon.awscdk.services.codepipeline.CustomActionRegistration
import software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions
import software.amazon.awscdk.services.codepipeline.PipelineProps
import software.amazon.awscdk.services.codepipeline.StageOptions
import software.amazon.awscdk.services.codepipeline.StagePlacement
import software.amazon.awscdk.services.codepipeline.StageProps
import software.constructs.Construct

public object codepipeline {
    /**
     * Specifies the constraints on the number of input and output artifacts an action can have.
     *
     * The constraints for each action type are documented on the
     * [Pipeline Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * page.
     *
     * Example:
     * ```
     * // MyAction is some action type that produces variables, like EcrSourceAction
     * MyAction myAction = new MyAction(new MyActionProps()
     * // ...
     * .actionName("myAction")
     * );
     * new OtherAction(new OtherActionProps()
     * // ...
     * .config(myAction.getVariables().getMyVariable())
     * .actionName("otherAction")
     * );
     * ```
     */
    public inline fun actionArtifactBounds(
        block: ActionArtifactBoundsDsl.() -> Unit = {}
    ): ActionArtifactBounds {
        val builder = ActionArtifactBoundsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * Role role;
     * ActionBindOptions actionBindOptions = ActionBindOptions.builder()
     * .bucket(bucket)
     * .role(role)
     * .build();
     * ```
     */
    public inline fun actionBindOptions(
        block: ActionBindOptionsDsl.() -> Unit = {}
    ): ActionBindOptions {
        val builder = ActionBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * Object configuration;
     * ActionConfig actionConfig = ActionConfig.builder()
     * .configuration(configuration)
     * .build();
     * ```
     */
    public inline fun actionConfig(block: ActionConfigDsl.() -> Unit = {}): ActionConfig {
        val builder = ActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.iam.*;
     * Artifact artifact;
     * Resource resource;
     * Role role;
     * ActionProperties actionProperties = ActionProperties.builder()
     * .actionName("actionName")
     * .artifactBounds(ActionArtifactBounds.builder()
     * .maxInputs(123)
     * .maxOutputs(123)
     * .minInputs(123)
     * .minOutputs(123)
     * .build())
     * .category(ActionCategory.SOURCE)
     * .provider("provider")
     * // the properties below are optional
     * .account("account")
     * .inputs(List.of(artifact))
     * .outputs(List.of(artifact))
     * .owner("owner")
     * .region("region")
     * .resource(resource)
     * .role(role)
     * .runOrder(123)
     * .variablesNamespace("variablesNamespace")
     * .version("version")
     * .build();
     * ```
     */
    public inline fun actionProperties(
        block: ActionPropertiesDsl.() -> Unit = {}
    ): ActionProperties {
        val builder = ActionPropertiesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CodePipeline::CustomActionType` resource creates a custom action for activities
     * that aren't included in the CodePipeline default actions, such as running an internally
     * developed build process or a test suite.
     *
     * You can use these custom actions in the stage of a pipeline. For more information, see
     * [Create and Add a Custom Action in AWS CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * in the *AWS CodePipeline User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * CfnCustomActionType cfnCustomActionType = CfnCustomActionType.Builder.create(this,
     * "MyCfnCustomActionType")
     * .category("category")
     * .inputArtifactDetails(ArtifactDetailsProperty.builder()
     * .maximumCount(123)
     * .minimumCount(123)
     * .build())
     * .outputArtifactDetails(ArtifactDetailsProperty.builder()
     * .maximumCount(123)
     * .minimumCount(123)
     * .build())
     * .provider("provider")
     * .version("version")
     * // the properties below are optional
     * .configurationProperties(List.of(ConfigurationPropertiesProperty.builder()
     * .key(false)
     * .name("name")
     * .required(false)
     * .secret(false)
     * // the properties below are optional
     * .description("description")
     * .queryable(false)
     * .type("type")
     * .build()))
     * .settings(SettingsProperty.builder()
     * .entityUrlTemplate("entityUrlTemplate")
     * .executionUrlTemplate("executionUrlTemplate")
     * .revisionUrlTemplate("revisionUrlTemplate")
     * .thirdPartyConfigurationUrl("thirdPartyConfigurationUrl")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
     */
    public inline fun cfnCustomActionType(
        scope: Construct,
        id: String,
        block: CfnCustomActionTypeDsl.() -> Unit = {},
    ): CfnCustomActionType {
        val builder = CfnCustomActionTypeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Returns information about the details of an artifact.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * ArtifactDetailsProperty artifactDetailsProperty = ArtifactDetailsProperty.builder()
     * .maximumCount(123)
     * .minimumCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html)
     */
    public inline fun cfnCustomActionTypeArtifactDetailsProperty(
        block: CfnCustomActionTypeArtifactDetailsPropertyDsl.() -> Unit = {}
    ): CfnCustomActionType.ArtifactDetailsProperty {
        val builder = CfnCustomActionTypeArtifactDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see
     * [Create a Custom Action for a Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * ConfigurationPropertiesProperty configurationPropertiesProperty =
     * ConfigurationPropertiesProperty.builder()
     * .key(false)
     * .name("name")
     * .required(false)
     * .secret(false)
     * // the properties below are optional
     * .description("description")
     * .queryable(false)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-configurationproperties.html)
     */
    public inline fun cfnCustomActionTypeConfigurationPropertiesProperty(
        block: CfnCustomActionTypeConfigurationPropertiesPropertyDsl.() -> Unit = {}
    ): CfnCustomActionType.ConfigurationPropertiesProperty {
        val builder = CfnCustomActionTypeConfigurationPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCustomActionType`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * CfnCustomActionTypeProps cfnCustomActionTypeProps = CfnCustomActionTypeProps.builder()
     * .category("category")
     * .inputArtifactDetails(ArtifactDetailsProperty.builder()
     * .maximumCount(123)
     * .minimumCount(123)
     * .build())
     * .outputArtifactDetails(ArtifactDetailsProperty.builder()
     * .maximumCount(123)
     * .minimumCount(123)
     * .build())
     * .provider("provider")
     * .version("version")
     * // the properties below are optional
     * .configurationProperties(List.of(ConfigurationPropertiesProperty.builder()
     * .key(false)
     * .name("name")
     * .required(false)
     * .secret(false)
     * // the properties below are optional
     * .description("description")
     * .queryable(false)
     * .type("type")
     * .build()))
     * .settings(SettingsProperty.builder()
     * .entityUrlTemplate("entityUrlTemplate")
     * .executionUrlTemplate("executionUrlTemplate")
     * .revisionUrlTemplate("revisionUrlTemplate")
     * .thirdPartyConfigurationUrl("thirdPartyConfigurationUrl")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
     */
    public inline fun cfnCustomActionTypeProps(
        block: CfnCustomActionTypePropsDsl.() -> Unit = {}
    ): CfnCustomActionTypeProps {
        val builder = CfnCustomActionTypePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Settings` is a property of the `AWS::CodePipeline::CustomActionType` resource that provides
     * URLs that users can access to view information about the CodePipeline custom action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * SettingsProperty settingsProperty = SettingsProperty.builder()
     * .entityUrlTemplate("entityUrlTemplate")
     * .executionUrlTemplate("executionUrlTemplate")
     * .revisionUrlTemplate("revisionUrlTemplate")
     * .thirdPartyConfigurationUrl("thirdPartyConfigurationUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html)
     */
    public inline fun cfnCustomActionTypeSettingsProperty(
        block: CfnCustomActionTypeSettingsPropertyDsl.() -> Unit = {}
    ): CfnCustomActionType.SettingsProperty {
        val builder = CfnCustomActionTypeSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CodePipeline::Pipeline` resource creates a CodePipeline pipeline that describes how
     * software changes go through a release process.
     *
     * For more information, see
     * [What Is CodePipeline?](https://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html)
     * in the *AWS CodePipeline User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * Object configuration;
     * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
     * .roleArn("roleArn")
     * .stages(List.of(StageDeclarationProperty.builder()
     * .actions(List.of(ActionDeclarationProperty.builder()
     * .actionTypeId(ActionTypeIdProperty.builder()
     * .category("category")
     * .owner("owner")
     * .provider("provider")
     * .version("version")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .configuration(configuration)
     * .inputArtifacts(List.of(InputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .namespace("namespace")
     * .outputArtifacts(List.of(OutputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .region("region")
     * .roleArn("roleArn")
     * .runOrder(123)
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .blockers(List.of(BlockerDeclarationProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build()))
     * // the properties below are optional
     * .artifactStore(ArtifactStoreProperty.builder()
     * .location("location")
     * .type("type")
     * // the properties below are optional
     * .encryptionKey(EncryptionKeyProperty.builder()
     * .id("id")
     * .type("type")
     * .build())
     * .build())
     * .artifactStores(List.of(ArtifactStoreMapProperty.builder()
     * .artifactStore(ArtifactStoreProperty.builder()
     * .location("location")
     * .type("type")
     * // the properties below are optional
     * .encryptionKey(EncryptionKeyProperty.builder()
     * .id("id")
     * .type("type")
     * .build())
     * .build())
     * .region("region")
     * .build()))
     * .disableInboundStageTransitions(List.of(StageTransitionProperty.builder()
     * .reason("reason")
     * .stageName("stageName")
     * .build()))
     * .name("name")
     * .restartExecutionOnUpdate(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
     */
    public inline fun cfnPipeline(
        scope: Construct,
        id: String,
        block: CfnPipelineDsl.() -> Unit = {},
    ): CfnPipeline {
        val builder = CfnPipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents information about an action declaration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * Object configuration;
     * ActionDeclarationProperty actionDeclarationProperty = ActionDeclarationProperty.builder()
     * .actionTypeId(ActionTypeIdProperty.builder()
     * .category("category")
     * .owner("owner")
     * .provider("provider")
     * .version("version")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .configuration(configuration)
     * .inputArtifacts(List.of(InputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .namespace("namespace")
     * .outputArtifacts(List.of(OutputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .region("region")
     * .roleArn("roleArn")
     * .runOrder(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html)
     */
    public inline fun cfnPipelineActionDeclarationProperty(
        block: CfnPipelineActionDeclarationPropertyDsl.() -> Unit = {}
    ): CfnPipeline.ActionDeclarationProperty {
        val builder = CfnPipelineActionDeclarationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents information about an action type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * ActionTypeIdProperty actionTypeIdProperty = ActionTypeIdProperty.builder()
     * .category("category")
     * .owner("owner")
     * .provider("provider")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiontypeid.html)
     */
    public inline fun cfnPipelineActionTypeIdProperty(
        block: CfnPipelineActionTypeIdPropertyDsl.() -> Unit = {}
    ): CfnPipeline.ActionTypeIdProperty {
        val builder = CfnPipelineActionTypeIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A mapping of `artifactStore` objects and their corresponding AWS Regions.
     *
     * There must be an artifact store for the pipeline Region and for each cross-region action in
     * the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * ArtifactStoreMapProperty artifactStoreMapProperty = ArtifactStoreMapProperty.builder()
     * .artifactStore(ArtifactStoreProperty.builder()
     * .location("location")
     * .type("type")
     * // the properties below are optional
     * .encryptionKey(EncryptionKeyProperty.builder()
     * .id("id")
     * .type("type")
     * .build())
     * .build())
     * .region("region")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstoremap.html)
     */
    public inline fun cfnPipelineArtifactStoreMapProperty(
        block: CfnPipelineArtifactStoreMapPropertyDsl.() -> Unit = {}
    ): CfnPipeline.ArtifactStoreMapProperty {
        val builder = CfnPipelineArtifactStoreMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * ArtifactStoreProperty artifactStoreProperty = ArtifactStoreProperty.builder()
     * .location("location")
     * .type("type")
     * // the properties below are optional
     * .encryptionKey(EncryptionKeyProperty.builder()
     * .id("id")
     * .type("type")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html)
     */
    public inline fun cfnPipelineArtifactStoreProperty(
        block: CfnPipelineArtifactStorePropertyDsl.() -> Unit = {}
    ): CfnPipeline.ArtifactStoreProperty {
        val builder = CfnPipelineArtifactStorePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reserved for future use.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * BlockerDeclarationProperty blockerDeclarationProperty = BlockerDeclarationProperty.builder()
     * .name("name")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-blockerdeclaration.html)
     */
    public inline fun cfnPipelineBlockerDeclarationProperty(
        block: CfnPipelineBlockerDeclarationPropertyDsl.() -> Unit = {}
    ): CfnPipeline.BlockerDeclarationProperty {
        val builder = CfnPipelineBlockerDeclarationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents information about the key used to encrypt data in the artifact store, such as an
     * AWS Key Management Service ( AWS KMS) key.
     *
     * `EncryptionKey` is a property of the
     * [ArtifactStore](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * EncryptionKeyProperty encryptionKeyProperty = EncryptionKeyProperty.builder()
     * .id("id")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-encryptionkey.html)
     */
    public inline fun cfnPipelineEncryptionKeyProperty(
        block: CfnPipelineEncryptionKeyPropertyDsl.() -> Unit = {}
    ): CfnPipeline.EncryptionKeyProperty {
        val builder = CfnPipelineEncryptionKeyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents information about an artifact to be worked on, such as a test or build artifact.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * InputArtifactProperty inputArtifactProperty = InputArtifactProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-inputartifact.html)
     */
    public inline fun cfnPipelineInputArtifactProperty(
        block: CfnPipelineInputArtifactPropertyDsl.() -> Unit = {}
    ): CfnPipeline.InputArtifactProperty {
        val builder = CfnPipelineInputArtifactPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents information about the output of an action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * OutputArtifactProperty outputArtifactProperty = OutputArtifactProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-outputartifact.html)
     */
    public inline fun cfnPipelineOutputArtifactProperty(
        block: CfnPipelineOutputArtifactPropertyDsl.() -> Unit = {}
    ): CfnPipeline.OutputArtifactProperty {
        val builder = CfnPipelineOutputArtifactPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPipeline`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * Object configuration;
     * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
     * .roleArn("roleArn")
     * .stages(List.of(StageDeclarationProperty.builder()
     * .actions(List.of(ActionDeclarationProperty.builder()
     * .actionTypeId(ActionTypeIdProperty.builder()
     * .category("category")
     * .owner("owner")
     * .provider("provider")
     * .version("version")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .configuration(configuration)
     * .inputArtifacts(List.of(InputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .namespace("namespace")
     * .outputArtifacts(List.of(OutputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .region("region")
     * .roleArn("roleArn")
     * .runOrder(123)
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .blockers(List.of(BlockerDeclarationProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build()))
     * // the properties below are optional
     * .artifactStore(ArtifactStoreProperty.builder()
     * .location("location")
     * .type("type")
     * // the properties below are optional
     * .encryptionKey(EncryptionKeyProperty.builder()
     * .id("id")
     * .type("type")
     * .build())
     * .build())
     * .artifactStores(List.of(ArtifactStoreMapProperty.builder()
     * .artifactStore(ArtifactStoreProperty.builder()
     * .location("location")
     * .type("type")
     * // the properties below are optional
     * .encryptionKey(EncryptionKeyProperty.builder()
     * .id("id")
     * .type("type")
     * .build())
     * .build())
     * .region("region")
     * .build()))
     * .disableInboundStageTransitions(List.of(StageTransitionProperty.builder()
     * .reason("reason")
     * .stageName("stageName")
     * .build()))
     * .name("name")
     * .restartExecutionOnUpdate(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
     */
    public inline fun cfnPipelineProps(
        block: CfnPipelinePropsDsl.() -> Unit = {}
    ): CfnPipelineProps {
        val builder = CfnPipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents information about a stage and its definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * Object configuration;
     * StageDeclarationProperty stageDeclarationProperty = StageDeclarationProperty.builder()
     * .actions(List.of(ActionDeclarationProperty.builder()
     * .actionTypeId(ActionTypeIdProperty.builder()
     * .category("category")
     * .owner("owner")
     * .provider("provider")
     * .version("version")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .configuration(configuration)
     * .inputArtifacts(List.of(InputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .namespace("namespace")
     * .outputArtifacts(List.of(OutputArtifactProperty.builder()
     * .name("name")
     * .build()))
     * .region("region")
     * .roleArn("roleArn")
     * .runOrder(123)
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .blockers(List.of(BlockerDeclarationProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagedeclaration.html)
     */
    public inline fun cfnPipelineStageDeclarationProperty(
        block: CfnPipelineStageDeclarationPropertyDsl.() -> Unit = {}
    ): CfnPipeline.StageDeclarationProperty {
        val builder = CfnPipelineStageDeclarationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The name of the pipeline in which you want to disable the flow of artifacts from one stage to
     * another.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * StageTransitionProperty stageTransitionProperty = StageTransitionProperty.builder()
     * .reason("reason")
     * .stageName("stageName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagetransition.html)
     */
    public inline fun cfnPipelineStageTransitionProperty(
        block: CfnPipelineStageTransitionPropertyDsl.() -> Unit = {}
    ): CfnPipeline.StageTransitionProperty {
        val builder = CfnPipelineStageTransitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CodePipeline::Webhook` resource creates and registers your webhook.
     *
     * After the webhook is created and registered, it triggers your pipeline to start every time an
     * external event occurs. For more information, see
     * [Migrate polling pipelines to use event-based change detection](https://docs.aws.amazon.com/codepipeline/latest/userguide/update-change-detection.html)
     * in the *AWS CodePipeline User Guide* .
     *
     * We strongly recommend that you use AWS Secrets Manager to store your credentials. If you use
     * Secrets Manager, you must have already configured and stored your secret parameters in
     * Secrets Manager. For more information, see
     * [Using Dynamic References to Specify Template Values](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * .
     *
     * When passing secret parameters, do not enter the value directly into the template. The value
     * is rendered as plaintext and is therefore readable. For security reasons, do not use
     * plaintext in your AWS CloudFormation template to store your credentials.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * CfnWebhook cfnWebhook = CfnWebhook.Builder.create(this, "MyCfnWebhook")
     * .authentication("authentication")
     * .authenticationConfiguration(WebhookAuthConfigurationProperty.builder()
     * .allowedIpRange("allowedIpRange")
     * .secretToken("secretToken")
     * .build())
     * .filters(List.of(WebhookFilterRuleProperty.builder()
     * .jsonPath("jsonPath")
     * // the properties below are optional
     * .matchEquals("matchEquals")
     * .build()))
     * .targetAction("targetAction")
     * .targetPipeline("targetPipeline")
     * .targetPipelineVersion(123)
     * // the properties below are optional
     * .name("name")
     * .registerWithThirdParty(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html)
     */
    public inline fun cfnWebhook(
        scope: Construct,
        id: String,
        block: CfnWebhookDsl.() -> Unit = {},
    ): CfnWebhook {
        val builder = CfnWebhookDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWebhook`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * CfnWebhookProps cfnWebhookProps = CfnWebhookProps.builder()
     * .authentication("authentication")
     * .authenticationConfiguration(WebhookAuthConfigurationProperty.builder()
     * .allowedIpRange("allowedIpRange")
     * .secretToken("secretToken")
     * .build())
     * .filters(List.of(WebhookFilterRuleProperty.builder()
     * .jsonPath("jsonPath")
     * // the properties below are optional
     * .matchEquals("matchEquals")
     * .build()))
     * .targetAction("targetAction")
     * .targetPipeline("targetPipeline")
     * .targetPipelineVersion(123)
     * // the properties below are optional
     * .name("name")
     * .registerWithThirdParty(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html)
     */
    public inline fun cfnWebhookProps(block: CfnWebhookPropsDsl.() -> Unit = {}): CfnWebhookProps {
        val builder = CfnWebhookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The authentication applied to incoming webhook trigger requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * WebhookAuthConfigurationProperty webhookAuthConfigurationProperty =
     * WebhookAuthConfigurationProperty.builder()
     * .allowedIpRange("allowedIpRange")
     * .secretToken("secretToken")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html)
     */
    public inline fun cfnWebhookWebhookAuthConfigurationProperty(
        block: CfnWebhookWebhookAuthConfigurationPropertyDsl.() -> Unit = {}
    ): CfnWebhook.WebhookAuthConfigurationProperty {
        val builder = CfnWebhookWebhookAuthConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The event criteria that specify when a webhook notification is sent to your URL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * WebhookFilterRuleProperty webhookFilterRuleProperty = WebhookFilterRuleProperty.builder()
     * .jsonPath("jsonPath")
     * // the properties below are optional
     * .matchEquals("matchEquals")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html)
     */
    public inline fun cfnWebhookWebhookFilterRuleProperty(
        block: CfnWebhookWebhookFilterRulePropertyDsl.() -> Unit = {}
    ): CfnWebhook.WebhookFilterRuleProperty {
        val builder = CfnWebhookWebhookFilterRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common properties shared by all Actions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * CommonActionProps commonActionProps = CommonActionProps.builder()
     * .actionName("actionName")
     * // the properties below are optional
     * .runOrder(123)
     * .variablesNamespace("variablesNamespace")
     * .build();
     * ```
     */
    public inline fun commonActionProps(
        block: CommonActionPropsDsl.() -> Unit = {}
    ): CommonActionProps {
        val builder = CommonActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common properties shared by all Actions whose `ActionProperties.owner` field is 'AWS' (or
     * unset, as 'AWS' is the default).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * CommonAwsActionProps commonAwsActionProps = CommonAwsActionProps.builder()
     * .actionName("actionName")
     * // the properties below are optional
     * .role(role)
     * .runOrder(123)
     * .variablesNamespace("variablesNamespace")
     * .build();
     * ```
     */
    public inline fun commonAwsActionProps(
        block: CommonAwsActionPropsDsl.() -> Unit = {}
    ): CommonAwsActionProps {
        val builder = CommonAwsActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An interface representing resources generated in order to support the cross-region
     * capabilities of CodePipeline.
     *
     * You get instances of this interface from the `Pipeline#crossRegionSupport` property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * Stack stack;
     * CrossRegionSupport crossRegionSupport = CrossRegionSupport.builder()
     * .replicationBucket(bucket)
     * .stack(stack)
     * .build();
     * ```
     */
    public inline fun crossRegionSupport(
        block: CrossRegionSupportDsl.() -> Unit = {}
    ): CrossRegionSupport {
        val builder = CrossRegionSupportDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The creation attributes used for defining a configuration property of a custom Action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * CustomActionProperty customActionProperty = CustomActionProperty.builder()
     * .name("name")
     * .required(false)
     * // the properties below are optional
     * .description("description")
     * .key(false)
     * .queryable(false)
     * .secret(false)
     * .type("type")
     * .build();
     * ```
     */
    public inline fun customActionProperty(
        block: CustomActionPropertyDsl.() -> Unit = {}
    ): CustomActionProperty {
        val builder = CustomActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The resource representing registering a custom Action with CodePipeline.
     *
     * For the Action to be usable, it has to be registered for every region and every account it's
     * used in. In addition to this class, you should most likely also provide your clients a class
     * representing your custom Action, extending the Action class, and taking the
     * `actionProperties` as properly typed, construction properties.
     *
     * Example:
     * ```
     * // Make a custom CodePipeline Action
     * // Make a custom CodePipeline Action
     * CustomActionRegistration.Builder.create(this, "GenericGitSourceProviderResource")
     * .category(ActionCategory.SOURCE)
     * .artifactBounds(ActionArtifactBounds.builder().minInputs(0).maxInputs(0).minOutputs(1).maxOutputs(1).build())
     * .provider("GenericGitSource")
     * .version("1")
     * .entityUrl("https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-create-custom-action.html")
     * .executionUrl("https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-create-custom-action.html")
     * .actionProperties(List.of(CustomActionProperty.builder()
     * .name("Branch")
     * .required(true)
     * .key(false)
     * .secret(false)
     * .queryable(false)
     * .description("Git branch to pull")
     * .type("String")
     * .build(), CustomActionProperty.builder()
     * .name("GitUrl")
     * .required(true)
     * .key(false)
     * .secret(false)
     * .queryable(false)
     * .description("SSH git clone URL")
     * .type("String")
     * .build()))
     * .build();
     * ```
     */
    public inline fun customActionRegistration(
        scope: Construct,
        id: String,
        block: CustomActionRegistrationDsl.() -> Unit = {},
    ): CustomActionRegistration {
        val builder = CustomActionRegistrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of registering a custom Action.
     *
     * Example:
     * ```
     * // Make a custom CodePipeline Action
     * // Make a custom CodePipeline Action
     * CustomActionRegistration.Builder.create(this, "GenericGitSourceProviderResource")
     * .category(ActionCategory.SOURCE)
     * .artifactBounds(ActionArtifactBounds.builder().minInputs(0).maxInputs(0).minOutputs(1).maxOutputs(1).build())
     * .provider("GenericGitSource")
     * .version("1")
     * .entityUrl("https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-create-custom-action.html")
     * .executionUrl("https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-create-custom-action.html")
     * .actionProperties(List.of(CustomActionProperty.builder()
     * .name("Branch")
     * .required(true)
     * .key(false)
     * .secret(false)
     * .queryable(false)
     * .description("Git branch to pull")
     * .type("String")
     * .build(), CustomActionProperty.builder()
     * .name("GitUrl")
     * .required(true)
     * .key(false)
     * .secret(false)
     * .queryable(false)
     * .description("SSH git clone URL")
     * .type("String")
     * .build()))
     * .build();
     * ```
     */
    public inline fun customActionRegistrationProps(
        block: CustomActionRegistrationPropsDsl.() -> Unit = {}
    ): CustomActionRegistrationProps {
        val builder = CustomActionRegistrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS CodePipeline pipeline with its associated IAM role and S3 bucket.
     *
     * Example:
     * ```
     * // create a pipeline
     * import software.amazon.awscdk.services.codecommit.*;
     * // add a source action to the stage
     * Repository repo;
     * Artifact sourceArtifact;
     * Pipeline pipeline = new Pipeline(this, "Pipeline");
     * // add a stage
     * IStage sourceStage = pipeline.addStage(StageOptions.builder().stageName("Source").build());
     * sourceStage.addAction(CodeCommitSourceAction.Builder.create()
     * .actionName("Source")
     * .output(sourceArtifact)
     * .repository(repo)
     * .build());
     * ```
     */
    public inline fun pipeline(
        scope: Construct,
        id: String,
        block: PipelineDsl.() -> Unit = {},
    ): Pipeline {
        val builder = PipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional options to pass to the notification rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.codestarnotifications.*;
     * PipelineNotifyOnOptions pipelineNotifyOnOptions = PipelineNotifyOnOptions.builder()
     * .events(List.of(PipelineNotificationEvents.PIPELINE_EXECUTION_FAILED))
     * // the properties below are optional
     * .detailType(DetailType.BASIC)
     * .enabled(false)
     * .notificationRuleName("notificationRuleName")
     * .build();
     * ```
     */
    public inline fun pipelineNotifyOnOptions(
        block: PipelineNotifyOnOptionsDsl.() -> Unit = {}
    ): PipelineNotifyOnOptions {
        val builder = PipelineNotifyOnOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * PipelineProject project;
     * Repository repository = Repository.Builder.create(this, "MyRepository")
     * .repositoryName("MyRepository")
     * .build();
     * PipelineProject project = new PipelineProject(this, "MyProject");
     * Artifact sourceOutput = new Artifact();
     * CodeCommitSourceAction sourceAction = CodeCommitSourceAction.Builder.create()
     * .actionName("CodeCommit")
     * .repository(repository)
     * .output(sourceOutput)
     * .build();
     * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
     * .actionName("CodeBuild")
     * .project(project)
     * .input(sourceOutput)
     * .outputs(List.of(new Artifact())) // optional
     * .executeBatchBuild(true) // optional, defaults to false
     * .combineBatchBuildArtifacts(true)
     * .build();
     * Pipeline.Builder.create(this, "MyPipeline")
     * .stages(List.of(StageProps.builder()
     * .stageName("Source")
     * .actions(List.of(sourceAction))
     * .build(), StageProps.builder()
     * .stageName("Build")
     * .actions(List.of(buildAction))
     * .build()))
     * .build();
     * ```
     */
    public inline fun pipelineProps(block: PipelinePropsDsl.() -> Unit = {}): PipelineProps {
        val builder = PipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Pass startState = new Pass(this, "StartState");
     * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
     * .definition(startState)
     * .build();
     * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
     * .actionName("Invoke")
     * .stateMachine(simpleStateMachine)
     * .stateMachineInput(StateMachineInput.literal(Map.of("IsHelloWorldExample", true)))
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("StepFunctions")
     * .actions(List.of(stepFunctionAction))
     * .build());
     * ```
     */
    public inline fun stageOptions(block: StageOptionsDsl.() -> Unit = {}): StageOptions {
        val builder = StageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to control where to place a new Stage when it's added to the Pipeline.
     *
     * Note that you can provide only one of the below properties - specifying more than one will
     * result in a validation error.
     *
     * Example:
     * ```
     * // Insert a new Stage at an arbitrary point
     * Pipeline pipeline;
     * IStage anotherStage;
     * IStage yetAnotherStage;
     * IStage someStage = pipeline.addStage(StageOptions.builder()
     * .stageName("SomeStage")
     * .placement(StagePlacement.builder()
     * // note: you can only specify one of the below properties
     * .rightBefore(anotherStage)
     * .justAfter(yetAnotherStage)
     * .build())
     * .build());
     * ```
     *
     * [Documentation]( #justAfter)
     */
    public inline fun stagePlacement(block: StagePlacementDsl.() -> Unit = {}): StagePlacement {
        val builder = StagePlacementDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of a Pipeline Stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.*;
     * Action action;
     * StageProps stageProps = StageProps.builder()
     * .stageName("stageName")
     * // the properties below are optional
     * .actions(List.of(action))
     * .transitionDisabledReason("transitionDisabledReason")
     * .transitionToEnabled(false)
     * .build();
     * ```
     */
    public inline fun stageProps(block: StagePropsDsl.() -> Unit = {}): StageProps {
        val builder = StagePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
