@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for BYO DKIM.
 *
 * Example:
 *
 * ```
 * IPublicHostedZone myHostedZone;
 * EmailIdentity.Builder.create(this, "Identity")
 * .identity(Identity.publicHostedZone(myHostedZone))
 * .dkimIdentity(DkimIdentity.byoDkim(ByoDkimOptions.builder()
 * .privateKey(SecretValue.secretsManager("dkim-private-key"))
 * .publicKey("...base64-encoded-public-key...")
 * .selector("selector")
 * .build()))
 * .build();
 * ```
 */
public interface ByoDkimOptions {
  /**
   * The private key that's used to generate a DKIM signature.
   */
  public fun privateKey(): SecretValue

  /**
   * The public key.
   *
   * If specified, a TXT record with the public key is created.
   *
   * Default: - the validation TXT record with the public key is not created
   */
  public fun publicKey(): String? = unwrap(this).getPublicKey()

  /**
   * A string that's used to identify a public key in the DNS configuration for a domain.
   */
  public fun selector(): String

  /**
   * A builder for [ByoDkimOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param privateKey The private key that's used to generate a DKIM signature. 
     */
    public fun privateKey(privateKey: SecretValue)

    /**
     * @param publicKey The public key.
     * If specified, a TXT record with the public key is created.
     */
    public fun publicKey(publicKey: String)

    /**
     * @param selector A string that's used to identify a public key in the DNS configuration for a
     * domain. 
     */
    public fun selector(selector: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ByoDkimOptions.Builder =
        software.amazon.awscdk.services.ses.ByoDkimOptions.builder()

    /**
     * @param privateKey The private key that's used to generate a DKIM signature. 
     */
    override fun privateKey(privateKey: SecretValue) {
      cdkBuilder.privateKey(privateKey.let(SecretValue.Companion::unwrap))
    }

    /**
     * @param publicKey The public key.
     * If specified, a TXT record with the public key is created.
     */
    override fun publicKey(publicKey: String) {
      cdkBuilder.publicKey(publicKey)
    }

    /**
     * @param selector A string that's used to identify a public key in the DNS configuration for a
     * domain. 
     */
    override fun selector(selector: String) {
      cdkBuilder.selector(selector)
    }

    public fun build(): software.amazon.awscdk.services.ses.ByoDkimOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ByoDkimOptions,
  ) : CdkObject(cdkObject), ByoDkimOptions {
    /**
     * The private key that's used to generate a DKIM signature.
     */
    override fun privateKey(): SecretValue = unwrap(this).getPrivateKey().let(SecretValue::wrap)

    /**
     * The public key.
     *
     * If specified, a TXT record with the public key is created.
     *
     * Default: - the validation TXT record with the public key is not created
     */
    override fun publicKey(): String? = unwrap(this).getPublicKey()

    /**
     * A string that's used to identify a public key in the DNS configuration for a domain.
     */
    override fun selector(): String = unwrap(this).getSelector()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ByoDkimOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ByoDkimOptions): ByoDkimOptions
        = CdkObjectWrappers.wrap(cdkObject) as? ByoDkimOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ByoDkimOptions): software.amazon.awscdk.services.ses.ByoDkimOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.ByoDkimOptions
  }
}
