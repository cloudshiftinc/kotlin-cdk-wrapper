@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificatePolicyInformationPropertyDsl {
  private val cdkBuilder: CfnCertificate.PolicyInformationProperty.Builder =
      CfnCertificate.PolicyInformationProperty.builder()

  private val _policyQualifiers: MutableList<Any> = mutableListOf()

  public fun certPolicyId(certPolicyId: String) {
    cdkBuilder.certPolicyId(certPolicyId)
  }

  public fun policyQualifiers(vararg policyQualifiers: Any) {
    _policyQualifiers.addAll(listOf(*policyQualifiers))
  }

  public fun policyQualifiers(policyQualifiers: Collection<Any>) {
    _policyQualifiers.addAll(policyQualifiers)
  }

  public fun policyQualifiers(policyQualifiers: IResolvable) {
    cdkBuilder.policyQualifiers(policyQualifiers)
  }

  public fun build(): CfnCertificate.PolicyInformationProperty {
    if(_policyQualifiers.isNotEmpty()) cdkBuilder.policyQualifiers(_policyQualifiers)
    return cdkBuilder.build()
  }
}
