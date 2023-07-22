@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetDeltaTimeSessionWindowConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataset.DeltaTimeSessionWindowConfigurationProperty.Builder =
      CfnDataset.DeltaTimeSessionWindowConfigurationProperty.builder()

  /**
   * @param timeoutInMinutes A time interval. 
   * You can use `timeoutInMinutes` so that AWS IoT Analytics can batch up late data notifications
   * that have been generated since the last execution. AWS IoT Analytics sends one batch of
   * notifications to Amazon CloudWatch Events at one time.
   *
   * For more information about how to write a timestamp expression, see [Date and Time Functions
   * and
   * Operators](https://docs.aws.amazon.com/https://prestodb.io/docs/current/functions/datetime.html) ,
   * in the *Presto 0.172 Documentation* .
   */
  public fun timeoutInMinutes(timeoutInMinutes: Number) {
    cdkBuilder.timeoutInMinutes(timeoutInMinutes)
  }

  public fun build(): CfnDataset.DeltaTimeSessionWindowConfigurationProperty = cdkBuilder.build()
}
