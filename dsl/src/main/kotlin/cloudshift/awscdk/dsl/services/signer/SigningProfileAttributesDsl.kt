@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.signer.SigningProfileAttributes

@CdkDslMarker
public class SigningProfileAttributesDsl {
  private val cdkBuilder: SigningProfileAttributes.Builder = SigningProfileAttributes.builder()

  /**
   * @param signingProfileName The name of signing profile. 
   */
  public fun signingProfileName(signingProfileName: String) {
    cdkBuilder.signingProfileName(signingProfileName)
  }

  /**
   * @param signingProfileVersion The version of signing profile. 
   */
  public fun signingProfileVersion(signingProfileVersion: String) {
    cdkBuilder.signingProfileVersion(signingProfileVersion)
  }

  public fun build(): SigningProfileAttributes = cdkBuilder.build()
}
