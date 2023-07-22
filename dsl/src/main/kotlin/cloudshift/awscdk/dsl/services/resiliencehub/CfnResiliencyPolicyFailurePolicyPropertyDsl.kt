@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy

/**
 * Defines a failure policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * FailurePolicyProperty failurePolicyProperty = FailurePolicyProperty.builder()
 * .rpoInSecs(123)
 * .rtoInSecs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-resiliencypolicy-failurepolicy.html)
 */
@CdkDslMarker
public class CfnResiliencyPolicyFailurePolicyPropertyDsl {
  private val cdkBuilder: CfnResiliencyPolicy.FailurePolicyProperty.Builder =
      CfnResiliencyPolicy.FailurePolicyProperty.builder()

  /**
   * @param rpoInSecs The Recovery Point Objective (RPO), in seconds. 
   */
  public fun rpoInSecs(rpoInSecs: Number) {
    cdkBuilder.rpoInSecs(rpoInSecs)
  }

  /**
   * @param rtoInSecs The Recovery Time Objective (RTO), in seconds. 
   */
  public fun rtoInSecs(rtoInSecs: Number) {
    cdkBuilder.rtoInSecs(rtoInSecs)
  }

  public fun build(): CfnResiliencyPolicy.FailurePolicyProperty = cdkBuilder.build()
}
