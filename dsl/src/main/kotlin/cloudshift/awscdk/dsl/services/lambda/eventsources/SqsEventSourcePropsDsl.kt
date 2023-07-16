@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps

@CdkDslMarker
public class SqsEventSourcePropsDsl {
  private val cdkBuilder: SqsEventSourceProps.Builder = SqsEventSourceProps.builder()

  private val _filters: MutableList<Map<String, *>> = mutableListOf()

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun filters(vararg filters: Map<String, *>) {
    _filters.addAll(listOf(*filters))
  }

  public fun filters(filters: Collection<Map<String, *>>) {
    _filters.addAll(filters)
  }

  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
    cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
  }

  public fun build(): SqsEventSourceProps {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
