@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig

@CdkDslMarker
public class CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl {
  private val cdkBuilder: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder =
      CfnCodeSigningConfig.CodeSigningPoliciesProperty.builder()

  /**
   * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
   * validation failure. 
   * If you set the policy to `Enforce` , Lambda blocks the deployment request if signature
   * validation checks fail. If you set the policy to `Warn` , Lambda allows the deployment and creates
   * a CloudWatch log.
   *
   * Default value: `Warn`
   */
  public fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: String) {
    cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
  }

  public fun build(): CfnCodeSigningConfig.CodeSigningPoliciesProperty = cdkBuilder.build()
}
