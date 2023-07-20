@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.DashboardProps
import software.amazon.awscdk.services.cloudwatch.IVariable
import software.amazon.awscdk.services.cloudwatch.IWidget
import software.amazon.awscdk.services.cloudwatch.PeriodOverride

@CdkDslMarker
public class DashboardPropsDsl {
  private val cdkBuilder: DashboardProps.Builder = DashboardProps.builder()

  private val _variables: MutableList<IVariable> = mutableListOf()

  private val _widgets: MutableList<List<IWidget>> = mutableListOf()

  public fun dashboardName(dashboardName: String) {
    cdkBuilder.dashboardName(dashboardName)
  }

  public fun defaultInterval(defaultInterval: Duration) {
    cdkBuilder.defaultInterval(defaultInterval)
  }

  public fun end(end: String) {
    cdkBuilder.end(end)
  }

  public fun periodOverride(periodOverride: PeriodOverride) {
    cdkBuilder.periodOverride(periodOverride)
  }

  public fun start(start: String) {
    cdkBuilder.start(start)
  }

  public fun variables(vararg variables: IVariable) {
    _variables.addAll(listOf(*variables))
  }

  public fun variables(variables: Collection<IVariable>) {
    _variables.addAll(variables)
  }

  public fun widgets(vararg widgets: List<IWidget>) {
    _widgets.addAll(listOf(*widgets))
  }

  public fun widgets(widgets: Collection<List<IWidget>>) {
    _widgets.addAll(widgets)
  }

  public fun build(): DashboardProps {
    if(_variables.isNotEmpty()) cdkBuilder.variables(_variables)
    if(_widgets.isNotEmpty()) cdkBuilder.widgets(_widgets)
    return cdkBuilder.build()
  }
}
