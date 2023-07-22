@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnThingPrincipalAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnThingPrincipalAttachment.Builder =
      CfnThingPrincipalAttachment.Builder.create(scope, id)

  /**
   * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
   * operation) or an Amazon Cognito ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
   * @param principal The principal, which can be a certificate ARN (as returned from the
   * `CreateCertificate` operation) or an Amazon Cognito ID. 
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  /**
   * The name of the AWS IoT thing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
   * @param thingName The name of the AWS IoT thing. 
   */
  public fun thingName(thingName: String) {
    cdkBuilder.thingName(thingName)
  }

  public fun build(): CfnThingPrincipalAttachment = cdkBuilder.build()
}
