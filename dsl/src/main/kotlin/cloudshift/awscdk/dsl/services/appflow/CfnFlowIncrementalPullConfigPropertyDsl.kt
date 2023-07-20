@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowIncrementalPullConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.IncrementalPullConfigProperty.Builder =
      CfnFlow.IncrementalPullConfigProperty.builder()

  public fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
    cdkBuilder.datetimeTypeFieldName(datetimeTypeFieldName)
  }

  public fun build(): CfnFlow.IncrementalPullConfigProperty = cdkBuilder.build()
}
