package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDistribution internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun distributionConfig(): Any = unwrap(this).getDistributionConfig()

  public open fun distributionConfig(`value`: IResolvable) {
    unwrap(this).setDistributionConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun distributionConfig(`value`: DistributionConfigProperty) {
    unwrap(this).setDistributionConfig(`value`.let(DistributionConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a17803164ac2e5598e9c6f00f7ebf3b4664351f46f27e875374b470737905e35")
  public open fun distributionConfig(`value`: DistributionConfigProperty.Builder.() -> Unit): Unit =
      distributionConfig(DistributionConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun distributionConfig(distributionConfig: IResolvable)

    public fun distributionConfig(distributionConfig: DistributionConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e379aee3bd221f987c8405b941cbd20ab829a4fddd8b607816a784e31c131113")
    public fun distributionConfig(distributionConfig: DistributionConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnDistribution.Builder =
        software.amazon.awscdk.services.cloudfront.CfnDistribution.Builder.create(scope, id)

    override fun distributionConfig(distributionConfig: IResolvable) {
      cdkBuilder.distributionConfig(distributionConfig.let(IResolvable::unwrap))
    }

    override fun distributionConfig(distributionConfig: DistributionConfigProperty) {
      cdkBuilder.distributionConfig(distributionConfig.let(DistributionConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e379aee3bd221f987c8405b941cbd20ab829a4fddd8b607816a784e31c131113")
    override
        fun distributionConfig(distributionConfig: DistributionConfigProperty.Builder.() -> Unit):
        Unit = distributionConfig(DistributionConfigProperty(distributionConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDistribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDistribution(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution):
        CfnDistribution = CfnDistribution(cdkObject)

    internal fun unwrap(wrapped: CfnDistribution):
        software.amazon.awscdk.services.cloudfront.CfnDistribution = wrapped.cdkObject
  }

  public interface DefaultCacheBehaviorProperty {
    public fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

    public fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

    public fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

    public fun compress(): Any? = unwrap(this).getCompress()

    public fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

    public fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

    public fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

    public fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

    public fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

    public fun maxTtl(): Number? = unwrap(this).getMaxTtl()

    public fun minTtl(): Number? = unwrap(this).getMinTtl()

    public fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

    public fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

    public fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

    public fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

    public fun targetOriginId(): String

    public fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?: emptyList()

    public fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

    public fun viewerProtocolPolicy(): String

    public interface Builder {
      public fun allowedMethods(allowedMethods: List<String>)

      public fun cachePolicyId(cachePolicyId: String)

      public fun cachedMethods(cachedMethods: List<String>)

      public fun compress(compress: Boolean)

      public fun compress(compress: IResolvable)

      public fun defaultTtl(defaultTtl: Number)

      public fun fieldLevelEncryptionId(fieldLevelEncryptionId: String)

      public fun forwardedValues(forwardedValues: IResolvable)

      public fun forwardedValues(forwardedValues: ForwardedValuesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f8ad03cda9ea3bdabbeb32d3f74dfffacbde0f8cb9bae3862a79e5b38d9b2e")
      public fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit)

      public fun functionAssociations(functionAssociations: IResolvable)

      public fun functionAssociations(functionAssociations: List<Any>)

      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable)

      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>)

      public fun maxTtl(maxTtl: Number)

      public fun minTtl(minTtl: Number)

      public fun originRequestPolicyId(originRequestPolicyId: String)

      public fun realtimeLogConfigArn(realtimeLogConfigArn: String)

      public fun responseHeadersPolicyId(responseHeadersPolicyId: String)

      public fun smoothStreaming(smoothStreaming: Boolean)

      public fun smoothStreaming(smoothStreaming: IResolvable)

      public fun targetOriginId(targetOriginId: String)

      public fun trustedKeyGroups(trustedKeyGroups: List<String>)

      public fun trustedSigners(trustedSigners: List<String>)

      public fun viewerProtocolPolicy(viewerProtocolPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.builder()

      override fun allowedMethods(allowedMethods: List<String>) {
        cdkBuilder.allowedMethods(allowedMethods)
      }

      override fun cachePolicyId(cachePolicyId: String) {
        cdkBuilder.cachePolicyId(cachePolicyId)
      }

      override fun cachedMethods(cachedMethods: List<String>) {
        cdkBuilder.cachedMethods(cachedMethods)
      }

      override fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
      }

      override fun compress(compress: IResolvable) {
        cdkBuilder.compress(compress.let(IResolvable::unwrap))
      }

      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      override fun fieldLevelEncryptionId(fieldLevelEncryptionId: String) {
        cdkBuilder.fieldLevelEncryptionId(fieldLevelEncryptionId)
      }

      override fun forwardedValues(forwardedValues: IResolvable) {
        cdkBuilder.forwardedValues(forwardedValues.let(IResolvable::unwrap))
      }

      override fun forwardedValues(forwardedValues: ForwardedValuesProperty) {
        cdkBuilder.forwardedValues(forwardedValues.let(ForwardedValuesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f8ad03cda9ea3bdabbeb32d3f74dfffacbde0f8cb9bae3862a79e5b38d9b2e")
      override fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit):
          Unit = forwardedValues(ForwardedValuesProperty(forwardedValues))

      override fun functionAssociations(functionAssociations: IResolvable) {
        cdkBuilder.functionAssociations(functionAssociations.let(IResolvable::unwrap))
      }

      override fun functionAssociations(functionAssociations: List<Any>) {
        cdkBuilder.functionAssociations(functionAssociations)
      }

      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations.let(IResolvable::unwrap))
      }

      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations)
      }

      override fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
      }

      override fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
      }

      override fun originRequestPolicyId(originRequestPolicyId: String) {
        cdkBuilder.originRequestPolicyId(originRequestPolicyId)
      }

      override fun realtimeLogConfigArn(realtimeLogConfigArn: String) {
        cdkBuilder.realtimeLogConfigArn(realtimeLogConfigArn)
      }

      override fun responseHeadersPolicyId(responseHeadersPolicyId: String) {
        cdkBuilder.responseHeadersPolicyId(responseHeadersPolicyId)
      }

      override fun smoothStreaming(smoothStreaming: Boolean) {
        cdkBuilder.smoothStreaming(smoothStreaming)
      }

      override fun smoothStreaming(smoothStreaming: IResolvable) {
        cdkBuilder.smoothStreaming(smoothStreaming.let(IResolvable::unwrap))
      }

      override fun targetOriginId(targetOriginId: String) {
        cdkBuilder.targetOriginId(targetOriginId)
      }

      override fun trustedKeyGroups(trustedKeyGroups: List<String>) {
        cdkBuilder.trustedKeyGroups(trustedKeyGroups)
      }

      override fun trustedSigners(trustedSigners: List<String>) {
        cdkBuilder.trustedSigners(trustedSigners)
      }

      override fun viewerProtocolPolicy(viewerProtocolPolicy: String) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty,
    ) : DefaultCacheBehaviorProperty {
      override fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

      override fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

      override fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

      override fun compress(): Any? = unwrap(this).getCompress()

      override fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

      override fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

      override fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

      override fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

      override fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

      override fun maxTtl(): Number? = unwrap(this).getMaxTtl()

      override fun minTtl(): Number? = unwrap(this).getMinTtl()

      override fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

      override fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

      override fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

      override fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

      override fun targetOriginId(): String = unwrap(this).getTargetOriginId()

      override fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?:
          emptyList()

      override fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

      override fun viewerProtocolPolicy(): String = unwrap(this).getViewerProtocolPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultCacheBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty):
          DefaultCacheBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultCacheBehaviorProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CacheBehaviorProperty {
    public fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

    public fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

    public fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

    public fun compress(): Any? = unwrap(this).getCompress()

    public fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

    public fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

    public fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

    public fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

    public fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

    public fun maxTtl(): Number? = unwrap(this).getMaxTtl()

    public fun minTtl(): Number? = unwrap(this).getMinTtl()

    public fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

    public fun pathPattern(): String

    public fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

    public fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

    public fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

    public fun targetOriginId(): String

    public fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?: emptyList()

    public fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

    public fun viewerProtocolPolicy(): String

    public interface Builder {
      public fun allowedMethods(allowedMethods: List<String>)

      public fun cachePolicyId(cachePolicyId: String)

      public fun cachedMethods(cachedMethods: List<String>)

      public fun compress(compress: Boolean)

      public fun compress(compress: IResolvable)

      public fun defaultTtl(defaultTtl: Number)

      public fun fieldLevelEncryptionId(fieldLevelEncryptionId: String)

      public fun forwardedValues(forwardedValues: IResolvable)

      public fun forwardedValues(forwardedValues: ForwardedValuesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8f1f87993d6171cdc73086055f6bc637b8d209737a2e322543a6d01cedcb71")
      public fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit)

      public fun functionAssociations(functionAssociations: IResolvable)

      public fun functionAssociations(functionAssociations: List<Any>)

      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable)

      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>)

      public fun maxTtl(maxTtl: Number)

      public fun minTtl(minTtl: Number)

      public fun originRequestPolicyId(originRequestPolicyId: String)

      public fun pathPattern(pathPattern: String)

      public fun realtimeLogConfigArn(realtimeLogConfigArn: String)

      public fun responseHeadersPolicyId(responseHeadersPolicyId: String)

      public fun smoothStreaming(smoothStreaming: Boolean)

      public fun smoothStreaming(smoothStreaming: IResolvable)

      public fun targetOriginId(targetOriginId: String)

      public fun trustedKeyGroups(trustedKeyGroups: List<String>)

      public fun trustedSigners(trustedSigners: List<String>)

      public fun viewerProtocolPolicy(viewerProtocolPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.builder()

      override fun allowedMethods(allowedMethods: List<String>) {
        cdkBuilder.allowedMethods(allowedMethods)
      }

      override fun cachePolicyId(cachePolicyId: String) {
        cdkBuilder.cachePolicyId(cachePolicyId)
      }

      override fun cachedMethods(cachedMethods: List<String>) {
        cdkBuilder.cachedMethods(cachedMethods)
      }

      override fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
      }

      override fun compress(compress: IResolvable) {
        cdkBuilder.compress(compress.let(IResolvable::unwrap))
      }

      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      override fun fieldLevelEncryptionId(fieldLevelEncryptionId: String) {
        cdkBuilder.fieldLevelEncryptionId(fieldLevelEncryptionId)
      }

      override fun forwardedValues(forwardedValues: IResolvable) {
        cdkBuilder.forwardedValues(forwardedValues.let(IResolvable::unwrap))
      }

      override fun forwardedValues(forwardedValues: ForwardedValuesProperty) {
        cdkBuilder.forwardedValues(forwardedValues.let(ForwardedValuesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8f1f87993d6171cdc73086055f6bc637b8d209737a2e322543a6d01cedcb71")
      override fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit):
          Unit = forwardedValues(ForwardedValuesProperty(forwardedValues))

      override fun functionAssociations(functionAssociations: IResolvable) {
        cdkBuilder.functionAssociations(functionAssociations.let(IResolvable::unwrap))
      }

      override fun functionAssociations(functionAssociations: List<Any>) {
        cdkBuilder.functionAssociations(functionAssociations)
      }

      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations.let(IResolvable::unwrap))
      }

      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations)
      }

      override fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
      }

      override fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
      }

      override fun originRequestPolicyId(originRequestPolicyId: String) {
        cdkBuilder.originRequestPolicyId(originRequestPolicyId)
      }

      override fun pathPattern(pathPattern: String) {
        cdkBuilder.pathPattern(pathPattern)
      }

      override fun realtimeLogConfigArn(realtimeLogConfigArn: String) {
        cdkBuilder.realtimeLogConfigArn(realtimeLogConfigArn)
      }

      override fun responseHeadersPolicyId(responseHeadersPolicyId: String) {
        cdkBuilder.responseHeadersPolicyId(responseHeadersPolicyId)
      }

      override fun smoothStreaming(smoothStreaming: Boolean) {
        cdkBuilder.smoothStreaming(smoothStreaming)
      }

      override fun smoothStreaming(smoothStreaming: IResolvable) {
        cdkBuilder.smoothStreaming(smoothStreaming.let(IResolvable::unwrap))
      }

      override fun targetOriginId(targetOriginId: String) {
        cdkBuilder.targetOriginId(targetOriginId)
      }

      override fun trustedKeyGroups(trustedKeyGroups: List<String>) {
        cdkBuilder.trustedKeyGroups(trustedKeyGroups)
      }

      override fun trustedSigners(trustedSigners: List<String>) {
        cdkBuilder.trustedSigners(trustedSigners)
      }

      override fun viewerProtocolPolicy(viewerProtocolPolicy: String) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty,
    ) : CacheBehaviorProperty {
      override fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

      override fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

      override fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

      override fun compress(): Any? = unwrap(this).getCompress()

      override fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

      override fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

      override fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

      override fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

      override fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

      override fun maxTtl(): Number? = unwrap(this).getMaxTtl()

      override fun minTtl(): Number? = unwrap(this).getMinTtl()

      override fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

      override fun pathPattern(): String = unwrap(this).getPathPattern()

      override fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

      override fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

      override fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

      override fun targetOriginId(): String = unwrap(this).getTargetOriginId()

      override fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?:
          emptyList()

      override fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

      override fun viewerProtocolPolicy(): String = unwrap(this).getViewerProtocolPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CacheBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty):
          CacheBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheBehaviorProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OriginGroupsProperty {
    public fun items(): Any? = unwrap(this).getItems()

    public fun quantity(): Number

    public interface Builder {
      public fun items(items: IResolvable)

      public fun items(items: List<Any>)

      public fun quantity(quantity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty.builder()

      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      override fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty,
    ) : OriginGroupsProperty {
      override fun items(): Any? = unwrap(this).getItems()

      override fun quantity(): Number = unwrap(this).getQuantity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty):
          OriginGroupsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupsProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CustomErrorResponseProperty {
    public fun errorCachingMinTtl(): Number? = unwrap(this).getErrorCachingMinTtl()

    public fun errorCode(): Number

    public fun responseCode(): Number? = unwrap(this).getResponseCode()

    public fun responsePagePath(): String? = unwrap(this).getResponsePagePath()

    public interface Builder {
      public fun errorCachingMinTtl(errorCachingMinTtl: Number)

      public fun errorCode(errorCode: Number)

      public fun responseCode(responseCode: Number)

      public fun responsePagePath(responsePagePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.builder()

      override fun errorCachingMinTtl(errorCachingMinTtl: Number) {
        cdkBuilder.errorCachingMinTtl(errorCachingMinTtl)
      }

      override fun errorCode(errorCode: Number) {
        cdkBuilder.errorCode(errorCode)
      }

      override fun responseCode(responseCode: Number) {
        cdkBuilder.responseCode(responseCode)
      }

      override fun responsePagePath(responsePagePath: String) {
        cdkBuilder.responsePagePath(responsePagePath)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty,
    ) : CustomErrorResponseProperty {
      override fun errorCachingMinTtl(): Number? = unwrap(this).getErrorCachingMinTtl()

      override fun errorCode(): Number = unwrap(this).getErrorCode()

      override fun responseCode(): Number? = unwrap(this).getResponseCode()

      override fun responsePagePath(): String? = unwrap(this).getResponsePagePath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomErrorResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty):
          CustomErrorResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomErrorResponseProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GeoRestrictionProperty {
    public fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

    public fun restrictionType(): String

    public interface Builder {
      public fun locations(locations: List<String>)

      public fun restrictionType(restrictionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.builder()

      override fun locations(locations: List<String>) {
        cdkBuilder.locations(locations)
      }

      override fun restrictionType(restrictionType: String) {
        cdkBuilder.restrictionType(restrictionType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty,
    ) : GeoRestrictionProperty {
      override fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

      override fun restrictionType(): String = unwrap(this).getRestrictionType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeoRestrictionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty):
          GeoRestrictionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoRestrictionProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3OriginConfigProperty {
    public fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()

    public interface Builder {
      public fun originAccessIdentity(originAccessIdentity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.builder()

      override fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty,
    ) : S3OriginConfigProperty {
      override fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty):
          S3OriginConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OriginConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggingProperty {
    public fun bucket(): String

    public fun includeCookies(): Any? = unwrap(this).getIncludeCookies()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun includeCookies(includeCookies: Boolean)

      public fun includeCookies(includeCookies: IResolvable)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun includeCookies(includeCookies: Boolean) {
        cdkBuilder.includeCookies(includeCookies)
      }

      override fun includeCookies(includeCookies: IResolvable) {
        cdkBuilder.includeCookies(includeCookies.let(IResolvable::unwrap))
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty,
    ) : LoggingProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun includeCookies(): Any? = unwrap(this).getIncludeCookies()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty):
          LoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CookiesProperty {
    public fun forward(): String

    public fun whitelistedNames(): List<String> = unwrap(this).getWhitelistedNames() ?: emptyList()

    public interface Builder {
      public fun forward(forward: String)

      public fun whitelistedNames(whitelistedNames: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.builder()

      override fun forward(forward: String) {
        cdkBuilder.forward(forward)
      }

      override fun whitelistedNames(whitelistedNames: List<String>) {
        cdkBuilder.whitelistedNames(whitelistedNames)
      }

      public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty,
    ) : CookiesProperty {
      override fun forward(): String = unwrap(this).getForward()

      override fun whitelistedNames(): List<String> = unwrap(this).getWhitelistedNames() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty):
          CookiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FunctionAssociationProperty {
    public fun eventType(): String? = unwrap(this).getEventType()

    public fun functionArn(): String? = unwrap(this).getFunctionArn()

    public interface Builder {
      public fun eventType(eventType: String)

      public fun functionArn(functionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty.builder()

      override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty,
    ) : FunctionAssociationProperty {
      override fun eventType(): String? = unwrap(this).getEventType()

      override fun functionArn(): String? = unwrap(this).getFunctionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty):
          FunctionAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionAssociationProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomOriginConfigProperty {
    public fun httpPort(): Number? = unwrap(this).getHttpPort()

    public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    public fun originKeepaliveTimeout(): Number? = unwrap(this).getOriginKeepaliveTimeout()

    public fun originProtocolPolicy(): String

    public fun originReadTimeout(): Number? = unwrap(this).getOriginReadTimeout()

    public fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols() ?:
        emptyList()

    public interface Builder {
      public fun httpPort(httpPort: Number)

      public fun httpsPort(httpsPort: Number)

      public fun originKeepaliveTimeout(originKeepaliveTimeout: Number)

      public fun originProtocolPolicy(originProtocolPolicy: String)

      public fun originReadTimeout(originReadTimeout: Number)

      public fun originSslProtocols(originSslProtocols: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.builder()

      override fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
      }

      override fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
      }

      override fun originKeepaliveTimeout(originKeepaliveTimeout: Number) {
        cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout)
      }

      override fun originProtocolPolicy(originProtocolPolicy: String) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
      }

      override fun originReadTimeout(originReadTimeout: Number) {
        cdkBuilder.originReadTimeout(originReadTimeout)
      }

      override fun originSslProtocols(originSslProtocols: List<String>) {
        cdkBuilder.originSslProtocols(originSslProtocols)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty,
    ) : CustomOriginConfigProperty {
      override fun httpPort(): Number? = unwrap(this).getHttpPort()

      override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

      override fun originKeepaliveTimeout(): Number? = unwrap(this).getOriginKeepaliveTimeout()

      override fun originProtocolPolicy(): String = unwrap(this).getOriginProtocolPolicy()

      override fun originReadTimeout(): Number? = unwrap(this).getOriginReadTimeout()

      override fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomOriginConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty):
          CustomOriginConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomOriginConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ForwardedValuesProperty {
    public fun cookies(): Any? = unwrap(this).getCookies()

    public fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

    public fun queryString(): Any

    public fun queryStringCacheKeys(): List<String> = unwrap(this).getQueryStringCacheKeys() ?:
        emptyList()

    public interface Builder {
      public fun cookies(cookies: IResolvable)

      public fun cookies(cookies: CookiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("666e662212dff6226b09427b06ca346ed73b4e2e9770e95579189693bce8332b")
      public fun cookies(cookies: CookiesProperty.Builder.() -> Unit)

      public fun headers(headers: List<String>)

      public fun queryString(queryString: Boolean)

      public fun queryString(queryString: IResolvable)

      public fun queryStringCacheKeys(queryStringCacheKeys: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.builder()

      override fun cookies(cookies: IResolvable) {
        cdkBuilder.cookies(cookies.let(IResolvable::unwrap))
      }

      override fun cookies(cookies: CookiesProperty) {
        cdkBuilder.cookies(cookies.let(CookiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("666e662212dff6226b09427b06ca346ed73b4e2e9770e95579189693bce8332b")
      override fun cookies(cookies: CookiesProperty.Builder.() -> Unit): Unit =
          cookies(CookiesProperty(cookies))

      override fun headers(headers: List<String>) {
        cdkBuilder.headers(headers)
      }

      override fun queryString(queryString: Boolean) {
        cdkBuilder.queryString(queryString)
      }

      override fun queryString(queryString: IResolvable) {
        cdkBuilder.queryString(queryString.let(IResolvable::unwrap))
      }

      override fun queryStringCacheKeys(queryStringCacheKeys: List<String>) {
        cdkBuilder.queryStringCacheKeys(queryStringCacheKeys)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty,
    ) : ForwardedValuesProperty {
      override fun cookies(): Any? = unwrap(this).getCookies()

      override fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

      override fun queryString(): Any = unwrap(this).getQueryString()

      override fun queryStringCacheKeys(): List<String> = unwrap(this).getQueryStringCacheKeys() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardedValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty):
          ForwardedValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardedValuesProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ViewerCertificateProperty {
    public fun acmCertificateArn(): String? = unwrap(this).getAcmCertificateArn()

    public fun cloudFrontDefaultCertificate(): Any? = unwrap(this).getCloudFrontDefaultCertificate()

    public fun iamCertificateId(): String? = unwrap(this).getIamCertificateId()

    public fun minimumProtocolVersion(): String? = unwrap(this).getMinimumProtocolVersion()

    public fun sslSupportMethod(): String? = unwrap(this).getSslSupportMethod()

    public interface Builder {
      public fun acmCertificateArn(acmCertificateArn: String)

      public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: Boolean)

      public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: IResolvable)

      public fun iamCertificateId(iamCertificateId: String)

      public fun minimumProtocolVersion(minimumProtocolVersion: String)

      public fun sslSupportMethod(sslSupportMethod: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.builder()

      override fun acmCertificateArn(acmCertificateArn: String) {
        cdkBuilder.acmCertificateArn(acmCertificateArn)
      }

      override fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: Boolean) {
        cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate)
      }

      override fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: IResolvable) {
        cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate.let(IResolvable::unwrap))
      }

      override fun iamCertificateId(iamCertificateId: String) {
        cdkBuilder.iamCertificateId(iamCertificateId)
      }

      override fun minimumProtocolVersion(minimumProtocolVersion: String) {
        cdkBuilder.minimumProtocolVersion(minimumProtocolVersion)
      }

      override fun sslSupportMethod(sslSupportMethod: String) {
        cdkBuilder.sslSupportMethod(sslSupportMethod)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty,
    ) : ViewerCertificateProperty {
      override fun acmCertificateArn(): String? = unwrap(this).getAcmCertificateArn()

      override fun cloudFrontDefaultCertificate(): Any? =
          unwrap(this).getCloudFrontDefaultCertificate()

      override fun iamCertificateId(): String? = unwrap(this).getIamCertificateId()

      override fun minimumProtocolVersion(): String? = unwrap(this).getMinimumProtocolVersion()

      override fun sslSupportMethod(): String? = unwrap(this).getSslSupportMethod()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ViewerCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty):
          ViewerCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ViewerCertificateProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DistributionConfigProperty {
    public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    public fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

    public fun cnamEs(): List<String> = unwrap(this).getCnamEs() ?: emptyList()

    public fun comment(): String? = unwrap(this).getComment()

    public fun continuousDeploymentPolicyId(): String? =
        unwrap(this).getContinuousDeploymentPolicyId()

    public fun customErrorResponses(): Any? = unwrap(this).getCustomErrorResponses()

    public fun customOrigin(): Any? = unwrap(this).getCustomOrigin()

    public fun defaultCacheBehavior(): Any

    public fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

    public fun enabled(): Any

    public fun httpVersion(): String? = unwrap(this).getHttpVersion()

    public fun ipv6Enabled(): Any? = unwrap(this).getIpv6Enabled()

    public fun logging(): Any? = unwrap(this).getLogging()

    public fun originGroups(): Any? = unwrap(this).getOriginGroups()

    public fun origins(): Any? = unwrap(this).getOrigins()

    public fun priceClass(): String? = unwrap(this).getPriceClass()

    public fun restrictions(): Any? = unwrap(this).getRestrictions()

    public fun s3Origin(): Any? = unwrap(this).getS3Origin()

    public fun staging(): Any? = unwrap(this).getStaging()

    public fun viewerCertificate(): Any? = unwrap(this).getViewerCertificate()

    public fun webAclId(): String? = unwrap(this).getWebAclId()

    public interface Builder {
      public fun aliases(aliases: List<String>)

      public fun cacheBehaviors(cacheBehaviors: IResolvable)

      public fun cacheBehaviors(cacheBehaviors: List<Any>)

      public fun cnamEs(cnamEs: List<String>)

      public fun comment(comment: String)

      public fun continuousDeploymentPolicyId(continuousDeploymentPolicyId: String)

      public fun customErrorResponses(customErrorResponses: IResolvable)

      public fun customErrorResponses(customErrorResponses: List<Any>)

      public fun customOrigin(customOrigin: IResolvable)

      public fun customOrigin(customOrigin: LegacyCustomOriginProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("727a62ee2d654fbc3a1c3b7028a0c1e7cdb5dc3e7d19714972629cd0f8e2e5f0")
      public fun customOrigin(customOrigin: LegacyCustomOriginProperty.Builder.() -> Unit)

      public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable)

      public fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d62aa0f015521cdd4014cc800720d9a7da92b7f050630202b0f209e35d72d47")
      public
          fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty.Builder.() -> Unit)

      public fun defaultRootObject(defaultRootObject: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun httpVersion(httpVersion: String)

      public fun ipv6Enabled(ipv6Enabled: Boolean)

      public fun ipv6Enabled(ipv6Enabled: IResolvable)

      public fun logging(logging: IResolvable)

      public fun logging(logging: LoggingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c19cbffc19f9f89fba25e2fea7e0041578689fa928da7d6223b5ac0763213e")
      public fun logging(logging: LoggingProperty.Builder.() -> Unit)

      public fun originGroups(originGroups: IResolvable)

      public fun originGroups(originGroups: OriginGroupsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f59d2af37d5e0c1affac226dd716cf3cf68ab60464638dfe4625c532a25e3ad")
      public fun originGroups(originGroups: OriginGroupsProperty.Builder.() -> Unit)

      public fun origins(origins: IResolvable)

      public fun origins(origins: List<Any>)

      public fun priceClass(priceClass: String)

      public fun restrictions(restrictions: IResolvable)

      public fun restrictions(restrictions: RestrictionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dd22e126e2e93ff812a180da99a1548020ec556b2734fa09087fbbaf07e47b3")
      public fun restrictions(restrictions: RestrictionsProperty.Builder.() -> Unit)

      public fun s3Origin(s3Origin: IResolvable)

      public fun s3Origin(s3Origin: LegacyS3OriginProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("634153888b6910f25984f15fc15a9cfd8cfcd431da7d237de24a0c3c46dccd4a")
      public fun s3Origin(s3Origin: LegacyS3OriginProperty.Builder.() -> Unit)

      public fun staging(staging: Boolean)

      public fun staging(staging: IResolvable)

      public fun viewerCertificate(viewerCertificate: IResolvable)

      public fun viewerCertificate(viewerCertificate: ViewerCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3fcb2f5f45457646e32f82b20be2f6c740f0ffbd4e51595da0a7e5e7bacfb32")
      public fun viewerCertificate(viewerCertificate: ViewerCertificateProperty.Builder.() -> Unit)

      public fun webAclId(webAclId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.builder()

      override fun aliases(aliases: List<String>) {
        cdkBuilder.aliases(aliases)
      }

      override fun cacheBehaviors(cacheBehaviors: IResolvable) {
        cdkBuilder.cacheBehaviors(cacheBehaviors.let(IResolvable::unwrap))
      }

      override fun cacheBehaviors(cacheBehaviors: List<Any>) {
        cdkBuilder.cacheBehaviors(cacheBehaviors)
      }

      override fun cnamEs(cnamEs: List<String>) {
        cdkBuilder.cnamEs(cnamEs)
      }

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun continuousDeploymentPolicyId(continuousDeploymentPolicyId: String) {
        cdkBuilder.continuousDeploymentPolicyId(continuousDeploymentPolicyId)
      }

      override fun customErrorResponses(customErrorResponses: IResolvable) {
        cdkBuilder.customErrorResponses(customErrorResponses.let(IResolvable::unwrap))
      }

      override fun customErrorResponses(customErrorResponses: List<Any>) {
        cdkBuilder.customErrorResponses(customErrorResponses)
      }

      override fun customOrigin(customOrigin: IResolvable) {
        cdkBuilder.customOrigin(customOrigin.let(IResolvable::unwrap))
      }

      override fun customOrigin(customOrigin: LegacyCustomOriginProperty) {
        cdkBuilder.customOrigin(customOrigin.let(LegacyCustomOriginProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("727a62ee2d654fbc3a1c3b7028a0c1e7cdb5dc3e7d19714972629cd0f8e2e5f0")
      override fun customOrigin(customOrigin: LegacyCustomOriginProperty.Builder.() -> Unit): Unit =
          customOrigin(LegacyCustomOriginProperty(customOrigin))

      override fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
        cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(IResolvable::unwrap))
      }

      override fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty) {
        cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(DefaultCacheBehaviorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d62aa0f015521cdd4014cc800720d9a7da92b7f050630202b0f209e35d72d47")
      override
          fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty.Builder.() -> Unit):
          Unit = defaultCacheBehavior(DefaultCacheBehaviorProperty(defaultCacheBehavior))

      override fun defaultRootObject(defaultRootObject: String) {
        cdkBuilder.defaultRootObject(defaultRootObject)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun httpVersion(httpVersion: String) {
        cdkBuilder.httpVersion(httpVersion)
      }

      override fun ipv6Enabled(ipv6Enabled: Boolean) {
        cdkBuilder.ipv6Enabled(ipv6Enabled)
      }

      override fun ipv6Enabled(ipv6Enabled: IResolvable) {
        cdkBuilder.ipv6Enabled(ipv6Enabled.let(IResolvable::unwrap))
      }

      override fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging.let(IResolvable::unwrap))
      }

      override fun logging(logging: LoggingProperty) {
        cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c19cbffc19f9f89fba25e2fea7e0041578689fa928da7d6223b5ac0763213e")
      override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
          logging(LoggingProperty(logging))

      override fun originGroups(originGroups: IResolvable) {
        cdkBuilder.originGroups(originGroups.let(IResolvable::unwrap))
      }

      override fun originGroups(originGroups: OriginGroupsProperty) {
        cdkBuilder.originGroups(originGroups.let(OriginGroupsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f59d2af37d5e0c1affac226dd716cf3cf68ab60464638dfe4625c532a25e3ad")
      override fun originGroups(originGroups: OriginGroupsProperty.Builder.() -> Unit): Unit =
          originGroups(OriginGroupsProperty(originGroups))

      override fun origins(origins: IResolvable) {
        cdkBuilder.origins(origins.let(IResolvable::unwrap))
      }

      override fun origins(origins: List<Any>) {
        cdkBuilder.origins(origins)
      }

      override fun priceClass(priceClass: String) {
        cdkBuilder.priceClass(priceClass)
      }

      override fun restrictions(restrictions: IResolvable) {
        cdkBuilder.restrictions(restrictions.let(IResolvable::unwrap))
      }

      override fun restrictions(restrictions: RestrictionsProperty) {
        cdkBuilder.restrictions(restrictions.let(RestrictionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dd22e126e2e93ff812a180da99a1548020ec556b2734fa09087fbbaf07e47b3")
      override fun restrictions(restrictions: RestrictionsProperty.Builder.() -> Unit): Unit =
          restrictions(RestrictionsProperty(restrictions))

      override fun s3Origin(s3Origin: IResolvable) {
        cdkBuilder.s3Origin(s3Origin.let(IResolvable::unwrap))
      }

      override fun s3Origin(s3Origin: LegacyS3OriginProperty) {
        cdkBuilder.s3Origin(s3Origin.let(LegacyS3OriginProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("634153888b6910f25984f15fc15a9cfd8cfcd431da7d237de24a0c3c46dccd4a")
      override fun s3Origin(s3Origin: LegacyS3OriginProperty.Builder.() -> Unit): Unit =
          s3Origin(LegacyS3OriginProperty(s3Origin))

      override fun staging(staging: Boolean) {
        cdkBuilder.staging(staging)
      }

      override fun staging(staging: IResolvable) {
        cdkBuilder.staging(staging.let(IResolvable::unwrap))
      }

      override fun viewerCertificate(viewerCertificate: IResolvable) {
        cdkBuilder.viewerCertificate(viewerCertificate.let(IResolvable::unwrap))
      }

      override fun viewerCertificate(viewerCertificate: ViewerCertificateProperty) {
        cdkBuilder.viewerCertificate(viewerCertificate.let(ViewerCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3fcb2f5f45457646e32f82b20be2f6c740f0ffbd4e51595da0a7e5e7bacfb32")
      override
          fun viewerCertificate(viewerCertificate: ViewerCertificateProperty.Builder.() -> Unit):
          Unit = viewerCertificate(ViewerCertificateProperty(viewerCertificate))

      override fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty,
    ) : DistributionConfigProperty {
      override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

      override fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

      override fun cnamEs(): List<String> = unwrap(this).getCnamEs() ?: emptyList()

      override fun comment(): String? = unwrap(this).getComment()

      override fun continuousDeploymentPolicyId(): String? =
          unwrap(this).getContinuousDeploymentPolicyId()

      override fun customErrorResponses(): Any? = unwrap(this).getCustomErrorResponses()

      override fun customOrigin(): Any? = unwrap(this).getCustomOrigin()

      override fun defaultCacheBehavior(): Any = unwrap(this).getDefaultCacheBehavior()

      override fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun httpVersion(): String? = unwrap(this).getHttpVersion()

      override fun ipv6Enabled(): Any? = unwrap(this).getIpv6Enabled()

      override fun logging(): Any? = unwrap(this).getLogging()

      override fun originGroups(): Any? = unwrap(this).getOriginGroups()

      override fun origins(): Any? = unwrap(this).getOrigins()

      override fun priceClass(): String? = unwrap(this).getPriceClass()

      override fun restrictions(): Any? = unwrap(this).getRestrictions()

      override fun s3Origin(): Any? = unwrap(this).getS3Origin()

      override fun staging(): Any? = unwrap(this).getStaging()

      override fun viewerCertificate(): Any? = unwrap(this).getViewerCertificate()

      override fun webAclId(): String? = unwrap(this).getWebAclId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DistributionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty):
          DistributionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DistributionConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OriginShieldProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun originShieldRegion(originShieldRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty,
    ) : OriginShieldProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginShieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty):
          OriginShieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginShieldProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface StatusCodesProperty {
    public fun items(): Any

    public fun quantity(): Number

    public interface Builder {
      public fun items(items: IResolvable)

      public fun items(items: List<Number>)

      public fun quantity(quantity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty.builder()

      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      override fun items(items: List<Number>) {
        cdkBuilder.items(items)
      }

      override fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty,
    ) : StatusCodesProperty {
      override fun items(): Any = unwrap(this).getItems()

      override fun quantity(): Number = unwrap(this).getQuantity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatusCodesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty):
          StatusCodesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatusCodesProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OriginGroupFailoverCriteriaProperty {
    public fun statusCodes(): Any

    public interface Builder {
      public fun statusCodes(statusCodes: IResolvable)

      public fun statusCodes(statusCodes: StatusCodesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c997e834a3ff812829e5458abdbdc4343717bb3acf0af3ba1122ba6ad465bcfc")
      public fun statusCodes(statusCodes: StatusCodesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty.builder()

      override fun statusCodes(statusCodes: IResolvable) {
        cdkBuilder.statusCodes(statusCodes.let(IResolvable::unwrap))
      }

      override fun statusCodes(statusCodes: StatusCodesProperty) {
        cdkBuilder.statusCodes(statusCodes.let(StatusCodesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c997e834a3ff812829e5458abdbdc4343717bb3acf0af3ba1122ba6ad465bcfc")
      override fun statusCodes(statusCodes: StatusCodesProperty.Builder.() -> Unit): Unit =
          statusCodes(StatusCodesProperty(statusCodes))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty,
    ) : OriginGroupFailoverCriteriaProperty {
      override fun statusCodes(): Any = unwrap(this).getStatusCodes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OriginGroupFailoverCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty):
          OriginGroupFailoverCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupFailoverCriteriaProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OriginGroupMembersProperty {
    public fun items(): Any

    public fun quantity(): Number

    public interface Builder {
      public fun items(items: IResolvable)

      public fun items(items: List<Any>)

      public fun quantity(quantity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty.builder()

      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      override fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty,
    ) : OriginGroupMembersProperty {
      override fun items(): Any = unwrap(this).getItems()

      override fun quantity(): Number = unwrap(this).getQuantity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupMembersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty):
          OriginGroupMembersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupMembersProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaFunctionAssociationProperty {
    public fun eventType(): String? = unwrap(this).getEventType()

    public fun includeBody(): Any? = unwrap(this).getIncludeBody()

    public fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()

    public interface Builder {
      public fun eventType(eventType: String)

      public fun includeBody(includeBody: Boolean)

      public fun includeBody(includeBody: IResolvable)

      public fun lambdaFunctionArn(lambdaFunctionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.builder()

      override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      override fun includeBody(includeBody: Boolean) {
        cdkBuilder.includeBody(includeBody)
      }

      override fun includeBody(includeBody: IResolvable) {
        cdkBuilder.includeBody(includeBody.let(IResolvable::unwrap))
      }

      override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty,
    ) : LambdaFunctionAssociationProperty {
      override fun eventType(): String? = unwrap(this).getEventType()

      override fun includeBody(): Any? = unwrap(this).getIncludeBody()

      override fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaFunctionAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty):
          LambdaFunctionAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionAssociationProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LegacyS3OriginProperty {
    public fun dnsName(): String

    public fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()

    public interface Builder {
      public fun dnsName(dnsName: String)

      public fun originAccessIdentity(originAccessIdentity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty.builder()

      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      override fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty,
    ) : LegacyS3OriginProperty {
      override fun dnsName(): String = unwrap(this).getDnsName()

      override fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LegacyS3OriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty):
          LegacyS3OriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LegacyS3OriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OriginGroupProperty {
    public fun failoverCriteria(): Any

    public fun id(): String

    public fun members(): Any

    public interface Builder {
      public fun failoverCriteria(failoverCriteria: IResolvable)

      public fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f4d787b4e92fe92e336afdb492b94f8b4716801cfb8fce8dc7508cce0320d34")
      public
          fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty.Builder.() -> Unit)

      public fun id(id: String)

      public fun members(members: IResolvable)

      public fun members(members: OriginGroupMembersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97933107d8a6aac776e575fc5da0ed9131a507ebb8949d354f76489a3be51a4e")
      public fun members(members: OriginGroupMembersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty.builder()

      override fun failoverCriteria(failoverCriteria: IResolvable) {
        cdkBuilder.failoverCriteria(failoverCriteria.let(IResolvable::unwrap))
      }

      override fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty) {
        cdkBuilder.failoverCriteria(failoverCriteria.let(OriginGroupFailoverCriteriaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f4d787b4e92fe92e336afdb492b94f8b4716801cfb8fce8dc7508cce0320d34")
      override
          fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty.Builder.() -> Unit):
          Unit = failoverCriteria(OriginGroupFailoverCriteriaProperty(failoverCriteria))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun members(members: IResolvable) {
        cdkBuilder.members(members.let(IResolvable::unwrap))
      }

      override fun members(members: OriginGroupMembersProperty) {
        cdkBuilder.members(members.let(OriginGroupMembersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97933107d8a6aac776e575fc5da0ed9131a507ebb8949d354f76489a3be51a4e")
      override fun members(members: OriginGroupMembersProperty.Builder.() -> Unit): Unit =
          members(OriginGroupMembersProperty(members))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty,
    ) : OriginGroupProperty {
      override fun failoverCriteria(): Any = unwrap(this).getFailoverCriteria()

      override fun id(): String = unwrap(this).getId()

      override fun members(): Any = unwrap(this).getMembers()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty):
          OriginGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OriginProperty {
    public fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    public fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

    public fun customOriginConfig(): Any? = unwrap(this).getCustomOriginConfig()

    public fun domainName(): String

    public fun id(): String

    public fun originAccessControlId(): String? = unwrap(this).getOriginAccessControlId()

    public fun originCustomHeaders(): Any? = unwrap(this).getOriginCustomHeaders()

    public fun originPath(): String? = unwrap(this).getOriginPath()

    public fun originShield(): Any? = unwrap(this).getOriginShield()

    public fun s3OriginConfig(): Any? = unwrap(this).getS3OriginConfig()

    public interface Builder {
      public fun connectionAttempts(connectionAttempts: Number)

      public fun connectionTimeout(connectionTimeout: Number)

      public fun customOriginConfig(customOriginConfig: IResolvable)

      public fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("673786f28187da609be6f59efa8a3d8d357f3ffa2f59a93f79f80c4940585d7f")
      public
          fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty.Builder.() -> Unit)

      public fun domainName(domainName: String)

      public fun id(id: String)

      public fun originAccessControlId(originAccessControlId: String)

      public fun originCustomHeaders(originCustomHeaders: IResolvable)

      public fun originCustomHeaders(originCustomHeaders: List<Any>)

      public fun originPath(originPath: String)

      public fun originShield(originShield: IResolvable)

      public fun originShield(originShield: OriginShieldProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39f284527bb4abacf89ca1a17e2c98adcb7d71c7f4863bde84c03ebc84d1de75")
      public fun originShield(originShield: OriginShieldProperty.Builder.() -> Unit)

      public fun s3OriginConfig(s3OriginConfig: IResolvable)

      public fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("345ceecbfefa4e6f7dfc83aa125d7e491472a25e0620b0a0ff0e1fa09fe5eea9")
      public fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.builder()

      override fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
      }

      override fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
      }

      override fun customOriginConfig(customOriginConfig: IResolvable) {
        cdkBuilder.customOriginConfig(customOriginConfig.let(IResolvable::unwrap))
      }

      override fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty) {
        cdkBuilder.customOriginConfig(customOriginConfig.let(CustomOriginConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("673786f28187da609be6f59efa8a3d8d357f3ffa2f59a93f79f80c4940585d7f")
      override
          fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty.Builder.() -> Unit):
          Unit = customOriginConfig(CustomOriginConfigProperty(customOriginConfig))

      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun originAccessControlId(originAccessControlId: String) {
        cdkBuilder.originAccessControlId(originAccessControlId)
      }

      override fun originCustomHeaders(originCustomHeaders: IResolvable) {
        cdkBuilder.originCustomHeaders(originCustomHeaders.let(IResolvable::unwrap))
      }

      override fun originCustomHeaders(originCustomHeaders: List<Any>) {
        cdkBuilder.originCustomHeaders(originCustomHeaders)
      }

      override fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
      }

      override fun originShield(originShield: IResolvable) {
        cdkBuilder.originShield(originShield.let(IResolvable::unwrap))
      }

      override fun originShield(originShield: OriginShieldProperty) {
        cdkBuilder.originShield(originShield.let(OriginShieldProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39f284527bb4abacf89ca1a17e2c98adcb7d71c7f4863bde84c03ebc84d1de75")
      override fun originShield(originShield: OriginShieldProperty.Builder.() -> Unit): Unit =
          originShield(OriginShieldProperty(originShield))

      override fun s3OriginConfig(s3OriginConfig: IResolvable) {
        cdkBuilder.s3OriginConfig(s3OriginConfig.let(IResolvable::unwrap))
      }

      override fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty) {
        cdkBuilder.s3OriginConfig(s3OriginConfig.let(S3OriginConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("345ceecbfefa4e6f7dfc83aa125d7e491472a25e0620b0a0ff0e1fa09fe5eea9")
      override fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty.Builder.() -> Unit): Unit =
          s3OriginConfig(S3OriginConfigProperty(s3OriginConfig))

      public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty,
    ) : OriginProperty {
      override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

      override fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

      override fun customOriginConfig(): Any? = unwrap(this).getCustomOriginConfig()

      override fun domainName(): String = unwrap(this).getDomainName()

      override fun id(): String = unwrap(this).getId()

      override fun originAccessControlId(): String? = unwrap(this).getOriginAccessControlId()

      override fun originCustomHeaders(): Any? = unwrap(this).getOriginCustomHeaders()

      override fun originPath(): String? = unwrap(this).getOriginPath()

      override fun originShield(): Any? = unwrap(this).getOriginShield()

      override fun s3OriginConfig(): Any? = unwrap(this).getS3OriginConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty):
          OriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OriginGroupMemberProperty {
    public fun originId(): String

    public interface Builder {
      public fun originId(originId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty.builder()

      override fun originId(originId: String) {
        cdkBuilder.originId(originId)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty,
    ) : OriginGroupMemberProperty {
      override fun originId(): String = unwrap(this).getOriginId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupMemberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty):
          OriginGroupMemberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupMemberProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OriginCustomHeaderProperty {
    public fun headerName(): String

    public fun headerValue(): String

    public interface Builder {
      public fun headerName(headerName: String)

      public fun headerValue(headerValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.builder()

      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      override fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty,
    ) : OriginCustomHeaderProperty {
      override fun headerName(): String = unwrap(this).getHeaderName()

      override fun headerValue(): String = unwrap(this).getHeaderValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginCustomHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty):
          OriginCustomHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginCustomHeaderProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RestrictionsProperty {
    public fun geoRestriction(): Any

    public interface Builder {
      public fun geoRestriction(geoRestriction: IResolvable)

      public fun geoRestriction(geoRestriction: GeoRestrictionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f953f010c1b6055a54f92673e021554d06508699325e69a30cbf137403e63ba8")
      public fun geoRestriction(geoRestriction: GeoRestrictionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.builder()

      override fun geoRestriction(geoRestriction: IResolvable) {
        cdkBuilder.geoRestriction(geoRestriction.let(IResolvable::unwrap))
      }

      override fun geoRestriction(geoRestriction: GeoRestrictionProperty) {
        cdkBuilder.geoRestriction(geoRestriction.let(GeoRestrictionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f953f010c1b6055a54f92673e021554d06508699325e69a30cbf137403e63ba8")
      override fun geoRestriction(geoRestriction: GeoRestrictionProperty.Builder.() -> Unit): Unit =
          geoRestriction(GeoRestrictionProperty(geoRestriction))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty,
    ) : RestrictionsProperty {
      override fun geoRestriction(): Any = unwrap(this).getGeoRestriction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RestrictionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty):
          RestrictionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestrictionsProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LegacyCustomOriginProperty {
    public fun dnsName(): String

    public fun httpPort(): Number? = unwrap(this).getHttpPort()

    public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    public fun originProtocolPolicy(): String

    public fun originSslProtocols(): List<String>

    public interface Builder {
      public fun dnsName(dnsName: String)

      public fun httpPort(httpPort: Number)

      public fun httpsPort(httpsPort: Number)

      public fun originProtocolPolicy(originProtocolPolicy: String)

      public fun originSslProtocols(originSslProtocols: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty.builder()

      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      override fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
      }

      override fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
      }

      override fun originProtocolPolicy(originProtocolPolicy: String) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
      }

      override fun originSslProtocols(originSslProtocols: List<String>) {
        cdkBuilder.originSslProtocols(originSslProtocols)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty,
    ) : LegacyCustomOriginProperty {
      override fun dnsName(): String = unwrap(this).getDnsName()

      override fun httpPort(): Number? = unwrap(this).getHttpPort()

      override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

      override fun originProtocolPolicy(): String = unwrap(this).getOriginProtocolPolicy()

      override fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LegacyCustomOriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty):
          LegacyCustomOriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LegacyCustomOriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
