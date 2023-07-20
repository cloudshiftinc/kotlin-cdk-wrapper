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
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnPrincipalPermissionsResourcePropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.ResourceProperty.Builder =
        CfnPrincipalPermissions.ResourceProperty.builder()

    public fun catalog(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.catalog(builder.map)
    }

    public fun catalog(catalog: Any) {
        cdkBuilder.catalog(catalog)
    }

    public fun dataCellsFilter(dataCellsFilter: IResolvable) {
        cdkBuilder.dataCellsFilter(dataCellsFilter)
    }

    public fun dataCellsFilter(dataCellsFilter: CfnPrincipalPermissions.DataCellsFilterResourceProperty) {
        cdkBuilder.dataCellsFilter(dataCellsFilter)
    }

    public fun dataLocation(dataLocation: IResolvable) {
        cdkBuilder.dataLocation(dataLocation)
    }

    public fun dataLocation(dataLocation: CfnPrincipalPermissions.DataLocationResourceProperty) {
        cdkBuilder.dataLocation(dataLocation)
    }

    public fun database(database: IResolvable) {
        cdkBuilder.database(database)
    }

    public fun database(database: CfnPrincipalPermissions.DatabaseResourceProperty) {
        cdkBuilder.database(database)
    }

    public fun lfTag(lfTag: IResolvable) {
        cdkBuilder.lfTag(lfTag)
    }

    public fun lfTag(lfTag: CfnPrincipalPermissions.LFTagKeyResourceProperty) {
        cdkBuilder.lfTag(lfTag)
    }

    public fun lfTagPolicy(lfTagPolicy: IResolvable) {
        cdkBuilder.lfTagPolicy(lfTagPolicy)
    }

    public fun lfTagPolicy(lfTagPolicy: CfnPrincipalPermissions.LFTagPolicyResourceProperty) {
        cdkBuilder.lfTagPolicy(lfTagPolicy)
    }

    public fun table(table: IResolvable) {
        cdkBuilder.table(table)
    }

    public fun table(table: CfnPrincipalPermissions.TableResourceProperty) {
        cdkBuilder.table(table)
    }

    public fun tableWithColumns(tableWithColumns: IResolvable) {
        cdkBuilder.tableWithColumns(tableWithColumns)
    }

    public fun tableWithColumns(tableWithColumns: CfnPrincipalPermissions.TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumns(tableWithColumns)
    }

    public fun build(): CfnPrincipalPermissions.ResourceProperty = cdkBuilder.build()
}
