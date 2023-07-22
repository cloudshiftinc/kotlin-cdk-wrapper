@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnPermissionSet

@CdkDslMarker
public class CfnPermissionSetPermissionsBoundaryPropertyDsl {
  private val cdkBuilder: CfnPermissionSet.PermissionsBoundaryProperty.Builder =
      CfnPermissionSet.PermissionsBoundaryProperty.builder()

  /**
   * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy.
   * You must have an IAM policy that matches the name and path in each AWS account where you want
   * to deploy your permission set.
   */
  public fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable) {
    cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference)
  }

  /**
   * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy.
   * You must have an IAM policy that matches the name and path in each AWS account where you want
   * to deploy your permission set.
   */
  public
      fun customerManagedPolicyReference(customerManagedPolicyReference: CfnPermissionSet.CustomerManagedPolicyReferenceProperty) {
    cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference)
  }

  /**
   * @param managedPolicyArn The AWS managed policy ARN that you want to attach to a permission set
   * as a permissions boundary.
   */
  public fun managedPolicyArn(managedPolicyArn: String) {
    cdkBuilder.managedPolicyArn(managedPolicyArn)
  }

  public fun build(): CfnPermissionSet.PermissionsBoundaryProperty = cdkBuilder.build()
}
