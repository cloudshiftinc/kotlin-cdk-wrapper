@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.amazon.awscdk.services.omics.CfnAnnotationStoreProps

@CdkDslMarker
public class CfnAnnotationStorePropsDsl {
  private val cdkBuilder: CfnAnnotationStoreProps.Builder = CfnAnnotationStoreProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun reference(reference: IResolvable) {
    cdkBuilder.reference(reference)
  }

  public fun reference(reference: CfnAnnotationStore.ReferenceItemProperty) {
    cdkBuilder.reference(reference)
  }

  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  public fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  public fun storeFormat(storeFormat: String) {
    cdkBuilder.storeFormat(storeFormat)
  }

  public fun storeOptions(storeOptions: IResolvable) {
    cdkBuilder.storeOptions(storeOptions)
  }

  public fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty) {
    cdkBuilder.storeOptions(storeOptions)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnAnnotationStoreProps = cdkBuilder.build()
}
