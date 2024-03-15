@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pipes

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnPipeProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun desiredState(): String? = unwrap(this).getDesiredState()

  public fun enrichment(): String? = unwrap(this).getEnrichment()

  public fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  public fun name(): String? = unwrap(this).getName()

  public fun roleArn(): String

  public fun source(): String

  public fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun target(): String

  public fun targetParameters(): Any? = unwrap(this).getTargetParameters()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun desiredState(desiredState: String)

    public fun enrichment(enrichment: String)

    public fun enrichmentParameters(enrichmentParameters: IResolvable)

    public fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0297dbc28c3ba5edc57c9c34d955342e189ad447fcd53049c41e0c325b322e2c")
    public
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty.Builder.() -> Unit)

    public fun logConfiguration(logConfiguration: IResolvable)

    public fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47e39c8c42f658449b16a7a691395f7df0fed95faac8c4dc2f73b036ab28a331")
    public
        fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun source(source: String)

    public fun sourceParameters(sourceParameters: IResolvable)

    public fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("127357ee001057628f36fb31fb5274eca0eb5973a09b313a9e78465424f0cd8f")
    public
        fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)

    public fun target(target: String)

    public fun targetParameters(targetParameters: IResolvable)

    public fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd711d2029ca2597d1b0f36aacc2891fbc90cd2160955befffd2af1c3c93316f")
    public
        fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipeProps.Builder =
        software.amazon.awscdk.services.pipes.CfnPipeProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    override fun enrichment(enrichment: String) {
      cdkBuilder.enrichment(enrichment)
    }

    override fun enrichmentParameters(enrichmentParameters: IResolvable) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(IResolvable::unwrap))
    }

    override
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(CfnPipe.PipeEnrichmentParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0297dbc28c3ba5edc57c9c34d955342e189ad447fcd53049c41e0c325b322e2c")
    override
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty.Builder.() -> Unit):
        Unit = enrichmentParameters(CfnPipe.PipeEnrichmentParametersProperty(enrichmentParameters))

    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    override fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnPipe.PipeLogConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47e39c8c42f658449b16a7a691395f7df0fed95faac8c4dc2f73b036ab28a331")
    override
        fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(CfnPipe.PipeLogConfigurationProperty(logConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun sourceParameters(sourceParameters: IResolvable) {
      cdkBuilder.sourceParameters(sourceParameters.let(IResolvable::unwrap))
    }

    override fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty) {
      cdkBuilder.sourceParameters(sourceParameters.let(CfnPipe.PipeSourceParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("127357ee001057628f36fb31fb5274eca0eb5973a09b313a9e78465424f0cd8f")
    override
        fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty.Builder.() -> Unit):
        Unit = sourceParameters(CfnPipe.PipeSourceParametersProperty(sourceParameters))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    override fun targetParameters(targetParameters: IResolvable) {
      cdkBuilder.targetParameters(targetParameters.let(IResolvable::unwrap))
    }

    override fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty) {
      cdkBuilder.targetParameters(targetParameters.let(CfnPipe.PipeTargetParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd711d2029ca2597d1b0f36aacc2891fbc90cd2160955befffd2af1c3c93316f")
    override
        fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty.Builder.() -> Unit):
        Unit = targetParameters(CfnPipe.PipeTargetParametersProperty(targetParameters))

    public fun build(): software.amazon.awscdk.services.pipes.CfnPipeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipeProps,
  ) : CdkObject(cdkObject), CfnPipeProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun desiredState(): String? = unwrap(this).getDesiredState()

    override fun enrichment(): String? = unwrap(this).getEnrichment()

    override fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    override fun name(): String? = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun source(): String = unwrap(this).getSource()

    override fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun target(): String = unwrap(this).getTarget()

    override fun targetParameters(): Any? = unwrap(this).getTargetParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipeProps): CfnPipeProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipeProps): software.amazon.awscdk.services.pipes.CfnPipeProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.pipes.CfnPipeProps
  }
}
