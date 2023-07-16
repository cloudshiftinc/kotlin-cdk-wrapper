@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.dsl.services.codepipeline.ActionBindOptionsDsl
import cloudshift.awscdk.dsl.services.events.RulePropsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.ActionConfig
import software.amazon.awscdk.services.codepipeline.IStage
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceAction
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction
import software.amazon.awscdk.services.codepipeline.actions.JenkinsAction
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction
import software.amazon.awscdk.services.codepipeline.actions.S3DeployAction
import software.amazon.awscdk.services.codepipeline.actions.S3SourceAction
import software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.events.Rule
import software.constructs.Construct

public inline fun AlexaSkillDeployAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun AlexaSkillDeployAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline
    fun CloudFormationCreateReplaceChangeSetAction.addToDeploymentRolePolicy(block: PolicyStatementDsl.() -> Unit
    = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToDeploymentRolePolicy(builder.build())
}

public inline fun CloudFormationCreateReplaceChangeSetAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CloudFormationCreateReplaceChangeSetAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline
    fun CloudFormationCreateUpdateStackAction.addToDeploymentRolePolicy(block: PolicyStatementDsl.() -> Unit
    = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToDeploymentRolePolicy(builder.build())
}

public inline fun CloudFormationCreateUpdateStackAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CloudFormationCreateUpdateStackAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline
    fun CloudFormationDeleteStackAction.addToDeploymentRolePolicy(block: PolicyStatementDsl.() -> Unit
    = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToDeploymentRolePolicy(builder.build())
}

public inline fun CloudFormationDeleteStackAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CloudFormationDeleteStackAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CloudFormationDeployStackInstancesAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CloudFormationDeployStackInstancesAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CloudFormationDeployStackSetAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CloudFormationDeployStackSetAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CloudFormationExecuteChangeSetAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CloudFormationExecuteChangeSetAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CodeBuildAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CodeBuildAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CodeCommitSourceAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CodeCommitSourceAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CodeDeployEcsDeployAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CodeDeployEcsDeployAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CodeDeployServerDeployAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CodeDeployServerDeployAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun CodeStarConnectionsSourceAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun CodeStarConnectionsSourceAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun EcrSourceAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun EcrSourceAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun EcsDeployAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun EcsDeployAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun ElasticBeanstalkDeployAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun ElasticBeanstalkDeployAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun GitHubSourceAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun GitHubSourceAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun JenkinsAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun JenkinsAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun LambdaInvokeAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun LambdaInvokeAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun ManualApprovalAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun ManualApprovalAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun S3DeployAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun S3DeployAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun S3SourceAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun S3SourceAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun ServiceCatalogDeployActionBeta1.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun ServiceCatalogDeployActionBeta1.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}

public inline fun StepFunctionInvokeAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun StepFunctionInvokeAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0,arg1,builder.build())
}
