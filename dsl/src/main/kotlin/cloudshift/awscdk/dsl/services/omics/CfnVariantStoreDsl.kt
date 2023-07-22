@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.constructs.Construct

/**
 * Create a store for variant data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * CfnVariantStore cfnVariantStore = CfnVariantStore.Builder.create(this, "MyCfnVariantStore")
 * .name("name")
 * .reference(ReferenceItemProperty.builder()
 * .referenceArn("referenceArn")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .sseConfig(SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html)
 */
@CdkDslMarker
public class CfnVariantStoreDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVariantStore.Builder = CfnVariantStore.Builder.create(scope, id)

  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-description)
   * @param description A description for the store. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A name for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-name)
   * @param name A name for the store. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The genome reference for the store's variants.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
   * @param reference The genome reference for the store's variants. 
   */
  public fun reference(reference: IResolvable) {
    cdkBuilder.reference(reference)
  }

  /**
   * The genome reference for the store's variants.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
   * @param reference The genome reference for the store's variants. 
   */
  public fun reference(reference: CfnVariantStore.ReferenceItemProperty) {
    cdkBuilder.reference(reference)
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
   * @param sseConfig Server-side encryption (SSE) settings for the store. 
   */
  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
   * @param sseConfig Server-side encryption (SSE) settings for the store. 
   */
  public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * Tags for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-tags)
   * @param tags Tags for the store. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnVariantStore = cdkBuilder.build()
}
