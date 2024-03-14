package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface AddBehaviorOptions {
  public fun allowedMethods(): AllowedMethods? =
      unwrap(this).getAllowedMethods()?.let(AllowedMethods::wrap)

  public fun cachePolicy(): ICachePolicy? = unwrap(this).getCachePolicy()?.let(ICachePolicy::wrap)

  public fun cachedMethods(): CachedMethods? =
      unwrap(this).getCachedMethods()?.let(CachedMethods::wrap)

  public fun compress(): Boolean? = unwrap(this).getCompress()

  public fun edgeLambdas(): List<EdgeLambda> = unwrap(this).getEdgeLambdas()?.map(EdgeLambda::wrap)
      ?: emptyList()

  public fun functionAssociations(): List<FunctionAssociation> =
      unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

  public fun originRequestPolicy(): IOriginRequestPolicy? =
      unwrap(this).getOriginRequestPolicy()?.let(IOriginRequestPolicy::wrap)

  public fun realtimeLogConfig(): IRealtimeLogConfig? =
      unwrap(this).getRealtimeLogConfig()?.let(IRealtimeLogConfig::wrap)

  public fun responseHeadersPolicy(): IResponseHeadersPolicy? =
      unwrap(this).getResponseHeadersPolicy()?.let(IResponseHeadersPolicy::wrap)

  public fun smoothStreaming(): Boolean? = unwrap(this).getSmoothStreaming()

  public fun trustedKeyGroups(): List<IKeyGroup> =
      unwrap(this).getTrustedKeyGroups()?.map(IKeyGroup::wrap) ?: emptyList()

  public fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
      unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

  public interface Builder {
    public fun allowedMethods(allowedMethods: AllowedMethods)

    public fun cachePolicy(cachePolicy: ICachePolicy)

    public fun cachedMethods(cachedMethods: CachedMethods)

    public fun compress(compress: Boolean)

    public fun edgeLambdas(edgeLambdas: List<EdgeLambda>)

    public fun functionAssociations(functionAssociations: List<FunctionAssociation>)

    public fun originRequestPolicy(originRequestPolicy: IOriginRequestPolicy)

    public fun realtimeLogConfig(realtimeLogConfig: IRealtimeLogConfig)

    public fun responseHeadersPolicy(responseHeadersPolicy: IResponseHeadersPolicy)

    public fun smoothStreaming(smoothStreaming: Boolean)

    public fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>)

    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.AddBehaviorOptions.Builder =
        software.amazon.awscdk.services.cloudfront.AddBehaviorOptions.builder()

    override fun allowedMethods(allowedMethods: AllowedMethods) {
      cdkBuilder.allowedMethods(allowedMethods.let(AllowedMethods::unwrap))
    }

    override fun cachePolicy(cachePolicy: ICachePolicy) {
      cdkBuilder.cachePolicy(cachePolicy.let(ICachePolicy::unwrap))
    }

    override fun cachedMethods(cachedMethods: CachedMethods) {
      cdkBuilder.cachedMethods(cachedMethods.let(CachedMethods::unwrap))
    }

    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
    }

    override fun edgeLambdas(edgeLambdas: List<EdgeLambda>) {
      cdkBuilder.edgeLambdas(edgeLambdas.map(EdgeLambda::unwrap))
    }

    override fun functionAssociations(functionAssociations: List<FunctionAssociation>) {
      cdkBuilder.functionAssociations(functionAssociations.map(FunctionAssociation::unwrap))
    }

    override fun originRequestPolicy(originRequestPolicy: IOriginRequestPolicy) {
      cdkBuilder.originRequestPolicy(originRequestPolicy.let(IOriginRequestPolicy::unwrap))
    }

    override fun realtimeLogConfig(realtimeLogConfig: IRealtimeLogConfig) {
      cdkBuilder.realtimeLogConfig(realtimeLogConfig.let(IRealtimeLogConfig::unwrap))
    }

    override fun responseHeadersPolicy(responseHeadersPolicy: IResponseHeadersPolicy) {
      cdkBuilder.responseHeadersPolicy(responseHeadersPolicy.let(IResponseHeadersPolicy::unwrap))
    }

    override fun smoothStreaming(smoothStreaming: Boolean) {
      cdkBuilder.smoothStreaming(smoothStreaming)
    }

    override fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>) {
      cdkBuilder.trustedKeyGroups(trustedKeyGroups.map(IKeyGroup::unwrap))
    }

    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.AddBehaviorOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.AddBehaviorOptions,
  ) : AddBehaviorOptions {
    override fun allowedMethods(): AllowedMethods? =
        unwrap(this).getAllowedMethods()?.let(AllowedMethods::wrap)

    override fun cachePolicy(): ICachePolicy? =
        unwrap(this).getCachePolicy()?.let(ICachePolicy::wrap)

    override fun cachedMethods(): CachedMethods? =
        unwrap(this).getCachedMethods()?.let(CachedMethods::wrap)

    override fun compress(): Boolean? = unwrap(this).getCompress()

    override fun edgeLambdas(): List<EdgeLambda> =
        unwrap(this).getEdgeLambdas()?.map(EdgeLambda::wrap) ?: emptyList()

    override fun functionAssociations(): List<FunctionAssociation> =
        unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

    override fun originRequestPolicy(): IOriginRequestPolicy? =
        unwrap(this).getOriginRequestPolicy()?.let(IOriginRequestPolicy::wrap)

    override fun realtimeLogConfig(): IRealtimeLogConfig? =
        unwrap(this).getRealtimeLogConfig()?.let(IRealtimeLogConfig::wrap)

    override fun responseHeadersPolicy(): IResponseHeadersPolicy? =
        unwrap(this).getResponseHeadersPolicy()?.let(IResponseHeadersPolicy::wrap)

    override fun smoothStreaming(): Boolean? = unwrap(this).getSmoothStreaming()

    override fun trustedKeyGroups(): List<IKeyGroup> =
        unwrap(this).getTrustedKeyGroups()?.map(IKeyGroup::wrap) ?: emptyList()

    override fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
        unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddBehaviorOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.AddBehaviorOptions):
        AddBehaviorOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddBehaviorOptions):
        software.amazon.awscdk.services.cloudfront.AddBehaviorOptions = (wrapped as
        Wrapper).cdkObject
  }
}
