@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticache

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnServerlessCache
import software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps

/**
 * Properties for defining a `CfnServerlessCache`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CfnServerlessCacheProps cfnServerlessCacheProps = CfnServerlessCacheProps.builder()
 * .engine("engine")
 * .serverlessCacheName("serverlessCacheName")
 * // the properties below are optional
 * .cacheUsageLimits(CacheUsageLimitsProperty.builder()
 * .dataStorage(DataStorageProperty.builder()
 * .maximum(123)
 * .unit("unit")
 * .build())
 * .ecpuPerSecond(ECPUPerSecondProperty.builder()
 * .maximum(123)
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
@CdkDslMarker
public class CfnServerlessCachePropsDsl {
    private val cdkBuilder: CfnServerlessCacheProps.Builder = CfnServerlessCacheProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _snapshotArnsToRestore: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param cacheUsageLimits The cache usage limit for the serverless cache. */
    public fun cacheUsageLimits(cacheUsageLimits: IResolvable) {
        cdkBuilder.cacheUsageLimits(cacheUsageLimits)
    }

    /** @param cacheUsageLimits The cache usage limit for the serverless cache. */
    public fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty) {
        cdkBuilder.cacheUsageLimits(cacheUsageLimits)
    }

    /**
     * @param dailySnapshotTime The daily time that a cache snapshot will be created. Default is
     *   NULL, i.e. snapshots will not be created at a specific time on a daily basis. Available for
     *   Redis only.
     */
    public fun dailySnapshotTime(dailySnapshotTime: String) {
        cdkBuilder.dailySnapshotTime(dailySnapshotTime)
    }

    /** @param description A description of the serverless cache. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     *   node. This value is read-only.
     */
    public fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param endpoint Represents the information required for client programs to connect to a cache
     *   node. This value is read-only.
     */
    public fun endpoint(endpoint: CfnServerlessCache.EndpointProperty) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param engine The engine the serverless cache is compatible with. */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /**
     * @param finalSnapshotName The name of the final snapshot taken of a cache before the cache is
     *   deleted.
     */
    public fun finalSnapshotName(finalSnapshotName: String) {
        cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service (KMS) key that is used to encrypt
     *   data at rest in the serverless cache.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param majorEngineVersion The version number of the engine the serverless cache is compatible
     *   with.
     */
    public fun majorEngineVersion(majorEngineVersion: String) {
        cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     *   cache node. This value is read-only.
     */
    public fun readerEndpoint(readerEndpoint: IResolvable) {
        cdkBuilder.readerEndpoint(readerEndpoint)
    }

    /**
     * @param readerEndpoint Represents the information required for client programs to connect to a
     *   cache node. This value is read-only.
     */
    public fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty) {
        cdkBuilder.readerEndpoint(readerEndpoint)
    }

    /**
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     *   cache.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     *   cache.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /** @param serverlessCacheName The unique identifier of the serverless cache. */
    public fun serverlessCacheName(serverlessCacheName: String) {
        cdkBuilder.serverlessCacheName(serverlessCacheName)
    }

    /**
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     *   cache.
     */
    public fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String) {
        _snapshotArnsToRestore.addAll(listOf(*snapshotArnsToRestore))
    }

    /**
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     *   cache.
     */
    public fun snapshotArnsToRestore(snapshotArnsToRestore: Collection<String>) {
        _snapshotArnsToRestore.addAll(snapshotArnsToRestore)
    }

    /**
     * @param snapshotRetentionLimit The current setting for the number of serverless cache
     *   snapshots the system will retain. Available for Redis only.
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
        cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     *   will select 2 default subnets across AZs in your VPC. For all other Regions, if no subnet
     *   IDs are given then ElastiCache will select 3 default subnets across AZs in your default
     *   VPC.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     *   will select 2 default subnets across AZs in your VPC. For all other Regions, if no subnet
     *   IDs are given then ElastiCache will select 3 default subnets across AZs in your default
     *   VPC.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param tags A list of tags to be added to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A list of tags to be added to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param userGroupId The identifier of the user group associated with the serverless cache.
     *   Available for Redis only. Default is NULL.
     */
    public fun userGroupId(userGroupId: String) {
        cdkBuilder.userGroupId(userGroupId)
    }

    public fun build(): CfnServerlessCacheProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_snapshotArnsToRestore.isNotEmpty())
            cdkBuilder.snapshotArnsToRestore(_snapshotArnsToRestore)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
