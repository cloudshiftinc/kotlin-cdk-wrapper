@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowPardotSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.PardotSourcePropertiesProperty.Builder =
      CfnFlow.PardotSourcePropertiesProperty.builder()

  /**
   * @param object the value to be set. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.PardotSourcePropertiesProperty = cdkBuilder.build()
}
