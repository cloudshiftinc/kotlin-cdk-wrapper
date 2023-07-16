@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig

@CdkDslMarker
public class CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl {
  private val cdkBuilder: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder =
      CfnCodeSigningConfig.CodeSigningPoliciesProperty.builder()

  public fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: String) {
    cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
  }

  public fun build(): CfnCodeSigningConfig.CodeSigningPoliciesProperty = cdkBuilder.build()
}
