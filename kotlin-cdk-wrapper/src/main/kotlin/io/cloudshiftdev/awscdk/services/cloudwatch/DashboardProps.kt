@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DashboardProps {
  public fun dashboardName(): String? = unwrap(this).getDashboardName()

  public fun defaultInterval(): Duration? = unwrap(this).getDefaultInterval()?.let(Duration::wrap)

  public fun end(): String? = unwrap(this).getEnd()

  public fun periodOverride(): PeriodOverride? =
      unwrap(this).getPeriodOverride()?.let(PeriodOverride::wrap)

  public fun start(): String? = unwrap(this).getStart()

  public fun variables(): List<IVariable> = unwrap(this).getVariables()?.map(IVariable::wrap) ?:
      emptyList()

  public fun widgets(): List<List<IWidget>> = unwrap(this).getWidgets()?.map{ it.map(IWidget::wrap)
      } ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dashboardName(dashboardName: String)

    public fun defaultInterval(defaultInterval: Duration)

    public fun end(end: String)

    public fun periodOverride(periodOverride: PeriodOverride)

    public fun start(start: String)

    public fun variables(variables: List<IVariable>)

    public fun variables(vararg variables: IVariable)

    public fun widgets(widgets: List<List<IWidget>>)

    public fun widgets(vararg widgets: List<IWidget>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder =
        software.amazon.awscdk.services.cloudwatch.DashboardProps.builder()

    override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    override fun defaultInterval(defaultInterval: Duration) {
      cdkBuilder.defaultInterval(defaultInterval.let(Duration::unwrap))
    }

    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    override fun periodOverride(periodOverride: PeriodOverride) {
      cdkBuilder.periodOverride(periodOverride.let(PeriodOverride::unwrap))
    }

    override fun start(start: String) {
      cdkBuilder.start(start)
    }

    override fun variables(variables: List<IVariable>) {
      cdkBuilder.variables(variables.map(IVariable::unwrap))
    }

    override fun variables(vararg variables: IVariable): Unit = variables(variables.toList())

    override fun widgets(widgets: List<List<IWidget>>) {
      cdkBuilder.widgets(widgets.map{ it.map(IWidget::unwrap) })
    }

    override fun widgets(vararg widgets: List<IWidget>): Unit = widgets(widgets.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.DashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardProps,
  ) : CdkObject(cdkObject), DashboardProps {
    override fun dashboardName(): String? = unwrap(this).getDashboardName()

    override fun defaultInterval(): Duration? =
        unwrap(this).getDefaultInterval()?.let(Duration::wrap)

    override fun end(): String? = unwrap(this).getEnd()

    override fun periodOverride(): PeriodOverride? =
        unwrap(this).getPeriodOverride()?.let(PeriodOverride::wrap)

    override fun start(): String? = unwrap(this).getStart()

    override fun variables(): List<IVariable> = unwrap(this).getVariables()?.map(IVariable::wrap) ?:
        emptyList()

    override fun widgets(): List<List<IWidget>> = unwrap(this).getWidgets()?.map{
        it.map(IWidget::wrap) } ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardProps):
        DashboardProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DashboardProps):
        software.amazon.awscdk.services.cloudwatch.DashboardProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.DashboardProps
  }
}
