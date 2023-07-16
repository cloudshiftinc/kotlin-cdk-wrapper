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

  public fun apiCachingBehavior(apiCachingBehavior: String) {
    cdkBuilder.apiCachingBehavior(apiCachingBehavior)
  }

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
    cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
  }

  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
    cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
  }

  public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  public fun ttl(ttl: Number) {
    cdkBuilder.ttl(ttl)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnApiCacheProps = cdkBuilder.build()
}
