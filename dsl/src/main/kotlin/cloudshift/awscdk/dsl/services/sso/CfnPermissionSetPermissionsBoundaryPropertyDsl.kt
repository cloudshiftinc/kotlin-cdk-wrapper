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

  public fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable) {
    cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference)
  }

  public
      fun customerManagedPolicyReference(customerManagedPolicyReference: CfnPermissionSet.CustomerManagedPolicyReferenceProperty) {
    cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference)
  }

  public fun managedPolicyArn(managedPolicyArn: String) {
    cdkBuilder.managedPolicyArn(managedPolicyArn)
  }

  public fun build(): CfnPermissionSet.PermissionsBoundaryProperty = cdkBuilder.build()
}
