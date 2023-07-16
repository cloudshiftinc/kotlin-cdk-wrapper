@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appsync.CachingConfig

@CdkDslMarker
public class CachingConfigDsl {
  private val cdkBuilder: CachingConfig.Builder = CachingConfig.builder()

  private val _cachingKeys: MutableList<String> = mutableListOf()

  public fun cachingKeys(vararg cachingKeys: String) {
    _cachingKeys.addAll(listOf(*cachingKeys))
  }

  public fun cachingKeys(cachingKeys: Collection<String>) {
    _cachingKeys.addAll(cachingKeys)
  }

  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): CachingConfig {
    if(_cachingKeys.isNotEmpty()) cdkBuilder.cachingKeys(_cachingKeys)
    return cdkBuilder.build()
  }
}
