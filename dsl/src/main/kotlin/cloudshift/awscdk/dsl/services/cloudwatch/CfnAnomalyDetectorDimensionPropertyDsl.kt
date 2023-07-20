@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorDimensionPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.DimensionProperty.Builder =
      CfnAnomalyDetector.DimensionProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnomalyDetector.DimensionProperty = cdkBuilder.build()
}
