@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.DkimIdentityConfig
import software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength

@CdkDslMarker
public class DkimIdentityConfigDsl {
  private val cdkBuilder: DkimIdentityConfig.Builder = DkimIdentityConfig.builder()

  /**
   * @param domainSigningPrivateKey A private key that's used to generate a DKIM signature.
   */
  public fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
    cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
  }

  /**
   * @param domainSigningSelector A string that's used to identify a public key in the DNS
   * configuration for a domain.
   */
  public fun domainSigningSelector(domainSigningSelector: String) {
    cdkBuilder.domainSigningSelector(domainSigningSelector)
  }

  /**
   * @param nextSigningKeyLength The key length of the future DKIM key pair to be generated.
   * This can be changed
   * at most once per day.
   */
  public fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength) {
    cdkBuilder.nextSigningKeyLength(nextSigningKeyLength)
  }

  public fun build(): DkimIdentityConfig = cdkBuilder.build()
}
