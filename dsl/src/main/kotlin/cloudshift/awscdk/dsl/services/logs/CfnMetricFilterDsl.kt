@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.logs.CfnMetricFilter
import software.constructs.Construct

@CdkDslMarker
public class CfnMetricFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMetricFilter.Builder = CfnMetricFilter.Builder.create(scope, id)

  private val _metricTransformations: MutableList<Any> = mutableListOf()

  public fun filterName(filterName: String) {
    cdkBuilder.filterName(filterName)
  }

  public fun filterPattern(filterPattern: String) {
    cdkBuilder.filterPattern(filterPattern)
  }

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun metricTransformations(vararg metricTransformations: Any) {
    _metricTransformations.addAll(listOf(*metricTransformations))
  }

  public fun metricTransformations(metricTransformations: Collection<Any>) {
    _metricTransformations.addAll(metricTransformations)
  }

  public fun metricTransformations(metricTransformations: IResolvable) {
    cdkBuilder.metricTransformations(metricTransformations)
  }

  public fun build(): CfnMetricFilter {
    if(_metricTransformations.isNotEmpty()) cdkBuilder.metricTransformations(_metricTransformations)
    return cdkBuilder.build()
  }
}
