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
import software.amazon.awscdk.services.omics.CfnReferenceStore
import software.amazon.awscdk.services.omics.CfnReferenceStoreProps

/**
 * Properties for defining a `CfnReferenceStore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * CfnReferenceStoreProps cfnReferenceStoreProps = CfnReferenceStoreProps.builder()
 * .name("name")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html)
 */
@CdkDslMarker
public class CfnReferenceStorePropsDsl {
    private val cdkBuilder: CfnReferenceStoreProps.Builder = CfnReferenceStoreProps.builder()

    /** @param description A description for the store. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A name for the store. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param sseConfig Server-side encryption (SSE) settings for the store. */
    public fun sseConfig(sseConfig: IResolvable) {
        cdkBuilder.sseConfig(sseConfig)
    }

    /** @param sseConfig Server-side encryption (SSE) settings for the store. */
    public fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty) {
        cdkBuilder.sseConfig(sseConfig)
    }

    /** @param tags Tags for the store. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnReferenceStoreProps = cdkBuilder.build()
}
