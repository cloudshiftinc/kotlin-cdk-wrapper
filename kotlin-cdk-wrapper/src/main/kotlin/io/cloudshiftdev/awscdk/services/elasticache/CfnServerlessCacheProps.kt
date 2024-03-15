@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServerlessCacheProps {
  public fun cacheUsageLimits(): Any? = unwrap(this).getCacheUsageLimits()

  public fun dailySnapshotTime(): String? = unwrap(this).getDailySnapshotTime()

  public fun description(): String? = unwrap(this).getDescription()

  public fun endpoint(): Any? = unwrap(this).getEndpoint()

  public fun engine(): String

  public fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun majorEngineVersion(): String? = unwrap(this).getMajorEngineVersion()

  public fun readerEndpoint(): Any? = unwrap(this).getReaderEndpoint()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun serverlessCacheName(): String

  public fun snapshotArnsToRestore(): List<String> = unwrap(this).getSnapshotArnsToRestore() ?:
      emptyList()

  public fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userGroupId(): String? = unwrap(this).getUserGroupId()

  @CdkDslMarker
  public interface Builder {
    public fun cacheUsageLimits(cacheUsageLimits: IResolvable)

    public fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb73d981fe224a25657b9193990154dfb459e97ece07d7a27c9aeabe1a3e6196")
    public
        fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty.Builder.() -> Unit)

    public fun dailySnapshotTime(dailySnapshotTime: String)

    public fun description(description: String)

    public fun endpoint(endpoint: IResolvable)

    public fun endpoint(endpoint: CfnServerlessCache.EndpointProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75263f74966356a983a99aeb038b472819873a79741f87035061ab693cb0740a")
    public fun endpoint(endpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit)

    public fun engine(engine: String)

    public fun finalSnapshotName(finalSnapshotName: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun majorEngineVersion(majorEngineVersion: String)

    public fun readerEndpoint(readerEndpoint: IResolvable)

    public fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e09780aed85786a6e60a0637095b144bf42a6194bd590fe8d14c69f092db16a3")
    public
        fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun serverlessCacheName(serverlessCacheName: String)

    public fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>)

    public fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String)

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userGroupId(userGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps.builder()

    override fun cacheUsageLimits(cacheUsageLimits: IResolvable) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(IResolvable::unwrap))
    }

    override fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(CfnServerlessCache.CacheUsageLimitsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb73d981fe224a25657b9193990154dfb459e97ece07d7a27c9aeabe1a3e6196")
    override
        fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty.Builder.() -> Unit):
        Unit = cacheUsageLimits(CfnServerlessCache.CacheUsageLimitsProperty(cacheUsageLimits))

    override fun dailySnapshotTime(dailySnapshotTime: String) {
      cdkBuilder.dailySnapshotTime(dailySnapshotTime)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    override fun endpoint(endpoint: CfnServerlessCache.EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(CfnServerlessCache.EndpointProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75263f74966356a983a99aeb038b472819873a79741f87035061ab693cb0740a")
    override fun endpoint(endpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(CfnServerlessCache.EndpointProperty(endpoint))

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

    override fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty) {
      cdkBuilder.readerEndpoint(readerEndpoint.let(CfnServerlessCache.EndpointProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e09780aed85786a6e60a0637095b144bf42a6194bd590fe8d14c69f092db16a3")
    override
        fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit):
        Unit = readerEndpoint(CfnServerlessCache.EndpointProperty(readerEndpoint))

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun serverlessCacheName(serverlessCacheName: String) {
      cdkBuilder.serverlessCacheName(serverlessCacheName)
    }

    override fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>) {
      cdkBuilder.snapshotArnsToRestore(snapshotArnsToRestore)
    }

    override fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String): Unit =
        snapshotArnsToRestore(snapshotArnsToRestore.toList())

    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userGroupId(userGroupId: String) {
      cdkBuilder.userGroupId(userGroupId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps,
  ) : CdkObject(cdkObject), CfnServerlessCacheProps {
    override fun cacheUsageLimits(): Any? = unwrap(this).getCacheUsageLimits()

    override fun dailySnapshotTime(): String? = unwrap(this).getDailySnapshotTime()

    override fun description(): String? = unwrap(this).getDescription()

    override fun endpoint(): Any? = unwrap(this).getEndpoint()

    override fun engine(): String = unwrap(this).getEngine()

    override fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun majorEngineVersion(): String? = unwrap(this).getMajorEngineVersion()

    override fun readerEndpoint(): Any? = unwrap(this).getReaderEndpoint()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun serverlessCacheName(): String = unwrap(this).getServerlessCacheName()

    override fun snapshotArnsToRestore(): List<String> = unwrap(this).getSnapshotArnsToRestore() ?:
        emptyList()

    override fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userGroupId(): String? = unwrap(this).getUserGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerlessCacheProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps):
        CfnServerlessCacheProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerlessCacheProps):
        software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps
  }
}
