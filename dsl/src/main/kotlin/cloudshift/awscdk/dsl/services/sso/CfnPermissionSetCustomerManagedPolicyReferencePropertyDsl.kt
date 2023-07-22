@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sso.CfnPermissionSet

@CdkDslMarker
public class CfnPermissionSetCustomerManagedPolicyReferencePropertyDsl {
  private val cdkBuilder: CfnPermissionSet.CustomerManagedPolicyReferenceProperty.Builder =
      CfnPermissionSet.CustomerManagedPolicyReferenceProperty.builder()

  /**
   * @param name The name of the IAM policy that you have configured in each account where you want
   * to deploy your permission set. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param path The path to the IAM policy that you have configured in each account where you want
   * to deploy your permission set.
   * The default is `/` . For more information, see [Friendly names and
   * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
   * in the *IAM User Guide* .
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnPermissionSet.CustomerManagedPolicyReferenceProperty = cdkBuilder.build()
}
