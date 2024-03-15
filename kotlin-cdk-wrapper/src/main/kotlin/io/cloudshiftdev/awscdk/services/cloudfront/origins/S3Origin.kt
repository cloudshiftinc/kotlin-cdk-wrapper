@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.IOrigin
import io.cloudshiftdev.awscdk.services.cloudfront.IOriginAccessIdentity
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBindConfig
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBindOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.s3.IBucket as CloudshiftdevAwscdkServicesS3IBucket
import software.amazon.awscdk.services.s3.IBucket as AmazonAwscdkServicesS3IBucket

public open class S3Origin internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3Origin,
) : CdkObject(cdkObject), IOrigin {
  public override fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      options.let(OriginBindOptions::unwrap)).let(OriginBindConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public override fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit):
      OriginBindConfig = bind(scope, OriginBindOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun connectionAttempts(connectionAttempts: Number)

    public fun connectionTimeout(connectionTimeout: Duration)

    public fun customHeaders(customHeaders: Map<String, String>)

    public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity)

    public fun originId(originId: String)

    public fun originPath(originPath: String)

    public fun originShieldEnabled(originShieldEnabled: Boolean)

    public fun originShieldRegion(originShieldRegion: String)
  }

  private class BuilderImpl(
    bucket: AmazonAwscdkServicesS3IBucket,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.S3Origin.Builder =
        software.amazon.awscdk.services.cloudfront.origins.S3Origin.Builder.create(bucket)

    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    override fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
      cdkBuilder.originAccessIdentity(originAccessIdentity.let(IOriginAccessIdentity::unwrap))
    }

    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    override fun originShieldEnabled(originShieldEnabled: Boolean) {
      cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.S3Origin =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(bucket: CloudshiftdevAwscdkServicesS3IBucket,
        block: Builder.() -> Unit = {}): S3Origin {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesS3IBucket.unwrap(bucket))
      return S3Origin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3Origin):
        S3Origin = S3Origin(cdkObject)

    internal fun unwrap(wrapped: S3Origin):
        software.amazon.awscdk.services.cloudfront.origins.S3Origin = wrapped.cdkObject
  }
}
