@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

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
  public inline fun actionArtifactBounds(block: ActionArtifactBoundsDsl.() -> Unit = {}):
      ActionArtifactBounds {
    val builder = ActionArtifactBoundsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun actionBindOptions(block: ActionBindOptionsDsl.() -> Unit = {}):
      ActionBindOptions {
    val builder = ActionBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun actionConfig(block: ActionConfigDsl.() -> Unit = {}): ActionConfig {
    val builder = ActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun actionProperties(block: ActionPropertiesDsl.() -> Unit = {}): ActionProperties {
    val builder = ActionPropertiesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomActionType(
    scope: Construct,
    id: String,
    block: CfnCustomActionTypeDsl.() -> Unit = {},
  ): CfnCustomActionType {
    val builder = CfnCustomActionTypeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCustomActionTypeArtifactDetailsProperty(block: CfnCustomActionTypeArtifactDetailsPropertyDsl.() -> Unit
      = {}): CfnCustomActionType.ArtifactDetailsProperty {
    val builder = CfnCustomActionTypeArtifactDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCustomActionTypeConfigurationPropertiesProperty(block: CfnCustomActionTypeConfigurationPropertiesPropertyDsl.() -> Unit
      = {}): CfnCustomActionType.ConfigurationPropertiesProperty {
    val builder = CfnCustomActionTypeConfigurationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomActionTypeProps(block: CfnCustomActionTypePropsDsl.() -> Unit = {}):
      CfnCustomActionTypeProps {
    val builder = CfnCustomActionTypePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCustomActionTypeSettingsProperty(block: CfnCustomActionTypeSettingsPropertyDsl.() -> Unit
      = {}): CfnCustomActionType.SettingsProperty {
    val builder = CfnCustomActionTypeSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipeline(
    scope: Construct,
    id: String,
    block: CfnPipelineDsl.() -> Unit = {},
  ): CfnPipeline {
    val builder = CfnPipelineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineActionDeclarationProperty(block: CfnPipelineActionDeclarationPropertyDsl.() -> Unit
      = {}): CfnPipeline.ActionDeclarationProperty {
    val builder = CfnPipelineActionDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineActionTypeIdProperty(block: CfnPipelineActionTypeIdPropertyDsl.() -> Unit =
      {}): CfnPipeline.ActionTypeIdProperty {
    val builder = CfnPipelineActionTypeIdPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineArtifactStoreMapProperty(block: CfnPipelineArtifactStoreMapPropertyDsl.() -> Unit
      = {}): CfnPipeline.ArtifactStoreMapProperty {
    val builder = CfnPipelineArtifactStoreMapPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineArtifactStoreProperty(block: CfnPipelineArtifactStorePropertyDsl.() -> Unit =
      {}): CfnPipeline.ArtifactStoreProperty {
    val builder = CfnPipelineArtifactStorePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineBlockerDeclarationProperty(block: CfnPipelineBlockerDeclarationPropertyDsl.() -> Unit
      = {}): CfnPipeline.BlockerDeclarationProperty {
    val builder = CfnPipelineBlockerDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineEncryptionKeyProperty(block: CfnPipelineEncryptionKeyPropertyDsl.() -> Unit =
      {}): CfnPipeline.EncryptionKeyProperty {
    val builder = CfnPipelineEncryptionKeyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineInputArtifactProperty(block: CfnPipelineInputArtifactPropertyDsl.() -> Unit =
      {}): CfnPipeline.InputArtifactProperty {
    val builder = CfnPipelineInputArtifactPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineOutputArtifactProperty(block: CfnPipelineOutputArtifactPropertyDsl.() -> Unit =
      {}): CfnPipeline.OutputArtifactProperty {
    val builder = CfnPipelineOutputArtifactPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineProps(block: CfnPipelinePropsDsl.() -> Unit = {}): CfnPipelineProps {
    val builder = CfnPipelinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineStageDeclarationProperty(block: CfnPipelineStageDeclarationPropertyDsl.() -> Unit
      = {}): CfnPipeline.StageDeclarationProperty {
    val builder = CfnPipelineStageDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineStageTransitionProperty(block: CfnPipelineStageTransitionPropertyDsl.() -> Unit
      = {}): CfnPipeline.StageTransitionProperty {
    val builder = CfnPipelineStageTransitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebhook(
    scope: Construct,
    id: String,
    block: CfnWebhookDsl.() -> Unit = {},
  ): CfnWebhook {
    val builder = CfnWebhookDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebhookProps(block: CfnWebhookPropsDsl.() -> Unit = {}): CfnWebhookProps {
    val builder = CfnWebhookPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebhookWebhookAuthConfigurationProperty(block: CfnWebhookWebhookAuthConfigurationPropertyDsl.() -> Unit
      = {}): CfnWebhook.WebhookAuthConfigurationProperty {
    val builder = CfnWebhookWebhookAuthConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWebhookWebhookFilterRuleProperty(block: CfnWebhookWebhookFilterRulePropertyDsl.() -> Unit
      = {}): CfnWebhook.WebhookFilterRuleProperty {
    val builder = CfnWebhookWebhookFilterRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun commonActionProps(block: CommonActionPropsDsl.() -> Unit = {}):
      CommonActionProps {
    val builder = CommonActionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun commonAwsActionProps(block: CommonAwsActionPropsDsl.() -> Unit = {}):
      CommonAwsActionProps {
    val builder = CommonAwsActionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun crossRegionSupport(block: CrossRegionSupportDsl.() -> Unit = {}):
      CrossRegionSupport {
    val builder = CrossRegionSupportDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customActionProperty(block: CustomActionPropertyDsl.() -> Unit = {}):
      CustomActionProperty {
    val builder = CustomActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customActionRegistration(
    scope: Construct,
    id: String,
    block: CustomActionRegistrationDsl.() -> Unit = {},
  ): CustomActionRegistration {
    val builder = CustomActionRegistrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun customActionRegistrationProps(block: CustomActionRegistrationPropsDsl.() -> Unit
      = {}): CustomActionRegistrationProps {
    val builder = CustomActionRegistrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun pipeline(
    scope: Construct,
    id: String,
    block: PipelineDsl.() -> Unit = {},
  ): Pipeline {
    val builder = PipelineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun pipelineNotifyOnOptions(block: PipelineNotifyOnOptionsDsl.() -> Unit = {}):
      PipelineNotifyOnOptions {
    val builder = PipelineNotifyOnOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun pipelineProps(block: PipelinePropsDsl.() -> Unit = {}): PipelineProps {
    val builder = PipelinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stageOptions(block: StageOptionsDsl.() -> Unit = {}): StageOptions {
    val builder = StageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stagePlacement(block: StagePlacementDsl.() -> Unit = {}): StagePlacement {
    val builder = StagePlacementDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stageProps(block: StagePropsDsl.() -> Unit = {}): StageProps {
    val builder = StagePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
