@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnLaunch

@CdkDslMarker
public class CfnLaunchMetricDefinitionObjectPropertyDsl {
  private val cdkBuilder: CfnLaunch.MetricDefinitionObjectProperty.Builder =
      CfnLaunch.MetricDefinitionObjectProperty.builder()

  public fun entityIdKey(entityIdKey: String) {
    cdkBuilder.entityIdKey(entityIdKey)
  }

  public fun eventPattern(eventPattern: String) {
    cdkBuilder.eventPattern(eventPattern)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun unitLabel(unitLabel: String) {
    cdkBuilder.unitLabel(unitLabel)
  }

  public fun valueKey(valueKey: String) {
    cdkBuilder.valueKey(valueKey)
  }

  public fun build(): CfnLaunch.MetricDefinitionObjectProperty = cdkBuilder.build()
}
