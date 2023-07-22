@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnExperiment

@CdkDslMarker
public class CfnExperimentMetricGoalObjectPropertyDsl {
  private val cdkBuilder: CfnExperiment.MetricGoalObjectProperty.Builder =
      CfnExperiment.MetricGoalObjectProperty.builder()

  /**
   * @param desiredChange `INCREASE` means that a variation with a higher number for this metric is
   * performing better. 
   * `DECREASE` means that a variation with a lower number for this metric is performing better.
   */
  public fun desiredChange(desiredChange: String) {
    cdkBuilder.desiredChange(desiredChange)
  }

  /**
   * @param entityIdKey The entity, such as a user or session, that does an action that causes a
   * metric value to be recorded. 
   * An example is `userDetails.userID` .
   */
  public fun entityIdKey(entityIdKey: String) {
    cdkBuilder.entityIdKey(entityIdKey)
  }

  /**
   * @param eventPattern The EventBridge event pattern that defines how the metric is recorded.
   * For more information about EventBridge event patterns, see [Amazon EventBridge event
   * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) .
   */
  public fun eventPattern(eventPattern: String) {
    cdkBuilder.eventPattern(eventPattern)
  }

  /**
   * @param metricName A name for the metric. 
   * It can include up to 255 characters.
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param unitLabel A label for the units that the metric is measuring.
   */
  public fun unitLabel(unitLabel: String) {
    cdkBuilder.unitLabel(unitLabel)
  }

  /**
   * @param valueKey The JSON path to reference the numerical metric value in the event. 
   */
  public fun valueKey(valueKey: String) {
    cdkBuilder.valueKey(valueKey)
  }

  public fun build(): CfnExperiment.MetricGoalObjectProperty = cdkBuilder.build()
}
