@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

/**
 * Contains a time interval window used for data aggregate computations (for example, average, sum,
 * count, and so on).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * MetricWindowProperty metricWindowProperty = MetricWindowProperty.builder()
 * .tumbling(TumblingWindowProperty.builder()
 * .interval("interval")
 * // the properties below are optional
 * .offset("offset")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metricwindow.html)
 */
@CdkDslMarker
public class CfnAssetModelMetricWindowPropertyDsl {
  private val cdkBuilder: CfnAssetModel.MetricWindowProperty.Builder =
      CfnAssetModel.MetricWindowProperty.builder()

  /**
   * @param tumbling The tumbling time interval window.
   */
  public fun tumbling(tumbling: IResolvable) {
    cdkBuilder.tumbling(tumbling)
  }

  /**
   * @param tumbling The tumbling time interval window.
   */
  public fun tumbling(tumbling: CfnAssetModel.TumblingWindowProperty) {
    cdkBuilder.tumbling(tumbling)
  }

  public fun build(): CfnAssetModel.MetricWindowProperty = cdkBuilder.build()
}
