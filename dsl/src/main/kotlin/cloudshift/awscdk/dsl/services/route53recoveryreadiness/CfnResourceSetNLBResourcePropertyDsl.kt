@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@CdkDslMarker
public class CfnResourceSetNLBResourcePropertyDsl {
  private val cdkBuilder: CfnResourceSet.NLBResourceProperty.Builder =
      CfnResourceSet.NLBResourceProperty.builder()

  /**
   * @param arn The Network Load Balancer resource Amazon Resource Name (ARN).
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnResourceSet.NLBResourceProperty = cdkBuilder.build()
}
