package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IRule : IResource {
  public fun configRuleName(): String

  public fun onComplianceChange(arg0: String): Rule

  public fun onComplianceChange(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
  public fun onComplianceChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onEvent(arg0: String): Rule

  public fun onEvent(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onReEvaluationStatus(arg0: String): Rule

  public fun onReEvaluationStatus(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
  public fun onReEvaluationStatus(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.config.IRule,
  ) : IRule {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun configRuleName(): String = unwrap(this).getConfigRuleName()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun onComplianceChange(arg0: String): Rule =
        unwrap(this).onComplianceChange(arg0).let(Rule::wrap)

    public override fun onComplianceChange(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onComplianceChange(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b98c84ce198054f102b00e655b85da2a1ae47a5638faf86d850c16a3235acfa2")
    public override fun onComplianceChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit):
        Rule = onComplianceChange(arg0, OnEventOptions(arg1))

    public override fun onEvent(arg0: String): Rule = unwrap(this).onEvent(arg0).let(Rule::wrap)

    public override fun onEvent(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onEvent(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    public override fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(arg0, OnEventOptions(arg1))

    public override fun onReEvaluationStatus(arg0: String): Rule =
        unwrap(this).onReEvaluationStatus(arg0).let(Rule::wrap)

    public override fun onReEvaluationStatus(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onReEvaluationStatus(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5ea19b211eab8ba672d4a05459c322cc41db04f03b5d429124296804b9cc8c7")
    public override fun onReEvaluationStatus(arg0: String, arg1: OnEventOptions.Builder.() -> Unit):
        Rule = onReEvaluationStatus(arg0, OnEventOptions(arg1))

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.IRule): IRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRule): software.amazon.awscdk.services.config.IRule = (wrapped as
        Wrapper).cdkObject
  }
}
