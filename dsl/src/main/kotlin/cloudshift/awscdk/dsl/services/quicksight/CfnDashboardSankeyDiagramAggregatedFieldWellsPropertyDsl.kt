@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSankeyDiagramAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty.Builder =
      CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty.builder()

  private val _destination: MutableList<Any> = mutableListOf()

  private val _source: MutableList<Any> = mutableListOf()

  private val _weight: MutableList<Any> = mutableListOf()

  public fun destination(vararg destination: Any) {
    _destination.addAll(listOf(*destination))
  }

  public fun destination(destination: Collection<Any>) {
    _destination.addAll(destination)
  }

  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  public fun source(vararg source: Any) {
    _source.addAll(listOf(*source))
  }

  public fun source(source: Collection<Any>) {
    _source.addAll(source)
  }

  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  public fun weight(vararg weight: Any) {
    _weight.addAll(listOf(*weight))
  }

  public fun weight(weight: Collection<Any>) {
    _weight.addAll(weight)
  }

  public fun weight(weight: IResolvable) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty {
    if(_destination.isNotEmpty()) cdkBuilder.destination(_destination)
    if(_source.isNotEmpty()) cdkBuilder.source(_source)
    if(_weight.isNotEmpty()) cdkBuilder.weight(_weight)
    return cdkBuilder.build()
  }
}
