@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Viewer certificate configuration class.
 *
 * Example:
 *
 * ```
 * Bucket s3BucketSource = new Bucket(this, "Bucket");
 * CloudFrontWebDistribution distribution = CloudFrontWebDistribution.Builder.create(this,
 * "AnAmazingWebsiteProbably")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder().s3BucketSource(s3BucketSource).build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .viewerCertificate(ViewerCertificate.fromIamCertificate("certificateId",
 * ViewerCertificateOptions.builder()
 * .aliases(List.of("example.com"))
 * .securityPolicy(SecurityPolicyProtocol.SSL_V3) // default
 * .sslMethod(SSLMethod.SNI)
 * .build()))
 * .build();
 * ```
 */
public open class ViewerCertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificate,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun aliases(): List<String> = unwrap(this).getAliases()

  /**
   *
   */
  public open fun props(): CfnDistribution.ViewerCertificateProperty =
      unwrap(this).getProps().let(CfnDistribution.ViewerCertificateProperty::wrap)

  public companion object {
    public fun fromAcmCertificate(certificate: ICertificate): ViewerCertificate =
        software.amazon.awscdk.services.cloudfront.ViewerCertificate.fromAcmCertificate(certificate.let(ICertificate::unwrap)).let(ViewerCertificate::wrap)

    public fun fromAcmCertificate(certificate: ICertificate, options: ViewerCertificateOptions):
        ViewerCertificate =
        software.amazon.awscdk.services.cloudfront.ViewerCertificate.fromAcmCertificate(certificate.let(ICertificate::unwrap),
        options.let(ViewerCertificateOptions::unwrap)).let(ViewerCertificate::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37a713b410c630c403273ca75ff975e19693092baa3512aa6babed5368bff2c2")
    public fun fromAcmCertificate(certificate: ICertificate,
        options: ViewerCertificateOptions.Builder.() -> Unit): ViewerCertificate =
        fromAcmCertificate(certificate, ViewerCertificateOptions(options))

    public fun fromCloudFrontDefaultCertificate(aliases: String): ViewerCertificate =
        software.amazon.awscdk.services.cloudfront.ViewerCertificate.fromCloudFrontDefaultCertificate(aliases).let(ViewerCertificate::wrap)

    public fun fromIamCertificate(iamCertificateId: String): ViewerCertificate =
        software.amazon.awscdk.services.cloudfront.ViewerCertificate.fromIamCertificate(iamCertificateId).let(ViewerCertificate::wrap)

    public fun fromIamCertificate(iamCertificateId: String, options: ViewerCertificateOptions):
        ViewerCertificate =
        software.amazon.awscdk.services.cloudfront.ViewerCertificate.fromIamCertificate(iamCertificateId,
        options.let(ViewerCertificateOptions::unwrap)).let(ViewerCertificate::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91f45eef37d3170a3df7ffdb2bc432e638538104218ba15a6c1b22fcdace2dd1")
    public fun fromIamCertificate(iamCertificateId: String,
        options: ViewerCertificateOptions.Builder.() -> Unit): ViewerCertificate =
        fromIamCertificate(iamCertificateId, ViewerCertificateOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificate):
        ViewerCertificate = ViewerCertificate(cdkObject)

    internal fun unwrap(wrapped: ViewerCertificate):
        software.amazon.awscdk.services.cloudfront.ViewerCertificate = wrapped.cdkObject
  }
}
