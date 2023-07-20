@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowDataTransferApiPropertyDsl {
  private val cdkBuilder: CfnFlow.DataTransferApiProperty.Builder =
      CfnFlow.DataTransferApiProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnFlow.DataTransferApiProperty = cdkBuilder.build()
}
