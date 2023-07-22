@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps

@CdkDslMarker
public class CfnThingPrincipalAttachmentPropsDsl {
  private val cdkBuilder: CfnThingPrincipalAttachmentProps.Builder =
      CfnThingPrincipalAttachmentProps.builder()

  /**
   * @param principal The principal, which can be a certificate ARN (as returned from the
   * `CreateCertificate` operation) or an Amazon Cognito ID. 
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  /**
   * @param thingName The name of the AWS IoT thing. 
   */
  public fun thingName(thingName: String) {
    cdkBuilder.thingName(thingName)
  }

  public fun build(): CfnThingPrincipalAttachmentProps = cdkBuilder.build()
}
