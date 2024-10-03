@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * Properties used for the Trust Store.
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
 * .ignoreClientCertificateExpiry(false)
 * .mutualAuthenticationMode(MutualAuthenticationMode.VERIFY)
 * .trustStore(trustStore)
 * .build())
 * .defaultAction(ListenerAction.fixedResponse(200,
 * FixedResponseOptions.builder().contentType("text/plain").messageBody("Success mTLS").build()))
 * .build());
 * ```
 */
public interface TrustStoreProps {
  /**
   * The bucket that the trust store is hosted in.
   */
  public fun bucket(): IBucket

  /**
   * The key in S3 to look at for the trust store.
   */
  public fun key(): String

  /**
   * The name of the trust store.
   *
   * Default: - Auto generated
   */
  public fun trustStoreName(): String? = unwrap(this).getTrustStoreName()

  /**
   * The version of the S3 object that contains your truststore.
   *
   * To specify a version, you must have versioning enabled for the S3 bucket.
   *
   * Default: - latest version
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [TrustStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The bucket that the trust store is hosted in. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param key The key in S3 to look at for the trust store. 
     */
    public fun key(key: String)

    /**
     * @param trustStoreName The name of the trust store.
     */
    public fun trustStoreName(trustStoreName: String)

    /**
     * @param version The version of the S3 object that contains your truststore.
     * To specify a version, you must have versioning enabled for the S3 bucket.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps.builder()

    /**
     * @param bucket The bucket that the trust store is hosted in. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param key The key in S3 to look at for the trust store. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param trustStoreName The name of the trust store.
     */
    override fun trustStoreName(trustStoreName: String) {
      cdkBuilder.trustStoreName(trustStoreName)
    }

    /**
     * @param version The version of the S3 object that contains your truststore.
     * To specify a version, you must have versioning enabled for the S3 bucket.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps,
  ) : CdkObject(cdkObject),
      TrustStoreProps {
    /**
     * The bucket that the trust store is hosted in.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The key in S3 to look at for the trust store.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * The name of the trust store.
     *
     * Default: - Auto generated
     */
    override fun trustStoreName(): String? = unwrap(this).getTrustStoreName()

    /**
     * The version of the S3 object that contains your truststore.
     *
     * To specify a version, you must have versioning enabled for the S3 bucket.
     *
     * Default: - latest version
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TrustStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps):
        TrustStoreProps = CdkObjectWrappers.wrap(cdkObject) as? TrustStoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrustStoreProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreProps
  }
}
