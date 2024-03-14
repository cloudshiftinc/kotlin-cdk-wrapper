package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleSource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IPipeline : IResource, INotificationRuleSource {
  public fun notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: PipelineNotifyOnOptions,
  ): INotificationRule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("802e79d0a19fb60a123ba5d2a95f474d31780c23201b1ff29c431fd17d6a7d12")
  public fun notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: PipelineNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnAnyActionStateChange(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnAnyActionStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11ac33b7899456d98c0e8413c5ecfbb4f8332d6e26cd7827148420c235e95215")
  public fun notifyOnAnyActionStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnAnyManualApprovalStateChange(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnAnyManualApprovalStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10713caf6597b23ffa1ea821ac0383066a8adc80d9d8673c7888936bd6188ae9")
  public fun notifyOnAnyManualApprovalStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnAnyStageStateChange(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnAnyStageStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95ca28a7a850434fd61ebbdf04c624d6be0ced4e688a3beab746211fa10c0e4c")
  public fun notifyOnAnyStageStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnExecutionStateChange(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnExecutionStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29f3724b89990617eca228394912da43fc34ad8f0843b7e906964ad64fdd522c")
  public fun notifyOnExecutionStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun onEvent(arg0: String): Rule

  public fun onEvent(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onStateChange(arg0: String): Rule

  public fun onStateChange(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public fun onStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun pipelineArn(): String

  public fun pipelineName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.IPipeline,
  ) : IPipeline {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun bindAsNotificationRuleSource(arg0: Construct): NotificationRuleSourceConfig =
        unwrap(this).bindAsNotificationRuleSource(arg0.let(Construct::unwrap)).let(NotificationRuleSourceConfig::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun notifyOn(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: PipelineNotifyOnOptions,
    ): INotificationRule = unwrap(this).notifyOn(arg0, arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(PipelineNotifyOnOptions::unwrap)).let(INotificationRule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("802e79d0a19fb60a123ba5d2a95f474d31780c23201b1ff29c431fd17d6a7d12")
    override fun notifyOn(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: PipelineNotifyOnOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOn(arg0, arg1, PipelineNotifyOnOptions(arg2))

    override fun notifyOnAnyActionStateChange(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnAnyActionStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnAnyActionStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnAnyActionStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11ac33b7899456d98c0e8413c5ecfbb4f8332d6e26cd7827148420c235e95215")
    override fun notifyOnAnyActionStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnAnyActionStateChange(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnAnyManualApprovalStateChange(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnAnyManualApprovalStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnAnyManualApprovalStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnAnyManualApprovalStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10713caf6597b23ffa1ea821ac0383066a8adc80d9d8673c7888936bd6188ae9")
    override fun notifyOnAnyManualApprovalStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnAnyManualApprovalStateChange(arg0, arg1,
        NotificationRuleOptions(arg2))

    override fun notifyOnAnyStageStateChange(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnAnyStageStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnAnyStageStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnAnyStageStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95ca28a7a850434fd61ebbdf04c624d6be0ced4e688a3beab746211fa10c0e4c")
    override fun notifyOnAnyStageStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnAnyStageStateChange(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnExecutionStateChange(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnExecutionStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnExecutionStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnExecutionStateChange(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29f3724b89990617eca228394912da43fc34ad8f0843b7e906964ad64fdd522c")
    override fun notifyOnExecutionStateChange(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnExecutionStateChange(arg0, arg1, NotificationRuleOptions(arg2))

    override fun onEvent(arg0: String): Rule = unwrap(this).onEvent(arg0).let(Rule::wrap)

    override fun onEvent(arg0: String, arg1: OnEventOptions): Rule = unwrap(this).onEvent(arg0,
        arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    override fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(arg0, OnEventOptions(arg1))

    override fun onStateChange(arg0: String): Rule =
        unwrap(this).onStateChange(arg0).let(Rule::wrap)

    override fun onStateChange(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onStateChange(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
    override fun onStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onStateChange(arg0, OnEventOptions(arg1))

    override fun pipelineArn(): String = unwrap(this).getPipelineArn()

    override fun pipelineName(): String = unwrap(this).getPipelineName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.IPipeline): IPipeline
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPipeline): software.amazon.awscdk.services.codepipeline.IPipeline
        = (wrapped as Wrapper).cdkObject
  }
}
