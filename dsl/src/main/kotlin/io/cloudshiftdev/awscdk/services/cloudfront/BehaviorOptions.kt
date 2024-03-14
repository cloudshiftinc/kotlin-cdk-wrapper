package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface BehaviorOptions : AddBehaviorOptions {
  public fun origin(): IOrigin

  public interface Builder {
    public fun allowedMethods(allowedMethods: AllowedMethods)

    public fun cachePolicy(cachePolicy: ICachePolicy)

    public fun cachedMethods(cachedMethods: CachedMethods)

    public fun compress(compress: Boolean)

    public fun edgeLambdas(edgeLambdas: List<EdgeLambda>)

    public fun edgeLambdas(vararg edgeLambdas: EdgeLambda)

    public fun functionAssociations(functionAssociations: List<FunctionAssociation>)

    public fun functionAssociations(vararg functionAssociations: FunctionAssociation)

    public fun origin(origin: IOrigin)

    public fun originRequestPolicy(originRequestPolicy: IOriginRequestPolicy)

    public fun realtimeLogConfig(realtimeLogConfig: IRealtimeLogConfig)

    public fun responseHeadersPolicy(responseHeadersPolicy: IResponseHeadersPolicy)

    public fun smoothStreaming(smoothStreaming: Boolean)

    public fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>)

    public fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup)

    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.BehaviorOptions.Builder =
        software.amazon.awscdk.services.cloudfront.BehaviorOptions.builder()

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

    override fun edgeLambdas(vararg edgeLambdas: EdgeLambda): Unit =
        edgeLambdas(edgeLambdas.toList())

    override fun functionAssociations(functionAssociations: List<FunctionAssociation>) {
      cdkBuilder.functionAssociations(functionAssociations.map(FunctionAssociation::unwrap))
    }

    override fun functionAssociations(vararg functionAssociations: FunctionAssociation): Unit =
        functionAssociations(functionAssociations.toList())

    override fun origin(origin: IOrigin) {
      cdkBuilder.origin(origin.let(IOrigin::unwrap))
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

    override fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup): Unit =
        trustedKeyGroups(trustedKeyGroups.toList())

    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.BehaviorOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.BehaviorOptions,
  ) : BehaviorOptions {
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

    override fun origin(): IOrigin = unwrap(this).getOrigin().let(IOrigin::wrap)

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

    public operator fun invoke(block: Builder.() -> Unit = {}): BehaviorOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.BehaviorOptions):
        BehaviorOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BehaviorOptions):
        software.amazon.awscdk.services.cloudfront.BehaviorOptions = (wrapped as Wrapper).cdkObject
  }
}
