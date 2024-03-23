@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBase
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.apigateway.RestApiBase as CloudshiftdevAwscdkServicesApigatewayRestApiBase
import software.amazon.awscdk.services.apigateway.RestApiBase as AmazonAwscdkServicesApigatewayRestApiBase

/**
 * An Origin for an API Gateway REST API.
 *
 * Example:
 *
 * ```
 * RestApi api;
 * Distribution.Builder.create(this, "Distribution")
 * .defaultBehavior(BehaviorOptions.builder().origin(new RestApiOrigin(api)).build())
 * .build();
 * ```
 */
public open class RestApiOrigin(
  cdkObject: software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin,
) : OriginBase(cdkObject) {
  public constructor(restApi: CloudshiftdevAwscdkServicesApigatewayRestApiBase) :
      this(software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin(restApi.let(CloudshiftdevAwscdkServicesApigatewayRestApiBase::unwrap))
  )

  public constructor(restApi: CloudshiftdevAwscdkServicesApigatewayRestApiBase,
      props: RestApiOriginProps) :
      this(software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin(restApi.let(CloudshiftdevAwscdkServicesApigatewayRestApiBase::unwrap),
      props.let(RestApiOriginProps::unwrap))
  )

  public constructor(restApi: CloudshiftdevAwscdkServicesApigatewayRestApiBase,
      props: RestApiOriginProps.Builder.() -> Unit) : this(restApi, RestApiOriginProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.origins.RestApiOrigin].
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
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     *
     * Default: Duration.seconds(5)
     *
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     * the origin. 
     */
    public fun keepaliveTimeout(keepaliveTimeout: Duration)

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

    /**
     * Specifies how long, in seconds, CloudFront waits for a response from the origin, also known
     * as the origin response timeout.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     *
     * Default: Duration.seconds(30)
     *
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     * origin, also known as the origin response timeout. 
     */
    public fun readTimeout(readTimeout: Duration)
  }

  private class BuilderImpl(
    restApi: AmazonAwscdkServicesApigatewayRestApiBase,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin.Builder
        = software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin.Builder.create(restApi)

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
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
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
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     *
     * Default: Duration.seconds(5)
     *
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     * the origin. 
     */
    override fun keepaliveTimeout(keepaliveTimeout: Duration) {
      cdkBuilder.keepaliveTimeout(keepaliveTimeout.let(Duration::unwrap))
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

    /**
     * Specifies how long, in seconds, CloudFront waits for a response from the origin, also known
     * as the origin response timeout.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     *
     * Default: Duration.seconds(30)
     *
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     * origin, also known as the origin response timeout. 
     */
    override fun readTimeout(readTimeout: Duration) {
      cdkBuilder.readTimeout(readTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(restApi: CloudshiftdevAwscdkServicesApigatewayRestApiBase,
        block: Builder.() -> Unit = {}): RestApiOrigin {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesApigatewayRestApiBase.unwrap(restApi))
      return RestApiOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin):
        RestApiOrigin = RestApiOrigin(cdkObject)

    internal fun unwrap(wrapped: RestApiOrigin):
        software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin
  }
}
