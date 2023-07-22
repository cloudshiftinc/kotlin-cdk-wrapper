@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.CfnPermissionProps

@CdkDslMarker
public class CfnPermissionPropsDsl {
  private val cdkBuilder: CfnPermissionProps.Builder = CfnPermissionProps.builder()

  private val _actions: MutableList<String> = mutableListOf()

  /**
   * @param actions The private CA actions that can be performed by the designated AWS service. 
   * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
   */
  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The private CA actions that can be performed by the designated AWS service. 
   * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
   */
  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  /**
   * @param certificateAuthorityArn The Amazon Resource Number (ARN) of the private CA from which
   * the permission was issued. 
   */
  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  /**
   * @param principal The AWS service or entity that holds the permission. 
   * At this time, the only valid principal is `acm.amazonaws.com` .
   */
  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  /**
   * @param sourceAccount The ID of the account that assigned the permission.
   */
  public fun sourceAccount(sourceAccount: String) {
    cdkBuilder.sourceAccount(sourceAccount)
  }

  public fun build(): CfnPermissionProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
