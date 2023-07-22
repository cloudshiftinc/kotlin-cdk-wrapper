@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.constructs.Construct

/**
 * Creates an annotation store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * Object schema;
 * CfnAnnotationStore cfnAnnotationStore = CfnAnnotationStore.Builder.create(this,
 * "MyCfnAnnotationStore")
 * .name("name")
 * .storeFormat("storeFormat")
 * // the properties below are optional
 * .description("description")
 * .reference(ReferenceItemProperty.builder()
 * .referenceArn("referenceArn")
 * .build())
 * .sseConfig(SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .storeOptions(StoreOptionsProperty.builder()
 * .tsvStoreOptions(TsvStoreOptionsProperty.builder()
 * .annotationType("annotationType")
 * .formatToHeader(Map.of(
 * "formatToHeaderKey", "formatToHeader"))
 * .schema(schema)
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html)
 */
@CdkDslMarker
public class CfnAnnotationStoreDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAnnotationStore.Builder = CfnAnnotationStore.Builder.create(scope, id)

  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-description)
   * @param description A description for the store. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the Annotation Store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-name)
   * @param name The name of the Annotation Store. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The genome reference for the store's annotations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
   * @param reference The genome reference for the store's annotations. 
   */
  public fun reference(reference: IResolvable) {
    cdkBuilder.reference(reference)
  }

  /**
   * The genome reference for the store's annotations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
   * @param reference The genome reference for the store's annotations. 
   */
  public fun reference(reference: CfnAnnotationStore.ReferenceItemProperty) {
    cdkBuilder.reference(reference)
  }

  /**
   * The store's server-side encryption (SSE) settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
   * @param sseConfig The store's server-side encryption (SSE) settings. 
   */
  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * The store's server-side encryption (SSE) settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
   * @param sseConfig The store's server-side encryption (SSE) settings. 
   */
  public fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * The annotation file format of the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeformat)
   * @param storeFormat The annotation file format of the store. 
   */
  public fun storeFormat(storeFormat: String) {
    cdkBuilder.storeFormat(storeFormat)
  }

  /**
   * File parsing options for the annotation store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
   * @param storeOptions File parsing options for the annotation store. 
   */
  public fun storeOptions(storeOptions: IResolvable) {
    cdkBuilder.storeOptions(storeOptions)
  }

  /**
   * File parsing options for the annotation store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
   * @param storeOptions File parsing options for the annotation store. 
   */
  public fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty) {
    cdkBuilder.storeOptions(storeOptions)
  }

  /**
   * Tags for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-tags)
   * @param tags Tags for the store. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnAnnotationStore = cdkBuilder.build()
}
