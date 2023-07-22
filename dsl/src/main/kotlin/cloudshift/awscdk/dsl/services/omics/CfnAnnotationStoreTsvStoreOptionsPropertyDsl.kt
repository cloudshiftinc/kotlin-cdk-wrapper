@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnAnnotationStore

@CdkDslMarker
public class CfnAnnotationStoreTsvStoreOptionsPropertyDsl {
  private val cdkBuilder: CfnAnnotationStore.TsvStoreOptionsProperty.Builder =
      CfnAnnotationStore.TsvStoreOptionsProperty.builder()

  /**
   * @param annotationType The store's annotation type.
   */
  public fun annotationType(annotationType: String) {
    cdkBuilder.annotationType(annotationType)
  }

  /**
   * @param formatToHeader The store's header key to column name mapping.
   */
  public fun formatToHeader(formatToHeader: Map<String, String>) {
    cdkBuilder.formatToHeader(formatToHeader)
  }

  /**
   * @param formatToHeader The store's header key to column name mapping.
   */
  public fun formatToHeader(formatToHeader: IResolvable) {
    cdkBuilder.formatToHeader(formatToHeader)
  }

  /**
   * @param schema The schema of an annotation store.
   */
  public fun schema(schema: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(schema)
    cdkBuilder.schema(builder.map)
  }

  /**
   * @param schema The schema of an annotation store.
   */
  public fun schema(schema: Any) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnAnnotationStore.TsvStoreOptionsProperty = cdkBuilder.build()
}
