@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelTumblingWindowPropertyDsl {
  private val cdkBuilder: CfnAssetModel.TumblingWindowProperty.Builder =
      CfnAssetModel.TumblingWindowProperty.builder()

  public fun interval(interval: String) {
    cdkBuilder.interval(interval)
  }

  public fun offset(offset: String) {
    cdkBuilder.offset(offset)
  }

  public fun build(): CfnAssetModel.TumblingWindowProperty = cdkBuilder.build()
}
