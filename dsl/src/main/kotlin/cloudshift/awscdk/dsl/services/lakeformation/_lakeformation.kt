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
import kotlin.String
import kotlin.Unit

public object lakeformation {
    public inline fun cfnDataCellsFilter(
        scope: Construct,
        id: String,
        block: CfnDataCellsFilterDsl.() -> Unit = {},
    ): CfnDataCellsFilter {
        val builder = CfnDataCellsFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCellsFilterColumnWildcardProperty(
        block: CfnDataCellsFilterColumnWildcardPropertyDsl.() -> Unit =
            {},
    ): CfnDataCellsFilter.ColumnWildcardProperty {
        val builder = CfnDataCellsFilterColumnWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCellsFilterProps(block: CfnDataCellsFilterPropsDsl.() -> Unit = {}): CfnDataCellsFilterProps {
        val builder = CfnDataCellsFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCellsFilterRowFilterProperty(
        block: CfnDataCellsFilterRowFilterPropertyDsl.() -> Unit =
            {},
    ): CfnDataCellsFilter.RowFilterProperty {
        val builder = CfnDataCellsFilterRowFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettings(
        scope: Construct,
        id: String,
        block: CfnDataLakeSettingsDsl.() -> Unit = {},
    ): CfnDataLakeSettings {
        val builder = CfnDataLakeSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettingsAdminsProperty(
        block: CfnDataLakeSettingsAdminsPropertyDsl.() -> Unit =
            {},
    ): CfnDataLakeSettings.AdminsProperty {
        val builder = CfnDataLakeSettingsAdminsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettingsCreateDatabaseDefaultPermissionsProperty(
        block: CfnDataLakeSettingsCreateDatabaseDefaultPermissionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataLakeSettings.CreateDatabaseDefaultPermissionsProperty {
        val builder = CfnDataLakeSettingsCreateDatabaseDefaultPermissionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettingsCreateTableDefaultPermissionsProperty(
        block: CfnDataLakeSettingsCreateTableDefaultPermissionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataLakeSettings.CreateTableDefaultPermissionsProperty {
        val builder = CfnDataLakeSettingsCreateTableDefaultPermissionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettingsDataLakePrincipalProperty(
        block: CfnDataLakeSettingsDataLakePrincipalPropertyDsl.() -> Unit =
            {},
    ): CfnDataLakeSettings.DataLakePrincipalProperty {
        val builder = CfnDataLakeSettingsDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettingsExternalDataFilteringAllowListProperty(
        block: CfnDataLakeSettingsExternalDataFilteringAllowListPropertyDsl.() -> Unit =
            {},
    ): CfnDataLakeSettings.ExternalDataFilteringAllowListProperty {
        val builder = CfnDataLakeSettingsExternalDataFilteringAllowListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettingsPrincipalPermissionsProperty(
        block: CfnDataLakeSettingsPrincipalPermissionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataLakeSettings.PrincipalPermissionsProperty {
        val builder = CfnDataLakeSettingsPrincipalPermissionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataLakeSettingsProps(block: CfnDataLakeSettingsPropsDsl.() -> Unit = {}): CfnDataLakeSettingsProps {
        val builder = CfnDataLakeSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissions(
        scope: Construct,
        id: String,
        block: CfnPermissionsDsl.() -> Unit = {},
    ): CfnPermissions {
        val builder = CfnPermissionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsColumnWildcardProperty(
        block: CfnPermissionsColumnWildcardPropertyDsl.() -> Unit =
            {},
    ): CfnPermissions.ColumnWildcardProperty {
        val builder = CfnPermissionsColumnWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsDataLakePrincipalProperty(
        block: CfnPermissionsDataLakePrincipalPropertyDsl.() -> Unit =
            {},
    ): CfnPermissions.DataLakePrincipalProperty {
        val builder = CfnPermissionsDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsDataLocationResourceProperty(
        block: CfnPermissionsDataLocationResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPermissions.DataLocationResourceProperty {
        val builder = CfnPermissionsDataLocationResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsDatabaseResourceProperty(
        block: CfnPermissionsDatabaseResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPermissions.DatabaseResourceProperty {
        val builder = CfnPermissionsDatabaseResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsProps(block: CfnPermissionsPropsDsl.() -> Unit = {}): CfnPermissionsProps {
        val builder = CfnPermissionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsResourceProperty(
        block: CfnPermissionsResourcePropertyDsl.() -> Unit = {
        },
    ): CfnPermissions.ResourceProperty {
        val builder = CfnPermissionsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsTableResourceProperty(
        block: CfnPermissionsTableResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPermissions.TableResourceProperty {
        val builder = CfnPermissionsTableResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsTableWildcardProperty(
        block: CfnPermissionsTableWildcardPropertyDsl.() -> Unit =
            {},
    ): CfnPermissions.TableWildcardProperty {
        val builder = CfnPermissionsTableWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPermissionsTableWithColumnsResourceProperty(
        block: CfnPermissionsTableWithColumnsResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPermissions.TableWithColumnsResourceProperty {
        val builder = CfnPermissionsTableWithColumnsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissions(
        scope: Construct,
        id: String,
        block: CfnPrincipalPermissionsDsl.() -> Unit = {},
    ): CfnPrincipalPermissions {
        val builder = CfnPrincipalPermissionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsColumnWildcardProperty(
        block: CfnPrincipalPermissionsColumnWildcardPropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.ColumnWildcardProperty {
        val builder = CfnPrincipalPermissionsColumnWildcardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsDataCellsFilterResourceProperty(
        block: CfnPrincipalPermissionsDataCellsFilterResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.DataCellsFilterResourceProperty {
        val builder = CfnPrincipalPermissionsDataCellsFilterResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsDataLakePrincipalProperty(
        block: CfnPrincipalPermissionsDataLakePrincipalPropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.DataLakePrincipalProperty {
        val builder = CfnPrincipalPermissionsDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsDataLocationResourceProperty(
        block: CfnPrincipalPermissionsDataLocationResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.DataLocationResourceProperty {
        val builder = CfnPrincipalPermissionsDataLocationResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsDatabaseResourceProperty(
        block: CfnPrincipalPermissionsDatabaseResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.DatabaseResourceProperty {
        val builder = CfnPrincipalPermissionsDatabaseResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsLFTagKeyResourceProperty(
        block: CfnPrincipalPermissionsLFTagKeyResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.LFTagKeyResourceProperty {
        val builder = CfnPrincipalPermissionsLFTagKeyResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsLFTagPolicyResourceProperty(
        block: CfnPrincipalPermissionsLFTagPolicyResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.LFTagPolicyResourceProperty {
        val builder = CfnPrincipalPermissionsLFTagPolicyResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsLFTagProperty(
        block: CfnPrincipalPermissionsLFTagPropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.LFTagProperty {
        val builder = CfnPrincipalPermissionsLFTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsProps(
        block: CfnPrincipalPermissionsPropsDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissionsProps {
        val builder = CfnPrincipalPermissionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsResourceProperty(
        block: CfnPrincipalPermissionsResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.ResourceProperty {
        val builder = CfnPrincipalPermissionsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsTableResourceProperty(
        block: CfnPrincipalPermissionsTableResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.TableResourceProperty {
        val builder = CfnPrincipalPermissionsTableResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrincipalPermissionsTableWithColumnsResourceProperty(
        block: CfnPrincipalPermissionsTableWithColumnsResourcePropertyDsl.() -> Unit =
            {},
    ): CfnPrincipalPermissions.TableWithColumnsResourceProperty {
        val builder = CfnPrincipalPermissionsTableWithColumnsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResource(
        scope: Construct,
        id: String,
        block: CfnResourceDsl.() -> Unit = {},
    ): CfnResource {
        val builder = CfnResourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourceProps(block: CfnResourcePropsDsl.() -> Unit = {}): CfnResourceProps {
        val builder = CfnResourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTag(
        scope: Construct,
        id: String,
        block: CfnTagDsl.() -> Unit = {},
    ): CfnTag {
        val builder = CfnTagDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagAssociation(
        scope: Construct,
        id: String,
        block: CfnTagAssociationDsl.() -> Unit = {},
    ): CfnTagAssociation {
        val builder = CfnTagAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagAssociationDatabaseResourceProperty(
        block: CfnTagAssociationDatabaseResourcePropertyDsl.() -> Unit =
            {},
    ): CfnTagAssociation.DatabaseResourceProperty {
        val builder = CfnTagAssociationDatabaseResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagAssociationLFTagPairProperty(
        block: CfnTagAssociationLFTagPairPropertyDsl.() -> Unit =
            {},
    ): CfnTagAssociation.LFTagPairProperty {
        val builder = CfnTagAssociationLFTagPairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagAssociationProps(block: CfnTagAssociationPropsDsl.() -> Unit = {}): CfnTagAssociationProps {
        val builder = CfnTagAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagAssociationResourceProperty(
        block: CfnTagAssociationResourcePropertyDsl.() -> Unit =
            {},
    ): CfnTagAssociation.ResourceProperty {
        val builder = CfnTagAssociationResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagAssociationTableResourceProperty(
        block: CfnTagAssociationTableResourcePropertyDsl.() -> Unit =
            {},
    ): CfnTagAssociation.TableResourceProperty {
        val builder = CfnTagAssociationTableResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagAssociationTableWithColumnsResourceProperty(
        block: CfnTagAssociationTableWithColumnsResourcePropertyDsl.() -> Unit =
            {},
    ): CfnTagAssociation.TableWithColumnsResourceProperty {
        val builder = CfnTagAssociationTableWithColumnsResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagProps(block: CfnTagPropsDsl.() -> Unit = {}): CfnTagProps {
        val builder = CfnTagPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
