@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A CloudFront behavior wrapper.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function function_;
 * KeyGroup keyGroup;
 * Version version;
 * Behavior behavior = Behavior.builder()
 * .allowedMethods(CloudFrontAllowedMethods.GET_HEAD)
 * .cachedMethods(CloudFrontAllowedCachedMethods.GET_HEAD)
 * .compress(false)
 * .defaultTtl(Duration.minutes(30))
 * .forwardedValues(ForwardedValuesProperty.builder()
 * .queryString(false)
 * // the properties below are optional
 * .cookies(CookiesProperty.builder()
 * .forward("forward")
 * // the properties below are optional
 * .whitelistedNames(List.of("whitelistedNames"))
 * .build())
 * .headers(List.of("headers"))
 * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
 * .build())
 * .functionAssociations(List.of(FunctionAssociation.builder()
 * .eventType(FunctionEventType.VIEWER_REQUEST)
 * .function(function_)
 * .build()))
 * .isDefaultBehavior(false)
 * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociation.builder()
 * .eventType(LambdaEdgeEventType.ORIGIN_REQUEST)
 * .lambdaFunction(version)
 * // the properties below are optional
 * .includeBody(false)
 * .build()))
 * .maxTtl(Duration.minutes(30))
 * .minTtl(Duration.minutes(30))
 * .pathPattern("pathPattern")
 * .trustedKeyGroups(List.of(keyGroup))
 * .trustedSigners(List.of("trustedSigners"))
 * .viewerProtocolPolicy(ViewerProtocolPolicy.HTTPS_ONLY)
 * .build();
 * ```
 */
public interface Behavior {
  /**
   * The method this CloudFront distribution responds do.
   *
   * Default: GET_HEAD
   */
  public fun allowedMethods(): CloudFrontAllowedMethods? =
      unwrap(this).getAllowedMethods()?.let(CloudFrontAllowedMethods::wrap)

  /**
   * Which methods are cached by CloudFront by default.
   *
   * Default: GET_HEAD
   */
  public fun cachedMethods(): CloudFrontAllowedCachedMethods? =
      unwrap(this).getCachedMethods()?.let(CloudFrontAllowedCachedMethods::wrap)

  /**
   * If CloudFront should automatically compress some content types.
   *
   * Default: true
   */
  public fun compress(): Boolean? = unwrap(this).getCompress()

  /**
   * The default amount of time CloudFront will cache an object.
   *
   * This value applies only when your custom origin does not add HTTP headers,
   * such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects.
   *
   * Default: 86400 (1 day)
   */
  public fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

  /**
   * The values CloudFront will forward to the origin when making a request.
   *
   * Default: none (no cookies - no headers)
   */
  public fun forwardedValues(): CfnDistribution.ForwardedValuesProperty? =
      unwrap(this).getForwardedValues()?.let(CfnDistribution.ForwardedValuesProperty::wrap)

  /**
   * The CloudFront functions to invoke before serving the contents.
   *
   * Default: - no functions will be invoked
   */
  public fun functionAssociations(): List<FunctionAssociation> =
      unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

  /**
   * If this behavior is the default behavior for the distribution.
   *
   * You must specify exactly one default distribution per CloudFront distribution.
   * The default behavior is allowed to omit the "path" property.
   */
  public fun isDefaultBehavior(): Boolean? = unwrap(this).getIsDefaultBehavior()

  /**
   * Declares associated lambda&#64;edge functions for this distribution behaviour.
   *
   * Default: No lambda function associated
   */
  public fun lambdaFunctionAssociations(): List<LambdaFunctionAssociation> =
      unwrap(this).getLambdaFunctionAssociations()?.map(LambdaFunctionAssociation::wrap) ?:
      emptyList()

  /**
   * The max amount of time you want objects to stay in the cache before CloudFront queries your
   * origin.
   *
   * Default: Duration.seconds(31536000) (one year)
   */
  public fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

  /**
   * The minimum amount of time that you want objects to stay in the cache before CloudFront queries
   * your origin.
   */
  public fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

  /**
   * The path this behavior responds to.
   *
   * Required for all non-default behaviors. (The default behavior implicitly has "*" as the path
   * pattern. )
   */
  public fun pathPattern(): String? = unwrap(this).getPathPattern()

  /**
   * A list of Key Groups that CloudFront can use to validate signed URLs or signed cookies.
   *
   * Default: - no KeyGroups are associated with cache behavior
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
   */
  public fun trustedKeyGroups(): List<IKeyGroup> =
      unwrap(this).getTrustedKeyGroups()?.map(IKeyGroup::wrap) ?: emptyList()

  /**
   * (deprecated) Trusted signers is how CloudFront allows you to serve private content.
   *
   * The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
   * distribution.
   *
   * If you pass a non empty value, all requests for this behavior must be signed (no public access
   * will be allowed)
   *
   * * We recommend using trustedKeyGroups instead of trustedSigners.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

  /**
   * The viewer policy for this behavior.
   *
   * Default: - the distribution wide viewer protocol policy will be used
   */
  public fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
      unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

  /**
   * A builder for [Behavior]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedMethods The method this CloudFront distribution responds do.
     */
    public fun allowedMethods(allowedMethods: CloudFrontAllowedMethods)

    /**
     * @param cachedMethods Which methods are cached by CloudFront by default.
     */
    public fun cachedMethods(cachedMethods: CloudFrontAllowedCachedMethods)

    /**
     * @param compress If CloudFront should automatically compress some content types.
     */
    public fun compress(compress: Boolean)

    /**
     * @param defaultTtl The default amount of time CloudFront will cache an object.
     * This value applies only when your custom origin does not add HTTP headers,
     * such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects.
     */
    public fun defaultTtl(defaultTtl: Duration)

    /**
     * @param forwardedValues The values CloudFront will forward to the origin when making a
     * request.
     */
    public fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty)

    /**
     * @param forwardedValues The values CloudFront will forward to the origin when making a
     * request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e72d697bd350b3127d266acf70adc1bef03a3414262f75c6810d5d910256e1d")
    public
        fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty.Builder.() -> Unit)

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(functionAssociations: List<FunctionAssociation>)

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(vararg functionAssociations: FunctionAssociation)

    /**
     * @param isDefaultBehavior If this behavior is the default behavior for the distribution.
     * You must specify exactly one default distribution per CloudFront distribution.
     * The default behavior is allowed to omit the "path" property.
     */
    public fun isDefaultBehavior(isDefaultBehavior: Boolean)

    /**
     * @param lambdaFunctionAssociations Declares associated lambda&#64;edge functions for this
     * distribution behaviour.
     */
    public
        fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<LambdaFunctionAssociation>)

    /**
     * @param lambdaFunctionAssociations Declares associated lambda&#64;edge functions for this
     * distribution behaviour.
     */
    public fun lambdaFunctionAssociations(vararg
        lambdaFunctionAssociations: LambdaFunctionAssociation)

    /**
     * @param maxTtl The max amount of time you want objects to stay in the cache before CloudFront
     * queries your origin.
     */
    public fun maxTtl(maxTtl: Duration)

    /**
     * @param minTtl The minimum amount of time that you want objects to stay in the cache before
     * CloudFront queries your origin.
     */
    public fun minTtl(minTtl: Duration)

    /**
     * @param pathPattern The path this behavior responds to.
     * Required for all non-default behaviors. (The default behavior implicitly has "*" as the path
     * pattern. )
     */
    public fun pathPattern(pathPattern: String)

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     * or signed cookies.
     */
    public fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>)

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     * or signed cookies.
     */
    public fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup)

    /**
     * @param trustedSigners Trusted signers is how CloudFront allows you to serve private content.
     * The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
     * distribution.
     *
     * If you pass a non empty value, all requests for this behavior must be signed (no public
     * access will be allowed)
     * @deprecated - We recommend using trustedKeyGroups instead of trustedSigners.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun trustedSigners(trustedSigners: List<String>)

    /**
     * @param trustedSigners Trusted signers is how CloudFront allows you to serve private content.
     * The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
     * distribution.
     *
     * If you pass a non empty value, all requests for this behavior must be signed (no public
     * access will be allowed)
     * @deprecated - We recommend using trustedKeyGroups instead of trustedSigners.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun trustedSigners(vararg trustedSigners: String)

    /**
     * @param viewerProtocolPolicy The viewer policy for this behavior.
     */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.Behavior.Builder =
        software.amazon.awscdk.services.cloudfront.Behavior.builder()

    /**
     * @param allowedMethods The method this CloudFront distribution responds do.
     */
    override fun allowedMethods(allowedMethods: CloudFrontAllowedMethods) {
      cdkBuilder.allowedMethods(allowedMethods.let(CloudFrontAllowedMethods.Companion::unwrap))
    }

    /**
     * @param cachedMethods Which methods are cached by CloudFront by default.
     */
    override fun cachedMethods(cachedMethods: CloudFrontAllowedCachedMethods) {
      cdkBuilder.cachedMethods(cachedMethods.let(CloudFrontAllowedCachedMethods.Companion::unwrap))
    }

    /**
     * @param compress If CloudFront should automatically compress some content types.
     */
    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
    }

    /**
     * @param defaultTtl The default amount of time CloudFront will cache an object.
     * This value applies only when your custom origin does not add HTTP headers,
     * such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects.
     */
    override fun defaultTtl(defaultTtl: Duration) {
      cdkBuilder.defaultTtl(defaultTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param forwardedValues The values CloudFront will forward to the origin when making a
     * request.
     */
    override fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty) {
      cdkBuilder.forwardedValues(forwardedValues.let(CfnDistribution.ForwardedValuesProperty.Companion::unwrap))
    }

    /**
     * @param forwardedValues The values CloudFront will forward to the origin when making a
     * request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e72d697bd350b3127d266acf70adc1bef03a3414262f75c6810d5d910256e1d")
    override
        fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty.Builder.() -> Unit):
        Unit = forwardedValues(CfnDistribution.ForwardedValuesProperty(forwardedValues))

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    override fun functionAssociations(functionAssociations: List<FunctionAssociation>) {
      cdkBuilder.functionAssociations(functionAssociations.map(FunctionAssociation.Companion::unwrap))
    }

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    override fun functionAssociations(vararg functionAssociations: FunctionAssociation): Unit =
        functionAssociations(functionAssociations.toList())

    /**
     * @param isDefaultBehavior If this behavior is the default behavior for the distribution.
     * You must specify exactly one default distribution per CloudFront distribution.
     * The default behavior is allowed to omit the "path" property.
     */
    override fun isDefaultBehavior(isDefaultBehavior: Boolean) {
      cdkBuilder.isDefaultBehavior(isDefaultBehavior)
    }

    /**
     * @param lambdaFunctionAssociations Declares associated lambda&#64;edge functions for this
     * distribution behaviour.
     */
    override
        fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<LambdaFunctionAssociation>) {
      cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations.map(LambdaFunctionAssociation.Companion::unwrap))
    }

    /**
     * @param lambdaFunctionAssociations Declares associated lambda&#64;edge functions for this
     * distribution behaviour.
     */
    override fun lambdaFunctionAssociations(vararg
        lambdaFunctionAssociations: LambdaFunctionAssociation): Unit =
        lambdaFunctionAssociations(lambdaFunctionAssociations.toList())

    /**
     * @param maxTtl The max amount of time you want objects to stay in the cache before CloudFront
     * queries your origin.
     */
    override fun maxTtl(maxTtl: Duration) {
      cdkBuilder.maxTtl(maxTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param minTtl The minimum amount of time that you want objects to stay in the cache before
     * CloudFront queries your origin.
     */
    override fun minTtl(minTtl: Duration) {
      cdkBuilder.minTtl(minTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param pathPattern The path this behavior responds to.
     * Required for all non-default behaviors. (The default behavior implicitly has "*" as the path
     * pattern. )
     */
    override fun pathPattern(pathPattern: String) {
      cdkBuilder.pathPattern(pathPattern)
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     * or signed cookies.
     */
    override fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>) {
      cdkBuilder.trustedKeyGroups(trustedKeyGroups.map(IKeyGroup.Companion::unwrap))
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     * or signed cookies.
     */
    override fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup): Unit =
        trustedKeyGroups(trustedKeyGroups.toList())

    /**
     * @param trustedSigners Trusted signers is how CloudFront allows you to serve private content.
     * The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
     * distribution.
     *
     * If you pass a non empty value, all requests for this behavior must be signed (no public
     * access will be allowed)
     * @deprecated - We recommend using trustedKeyGroups instead of trustedSigners.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun trustedSigners(trustedSigners: List<String>) {
      cdkBuilder.trustedSigners(trustedSigners)
    }

    /**
     * @param trustedSigners Trusted signers is how CloudFront allows you to serve private content.
     * The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
     * distribution.
     *
     * If you pass a non empty value, all requests for this behavior must be signed (no public
     * access will be allowed)
     * @deprecated - We recommend using trustedKeyGroups instead of trustedSigners.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun trustedSigners(vararg trustedSigners: String): Unit =
        trustedSigners(trustedSigners.toList())

    /**
     * @param viewerProtocolPolicy The viewer policy for this behavior.
     */
    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.Behavior = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.Behavior,
  ) : CdkObject(cdkObject), Behavior {
    /**
     * The method this CloudFront distribution responds do.
     *
     * Default: GET_HEAD
     */
    override fun allowedMethods(): CloudFrontAllowedMethods? =
        unwrap(this).getAllowedMethods()?.let(CloudFrontAllowedMethods::wrap)

    /**
     * Which methods are cached by CloudFront by default.
     *
     * Default: GET_HEAD
     */
    override fun cachedMethods(): CloudFrontAllowedCachedMethods? =
        unwrap(this).getCachedMethods()?.let(CloudFrontAllowedCachedMethods::wrap)

    /**
     * If CloudFront should automatically compress some content types.
     *
     * Default: true
     */
    override fun compress(): Boolean? = unwrap(this).getCompress()

    /**
     * The default amount of time CloudFront will cache an object.
     *
     * This value applies only when your custom origin does not add HTTP headers,
     * such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects.
     *
     * Default: 86400 (1 day)
     */
    override fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

    /**
     * The values CloudFront will forward to the origin when making a request.
     *
     * Default: none (no cookies - no headers)
     */
    override fun forwardedValues(): CfnDistribution.ForwardedValuesProperty? =
        unwrap(this).getForwardedValues()?.let(CfnDistribution.ForwardedValuesProperty::wrap)

    /**
     * The CloudFront functions to invoke before serving the contents.
     *
     * Default: - no functions will be invoked
     */
    override fun functionAssociations(): List<FunctionAssociation> =
        unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

    /**
     * If this behavior is the default behavior for the distribution.
     *
     * You must specify exactly one default distribution per CloudFront distribution.
     * The default behavior is allowed to omit the "path" property.
     */
    override fun isDefaultBehavior(): Boolean? = unwrap(this).getIsDefaultBehavior()

    /**
     * Declares associated lambda&#64;edge functions for this distribution behaviour.
     *
     * Default: No lambda function associated
     */
    override fun lambdaFunctionAssociations(): List<LambdaFunctionAssociation> =
        unwrap(this).getLambdaFunctionAssociations()?.map(LambdaFunctionAssociation::wrap) ?:
        emptyList()

    /**
     * The max amount of time you want objects to stay in the cache before CloudFront queries your
     * origin.
     *
     * Default: Duration.seconds(31536000) (one year)
     */
    override fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

    /**
     * The minimum amount of time that you want objects to stay in the cache before CloudFront
     * queries your origin.
     */
    override fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

    /**
     * The path this behavior responds to.
     *
     * Required for all non-default behaviors. (The default behavior implicitly has "*" as the path
     * pattern. )
     */
    override fun pathPattern(): String? = unwrap(this).getPathPattern()

    /**
     * A list of Key Groups that CloudFront can use to validate signed URLs or signed cookies.
     *
     * Default: - no KeyGroups are associated with cache behavior
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     */
    override fun trustedKeyGroups(): List<IKeyGroup> =
        unwrap(this).getTrustedKeyGroups()?.map(IKeyGroup::wrap) ?: emptyList()

    /**
     * (deprecated) Trusted signers is how CloudFront allows you to serve private content.
     *
     * The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
     * distribution.
     *
     * If you pass a non empty value, all requests for this behavior must be signed (no public
     * access will be allowed)
     *
     * * We recommend using trustedKeyGroups instead of trustedSigners.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

    /**
     * The viewer policy for this behavior.
     *
     * Default: - the distribution wide viewer protocol policy will be used
     */
    override fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
        unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Behavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Behavior): Behavior =
        CdkObjectWrappers.wrap(cdkObject) as? Behavior ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Behavior): software.amazon.awscdk.services.cloudfront.Behavior =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.Behavior
  }
}
