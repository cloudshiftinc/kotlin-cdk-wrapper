@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnObservabilityConfigurationProps {
  public fun observabilityConfigurationName(): String? =
      unwrap(this).getObservabilityConfigurationName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun traceConfiguration(): Any? = unwrap(this).getTraceConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun observabilityConfigurationName(observabilityConfigurationName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun traceConfiguration(traceConfiguration: IResolvable)

    public
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1326ccafceef15c293c4341cc9ac410c2a6b5b8a63fb448a114a49671fef0141")
    public
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps.builder()

    override fun observabilityConfigurationName(observabilityConfigurationName: String) {
      cdkBuilder.observabilityConfigurationName(observabilityConfigurationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun traceConfiguration(traceConfiguration: IResolvable) {
      cdkBuilder.traceConfiguration(traceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty) {
      cdkBuilder.traceConfiguration(traceConfiguration.let(CfnObservabilityConfiguration.TraceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1326ccafceef15c293c4341cc9ac410c2a6b5b8a63fb448a114a49671fef0141")
    override
        fun traceConfiguration(traceConfiguration: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder.() -> Unit):
        Unit =
        traceConfiguration(CfnObservabilityConfiguration.TraceConfigurationProperty(traceConfiguration))

    public fun build(): software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps,
  ) : CdkObject(cdkObject), CfnObservabilityConfigurationProps {
    override fun observabilityConfigurationName(): String? =
        unwrap(this).getObservabilityConfigurationName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun traceConfiguration(): Any? = unwrap(this).getTraceConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnObservabilityConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps):
        CfnObservabilityConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnObservabilityConfigurationProps):
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfigurationProps
  }
}
