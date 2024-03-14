package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface AddBehaviorOptions {
  /**
   * HTTP methods to allow for this behavior.
   *
   * Default: AllowedMethods.ALLOW_GET_HEAD
   */
  public fun allowedMethods(): AllowedMethods? =
      unwrap(this).getAllowedMethods()?.let(AllowedMethods::wrap)

  /**
   * The cache policy for this behavior.
   *
   * The cache policy determines what values are included in the cache key,
   * and the time-to-live (TTL) values for the cache.
   *
   * Default: CachePolicy.CACHING_OPTIMIZED
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html.)
   */
  public fun cachePolicy(): ICachePolicy? = unwrap(this).getCachePolicy()?.let(ICachePolicy::wrap)

  /**
   * HTTP methods to cache for this behavior.
   *
   * Default: CachedMethods.CACHE_GET_HEAD
   */
  public fun cachedMethods(): CachedMethods? =
      unwrap(this).getCachedMethods()?.let(CachedMethods::wrap)

  /**
   * Whether you want CloudFront to automatically compress certain files for this cache behavior.
   *
   * See
   * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html#compressed-content-cloudfront-file-types
   * for file types CloudFront will compress.
   *
   * Default: true
   */
  public fun compress(): Boolean? = unwrap(this).getCompress()

  /**
   * The Lambda&#64;Edge functions to invoke before serving the contents.
   *
   * Default: - no Lambda functions will be invoked
   *
   * [Documentation](https://aws.amazon.com/lambda/edge)
   */
  public fun edgeLambdas(): List<EdgeLambda> = unwrap(this).getEdgeLambdas()?.map(EdgeLambda::wrap)
      ?: emptyList()

  /**
   * The CloudFront functions to invoke before serving the contents.
   *
   * Default: - no functions will be invoked
   */
  public fun functionAssociations(): List<FunctionAssociation> =
      unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

  /**
   * The origin request policy for this behavior.
   *
   * The origin request policy determines which values (e.g., headers, cookies)
   * are included in requests that CloudFront sends to the origin.
   *
   * Default: - none
   */
  public fun originRequestPolicy(): IOriginRequestPolicy? =
      unwrap(this).getOriginRequestPolicy()?.let(IOriginRequestPolicy::wrap)

  /**
   * The real-time log configuration to be attached to this cache behavior.
   *
   * Default: - none
   */
  public fun realtimeLogConfig(): IRealtimeLogConfig? =
      unwrap(this).getRealtimeLogConfig()?.let(IRealtimeLogConfig::wrap)

  /**
   * The response headers policy for this behavior.
   *
   * The response headers policy determines which headers are included in responses
   *
   * Default: - none
   */
  public fun responseHeadersPolicy(): IResponseHeadersPolicy? =
      unwrap(this).getResponseHeadersPolicy()?.let(IResponseHeadersPolicy::wrap)

  /**
   * Set this to true to indicate you want to distribute media files in the Microsoft Smooth
   * Streaming format using this behavior.
   *
   * Default: false
   */
  public fun smoothStreaming(): Boolean? = unwrap(this).getSmoothStreaming()

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
   * The protocol that viewers can use to access the files controlled by this behavior.
   *
   * Default: ViewerProtocolPolicy.ALLOW_ALL
   */
  public fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
      unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

  /**
   * A builder for [AddBehaviorOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedMethods HTTP methods to allow for this behavior.
     */
    public fun allowedMethods(allowedMethods: AllowedMethods)

    /**
     * @param cachePolicy The cache policy for this behavior.
     * The cache policy determines what values are included in the cache key,
     * and the time-to-live (TTL) values for the cache.
     */
    public fun cachePolicy(cachePolicy: ICachePolicy)

    /**
     * @param cachedMethods HTTP methods to cache for this behavior.
     */
    public fun cachedMethods(cachedMethods: CachedMethods)

    /**
     * @param compress Whether you want CloudFront to automatically compress certain files for this
     * cache behavior.
     * See
     * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html#compressed-content-cloudfront-file-types
     * for file types CloudFront will compress.
     */
    public fun compress(compress: Boolean)

    /**
     * @param edgeLambdas The Lambda&#64;Edge functions to invoke before serving the contents.
     */
    public fun edgeLambdas(edgeLambdas: List<EdgeLambda>)

    /**
     * @param edgeLambdas The Lambda&#64;Edge functions to invoke before serving the contents.
     */
    public fun edgeLambdas(vararg edgeLambdas: EdgeLambda)

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(functionAssociations: List<FunctionAssociation>)

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(vararg functionAssociations: FunctionAssociation)

    /**
     * @param originRequestPolicy The origin request policy for this behavior.
     * The origin request policy determines which values (e.g., headers, cookies)
     * are included in requests that CloudFront sends to the origin.
     */
    public fun originRequestPolicy(originRequestPolicy: IOriginRequestPolicy)

    /**
     * @param realtimeLogConfig The real-time log configuration to be attached to this cache
     * behavior.
     */
    public fun realtimeLogConfig(realtimeLogConfig: IRealtimeLogConfig)

    /**
     * @param responseHeadersPolicy The response headers policy for this behavior.
     * The response headers policy determines which headers are included in responses
     */
    public fun responseHeadersPolicy(responseHeadersPolicy: IResponseHeadersPolicy)

    /**
     * @param smoothStreaming Set this to true to indicate you want to distribute media files in the
     * Microsoft Smooth Streaming format using this behavior.
     */
    public fun smoothStreaming(smoothStreaming: Boolean)

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
     * @param viewerProtocolPolicy The protocol that viewers can use to access the files controlled
     * by this behavior.
     */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.AddBehaviorOptions.Builder =
        software.amazon.awscdk.services.cloudfront.AddBehaviorOptions.builder()

    /**
     * @param allowedMethods HTTP methods to allow for this behavior.
     */
    override fun allowedMethods(allowedMethods: AllowedMethods) {
      cdkBuilder.allowedMethods(allowedMethods.let(AllowedMethods::unwrap))
    }

    /**
     * @param cachePolicy The cache policy for this behavior.
     * The cache policy determines what values are included in the cache key,
     * and the time-to-live (TTL) values for the cache.
     */
    override fun cachePolicy(cachePolicy: ICachePolicy) {
      cdkBuilder.cachePolicy(cachePolicy.let(ICachePolicy::unwrap))
    }

    /**
     * @param cachedMethods HTTP methods to cache for this behavior.
     */
    override fun cachedMethods(cachedMethods: CachedMethods) {
      cdkBuilder.cachedMethods(cachedMethods.let(CachedMethods::unwrap))
    }

    /**
     * @param compress Whether you want CloudFront to automatically compress certain files for this
     * cache behavior.
     * See
     * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html#compressed-content-cloudfront-file-types
     * for file types CloudFront will compress.
     */
    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
    }

    /**
     * @param edgeLambdas The Lambda&#64;Edge functions to invoke before serving the contents.
     */
    override fun edgeLambdas(edgeLambdas: List<EdgeLambda>) {
      cdkBuilder.edgeLambdas(edgeLambdas.map(EdgeLambda::unwrap))
    }

    /**
     * @param edgeLambdas The Lambda&#64;Edge functions to invoke before serving the contents.
     */
    override fun edgeLambdas(vararg edgeLambdas: EdgeLambda): Unit =
        edgeLambdas(edgeLambdas.toList())

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    override fun functionAssociations(functionAssociations: List<FunctionAssociation>) {
      cdkBuilder.functionAssociations(functionAssociations.map(FunctionAssociation::unwrap))
    }

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    override fun functionAssociations(vararg functionAssociations: FunctionAssociation): Unit =
        functionAssociations(functionAssociations.toList())

    /**
     * @param originRequestPolicy The origin request policy for this behavior.
     * The origin request policy determines which values (e.g., headers, cookies)
     * are included in requests that CloudFront sends to the origin.
     */
    override fun originRequestPolicy(originRequestPolicy: IOriginRequestPolicy) {
      cdkBuilder.originRequestPolicy(originRequestPolicy.let(IOriginRequestPolicy::unwrap))
    }

    /**
     * @param realtimeLogConfig The real-time log configuration to be attached to this cache
     * behavior.
     */
    override fun realtimeLogConfig(realtimeLogConfig: IRealtimeLogConfig) {
      cdkBuilder.realtimeLogConfig(realtimeLogConfig.let(IRealtimeLogConfig::unwrap))
    }

    /**
     * @param responseHeadersPolicy The response headers policy for this behavior.
     * The response headers policy determines which headers are included in responses
     */
    override fun responseHeadersPolicy(responseHeadersPolicy: IResponseHeadersPolicy) {
      cdkBuilder.responseHeadersPolicy(responseHeadersPolicy.let(IResponseHeadersPolicy::unwrap))
    }

    /**
     * @param smoothStreaming Set this to true to indicate you want to distribute media files in the
     * Microsoft Smooth Streaming format using this behavior.
     */
    override fun smoothStreaming(smoothStreaming: Boolean) {
      cdkBuilder.smoothStreaming(smoothStreaming)
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     * or signed cookies.
     */
    override fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>) {
      cdkBuilder.trustedKeyGroups(trustedKeyGroups.map(IKeyGroup::unwrap))
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     * or signed cookies.
     */
    override fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup): Unit =
        trustedKeyGroups(trustedKeyGroups.toList())

    /**
     * @param viewerProtocolPolicy The protocol that viewers can use to access the files controlled
     * by this behavior.
     */
    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.AddBehaviorOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.AddBehaviorOptions,
  ) : CdkObject(cdkObject), AddBehaviorOptions {
    /**
     * HTTP methods to allow for this behavior.
     *
     * Default: AllowedMethods.ALLOW_GET_HEAD
     */
    override fun allowedMethods(): AllowedMethods? =
        unwrap(this).getAllowedMethods()?.let(AllowedMethods::wrap)

    /**
     * The cache policy for this behavior.
     *
     * The cache policy determines what values are included in the cache key,
     * and the time-to-live (TTL) values for the cache.
     *
     * Default: CachePolicy.CACHING_OPTIMIZED
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html.)
     */
    override fun cachePolicy(): ICachePolicy? =
        unwrap(this).getCachePolicy()?.let(ICachePolicy::wrap)

    /**
     * HTTP methods to cache for this behavior.
     *
     * Default: CachedMethods.CACHE_GET_HEAD
     */
    override fun cachedMethods(): CachedMethods? =
        unwrap(this).getCachedMethods()?.let(CachedMethods::wrap)

    /**
     * Whether you want CloudFront to automatically compress certain files for this cache behavior.
     *
     * See
     * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html#compressed-content-cloudfront-file-types
     * for file types CloudFront will compress.
     *
     * Default: true
     */
    override fun compress(): Boolean? = unwrap(this).getCompress()

    /**
     * The Lambda&#64;Edge functions to invoke before serving the contents.
     *
     * Default: - no Lambda functions will be invoked
     *
     * [Documentation](https://aws.amazon.com/lambda/edge)
     */
    override fun edgeLambdas(): List<EdgeLambda> =
        unwrap(this).getEdgeLambdas()?.map(EdgeLambda::wrap) ?: emptyList()

    /**
     * The CloudFront functions to invoke before serving the contents.
     *
     * Default: - no functions will be invoked
     */
    override fun functionAssociations(): List<FunctionAssociation> =
        unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

    /**
     * The origin request policy for this behavior.
     *
     * The origin request policy determines which values (e.g., headers, cookies)
     * are included in requests that CloudFront sends to the origin.
     *
     * Default: - none
     */
    override fun originRequestPolicy(): IOriginRequestPolicy? =
        unwrap(this).getOriginRequestPolicy()?.let(IOriginRequestPolicy::wrap)

    /**
     * The real-time log configuration to be attached to this cache behavior.
     *
     * Default: - none
     */
    override fun realtimeLogConfig(): IRealtimeLogConfig? =
        unwrap(this).getRealtimeLogConfig()?.let(IRealtimeLogConfig::wrap)

    /**
     * The response headers policy for this behavior.
     *
     * The response headers policy determines which headers are included in responses
     *
     * Default: - none
     */
    override fun responseHeadersPolicy(): IResponseHeadersPolicy? =
        unwrap(this).getResponseHeadersPolicy()?.let(IResponseHeadersPolicy::wrap)

    /**
     * Set this to true to indicate you want to distribute media files in the Microsoft Smooth
     * Streaming format using this behavior.
     *
     * Default: false
     */
    override fun smoothStreaming(): Boolean? = unwrap(this).getSmoothStreaming()

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
     * The protocol that viewers can use to access the files controlled by this behavior.
     *
     * Default: ViewerProtocolPolicy.ALLOW_ALL
     */
    override fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
        unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddBehaviorOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.AddBehaviorOptions):
        AddBehaviorOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddBehaviorOptions):
        software.amazon.awscdk.services.cloudfront.AddBehaviorOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.AddBehaviorOptions
  }
}
