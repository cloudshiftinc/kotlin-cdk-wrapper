@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lakeformation

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.amazon.awscdk.services.lakeformation.CfnPermissionsProps
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps
import software.amazon.awscdk.services.lakeformation.CfnResource
import software.amazon.awscdk.services.lakeformation.CfnResourceProps
import software.amazon.awscdk.services.lakeformation.CfnTag
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps
import software.amazon.awscdk.services.lakeformation.CfnTagProps
import software.constructs.Construct

public object lakeformation {
    /**
     * A structure that represents a data cell filter with column-level, row-level, and/or
     * cell-level security.
     *
     * Data cell filters belong to a specific table in a Data Catalog . During a stack operation,
     * AWS CloudFormation calls the AWS Lake Formation `CreateDataCellsFilter` API operation to
     * create a `DataCellsFilter` resource, and calls the `DeleteDataCellsFilter` API operation to
     * delete it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object allRowsWildcard;
     * CfnDataCellsFilter cfnDataCellsFilter = CfnDataCellsFilter.Builder.create(this,
     * "MyCfnDataCellsFilter")
     * .databaseName("databaseName")
     * .name("name")
     * .tableCatalogId("tableCatalogId")
     * .tableName("tableName")
     * // the properties below are optional
     * .columnNames(List.of("columnNames"))
     * .columnWildcard(ColumnWildcardProperty.builder()
     * .excludedColumnNames(List.of("excludedColumnNames"))
     * .build())
     * .rowFilter(RowFilterProperty.builder()
     * .allRowsWildcard(allRowsWildcard)
     * .filterExpression("filterExpression")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html)
     */
    public inline fun cfnDataCellsFilter(
        scope: Construct,
        id: String,
        block: CfnDataCellsFilterDsl.() -> Unit = {},
    ): CfnDataCellsFilter {
        val builder = CfnDataCellsFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A wildcard object, consisting of an optional list of excluded column names or indexes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * ColumnWildcardProperty columnWildcardProperty = ColumnWildcardProperty.builder()
     * .excludedColumnNames(List.of("excludedColumnNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-columnwildcard.html)
     */
    public inline fun cfnDataCellsFilterColumnWildcardProperty(
        block: CfnDataCellsFilterColumnWildcardPropertyDsl.() -> Unit = {}
    ): CfnDataCellsFilter.ColumnWildcardProperty {
        val builder = CfnDataCellsFilterColumnWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataCellsFilter`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object allRowsWildcard;
     * CfnDataCellsFilterProps cfnDataCellsFilterProps = CfnDataCellsFilterProps.builder()
     * .databaseName("databaseName")
     * .name("name")
     * .tableCatalogId("tableCatalogId")
     * .tableName("tableName")
     * // the properties below are optional
     * .columnNames(List.of("columnNames"))
     * .columnWildcard(ColumnWildcardProperty.builder()
     * .excludedColumnNames(List.of("excludedColumnNames"))
     * .build())
     * .rowFilter(RowFilterProperty.builder()
     * .allRowsWildcard(allRowsWildcard)
     * .filterExpression("filterExpression")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html)
     */
    public inline fun cfnDataCellsFilterProps(
        block: CfnDataCellsFilterPropsDsl.() -> Unit = {}
    ): CfnDataCellsFilterProps {
        val builder = CfnDataCellsFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A PartiQL predicate.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object allRowsWildcard;
     * RowFilterProperty rowFilterProperty = RowFilterProperty.builder()
     * .allRowsWildcard(allRowsWildcard)
     * .filterExpression("filterExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-rowfilter.html)
     */
    public inline fun cfnDataCellsFilterRowFilterProperty(
        block: CfnDataCellsFilterRowFilterPropertyDsl.() -> Unit = {}
    ): CfnDataCellsFilter.RowFilterProperty {
        val builder = CfnDataCellsFilterRowFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::LakeFormation::DataLakeSettings` resource is an AWS Lake Formation resource type
     * that manages the data lake settings for your account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object parameters;
     * CfnDataLakeSettings cfnDataLakeSettings = CfnDataLakeSettings.Builder.create(this,
     * "MyCfnDataLakeSettings")
     * .admins(List.of(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build()))
     * .allowExternalDataFiltering(false)
     * .authorizedSessionTagValueList(List.of("authorizedSessionTagValueList"))
     * .createDatabaseDefaultPermissions(List.of(PrincipalPermissionsProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build()))
     * .createTableDefaultPermissions(List.of(PrincipalPermissionsProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build()))
     * .externalDataFilteringAllowList(List.of(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build()))
     * .parameters(parameters)
     * .trustedResourceOwners(List.of("trustedResourceOwners"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html)
     */
    public inline fun cfnDataLakeSettings(
        scope: Construct,
        id: String,
        block: CfnDataLakeSettingsDsl.() -> Unit = {},
    ): CfnDataLakeSettings {
        val builder = CfnDataLakeSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of AWS Lake Formation principals.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * AdminsProperty adminsProperty = AdminsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-admins.html)
     */
    public inline fun cfnDataLakeSettingsAdminsProperty(
        block: CfnDataLakeSettingsAdminsPropertyDsl.() -> Unit = {}
    ): CfnDataLakeSettings.AdminsProperty {
        val builder = CfnDataLakeSettingsAdminsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether access control on a newly created database is managed by Lake Formation
     * permissions or exclusively by IAM permissions.
     *
     * A null value indicates that the access is controlled by Lake Formation permissions. A value
     * that assigns `ALL` to `IAM_ALLOWED_PRINCIPALS` indicates access control by IAM permissions.
     * This is referred to as the setting "Use only IAM access control," and is for backward
     * compatibility with the AWS Glue permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CreateDatabaseDefaultPermissionsProperty createDatabaseDefaultPermissionsProperty =
     * CreateDatabaseDefaultPermissionsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-createdatabasedefaultpermissions.html)
     */
    public inline fun cfnDataLakeSettingsCreateDatabaseDefaultPermissionsProperty(
        block: CfnDataLakeSettingsCreateDatabaseDefaultPermissionsPropertyDsl.() -> Unit = {}
    ): CfnDataLakeSettings.CreateDatabaseDefaultPermissionsProperty {
        val builder = CfnDataLakeSettingsCreateDatabaseDefaultPermissionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether access control on a newly created table is managed by Lake Formation
     * permissions or exclusively by IAM permissions.
     *
     * A null value indicates that the access is controlled by Lake Formation permissions. A value
     * that assigns `ALL` to `IAM_ALLOWED_PRINCIPALS` indicates access control by IAM permissions.
     * This is referred to as the setting "Use only IAM access control," and is for backward
     * compatibility with the AWS Glue permission model implemented by IAM permissions.
     *
     * The only permitted values are an empty array or an array that contains a single JSON object
     * that grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
     *
     * For more information, see
     * [Changing the Default Security Settings for Your Data Lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CreateTableDefaultPermissionsProperty createTableDefaultPermissionsProperty =
     * CreateTableDefaultPermissionsProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-createtabledefaultpermissions.html)
     */
    public inline fun cfnDataLakeSettingsCreateTableDefaultPermissionsProperty(
        block: CfnDataLakeSettingsCreateTableDefaultPermissionsPropertyDsl.() -> Unit = {}
    ): CfnDataLakeSettings.CreateTableDefaultPermissionsProperty {
        val builder = CfnDataLakeSettingsCreateTableDefaultPermissionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Lake Formation principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-datalakeprincipal.html)
     */
    public inline fun cfnDataLakeSettingsDataLakePrincipalProperty(
        block: CfnDataLakeSettingsDataLakePrincipalPropertyDsl.() -> Unit = {}
    ): CfnDataLakeSettings.DataLakePrincipalProperty {
        val builder = CfnDataLakeSettingsDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of the account IDs of AWS accounts with Amazon EMR clusters that are allowed to
     * perform data filtering.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * ExternalDataFilteringAllowListProperty externalDataFilteringAllowListProperty =
     * ExternalDataFilteringAllowListProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-externaldatafilteringallowlist.html)
     */
    public inline fun cfnDataLakeSettingsExternalDataFilteringAllowListProperty(
        block: CfnDataLakeSettingsExternalDataFilteringAllowListPropertyDsl.() -> Unit = {}
    ): CfnDataLakeSettings.ExternalDataFilteringAllowListProperty {
        val builder = CfnDataLakeSettingsExternalDataFilteringAllowListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Permissions granted to a principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * PrincipalPermissionsProperty principalPermissionsProperty =
     * PrincipalPermissionsProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-principalpermissions.html)
     */
    public inline fun cfnDataLakeSettingsPrincipalPermissionsProperty(
        block: CfnDataLakeSettingsPrincipalPermissionsPropertyDsl.() -> Unit = {}
    ): CfnDataLakeSettings.PrincipalPermissionsProperty {
        val builder = CfnDataLakeSettingsPrincipalPermissionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataLakeSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object parameters;
     * CfnDataLakeSettingsProps cfnDataLakeSettingsProps = CfnDataLakeSettingsProps.builder()
     * .admins(List.of(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build()))
     * .allowExternalDataFiltering(false)
     * .authorizedSessionTagValueList(List.of("authorizedSessionTagValueList"))
     * .createDatabaseDefaultPermissions(List.of(PrincipalPermissionsProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build()))
     * .createTableDefaultPermissions(List.of(PrincipalPermissionsProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build()))
     * .externalDataFilteringAllowList(List.of(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build()))
     * .parameters(parameters)
     * .trustedResourceOwners(List.of("trustedResourceOwners"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datalakesettings.html)
     */
    public inline fun cfnDataLakeSettingsProps(
        block: CfnDataLakeSettingsPropsDsl.() -> Unit = {}
    ): CfnDataLakeSettingsProps {
        val builder = CfnDataLakeSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::LakeFormation::Permissions` resource represents the permissions that a principal
     * has on an AWS Glue Data Catalog resource (such as AWS Glue database or AWS Glue tables).
     *
     * When you upload a permissions stack, the permissions are granted to the principal and when
     * you remove the stack, the permissions are revoked from the principal. If you remove a stack,
     * and the principal does not have the permissions referenced in the stack then AWS Lake
     * Formation will throw an error because you can’t call revoke on non-existing permissions. To
     * successfully remove the stack, you’ll need to regrant those permissions and then remove the
     * stack.
     *
     * New versions of AWS Lake Formation permission resources are now available. For more
     * information, see:
     * [AWS:LakeFormation::PrincipalPermissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CfnPermissions cfnPermissions = CfnPermissions.Builder.create(this, "MyCfnPermissions")
     * .dataLakePrincipal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .resource(ResourceProperty.builder()
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
     * .build())
     * // the properties below are optional
     * .permissions(List.of("permissions"))
     * .permissionsWithGrantOption(List.of("permissionsWithGrantOption"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html)
     */
    public inline fun cfnPermissions(
        scope: Construct,
        id: String,
        block: CfnPermissionsDsl.() -> Unit = {},
    ): CfnPermissions {
        val builder = CfnPermissionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A wildcard object, consisting of an optional list of excluded column names or indexes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * ColumnWildcardProperty columnWildcardProperty = ColumnWildcardProperty.builder()
     * .excludedColumnNames(List.of("excludedColumnNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html)
     */
    public inline fun cfnPermissionsColumnWildcardProperty(
        block: CfnPermissionsColumnWildcardPropertyDsl.() -> Unit = {}
    ): CfnPermissions.ColumnWildcardProperty {
        val builder = CfnPermissionsColumnWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Lake Formation principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html)
     */
    public inline fun cfnPermissionsDataLakePrincipalProperty(
        block: CfnPermissionsDataLakePrincipalPropertyDsl.() -> Unit = {}
    ): CfnPermissions.DataLakePrincipalProperty {
        val builder = CfnPermissionsDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for a data location object where permissions are granted or revoked.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DataLocationResourceProperty dataLocationResourceProperty =
     * DataLocationResourceProperty.builder()
     * .catalogId("catalogId")
     * .s3Resource("s3Resource")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html)
     */
    public inline fun cfnPermissionsDataLocationResourceProperty(
        block: CfnPermissionsDataLocationResourcePropertyDsl.() -> Unit = {}
    ): CfnPermissions.DataLocationResourceProperty {
        val builder = CfnPermissionsDataLocationResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the database object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DatabaseResourceProperty databaseResourceProperty = DatabaseResourceProperty.builder()
     * .catalogId("catalogId")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html)
     */
    public inline fun cfnPermissionsDatabaseResourceProperty(
        block: CfnPermissionsDatabaseResourcePropertyDsl.() -> Unit = {}
    ): CfnPermissions.DatabaseResourceProperty {
        val builder = CfnPermissionsDatabaseResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPermissions`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CfnPermissionsProps cfnPermissionsProps = CfnPermissionsProps.builder()
     * .dataLakePrincipal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .resource(ResourceProperty.builder()
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
     * .build())
     * // the properties below are optional
     * .permissions(List.of("permissions"))
     * .permissionsWithGrantOption(List.of("permissionsWithGrantOption"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html)
     */
    public inline fun cfnPermissionsProps(
        block: CfnPermissionsPropsDsl.() -> Unit = {}
    ): CfnPermissionsProps {
        val builder = CfnPermissionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the resource.
     *
     * Example:
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
    public inline fun cfnPermissionsResourceProperty(
        block: CfnPermissionsResourcePropertyDsl.() -> Unit = {}
    ): CfnPermissions.ResourceProperty {
        val builder = CfnPermissionsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the table object.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * TableResourceProperty tableResourceProperty = TableResourceProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .name("name")
     * .tableWildcard(TableWildcardProperty.builder().build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html)
     */
    public inline fun cfnPermissionsTableResourceProperty(
        block: CfnPermissionsTableResourcePropertyDsl.() -> Unit = {}
    ): CfnPermissions.TableResourceProperty {
        val builder = CfnPermissionsTableResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A wildcard object representing every table under a database.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * TableWildcardProperty tableWildcardProperty = TableWildcardProperty.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewildcard.html)
     */
    public inline fun cfnPermissionsTableWildcardProperty(
        block: CfnPermissionsTableWildcardPropertyDsl.() -> Unit = {}
    ): CfnPermissions.TableWildcardProperty {
        val builder = CfnPermissionsTableWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for a table with columns object. This object is only used when granting a SELECT
     * permission.
     *
     * This object must take a value for at least one of `ColumnsNames` , `ColumnsIndexes` , or
     * `ColumnsWildcard` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * TableWithColumnsResourceProperty tableWithColumnsResourceProperty =
     * TableWithColumnsResourceProperty.builder()
     * .catalogId("catalogId")
     * .columnNames(List.of("columnNames"))
     * .columnWildcard(ColumnWildcardProperty.builder()
     * .excludedColumnNames(List.of("excludedColumnNames"))
     * .build())
     * .databaseName("databaseName")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html)
     */
    public inline fun cfnPermissionsTableWithColumnsResourceProperty(
        block: CfnPermissionsTableWithColumnsResourcePropertyDsl.() -> Unit = {}
    ): CfnPermissions.TableWithColumnsResourceProperty {
        val builder = CfnPermissionsTableWithColumnsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::LakeFormation::PrincipalPermissions` resource represents the permissions that a
     * principal has on a Data Catalog resource (such as AWS Glue databases or AWS Glue tables).
     *
     * When you create a `PrincipalPermissions` resource, the permissions are granted via the AWS
     * Lake Formation `GrantPermissions` API operation. When you delete a `PrincipalPermissions`
     * resource, the permissions on principal-resource pair are revoked via the AWS Lake Formation
     * `RevokePermissions` API operation.
     *
     * Example:
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
    public inline fun cfnPrincipalPermissions(
        scope: Construct,
        id: String,
        block: CfnPrincipalPermissionsDsl.() -> Unit = {},
    ): CfnPrincipalPermissions {
        val builder = CfnPrincipalPermissionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A wildcard object, consisting of an optional list of excluded column names or indexes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * ColumnWildcardProperty columnWildcardProperty = ColumnWildcardProperty.builder()
     * .excludedColumnNames(List.of("excludedColumnNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-columnwildcard.html)
     */
    public inline fun cfnPrincipalPermissionsColumnWildcardProperty(
        block: CfnPrincipalPermissionsColumnWildcardPropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.ColumnWildcardProperty {
        val builder = CfnPrincipalPermissionsColumnWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that describes certain columns on certain rows.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DataCellsFilterResourceProperty dataCellsFilterResourceProperty =
     * DataCellsFilterResourceProperty.builder()
     * .databaseName("databaseName")
     * .name("name")
     * .tableCatalogId("tableCatalogId")
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html)
     */
    public inline fun cfnPrincipalPermissionsDataCellsFilterResourceProperty(
        block: CfnPrincipalPermissionsDataCellsFilterResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.DataCellsFilterResourceProperty {
        val builder = CfnPrincipalPermissionsDataCellsFilterResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS Lake Formation principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalakeprincipal.html)
     */
    public inline fun cfnPrincipalPermissionsDataLakePrincipalProperty(
        block: CfnPrincipalPermissionsDataLakePrincipalPropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.DataLakePrincipalProperty {
        val builder = CfnPrincipalPermissionsDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for a data location object where permissions are granted or revoked.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DataLocationResourceProperty dataLocationResourceProperty =
     * DataLocationResourceProperty.builder()
     * .catalogId("catalogId")
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalocationresource.html)
     */
    public inline fun cfnPrincipalPermissionsDataLocationResourceProperty(
        block: CfnPrincipalPermissionsDataLocationResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.DataLocationResourceProperty {
        val builder = CfnPrincipalPermissionsDataLocationResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the database object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DatabaseResourceProperty databaseResourceProperty = DatabaseResourceProperty.builder()
     * .catalogId("catalogId")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-databaseresource.html)
     */
    public inline fun cfnPrincipalPermissionsDatabaseResourceProperty(
        block: CfnPrincipalPermissionsDatabaseResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.DatabaseResourceProperty {
        val builder = CfnPrincipalPermissionsDatabaseResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure containing an LF-tag key and values for a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * LFTagKeyResourceProperty lFTagKeyResourceProperty = LFTagKeyResourceProperty.builder()
     * .catalogId("catalogId")
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html)
     */
    public inline fun cfnPrincipalPermissionsLFTagKeyResourceProperty(
        block: CfnPrincipalPermissionsLFTagKeyResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.LFTagKeyResourceProperty {
        val builder = CfnPrincipalPermissionsLFTagKeyResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of LF-tag conditions that define a resource's LF-tag policy.
     *
     * A structure that allows an admin to grant user permissions on certain conditions. For
     * example, granting a role access to all columns that do not have the LF-tag 'PII' in tables
     * that have the LF-tag 'Prod'.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * LFTagPolicyResourceProperty lFTagPolicyResourceProperty = LFTagPolicyResourceProperty.builder()
     * .catalogId("catalogId")
     * .expression(List.of(LFTagProperty.builder()
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * .build()))
     * .resourceType("resourceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html)
     */
    public inline fun cfnPrincipalPermissionsLFTagPolicyResourceProperty(
        block: CfnPrincipalPermissionsLFTagPolicyResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.LFTagPolicyResourceProperty {
        val builder = CfnPrincipalPermissionsLFTagPolicyResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The LF-tag key and values attached to a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * LFTagProperty lFTagProperty = LFTagProperty.builder()
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftag.html)
     */
    public inline fun cfnPrincipalPermissionsLFTagProperty(
        block: CfnPrincipalPermissionsLFTagPropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.LFTagProperty {
        val builder = CfnPrincipalPermissionsLFTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPrincipalPermissions`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object catalog;
     * Object tableWildcard;
     * CfnPrincipalPermissionsProps cfnPrincipalPermissionsProps =
     * CfnPrincipalPermissionsProps.builder()
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
    public inline fun cfnPrincipalPermissionsProps(
        block: CfnPrincipalPermissionsPropsDsl.() -> Unit = {}
    ): CfnPrincipalPermissionsProps {
        val builder = CfnPrincipalPermissionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the resource.
     *
     * Example:
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html)
     */
    public inline fun cfnPrincipalPermissionsResourceProperty(
        block: CfnPrincipalPermissionsResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.ResourceProperty {
        val builder = CfnPrincipalPermissionsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the table object.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object tableWildcard;
     * TableResourceProperty tableResourceProperty = TableResourceProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * // the properties below are optional
     * .name("name")
     * .tableWildcard(tableWildcard)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html)
     */
    public inline fun cfnPrincipalPermissionsTableResourceProperty(
        block: CfnPrincipalPermissionsTableResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.TableResourceProperty {
        val builder = CfnPrincipalPermissionsTableResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for a table with columns object. This object is only used when granting a SELECT
     * permission.
     *
     * This object must take a value for at least one of `ColumnsNames` , `ColumnsIndexes` , or
     * `ColumnsWildcard` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * TableWithColumnsResourceProperty tableWithColumnsResourceProperty =
     * TableWithColumnsResourceProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .name("name")
     * // the properties below are optional
     * .columnNames(List.of("columnNames"))
     * .columnWildcard(ColumnWildcardProperty.builder()
     * .excludedColumnNames(List.of("excludedColumnNames"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html)
     */
    public inline fun cfnPrincipalPermissionsTableWithColumnsResourceProperty(
        block: CfnPrincipalPermissionsTableWithColumnsResourcePropertyDsl.() -> Unit = {}
    ): CfnPrincipalPermissions.TableWithColumnsResourceProperty {
        val builder = CfnPrincipalPermissionsTableWithColumnsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::LakeFormation::Resource` represents the data ( buckets and folders) that is being
     * registered with AWS Lake Formation .
     *
     * During a stack operation, AWS CloudFormation calls the AWS Lake Formation
     * [`RegisterResource`](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-credential-vending.html#aws-lake-formation-api-credential-vending-RegisterResource)
     * API operation to register the resource. To remove a `Resource` type, AWS CloudFormation calls
     * the AWS Lake Formation
     * [`DeregisterResource`](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-credential-vending.html#aws-lake-formation-api-credential-vending-DeregisterResource)
     * API operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CfnResource cfnResource = CfnResource.Builder.create(this, "MyCfnResource")
     * .resourceArn("resourceArn")
     * .useServiceLinkedRole(false)
     * // the properties below are optional
     * .roleArn("roleArn")
     * .withFederation(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html)
     */
    public inline fun cfnResource(
        scope: Construct,
        id: String,
        block: CfnResourceDsl.() -> Unit = {},
    ): CfnResource {
        val builder = CfnResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CfnResourceProps cfnResourceProps = CfnResourceProps.builder()
     * .resourceArn("resourceArn")
     * .useServiceLinkedRole(false)
     * // the properties below are optional
     * .roleArn("roleArn")
     * .withFederation(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html)
     */
    public inline fun cfnResourceProps(
        block: CfnResourcePropsDsl.() -> Unit = {}
    ): CfnResourceProps {
        val builder = CfnResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::LakeFormation::Tag` resource represents an LF-tag, which consists of a key and one
     * or more possible values for the key.
     *
     * During a stack operation, AWS CloudFormation calls the AWS Lake Formation `CreateLFTag` API
     * to create a tag, and `UpdateLFTag` API to update a tag resource, and a `DeleteLFTag` to
     * delete it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CfnTag cfnTag = CfnTag.Builder.create(this, "MyCfnTag")
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * // the properties below are optional
     * .catalogId("catalogId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html)
     */
    public inline fun cfnTag(
        scope: Construct,
        id: String,
        block: CfnTagDsl.() -> Unit = {},
    ): CfnTag {
        val builder = CfnTagDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::LakeFormation::TagAssociation` resource represents an assignment of an LF-tag to a
     * Data Catalog resource (database, table, or column).
     *
     * During a stack operation, CloudFormation calls AWS Lake Formation `AddLFTagsToResource` API
     * to create a `TagAssociation` resource and calls the `RemoveLFTagsToResource` API to delete
     * it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object catalog;
     * Object tableWildcard;
     * CfnTagAssociation cfnTagAssociation = CfnTagAssociation.Builder.create(this,
     * "MyCfnTagAssociation")
     * .lfTags(List.of(LFTagPairProperty.builder()
     * .catalogId("catalogId")
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * .build()))
     * .resource(ResourceProperty.builder()
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
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html)
     */
    public inline fun cfnTagAssociation(
        scope: Construct,
        id: String,
        block: CfnTagAssociationDsl.() -> Unit = {},
    ): CfnTagAssociation {
        val builder = CfnTagAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the database object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * DatabaseResourceProperty databaseResourceProperty = DatabaseResourceProperty.builder()
     * .catalogId("catalogId")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-databaseresource.html)
     */
    public inline fun cfnTagAssociationDatabaseResourceProperty(
        block: CfnTagAssociationDatabaseResourcePropertyDsl.() -> Unit = {}
    ): CfnTagAssociation.DatabaseResourceProperty {
        val builder = CfnTagAssociationDatabaseResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure containing the catalog ID, tag key, and tag values of an LF-tag key-value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * LFTagPairProperty lFTagPairProperty = LFTagPairProperty.builder()
     * .catalogId("catalogId")
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html)
     */
    public inline fun cfnTagAssociationLFTagPairProperty(
        block: CfnTagAssociationLFTagPairPropertyDsl.() -> Unit = {}
    ): CfnTagAssociation.LFTagPairProperty {
        val builder = CfnTagAssociationLFTagPairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTagAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object catalog;
     * Object tableWildcard;
     * CfnTagAssociationProps cfnTagAssociationProps = CfnTagAssociationProps.builder()
     * .lfTags(List.of(LFTagPairProperty.builder()
     * .catalogId("catalogId")
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * .build()))
     * .resource(ResourceProperty.builder()
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
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html)
     */
    public inline fun cfnTagAssociationProps(
        block: CfnTagAssociationPropsDsl.() -> Unit = {}
    ): CfnTagAssociationProps {
        val builder = CfnTagAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the resource.
     *
     * Example:
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
    public inline fun cfnTagAssociationResourceProperty(
        block: CfnTagAssociationResourcePropertyDsl.() -> Unit = {}
    ): CfnTagAssociation.ResourceProperty {
        val builder = CfnTagAssociationResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for the table object.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * Object tableWildcard;
     * TableResourceProperty tableResourceProperty = TableResourceProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * // the properties below are optional
     * .name("name")
     * .tableWildcard(tableWildcard)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html)
     */
    public inline fun cfnTagAssociationTableResourceProperty(
        block: CfnTagAssociationTableResourcePropertyDsl.() -> Unit = {}
    ): CfnTagAssociation.TableResourceProperty {
        val builder = CfnTagAssociationTableResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure for a table with columns object. This object is only used when granting a SELECT
     * permission.
     *
     * This object must take a value for at least one of `ColumnsNames` , `ColumnsIndexes` , or
     * `ColumnsWildcard` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * TableWithColumnsResourceProperty tableWithColumnsResourceProperty =
     * TableWithColumnsResourceProperty.builder()
     * .catalogId("catalogId")
     * .columnNames(List.of("columnNames"))
     * .databaseName("databaseName")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html)
     */
    public inline fun cfnTagAssociationTableWithColumnsResourceProperty(
        block: CfnTagAssociationTableWithColumnsResourcePropertyDsl.() -> Unit = {}
    ): CfnTagAssociation.TableWithColumnsResourceProperty {
        val builder = CfnTagAssociationTableWithColumnsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTag`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lakeformation.*;
     * CfnTagProps cfnTagProps = CfnTagProps.builder()
     * .tagKey("tagKey")
     * .tagValues(List.of("tagValues"))
     * // the properties below are optional
     * .catalogId("catalogId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html)
     */
    public inline fun cfnTagProps(block: CfnTagPropsDsl.() -> Unit = {}): CfnTagProps {
        val builder = CfnTagPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
