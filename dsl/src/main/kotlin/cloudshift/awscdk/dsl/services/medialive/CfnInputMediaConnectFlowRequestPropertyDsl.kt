@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

@CdkDslMarker
public class CfnInputMediaConnectFlowRequestPropertyDsl {
  private val cdkBuilder: CfnInput.MediaConnectFlowRequestProperty.Builder =
      CfnInput.MediaConnectFlowRequestProperty.builder()

  /**
   * @param flowArn The ARN of one or two MediaConnect flows that are the sources for this
   * MediaConnect input.
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  public fun build(): CfnInput.MediaConnectFlowRequestProperty = cdkBuilder.build()
}
