@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface AppProps {
  public fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

  public fun autoSynth(): Boolean? = unwrap(this).getAutoSynth()

  public fun context(): Map<String, Any> = unwrap(this).getContext() ?: emptyMap()

  public fun defaultStackSynthesizer(): IReusableStackSynthesizer? =
      unwrap(this).getDefaultStackSynthesizer()?.let(IReusableStackSynthesizer::wrap)

  public fun outdir(): String? = unwrap(this).getOutdir()

  public fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
      unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
      emptyList()

  public fun postCliContext(): Map<String, Any> = unwrap(this).getPostCliContext() ?: emptyMap()

  public fun stackTraces(): Boolean? = unwrap(this).getStackTraces()

  public fun treeMetadata(): Boolean? = unwrap(this).getTreeMetadata()

  @CdkDslMarker
  public interface Builder {
    public fun analyticsReporting(analyticsReporting: Boolean)

    public fun autoSynth(autoSynth: Boolean)

    public fun context(context: Map<String, Any>)

    public fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer)

    public fun outdir(outdir: String)

    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1)

    public fun postCliContext(postCliContext: Map<String, Any>)

    public fun stackTraces(stackTraces: Boolean)

    public fun treeMetadata(treeMetadata: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AppProps.Builder =
        software.amazon.awscdk.AppProps.builder()

    override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    override fun autoSynth(autoSynth: Boolean) {
      cdkBuilder.autoSynth(autoSynth)
    }

    override fun context(context: Map<String, Any>) {
      cdkBuilder.context(context)
    }

    override fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer) {
      cdkBuilder.defaultStackSynthesizer(defaultStackSynthesizer.let(IReusableStackSynthesizer::unwrap))
    }

    override fun outdir(outdir: String) {
      cdkBuilder.outdir(outdir)
    }

    override fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>) {
      cdkBuilder.policyValidationBeta1(policyValidationBeta1.map(IPolicyValidationPluginBeta1::unwrap))
    }

    override fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1):
        Unit = policyValidationBeta1(policyValidationBeta1.toList())

    override fun postCliContext(postCliContext: Map<String, Any>) {
      cdkBuilder.postCliContext(postCliContext)
    }

    override fun stackTraces(stackTraces: Boolean) {
      cdkBuilder.stackTraces(stackTraces)
    }

    override fun treeMetadata(treeMetadata: Boolean) {
      cdkBuilder.treeMetadata(treeMetadata)
    }

    public fun build(): software.amazon.awscdk.AppProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.AppProps,
  ) : CdkObject(cdkObject), AppProps {
    override fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

    override fun autoSynth(): Boolean? = unwrap(this).getAutoSynth()

    override fun context(): Map<String, Any> = unwrap(this).getContext() ?: emptyMap()

    override fun defaultStackSynthesizer(): IReusableStackSynthesizer? =
        unwrap(this).getDefaultStackSynthesizer()?.let(IReusableStackSynthesizer::wrap)

    override fun outdir(): String? = unwrap(this).getOutdir()

    override fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
        unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
        emptyList()

    override fun postCliContext(): Map<String, Any> = unwrap(this).getPostCliContext() ?: emptyMap()

    override fun stackTraces(): Boolean? = unwrap(this).getStackTraces()

    override fun treeMetadata(): Boolean? = unwrap(this).getTreeMetadata()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AppProps): AppProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppProps): software.amazon.awscdk.AppProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.AppProps
  }
}
