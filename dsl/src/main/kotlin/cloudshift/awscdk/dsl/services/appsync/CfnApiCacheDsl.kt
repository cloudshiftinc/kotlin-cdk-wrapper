@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnApiCache
import software.constructs.Construct

/**
 * The `AWS::AppSync::ApiCache` resource represents the input of a `CreateApiCache` operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnApiCache cfnApiCache = CfnApiCache.Builder.create(this, "MyCfnApiCache")
 * .apiCachingBehavior("apiCachingBehavior")
 * .apiId("apiId")
 * .ttl(123)
 * .type("type")
 * // the properties below are optional
 * .atRestEncryptionEnabled(false)
 * .transitEncryptionEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html)
 */
@CdkDslMarker
public class CfnApiCacheDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApiCache.Builder = CfnApiCache.Builder.create(scope, id)

  /**
   * Caching behavior.
   *
   * * *FULL_REQUEST_CACHING* : All requests are fully cached.
   * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apicachingbehavior)
   * @param apiCachingBehavior Caching behavior. 
   */
  public fun apiCachingBehavior(apiCachingBehavior: String) {
    cdkBuilder.apiCachingBehavior(apiCachingBehavior)
  }

  /**
   * The GraphQL API ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-apiid)
   * @param apiId The GraphQL API ID. 
   */
  public fun apiId(apiId: String) {
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
  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
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
  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
    cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
  }

  /**
   * Transit encryption flag when connecting to cache.
   *
   * You cannot update this setting after creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-transitencryptionenabled)
   * @param transitEncryptionEnabled Transit encryption flag when connecting to cache. 
   */
  public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
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
  public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  /**
   * TTL in seconds for cache entries.
   *
   * Valid values are 1–3,600 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html#cfn-appsync-apicache-ttl)
   * @param ttl TTL in seconds for cache entries. 
   */
  public fun ttl(ttl: Number) {
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
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnApiCache = cdkBuilder.build()
}
