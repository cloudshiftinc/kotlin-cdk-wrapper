@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CloudFrontWebDistributionProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

  public fun enableIpV6(): Boolean? = unwrap(this).getEnableIpV6()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun errorConfigurations(): List<CfnDistribution.CustomErrorResponseProperty> =
      unwrap(this).getErrorConfigurations()?.map(CfnDistribution.CustomErrorResponseProperty::wrap)
      ?: emptyList()

  public fun geoRestriction(): GeoRestriction? =
      unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

  public fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

  public fun loggingConfig(): LoggingConfiguration? =
      unwrap(this).getLoggingConfig()?.let(LoggingConfiguration::wrap)

  public fun originConfigs(): List<SourceConfiguration>

  public fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

  public fun viewerCertificate(): ViewerCertificate? =
      unwrap(this).getViewerCertificate()?.let(ViewerCertificate::wrap)

  public fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
      unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

  public fun webAclId(): String? = unwrap(this).getWebACLId()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun defaultRootObject(defaultRootObject: String)

    public fun enableIpV6(enableIpV6: Boolean)

    public fun enabled(enabled: Boolean)

    public
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>)

    public fun errorConfigurations(vararg
        errorConfigurations: CfnDistribution.CustomErrorResponseProperty)

    public fun geoRestriction(geoRestriction: GeoRestriction)

    public fun httpVersion(httpVersion: HttpVersion)

    public fun loggingConfig(loggingConfig: LoggingConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57916fcbbbcf6947de63cf0e1f900aa30c598933f866f66ada527886bfda9962")
    public fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit)

    public fun originConfigs(originConfigs: List<SourceConfiguration>)

    public fun originConfigs(vararg originConfigs: SourceConfiguration)

    public fun priceClass(priceClass: PriceClass)

    public fun viewerCertificate(viewerCertificate: ViewerCertificate)

    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)

    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun defaultRootObject(defaultRootObject: String) {
      cdkBuilder.defaultRootObject(defaultRootObject)
    }

    override fun enableIpV6(enableIpV6: Boolean) {
      cdkBuilder.enableIpV6(enableIpV6)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>) {
      cdkBuilder.errorConfigurations(errorConfigurations.map(CfnDistribution.CustomErrorResponseProperty::unwrap))
    }

    override fun errorConfigurations(vararg
        errorConfigurations: CfnDistribution.CustomErrorResponseProperty): Unit =
        errorConfigurations(errorConfigurations.toList())

    override fun geoRestriction(geoRestriction: GeoRestriction) {
      cdkBuilder.geoRestriction(geoRestriction.let(GeoRestriction::unwrap))
    }

    override fun httpVersion(httpVersion: HttpVersion) {
      cdkBuilder.httpVersion(httpVersion.let(HttpVersion::unwrap))
    }

    override fun loggingConfig(loggingConfig: LoggingConfiguration) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57916fcbbbcf6947de63cf0e1f900aa30c598933f866f66ada527886bfda9962")
    override fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfiguration(loggingConfig))

    override fun originConfigs(originConfigs: List<SourceConfiguration>) {
      cdkBuilder.originConfigs(originConfigs.map(SourceConfiguration::unwrap))
    }

    override fun originConfigs(vararg originConfigs: SourceConfiguration): Unit =
        originConfigs(originConfigs.toList())

    override fun priceClass(priceClass: PriceClass) {
      cdkBuilder.priceClass(priceClass.let(PriceClass::unwrap))
    }

    override fun viewerCertificate(viewerCertificate: ViewerCertificate) {
      cdkBuilder.viewerCertificate(viewerCertificate.let(ViewerCertificate::unwrap))
    }

    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps,
  ) : CdkObject(cdkObject), CloudFrontWebDistributionProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

    override fun enableIpV6(): Boolean? = unwrap(this).getEnableIpV6()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun errorConfigurations(): List<CfnDistribution.CustomErrorResponseProperty> =
        unwrap(this).getErrorConfigurations()?.map(CfnDistribution.CustomErrorResponseProperty::wrap)
        ?: emptyList()

    override fun geoRestriction(): GeoRestriction? =
        unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

    override fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

    override fun loggingConfig(): LoggingConfiguration? =
        unwrap(this).getLoggingConfig()?.let(LoggingConfiguration::wrap)

    override fun originConfigs(): List<SourceConfiguration> =
        unwrap(this).getOriginConfigs().map(SourceConfiguration::wrap)

    override fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

    override fun viewerCertificate(): ViewerCertificate? =
        unwrap(this).getViewerCertificate()?.let(ViewerCertificate::wrap)

    override fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
        unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

    override fun webAclId(): String? = unwrap(this).getWebACLId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFrontWebDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps):
        CloudFrontWebDistributionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFrontWebDistributionProps):
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
  }
}
