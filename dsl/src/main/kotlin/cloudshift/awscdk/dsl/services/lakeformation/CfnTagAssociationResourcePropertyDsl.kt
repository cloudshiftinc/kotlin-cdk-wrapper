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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnTagAssociationResourcePropertyDsl {
    private val cdkBuilder: CfnTagAssociation.ResourceProperty.Builder =
        CfnTagAssociation.ResourceProperty.builder()

    public fun catalog(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.catalog(builder.map)
    }

    public fun catalog(catalog: Any) {
        cdkBuilder.catalog(catalog)
    }

    public fun database(database: IResolvable) {
        cdkBuilder.database(database)
    }

    public fun database(database: CfnTagAssociation.DatabaseResourceProperty) {
        cdkBuilder.database(database)
    }

    public fun table(table: IResolvable) {
        cdkBuilder.table(table)
    }

    public fun table(table: CfnTagAssociation.TableResourceProperty) {
        cdkBuilder.table(table)
    }

    public fun tableWithColumns(tableWithColumns: IResolvable) {
        cdkBuilder.tableWithColumns(tableWithColumns)
    }

    public fun tableWithColumns(tableWithColumns: CfnTagAssociation.TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumns(tableWithColumns)
    }

    public fun build(): CfnTagAssociation.ResourceProperty = cdkBuilder.build()
}
