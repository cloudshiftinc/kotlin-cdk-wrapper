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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationV2InputSchemaPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.InputSchemaProperty.Builder =
        CfnApplicationV2.InputSchemaProperty.builder()

    private val _recordColumns: MutableList<Any> = mutableListOf()

    public fun recordColumns(vararg recordColumns: Any) {
        _recordColumns.addAll(listOf(*recordColumns))
    }

    public fun recordColumns(recordColumns: Collection<Any>) {
        _recordColumns.addAll(recordColumns)
    }

    public fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns)
    }

    public fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
    }

    public fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat)
    }

    public fun recordFormat(recordFormat: CfnApplicationV2.RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat)
    }

    public fun build(): CfnApplicationV2.InputSchemaProperty {
        if (_recordColumns.isNotEmpty()) cdkBuilder.recordColumns(_recordColumns)
        return cdkBuilder.build()
    }
}
