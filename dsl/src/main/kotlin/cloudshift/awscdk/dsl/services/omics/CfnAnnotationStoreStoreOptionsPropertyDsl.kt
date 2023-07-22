@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnAnnotationStore

/**
 * The store's file parsing options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * Object schema;
 * StoreOptionsProperty storeOptionsProperty = StoreOptionsProperty.builder()
 * .tsvStoreOptions(TsvStoreOptionsProperty.builder()
 * .annotationType("annotationType")
 * .formatToHeader(Map.of(
 * "formatToHeaderKey", "formatToHeader"))
 * .schema(schema)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-storeoptions.html)
 */
@CdkDslMarker
public class CfnAnnotationStoreStoreOptionsPropertyDsl {
  private val cdkBuilder: CfnAnnotationStore.StoreOptionsProperty.Builder =
      CfnAnnotationStore.StoreOptionsProperty.builder()

  /**
   * @param tsvStoreOptions Formatting options for a TSV file. 
   */
  public fun tsvStoreOptions(tsvStoreOptions: IResolvable) {
    cdkBuilder.tsvStoreOptions(tsvStoreOptions)
  }

  /**
   * @param tsvStoreOptions Formatting options for a TSV file. 
   */
  public fun tsvStoreOptions(tsvStoreOptions: CfnAnnotationStore.TsvStoreOptionsProperty) {
    cdkBuilder.tsvStoreOptions(tsvStoreOptions)
  }

  public fun build(): CfnAnnotationStore.StoreOptionsProperty = cdkBuilder.build()
}
