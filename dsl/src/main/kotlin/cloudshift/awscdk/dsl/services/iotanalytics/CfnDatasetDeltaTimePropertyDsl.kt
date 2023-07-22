@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetDeltaTimePropertyDsl {
  private val cdkBuilder: CfnDataset.DeltaTimeProperty.Builder =
      CfnDataset.DeltaTimeProperty.builder()

  /**
   * @param offsetSeconds The number of seconds of estimated in-flight lag time of message data. 
   * When you create dataset contents using message data from a specified timeframe, some message
   * data might still be in flight when processing begins, and so do not arrive in time to be
   * processed. Use this field to make allowances for the in flight time of your message data, so that
   * data not processed from a previous timeframe is included with the next timeframe. Otherwise,
   * missed message data would be excluded from processing during the next timeframe too, because its
   * timestamp places it within the previous timeframe.
   */
  public fun offsetSeconds(offsetSeconds: Number) {
    cdkBuilder.offsetSeconds(offsetSeconds)
  }

  /**
   * @param timeExpression An expression by which the time of the message data might be determined. 
   * This can be the name of a timestamp field or a SQL expression that is used to derive the time
   * the message data was generated.
   */
  public fun timeExpression(timeExpression: String) {
    cdkBuilder.timeExpression(timeExpression)
  }

  public fun build(): CfnDataset.DeltaTimeProperty = cdkBuilder.build()
}
