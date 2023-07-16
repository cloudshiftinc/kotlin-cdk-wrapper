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

  public fun offsetSeconds(offsetSeconds: Number) {
    cdkBuilder.offsetSeconds(offsetSeconds)
  }

  public fun timeExpression(timeExpression: String) {
    cdkBuilder.timeExpression(timeExpression)
  }

  public fun build(): CfnDataset.DeltaTimeProperty = cdkBuilder.build()
}
