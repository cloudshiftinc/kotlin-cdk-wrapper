package io.cloudshiftdev.awscdk.services.route53.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpsRedirect internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirect,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.patterns.HttpsRedirect].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS Certificate Manager (ACM) certificate that will be associated with the CloudFront
     * distribution that will be created.
     *
     * If provided, the certificate must be
     * stored in us-east-1 (N. Virginia)
     *
     * Default: - A new certificate is created in us-east-1 (N. Virginia)
     *
     * @param certificate The AWS Certificate Manager (ACM) certificate that will be associated with
     * the CloudFront distribution that will be created. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * The domain names that will redirect to `targetDomain`.
     *
     * Default: - the domain name of the hosted zone
     *
     * @param recordNames The domain names that will redirect to `targetDomain`. 
     */
    public fun recordNames(recordNames: List<String>)

    /**
     * The domain names that will redirect to `targetDomain`.
     *
     * Default: - the domain name of the hosted zone
     *
     * @param recordNames The domain names that will redirect to `targetDomain`. 
     */
    public fun recordNames(vararg recordNames: String)

    /**
     * The redirect target fully qualified domain name (FQDN).
     *
     * An alias record
     * will be created that points to your CloudFront distribution. Root domain
     * or sub-domain can be supplied.
     *
     * @param targetDomain The redirect target fully qualified domain name (FQDN). 
     */
    public fun targetDomain(targetDomain: String)

    /**
     * Hosted zone of the domain which will be used to create alias record(s) from domain names in
     * the hosted zone to the target domain.
     *
     * The hosted zone must
     * contain entries for the domain name(s) supplied through `recordNames` that
     * will redirect to the target domain.
     *
     * Domain names in the hosted zone can include a specific domain (example.com)
     * and its subdomains (acme.example.com, zenith.example.com).
     *
     * @param zone Hosted zone of the domain which will be used to create alias record(s) from
     * domain names in the hosted zone to the target domain. 
     */
    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder =
        software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder.create(scope, id)

    /**
     * The AWS Certificate Manager (ACM) certificate that will be associated with the CloudFront
     * distribution that will be created.
     *
     * If provided, the certificate must be
     * stored in us-east-1 (N. Virginia)
     *
     * Default: - A new certificate is created in us-east-1 (N. Virginia)
     *
     * @param certificate The AWS Certificate Manager (ACM) certificate that will be associated with
     * the CloudFront distribution that will be created. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * The domain names that will redirect to `targetDomain`.
     *
     * Default: - the domain name of the hosted zone
     *
     * @param recordNames The domain names that will redirect to `targetDomain`. 
     */
    override fun recordNames(recordNames: List<String>) {
      cdkBuilder.recordNames(recordNames)
    }

    /**
     * The domain names that will redirect to `targetDomain`.
     *
     * Default: - the domain name of the hosted zone
     *
     * @param recordNames The domain names that will redirect to `targetDomain`. 
     */
    override fun recordNames(vararg recordNames: String): Unit = recordNames(recordNames.toList())

    /**
     * The redirect target fully qualified domain name (FQDN).
     *
     * An alias record
     * will be created that points to your CloudFront distribution. Root domain
     * or sub-domain can be supplied.
     *
     * @param targetDomain The redirect target fully qualified domain name (FQDN). 
     */
    override fun targetDomain(targetDomain: String) {
      cdkBuilder.targetDomain(targetDomain)
    }

    /**
     * Hosted zone of the domain which will be used to create alias record(s) from domain names in
     * the hosted zone to the target domain.
     *
     * The hosted zone must
     * contain entries for the domain name(s) supplied through `recordNames` that
     * will redirect to the target domain.
     *
     * Domain names in the hosted zone can include a specific domain (example.com)
     * and its subdomains (acme.example.com, zenith.example.com).
     *
     * @param zone Hosted zone of the domain which will be used to create alias record(s) from
     * domain names in the hosted zone to the target domain. 
     */
    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.patterns.HttpsRedirect =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpsRedirect {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpsRedirect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirect):
        HttpsRedirect = HttpsRedirect(cdkObject)

    internal fun unwrap(wrapped: HttpsRedirect):
        software.amazon.awscdk.services.route53.patterns.HttpsRedirect = wrapped.cdkObject
  }
}
