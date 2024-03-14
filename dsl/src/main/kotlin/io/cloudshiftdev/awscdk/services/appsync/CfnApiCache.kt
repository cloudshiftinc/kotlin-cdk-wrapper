package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiCache internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnApiCache,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Caching behavior.
   */
  public open fun apiCachingBehavior(): String = unwrap(this).getApiCachingBehavior()

  /**
   * Caching behavior.
   */
  public open fun apiCachingBehavior(`value`: String) {
    unwrap(this).setApiCachingBehavior(`value`)
  }

  /**
   * The GraphQL API ID.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The GraphQL API ID.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * At-rest encryption flag for cache.
   */
  public open fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

  /**
   * At-rest encryption flag for cache.
   */
  public open fun atRestEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setAtRestEncryptionEnabled(`value`)
  }

  /**
   * At-rest encryption flag for cache.
   */
  public open fun atRestEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setAtRestEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Controls how cache health metrics will be emitted to CloudWatch.
   *
   * Cache health metrics include:.
   */
  public open fun healthMetricsConfig(): String? = unwrap(this).getHealthMetricsConfig()

  /**
   * Controls how cache health metrics will be emitted to CloudWatch.
   *
   * Cache health metrics include:.
   */
  public open fun healthMetricsConfig(`value`: String) {
    unwrap(this).setHealthMetricsConfig(`value`)
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
   * Transit encryption flag when connecting to cache.
   */
  public open fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  /**
   * Transit encryption flag when connecting to cache.
   */
  public open fun transitEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setTransitEncryptionEnabled(`value`)
  }

  /**
   * Transit encryption flag when connecting to cache.
   */
  public open fun transitEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setTransitEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * TTL in seconds for cache entries.
   */
  public open fun ttl(): Number = unwrap(this).getTtl()

  /**
   * TTL in seconds for cache entries.
   */
  public open fun ttl(`value`: Number) {
    unwrap(this).setTtl(`value`)
  }

  /**
   * The cache instance type.
   *
   * Valid values are.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The cache instance type.
   *
   * Valid values are.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnApiCache].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Caching behavior.
     *
     * * *FULL_REQUEST_CACHING* : All requests are fully cached.
     * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apicachingbehavior)
     * @param apiCachingBehavior Caching behavior. 
     */
    public fun apiCachingBehavior(apiCachingBehavior: String)

    /**
     * The GraphQL API ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apiid)
     * @param apiId The GraphQL API ID. 
     */
    public fun apiId(apiId: String)

    /**
     * At-rest encryption flag for cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-atrestencryptionenabled)
     * @param atRestEncryptionEnabled At-rest encryption flag for cache. 
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean)

    /**
     * At-rest encryption flag for cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-atrestencryptionenabled)
     * @param atRestEncryptionEnabled At-rest encryption flag for cache. 
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable)

    /**
     * Controls how cache health metrics will be emitted to CloudWatch. Cache health metrics
     * include:.
     *
     * * *NetworkBandwidthOutAllowanceExceeded* : The network packets dropped because the throughput
     * exceeded the aggregated bandwidth limit. This is useful for diagnosing bottlenecks in a cache
     * configuration.
     * * *EngineCPUUtilization* : The CPU utilization (percentage) allocated to the Redis process.
     * This is useful for diagnosing bottlenecks in a cache configuration.
     *
     * Metrics will be recorded by API ID. You can set the value to `ENABLED` or `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-healthmetricsconfig)
     * @param healthMetricsConfig Controls how cache health metrics will be emitted to CloudWatch.
     * Cache health metrics include:. 
     */
    public fun healthMetricsConfig(healthMetricsConfig: String)

    /**
     * Transit encryption flag when connecting to cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-transitencryptionenabled)
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache. 
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    /**
     * Transit encryption flag when connecting to cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-transitencryptionenabled)
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache. 
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    /**
     * TTL in seconds for cache entries.
     *
     * Valid values are 1–3,600 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-ttl)
     * @param ttl TTL in seconds for cache entries. 
     */
    public fun ttl(ttl: Number)

    /**
     * The cache instance type. Valid values are.
     *
     * * `SMALL`
     * * `MEDIUM`
     * * `LARGE`
     * * `XLARGE`
     * * `LARGE_2X`
     * * `LARGE_4X`
     * * `LARGE_8X` (not available in all regions)
     * * `LARGE_12X`
     *
     * Historically, instance types were identified by an EC2-style value. As of July 2020, this is
     * deprecated, and the generic identifiers above should be used.
     *
     * The following legacy instance types are available, but their use is discouraged:
     *
     * * *T2_SMALL* : A t2.small instance type.
     * * *T2_MEDIUM* : A t2.medium instance type.
     * * *R4_LARGE* : A r4.large instance type.
     * * *R4_XLARGE* : A r4.xlarge instance type.
     * * *R4_2XLARGE* : A r4.2xlarge instance type.
     * * *R4_4XLARGE* : A r4.4xlarge instance type.
     * * *R4_8XLARGE* : A r4.8xlarge instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-type)
     * @param type The cache instance type. Valid values are. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiCache.Builder =
        software.amazon.awscdk.services.appsync.CfnApiCache.Builder.create(scope, id)

    /**
     * Caching behavior.
     *
     * * *FULL_REQUEST_CACHING* : All requests are fully cached.
     * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apicachingbehavior)
     * @param apiCachingBehavior Caching behavior. 
     */
    override fun apiCachingBehavior(apiCachingBehavior: String) {
      cdkBuilder.apiCachingBehavior(apiCachingBehavior)
    }

    /**
     * The GraphQL API ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apiid)
     * @param apiId The GraphQL API ID. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * At-rest encryption flag for cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-atrestencryptionenabled)
     * @param atRestEncryptionEnabled At-rest encryption flag for cache. 
     */
    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    /**
     * At-rest encryption flag for cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-atrestencryptionenabled)
     * @param atRestEncryptionEnabled At-rest encryption flag for cache. 
     */
    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * Controls how cache health metrics will be emitted to CloudWatch. Cache health metrics
     * include:.
     *
     * * *NetworkBandwidthOutAllowanceExceeded* : The network packets dropped because the throughput
     * exceeded the aggregated bandwidth limit. This is useful for diagnosing bottlenecks in a cache
     * configuration.
     * * *EngineCPUUtilization* : The CPU utilization (percentage) allocated to the Redis process.
     * This is useful for diagnosing bottlenecks in a cache configuration.
     *
     * Metrics will be recorded by API ID. You can set the value to `ENABLED` or `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-healthmetricsconfig)
     * @param healthMetricsConfig Controls how cache health metrics will be emitted to CloudWatch.
     * Cache health metrics include:. 
     */
    override fun healthMetricsConfig(healthMetricsConfig: String) {
      cdkBuilder.healthMetricsConfig(healthMetricsConfig)
    }

    /**
     * Transit encryption flag when connecting to cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-transitencryptionenabled)
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache. 
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    /**
     * Transit encryption flag when connecting to cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-transitencryptionenabled)
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache. 
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * TTL in seconds for cache entries.
     *
     * Valid values are 1–3,600 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-ttl)
     * @param ttl TTL in seconds for cache entries. 
     */
    override fun ttl(ttl: Number) {
      cdkBuilder.ttl(ttl)
    }

    /**
     * The cache instance type. Valid values are.
     *
     * * `SMALL`
     * * `MEDIUM`
     * * `LARGE`
     * * `XLARGE`
     * * `LARGE_2X`
     * * `LARGE_4X`
     * * `LARGE_8X` (not available in all regions)
     * * `LARGE_12X`
     *
     * Historically, instance types were identified by an EC2-style value. As of July 2020, this is
     * deprecated, and the generic identifiers above should be used.
     *
     * The following legacy instance types are available, but their use is discouraged:
     *
     * * *T2_SMALL* : A t2.small instance type.
     * * *T2_MEDIUM* : A t2.medium instance type.
     * * *R4_LARGE* : A r4.large instance type.
     * * *R4_XLARGE* : A r4.xlarge instance type.
     * * *R4_2XLARGE* : A r4.2xlarge instance type.
     * * *R4_4XLARGE* : A r4.4xlarge instance type.
     * * *R4_8XLARGE* : A r4.8xlarge instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-type)
     * @param type The cache instance type. Valid values are. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiCache = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiCache {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiCache(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiCache): CfnApiCache =
        CfnApiCache(cdkObject)

    internal fun unwrap(wrapped: CfnApiCache): software.amazon.awscdk.services.appsync.CfnApiCache =
        wrapped.cdkObject
  }
}
