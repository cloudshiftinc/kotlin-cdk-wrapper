@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ISource {
  public fun bind(arg0: Construct): SourceConfig

  public fun bind(arg0: Construct, arg1: DeploymentSourceContext): SourceConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c74ab7b3dbc4afb550f71f4c55a9031c91cd50dd6eb18151c81c70e8d6e8f10f")
  public fun bind(arg0: Construct, arg1: DeploymentSourceContext.Builder.() -> Unit): SourceConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.deployment.ISource,
  ) : CdkObject(cdkObject), ISource {
    override fun bind(arg0: Construct): SourceConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap)).let(SourceConfig::wrap)

    override fun bind(arg0: Construct, arg1: DeploymentSourceContext): SourceConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(DeploymentSourceContext::unwrap)).let(SourceConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c74ab7b3dbc4afb550f71f4c55a9031c91cd50dd6eb18151c81c70e8d6e8f10f")
    override fun bind(arg0: Construct, arg1: DeploymentSourceContext.Builder.() -> Unit):
        SourceConfig = bind(arg0, DeploymentSourceContext(arg1))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.ISource): ISource =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISource): software.amazon.awscdk.services.s3.deployment.ISource =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.deployment.ISource
  }
}
