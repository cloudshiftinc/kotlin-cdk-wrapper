package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServerlessCache internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  public open fun attrEndpointPort(): String = unwrap(this).getAttrEndpointPort()

  public open fun attrFullEngineVersion(): String = unwrap(this).getAttrFullEngineVersion()

  public open fun attrReaderEndpointAddress(): String = unwrap(this).getAttrReaderEndpointAddress()

  public open fun attrReaderEndpointPort(): String = unwrap(this).getAttrReaderEndpointPort()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun cacheUsageLimits(): Any? = unwrap(this).getCacheUsageLimits()

  public open fun cacheUsageLimits(`value`: IResolvable) {
    unwrap(this).setCacheUsageLimits(`value`.let(IResolvable::unwrap))
  }

  public open fun cacheUsageLimits(`value`: CacheUsageLimitsProperty) {
    unwrap(this).setCacheUsageLimits(`value`.let(CacheUsageLimitsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ddd4cb123232e0c91434e209fe0591793344c902321a36544336991c20df8257")
  public open fun cacheUsageLimits(`value`: CacheUsageLimitsProperty.Builder.() -> Unit): Unit =
      cacheUsageLimits(CacheUsageLimitsProperty(`value`))

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dailySnapshotTime(): String? = unwrap(this).getDailySnapshotTime()

  public open fun dailySnapshotTime(`value`: String) {
    unwrap(this).setDailySnapshotTime(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun endpoint(): Any? = unwrap(this).getEndpoint()

  public open fun endpoint(`value`: IResolvable) {
    unwrap(this).setEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun endpoint(`value`: EndpointProperty) {
    unwrap(this).setEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dce47952ea41d1b1d511921a42d99c90d51d1a2e9917edbe5e2e81ed068b5b95")
  public open fun endpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      endpoint(EndpointProperty(`value`))

  public open fun engine(): String = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  public open fun finalSnapshotName(`value`: String) {
    unwrap(this).setFinalSnapshotName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun majorEngineVersion(): String? = unwrap(this).getMajorEngineVersion()

  public open fun majorEngineVersion(`value`: String) {
    unwrap(this).setMajorEngineVersion(`value`)
  }

  public open fun readerEndpoint(): Any? = unwrap(this).getReaderEndpoint()

  public open fun readerEndpoint(`value`: IResolvable) {
    unwrap(this).setReaderEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun readerEndpoint(`value`: EndpointProperty) {
    unwrap(this).setReaderEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("084fa0fab32d2a66d94907e9a066b6ecb411a4dcbd36ece5f235bb1de46c216d")
  public open fun readerEndpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      readerEndpoint(EndpointProperty(`value`))

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun serverlessCacheName(): String = unwrap(this).getServerlessCacheName()

  public open fun serverlessCacheName(`value`: String) {
    unwrap(this).setServerlessCacheName(`value`)
  }

  public open fun snapshotArnsToRestore(): List<String> = unwrap(this).getSnapshotArnsToRestore() ?:
      emptyList()

  public open fun snapshotArnsToRestore(`value`: List<String>) {
    unwrap(this).setSnapshotArnsToRestore(`value`)
  }

  public open fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  public open fun snapshotRetentionLimit(`value`: Number) {
    unwrap(this).setSnapshotRetentionLimit(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun userGroupId(): String? = unwrap(this).getUserGroupId()

  public open fun userGroupId(`value`: String) {
    unwrap(this).setUserGroupId(`value`)
  }

  public interface Builder {
    public fun cacheUsageLimits(cacheUsageLimits: IResolvable)

    public fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775c3a878237c535ebce61e5a18e85026371df6dacc4535b533a50e54c677b1f")
    public fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty.Builder.() -> Unit)

    public fun dailySnapshotTime(dailySnapshotTime: String)

    public fun description(description: String)

    public fun endpoint(endpoint: IResolvable)

    public fun endpoint(endpoint: EndpointProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e1aae0d852b865593d76f55442b01b155c7a978d4fb92ce9f36fd3cc7e2e")
    public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit)

    public fun engine(engine: String)

    public fun finalSnapshotName(finalSnapshotName: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun majorEngineVersion(majorEngineVersion: String)

    public fun readerEndpoint(readerEndpoint: IResolvable)

    public fun readerEndpoint(readerEndpoint: EndpointProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfcb09b74c5e854ce3f83494238282a55e3fba47b0f3083c274ab4f6a55eab55")
    public fun readerEndpoint(readerEndpoint: EndpointProperty.Builder.() -> Unit)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun serverlessCacheName(serverlessCacheName: String)

    public fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>)

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    public fun subnetIds(subnetIds: List<String>)

    public fun tags(tags: List<CfnTag>)

    public fun userGroupId(userGroupId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnServerlessCache.Builder =
        software.amazon.awscdk.services.elasticache.CfnServerlessCache.Builder.create(scope, id)

    override fun cacheUsageLimits(cacheUsageLimits: IResolvable) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(IResolvable::unwrap))
    }

    override fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(CacheUsageLimitsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775c3a878237c535ebce61e5a18e85026371df6dacc4535b533a50e54c677b1f")
    override fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty.Builder.() -> Unit):
        Unit = cacheUsageLimits(CacheUsageLimitsProperty(cacheUsageLimits))

    override fun dailySnapshotTime(dailySnapshotTime: String) {
      cdkBuilder.dailySnapshotTime(dailySnapshotTime)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    override fun endpoint(endpoint: EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e1aae0d852b865593d76f55442b01b155c7a978d4fb92ce9f36fd3cc7e2e")
    override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(EndpointProperty(endpoint))

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    override fun readerEndpoint(readerEndpoint: IResolvable) {
      cdkBuilder.readerEndpoint(readerEndpoint.let(IResolvable::unwrap))
    }

    override fun readerEndpoint(readerEndpoint: EndpointProperty) {
      cdkBuilder.readerEndpoint(readerEndpoint.let(EndpointProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfcb09b74c5e854ce3f83494238282a55e3fba47b0f3083c274ab4f6a55eab55")
    override fun readerEndpoint(readerEndpoint: EndpointProperty.Builder.() -> Unit): Unit =
        readerEndpoint(EndpointProperty(readerEndpoint))

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun serverlessCacheName(serverlessCacheName: String) {
      cdkBuilder.serverlessCacheName(serverlessCacheName)
    }

    override fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>) {
      cdkBuilder.snapshotArnsToRestore(snapshotArnsToRestore)
    }

    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun userGroupId(userGroupId: String) {
      cdkBuilder.userGroupId(userGroupId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnServerlessCache =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServerlessCache {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServerlessCache(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache):
        CfnServerlessCache = CfnServerlessCache(cdkObject)

    internal fun unwrap(wrapped: CfnServerlessCache):
        software.amazon.awscdk.services.elasticache.CfnServerlessCache = wrapped.cdkObject
  }

  public interface CacheUsageLimitsProperty {
    public fun dataStorage(): Any? = unwrap(this).getDataStorage()

    public fun ecpuPerSecond(): Any? = unwrap(this).getEcpuPerSecond()

    public interface Builder {
      public fun dataStorage(dataStorage: IResolvable)

      public fun dataStorage(dataStorage: DataStorageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("327f9e8473d6550806eafa0fdfb3de96de78ca29bc969cd31e7761e0f9cab0b2")
      public fun dataStorage(dataStorage: DataStorageProperty.Builder.() -> Unit)

      public fun ecpuPerSecond(ecpuPerSecond: IResolvable)

      public fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d61e195d9aa7328e1967852fc8f4f6db0345faaf467cc8f527c6bd215607685d")
      public fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty.builder()

      override fun dataStorage(dataStorage: IResolvable) {
        cdkBuilder.dataStorage(dataStorage.let(IResolvable::unwrap))
      }

      override fun dataStorage(dataStorage: DataStorageProperty) {
        cdkBuilder.dataStorage(dataStorage.let(DataStorageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("327f9e8473d6550806eafa0fdfb3de96de78ca29bc969cd31e7761e0f9cab0b2")
      override fun dataStorage(dataStorage: DataStorageProperty.Builder.() -> Unit): Unit =
          dataStorage(DataStorageProperty(dataStorage))

      override fun ecpuPerSecond(ecpuPerSecond: IResolvable) {
        cdkBuilder.ecpuPerSecond(ecpuPerSecond.let(IResolvable::unwrap))
      }

      override fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty) {
        cdkBuilder.ecpuPerSecond(ecpuPerSecond.let(ECPUPerSecondProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d61e195d9aa7328e1967852fc8f4f6db0345faaf467cc8f527c6bd215607685d")
      override fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty.Builder.() -> Unit): Unit =
          ecpuPerSecond(ECPUPerSecondProperty(ecpuPerSecond))

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty,
    ) : CacheUsageLimitsProperty {
      override fun dataStorage(): Any? = unwrap(this).getDataStorage()

      override fun ecpuPerSecond(): Any? = unwrap(this).getEcpuPerSecond()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CacheUsageLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty):
          CacheUsageLimitsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheUsageLimitsProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ECPUPerSecondProperty {
    public fun maximum(): Number

    public interface Builder {
      public fun maximum(maximum: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty.builder()

      override fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty,
    ) : ECPUPerSecondProperty {
      override fun maximum(): Number = unwrap(this).getMaximum()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ECPUPerSecondProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty):
          ECPUPerSecondProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ECPUPerSecondProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun port(): String? = unwrap(this).getPort()

    public interface Builder {
      public fun address(address: String)

      public fun port(port: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty.Builder =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty.builder()

      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty,
    ) : EndpointProperty {
      override fun address(): String? = unwrap(this).getAddress()

      override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DataStorageProperty {
    public fun maximum(): Number

    public fun unit(): String

    public interface Builder {
      public fun maximum(maximum: Number)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty.builder()

      override fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty,
    ) : DataStorageProperty {
      override fun maximum(): Number = unwrap(this).getMaximum()

      override fun unit(): String = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty):
          DataStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataStorageProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
