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
import software.amazon.awscdk.services.cloudfront.KeyValueStore
import software.constructs.Construct

/**
 * A CloudFront Key Value Store.
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
public class KeyValueStoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: KeyValueStore.Builder = KeyValueStore.Builder.create(scope, id)

    /**
     * A comment for the Key Value Store.
     *
     * Default: No comment will be specified
     *
     * @param comment A comment for the Key Value Store.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * The unique name of the Key Value Store.
     *
     * Default: A generated name
     *
     * @param keyValueStoreName The unique name of the Key Value Store.
     */
    public fun keyValueStoreName(keyValueStoreName: String) {
        cdkBuilder.keyValueStoreName(keyValueStoreName)
    }

    /**
     * The import source for the Key Value Store.
     *
     * This will populate the initial items in the Key Value Store. The source data must be in a
     * valid JSON format.
     *
     * Default: No data will be imported to the store
     *
     * @param source The import source for the Key Value Store.
     */
    public fun source(source: ImportSource) {
        cdkBuilder.source(source)
    }

    public fun build(): KeyValueStore = cdkBuilder.build()
}
