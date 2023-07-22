@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnApiCacheProps

@CdkDslMarker
public class CfnApiCachePropsDsl {
  private val cdkBuilder: CfnApiCacheProps.Builder = CfnApiCacheProps.builder()

  /**
   * @param apiCachingBehavior Caching behavior. 
   * * *FULL_REQUEST_CACHING* : All requests are fully cached.
   * * *PER_RESOLVER_CACHING* : Individual resolvers that you specify are cached.
   */
  public fun apiCachingBehavior(apiCachingBehavior: String) {
    cdkBuilder.apiCachingBehavior(apiCachingBehavior)
  }

  /**
   * @param apiId The GraphQL API ID. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param atRestEncryptionEnabled At-rest encryption flag for cache.
   * You cannot update this setting after creation.
   */
  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
    cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
  }

  /**
   * @param atRestEncryptionEnabled At-rest encryption flag for cache.
   * You cannot update this setting after creation.
   */
  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
    cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
  }

  /**
   * @param transitEncryptionEnabled Transit encryption flag when connecting to cache.
   * You cannot update this setting after creation.
   */
  public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  /**
   * @param transitEncryptionEnabled Transit encryption flag when connecting to cache.
   * You cannot update this setting after creation.
   */
  public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  /**
   * @param ttl TTL in seconds for cache entries. 
   * Valid values are 1–3,600 seconds.
   */
  public fun ttl(ttl: Number) {
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
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnApiCacheProps = cdkBuilder.build()
}
