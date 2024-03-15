@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit

/**
 * Configures a custom domain endpoint for the Amazon OpenSearch Service domain.
 *
 * Example:
 *
 * ```
 * Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .customEndpoint(CustomEndpointOptions.builder()
 * .domainName("search.example.com")
 * .build())
 * .build();
 * ```
 */
public interface CustomEndpointOptions {
  /**
   * The certificate to use.
   *
   * Default: - create a new one
   */
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  /**
   * The custom domain name to assign.
   */
  public fun domainName(): String

  /**
   * The hosted zone in Route53 to create the CNAME record in.
   *
   * Default: - do not create a CNAME
   */
  public fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

  /**
   * A builder for [CustomEndpointOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The certificate to use.
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param domainName The custom domain name to assign. 
     */
    public fun domainName(domainName: String)

    /**
     * @param hostedZone The hosted zone in Route53 to create the CNAME record in.
     */
    public fun hostedZone(hostedZone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions.builder()

    /**
     * @param certificate The certificate to use.
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param domainName The custom domain name to assign. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param hostedZone The hosted zone in Route53 to create the CNAME record in.
     */
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions,
  ) : CdkObject(cdkObject), CustomEndpointOptions {
    /**
     * The certificate to use.
     *
     * Default: - create a new one
     */
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    /**
     * The custom domain name to assign.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The hosted zone in Route53 to create the CNAME record in.
     *
     * Default: - do not create a CNAME
     */
    override fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions):
        CustomEndpointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomEndpointOptions):
        software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions
  }
}
