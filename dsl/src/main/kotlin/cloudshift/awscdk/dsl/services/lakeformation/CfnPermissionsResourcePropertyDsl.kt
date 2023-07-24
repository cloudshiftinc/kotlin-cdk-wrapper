@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPermissions

/**
 * A structure for the resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * ResourceProperty resourceProperty = ResourceProperty.builder()
 * .databaseResource(DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build())
 * .dataLocationResource(DataLocationResourceProperty.builder()
 * .catalogId("catalogId")
 * .s3Resource("s3Resource")
 * .build())
 * .tableResource(TableResourceProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .name("name")
 * .tableWildcard(TableWildcardProperty.builder().build())
 * .build())
 * .tableWithColumnsResource(TableWithColumnsResourceProperty.builder()
 * .catalogId("catalogId")
 * .columnNames(List.of("columnNames"))
 * .columnWildcard(ColumnWildcardProperty.builder()
 * .excludedColumnNames(List.of("excludedColumnNames"))
 * .build())
 * .databaseName("databaseName")
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html)
 */
@CdkDslMarker
public class CfnPermissionsResourcePropertyDsl {
    private val cdkBuilder: CfnPermissions.ResourceProperty.Builder =
        CfnPermissions.ResourceProperty.builder()

    /**
     * @param dataLocationResource A structure for a data location object where permissions are
     * granted or revoked.
     */
    public fun dataLocationResource(dataLocationResource: IResolvable) {
        cdkBuilder.dataLocationResource(dataLocationResource)
    }

    /**
     * @param dataLocationResource A structure for a data location object where permissions are
     * granted or revoked.
     */
    public fun dataLocationResource(dataLocationResource: CfnPermissions.DataLocationResourceProperty) {
        cdkBuilder.dataLocationResource(dataLocationResource)
    }

    /**
     * @param databaseResource A structure for the database object.
     */
    public fun databaseResource(databaseResource: IResolvable) {
        cdkBuilder.databaseResource(databaseResource)
    }

    /**
     * @param databaseResource A structure for the database object.
     */
    public fun databaseResource(databaseResource: CfnPermissions.DatabaseResourceProperty) {
        cdkBuilder.databaseResource(databaseResource)
    }

    /**
     * @param tableResource A structure for the table object.
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     */
    public fun tableResource(tableResource: IResolvable) {
        cdkBuilder.tableResource(tableResource)
    }

    /**
     * @param tableResource A structure for the table object.
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     */
    public fun tableResource(tableResource: CfnPermissions.TableResourceProperty) {
        cdkBuilder.tableResource(tableResource)
    }

    /**
     * @param tableWithColumnsResource A structure for a table with columns object.
     * This object is only used when granting a SELECT permission.
     */
    public fun tableWithColumnsResource(tableWithColumnsResource: IResolvable) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource)
    }

    /**
     * @param tableWithColumnsResource A structure for a table with columns object.
     * This object is only used when granting a SELECT permission.
     */
    public fun tableWithColumnsResource(tableWithColumnsResource: CfnPermissions.TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource)
    }

    public fun build(): CfnPermissions.ResourceProperty = cdkBuilder.build()
}
