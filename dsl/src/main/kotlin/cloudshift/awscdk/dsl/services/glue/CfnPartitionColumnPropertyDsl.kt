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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnPartition
import kotlin.String

@CdkDslMarker
public class CfnPartitionColumnPropertyDsl {
    private val cdkBuilder: CfnPartition.ColumnProperty.Builder =
        CfnPartition.ColumnProperty.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPartition.ColumnProperty = cdkBuilder.build()
}
