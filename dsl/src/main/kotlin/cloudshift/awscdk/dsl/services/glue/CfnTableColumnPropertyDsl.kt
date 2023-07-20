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
import software.amazon.awscdk.services.glue.CfnTable
import kotlin.String

@CdkDslMarker
public class CfnTableColumnPropertyDsl {
    private val cdkBuilder: CfnTable.ColumnProperty.Builder = CfnTable.ColumnProperty.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTable.ColumnProperty = cdkBuilder.build()
}
