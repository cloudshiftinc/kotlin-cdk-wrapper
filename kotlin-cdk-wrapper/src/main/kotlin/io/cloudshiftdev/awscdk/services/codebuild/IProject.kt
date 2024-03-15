@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleSource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IProject : IResource, IGrantable, IConnectable, INotificationRuleSource {
  public fun addToRolePolicy(arg0: PolicyStatement)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public fun addToRolePolicy(arg0: PolicyStatement.Builder.() -> Unit)

  public fun enableBatchBuilds(): BatchBuildConfig?

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricBuilds(): Metric

  public fun metricBuilds(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be10b6ea6c0312aa2056fab98132d61a6bb7f2dc075bb9c159310319b5df338e")
  public fun metricBuilds(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricDuration(): Metric

  public fun metricDuration(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public fun metricDuration(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricFailedBuilds(): Metric

  public fun metricFailedBuilds(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e76329c1f6088e6d3db1035e1618128c61f1efede7ac90f5da71b7dca18bc61d")
  public fun metricFailedBuilds(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSucceededBuilds(): Metric

  public fun metricSucceededBuilds(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9982ac7260f7a0b08fc3b8a431301c15086dcfa3a3f2a592651ec53b4756f34")
  public fun metricSucceededBuilds(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: ProjectNotifyOnOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a64b4355535857ef9549fdd8b1fdd8cf1ffb2fc8fc660b30df90f6f6c101ac2d")
  public fun notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: ProjectNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnBuildFailed(arg0: String, arg1: INotificationRuleTarget): INotificationRule

  public fun notifyOnBuildFailed(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfc453d6402a1247b2eee388a54403513410e804dcd398d8c2b349e3aad48ed0")
  public fun notifyOnBuildFailed(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnBuildSucceeded(arg0: String, arg1: INotificationRuleTarget): INotificationRule

  public fun notifyOnBuildSucceeded(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29432c1bcd6aca19ee5dbbee1f0cf9b75b47bff27ca14f76948d4a6b591c1576")
  public fun notifyOnBuildSucceeded(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun onBuildFailed(arg0: String): Rule

  public fun onBuildFailed(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61bac02e7e7dfb811fb89b743d00a7ce9b4f450f7ba7a759ae905840cae795d8")
  public fun onBuildFailed(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onBuildStarted(arg0: String): Rule

  public fun onBuildStarted(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aa5fd6f3f4fd4c47805120e788079e181682a7808351afdd3a7512094b1f2bca")
  public fun onBuildStarted(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onBuildSucceeded(arg0: String): Rule

  public fun onBuildSucceeded(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd12eb763bd8f9c97276262cd553c838b005c5207d64b8cfc38b391db01daf8f")
  public fun onBuildSucceeded(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onEvent(arg0: String): Rule

  public fun onEvent(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onPhaseChange(arg0: String): Rule

  public fun onPhaseChange(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04a8a72e3fcbce6b30b4b5a2f8593dbdb3bce672a2f8532868248c61c9aa1473")
  public fun onPhaseChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onStateChange(arg0: String): Rule

  public fun onStateChange(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public fun onStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun projectArn(): String

  public fun projectName(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.IProject,
  ) : CdkObject(cdkObject), IProject {
    override fun addToRolePolicy(arg0: PolicyStatement) {
      unwrap(this).addToRolePolicy(arg0.let(PolicyStatement::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
    override fun addToRolePolicy(arg0: PolicyStatement.Builder.() -> Unit): Unit =
        addToRolePolicy(PolicyStatement(arg0))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun bindAsNotificationRuleSource(arg0: Construct): NotificationRuleSourceConfig =
        unwrap(this).bindAsNotificationRuleSource(arg0.let(Construct::unwrap)).let(NotificationRuleSourceConfig::wrap)

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun enableBatchBuilds(): BatchBuildConfig? =
        unwrap(this).enableBatchBuilds()?.let(BatchBuildConfig::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricBuilds(): Metric = unwrap(this).metricBuilds().let(Metric::wrap)

    override fun metricBuilds(arg0: MetricOptions): Metric =
        unwrap(this).metricBuilds(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be10b6ea6c0312aa2056fab98132d61a6bb7f2dc075bb9c159310319b5df338e")
    override fun metricBuilds(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricBuilds(MetricOptions(arg0))

    override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

    override fun metricDuration(arg0: MetricOptions): Metric =
        unwrap(this).metricDuration(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
    override fun metricDuration(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDuration(MetricOptions(arg0))

    override fun metricFailedBuilds(): Metric = unwrap(this).metricFailedBuilds().let(Metric::wrap)

    override fun metricFailedBuilds(arg0: MetricOptions): Metric =
        unwrap(this).metricFailedBuilds(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e76329c1f6088e6d3db1035e1618128c61f1efede7ac90f5da71b7dca18bc61d")
    override fun metricFailedBuilds(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricFailedBuilds(MetricOptions(arg0))

    override fun metricSucceededBuilds(): Metric =
        unwrap(this).metricSucceededBuilds().let(Metric::wrap)

    override fun metricSucceededBuilds(arg0: MetricOptions): Metric =
        unwrap(this).metricSucceededBuilds(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9982ac7260f7a0b08fc3b8a431301c15086dcfa3a3f2a592651ec53b4756f34")
    override fun metricSucceededBuilds(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSucceededBuilds(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun notifyOn(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: ProjectNotifyOnOptions,
    ): INotificationRule = unwrap(this).notifyOn(arg0, arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(ProjectNotifyOnOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a64b4355535857ef9549fdd8b1fdd8cf1ffb2fc8fc660b30df90f6f6c101ac2d")
    override fun notifyOn(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: ProjectNotifyOnOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOn(arg0, arg1, ProjectNotifyOnOptions(arg2))

    override fun notifyOnBuildFailed(arg0: String, arg1: INotificationRuleTarget): INotificationRule
        = unwrap(this).notifyOnBuildFailed(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnBuildFailed(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnBuildFailed(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfc453d6402a1247b2eee388a54403513410e804dcd398d8c2b349e3aad48ed0")
    override fun notifyOnBuildFailed(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnBuildFailed(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnBuildSucceeded(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnBuildSucceeded(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnBuildSucceeded(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnBuildSucceeded(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29432c1bcd6aca19ee5dbbee1f0cf9b75b47bff27ca14f76948d4a6b591c1576")
    override fun notifyOnBuildSucceeded(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnBuildSucceeded(arg0, arg1, NotificationRuleOptions(arg2))

    override fun onBuildFailed(arg0: String): Rule =
        unwrap(this).onBuildFailed(arg0).let(Rule::wrap)

    override fun onBuildFailed(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onBuildFailed(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61bac02e7e7dfb811fb89b743d00a7ce9b4f450f7ba7a759ae905840cae795d8")
    override fun onBuildFailed(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onBuildFailed(arg0, OnEventOptions(arg1))

    override fun onBuildStarted(arg0: String): Rule =
        unwrap(this).onBuildStarted(arg0).let(Rule::wrap)

    override fun onBuildStarted(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onBuildStarted(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa5fd6f3f4fd4c47805120e788079e181682a7808351afdd3a7512094b1f2bca")
    override fun onBuildStarted(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onBuildStarted(arg0, OnEventOptions(arg1))

    override fun onBuildSucceeded(arg0: String): Rule =
        unwrap(this).onBuildSucceeded(arg0).let(Rule::wrap)

    override fun onBuildSucceeded(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onBuildSucceeded(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd12eb763bd8f9c97276262cd553c838b005c5207d64b8cfc38b391db01daf8f")
    override fun onBuildSucceeded(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onBuildSucceeded(arg0, OnEventOptions(arg1))

    override fun onEvent(arg0: String): Rule = unwrap(this).onEvent(arg0).let(Rule::wrap)

    override fun onEvent(arg0: String, arg1: OnEventOptions): Rule = unwrap(this).onEvent(arg0,
        arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    override fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(arg0, OnEventOptions(arg1))

    override fun onPhaseChange(arg0: String): Rule =
        unwrap(this).onPhaseChange(arg0).let(Rule::wrap)

    override fun onPhaseChange(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onPhaseChange(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04a8a72e3fcbce6b30b4b5a2f8593dbdb3bce672a2f8532868248c61c9aa1473")
    override fun onPhaseChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onPhaseChange(arg0, OnEventOptions(arg1))

    override fun onStateChange(arg0: String): Rule =
        unwrap(this).onStateChange(arg0).let(Rule::wrap)

    override fun onStateChange(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onStateChange(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
    override fun onStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onStateChange(arg0, OnEventOptions(arg1))

    override fun projectArn(): String = unwrap(this).getProjectArn()

    override fun projectName(): String = unwrap(this).getProjectName()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IProject): IProject =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IProject): software.amazon.awscdk.services.codebuild.IProject =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IProject
  }
}
