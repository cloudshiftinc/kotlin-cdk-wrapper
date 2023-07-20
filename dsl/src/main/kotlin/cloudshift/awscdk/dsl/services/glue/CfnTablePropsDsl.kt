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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable
import software.amazon.awscdk.services.glue.CfnTableProps
import kotlin.String

@CdkDslMarker
public class CfnTablePropsDsl {
    private val cdkBuilder: CfnTableProps.Builder = CfnTableProps.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun tableInput(tableInput: IResolvable) {
        cdkBuilder.tableInput(tableInput)
    }

    public fun tableInput(tableInput: CfnTable.TableInputProperty) {
        cdkBuilder.tableInput(tableInput)
    }

    public fun build(): CfnTableProps = cdkBuilder.build()
}
