@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

/**
 * (deprecated) Configures a custom domain endpoint for the ES domain.
 *
 * Example:
 *
 * ```
 * Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_7)
 * .customEndpoint(CustomEndpointOptions.builder()
 * .domainName("search.example.com")
 * .build())
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
public interface CustomEndpointOptions {
  /**
   * (deprecated) The certificate to use.
   *
   * Default: - create a new one
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  /**
   * (deprecated) The custom domain name to assign.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainName(): String

  /**
   * (deprecated) The hosted zone in Route53 to create the CNAME record in.
   *
   * Default: - do not create a CNAME
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

  /**
   * A builder for [CustomEndpointOptions]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param certificate The certificate to use.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun certificate(certificate: ICertificate)

    /**
     * @param domainName The custom domain name to assign. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String)

    /**
     * @param hostedZone The hosted zone in Route53 to create the CNAME record in.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun hostedZone(hostedZone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions.builder()

    /**
     * @param certificate The certificate to use.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * @param domainName The custom domain name to assign. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param hostedZone The hosted zone in Route53 to create the CNAME record in.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions,
  ) : CdkObject(cdkObject), CustomEndpointOptions {
    /**
     * (deprecated) The certificate to use.
     *
     * Default: - create a new one
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    /**
     * (deprecated) The custom domain name to assign.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * (deprecated) The hosted zone in Route53 to create the CNAME record in.
     *
     * Default: - do not create a CNAME
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions):
        CustomEndpointOptions = CdkObjectWrappers.wrap(cdkObject) as? CustomEndpointOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomEndpointOptions):
        software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions
  }
}
