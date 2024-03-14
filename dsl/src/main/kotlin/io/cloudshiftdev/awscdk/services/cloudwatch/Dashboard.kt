package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Dashboard internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.Dashboard,
) : Resource(cdkObject) {
  public open fun addVariable(variable: IVariable) {
    unwrap(this).addVariable(variable.let(IVariable::unwrap))
  }

  public open fun addWidgets(widgets: IWidget) {
    unwrap(this).addWidgets(widgets.let(IWidget::unwrap))
  }

  public open fun dashboardArn(): String = unwrap(this).getDashboardArn()

  public open fun dashboardName(): String = unwrap(this).getDashboardName()

  public interface Builder {
    public fun dashboardName(dashboardName: String)

    public fun defaultInterval(defaultInterval: Duration)

    public fun end(end: String)

    public fun periodOverride(periodOverride: PeriodOverride)

    public fun start(start: String)

    public fun variables(variables: List<IVariable>)

    public fun widgets(widgets: List<List<IWidget>>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Dashboard.Builder =
        software.amazon.awscdk.services.cloudwatch.Dashboard.Builder.create(scope, id)

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

    override fun widgets(widgets: List<List<IWidget>>) {
      cdkBuilder.widgets(widgets.map{ it.map(IWidget::unwrap) })
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Dashboard = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Dashboard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Dashboard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Dashboard): Dashboard =
        Dashboard(cdkObject)

    internal fun unwrap(wrapped: Dashboard): software.amazon.awscdk.services.cloudwatch.Dashboard =
        wrapped.cdkObject
  }
}
