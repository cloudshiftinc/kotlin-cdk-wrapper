@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnApiCache`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnApiCacheProps cfnApiCacheProps = CfnApiCacheProps.builder()
 * .apiCachingBehavior("apiCachingBehavior")
 * .apiId("apiId")
 * .ttl(123)
 * .type("type")
 * // the properties below are optional
 * .atRestEncryptionEnabled(false)
 * .healthMetricsConfig("healthMetricsConfig")
 * .transitEncryptionEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html)
 */
public interface CfnApiCacheProps {
  /**
   * Caching behavior.
   *
   * * *FULL_REQUEST_CACHING* : All requests are fully cached.
   * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apicachingbehavior)
   */
  public fun apiCachingBehavior(): String

  /**
   * The GraphQL API ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apiid)
   */
  public fun apiId(): String

  /**
   * At-rest encryption flag for cache.
   *
   * You cannot update this setting after creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-atrestencryptionenabled)
   */
  public fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

  /**
   * Controls how cache health metrics will be emitted to CloudWatch. Cache health metrics include:.
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
   */
  public fun healthMetricsConfig(): String? = unwrap(this).getHealthMetricsConfig()

  /**
   * Transit encryption flag when connecting to cache.
   *
   * You cannot update this setting after creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-transitencryptionenabled)
   */
  public fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  /**
   * TTL in seconds for cache entries.
   *
   * Valid values are 1–3,600 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-ttl)
   */
  public fun ttl(): Number

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
   */
  public fun type(): String

  /**
   * A builder for [CfnApiCacheProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiCachingBehavior Caching behavior. 
     * * *FULL_REQUEST_CACHING* : All requests are fully cached.
     * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
     */
    public fun apiCachingBehavior(apiCachingBehavior: String)

    /**
     * @param apiId The GraphQL API ID. 
     */
    public fun apiId(apiId: String)

    /**
     * @param atRestEncryptionEnabled At-rest encryption flag for cache.
     * You cannot update this setting after creation.
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean)

    /**
     * @param atRestEncryptionEnabled At-rest encryption flag for cache.
     * You cannot update this setting after creation.
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable)

    /**
     * @param healthMetricsConfig Controls how cache health metrics will be emitted to CloudWatch.
     * Cache health metrics include:.
     * * *NetworkBandwidthOutAllowanceExceeded* : The network packets dropped because the throughput
     * exceeded the aggregated bandwidth limit. This is useful for diagnosing bottlenecks in a cache
     * configuration.
     * * *EngineCPUUtilization* : The CPU utilization (percentage) allocated to the Redis process.
     * This is useful for diagnosing bottlenecks in a cache configuration.
     *
     * Metrics will be recorded by API ID. You can set the value to `ENABLED` or `DISABLED` .
     */
    public fun healthMetricsConfig(healthMetricsConfig: String)

    /**
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache.
     * You cannot update this setting after creation.
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    /**
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache.
     * You cannot update this setting after creation.
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    /**
     * @param ttl TTL in seconds for cache entries. 
     * Valid values are 1–3,600 seconds.
     */
    public fun ttl(ttl: Number)

    /**
     * @param type The cache instance type. Valid values are. 
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
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiCacheProps.Builder =
        software.amazon.awscdk.services.appsync.CfnApiCacheProps.builder()

    /**
     * @param apiCachingBehavior Caching behavior. 
     * * *FULL_REQUEST_CACHING* : All requests are fully cached.
     * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
     */
    override fun apiCachingBehavior(apiCachingBehavior: String) {
      cdkBuilder.apiCachingBehavior(apiCachingBehavior)
    }

    /**
     * @param apiId The GraphQL API ID. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param atRestEncryptionEnabled At-rest encryption flag for cache.
     * You cannot update this setting after creation.
     */
    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    /**
     * @param atRestEncryptionEnabled At-rest encryption flag for cache.
     * You cannot update this setting after creation.
     */
    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param healthMetricsConfig Controls how cache health metrics will be emitted to CloudWatch.
     * Cache health metrics include:.
     * * *NetworkBandwidthOutAllowanceExceeded* : The network packets dropped because the throughput
     * exceeded the aggregated bandwidth limit. This is useful for diagnosing bottlenecks in a cache
     * configuration.
     * * *EngineCPUUtilization* : The CPU utilization (percentage) allocated to the Redis process.
     * This is useful for diagnosing bottlenecks in a cache configuration.
     *
     * Metrics will be recorded by API ID. You can set the value to `ENABLED` or `DISABLED` .
     */
    override fun healthMetricsConfig(healthMetricsConfig: String) {
      cdkBuilder.healthMetricsConfig(healthMetricsConfig)
    }

    /**
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache.
     * You cannot update this setting after creation.
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    /**
     * @param transitEncryptionEnabled Transit encryption flag when connecting to cache.
     * You cannot update this setting after creation.
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param ttl TTL in seconds for cache entries. 
     * Valid values are 1–3,600 seconds.
     */
    override fun ttl(ttl: Number) {
      cdkBuilder.ttl(ttl)
    }

    /**
     * @param type The cache instance type. Valid values are. 
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
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiCacheProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnApiCacheProps,
  ) : CdkObject(cdkObject), CfnApiCacheProps {
    /**
     * Caching behavior.
     *
     * * *FULL_REQUEST_CACHING* : All requests are fully cached.
     * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apicachingbehavior)
     */
    override fun apiCachingBehavior(): String = unwrap(this).getApiCachingBehavior()

    /**
     * The GraphQL API ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * At-rest encryption flag for cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-atrestencryptionenabled)
     */
    override fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

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
     */
    override fun healthMetricsConfig(): String? = unwrap(this).getHealthMetricsConfig()

    /**
     * Transit encryption flag when connecting to cache.
     *
     * You cannot update this setting after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-transitencryptionenabled)
     */
    override fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

    /**
     * TTL in seconds for cache entries.
     *
     * Valid values are 1–3,600 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-ttl)
     */
    override fun ttl(): Number = unwrap(this).getTtl()

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
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiCacheProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiCacheProps):
        CfnApiCacheProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiCacheProps):
        software.amazon.awscdk.services.appsync.CfnApiCacheProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.CfnApiCacheProps
  }
}
