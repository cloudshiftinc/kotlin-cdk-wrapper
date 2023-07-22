@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.CfnPermission
import software.constructs.Construct

@CdkDslMarker
public class CfnPermissionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPermission.Builder = CfnPermission.Builder.create(scope, id)

  private val _actions: MutableList<String> = mutableListOf()

  /**
   * The private CA actions that can be performed by the designated AWS service.
   *
   * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
   * @param actions The private CA actions that can be performed by the designated AWS service. 
   */
  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * The private CA actions that can be performed by the designated AWS service.
   *
   * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
   * @param actions The private CA actions that can be performed by the designated AWS service. 
   */
  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  /**
   * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-certificateauthorityarn)
   * @param certificateAuthorityArn The Amazon Resource Number (ARN) of the private CA from which
   * the permission was issued. 
   */
  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  /**
   * The AWS service or entity that holds the permission.
   *
   * At this time, the only valid principal is `acm.amazonaws.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-principal)
   * @param principal The AWS service or entity that holds the permission. 
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  /**
   * The ID of the account that assigned the permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-sourceaccount)
   * @param sourceAccount The ID of the account that assigned the permission. 
   */
  public fun sourceAccount(sourceAccount: String) {
    cdkBuilder.sourceAccount(sourceAccount)
  }

  public fun build(): CfnPermission {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
