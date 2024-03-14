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

public interface IParameterGroup : IResource {
  public fun addParameter(arg0: String, arg1: String): Boolean

  public fun bindToCluster(arg0: ParameterGroupClusterBindOptions): ParameterGroupClusterConfig

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d28cdc7226268867666e1b55a9f41f9760704e0a8aea5aed647fb9bc4accfa14")
  public fun bindToCluster(arg0: ParameterGroupClusterBindOptions.Builder.() -> Unit):
      ParameterGroupClusterConfig

  public fun bindToInstance(arg0: ParameterGroupInstanceBindOptions): ParameterGroupInstanceConfig

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fda7f99b0973a1794d583b4748a0034342e5fc0557269fbcea9db1b8801b312b")
  public fun bindToInstance(arg0: ParameterGroupInstanceBindOptions.Builder.() -> Unit):
      ParameterGroupInstanceConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IParameterGroup,
  ) : IParameterGroup {
    override fun addParameter(arg0: String, arg1: String): Boolean = unwrap(this).addParameter(arg0,
        arg1)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun bindToCluster(arg0: ParameterGroupClusterBindOptions): ParameterGroupClusterConfig
        =
        unwrap(this).bindToCluster(arg0.let(ParameterGroupClusterBindOptions::unwrap)).let(ParameterGroupClusterConfig::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d28cdc7226268867666e1b55a9f41f9760704e0a8aea5aed647fb9bc4accfa14")
    override fun bindToCluster(arg0: ParameterGroupClusterBindOptions.Builder.() -> Unit):
        ParameterGroupClusterConfig = bindToCluster(ParameterGroupClusterBindOptions(arg0))

    override fun bindToInstance(arg0: ParameterGroupInstanceBindOptions):
        ParameterGroupInstanceConfig =
        unwrap(this).bindToInstance(arg0.let(ParameterGroupInstanceBindOptions::unwrap)).let(ParameterGroupInstanceConfig::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fda7f99b0973a1794d583b4748a0034342e5fc0557269fbcea9db1b8801b312b")
    override fun bindToInstance(arg0: ParameterGroupInstanceBindOptions.Builder.() -> Unit):
        ParameterGroupInstanceConfig = bindToInstance(ParameterGroupInstanceBindOptions(arg0))

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IParameterGroup):
        IParameterGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IParameterGroup):
        software.amazon.awscdk.services.rds.IParameterGroup = (wrapped as Wrapper).cdkObject
  }
}
