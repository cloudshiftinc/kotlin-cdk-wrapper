@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCustomMetricProps {
  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun metricName(): String? = unwrap(this).getMetricName()

  public fun metricType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun displayName(displayName: String)

    public fun metricName(metricName: String)

    public fun metricType(metricType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCustomMetricProps.Builder =
        software.amazon.awscdk.services.iot.CfnCustomMetricProps.builder()

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun metricType(metricType: String) {
      cdkBuilder.metricType(metricType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCustomMetricProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetricProps,
  ) : CdkObject(cdkObject), CfnCustomMetricProps {
    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun metricName(): String? = unwrap(this).getMetricName()

    override fun metricType(): String = unwrap(this).getMetricType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomMetricProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetricProps):
        CfnCustomMetricProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomMetricProps):
        software.amazon.awscdk.services.iot.CfnCustomMetricProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnCustomMetricProps
  }
}
