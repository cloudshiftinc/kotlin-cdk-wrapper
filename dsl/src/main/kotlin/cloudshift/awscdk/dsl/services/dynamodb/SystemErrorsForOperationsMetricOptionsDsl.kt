@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.Unit
import software.amazon.awscdk.services.dynamodb.Operation
import software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions

@CdkDslMarker
public class SystemErrorsForOperationsMetricOptionsDsl {
  private val cdkBuilder: SystemErrorsForOperationsMetricOptions.Builder =
      SystemErrorsForOperationsMetricOptions.builder()

  private val _operations: MutableList<Operation> = mutableListOf()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun dimensionsMap(dimensionsMap: Map<String, String>) {
    cdkBuilder.dimensionsMap(dimensionsMap)
  }

  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  public fun operations(vararg operations: Operation) {
    _operations.addAll(listOf(*operations))
  }

  public fun operations(operations: Collection<Operation>) {
    _operations.addAll(operations)
  }

  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun unit(unit: Unit) {
    cdkBuilder.unit(unit)
  }

  public fun build(): SystemErrorsForOperationsMetricOptions {
    if(_operations.isNotEmpty()) cdkBuilder.operations(_operations)
    return cdkBuilder.build()
  }
}
