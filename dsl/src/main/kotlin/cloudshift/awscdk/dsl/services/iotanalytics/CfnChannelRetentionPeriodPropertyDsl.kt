@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnChannel

@CdkDslMarker
public class CfnChannelRetentionPeriodPropertyDsl {
  private val cdkBuilder: CfnChannel.RetentionPeriodProperty.Builder =
      CfnChannel.RetentionPeriodProperty.builder()

  /**
   * @param numberOfDays The number of days that message data is kept.
   * The `unlimited` parameter must be false.
   */
  public fun numberOfDays(numberOfDays: Number) {
    cdkBuilder.numberOfDays(numberOfDays)
  }

  /**
   * @param unlimited If true, message data is kept indefinitely.
   */
  public fun unlimited(unlimited: Boolean) {
    cdkBuilder.unlimited(unlimited)
  }

  /**
   * @param unlimited If true, message data is kept indefinitely.
   */
  public fun unlimited(unlimited: IResolvable) {
    cdkBuilder.unlimited(unlimited)
  }

  public fun build(): CfnChannel.RetentionPeriodProperty = cdkBuilder.build()
}
