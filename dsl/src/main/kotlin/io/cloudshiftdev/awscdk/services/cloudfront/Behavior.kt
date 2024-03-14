package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface Behavior {
  public fun allowedMethods(): CloudFrontAllowedMethods? =
      unwrap(this).getAllowedMethods()?.let(CloudFrontAllowedMethods::wrap)

  public fun cachedMethods(): CloudFrontAllowedCachedMethods? =
      unwrap(this).getCachedMethods()?.let(CloudFrontAllowedCachedMethods::wrap)

  public fun compress(): Boolean? = unwrap(this).getCompress()

  public fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

  public fun forwardedValues(): CfnDistribution.ForwardedValuesProperty? =
      unwrap(this).getForwardedValues()?.let(CfnDistribution.ForwardedValuesProperty::wrap)

  public fun functionAssociations(): List<FunctionAssociation> =
      unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

  public fun isDefaultBehavior(): Boolean? = unwrap(this).getIsDefaultBehavior()

  public fun lambdaFunctionAssociations(): List<LambdaFunctionAssociation> =
      unwrap(this).getLambdaFunctionAssociations()?.map(LambdaFunctionAssociation::wrap) ?:
      emptyList()

  public fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

  public fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

  public fun pathPattern(): String? = unwrap(this).getPathPattern()

  public fun trustedKeyGroups(): List<IKeyGroup> =
      unwrap(this).getTrustedKeyGroups()?.map(IKeyGroup::wrap) ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

  public fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
      unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

  public interface Builder {
    public fun allowedMethods(allowedMethods: CloudFrontAllowedMethods)

    public fun cachedMethods(cachedMethods: CloudFrontAllowedCachedMethods)

    public fun compress(compress: Boolean)

    public fun defaultTtl(defaultTtl: Duration)

    public fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e72d697bd350b3127d266acf70adc1bef03a3414262f75c6810d5d910256e1d")
    public
        fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty.Builder.() -> Unit)

    public fun functionAssociations(functionAssociations: List<FunctionAssociation>)

    public fun isDefaultBehavior(isDefaultBehavior: Boolean)

    public
        fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<LambdaFunctionAssociation>)

    public fun maxTtl(maxTtl: Duration)

    public fun minTtl(minTtl: Duration)

    public fun pathPattern(pathPattern: String)

    public fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>)

    @Deprecated(message = "deprecated in CDK")
    public fun trustedSigners(trustedSigners: List<String>)

    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.Behavior.Builder =
        software.amazon.awscdk.services.cloudfront.Behavior.builder()

    override fun allowedMethods(allowedMethods: CloudFrontAllowedMethods) {
      cdkBuilder.allowedMethods(allowedMethods.let(CloudFrontAllowedMethods::unwrap))
    }

    override fun cachedMethods(cachedMethods: CloudFrontAllowedCachedMethods) {
      cdkBuilder.cachedMethods(cachedMethods.let(CloudFrontAllowedCachedMethods::unwrap))
    }

    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
    }

    override fun defaultTtl(defaultTtl: Duration) {
      cdkBuilder.defaultTtl(defaultTtl.let(Duration::unwrap))
    }

    override fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty) {
      cdkBuilder.forwardedValues(forwardedValues.let(CfnDistribution.ForwardedValuesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e72d697bd350b3127d266acf70adc1bef03a3414262f75c6810d5d910256e1d")
    override
        fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty.Builder.() -> Unit):
        Unit = forwardedValues(CfnDistribution.ForwardedValuesProperty(forwardedValues))

    override fun functionAssociations(functionAssociations: List<FunctionAssociation>) {
      cdkBuilder.functionAssociations(functionAssociations.map(FunctionAssociation::unwrap))
    }

    override fun isDefaultBehavior(isDefaultBehavior: Boolean) {
      cdkBuilder.isDefaultBehavior(isDefaultBehavior)
    }

    override
        fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<LambdaFunctionAssociation>) {
      cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations.map(LambdaFunctionAssociation::unwrap))
    }

    override fun maxTtl(maxTtl: Duration) {
      cdkBuilder.maxTtl(maxTtl.let(Duration::unwrap))
    }

    override fun minTtl(minTtl: Duration) {
      cdkBuilder.minTtl(minTtl.let(Duration::unwrap))
    }

    override fun pathPattern(pathPattern: String) {
      cdkBuilder.pathPattern(pathPattern)
    }

    override fun trustedKeyGroups(trustedKeyGroups: List<IKeyGroup>) {
      cdkBuilder.trustedKeyGroups(trustedKeyGroups.map(IKeyGroup::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun trustedSigners(trustedSigners: List<String>) {
      cdkBuilder.trustedSigners(trustedSigners)
    }

    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.Behavior = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.Behavior,
  ) : Behavior {
    override fun allowedMethods(): CloudFrontAllowedMethods? =
        unwrap(this).getAllowedMethods()?.let(CloudFrontAllowedMethods::wrap)

    override fun cachedMethods(): CloudFrontAllowedCachedMethods? =
        unwrap(this).getCachedMethods()?.let(CloudFrontAllowedCachedMethods::wrap)

    override fun compress(): Boolean? = unwrap(this).getCompress()

    override fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

    override fun forwardedValues(): CfnDistribution.ForwardedValuesProperty? =
        unwrap(this).getForwardedValues()?.let(CfnDistribution.ForwardedValuesProperty::wrap)

    override fun functionAssociations(): List<FunctionAssociation> =
        unwrap(this).getFunctionAssociations()?.map(FunctionAssociation::wrap) ?: emptyList()

    override fun isDefaultBehavior(): Boolean? = unwrap(this).getIsDefaultBehavior()

    override fun lambdaFunctionAssociations(): List<LambdaFunctionAssociation> =
        unwrap(this).getLambdaFunctionAssociations()?.map(LambdaFunctionAssociation::wrap) ?:
        emptyList()

    override fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

    override fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

    override fun pathPattern(): String? = unwrap(this).getPathPattern()

    override fun trustedKeyGroups(): List<IKeyGroup> =
        unwrap(this).getTrustedKeyGroups()?.map(IKeyGroup::wrap) ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

    override fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
        unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Behavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Behavior): Behavior =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Behavior): software.amazon.awscdk.services.cloudfront.Behavior =
        (wrapped as Wrapper).cdkObject
  }
}
