@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.codestarnotifications.NotificationRuleOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.codebuild.BuildImageConfig
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.codebuild.LinuxArmBuildImage
import software.amazon.awscdk.services.codebuild.LinuxBuildImage
import software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.WindowsBuildImage
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.Rule
import software.constructs.Construct

public inline fun CfnProject.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnProject.setArtifacts(block: CfnProjectArtifactsPropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectArtifactsPropertyDsl()
  builder.apply(block)
  return setArtifacts(builder.build())
}

public inline
    fun CfnProject.setBuildBatchConfig(block: CfnProjectProjectBuildBatchConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnProjectProjectBuildBatchConfigPropertyDsl()
  builder.apply(block)
  return setBuildBatchConfig(builder.build())
}

public inline fun CfnProject.setCache(block: CfnProjectProjectCachePropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectProjectCachePropertyDsl()
  builder.apply(block)
  return setCache(builder.build())
}

public inline fun CfnProject.setEnvironment(block: CfnProjectEnvironmentPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnProjectEnvironmentPropertyDsl()
  builder.apply(block)
  return setEnvironment(builder.build())
}

public inline fun CfnProject.setLogsConfig(block: CfnProjectLogsConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectLogsConfigPropertyDsl()
  builder.apply(block)
  return setLogsConfig(builder.build())
}

public inline fun CfnProject.setSource(block: CfnProjectSourcePropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectSourcePropertyDsl()
  builder.apply(block)
  return setSource(builder.build())
}

public inline fun CfnProject.setTriggers(block: CfnProjectProjectTriggersPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnProjectProjectTriggersPropertyDsl()
  builder.apply(block)
  return setTriggers(builder.build())
}

public inline fun CfnProject.setVpcConfig(block: CfnProjectVpcConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnProjectVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline fun CfnReportGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnReportGroup.setExportConfig(block: CfnReportGroupReportExportConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnReportGroupReportExportConfigPropertyDsl()
  builder.apply(block)
  return setExportConfig(builder.build())
}

public inline fun CfnSourceCredential.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun LinuxArmBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}):
    List<String> {
  val builder = BuildEnvironmentDsl()
  builder.apply(block)
  return validate(builder.build())
}

public inline fun LinuxBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}):
    List<String> {
  val builder = BuildEnvironmentDsl()
  builder.apply(block)
  return validate(builder.build())
}

public inline fun LinuxGpuBuildImage.bind(
  arg0: Construct,
  arg1: IProject,
  block: BuildImageBindOptionsDsl.() -> Unit = {},
): BuildImageConfig {
  val builder = BuildImageBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun LinuxGpuBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}):
    List<String> {
  val builder = BuildEnvironmentDsl()
  builder.apply(block)
  return validate(builder.build())
}

public inline fun PipelineProject.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun PipelineProject.bindToCodePipeline(arg0: Construct,
    block: BindToCodePipelineOptionsDsl.() -> Unit = {}) {
  val builder = BindToCodePipelineOptionsDsl()
  builder.apply(block)
  return bindToCodePipeline(arg0,builder.build())
}

public inline fun PipelineProject.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun PipelineProject.metricBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricBuilds(builder.build())
}

public inline fun PipelineProject.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun PipelineProject.metricFailedBuilds(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailedBuilds(builder.build())
}

public inline fun PipelineProject.metricSucceededBuilds(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceededBuilds(builder.build())
}

public inline fun PipelineProject.notifyOn(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: ProjectNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = ProjectNotifyOnOptionsDsl()
  builder.apply(block)
  return notifyOn(arg0,arg1,builder.build())
}

public inline fun PipelineProject.notifyOnBuildFailed(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnBuildFailed(arg0,arg1,builder.build())
}

public inline fun PipelineProject.notifyOnBuildSucceeded(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnBuildSucceeded(arg0,arg1,builder.build())
}

public inline fun PipelineProject.onBuildFailed(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onBuildFailed(arg0,builder.build())
}

public inline fun PipelineProject.onBuildStarted(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onBuildStarted(arg0,builder.build())
}

public inline fun PipelineProject.onBuildSucceeded(arg0: String, block: OnEventOptionsDsl.() -> Unit
    = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onBuildSucceeded(arg0,builder.build())
}

public inline fun PipelineProject.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun PipelineProject.onPhaseChange(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onPhaseChange(arg0,builder.build())
}

public inline fun PipelineProject.onStateChange(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onStateChange(arg0,builder.build())
}

public inline fun Project.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun Project.bindToCodePipeline(arg0: Construct,
    block: BindToCodePipelineOptionsDsl.() -> Unit = {}) {
  val builder = BindToCodePipelineOptionsDsl()
  builder.apply(block)
  return bindToCodePipeline(arg0,builder.build())
}

public inline fun Project.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun Project.metricBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricBuilds(builder.build())
}

public inline fun Project.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun Project.metricFailedBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFailedBuilds(builder.build())
}

public inline fun Project.metricSucceededBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSucceededBuilds(builder.build())
}

public inline fun Project.notifyOn(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: ProjectNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = ProjectNotifyOnOptionsDsl()
  builder.apply(block)
  return notifyOn(arg0,arg1,builder.build())
}

public inline fun Project.notifyOnBuildFailed(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnBuildFailed(arg0,arg1,builder.build())
}

public inline fun Project.notifyOnBuildSucceeded(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnBuildSucceeded(arg0,arg1,builder.build())
}

public inline fun Project.onBuildFailed(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onBuildFailed(arg0,builder.build())
}

public inline fun Project.onBuildStarted(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onBuildStarted(arg0,builder.build())
}

public inline fun Project.onBuildSucceeded(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onBuildSucceeded(arg0,builder.build())
}

public inline fun Project.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun Project.onPhaseChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onPhaseChange(arg0,builder.build())
}

public inline fun Project.onStateChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onStateChange(arg0,builder.build())
}

public inline fun WindowsBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}):
    List<String> {
  val builder = BuildEnvironmentDsl()
  builder.apply(block)
  return validate(builder.build())
}
