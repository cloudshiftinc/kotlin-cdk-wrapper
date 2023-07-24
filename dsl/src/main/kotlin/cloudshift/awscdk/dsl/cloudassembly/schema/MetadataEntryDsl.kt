@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry
import software.amazon.awscdk.cloudassembly.schema.Tag
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A metadata entry in a cloud assembly artifact.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * MetadataEntry metadataEntry = MetadataEntry.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .trace(List.of("trace"))
 * .build();
 * ```
 */
@CdkDslMarker
public class MetadataEntryDsl {
    private val cdkBuilder: MetadataEntry.Builder = MetadataEntry.builder()

    private val _data: MutableList<Tag> = mutableListOf()

    private val _trace: MutableList<String> = mutableListOf()

    /**
     * @param data The data.
     */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    /**
     * @param data The data.
     */
    public fun `data`(`data`: TagDsl.() -> Unit) {
        _data.add(TagDsl().apply(`data`).build())
    }

    /**
     * @param data The data.
     */
    public fun `data`(`data`: Collection<Tag>) {
        _data.addAll(`data`)
    }

    /**
     * @param data The data.
     */
    public fun `data`(`data`: ContainerImageAssetMetadataEntry) {
        cdkBuilder.`data`(`data`)
    }

    /**
     * @param data The data.
     */
    public fun `data`(`data`: FileAssetMetadataEntry) {
        cdkBuilder.`data`(`data`)
    }

    /**
     * @param trace A stack trace for when the entry was created.
     */
    public fun trace(vararg trace: String) {
        _trace.addAll(listOf(*trace))
    }

    /**
     * @param trace A stack trace for when the entry was created.
     */
    public fun trace(trace: Collection<String>) {
        _trace.addAll(trace)
    }

    /**
     * @param type The type of the metadata entry.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): MetadataEntry {
        if (_data.isNotEmpty()) cdkBuilder.`data`(_data)
        if (_trace.isNotEmpty()) cdkBuilder.trace(_trace)
        return cdkBuilder.build()
    }
}
