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

  public fun customProperties(customProperties: Map<String, String>) {
    cdkBuilder.customProperties(customProperties)
  }

  public fun customProperties(customProperties: IResolvable) {
    cdkBuilder.customProperties(customProperties)
  }

  public fun dataTransferApi(dataTransferApi: IResolvable) {
    cdkBuilder.dataTransferApi(dataTransferApi)
  }

  public fun dataTransferApi(dataTransferApi: CfnFlow.DataTransferApiProperty) {
    cdkBuilder.dataTransferApi(dataTransferApi)
  }

  public fun entityName(entityName: String) {
    cdkBuilder.entityName(entityName)
  }

  public fun build(): CfnFlow.CustomConnectorSourcePropertiesProperty = cdkBuilder.build()
}
