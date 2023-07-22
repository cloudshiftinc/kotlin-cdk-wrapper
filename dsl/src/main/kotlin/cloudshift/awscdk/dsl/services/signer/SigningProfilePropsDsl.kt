@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.signer.Platform
import software.amazon.awscdk.services.signer.SigningProfileProps

@CdkDslMarker
public class SigningProfilePropsDsl {
  private val cdkBuilder: SigningProfileProps.Builder = SigningProfileProps.builder()

  /**
   * @param platform The Signing Platform available for signing profile. 
   */
  public fun platform(platform: Platform) {
    cdkBuilder.platform(platform)
  }

  /**
   * @param signatureValidity The validity period for signatures generated using this signing
   * profile.
   */
  public fun signatureValidity(signatureValidity: Duration) {
    cdkBuilder.signatureValidity(signatureValidity)
  }

  /**
   * @param signingProfileName Physical name of this Signing Profile.
   */
  public fun signingProfileName(signingProfileName: String) {
    cdkBuilder.signingProfileName(signingProfileName)
  }

  public fun build(): SigningProfileProps = cdkBuilder.build()
}
