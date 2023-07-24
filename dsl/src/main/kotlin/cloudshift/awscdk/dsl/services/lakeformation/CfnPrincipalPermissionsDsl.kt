@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The `AWS::LakeFormation::PrincipalPermissions` resource represents the permissions that a
 * principal has on a Data Catalog resource (such as AWS Glue databases or AWS Glue tables).
 *
 * When you create a `PrincipalPermissions` resource, the permissions are granted via the AWS Lake
 * Formation `GrantPermissions` API operation. When you delete a `PrincipalPermissions` resource, the
 * permissions on principal-resource pair are revoked via the AWS Lake Formation `RevokePermissions`
 * API operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object catalog;
 * Object tableWildcard;
 * CfnPrincipalPermissions cfnPrincipalPermissions = CfnPrincipalPermissions.Builder.create(this,
 * "MyCfnPrincipalPermissions")
 * .permissions(List.of("permissions"))
 * .permissionsWithGrantOption(List.of("permissionsWithGrantOption"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .resource(ResourceProperty.builder()
 * .catalog(catalog)
 * .database(DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build())
 * .dataCellsFilter(DataCellsFilterResourceProperty.builder()
 * .databaseName("databaseName")
 * .name("name")
 * .tableCatalogId("tableCatalogId")
 * .tableName("tableName")
 * .build())
 * .dataLocation(DataLocationResourceProperty.builder()
 * .catalogId("catalogId")
 * .resourceArn("resourceArn")
 * .build())
 * .lfTag(LFTagKeyResourceProperty.builder()
 * .catalogId("catalogId")
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build())
 * .lfTagPolicy(LFTagPolicyResourceProperty.builder()
 * .catalogId("catalogId")
 * .expression(List.of(LFTagProperty.builder()
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build()))
 * .resourceType("resourceType")
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
 * .databaseName("databaseName")
 * .name("name")
 * // the properties below are optional
 * .columnNames(List.of("columnNames"))
 * .columnWildcard(ColumnWildcardProperty.builder()
 * .excludedColumnNames(List.of("excludedColumnNames"))
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .catalog("catalog")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnPrincipalPermissions.Builder =
        CfnPrincipalPermissions.Builder.create(scope, id)

    private val _permissions: MutableList<String> = mutableListOf()

    private val _permissionsWithGrantOption: MutableList<String> = mutableListOf()

    /**
     * The identifier for the Data Catalog .
     *
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-catalog)
     * @param catalog The identifier for the Data Catalog .
     */
    public fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
    }

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
     * @param permissions The permissions granted or revoked.
     */
    public fun permissions(vararg permissions: String) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
     * @param permissions The permissions granted or revoked.
     */
    public fun permissions(permissions: Collection<String>) {
        _permissions.addAll(permissions)
    }

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted).
     */
    public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String) {
        _permissionsWithGrantOption.addAll(listOf(*permissionsWithGrantOption))
    }

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted).
     */
    public fun permissionsWithGrantOption(permissionsWithGrantOption: Collection<String>) {
        _permissionsWithGrantOption.addAll(permissionsWithGrantOption)
    }

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission.
     */
    public fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal)
    }

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission.
     */
    public fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty) {
        cdkBuilder.principal(principal)
    }

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions.
     */
    public fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource)
    }

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions.
     */
    public fun resource(resource: CfnPrincipalPermissions.ResourceProperty) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnPrincipalPermissions {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_permissionsWithGrantOption.isNotEmpty()) {
            cdkBuilder.permissionsWithGrantOption(_permissionsWithGrantOption)
        }
        return cdkBuilder.build()
    }
}
