@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowSAPODataSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.SAPODataSourcePropertiesProperty.Builder =
      CfnFlow.SAPODataSourcePropertiesProperty.builder()

  /**
   * @param objectPath The object path specified in the SAPOData flow source. 
   */
  public fun objectPath(objectPath: String) {
    cdkBuilder.objectPath(objectPath)
  }

  public fun build(): CfnFlow.SAPODataSourcePropertiesProperty = cdkBuilder.build()
}
