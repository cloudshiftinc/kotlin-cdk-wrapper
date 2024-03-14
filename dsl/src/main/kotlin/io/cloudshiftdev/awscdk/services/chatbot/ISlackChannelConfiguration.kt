package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ISlackChannelConfiguration : IResource, IGrantable, INotificationRuleTarget {
  public fun addToRolePolicy(arg0: PolicyStatement)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public fun addToRolePolicy(arg0: PolicyStatement.Builder.() -> Unit)

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun slackChannelConfigurationArn(): String

  public fun slackChannelConfigurationName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration,
  ) : ISlackChannelConfiguration {
    public override fun addToRolePolicy(arg0: PolicyStatement) {
      unwrap(this).addToRolePolicy(arg0.let(PolicyStatement::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
    public override fun addToRolePolicy(arg0: PolicyStatement.Builder.() -> Unit): Unit =
        addToRolePolicy(PolicyStatement(arg0))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun bindAsNotificationRuleTarget(arg0: Construct): NotificationRuleTargetConfig
        =
        unwrap(this).bindAsNotificationRuleTarget(arg0.let(Construct::unwrap)).let(NotificationRuleTargetConfig::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    public override fun metric(arg0: String, arg1: MetricOptions): Metric =
        unwrap(this).metric(arg0, arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    public override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric =
        metric(arg0, MetricOptions(arg1))

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    public override fun slackChannelConfigurationArn(): String =
        unwrap(this).getSlackChannelConfigurationArn()

    public override fun slackChannelConfigurationName(): String =
        unwrap(this).getSlackChannelConfigurationName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration):
        ISlackChannelConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISlackChannelConfiguration):
        software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
