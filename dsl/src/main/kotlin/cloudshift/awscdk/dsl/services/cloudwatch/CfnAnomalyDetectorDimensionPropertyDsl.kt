@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorDimensionPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.DimensionProperty.Builder =
      CfnAnomalyDetector.DimensionProperty.builder()

  /**
   * @param name The name of the dimension. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the dimension. 
   * Dimension values must contain only ASCII characters and must include at least one
   * non-whitespace character. ASCII control characters are not supported as part of dimension values.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnomalyDetector.DimensionProperty = cdkBuilder.build()
}
