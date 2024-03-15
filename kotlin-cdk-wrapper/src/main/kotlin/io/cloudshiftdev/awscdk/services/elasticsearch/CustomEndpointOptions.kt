@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface CustomEndpointOptions {
  @Deprecated(message = "deprecated in CDK")
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun domainName(): String

  @Deprecated(message = "deprecated in CDK")
  public fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun certificate(certificate: ICertificate)

    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun hostedZone(hostedZone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions,
  ) : CdkObject(cdkObject), CustomEndpointOptions {
    @Deprecated(message = "deprecated in CDK")
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun domainName(): String = unwrap(this).getDomainName()

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
        CustomEndpointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomEndpointOptions):
        software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions
  }
}
