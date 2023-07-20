@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnAnnotationStore

@CdkDslMarker
public class CfnAnnotationStoreStoreOptionsPropertyDsl {
  private val cdkBuilder: CfnAnnotationStore.StoreOptionsProperty.Builder =
      CfnAnnotationStore.StoreOptionsProperty.builder()

  public fun tsvStoreOptions(tsvStoreOptions: IResolvable) {
    cdkBuilder.tsvStoreOptions(tsvStoreOptions)
  }

  public fun tsvStoreOptions(tsvStoreOptions: CfnAnnotationStore.TsvStoreOptionsProperty) {
    cdkBuilder.tsvStoreOptions(tsvStoreOptions)
  }

  public fun build(): CfnAnnotationStore.StoreOptionsProperty = cdkBuilder.build()
}
