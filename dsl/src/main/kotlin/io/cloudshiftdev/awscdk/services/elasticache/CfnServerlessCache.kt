package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  internal override val cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the serverless cache.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When the serverless cache was created.
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   * The DNS hostname of the cache node.
   */
  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  /**
   * The port number that the cache engine is listening on.
   */
  public open fun attrEndpointPort(): String = unwrap(this).getAttrEndpointPort()

  /**
   * The name and version number of the engine the serverless cache is compatible with.
   */
  public open fun attrFullEngineVersion(): String = unwrap(this).getAttrFullEngineVersion()

  /**
   * The DNS hostname of the cache node.
   */
  public open fun attrReaderEndpointAddress(): String = unwrap(this).getAttrReaderEndpointAddress()

  /**
   * The port number that the cache engine is listening on.
   */
  public open fun attrReaderEndpointPort(): String = unwrap(this).getAttrReaderEndpointPort()

  /**
   * The current status of the serverless cache.
   *
   * The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The cache usage limit for the serverless cache.
   */
  public open fun cacheUsageLimits(): Any? = unwrap(this).getCacheUsageLimits()

  /**
   * The cache usage limit for the serverless cache.
   */
  public open fun cacheUsageLimits(`value`: IResolvable) {
    unwrap(this).setCacheUsageLimits(`value`.let(IResolvable::unwrap))
  }

  /**
   * The cache usage limit for the serverless cache.
   */
  public open fun cacheUsageLimits(`value`: CacheUsageLimitsProperty) {
    unwrap(this).setCacheUsageLimits(`value`.let(CacheUsageLimitsProperty::unwrap))
  }

  /**
   * The cache usage limit for the serverless cache.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ddd4cb123232e0c91434e209fe0591793344c902321a36544336991c20df8257")
  public open fun cacheUsageLimits(`value`: CacheUsageLimitsProperty.Builder.() -> Unit): Unit =
      cacheUsageLimits(CacheUsageLimitsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The daily time that a cache snapshot will be created.
   */
  public open fun dailySnapshotTime(): String? = unwrap(this).getDailySnapshotTime()

  /**
   * The daily time that a cache snapshot will be created.
   */
  public open fun dailySnapshotTime(`value`: String) {
    unwrap(this).setDailySnapshotTime(`value`)
  }

  /**
   * A description of the serverless cache.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the serverless cache.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  public open fun endpoint(): Any? = unwrap(this).getEndpoint()

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  public open fun endpoint(`value`: IResolvable) {
    unwrap(this).setEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  public open fun endpoint(`value`: EndpointProperty) {
    unwrap(this).setEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dce47952ea41d1b1d511921a42d99c90d51d1a2e9917edbe5e2e81ed068b5b95")
  public open fun endpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      endpoint(EndpointProperty(`value`))

  /**
   * The engine the serverless cache is compatible with.
   */
  public open fun engine(): String = unwrap(this).getEngine()

  /**
   * The engine the serverless cache is compatible with.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The name of the final snapshot taken of a cache before the cache is deleted.
   */
  public open fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  /**
   * The name of the final snapshot taken of a cache before the cache is deleted.
   */
  public open fun finalSnapshotName(`value`: String) {
    unwrap(this).setFinalSnapshotName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the AWS Key Management Service (KMS) key that is used to encrypt data at rest in the
   * serverless cache.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the AWS Key Management Service (KMS) key that is used to encrypt data at rest in the
   * serverless cache.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The version number of the engine the serverless cache is compatible with.
   */
  public open fun majorEngineVersion(): String? = unwrap(this).getMajorEngineVersion()

  /**
   * The version number of the engine the serverless cache is compatible with.
   */
  public open fun majorEngineVersion(`value`: String) {
    unwrap(this).setMajorEngineVersion(`value`)
  }

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  public open fun readerEndpoint(): Any? = unwrap(this).getReaderEndpoint()

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  public open fun readerEndpoint(`value`: IResolvable) {
    unwrap(this).setReaderEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  public open fun readerEndpoint(`value`: EndpointProperty) {
    unwrap(this).setReaderEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  /**
   * Represents the information required for client programs to connect to a cache node.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("084fa0fab32d2a66d94907e9a066b6ecb411a4dcbd36ece5f235bb1de46c216d")
  public open fun readerEndpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      readerEndpoint(EndpointProperty(`value`))

  /**
   * The IDs of the EC2 security groups associated with the serverless cache.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of the EC2 security groups associated with the serverless cache.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of the EC2 security groups associated with the serverless cache.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The unique identifier of the serverless cache.
   */
  public open fun serverlessCacheName(): String = unwrap(this).getServerlessCacheName()

  /**
   * The unique identifier of the serverless cache.
   */
  public open fun serverlessCacheName(`value`: String) {
    unwrap(this).setServerlessCacheName(`value`)
  }

  /**
   * The ARN of the snapshot from which to restore data into the new cache.
   */
  public open fun snapshotArnsToRestore(): List<String> = unwrap(this).getSnapshotArnsToRestore() ?:
      emptyList()

  /**
   * The ARN of the snapshot from which to restore data into the new cache.
   */
  public open fun snapshotArnsToRestore(`value`: List<String>) {
    unwrap(this).setSnapshotArnsToRestore(`value`)
  }

  /**
   * The ARN of the snapshot from which to restore data into the new cache.
   */
  public open fun snapshotArnsToRestore(vararg `value`: String): Unit =
      snapshotArnsToRestore(`value`.toList())

  /**
   * The current setting for the number of serverless cache snapshots the system will retain.
   */
  public open fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  /**
   * The current setting for the number of serverless cache snapshots the system will retain.
   */
  public open fun snapshotRetentionLimit(`value`: Number) {
    unwrap(this).setSnapshotRetentionLimit(`value`)
  }

  /**
   * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default
   * subnets across AZs in your VPC.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default
   * subnets across AZs in your VPC.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default
   * subnets across AZs in your VPC.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The identifier of the user group associated with the serverless cache.
   */
  public open fun userGroupId(): String? = unwrap(this).getUserGroupId()

  /**
   * The identifier of the user group associated with the serverless cache.
   */
  public open fun userGroupId(`value`: String) {
    unwrap(this).setUserGroupId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnServerlessCache].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     * @param cacheUsageLimits The cache usage limit for the serverless cache. 
     */
    public fun cacheUsageLimits(cacheUsageLimits: IResolvable)

    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     * @param cacheUsageLimits The cache usage limit for the serverless cache. 
     */
    public fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty)

    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     * @param cacheUsageLimits The cache usage limit for the serverless cache. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775c3a878237c535ebce61e5a18e85026371df6dacc4535b533a50e54c677b1f")
    public fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty.Builder.() -> Unit)

    /**
     * The daily time that a cache snapshot will be created.
     *
     * Default is NULL, i.e. snapshots will not be created at a specific time on a daily basis.
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-dailysnapshottime)
     * @param dailySnapshotTime The daily time that a cache snapshot will be created. 
     */
    public fun dailySnapshotTime(dailySnapshotTime: String)

    /**
     * A description of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-description)
     * @param description A description of the serverless cache. 
     */
    public fun description(description: String)

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node. 
     */
    public fun endpoint(endpoint: IResolvable)

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node. 
     */
    public fun endpoint(endpoint: EndpointProperty)

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e1aae0d852b865593d76f55442b01b155c7a978d4fb92ce9f36fd3cc7e2e")
    public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit)

    /**
     * The engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-engine)
     * @param engine The engine the serverless cache is compatible with. 
     */
    public fun engine(engine: String)

    /**
     * The name of the final snapshot taken of a cache before the cache is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-finalsnapshotname)
     * @param finalSnapshotName The name of the final snapshot taken of a cache before the cache is
     * deleted. 
     */
    public fun finalSnapshotName(finalSnapshotName: String)

    /**
     * The ID of the AWS Key Management Service (KMS) key that is used to encrypt data at rest in
     * the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service (KMS) key that is used to encrypt
     * data at rest in the serverless cache. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The version number of the engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-majorengineversion)
     * @param majorEngineVersion The version number of the engine the serverless cache is compatible
     * with. 
     */
    public fun majorEngineVersion(majorEngineVersion: String)

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node. 
     */
    public fun readerEndpoint(readerEndpoint: IResolvable)

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node. 
     */
    public fun readerEndpoint(readerEndpoint: EndpointProperty)

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfcb09b74c5e854ce3f83494238282a55e3fba47b0f3083c274ab4f6a55eab55")
    public fun readerEndpoint(readerEndpoint: EndpointProperty.Builder.() -> Unit)

    /**
     * The IDs of the EC2 security groups associated with the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of the EC2 security groups associated with the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The unique identifier of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-serverlesscachename)
     * @param serverlessCacheName The unique identifier of the serverless cache. 
     */
    public fun serverlessCacheName(serverlessCacheName: String)

    /**
     * The ARN of the snapshot from which to restore data into the new cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache. 
     */
    public fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>)

    /**
     * The ARN of the snapshot from which to restore data into the new cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache. 
     */
    public fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String)

    /**
     * The current setting for the number of serverless cache snapshots the system will retain.
     *
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotretentionlimit)
     * @param snapshotRetentionLimit The current setting for the number of serverless cache
     * snapshots the system will retain. 
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    /**
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2
     * default subnets across AZs in your VPC.
     *
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-subnetids)
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2
     * default subnets across AZs in your VPC.
     *
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-subnetids)
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The identifier of the user group associated with the serverless cache.
     *
     * Available for Redis only. Default is NULL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-usergroupid)
     * @param userGroupId The identifier of the user group associated with the serverless cache. 
     */
    public fun userGroupId(userGroupId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnServerlessCache.Builder =
        software.amazon.awscdk.services.elasticache.CfnServerlessCache.Builder.create(scope, id)

    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     * @param cacheUsageLimits The cache usage limit for the serverless cache. 
     */
    override fun cacheUsageLimits(cacheUsageLimits: IResolvable) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(IResolvable::unwrap))
    }

    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     * @param cacheUsageLimits The cache usage limit for the serverless cache. 
     */
    override fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty) {
      cdkBuilder.cacheUsageLimits(cacheUsageLimits.let(CacheUsageLimitsProperty::unwrap))
    }

    /**
     * The cache usage limit for the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-cacheusagelimits)
     * @param cacheUsageLimits The cache usage limit for the serverless cache. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775c3a878237c535ebce61e5a18e85026371df6dacc4535b533a50e54c677b1f")
    override fun cacheUsageLimits(cacheUsageLimits: CacheUsageLimitsProperty.Builder.() -> Unit):
        Unit = cacheUsageLimits(CacheUsageLimitsProperty(cacheUsageLimits))

    /**
     * The daily time that a cache snapshot will be created.
     *
     * Default is NULL, i.e. snapshots will not be created at a specific time on a daily basis.
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-dailysnapshottime)
     * @param dailySnapshotTime The daily time that a cache snapshot will be created. 
     */
    override fun dailySnapshotTime(dailySnapshotTime: String) {
      cdkBuilder.dailySnapshotTime(dailySnapshotTime)
    }

    /**
     * A description of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-description)
     * @param description A description of the serverless cache. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node. 
     */
    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node. 
     */
    override fun endpoint(endpoint: EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-endpoint)
     * @param endpoint Represents the information required for client programs to connect to a cache
     * node. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e1aae0d852b865593d76f55442b01b155c7a978d4fb92ce9f36fd3cc7e2e")
    override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(EndpointProperty(endpoint))

    /**
     * The engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-engine)
     * @param engine The engine the serverless cache is compatible with. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The name of the final snapshot taken of a cache before the cache is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-finalsnapshotname)
     * @param finalSnapshotName The name of the final snapshot taken of a cache before the cache is
     * deleted. 
     */
    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * The ID of the AWS Key Management Service (KMS) key that is used to encrypt data at rest in
     * the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service (KMS) key that is used to encrypt
     * data at rest in the serverless cache. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The version number of the engine the serverless cache is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-majorengineversion)
     * @param majorEngineVersion The version number of the engine the serverless cache is compatible
     * with. 
     */
    override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node. 
     */
    override fun readerEndpoint(readerEndpoint: IResolvable) {
      cdkBuilder.readerEndpoint(readerEndpoint.let(IResolvable::unwrap))
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node. 
     */
    override fun readerEndpoint(readerEndpoint: EndpointProperty) {
      cdkBuilder.readerEndpoint(readerEndpoint.let(EndpointProperty::unwrap))
    }

    /**
     * Represents the information required for client programs to connect to a cache node.
     *
     * This value is read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-readerendpoint)
     * @param readerEndpoint Represents the information required for client programs to connect to a
     * cache node. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfcb09b74c5e854ce3f83494238282a55e3fba47b0f3083c274ab4f6a55eab55")
    override fun readerEndpoint(readerEndpoint: EndpointProperty.Builder.() -> Unit): Unit =
        readerEndpoint(EndpointProperty(readerEndpoint))

    /**
     * The IDs of the EC2 security groups associated with the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of the EC2 security groups associated with the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-securitygroupids)
     * @param securityGroupIds The IDs of the EC2 security groups associated with the serverless
     * cache. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The unique identifier of the serverless cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-serverlesscachename)
     * @param serverlessCacheName The unique identifier of the serverless cache. 
     */
    override fun serverlessCacheName(serverlessCacheName: String) {
      cdkBuilder.serverlessCacheName(serverlessCacheName)
    }

    /**
     * The ARN of the snapshot from which to restore data into the new cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache. 
     */
    override fun snapshotArnsToRestore(snapshotArnsToRestore: List<String>) {
      cdkBuilder.snapshotArnsToRestore(snapshotArnsToRestore)
    }

    /**
     * The ARN of the snapshot from which to restore data into the new cache.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotarnstorestore)
     * @param snapshotArnsToRestore The ARN of the snapshot from which to restore data into the new
     * cache. 
     */
    override fun snapshotArnsToRestore(vararg snapshotArnsToRestore: String): Unit =
        snapshotArnsToRestore(snapshotArnsToRestore.toList())

    /**
     * The current setting for the number of serverless cache snapshots the system will retain.
     *
     * Available for Redis only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-snapshotretentionlimit)
     * @param snapshotRetentionLimit The current setting for the number of serverless cache
     * snapshots the system will retain. 
     */
    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
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
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2
     * default subnets across AZs in your VPC.
     *
     * For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default
     * subnets across AZs in your default VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-subnetids)
     * @param subnetIds If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache
     * will select 2 default subnets across AZs in your VPC. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The identifier of the user group associated with the serverless cache.
     *
     * Available for Redis only. Default is NULL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-serverlesscache.html#cfn-elasticache-serverlesscache-usergroupid)
     * @param userGroupId The identifier of the user group associated with the serverless cache. 
     */
    override fun userGroupId(userGroupId: String) {
      cdkBuilder.userGroupId(userGroupId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnServerlessCache =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnServerlessCache.CFN_RESOURCE_TYPE_NAME

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
    /**
     * The maximum data storage limit in the cache, expressed in Gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-cacheusagelimits.html#cfn-elasticache-serverlesscache-cacheusagelimits-datastorage)
     */
    public fun dataStorage(): Any? = unwrap(this).getDataStorage()

    /**
     * The number of ElastiCache Processing Units (ECPU) the cache can consume per second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-cacheusagelimits.html#cfn-elasticache-serverlesscache-cacheusagelimits-ecpupersecond)
     */
    public fun ecpuPerSecond(): Any? = unwrap(this).getEcpuPerSecond()

    /**
     * A builder for [CacheUsageLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes.
       */
      public fun dataStorage(dataStorage: IResolvable)

      /**
       * @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes.
       */
      public fun dataStorage(dataStorage: DataStorageProperty)

      /**
       * @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("327f9e8473d6550806eafa0fdfb3de96de78ca29bc969cd31e7761e0f9cab0b2")
      public fun dataStorage(dataStorage: DataStorageProperty.Builder.() -> Unit)

      /**
       * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can
       * consume per second.
       */
      public fun ecpuPerSecond(ecpuPerSecond: IResolvable)

      /**
       * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can
       * consume per second.
       */
      public fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty)

      /**
       * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can
       * consume per second.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d61e195d9aa7328e1967852fc8f4f6db0345faaf467cc8f527c6bd215607685d")
      public fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty.builder()

      /**
       * @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes.
       */
      override fun dataStorage(dataStorage: IResolvable) {
        cdkBuilder.dataStorage(dataStorage.let(IResolvable::unwrap))
      }

      /**
       * @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes.
       */
      override fun dataStorage(dataStorage: DataStorageProperty) {
        cdkBuilder.dataStorage(dataStorage.let(DataStorageProperty::unwrap))
      }

      /**
       * @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("327f9e8473d6550806eafa0fdfb3de96de78ca29bc969cd31e7761e0f9cab0b2")
      override fun dataStorage(dataStorage: DataStorageProperty.Builder.() -> Unit): Unit =
          dataStorage(DataStorageProperty(dataStorage))

      /**
       * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can
       * consume per second.
       */
      override fun ecpuPerSecond(ecpuPerSecond: IResolvable) {
        cdkBuilder.ecpuPerSecond(ecpuPerSecond.let(IResolvable::unwrap))
      }

      /**
       * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can
       * consume per second.
       */
      override fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty) {
        cdkBuilder.ecpuPerSecond(ecpuPerSecond.let(ECPUPerSecondProperty::unwrap))
      }

      /**
       * @param ecpuPerSecond The number of ElastiCache Processing Units (ECPU) the cache can
       * consume per second.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d61e195d9aa7328e1967852fc8f4f6db0345faaf467cc8f527c6bd215607685d")
      override fun ecpuPerSecond(ecpuPerSecond: ECPUPerSecondProperty.Builder.() -> Unit): Unit =
          ecpuPerSecond(ECPUPerSecondProperty(ecpuPerSecond))

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty,
    ) : CdkObject(cdkObject), CacheUsageLimitsProperty {
      /**
       * The maximum data storage limit in the cache, expressed in Gigabytes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-cacheusagelimits.html#cfn-elasticache-serverlesscache-cacheusagelimits-datastorage)
       */
      override fun dataStorage(): Any? = unwrap(this).getDataStorage()

      /**
       * The number of ElastiCache Processing Units (ECPU) the cache can consume per second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-cacheusagelimits.html#cfn-elasticache-serverlesscache-cacheusagelimits-ecpupersecond)
       */
      override fun ecpuPerSecond(): Any? = unwrap(this).getEcpuPerSecond()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CacheUsageLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty):
          CacheUsageLimitsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheUsageLimitsProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.CacheUsageLimitsProperty
    }
  }

  public interface ECPUPerSecondProperty {
    /**
     * The configuration for the maximum number of ECPUs the cache can consume per second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-ecpupersecond.html#cfn-elasticache-serverlesscache-ecpupersecond-maximum)
     */
    public fun maximum(): Number

    /**
     * A builder for [ECPUPerSecondProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximum The configuration for the maximum number of ECPUs the cache can consume per
       * second. 
       */
      public fun maximum(maximum: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty.builder()

      /**
       * @param maximum The configuration for the maximum number of ECPUs the cache can consume per
       * second. 
       */
      override fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty,
    ) : CdkObject(cdkObject), ECPUPerSecondProperty {
      /**
       * The configuration for the maximum number of ECPUs the cache can consume per second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-ecpupersecond.html#cfn-elasticache-serverlesscache-ecpupersecond-maximum)
       */
      override fun maximum(): Number = unwrap(this).getMaximum()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ECPUPerSecondProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty):
          ECPUPerSecondProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ECPUPerSecondProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.ECPUPerSecondProperty
    }
  }

  public interface EndpointProperty {
    /**
     * The DNS hostname of the cache node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-endpoint.html#cfn-elasticache-serverlesscache-endpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The port number that the cache engine is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-endpoint.html#cfn-elasticache-serverlesscache-endpoint-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * A builder for [EndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The DNS hostname of the cache node.
       */
      public fun address(address: String)

      /**
       * @param port The port number that the cache engine is listening on.
       */
      public fun port(port: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty.Builder =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty.builder()

      /**
       * @param address The DNS hostname of the cache node.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param port The port number that the cache engine is listening on.
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      /**
       * The DNS hostname of the cache node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-endpoint.html#cfn-elasticache-serverlesscache-endpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The port number that the cache engine is listening on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-endpoint.html#cfn-elasticache-serverlesscache-endpoint-port)
       */
      override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.EndpointProperty
    }
  }

  public interface DataStorageProperty {
    /**
     * The upper limit for data storage the cache is set to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-datastorage.html#cfn-elasticache-serverlesscache-datastorage-maximum)
     */
    public fun maximum(): Number

    /**
     * The unit that the storage is measured in, in GB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-datastorage.html#cfn-elasticache-serverlesscache-datastorage-unit)
     */
    public fun unit(): String

    /**
     * A builder for [DataStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximum The upper limit for data storage the cache is set to use. 
       */
      public fun maximum(maximum: Number)

      /**
       * @param unit The unit that the storage is measured in, in GB. 
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty.builder()

      /**
       * @param maximum The upper limit for data storage the cache is set to use. 
       */
      override fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
      }

      /**
       * @param unit The unit that the storage is measured in, in GB. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty,
    ) : CdkObject(cdkObject), DataStorageProperty {
      /**
       * The upper limit for data storage the cache is set to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-datastorage.html#cfn-elasticache-serverlesscache-datastorage-maximum)
       */
      override fun maximum(): Number = unwrap(this).getMaximum()

      /**
       * The unit that the storage is measured in, in GB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-datastorage.html#cfn-elasticache-serverlesscache-datastorage-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty):
          DataStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataStorageProperty):
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnServerlessCache.DataStorageProperty
    }
  }
}
