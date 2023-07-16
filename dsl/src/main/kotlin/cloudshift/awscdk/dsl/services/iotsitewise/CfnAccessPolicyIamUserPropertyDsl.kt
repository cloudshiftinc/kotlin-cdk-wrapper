@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyIamUserPropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.IamUserProperty.Builder =
      CfnAccessPolicy.IamUserProperty.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnAccessPolicy.IamUserProperty = cdkBuilder.build()
}
