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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.codestarnotifications.NotificationRuleOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.codebuild.BuildImageConfig
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.IBindableBuildImage
import software.amazon.awscdk.services.codebuild.IBuildImage
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.codebuild.LinuxArmBuildImage
import software.amazon.awscdk.services.codebuild.LinuxBuildImage
import software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.WindowsBuildImage
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.Rule
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public inline fun IBindableBuildImage.bind(
    arg0: Construct,
    arg1: IProject,
    block: BuildImageBindOptionsDsl.() -> Unit = {},
): BuildImageConfig {
    val builder = BuildImageBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, arg1, builder.build())
}

public inline fun Project.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

public inline fun Project.bindToCodePipeline(
    _scope: Construct,
    block: BindToCodePipelineOptionsDsl.() -> Unit = {},
) {
    val builder = BindToCodePipelineOptionsDsl()
    builder.apply(block)
    return bindToCodePipeline(_scope, builder.build())
}

public inline fun Project.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
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
    id: String,
    target: INotificationRuleTarget,
    block: ProjectNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = ProjectNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(id, target, builder.build())
}

public inline fun Project.notifyOnBuildFailed(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildFailed(id, target, builder.build())
}

public inline fun Project.notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildSucceeded(id, target, builder.build())
}

public inline fun Project.onBuildFailed(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildFailed(id, builder.build())
}

public inline fun Project.onBuildStarted(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildStarted(id, builder.build())
}

public inline fun Project.onBuildSucceeded(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildSucceeded(id, builder.build())
}

public inline fun Project.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

public inline fun Project.onPhaseChange(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onPhaseChange(id, builder.build())
}

public inline fun Project.onStateChange(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(id, builder.build())
}

public inline fun IBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

public inline fun CfnProject.setArtifacts(block: CfnProjectArtifactsPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectArtifactsPropertyDsl()
    builder.apply(block)
    return setArtifacts(builder.build())
}

public inline fun CfnProject.setEnvironment(
    block: CfnProjectEnvironmentPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnProjectEnvironmentPropertyDsl()
    builder.apply(block)
    return setEnvironment(builder.build())
}

public inline fun CfnProject.setSource(block: CfnProjectSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectSourcePropertyDsl()
    builder.apply(block)
    return setSource(builder.build())
}

public inline fun CfnProject.setBuildBatchConfig(
    block: CfnProjectProjectBuildBatchConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnProjectProjectBuildBatchConfigPropertyDsl()
    builder.apply(block)
    return setBuildBatchConfig(builder.build())
}

public inline fun CfnProject.setCache(block: CfnProjectProjectCachePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectProjectCachePropertyDsl()
    builder.apply(block)
    return setCache(builder.build())
}

public inline fun CfnProject.setLogsConfig(block: CfnProjectLogsConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectLogsConfigPropertyDsl()
    builder.apply(block)
    return setLogsConfig(builder.build())
}

public inline fun CfnProject.setTriggers(
    block: CfnProjectProjectTriggersPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnProjectProjectTriggersPropertyDsl()
    builder.apply(block)
    return setTriggers(builder.build())
}

public inline fun CfnProject.setVpcConfig(block: CfnProjectVpcConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectVpcConfigPropertyDsl()
    builder.apply(block)
    return setVpcConfig(builder.build())
}

public inline fun LinuxBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

public inline fun CfnReportGroup.setExportConfig(
    block: CfnReportGroupReportExportConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnReportGroupReportExportConfigPropertyDsl()
    builder.apply(block)
    return setExportConfig(builder.build())
}

public inline fun WindowsBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

public inline fun LinuxArmBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

public inline fun IProject.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

public inline fun IProject.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

public inline fun IProject.metricBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricBuilds(builder.build())
}

public inline fun IProject.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDuration(builder.build())
}

public inline fun IProject.metricFailedBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFailedBuilds(builder.build())
}

public inline fun IProject.metricSucceededBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSucceededBuilds(builder.build())
}

public inline fun IProject.notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: ProjectNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = ProjectNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(arg0, arg1, builder.build())
}

public inline fun IProject.notifyOnBuildFailed(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildFailed(arg0, arg1, builder.build())
}

public inline fun IProject.notifyOnBuildSucceeded(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildSucceeded(arg0, arg1, builder.build())
}

public inline fun IProject.onBuildFailed(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildFailed(arg0, builder.build())
}

public inline fun IProject.onBuildStarted(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildStarted(arg0, builder.build())
}

public inline fun IProject.onBuildSucceeded(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildSucceeded(arg0, builder.build())
}

public inline fun IProject.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

public inline fun IProject.onPhaseChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onPhaseChange(arg0, builder.build())
}

public inline fun IProject.onStateChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(arg0, builder.build())
}

public inline fun LinuxGpuBuildImage.bind(
    scope: Construct,
    project: IProject,
    block: BuildImageBindOptionsDsl.() -> Unit = {},
): BuildImageConfig {
    val builder = BuildImageBindOptionsDsl()
    builder.apply(block)
    return bind(scope, project, builder.build())
}

public inline fun LinuxGpuBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}
