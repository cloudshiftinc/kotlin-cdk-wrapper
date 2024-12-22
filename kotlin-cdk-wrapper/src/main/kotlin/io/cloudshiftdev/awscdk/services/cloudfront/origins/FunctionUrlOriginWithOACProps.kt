@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudfront.IOriginAccessControl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for configuring a Lambda Functions URLs with OAC.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn;
 * FunctionUrl fnUrl = fn.addFunctionUrl(FunctionUrlOptions.builder()
 * .authType(FunctionUrlAuthType.AWS_IAM)
 * .build());
 * // Define a custom OAC
 * FunctionUrlOriginAccessControl oac = FunctionUrlOriginAccessControl.Builder.create(this, "MyOAC")
 * .originAccessControlName("CustomLambdaOAC")
 * .signing(Signing.SIGV4_ALWAYS)
 * .build();
 * // Set up Lambda Function URL with OAC in CloudFront Distribution
 * // Set up Lambda Function URL with OAC in CloudFront Distribution
 * Distribution.Builder.create(this, "MyDistribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(FunctionUrlOrigin.withOriginAccessControl(fnUrl, FunctionUrlOriginWithOACProps.builder()
 * .originAccessControl(oac)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface FunctionUrlOriginWithOACProps : FunctionUrlOriginProps {
  /**
   * An optional Origin Access Control.
   *
   * Default: - an Origin Access Control will be created.
   */
  public fun originAccessControl(): IOriginAccessControl? =
      unwrap(this).getOriginAccessControl()?.let(IOriginAccessControl::wrap)

  /**
   * A builder for [FunctionUrlOriginWithOACProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin;.
     * valid values are 1, 2, or 3 attempts.
     */
    public fun connectionAttempts(connectionAttempts: Number)

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin.
     * Valid values are 1-10 seconds, inclusive.
     */
    public fun connectionTimeout(connectionTimeout: Duration)

    /**
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     * it sends to the origin.
     */
    public fun customHeaders(customHeaders: Map<String, String>)

    /**
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     * the origin.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    public fun keepaliveTimeout(keepaliveTimeout: Duration)

    /**
     * @param originAccessControl An optional Origin Access Control.
     */
    public fun originAccessControl(originAccessControl: IOriginAccessControl)

    /**
     * @param originAccessControlId The unique identifier of an origin access control for this
     * origin.
     */
    public fun originAccessControlId(originAccessControlId: String)

    /**
     * @param originId A unique identifier for the origin.
     * This value must be unique within the distribution.
     */
    public fun originId(originId: String)

    /**
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     * CloudFront requests content from the origin.
     * Must begin, but not end, with '/' (e.g., '/production/images').
     */
    public fun originPath(originPath: String)

    /**
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     * region, after this to disable Origin Shield again you must set this flag to false.
     */
    public fun originShieldEnabled(originShieldEnabled: Boolean)

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String)

    /**
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     * origin.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    public fun readTimeout(readTimeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginWithOACProps.Builder =
        software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginWithOACProps.builder()

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin;.
     * valid values are 1, 2, or 3 attempts.
     */
    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin.
     * Valid values are 1-10 seconds, inclusive.
     */
    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     * it sends to the origin.
     */
    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     * the origin.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    override fun keepaliveTimeout(keepaliveTimeout: Duration) {
      cdkBuilder.keepaliveTimeout(keepaliveTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param originAccessControl An optional Origin Access Control.
     */
    override fun originAccessControl(originAccessControl: IOriginAccessControl) {
      cdkBuilder.originAccessControl(originAccessControl.let(IOriginAccessControl.Companion::unwrap))
    }

    /**
     * @param originAccessControlId The unique identifier of an origin access control for this
     * origin.
     */
    override fun originAccessControlId(originAccessControlId: String) {
      cdkBuilder.originAccessControlId(originAccessControlId)
    }

    /**
     * @param originId A unique identifier for the origin.
     * This value must be unique within the distribution.
     */
    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    /**
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     * CloudFront requests content from the origin.
     * Must begin, but not end, with '/' (e.g., '/production/images').
     */
    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    /**
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     * region, after this to disable Origin Shield again you must set this flag to false.
     */
    override fun originShieldEnabled(originShieldEnabled: Boolean) {
      cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /**
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     * origin.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    override fun readTimeout(readTimeout: Duration) {
      cdkBuilder.readTimeout(readTimeout.let(Duration.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginWithOACProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginWithOACProps,
  ) : CdkObject(cdkObject),
      FunctionUrlOriginWithOACProps {
    /**
     * The number of times that CloudFront attempts to connect to the origin;
     *
     * valid values are 1, 2, or 3 attempts.
     *
     * Default: 3
     */
    override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the
     * origin.
     *
     * Valid values are 1-10 seconds, inclusive.
     *
     * Default: Duration.seconds(10)
     */
    override fun connectionTimeout(): Duration? =
        unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

    /**
     * A list of HTTP header names and values that CloudFront adds to requests it sends to the
     * origin.
     *
     * Default: {}
     */
    override fun customHeaders(): Map<String, String> = unwrap(this).getCustomHeaders() ?:
        emptyMap()

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
     */
    override fun keepaliveTimeout(): Duration? =
        unwrap(this).getKeepaliveTimeout()?.let(Duration::wrap)

    /**
     * An optional Origin Access Control.
     *
     * Default: - an Origin Access Control will be created.
     */
    override fun originAccessControl(): IOriginAccessControl? =
        unwrap(this).getOriginAccessControl()?.let(IOriginAccessControl::wrap)

    /**
     * The unique identifier of an origin access control for this origin.
     *
     * Default: - no origin access control
     */
    override fun originAccessControlId(): String? = unwrap(this).getOriginAccessControlId()

    /**
     * A unique identifier for the origin.
     *
     * This value must be unique within the distribution.
     *
     * Default: - an originid will be generated for you
     */
    override fun originId(): String? = unwrap(this).getOriginId()

    /**
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests
     * content from the origin.
     *
     * Must begin, but not end, with '/' (e.g., '/production/images').
     *
     * Default: '/'
     */
    override fun originPath(): String? = unwrap(this).getOriginPath()

    /**
     * Origin Shield is enabled by setting originShieldRegion to a valid region, after this to
     * disable Origin Shield again you must set this flag to false.
     *
     * Default: - true
     */
    override fun originShieldEnabled(): Boolean? = unwrap(this).getOriginShieldEnabled()

    /**
     * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin,
     * you can get better network performance.
     *
     * Default: - origin shield not enabled
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     */
    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    /**
     * Specifies how long, in seconds, CloudFront waits for a response from the origin.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     *
     * Default: Duration.seconds(30)
     */
    override fun readTimeout(): Duration? = unwrap(this).getReadTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlOriginWithOACProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginWithOACProps):
        FunctionUrlOriginWithOACProps = CdkObjectWrappers.wrap(cdkObject) as?
        FunctionUrlOriginWithOACProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlOriginWithOACProps):
        software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginWithOACProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginWithOACProps
  }
}
