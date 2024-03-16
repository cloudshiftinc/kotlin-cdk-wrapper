@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Configuration for DKIM identity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * DkimIdentityConfig dkimIdentityConfig = DkimIdentityConfig.builder()
 * .domainSigningPrivateKey("domainSigningPrivateKey")
 * .domainSigningSelector("domainSigningSelector")
 * .nextSigningKeyLength(EasyDkimSigningKeyLength.RSA_1024_BIT)
 * .build();
 * ```
 */
public interface DkimIdentityConfig {
  /**
   * A private key that's used to generate a DKIM signature.
   *
   * Default: - use Easy DKIM
   */
  public fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

  /**
   * A string that's used to identify a public key in the DNS configuration for a domain.
   *
   * Default: - use Easy DKIM
   */
  public fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

  /**
   * The key length of the future DKIM key pair to be generated.
   *
   * This can be changed
   * at most once per day.
   *
   * Default: EasyDkimSigningKeyLength.RSA_2048_BIT
   */
  public fun nextSigningKeyLength(): EasyDkimSigningKeyLength? =
      unwrap(this).getNextSigningKeyLength()?.let(EasyDkimSigningKeyLength::wrap)

  /**
   * A builder for [DkimIdentityConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainSigningPrivateKey A private key that's used to generate a DKIM signature.
     */
    public fun domainSigningPrivateKey(domainSigningPrivateKey: String)

    /**
     * @param domainSigningSelector A string that's used to identify a public key in the DNS
     * configuration for a domain.
     */
    public fun domainSigningSelector(domainSigningSelector: String)

    /**
     * @param nextSigningKeyLength The key length of the future DKIM key pair to be generated.
     * This can be changed
     * at most once per day.
     */
    public fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DkimIdentityConfig.Builder =
        software.amazon.awscdk.services.ses.DkimIdentityConfig.builder()

    /**
     * @param domainSigningPrivateKey A private key that's used to generate a DKIM signature.
     */
    override fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
      cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
    }

    /**
     * @param domainSigningSelector A string that's used to identify a public key in the DNS
     * configuration for a domain.
     */
    override fun domainSigningSelector(domainSigningSelector: String) {
      cdkBuilder.domainSigningSelector(domainSigningSelector)
    }

    /**
     * @param nextSigningKeyLength The key length of the future DKIM key pair to be generated.
     * This can be changed
     * at most once per day.
     */
    override fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength) {
      cdkBuilder.nextSigningKeyLength(nextSigningKeyLength.let(EasyDkimSigningKeyLength::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DkimIdentityConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.DkimIdentityConfig,
  ) : CdkObject(cdkObject), DkimIdentityConfig {
    /**
     * A private key that's used to generate a DKIM signature.
     *
     * Default: - use Easy DKIM
     */
    override fun domainSigningPrivateKey(): String? = unwrap(this).getDomainSigningPrivateKey()

    /**
     * A string that's used to identify a public key in the DNS configuration for a domain.
     *
     * Default: - use Easy DKIM
     */
    override fun domainSigningSelector(): String? = unwrap(this).getDomainSigningSelector()

    /**
     * The key length of the future DKIM key pair to be generated.
     *
     * This can be changed
     * at most once per day.
     *
     * Default: EasyDkimSigningKeyLength.RSA_2048_BIT
     */
    override fun nextSigningKeyLength(): EasyDkimSigningKeyLength? =
        unwrap(this).getNextSigningKeyLength()?.let(EasyDkimSigningKeyLength::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DkimIdentityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimIdentityConfig):
        DkimIdentityConfig = CdkObjectWrappers.wrap(cdkObject) as DkimIdentityConfig

    internal fun unwrap(wrapped: DkimIdentityConfig):
        software.amazon.awscdk.services.ses.DkimIdentityConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.DkimIdentityConfig
  }
}
