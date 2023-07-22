@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

@CdkDslMarker
public class CfnVerifiedAccessInstanceVerifiedAccessTrustProviderPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.Builder =
      CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.builder()

  /**
   * @param description A description for the AWS Verified Access trust provider.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param deviceTrustProviderType The type of device-based trust provider.
   */
  public fun deviceTrustProviderType(deviceTrustProviderType: String) {
    cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
  }

  /**
   * @param trustProviderType The type of Verified Access trust provider.
   */
  public fun trustProviderType(trustProviderType: String) {
    cdkBuilder.trustProviderType(trustProviderType)
  }

  /**
   * @param userTrustProviderType The type of user-based trust provider.
   */
  public fun userTrustProviderType(userTrustProviderType: String) {
    cdkBuilder.userTrustProviderType(userTrustProviderType)
  }

  /**
   * @param verifiedAccessTrustProviderId The ID of the AWS Verified Access trust provider.
   */
  public fun verifiedAccessTrustProviderId(verifiedAccessTrustProviderId: String) {
    cdkBuilder.verifiedAccessTrustProviderId(verifiedAccessTrustProviderId)
  }

  public fun build(): CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty =
      cdkBuilder.build()
}
