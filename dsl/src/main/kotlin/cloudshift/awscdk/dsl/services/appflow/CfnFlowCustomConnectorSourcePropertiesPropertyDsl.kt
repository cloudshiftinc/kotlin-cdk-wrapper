@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowCustomConnectorSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.CustomConnectorSourcePropertiesProperty.Builder =
      CfnFlow.CustomConnectorSourcePropertiesProperty.builder()

  /**
   * @param customProperties Custom properties that are required to use the custom connector as a
   * source.
   */
  public fun customProperties(customProperties: Map<String, String>) {
    cdkBuilder.customProperties(customProperties)
  }

  /**
   * @param customProperties Custom properties that are required to use the custom connector as a
   * source.
   */
  public fun customProperties(customProperties: IResolvable) {
    cdkBuilder.customProperties(customProperties)
  }

  /**
   * @param dataTransferApi the value to be set.
   */
  public fun dataTransferApi(dataTransferApi: IResolvable) {
    cdkBuilder.dataTransferApi(dataTransferApi)
  }

  /**
   * @param dataTransferApi the value to be set.
   */
  public fun dataTransferApi(dataTransferApi: CfnFlow.DataTransferApiProperty) {
    cdkBuilder.dataTransferApi(dataTransferApi)
  }

  /**
   * @param entityName The entity specified in the custom connector as a source in the flow. 
   */
  public fun entityName(entityName: String) {
    cdkBuilder.entityName(entityName)
  }

  public fun build(): CfnFlow.CustomConnectorSourcePropertiesProperty = cdkBuilder.build()
}
