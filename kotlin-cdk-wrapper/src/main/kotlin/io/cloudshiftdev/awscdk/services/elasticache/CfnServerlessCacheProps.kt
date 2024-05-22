@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnServerlessCache`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnServerlessCacheProps cfnServerlessCacheProps = CfnServerlessCacheProps.builder()
 * .engine("engine")
 * .serverlessCacheName("serverlessCacheName")
 * // the properties below are optional
 * .cacheUsageLimits(CacheUsageLimitsProperty.builder()
 * .dataStorage(DataStorageProperty.builder()
 * .unit("unit")
 * // the properties below are optional
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .ecpuPerSecond(ECPUPerSecondProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .dailySnapshotTime("dailySnapshotTime")
 * .description("description")
 * .endpoint(EndpointProperty.builder()
 * .address("address")
 * .port("port")
 * .build())
 * .finalSnapshotName("finalSnapshotName")
 * .kmsKeyId("kmsKeyId")
 * .majorEngineVersion("majorEngineVersion")
 * .readerEndpoint(EndpointProperty.builder()
 * .address("address")
 * .port("port")
 * .build())
 * .securityGroupIds(List.of("securityGroupIds"))
 * .snapshotArnsToRestore(List.of("snapshotArnsToRestore"))
 * .snapshotRetentionLimit(123)
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userGroupId("userGroupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html)
 */
public interface CfnServerlessCacheProps {
  /**
   * The cache usage limit for the serverless cache.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
   */
  public fun cacheUsageLimits(): Any? = unwrap(this).getCacheUsageLimits()

  /**
   * The daily time that a cache snapshot will be created.
   *
   * Default is NULL, i.e. snapshots will not be created at a specific time on a daily basis.
   * Available for Redis only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-dailysnapshottime)
   */
  public fun dailySnapshotTime(): String? = unwrap(this).getDailySnapshotTime()

  /**
   * A description of the serverless cache.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Represents the information required for client programs to connect to a cache node.
   *
   * This value is read-only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
   */
  public fun endpoint(): Any? = unwrap(this).getEndpoint()

  /**
   * The engine the serverless cache is compatible with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-engine)
   */
  public fun engine(): String

  /**
   * The name of the final snapshot taken of a cache before the cache is deleted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-finalsnapshotname)
   */
  public fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  /**
   * The ID of the AWS Key Management Service (KMS) key that is used to encrypt data at rest in the
   * serverless cache.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The version number of the engine the serverless cache is compatible with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-majorengineversion)
   */
  public fun majorEngineVersion(): String? = unwrap(this).getMajorEngineVersion()

  /**
   * Represents the information required for client programs to connect to a cache node.
   *
   * This value is read-only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
   */
  public fun readerEndpoint(): Any? = unwrap(this).getReaderEndpoint()

  /**
   * The IDs of the EC2 security groups associated with the serverless cache.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The unique identifier of the serverless cache.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-serverlesscachename)
   */
  public fun serverlessCacheName(): String

  /**
   * The ARN of the snapshot from which to restore data into the new cache.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
   */
  public fun snapshotArnsToRestore(): List<String> = unwrap(this).getSnapshotArnsToRestore() ?:
      emptyList()

  /**
   * The current setting for the number of serverless cache snapshots the system will retain.
   *
   * Available for Redis only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotretentionlimit)
   */
  public fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  /**
   * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default
   * subnets across AZs in your VPC.
   *
   * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
   * subnets across AZs in your default VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * A list of tags to be added to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The identifier of the user group associated with the serverless cache.
   *
   * Available for Redis only. Default is NULL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-usergroupid)
   */
  public fun userGroupId(): String? = unwrap(this).getUserGroupId()

  /**
   * A builder for [CfnServerlessCacheProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    public fun cacheUsageLimits(cacheUsageLimits: IResolvable)

    /**
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    public fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty)

    /**
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb73d981fe224a25657b9193990154dfb459e97ece07d7a27c9aeabe1a3e6196")
    public
        fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty.Builder.() -> Unit)

    /**
     * @param dailySnapshotTime The daily time that a cache snapshot will be created.
     * Default is NULL, i.e. snapshots will not be created at a specific time on a daily basis.
     * Available for Redis only.
     */
    public fun dailySnapshotTime(dailySnapshotTime: String)

    /**
     * @param description A description of the serverless cache.
     */
    public fun description(description: String)

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node.
     * This value is read-only.
     */
    public fun endpoint(endpoint: IResolvable)

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node.
     * This value is read-only.
     */
    public fun endpoint(endpoint: CfnServerlessCache.EndpointProperty)

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node.
     * This value is read-only.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75263f74966356a983a99aeb038b472819873a79741f87035061ab693cb0740a")
    public fun endpoint(endpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit)

    /**
     * @param engine The engine the serverless cache is compatible with. 
     */
    public fun engine(engine: String)

    /**
     * @param finalSnapshotName The name of the final snapshot taken of a cache before the cache is
     * deleted.
     */
    public fun finalSnapshotName(finalSnapshotName: String)

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service (KMS) key that is used to encrypt
     * data at rest in the serverless cache.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param majorEngineVersion The version number of the engine the serverless cache is compatible
     * with.
     */
    public fun majorEngineVersion(majorEngineVersion: String)

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node.
     * This value is read-only.
     */
    public fun readerEndpoint(readerEndpoint: IResolvable)

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node.
     * This value is read-only.
     */
    public fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty)

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node.
     * This value is read-only.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e09780aed85786a6e60a0637095b144bf42a6194bd590fe8d14c69f092db16a3")
    public
        fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit)

    /**
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param serverlessCacheName The unique identifier of the serverless cache. 
     */
    public fun serverlessCacheName(serverlessCacheName: String)

    /**
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache.
     */
    public fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>)

    /**
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache.
     */
    public fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String)

    /**
     * @param snapshotRetentionLimit The current setting for the number of serverless cache
     * snapshots the system will retain.
     * Available for Redis only.
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    /**
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC.
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC.
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags A list of tags to be added to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to be added to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userGroupId The identifier of the user group associated with the serverless cache.
     * Available for Redis only. Default is NULL.
     */
    public fun userGroupId(userGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps.builder()

    /**
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    override fun cacheUsageLimits(cacheUsageLimits: IResolvable) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    override fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(CfnServerlessCache.CacheUsageLimitsProperty.Companion::unwrap))
    }

    /**
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb73d981fe224a25657b9193990154dfb459e97ece07d7a27c9aeabe1a3e6196")
    override
        fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty.Builder.() -> Unit):
        Unit = cacheUsageLimits(CfnServerlessCache.CacheUsageLimitsProperty(cacheUsageLimits))

    /**
     * @param dailySnapshotTime The daily time that a cache snapshot will be created.
     * Default is NULL, i.e. snapshots will not be created at a specific time on a daily basis.
     * Available for Redis only.
     */
    override fun dailySnapshotTime(dailySnapshotTime: String) {
      cdkBuilder.dailySnapshotTime(dailySnapshotTime)
    }

    /**
     * @param description A description of the serverless cache.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node.
     * This value is read-only.
     */
    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node.
     * This value is read-only.
     */
    override fun endpoint(endpoint: CfnServerlessCache.EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(CfnServerlessCache.EndpointProperty.Companion::unwrap))
    }

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node.
     * This value is read-only.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75263f74966356a983a99aeb038b472819873a79741f87035061ab693cb0740a")
    override fun endpoint(endpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(CfnServerlessCache.EndpointProperty(endpoint))

    /**
     * @param engine The engine the serverless cache is compatible with. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param finalSnapshotName The name of the final snapshot taken of a cache before the cache is
     * deleted.
     */
    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service (KMS) key that is used to encrypt
     * data at rest in the serverless cache.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param majorEngineVersion The version number of the engine the serverless cache is compatible
     * with.
     */
    override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node.
     * This value is read-only.
     */
    override fun readerEndpoint(readerEndpoint: IResolvable) {
      cdkBuilder.readerEndpoint(readerEndpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node.
     * This value is read-only.
     */
    override fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty) {
      cdkBuilder.readerEndpoint(readerEndpoint.let(CfnServerlessCache.EndpointProperty.Companion::unwrap))
    }

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node.
     * This value is read-only.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e09780aed85786a6e60a0637095b144bf42a6194bd590fe8d14c69f092db16a3")
    override
        fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty.Builder.() -> Unit):
        Unit = readerEndpoint(CfnServerlessCache.EndpointProperty(readerEndpoint))

    /**
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param serverlessCacheName The unique identifier of the serverless cache. 
     */
    override fun serverlessCacheName(serverlessCacheName: String) {
      cdkBuilder.serverlessCacheName(serverlessCacheName)
    }

    /**
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache.
     */
    override fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>) {
      cdkBuilder.snapshotArnsToRestore(snapshotArnsToRestore)
    }

    /**
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache.
     */
    override fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String): Unit =
        snapshotArnsToRestore(snapshotArnsToRestore.toList())

    /**
     * @param snapshotRetentionLimit The current setting for the number of serverless cache
     * snapshots the system will retain.
     * Available for Redis only.
     */
    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC.
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC.
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags A list of tags to be added to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to be added to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userGroupId The identifier of the user group associated with the serverless cache.
     * Available for Redis only. Default is NULL.
     */
    override fun userGroupId(userGroupId: String) {
      cdkBuilder.userGroupId(userGroupId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps,
  ) : CdkObject(cdkObject), CfnServerlessCacheProps {
    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     */
    override fun cacheUsageLimits(): Any? = unwrap(this).getCacheUsageLimits()

    /**
     * The daily time that a cache snapshot will be created.
     *
     * Default is NULL, i.e. snapshots will not be created at a specific time on a daily basis.
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-dailysnapshottime)
     */
    override fun dailySnapshotTime(): String? = unwrap(this).getDailySnapshotTime()

    /**
     * A description of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     */
    override fun endpoint(): Any? = unwrap(this).getEndpoint()

    /**
     * The engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-engine)
     */
    override fun engine(): String = unwrap(this).getEngine()

    /**
     * The name of the final snapshot taken of a cache before the cache is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-finalsnapshotname)
     */
    override fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

    /**
     * The ID of the AWS Key Management Service (KMS) key that is used to encrypt data at rest in
     * the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The version number of the engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-majorengineversion)
     */
    override fun majorEngineVersion(): String? = unwrap(this).getMajorEngineVersion()

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     */
    override fun readerEndpoint(): Any? = unwrap(this).getReaderEndpoint()

    /**
     * The IDs of the EC2 security groups associated with the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The unique identifier of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-serverlesscachename)
     */
    override fun serverlessCacheName(): String = unwrap(this).getServerlessCacheName()

    /**
     * The ARN of the snapshot from which to restore data into the new cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
     */
    override fun snapshotArnsToRestore(): List<String> = unwrap(this).getSnapshotArnsToRestore() ?:
        emptyList()

    /**
     * The current setting for the number of serverless cache snapshots the system will retain.
     *
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotretentionlimit)
     */
    override fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

    /**
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2
     * default subnets across AZs in your VPC.
     *
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The identifier of the user group associated with the serverless cache.
     *
     * Available for Redis only. Default is NULL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-usergroupid)
     */
    override fun userGroupId(): String? = unwrap(this).getUserGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerlessCacheProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps):
        CfnServerlessCacheProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServerlessCacheProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerlessCacheProps):
        software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps
  }
}
