package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IOptionGroup : IResource {
  public fun addConfiguration(arg0: OptionConfiguration): Boolean

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
  public fun addConfiguration(arg0: OptionConfiguration.Builder.() -> Unit): Boolean

  public fun optionGroupName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IOptionGroup,
  ) : IOptionGroup {
    public override fun addConfiguration(arg0: OptionConfiguration): Boolean =
        unwrap(this).addConfiguration(arg0.let(OptionConfiguration::unwrap))

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
    public override fun addConfiguration(arg0: OptionConfiguration.Builder.() -> Unit): Boolean =
        addConfiguration(OptionConfiguration(arg0))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun optionGroupName(): String = unwrap(this).getOptionGroupName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IOptionGroup): IOptionGroup =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOptionGroup): software.amazon.awscdk.services.rds.IOptionGroup =
        (wrapped as Wrapper).cdkObject
  }
}
