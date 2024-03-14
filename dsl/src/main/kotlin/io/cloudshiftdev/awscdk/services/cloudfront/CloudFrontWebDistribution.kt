package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CloudFrontWebDistribution internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution,
) : Resource(cdkObject), IDistribution {
  public override fun distributionDomainName(): String = unwrap(this).getDistributionDomainName()

  public override fun distributionId(): String = unwrap(this).getDistributionId()

  public override fun grant(identity: IGrantable, actions: String): Grant =
      unwrap(this).grant(identity.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantCreateInvalidation(identity: IGrantable): Grant =
      unwrap(this).grantCreateInvalidation(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun loggingBucket(): IBucket? = unwrap(this).getLoggingBucket()?.let(IBucket::wrap)

  public interface Builder {
    public fun comment(comment: String) {
    }

    public fun defaultRootObject(defaultRootObject: String) {
    }

    public fun enableIpV6(enableIpV6: Boolean) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>) {
    }

    public fun geoRestriction(geoRestriction: GeoRestriction) {
    }

    public fun httpVersion(httpVersion: HttpVersion) {
    }

    public fun loggingConfig(loggingConfig: LoggingConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118297c79f59a3d02eff71388488a07ba458cc57ae2cfb797a344b74e12cca7f")
    public fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit) {
    }

    public fun originConfigs(originConfigs: List<SourceConfiguration>) {
    }

    public fun priceClass(priceClass: PriceClass) {
    }

    public fun viewerCertificate(viewerCertificate: ViewerCertificate) {
    }

    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
    }

    public fun webAclId(webAclId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution.Builder =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution.Builder.create(scope,
        id)

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun defaultRootObject(defaultRootObject: String) {
      cdkBuilder.defaultRootObject(defaultRootObject)
    }

    public override fun enableIpV6(enableIpV6: Boolean) {
      cdkBuilder.enableIpV6(enableIpV6)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>) {
      cdkBuilder.errorConfigurations(errorConfigurations.map(CfnDistribution.CustomErrorResponseProperty::unwrap))
    }

    public override fun geoRestriction(geoRestriction: GeoRestriction) {
      cdkBuilder.geoRestriction(geoRestriction.let(GeoRestriction::unwrap))
    }

    public override fun httpVersion(httpVersion: HttpVersion) {
      cdkBuilder.httpVersion(httpVersion.let(HttpVersion::unwrap))
    }

    public override fun loggingConfig(loggingConfig: LoggingConfiguration) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118297c79f59a3d02eff71388488a07ba458cc57ae2cfb797a344b74e12cca7f")
    public override fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit): Unit
        = loggingConfig(LoggingConfiguration(loggingConfig))

    public override fun originConfigs(originConfigs: List<SourceConfiguration>) {
      cdkBuilder.originConfigs(originConfigs.map(SourceConfiguration::unwrap))
    }

    public override fun priceClass(priceClass: PriceClass) {
      cdkBuilder.priceClass(priceClass.let(PriceClass::unwrap))
    }

    public override fun viewerCertificate(viewerCertificate: ViewerCertificate) {
      cdkBuilder.viewerCertificate(viewerCertificate.let(ViewerCertificate::unwrap))
    }

    public override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    public override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromDistributionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: CloudFrontWebDistributionAttributes,
    ): IDistribution =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution.fromDistributionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(CloudFrontWebDistributionAttributes::unwrap)).let(IDistribution::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a9b75be6523c2010178c9d6779ba47e3ed66833189966b4162046ea7b0dfc4")
    public open fun fromDistributionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: CloudFrontWebDistributionAttributes.Builder.() -> Unit,
    ): IDistribution = fromDistributionAttributes(scope, id,
        CloudFrontWebDistributionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CloudFrontWebDistribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CloudFrontWebDistribution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution):
        CloudFrontWebDistribution = CloudFrontWebDistribution(cdkObject)

    internal fun unwrap(wrapped: CloudFrontWebDistribution):
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution = wrapped.cdkObject
  }
}
