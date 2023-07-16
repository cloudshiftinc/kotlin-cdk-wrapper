@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fms.CfnPolicy

@CdkDslMarker
public class CfnPolicySecurityServicePolicyDataPropertyDsl {
  private val cdkBuilder: CfnPolicy.SecurityServicePolicyDataProperty.Builder =
      CfnPolicy.SecurityServicePolicyDataProperty.builder()

  public fun managedServiceData(managedServiceData: String) {
    cdkBuilder.managedServiceData(managedServiceData)
  }

  public fun policyOption(policyOption: IResolvable) {
    cdkBuilder.policyOption(policyOption)
  }

  public fun policyOption(policyOption: CfnPolicy.PolicyOptionProperty) {
    cdkBuilder.policyOption(policyOption)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPolicy.SecurityServicePolicyDataProperty = cdkBuilder.build()
}
