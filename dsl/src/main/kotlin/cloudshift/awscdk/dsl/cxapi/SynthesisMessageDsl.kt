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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.cloudassembly.schema.MetadataEntryDsl
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry
import software.amazon.awscdk.cxapi.SynthesisMessage
import software.amazon.awscdk.cxapi.SynthesisMessageLevel
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class SynthesisMessageDsl {
    private val cdkBuilder: SynthesisMessage.Builder = SynthesisMessage.builder()

    public fun entry(block: MetadataEntryDsl.() -> Unit = {}) {
        val builder = MetadataEntryDsl()
        builder.apply(block)
        cdkBuilder.entry(builder.build())
    }

    public fun entry(entry: MetadataEntry) {
        cdkBuilder.entry(entry)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun level(level: SynthesisMessageLevel) {
        cdkBuilder.level(level)
    }

    public fun build(): SynthesisMessage = cdkBuilder.build()
}
