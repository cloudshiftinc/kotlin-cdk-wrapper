@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor

@CdkDslMarker
public class CfnAppMonitorMetricDefinitionPropertyDsl {
  private val cdkBuilder: CfnAppMonitor.MetricDefinitionProperty.Builder =
      CfnAppMonitor.MetricDefinitionProperty.builder()

  public fun dimensionKeys(dimensionKeys: Map<String, String>) {
    cdkBuilder.dimensionKeys(dimensionKeys)
  }

  public fun dimensionKeys(dimensionKeys: IResolvable) {
    cdkBuilder.dimensionKeys(dimensionKeys)
  }

  public fun eventPattern(eventPattern: String) {
    cdkBuilder.eventPattern(eventPattern)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun unitLabel(unitLabel: String) {
    cdkBuilder.unitLabel(unitLabel)
  }

  public fun valueKey(valueKey: String) {
    cdkBuilder.valueKey(valueKey)
  }

  public fun build(): CfnAppMonitor.MetricDefinitionProperty = cdkBuilder.build()
}
