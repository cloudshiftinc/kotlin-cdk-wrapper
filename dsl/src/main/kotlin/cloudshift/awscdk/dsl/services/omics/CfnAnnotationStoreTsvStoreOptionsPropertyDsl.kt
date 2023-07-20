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

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CfnAnnotationStoreTsvStoreOptionsPropertyDsl {
    private val cdkBuilder: CfnAnnotationStore.TsvStoreOptionsProperty.Builder =
        CfnAnnotationStore.TsvStoreOptionsProperty.builder()

    public fun annotationType(annotationType: String) {
        cdkBuilder.annotationType(annotationType)
    }

    public fun formatToHeader(formatToHeader: Map<String, String>) {
        cdkBuilder.formatToHeader(formatToHeader)
    }

    public fun formatToHeader(formatToHeader: IResolvable) {
        cdkBuilder.formatToHeader(formatToHeader)
    }

    public fun schema(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.schema(builder.map)
    }

    public fun schema(schema: Any) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnAnnotationStore.TsvStoreOptionsProperty = cdkBuilder.build()
}
