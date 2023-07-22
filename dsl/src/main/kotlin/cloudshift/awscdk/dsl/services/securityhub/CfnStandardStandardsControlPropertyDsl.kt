@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnStandard

@CdkDslMarker
public class CfnStandardStandardsControlPropertyDsl {
  private val cdkBuilder: CfnStandard.StandardsControlProperty.Builder =
      CfnStandard.StandardsControlProperty.builder()

  /**
   * @param reason A user-defined reason for changing a control's enablement status in a specified
   * standard.
   * If you are disabling a control, then this property is required.
   */
  public fun reason(reason: String) {
    cdkBuilder.reason(reason)
  }

  /**
   * @param standardsControlArn The Amazon Resource Name (ARN) of the control. 
   */
  public fun standardsControlArn(standardsControlArn: String) {
    cdkBuilder.standardsControlArn(standardsControlArn)
  }

  public fun build(): CfnStandard.StandardsControlProperty = cdkBuilder.build()
}
