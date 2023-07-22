@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.frauddetector.CfnDetector

@CdkDslMarker
public class CfnDetectorModelPropertyDsl {
  private val cdkBuilder: CfnDetector.ModelProperty.Builder = CfnDetector.ModelProperty.builder()

  /**
   * @param arn the value to be set.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnDetector.ModelProperty = cdkBuilder.build()
}
