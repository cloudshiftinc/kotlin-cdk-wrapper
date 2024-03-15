@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAutoScalingConfigurationProps {
  public fun autoScalingConfigurationName(): String? =
      unwrap(this).getAutoScalingConfigurationName()

  public fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  public fun minSize(): Number? = unwrap(this).getMinSize()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingConfigurationName(autoScalingConfigurationName: String)

    public fun maxConcurrency(maxConcurrency: Number)

    public fun maxSize(maxSize: Number)

    public fun minSize(minSize: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps.builder()

    override fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
      cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
    }

    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps,
  ) : CdkObject(cdkObject), CfnAutoScalingConfigurationProps {
    override fun autoScalingConfigurationName(): String? =
        unwrap(this).getAutoScalingConfigurationName()

    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    override fun minSize(): Number? = unwrap(this).getMinSize()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps):
        CfnAutoScalingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingConfigurationProps):
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps
  }
}
