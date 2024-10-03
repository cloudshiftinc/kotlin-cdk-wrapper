@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new Trust Store.
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
public open class TrustStore(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore,
) : Resource(cdkObject),
    ITrustStore {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TrustStoreProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TrustStoreProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TrustStoreProps.Builder.() -> Unit,
  ) : this(scope, id, TrustStoreProps(props)
  )

  /**
   * The number of CA certificates in the trust store.
   */
  public open fun numberOfCaCertificates(): Number = unwrap(this).getNumberOfCaCertificates()

  /**
   * The status of the trust store.
   */
  public open fun status(): String = unwrap(this).getStatus()

  /**
   * The ARN of the trust store.
   */
  public override fun trustStoreArn(): String = unwrap(this).getTrustStoreArn()

  /**
   * The name of the trust store.
   */
  public override fun trustStoreName(): String = unwrap(this).getTrustStoreName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.TrustStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The bucket that the trust store is hosted in.
     *
     * @param bucket The bucket that the trust store is hosted in. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * The key in S3 to look at for the trust store.
     *
     * @param key The key in S3 to look at for the trust store. 
     */
    public fun key(key: String)

    /**
     * The name of the trust store.
     *
     * Default: - Auto generated
     *
     * @param trustStoreName The name of the trust store. 
     */
    public fun trustStoreName(trustStoreName: String)

    /**
     * The version of the S3 object that contains your truststore.
     *
     * To specify a version, you must have versioning enabled for the S3 bucket.
     *
     * Default: - latest version
     *
     * @param version The version of the S3 object that contains your truststore. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore.Builder.create(scope, id)

    /**
     * The bucket that the trust store is hosted in.
     *
     * @param bucket The bucket that the trust store is hosted in. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * The key in S3 to look at for the trust store.
     *
     * @param key The key in S3 to look at for the trust store. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * The name of the trust store.
     *
     * Default: - Auto generated
     *
     * @param trustStoreName The name of the trust store. 
     */
    override fun trustStoreName(trustStoreName: String) {
      cdkBuilder.trustStoreName(trustStoreName)
    }

    /**
     * The version of the S3 object that contains your truststore.
     *
     * To specify a version, you must have versioning enabled for the S3 bucket.
     *
     * Default: - latest version
     *
     * @param version The version of the S3 object that contains your truststore. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromTrustStoreArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      trustStoreArn: String,
    ): ITrustStore =
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore.fromTrustStoreArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, trustStoreArn).let(ITrustStore::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TrustStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TrustStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore):
        TrustStore = TrustStore(cdkObject)

    internal fun unwrap(wrapped: TrustStore):
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.TrustStore
  }
}
