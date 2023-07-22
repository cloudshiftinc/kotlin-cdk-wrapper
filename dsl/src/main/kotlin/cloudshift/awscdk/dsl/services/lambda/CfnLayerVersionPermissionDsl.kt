@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.constructs.Construct

@CdkDslMarker
public class CfnLayerVersionPermissionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLayerVersionPermission.Builder =
      CfnLayerVersionPermission.Builder.create(scope, id)

  /**
   * The API action that grants access to the layer.
   *
   * For example, `lambda:GetLayerVersion` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-action)
   * @param action The API action that grants access to the layer. 
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * The name or Amazon Resource Name (ARN) of the layer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-layerversionarn)
   * @param layerVersionArn The name or Amazon Resource Name (ARN) of the layer. 
   */
  public fun layerVersionArn(layerVersionArn: String) {
    cdkBuilder.layerVersionArn(layerVersionArn)
  }

  /**
   * With the principal set to `*` , grant permission to all accounts in the specified organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-organizationid)
   * @param organizationId With the principal set to `*` , grant permission to all accounts in the
   * specified organization. 
   */
  public fun organizationId(organizationId: String) {
    cdkBuilder.organizationId(organizationId)
  }

  /**
   * An account ID, or `*` to grant layer usage permission to all accounts in an organization, or
   * all AWS accounts (if `organizationId` is not specified).
   *
   * For the last case, make sure that you really do want all AWS accounts to have usage permission
   * to this layer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversionpermission.html#cfn-lambda-layerversionpermission-principal)
   * @param principal An account ID, or `*` to grant layer usage permission to all accounts in an
   * organization, or all AWS accounts (if `organizationId` is not specified). 
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnLayerVersionPermission = cdkBuilder.build()
}
