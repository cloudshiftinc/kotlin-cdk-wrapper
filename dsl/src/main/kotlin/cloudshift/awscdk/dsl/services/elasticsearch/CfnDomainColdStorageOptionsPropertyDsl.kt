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

  /**
   * @param enabled Whether to enable or disable cold storage on the domain.
   * You must enable UltraWarm storage in order to enable cold storage.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Whether to enable or disable cold storage on the domain.
   * You must enable UltraWarm storage in order to enable cold storage.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDomain.ColdStorageOptionsProperty = cdkBuilder.build()
}
