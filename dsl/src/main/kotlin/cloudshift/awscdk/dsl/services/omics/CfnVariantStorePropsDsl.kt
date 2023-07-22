@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.amazon.awscdk.services.omics.CfnVariantStoreProps

@CdkDslMarker
public class CfnVariantStorePropsDsl {
  private val cdkBuilder: CfnVariantStoreProps.Builder = CfnVariantStoreProps.builder()

  /**
   * @param description A description for the store.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name A name for the store. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param reference The genome reference for the store's variants. 
   */
  public fun reference(reference: IResolvable) {
    cdkBuilder.reference(reference)
  }

  /**
   * @param reference The genome reference for the store's variants. 
   */
  public fun reference(reference: CfnVariantStore.ReferenceItemProperty) {
    cdkBuilder.reference(reference)
  }

  /**
   * @param sseConfig Server-side encryption (SSE) settings for the store.
   */
  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * @param sseConfig Server-side encryption (SSE) settings for the store.
   */
  public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * @param tags Tags for the store.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnVariantStoreProps = cdkBuilder.build()
}
