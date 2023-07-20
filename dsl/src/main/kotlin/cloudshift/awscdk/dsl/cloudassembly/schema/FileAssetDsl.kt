@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.FileAsset
import software.amazon.awscdk.cloudassembly.schema.FileDestination
import software.amazon.awscdk.cloudassembly.schema.FileSource
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class FileAssetDsl {
    private val cdkBuilder: FileAsset.Builder = FileAsset.builder()

    public fun destinations(destinations: Map<String, FileDestination>) {
        cdkBuilder.destinations(destinations)
    }

    public fun source(block: FileSourceDsl.() -> Unit = {}) {
        val builder = FileSourceDsl()
        builder.apply(block)
        cdkBuilder.source(builder.build())
    }

    public fun source(source: FileSource) {
        cdkBuilder.source(source)
    }

    public fun build(): FileAsset = cdkBuilder.build()
}
