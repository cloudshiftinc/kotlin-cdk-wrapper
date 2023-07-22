@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.ConfigurationProperty.Builder =
      CfnAnomalyDetector.ConfigurationProperty.builder()

  private val _excludedTimeRanges: MutableList<Any> = mutableListOf()

  /**
   * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when the
   * anomaly detection model is trained and updated.
   * Use this to make sure that events that could cause unusual values for the metric, such as
   * deployments, aren't used when CloudWatch creates or updates the model.
   */
  public fun excludedTimeRanges(vararg excludedTimeRanges: Any) {
    _excludedTimeRanges.addAll(listOf(*excludedTimeRanges))
  }

  /**
   * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when the
   * anomaly detection model is trained and updated.
   * Use this to make sure that events that could cause unusual values for the metric, such as
   * deployments, aren't used when CloudWatch creates or updates the model.
   */
  public fun excludedTimeRanges(excludedTimeRanges: Collection<Any>) {
    _excludedTimeRanges.addAll(excludedTimeRanges)
  }

  /**
   * @param excludedTimeRanges Specifies an array of time ranges to exclude from use when the
   * anomaly detection model is trained and updated.
   * Use this to make sure that events that could cause unusual values for the metric, such as
   * deployments, aren't used when CloudWatch creates or updates the model.
   */
  public fun excludedTimeRanges(excludedTimeRanges: IResolvable) {
    cdkBuilder.excludedTimeRanges(excludedTimeRanges)
  }

  /**
   * @param metricTimeZone The time zone to use for the metric.
   * This is useful to enable the model to automatically account for daylight savings time changes
   * if the metric is sensitive to such time changes.
   *
   * To specify a time zone, use the name of the time zone as specified in the standard tz database.
   * For more information, see [tz
   * database](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Tz_database) .
   */
  public fun metricTimeZone(metricTimeZone: String) {
    cdkBuilder.metricTimeZone(metricTimeZone)
  }

  public fun build(): CfnAnomalyDetector.ConfigurationProperty {
    if(_excludedTimeRanges.isNotEmpty()) cdkBuilder.excludedTimeRanges(_excludedTimeRanges)
    return cdkBuilder.build()
  }
}
