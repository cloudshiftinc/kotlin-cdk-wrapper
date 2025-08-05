@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * The mutual authentication configuration information.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * Certificate certificate;
 * ApplicationLoadBalancer lb;
 * Bucket bucket;
 * TrustStore trustStore = TrustStore.Builder.create(this, "Store")
 * .bucket(bucket)
 * .key("rootCA_cert.pem")
 * .build();
 * lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(443)
 * .protocol(ApplicationProtocol.HTTPS)
 * .certificates(List.of(certificate))
 * // mTLS settings
 * .mutualAuthentication(MutualAuthentication.builder()
 * .advertiseTrustStoreCaNames(true)
 * .ignoreClientCertificateExpiry(false)
 * .mutualAuthenticationMode(MutualAuthenticationMode.VERIFY)
 * .trustStore(trustStore)
 * .build())
 * .defaultAction(ListenerAction.fixedResponse(200,
 * FixedResponseOptions.builder().contentType("text/plain").messageBody("Success mTLS").build()))
 * .build());
 * ```
 */
public interface MutualAuthentication {
  /**
   * Indicates whether trust store CA names are advertised.
   *
   * Default: false
   */
  public fun advertiseTrustStoreCaNames(): Boolean? = unwrap(this).getAdvertiseTrustStoreCaNames()

  /**
   * Indicates whether expired client certificates are ignored.
   *
   * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
   *
   * Default: false
   */
  public fun ignoreClientCertificateExpiry(): Boolean? =
      unwrap(this).getIgnoreClientCertificateExpiry()

  /**
   * The client certificate handling method.
   *
   * Default: MutualAuthenticationMode.OFF
   */
  public fun mutualAuthenticationMode(): MutualAuthenticationMode? =
      unwrap(this).getMutualAuthenticationMode()?.let(MutualAuthenticationMode::wrap)

  /**
   * The trust store.
   *
   * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
   *
   * Default: - no trust store
   */
  public fun trustStore(): ITrustStore? = unwrap(this).getTrustStore()?.let(ITrustStore::wrap)

  /**
   * A builder for [MutualAuthentication]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param advertiseTrustStoreCaNames Indicates whether trust store CA names are advertised.
     */
    public fun advertiseTrustStoreCaNames(advertiseTrustStoreCaNames: Boolean)

    /**
     * @param ignoreClientCertificateExpiry Indicates whether expired client certificates are
     * ignored.
     * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
     */
    public fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: Boolean)

    /**
     * @param mutualAuthenticationMode The client certificate handling method.
     */
    public fun mutualAuthenticationMode(mutualAuthenticationMode: MutualAuthenticationMode)

    /**
     * @param trustStore The trust store.
     * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
     */
    public fun trustStore(trustStore: ITrustStore)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthentication.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthentication.builder()

    /**
     * @param advertiseTrustStoreCaNames Indicates whether trust store CA names are advertised.
     */
    override fun advertiseTrustStoreCaNames(advertiseTrustStoreCaNames: Boolean) {
      cdkBuilder.advertiseTrustStoreCaNames(advertiseTrustStoreCaNames)
    }

    /**
     * @param ignoreClientCertificateExpiry Indicates whether expired client certificates are
     * ignored.
     * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
     */
    override fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: Boolean) {
      cdkBuilder.ignoreClientCertificateExpiry(ignoreClientCertificateExpiry)
    }

    /**
     * @param mutualAuthenticationMode The client certificate handling method.
     */
    override fun mutualAuthenticationMode(mutualAuthenticationMode: MutualAuthenticationMode) {
      cdkBuilder.mutualAuthenticationMode(mutualAuthenticationMode.let(MutualAuthenticationMode.Companion::unwrap))
    }

    /**
     * @param trustStore The trust store.
     * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
     */
    override fun trustStore(trustStore: ITrustStore) {
      cdkBuilder.trustStore(trustStore.let(ITrustStore.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthentication
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthentication,
  ) : CdkObject(cdkObject),
      MutualAuthentication {
    /**
     * Indicates whether trust store CA names are advertised.
     *
     * Default: false
     */
    override fun advertiseTrustStoreCaNames(): Boolean? =
        unwrap(this).getAdvertiseTrustStoreCaNames()

    /**
     * Indicates whether expired client certificates are ignored.
     *
     * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
     *
     * Default: false
     */
    override fun ignoreClientCertificateExpiry(): Boolean? =
        unwrap(this).getIgnoreClientCertificateExpiry()

    /**
     * The client certificate handling method.
     *
     * Default: MutualAuthenticationMode.OFF
     */
    override fun mutualAuthenticationMode(): MutualAuthenticationMode? =
        unwrap(this).getMutualAuthenticationMode()?.let(MutualAuthenticationMode::wrap)

    /**
     * The trust store.
     *
     * Cannot be used with MutualAuthenticationMode.OFF or MutualAuthenticationMode.PASS_THROUGH
     *
     * Default: - no trust store
     */
    override fun trustStore(): ITrustStore? = unwrap(this).getTrustStore()?.let(ITrustStore::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MutualAuthentication {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthentication):
        MutualAuthentication = CdkObjectWrappers.wrap(cdkObject) as? MutualAuthentication ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MutualAuthentication):
        software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthentication = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthentication
  }
}
