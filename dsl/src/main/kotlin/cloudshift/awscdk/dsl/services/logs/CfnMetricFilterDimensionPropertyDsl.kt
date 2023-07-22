@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnMetricFilter

@CdkDslMarker
public class CfnMetricFilterDimensionPropertyDsl {
  private val cdkBuilder: CfnMetricFilter.DimensionProperty.Builder =
      CfnMetricFilter.DimensionProperty.builder()

  /**
   * @param key The name for the CloudWatch metric dimension that the metric filter creates. 
   * Dimension names must contain only ASCII characters, must include at least one non-whitespace
   * character, and cannot start with a colon (:).
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The log event field that will contain the value for this dimension. 
   * This dimension will only be published for a metric if the value is found in the log event. For
   * example, `$.eventType` for JSON log events, or `$server` for space-delimited log events.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnMetricFilter.DimensionProperty = cdkBuilder.build()
}
