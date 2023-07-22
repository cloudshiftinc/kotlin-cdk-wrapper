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

  /**
   * @param certPolicyId Specifies the object identifier (OID) of the certificate policy under which
   * the certificate was issued. 
   * For more information, see NIST's definition of [Object Identifier
   * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
   */
  public fun certPolicyId(certPolicyId: String) {
    cdkBuilder.certPolicyId(certPolicyId)
  }

  /**
   * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
   * AWS Private CA supports the certification practice statement (CPS) qualifier.
   */
  public fun policyQualifiers(vararg policyQualifiers: Any) {
    _policyQualifiers.addAll(listOf(*policyQualifiers))
  }

  /**
   * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
   * AWS Private CA supports the certification practice statement (CPS) qualifier.
   */
  public fun policyQualifiers(policyQualifiers: Collection<Any>) {
    _policyQualifiers.addAll(policyQualifiers)
  }

  /**
   * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
   * AWS Private CA supports the certification practice statement (CPS) qualifier.
   */
  public fun policyQualifiers(policyQualifiers: IResolvable) {
    cdkBuilder.policyQualifiers(policyQualifiers)
  }

  public fun build(): CfnCertificate.PolicyInformationProperty {
    if(_policyQualifiers.isNotEmpty()) cdkBuilder.policyQualifiers(_policyQualifiers)
    return cdkBuilder.build()
  }
}
