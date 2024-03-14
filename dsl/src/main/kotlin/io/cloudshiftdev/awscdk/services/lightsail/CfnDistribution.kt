package io.cloudshiftdev.awscdk.services.lightsail

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
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAbleToUpdateBundle(): IResolvable =
      unwrap(this).getAttrAbleToUpdateBundle().let(IResolvable::wrap)

  public open fun attrDistributionArn(): String = unwrap(this).getAttrDistributionArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun bundleId(): String = unwrap(this).getBundleId()

  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  public open fun cacheBehaviorSettings(): Any? = unwrap(this).getCacheBehaviorSettings()

  public open fun cacheBehaviorSettings(`value`: IResolvable) {
    unwrap(this).setCacheBehaviorSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun cacheBehaviorSettings(`value`: CacheSettingsProperty) {
    unwrap(this).setCacheBehaviorSettings(`value`.let(CacheSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79f57704ab0ebc94e6e2c88f87d3814983faca9f798980109dc7f6122c158f6d")
  public open fun cacheBehaviorSettings(`value`: CacheSettingsProperty.Builder.() -> Unit): Unit =
      cacheBehaviorSettings(CacheSettingsProperty(`value`))

  public open fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

  public open fun cacheBehaviors(`value`: IResolvable) {
    unwrap(this).setCacheBehaviors(`value`.let(IResolvable::unwrap))
  }

  public open fun cacheBehaviors(__idx_ac66f0: List<Any>) {
    unwrap(this).setCacheBehaviors(__idx_ac66f0)
  }

  public open fun cacheBehaviors(vararg __idx_ac66f0: Any): Unit =
      cacheBehaviors(__idx_ac66f0.toList())

  public open fun certificateName(): String? = unwrap(this).getCertificateName()

  public open fun certificateName(`value`: String) {
    unwrap(this).setCertificateName(`value`)
  }

  public open fun defaultCacheBehavior(): Any = unwrap(this).getDefaultCacheBehavior()

  public open fun defaultCacheBehavior(`value`: IResolvable) {
    unwrap(this).setDefaultCacheBehavior(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultCacheBehavior(`value`: CacheBehaviorProperty) {
    unwrap(this).setDefaultCacheBehavior(`value`.let(CacheBehaviorProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1c242d3b3eaba59599830c82a1222710e29154ea4d516159285318e8f201b65")
  public open fun defaultCacheBehavior(`value`: CacheBehaviorProperty.Builder.() -> Unit): Unit =
      defaultCacheBehavior(CacheBehaviorProperty(`value`))

  public open fun distributionName(): String = unwrap(this).getDistributionName()

  public open fun distributionName(`value`: String) {
    unwrap(this).setDistributionName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  public open fun isEnabled(): Any? = unwrap(this).getIsEnabled()

  public open fun isEnabled(`value`: Boolean) {
    unwrap(this).setIsEnabled(`value`)
  }

  public open fun isEnabled(`value`: IResolvable) {
    unwrap(this).setIsEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun origin(): Any = unwrap(this).getOrigin()

  public open fun origin(`value`: IResolvable) {
    unwrap(this).setOrigin(`value`.let(IResolvable::unwrap))
  }

  public open fun origin(`value`: InputOriginProperty) {
    unwrap(this).setOrigin(`value`.let(InputOriginProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("064abce212e311aac6686c805cd4f4f4ae0ec3dd5280c17c4f35fede72c8f503")
  public open fun origin(`value`: InputOriginProperty.Builder.() -> Unit): Unit =
      origin(InputOriginProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun bundleId(bundleId: String)

    public fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable)

    public fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7be9dd6a199c12d315ac62758530f6e3c1deceb2b119cf1bda341cc3fe6eeb1")
    public
        fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty.Builder.() -> Unit)

    public fun cacheBehaviors(cacheBehaviors: IResolvable)

    public fun cacheBehaviors(cacheBehaviors: List<Any>)

    public fun cacheBehaviors(vararg cacheBehaviors: Any)

    public fun certificateName(certificateName: String)

    public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable)

    public fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4157d6c3d1a227fcd50f9ada92f79843f63a504eb29c54a28b5157aeb2ae401")
    public fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty.Builder.() -> Unit)

    public fun distributionName(distributionName: String)

    public fun ipAddressType(ipAddressType: String)

    public fun isEnabled(isEnabled: Boolean)

    public fun isEnabled(isEnabled: IResolvable)

    public fun origin(origin: IResolvable)

    public fun origin(origin: InputOriginProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95170e276150a0f651d6df3157aed185b387fec3a0a2b81b8b6b0002a7f65c5")
    public fun origin(origin: InputOriginProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDistribution.Builder =
        software.amazon.awscdk.services.lightsail.CfnDistribution.Builder.create(scope, id)

    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    override fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(IResolvable::unwrap))
    }

    override fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(CacheSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7be9dd6a199c12d315ac62758530f6e3c1deceb2b119cf1bda341cc3fe6eeb1")
    override
        fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty.Builder.() -> Unit):
        Unit = cacheBehaviorSettings(CacheSettingsProperty(cacheBehaviorSettings))

    override fun cacheBehaviors(cacheBehaviors: IResolvable) {
      cdkBuilder.cacheBehaviors(cacheBehaviors.let(IResolvable::unwrap))
    }

    override fun cacheBehaviors(cacheBehaviors: List<Any>) {
      cdkBuilder.cacheBehaviors(cacheBehaviors)
    }

    override fun cacheBehaviors(vararg cacheBehaviors: Any): Unit =
        cacheBehaviors(cacheBehaviors.toList())

    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    override fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(IResolvable::unwrap))
    }

    override fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(CacheBehaviorProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4157d6c3d1a227fcd50f9ada92f79843f63a504eb29c54a28b5157aeb2ae401")
    override
        fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty.Builder.() -> Unit):
        Unit = defaultCacheBehavior(CacheBehaviorProperty(defaultCacheBehavior))

    override fun distributionName(distributionName: String) {
      cdkBuilder.distributionName(distributionName)
    }

    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    override fun isEnabled(isEnabled: Boolean) {
      cdkBuilder.isEnabled(isEnabled)
    }

    override fun isEnabled(isEnabled: IResolvable) {
      cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
    }

    override fun origin(origin: IResolvable) {
      cdkBuilder.origin(origin.let(IResolvable::unwrap))
    }

    override fun origin(origin: InputOriginProperty) {
      cdkBuilder.origin(origin.let(InputOriginProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95170e276150a0f651d6df3157aed185b387fec3a0a2b81b8b6b0002a7f65c5")
    override fun origin(origin: InputOriginProperty.Builder.() -> Unit): Unit =
        origin(InputOriginProperty(origin))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDistribution =
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution):
        CfnDistribution = CfnDistribution(cdkObject)

    internal fun unwrap(wrapped: CfnDistribution):
        software.amazon.awscdk.services.lightsail.CfnDistribution = wrapped.cdkObject
  }

  public interface CacheBehaviorProperty {
    public fun behavior(): String? = unwrap(this).getBehavior()

    public interface Builder {
      public fun behavior(behavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty.builder()

      override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty,
    ) : CacheBehaviorProperty {
      override fun behavior(): String? = unwrap(this).getBehavior()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CacheBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty):
          CacheBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheBehaviorProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CookieObjectProperty {
    public fun cookiesAllowList(): List<String> = unwrap(this).getCookiesAllowList() ?: emptyList()

    public fun option(): String? = unwrap(this).getOption()

    public interface Builder {
      public fun cookiesAllowList(cookiesAllowList: List<String>)

      public fun cookiesAllowList(vararg cookiesAllowList: String)

      public fun option(option: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty.builder()

      override fun cookiesAllowList(cookiesAllowList: List<String>) {
        cdkBuilder.cookiesAllowList(cookiesAllowList)
      }

      override fun cookiesAllowList(vararg cookiesAllowList: String): Unit =
          cookiesAllowList(cookiesAllowList.toList())

      override fun option(option: String) {
        cdkBuilder.option(option)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty,
    ) : CookieObjectProperty {
      override fun cookiesAllowList(): List<String> = unwrap(this).getCookiesAllowList() ?:
          emptyList()

      override fun option(): String? = unwrap(this).getOption()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookieObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty):
          CookieObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieObjectProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface HeaderObjectProperty {
    public fun headersAllowList(): List<String> = unwrap(this).getHeadersAllowList() ?: emptyList()

    public fun option(): String? = unwrap(this).getOption()

    public interface Builder {
      public fun headersAllowList(headersAllowList: List<String>)

      public fun headersAllowList(vararg headersAllowList: String)

      public fun option(option: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty.builder()

      override fun headersAllowList(headersAllowList: List<String>) {
        cdkBuilder.headersAllowList(headersAllowList)
      }

      override fun headersAllowList(vararg headersAllowList: String): Unit =
          headersAllowList(headersAllowList.toList())

      override fun option(option: String) {
        cdkBuilder.option(option)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty,
    ) : HeaderObjectProperty {
      override fun headersAllowList(): List<String> = unwrap(this).getHeadersAllowList() ?:
          emptyList()

      override fun option(): String? = unwrap(this).getOption()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty):
          HeaderObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderObjectProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CacheSettingsProperty {
    public fun allowedHttpMethods(): String? = unwrap(this).getAllowedHttpMethods()

    public fun cachedHttpMethods(): String? = unwrap(this).getCachedHttpMethods()

    public fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

    public fun forwardedCookies(): Any? = unwrap(this).getForwardedCookies()

    public fun forwardedHeaders(): Any? = unwrap(this).getForwardedHeaders()

    public fun forwardedQueryStrings(): Any? = unwrap(this).getForwardedQueryStrings()

    public fun maximumTtl(): Number? = unwrap(this).getMaximumTtl()

    public fun minimumTtl(): Number? = unwrap(this).getMinimumTtl()

    public interface Builder {
      public fun allowedHttpMethods(allowedHttpMethods: String)

      public fun cachedHttpMethods(cachedHttpMethods: String)

      public fun defaultTtl(defaultTtl: Number)

      public fun forwardedCookies(forwardedCookies: IResolvable)

      public fun forwardedCookies(forwardedCookies: CookieObjectProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c922e547404c44d6e645910173c087833c3a63b46c3df390f032d632e93db26")
      public fun forwardedCookies(forwardedCookies: CookieObjectProperty.Builder.() -> Unit)

      public fun forwardedHeaders(forwardedHeaders: IResolvable)

      public fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c5e4bf40216dbcd990d823b98baa309d58f4960b0737400d37c0f8bf7963d8")
      public fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty.Builder.() -> Unit)

      public fun forwardedQueryStrings(forwardedQueryStrings: IResolvable)

      public fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cfe764aaa9a7c09e6074777153751f674301feab5a38748d2705ee804d4b307")
      public
          fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty.Builder.() -> Unit)

      public fun maximumTtl(maximumTtl: Number)

      public fun minimumTtl(minimumTtl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty.builder()

      override fun allowedHttpMethods(allowedHttpMethods: String) {
        cdkBuilder.allowedHttpMethods(allowedHttpMethods)
      }

      override fun cachedHttpMethods(cachedHttpMethods: String) {
        cdkBuilder.cachedHttpMethods(cachedHttpMethods)
      }

      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      override fun forwardedCookies(forwardedCookies: IResolvable) {
        cdkBuilder.forwardedCookies(forwardedCookies.let(IResolvable::unwrap))
      }

      override fun forwardedCookies(forwardedCookies: CookieObjectProperty) {
        cdkBuilder.forwardedCookies(forwardedCookies.let(CookieObjectProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c922e547404c44d6e645910173c087833c3a63b46c3df390f032d632e93db26")
      override fun forwardedCookies(forwardedCookies: CookieObjectProperty.Builder.() -> Unit): Unit
          = forwardedCookies(CookieObjectProperty(forwardedCookies))

      override fun forwardedHeaders(forwardedHeaders: IResolvable) {
        cdkBuilder.forwardedHeaders(forwardedHeaders.let(IResolvable::unwrap))
      }

      override fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty) {
        cdkBuilder.forwardedHeaders(forwardedHeaders.let(HeaderObjectProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c5e4bf40216dbcd990d823b98baa309d58f4960b0737400d37c0f8bf7963d8")
      override fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty.Builder.() -> Unit): Unit
          = forwardedHeaders(HeaderObjectProperty(forwardedHeaders))

      override fun forwardedQueryStrings(forwardedQueryStrings: IResolvable) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings.let(IResolvable::unwrap))
      }

      override fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings.let(QueryStringObjectProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cfe764aaa9a7c09e6074777153751f674301feab5a38748d2705ee804d4b307")
      override
          fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty.Builder.() -> Unit):
          Unit = forwardedQueryStrings(QueryStringObjectProperty(forwardedQueryStrings))

      override fun maximumTtl(maximumTtl: Number) {
        cdkBuilder.maximumTtl(maximumTtl)
      }

      override fun minimumTtl(minimumTtl: Number) {
        cdkBuilder.minimumTtl(minimumTtl)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty,
    ) : CacheSettingsProperty {
      override fun allowedHttpMethods(): String? = unwrap(this).getAllowedHttpMethods()

      override fun cachedHttpMethods(): String? = unwrap(this).getCachedHttpMethods()

      override fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

      override fun forwardedCookies(): Any? = unwrap(this).getForwardedCookies()

      override fun forwardedHeaders(): Any? = unwrap(this).getForwardedHeaders()

      override fun forwardedQueryStrings(): Any? = unwrap(this).getForwardedQueryStrings()

      override fun maximumTtl(): Number? = unwrap(this).getMaximumTtl()

      override fun minimumTtl(): Number? = unwrap(this).getMinimumTtl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CacheSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty):
          CacheSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheSettingsProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InputOriginProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun protocolPolicy(): String? = unwrap(this).getProtocolPolicy()

    public fun regionName(): String? = unwrap(this).getRegionName()

    public interface Builder {
      public fun name(name: String)

      public fun protocolPolicy(protocolPolicy: String)

      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun protocolPolicy(protocolPolicy: String) {
        cdkBuilder.protocolPolicy(protocolPolicy)
      }

      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty,
    ) : InputOriginProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun protocolPolicy(): String? = unwrap(this).getProtocolPolicy()

      override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputOriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty):
          InputOriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputOriginProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface QueryStringObjectProperty {
    public fun option(): Any? = unwrap(this).getOption()

    public fun queryStringsAllowList(): List<String> = unwrap(this).getQueryStringsAllowList() ?:
        emptyList()

    public interface Builder {
      public fun option(option: Boolean)

      public fun option(option: IResolvable)

      public fun queryStringsAllowList(queryStringsAllowList: List<String>)

      public fun queryStringsAllowList(vararg queryStringsAllowList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty.builder()

      override fun option(option: Boolean) {
        cdkBuilder.option(option)
      }

      override fun option(option: IResolvable) {
        cdkBuilder.option(option.let(IResolvable::unwrap))
      }

      override fun queryStringsAllowList(queryStringsAllowList: List<String>) {
        cdkBuilder.queryStringsAllowList(queryStringsAllowList)
      }

      override fun queryStringsAllowList(vararg queryStringsAllowList: String): Unit =
          queryStringsAllowList(queryStringsAllowList.toList())

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty,
    ) : QueryStringObjectProperty {
      override fun option(): Any? = unwrap(this).getOption()

      override fun queryStringsAllowList(): List<String> = unwrap(this).getQueryStringsAllowList()
          ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty):
          QueryStringObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringObjectProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CacheBehaviorPerPathProperty {
    public fun behavior(): String? = unwrap(this).getBehavior()

    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun behavior(behavior: String)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty.builder()

      override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty,
    ) : CacheBehaviorPerPathProperty {
      override fun behavior(): String? = unwrap(this).getBehavior()

      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CacheBehaviorPerPathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty):
          CacheBehaviorPerPathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheBehaviorPerPathProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
