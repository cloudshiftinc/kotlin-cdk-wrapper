@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.omics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.amazon.awscdk.services.omics.CfnAnnotationStoreProps

/**
 * Properties for defining a `CfnAnnotationStore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * Object schema;
 * CfnAnnotationStoreProps cfnAnnotationStoreProps = CfnAnnotationStoreProps.builder()
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
public class CfnAnnotationStorePropsDsl {
    private val cdkBuilder: CfnAnnotationStoreProps.Builder = CfnAnnotationStoreProps.builder()

    /** @param description A description for the store. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the Annotation Store. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param reference The genome reference for the store's annotations. */
    public fun reference(reference: IResolvable) {
        cdkBuilder.reference(reference)
    }

    /** @param reference The genome reference for the store's annotations. */
    public fun reference(reference: CfnAnnotationStore.ReferenceItemProperty) {
        cdkBuilder.reference(reference)
    }

    /** @param sseConfig The store's server-side encryption (SSE) settings. */
    public fun sseConfig(sseConfig: IResolvable) {
        cdkBuilder.sseConfig(sseConfig)
    }

    /** @param sseConfig The store's server-side encryption (SSE) settings. */
    public fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty) {
        cdkBuilder.sseConfig(sseConfig)
    }

    /** @param storeFormat The annotation file format of the store. */
    public fun storeFormat(storeFormat: String) {
        cdkBuilder.storeFormat(storeFormat)
    }

    /** @param storeOptions File parsing options for the annotation store. */
    public fun storeOptions(storeOptions: IResolvable) {
        cdkBuilder.storeOptions(storeOptions)
    }

    /** @param storeOptions File parsing options for the annotation store. */
    public fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty) {
        cdkBuilder.storeOptions(storeOptions)
    }

    /** @param tags Tags for the store. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnAnnotationStoreProps = cdkBuilder.build()
}
