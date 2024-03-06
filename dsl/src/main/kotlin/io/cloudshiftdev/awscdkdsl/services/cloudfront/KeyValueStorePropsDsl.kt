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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.ImportSource
import software.amazon.awscdk.services.cloudfront.KeyValueStoreProps

/**
 * The properties to create a Key Value Store.
 *
 * Example:
 * ```
 * KeyValueStore store = KeyValueStore.Builder.create(this, "KeyValueStore")
 * .keyValueStoreName("KeyValueStore")
 * .source(ImportSource.fromAsset("path-to-data.json"))
 * .build();
 * ```
 */
@CdkDslMarker
public class KeyValueStorePropsDsl {
    private val cdkBuilder: KeyValueStoreProps.Builder = KeyValueStoreProps.builder()

    /** @param comment A comment for the Key Value Store. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param keyValueStoreName The unique name of the Key Value Store. */
    public fun keyValueStoreName(keyValueStoreName: String) {
        cdkBuilder.keyValueStoreName(keyValueStoreName)
    }

    /**
     * @param source The import source for the Key Value Store. This will populate the initial items
     *   in the Key Value Store. The source data must be in a valid JSON format.
     */
    public fun source(source: ImportSource) {
        cdkBuilder.source(source)
    }

    public fun build(): KeyValueStoreProps = cdkBuilder.build()
}
