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

/**
 * An Origin that is backed by an S3 bucket.
 *
 * If the bucket is configured for website hosting, this origin will be configured to use the bucket
 * as an
 * HTTP server origin and will use the bucket's configured website redirects and error handling.
 * Otherwise,
 * the origin is created as a bucket origin and will use CloudFront's redirect and error handling.
 *
 * Example:
 *
 * ```
 * // Adding an existing Lambda&#64;Edge function created in a different stack
 * // to a CloudFront distribution.
 * Bucket s3Bucket;
 * IVersion functionVersion = Version.fromVersionArn(this, "Version",
 * "arn:aws:lambda:us-east-1:123456789012:function:functionName:1");
 * Distribution.Builder.create(this, "distro")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(s3Bucket))
 * .edgeLambdas(List.of(EdgeLambda.builder()
 * .functionVersion(functionVersion)
 * .eventType(LambdaEdgeEventType.VIEWER_REQUEST)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public open class S3Origin(
  cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3Origin,
) : CdkObject(cdkObject), IOrigin {
  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket) :
      this(software.amazon.awscdk.services.cloudfront.origins.S3Origin(bucket.let(CloudshiftdevAwscdkServicesS3IBucket.Companion::unwrap))
  )

  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket, props: S3OriginProps) :
      this(software.amazon.awscdk.services.cloudfront.origins.S3Origin(bucket.let(CloudshiftdevAwscdkServicesS3IBucket.Companion::unwrap),
      props.let(S3OriginProps.Companion::unwrap))
  )

  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket,
      props: S3OriginProps.Builder.() -> Unit) : this(bucket, S3OriginProps(props)
  )

  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  public override fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      options.let(OriginBindOptions.Companion::unwrap)).let(OriginBindConfig::wrap)

  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public override fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit):
      OriginBindConfig = bind(scope, OriginBindOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.origins.S3Origin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of times that CloudFront attempts to connect to the origin;
     *
     * valid values are 1, 2, or 3 attempts.
     *
     * Default: 3
     *
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin;. 
     */
    public fun connectionAttempts(connectionAttempts: Number)

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the
     * origin.
     *
     * Valid values are 1-10 seconds, inclusive.
     *
     * Default: Duration.seconds(10)
     *
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin. 
     */
    public fun connectionTimeout(connectionTimeout: Duration)

    /**
     * A list of HTTP header names and values that CloudFront adds to requests it sends to the
     * origin.
     *
     * Default: {}
     *
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     * it sends to the origin. 
     */
    public fun customHeaders(customHeaders: Map<String, String>)

    /**
     * An optional Origin Access Identity of the origin identity cloudfront will use when calling
     * your s3 bucket.
     *
     * Default: - An Origin Access Identity will be created.
     *
     * @param originAccessIdentity An optional Origin Access Identity of the origin identity
     * cloudfront will use when calling your s3 bucket. 
     */
    public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity)

    /**
     * A unique identifier for the origin.
     *
     * This value must be unique within the distribution.
     *
     * Default: - an originid will be generated for you
     *
     * @param originId A unique identifier for the origin. 
     */
    public fun originId(originId: String)

    /**
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests
     * content from the origin.
     *
     * Must begin, but not end, with '/' (e.g., '/production/images').
     *
     * Default: '/'
     *
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     * CloudFront requests content from the origin. 
     */
    public fun originPath(originPath: String)

    /**
     * Origin Shield is enabled by setting originShieldRegion to a valid region, after this to
     * disable Origin Shield again you must set this flag to false.
     *
     * Default: - true
     *
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     * region, after this to disable Origin Shield again you must set this flag to false. 
     */
    public fun originShieldEnabled(originShieldEnabled: Boolean)

    /**
     * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin,
     * you can get better network performance.
     *
     * Default: - origin shield not enabled
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance. 
     */
    public fun originShieldRegion(originShieldRegion: String)
  }

  private class BuilderImpl(
    bucket: AmazonAwscdkServicesS3IBucket,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.S3Origin.Builder =
        software.amazon.awscdk.services.cloudfront.origins.S3Origin.Builder.create(bucket)

    /**
     * The number of times that CloudFront attempts to connect to the origin;
     *
     * valid values are 1, 2, or 3 attempts.
     *
     * Default: 3
     *
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin;. 
     */
    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the
     * origin.
     *
     * Valid values are 1-10 seconds, inclusive.
     *
     * Default: Duration.seconds(10)
     *
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin. 
     */
    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * A list of HTTP header names and values that CloudFront adds to requests it sends to the
     * origin.
     *
     * Default: {}
     *
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     * it sends to the origin. 
     */
    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * An optional Origin Access Identity of the origin identity cloudfront will use when calling
     * your s3 bucket.
     *
     * Default: - An Origin Access Identity will be created.
     *
     * @param originAccessIdentity An optional Origin Access Identity of the origin identity
     * cloudfront will use when calling your s3 bucket. 
     */
    override fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
      cdkBuilder.originAccessIdentity(originAccessIdentity.let(IOriginAccessIdentity.Companion::unwrap))
    }

    /**
     * A unique identifier for the origin.
     *
     * This value must be unique within the distribution.
     *
     * Default: - an originid will be generated for you
     *
     * @param originId A unique identifier for the origin. 
     */
    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    /**
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests
     * content from the origin.
     *
     * Must begin, but not end, with '/' (e.g., '/production/images').
     *
     * Default: '/'
     *
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     * CloudFront requests content from the origin. 
     */
    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    /**
     * Origin Shield is enabled by setting originShieldRegion to a valid region, after this to
     * disable Origin Shield again you must set this flag to false.
     *
     * Default: - true
     *
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     * region, after this to disable Origin Shield again you must set this flag to false. 
     */
    override fun originShieldEnabled(originShieldEnabled: Boolean) {
      cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    /**
     * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin,
     * you can get better network performance.
     *
     * Default: - origin shield not enabled
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance. 
     */
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
        software.amazon.awscdk.services.cloudfront.origins.S3Origin = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.origins.S3Origin
  }
}
