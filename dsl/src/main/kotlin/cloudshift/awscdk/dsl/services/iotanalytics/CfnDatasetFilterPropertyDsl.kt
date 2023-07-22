@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Information which is used to filter message data, to segregate it according to the time frame in
 * which it arrives.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * FilterProperty filterProperty = FilterProperty.builder()
 * .deltaTime(DeltaTimeProperty.builder()
 * .offsetSeconds(123)
 * .timeExpression("timeExpression")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html)
 */
@CdkDslMarker
public class CfnDatasetFilterPropertyDsl {
  private val cdkBuilder: CfnDataset.FilterProperty.Builder = CfnDataset.FilterProperty.builder()

  /**
   * @param deltaTime Used to limit data to that which has arrived since the last execution of the
   * action.
   */
  public fun deltaTime(deltaTime: IResolvable) {
    cdkBuilder.deltaTime(deltaTime)
  }

  /**
   * @param deltaTime Used to limit data to that which has arrived since the last execution of the
   * action.
   */
  public fun deltaTime(deltaTime: CfnDataset.DeltaTimeProperty) {
    cdkBuilder.deltaTime(deltaTime)
  }

  public fun build(): CfnDataset.FilterProperty = cdkBuilder.build()
}
