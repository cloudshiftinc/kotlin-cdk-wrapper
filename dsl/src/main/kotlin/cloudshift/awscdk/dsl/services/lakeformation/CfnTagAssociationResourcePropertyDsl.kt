@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import kotlin.Any
import kotlin.Unit

/**
 * A structure for the resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object catalog;
 * Object tableWildcard;
 * ResourceProperty resourceProperty = ResourceProperty.builder()
 * .catalog(catalog)
 * .database(DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build())
 * .table(TableResourceProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * // the properties below are optional
 * .name("name")
 * .tableWildcard(tableWildcard)
 * .build())
 * .tableWithColumns(TableWithColumnsResourceProperty.builder()
 * .catalogId("catalogId")
 * .columnNames(List.of("columnNames"))
 * .databaseName("databaseName")
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html)
 */
@CdkDslMarker
public class CfnTagAssociationResourcePropertyDsl {
    private val cdkBuilder: CfnTagAssociation.ResourceProperty.Builder =
        CfnTagAssociation.ResourceProperty.builder()

    /**
     * @param catalog The identifier for the Data Catalog.
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     */
    public fun catalog(catalog: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(catalog)
        cdkBuilder.catalog(builder.map)
    }

    /**
     * @param catalog The identifier for the Data Catalog.
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     */
    public fun catalog(catalog: Any) {
        cdkBuilder.catalog(catalog)
    }

    /**
     * @param database The database for the resource.
     * Unique to the Data Catalog. A database is a set of associated table definitions organized into
     * a logical group. You can Grant and Revoke database permissions to a principal.
     */
    public fun database(database: IResolvable) {
        cdkBuilder.database(database)
    }

    /**
     * @param database The database for the resource.
     * Unique to the Data Catalog. A database is a set of associated table definitions organized into
     * a logical group. You can Grant and Revoke database permissions to a principal.
     */
    public fun database(database: CfnTagAssociation.DatabaseResourceProperty) {
        cdkBuilder.database(database)
    }

    /**
     * @param table The table for the resource.
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     */
    public fun table(table: IResolvable) {
        cdkBuilder.table(table)
    }

    /**
     * @param table The table for the resource.
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     */
    public fun table(table: CfnTagAssociation.TableResourceProperty) {
        cdkBuilder.table(table)
    }

    /**
     * @param tableWithColumns The table with columns for the resource.
     * A principal with permissions to this resource can select metadata from the columns of a table
     * in the Data Catalog and the underlying data in Amazon S3.
     */
    public fun tableWithColumns(tableWithColumns: IResolvable) {
        cdkBuilder.tableWithColumns(tableWithColumns)
    }

    /**
     * @param tableWithColumns The table with columns for the resource.
     * A principal with permissions to this resource can select metadata from the columns of a table
     * in the Data Catalog and the underlying data in Amazon S3.
     */
    public fun tableWithColumns(tableWithColumns: CfnTagAssociation.TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumns(tableWithColumns)
    }

    public fun build(): CfnTagAssociation.ResourceProperty = cdkBuilder.build()
}
