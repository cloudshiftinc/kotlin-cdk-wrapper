@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowInforNexusSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.InforNexusSourcePropertiesProperty.Builder =
      CfnFlow.InforNexusSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the Infor Nexus flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.InforNexusSourcePropertiesProperty = cdkBuilder.build()
}
