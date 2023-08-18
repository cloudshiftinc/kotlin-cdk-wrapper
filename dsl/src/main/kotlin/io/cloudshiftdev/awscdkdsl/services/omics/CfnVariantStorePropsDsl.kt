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
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.amazon.awscdk.services.omics.CfnVariantStoreProps

/**
 * Properties for defining a `CfnVariantStore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * CfnVariantStoreProps cfnVariantStoreProps = CfnVariantStoreProps.builder()
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
public class CfnVariantStorePropsDsl {
    private val cdkBuilder: CfnVariantStoreProps.Builder = CfnVariantStoreProps.builder()

    /** @param description A description for the store. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A name for the store. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param reference The genome reference for the store's variants. */
    public fun reference(reference: IResolvable) {
        cdkBuilder.reference(reference)
    }

    /** @param reference The genome reference for the store's variants. */
    public fun reference(reference: CfnVariantStore.ReferenceItemProperty) {
        cdkBuilder.reference(reference)
    }

    /** @param sseConfig Server-side encryption (SSE) settings for the store. */
    public fun sseConfig(sseConfig: IResolvable) {
        cdkBuilder.sseConfig(sseConfig)
    }

    /** @param sseConfig Server-side encryption (SSE) settings for the store. */
    public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty) {
        cdkBuilder.sseConfig(sseConfig)
    }

    /** @param tags Tags for the store. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnVariantStoreProps = cdkBuilder.build()
}
