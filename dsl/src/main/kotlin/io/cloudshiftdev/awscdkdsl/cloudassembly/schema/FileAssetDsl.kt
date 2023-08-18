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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.FileAsset
import software.amazon.awscdk.cloudassembly.schema.FileDestination
import software.amazon.awscdk.cloudassembly.schema.FileSource

/**
 * A file asset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * FileAsset fileAsset = FileAsset.builder()
 * .destinations(Map.of(
 * "destinationsKey", FileDestination.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build()))
 * .source(FileSource.builder()
 * .executable(List.of("executable"))
 * .packaging(FileAssetPackaging.FILE)
 * .path("path")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class FileAssetDsl {
    private val cdkBuilder: FileAsset.Builder = FileAsset.builder()

    /** @param destinations Destinations for this file asset. */
    public fun destinations(destinations: Map<String, FileDestination>) {
        cdkBuilder.destinations(destinations)
    }

    /** @param source Source description for file assets. */
    public fun source(source: FileSourceDsl.() -> Unit = {}) {
        val builder = FileSourceDsl()
        builder.apply(source)
        cdkBuilder.source(builder.build())
    }

    /** @param source Source description for file assets. */
    public fun source(source: FileSource) {
        cdkBuilder.source(source)
    }

    public fun build(): FileAsset = cdkBuilder.build()
}
