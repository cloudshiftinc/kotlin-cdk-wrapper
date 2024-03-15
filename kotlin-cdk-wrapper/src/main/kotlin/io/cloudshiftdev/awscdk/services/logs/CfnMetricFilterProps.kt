@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMetricFilterProps {
  public fun filterName(): String? = unwrap(this).getFilterName()

  public fun filterPattern(): String

  public fun logGroupName(): String

  public fun metricTransformations(): Any

  @CdkDslMarker
  public interface Builder {
    public fun filterName(filterName: String)

    public fun filterPattern(filterPattern: String)

    public fun logGroupName(logGroupName: String)

    public fun metricTransformations(metricTransformations: IResolvable)

    public fun metricTransformations(metricTransformations: List<Any>)

    public fun metricTransformations(vararg metricTransformations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder =
        software.amazon.awscdk.services.logs.CfnMetricFilterProps.builder()

    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun metricTransformations(metricTransformations: IResolvable) {
      cdkBuilder.metricTransformations(metricTransformations.let(IResolvable::unwrap))
    }

    override fun metricTransformations(metricTransformations: List<Any>) {
      cdkBuilder.metricTransformations(metricTransformations)
    }

    override fun metricTransformations(vararg metricTransformations: Any): Unit =
        metricTransformations(metricTransformations.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnMetricFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilterProps,
  ) : CdkObject(cdkObject), CfnMetricFilterProps {
    override fun filterName(): String? = unwrap(this).getFilterName()

    override fun filterPattern(): String = unwrap(this).getFilterPattern()

    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    override fun metricTransformations(): Any = unwrap(this).getMetricTransformations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMetricFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilterProps):
        CfnMetricFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMetricFilterProps):
        software.amazon.awscdk.services.logs.CfnMetricFilterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.CfnMetricFilterProps
  }
}
