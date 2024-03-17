@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to configure an HTTPS Redirect.
 *
 * Example:
 *
 * ```
 * HttpsRedirect.Builder.create(this, "Redirect")
 * .recordNames(List.of("foo.example.com"))
 * .targetDomain("bar.example.com")
 * .zone(HostedZone.fromHostedZoneAttributes(this, "HostedZone", HostedZoneAttributes.builder()
 * .hostedZoneId("ID")
 * .zoneName("example.com")
 * .build()))
 * .build();
 * ```
 */
public interface HttpsRedirectProps {
  /**
   * The AWS Certificate Manager (ACM) certificate that will be associated with the CloudFront
   * distribution that will be created.
   *
   * If provided, the certificate must be
   * stored in us-east-1 (N. Virginia)
   *
   * Default: - A new certificate is created in us-east-1 (N. Virginia)
   */
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  /**
   * The domain names that will redirect to `targetDomain`.
   *
   * Default: - the domain name of the hosted zone
   */
  public fun recordNames(): List<String> = unwrap(this).getRecordNames() ?: emptyList()

  /**
   * The redirect target fully qualified domain name (FQDN).
   *
   * An alias record
   * will be created that points to your CloudFront distribution. Root domain
   * or sub-domain can be supplied.
   */
  public fun targetDomain(): String

  /**
   * Hosted zone of the domain which will be used to create alias record(s) from domain names in the
   * hosted zone to the target domain.
   *
   * The hosted zone must
   * contain entries for the domain name(s) supplied through `recordNames` that
   * will redirect to the target domain.
   *
   * Domain names in the hosted zone can include a specific domain (example.com)
   * and its subdomains (acme.example.com, zenith.example.com).
   */
  public fun zone(): IHostedZone

  /**
   * A builder for [HttpsRedirectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The AWS Certificate Manager (ACM) certificate that will be associated with
     * the CloudFront distribution that will be created.
     * If provided, the certificate must be
     * stored in us-east-1 (N. Virginia)
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param recordNames The domain names that will redirect to `targetDomain`.
     */
    public fun recordNames(recordNames: List<String>)

    /**
     * @param recordNames The domain names that will redirect to `targetDomain`.
     */
    public fun recordNames(vararg recordNames: String)

    /**
     * @param targetDomain The redirect target fully qualified domain name (FQDN). 
     * An alias record
     * will be created that points to your CloudFront distribution. Root domain
     * or sub-domain can be supplied.
     */
    public fun targetDomain(targetDomain: String)

    /**
     * @param zone Hosted zone of the domain which will be used to create alias record(s) from
     * domain names in the hosted zone to the target domain. 
     * The hosted zone must
     * contain entries for the domain name(s) supplied through `recordNames` that
     * will redirect to the target domain.
     *
     * Domain names in the hosted zone can include a specific domain (example.com)
     * and its subdomains (acme.example.com, zenith.example.com).
     */
    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps.Builder =
        software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps.builder()

    /**
     * @param certificate The AWS Certificate Manager (ACM) certificate that will be associated with
     * the CloudFront distribution that will be created.
     * If provided, the certificate must be
     * stored in us-east-1 (N. Virginia)
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param recordNames The domain names that will redirect to `targetDomain`.
     */
    override fun recordNames(recordNames: List<String>) {
      cdkBuilder.recordNames(recordNames)
    }

    /**
     * @param recordNames The domain names that will redirect to `targetDomain`.
     */
    override fun recordNames(vararg recordNames: String): Unit = recordNames(recordNames.toList())

    /**
     * @param targetDomain The redirect target fully qualified domain name (FQDN). 
     * An alias record
     * will be created that points to your CloudFront distribution. Root domain
     * or sub-domain can be supplied.
     */
    override fun targetDomain(targetDomain: String) {
      cdkBuilder.targetDomain(targetDomain)
    }

    /**
     * @param zone Hosted zone of the domain which will be used to create alias record(s) from
     * domain names in the hosted zone to the target domain. 
     * The hosted zone must
     * contain entries for the domain name(s) supplied through `recordNames` that
     * will redirect to the target domain.
     *
     * Domain names in the hosted zone can include a specific domain (example.com)
     * and its subdomains (acme.example.com, zenith.example.com).
     */
    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps,
  ) : CdkObject(cdkObject), HttpsRedirectProps {
    /**
     * The AWS Certificate Manager (ACM) certificate that will be associated with the CloudFront
     * distribution that will be created.
     *
     * If provided, the certificate must be
     * stored in us-east-1 (N. Virginia)
     *
     * Default: - A new certificate is created in us-east-1 (N. Virginia)
     */
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    /**
     * The domain names that will redirect to `targetDomain`.
     *
     * Default: - the domain name of the hosted zone
     */
    override fun recordNames(): List<String> = unwrap(this).getRecordNames() ?: emptyList()

    /**
     * The redirect target fully qualified domain name (FQDN).
     *
     * An alias record
     * will be created that points to your CloudFront distribution. Root domain
     * or sub-domain can be supplied.
     */
    override fun targetDomain(): String = unwrap(this).getTargetDomain()

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
     */
    override fun zone(): IHostedZone = unwrap(this).getZone().let(IHostedZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpsRedirectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps):
        HttpsRedirectProps = CdkObjectWrappers.wrap(cdkObject) as? HttpsRedirectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpsRedirectProps):
        software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps
  }
}
