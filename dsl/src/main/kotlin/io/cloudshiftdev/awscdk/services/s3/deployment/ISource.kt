package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ISource {
  public fun bind(arg0: Construct): SourceConfig

  public fun bind(arg0: Construct, arg1: DeploymentSourceContext): SourceConfig

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c74ab7b3dbc4afb550f71f4c55a9031c91cd50dd6eb18151c81c70e8d6e8f10f")
  public fun bind(arg0: Construct, arg1: DeploymentSourceContext.Builder.() -> Unit): SourceConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.deployment.ISource,
  ) : ISource {
    public override fun bind(arg0: Construct): SourceConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap)).let(SourceConfig::wrap)

    public override fun bind(arg0: Construct, arg1: DeploymentSourceContext): SourceConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(DeploymentSourceContext::unwrap)).let(SourceConfig::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c74ab7b3dbc4afb550f71f4c55a9031c91cd50dd6eb18151c81c70e8d6e8f10f")
    public override fun bind(arg0: Construct, arg1: DeploymentSourceContext.Builder.() -> Unit):
        SourceConfig = bind(arg0, DeploymentSourceContext(arg1))
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.ISource): ISource =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISource): software.amazon.awscdk.services.s3.deployment.ISource =
        (wrapped as Wrapper).cdkObject
  }
}
