@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@CdkDslMarker
public class CfnDomainColdStorageOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.ColdStorageOptionsProperty.Builder =
      CfnDomain.ColdStorageOptionsProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDomain.ColdStorageOptionsProperty = cdkBuilder.build()
}
