@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediastore

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnContainerProps {
  public fun accessLoggingEnabled(): Any? = unwrap(this).getAccessLoggingEnabled()

  public fun containerName(): String

  public fun corsPolicy(): Any? = unwrap(this).getCorsPolicy()

  public fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

  public fun metricPolicy(): Any? = unwrap(this).getMetricPolicy()

  public fun policy(): String? = unwrap(this).getPolicy()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessLoggingEnabled(accessLoggingEnabled: Boolean)

    public fun accessLoggingEnabled(accessLoggingEnabled: IResolvable)

    public fun containerName(containerName: String)

    public fun corsPolicy(corsPolicy: IResolvable)

    public fun corsPolicy(corsPolicy: List<Any>)

    public fun corsPolicy(vararg corsPolicy: Any)

    public fun lifecyclePolicy(lifecyclePolicy: String)

    public fun metricPolicy(metricPolicy: IResolvable)

    public fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41affe32981c7187ad762a830107953301cbdaa00ad1df7d32cd97c2766e9bd2")
    public fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty.Builder.() -> Unit)

    public fun policy(policy: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediastore.CfnContainerProps.Builder =
        software.amazon.awscdk.services.mediastore.CfnContainerProps.builder()

    override fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
      cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    override fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
      cdkBuilder.accessLoggingEnabled(accessLoggingEnabled.let(IResolvable::unwrap))
    }

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun corsPolicy(corsPolicy: IResolvable) {
      cdkBuilder.corsPolicy(corsPolicy.let(IResolvable::unwrap))
    }

    override fun corsPolicy(corsPolicy: List<Any>) {
      cdkBuilder.corsPolicy(corsPolicy)
    }

    override fun corsPolicy(vararg corsPolicy: Any): Unit = corsPolicy(corsPolicy.toList())

    override fun lifecyclePolicy(lifecyclePolicy: String) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    override fun metricPolicy(metricPolicy: IResolvable) {
      cdkBuilder.metricPolicy(metricPolicy.let(IResolvable::unwrap))
    }

    override fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty) {
      cdkBuilder.metricPolicy(metricPolicy.let(CfnContainer.MetricPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41affe32981c7187ad762a830107953301cbdaa00ad1df7d32cd97c2766e9bd2")
    override fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty.Builder.() -> Unit):
        Unit = metricPolicy(CfnContainer.MetricPolicyProperty(metricPolicy))

    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediastore.CfnContainerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediastore.CfnContainerProps,
  ) : CdkObject(cdkObject), CfnContainerProps {
    override fun accessLoggingEnabled(): Any? = unwrap(this).getAccessLoggingEnabled()

    override fun containerName(): String = unwrap(this).getContainerName()

    override fun corsPolicy(): Any? = unwrap(this).getCorsPolicy()

    override fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

    override fun metricPolicy(): Any? = unwrap(this).getMetricPolicy()

    override fun policy(): String? = unwrap(this).getPolicy()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediastore.CfnContainerProps):
        CfnContainerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerProps):
        software.amazon.awscdk.services.mediastore.CfnContainerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediastore.CfnContainerProps
  }
}
