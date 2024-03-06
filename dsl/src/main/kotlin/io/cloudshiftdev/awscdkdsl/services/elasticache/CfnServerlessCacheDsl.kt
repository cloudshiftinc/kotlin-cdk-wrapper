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
import software.constructs.Construct

/**
 * The resource representing a serverless cache.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CfnServerlessCache cfnServerlessCache = CfnServerlessCache.Builder.create(this,
 * "MyCfnServerlessCache")
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
public class CfnServerlessCacheDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServerlessCache.Builder =
        CfnServerlessCache.Builder.create(scope, id)

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _snapshotArnsToRestore: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     *
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    public fun cacheUsageLimits(cacheUsageLimits: IResolvable) {
        cdkBuilder.cacheUsageLimits(cacheUsageLimits)
    }

    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     *
     * @param cacheUsageLimits The cache usage limit for the serverless cache.
     */
    public fun cacheUsageLimits(cacheUsageLimits: CfnServerlessCache.CacheUsageLimitsProperty) {
        cdkBuilder.cacheUsageLimits(cacheUsageLimits)
    }

    /**
     * The daily time that a cache snapshot will be created.
     *
     * Default is NULL, i.e. snapshots will not be created at a specific time on a daily basis.
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-dailysnapshottime)
     *
     * @param dailySnapshotTime The daily time that a cache snapshot will be created.
     */
    public fun dailySnapshotTime(dailySnapshotTime: String) {
        cdkBuilder.dailySnapshotTime(dailySnapshotTime)
    }

    /**
     * A description of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-description)
     *
     * @param description A description of the serverless cache.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     *
     * @param endpoint Represents the information required for client programs to connect to a cache
     *   node.
     */
    public fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint)
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     *
     * @param endpoint Represents the information required for client programs to connect to a cache
     *   node.
     */
    public fun endpoint(endpoint: CfnServerlessCache.EndpointProperty) {
        cdkBuilder.endpoint(endpoint)
    }

    /**
     * The engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-engine)
     *
     * @param engine The engine the serverless cache is compatible with.
     */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /**
     * The name of the final snapshot taken of a cache before the cache is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-finalsnapshotname)
     *
     * @param finalSnapshotName The name of the final snapshot taken of a cache before the cache is
     *   deleted.
     */
    public fun finalSnapshotName(finalSnapshotName: String) {
        cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * The ID of the AWS Key Management Service (KMS) key that is used to encrypt data at rest in
     * the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-kmskeyid)
     *
     * @param kmsKeyId The ID of the AWS Key Management Service (KMS) key that is used to encrypt
     *   data at rest in the serverless cache.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The version number of the engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-majorengineversion)
     *
     * @param majorEngineVersion The version number of the engine the serverless cache is compatible
     *   with.
     */
    public fun majorEngineVersion(majorEngineVersion: String) {
        cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     *
     * @param readerEndpoint Represents the information required for client programs to connect to a
     *   cache node.
     */
    public fun readerEndpoint(readerEndpoint: IResolvable) {
        cdkBuilder.readerEndpoint(readerEndpoint)
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     *
     * @param readerEndpoint Represents the information required for client programs to connect to a
     *   cache node.
     */
    public fun readerEndpoint(readerEndpoint: CfnServerlessCache.EndpointProperty) {
        cdkBuilder.readerEndpoint(readerEndpoint)
    }

    /**
     * The IDs of the EC2 security groups associated with the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
     *
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     *   cache.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * The IDs of the EC2 security groups associated with the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
     *
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     *   cache.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * The unique identifier of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-serverlesscachename)
     *
     * @param serverlessCacheName The unique identifier of the serverless cache.
     */
    public fun serverlessCacheName(serverlessCacheName: String) {
        cdkBuilder.serverlessCacheName(serverlessCacheName)
    }

    /**
     * The ARN of the snapshot from which to restore data into the new cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
     *
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     *   cache.
     */
    public fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String) {
        _snapshotArnsToRestore.addAll(listOf(*snapshotArnsToRestore))
    }

    /**
     * The ARN of the snapshot from which to restore data into the new cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
     *
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     *   cache.
     */
    public fun snapshotArnsToRestore(snapshotArnsToRestore: Collection<String>) {
        _snapshotArnsToRestore.addAll(snapshotArnsToRestore)
    }

    /**
     * The current setting for the number of serverless cache snapshots the system will retain.
     *
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotretentionlimit)
     *
     * @param snapshotRetentionLimit The current setting for the number of serverless cache
     *   snapshots the system will retain.
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
        cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2
     * default subnets across AZs in your VPC.
     *
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-subnetids)
     *
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     *   will select 2 default subnets across AZs in your VPC.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2
     * default subnets across AZs in your VPC.
     *
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-subnetids)
     *
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     *   will select 2 default subnets across AZs in your VPC.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
     *
     * @param tags A list of tags to be added to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
     *
     * @param tags A list of tags to be added to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The identifier of the user group associated with the serverless cache.
     *
     * Available for Redis only. Default is NULL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-usergroupid)
     *
     * @param userGroupId The identifier of the user group associated with the serverless cache.
     */
    public fun userGroupId(userGroupId: String) {
        cdkBuilder.userGroupId(userGroupId)
    }

    public fun build(): CfnServerlessCache {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_snapshotArnsToRestore.isNotEmpty())
            cdkBuilder.snapshotArnsToRestore(_snapshotArnsToRestore)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
