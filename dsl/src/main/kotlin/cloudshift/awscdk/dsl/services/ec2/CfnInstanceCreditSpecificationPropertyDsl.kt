@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceCreditSpecificationPropertyDsl {
  private val cdkBuilder: CfnInstance.CreditSpecificationProperty.Builder =
      CfnInstance.CreditSpecificationProperty.builder()

  /**
   * @param cpuCredits The credit option for CPU usage of the instance.
   * Valid values: `standard` | `unlimited`
   *
   * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
   */
  public fun cpuCredits(cpuCredits: String) {
    cdkBuilder.cpuCredits(cpuCredits)
  }

  public fun build(): CfnInstance.CreditSpecificationProperty = cdkBuilder.build()
}
