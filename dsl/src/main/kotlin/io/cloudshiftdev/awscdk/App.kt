package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class App internal constructor(
  private val cdkObject: software.amazon.awscdk.App,
) : Stage(cdkObject) {
  public interface Builder {
    public fun analyticsReporting(analyticsReporting: Boolean)

    public fun autoSynth(autoSynth: Boolean)

    public fun context(context: Map<String, Any>)

    public fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer)

    public fun outdir(outdir: String)

    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

    public fun postCliContext(postCliContext: Map<String, Any>)

    public fun stackTraces(stackTraces: Boolean)

    public fun treeMetadata(treeMetadata: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.App.Builder =
        software.amazon.awscdk.App.Builder.create()

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

    override fun postCliContext(postCliContext: Map<String, Any>) {
      cdkBuilder.postCliContext(postCliContext)
    }

    override fun stackTraces(stackTraces: Boolean) {
      cdkBuilder.stackTraces(stackTraces)
    }

    override fun treeMetadata(treeMetadata: Boolean) {
      cdkBuilder.treeMetadata(treeMetadata)
    }

    public fun build(): software.amazon.awscdk.App = cdkBuilder.build()
  }

  public companion object {
    public open fun isApp(obj: Any): Boolean = software.amazon.awscdk.App.isApp(obj)

    public operator fun invoke(block: Builder.() -> Unit = {}): App {
      val builderImpl = BuilderImpl()
      return App(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.App): App = App(cdkObject)

    internal fun unwrap(wrapped: App): software.amazon.awscdk.App = wrapped.cdkObject
  }
}
