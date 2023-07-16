@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelMetricWindowPropertyDsl {
  private val cdkBuilder: CfnAssetModel.MetricWindowProperty.Builder =
      CfnAssetModel.MetricWindowProperty.builder()

  public fun tumbling(tumbling: IResolvable) {
    cdkBuilder.tumbling(tumbling)
  }

  public fun tumbling(tumbling: CfnAssetModel.TumblingWindowProperty) {
    cdkBuilder.tumbling(tumbling)
  }

  public fun build(): CfnAssetModel.MetricWindowProperty = cdkBuilder.build()
}
