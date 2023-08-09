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

import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation

/** A wildcard with exclusions. */
public inline fun CfnDataCellsFilter.setColumnWildcard(
    block: CfnDataCellsFilterColumnWildcardPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataCellsFilterColumnWildcardPropertyDsl()
    builder.apply(block)
    return setColumnWildcard(builder.build())
}

/** A PartiQL predicate. */
public inline fun CfnDataCellsFilter.setRowFilter(
    block: CfnDataCellsFilterRowFilterPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataCellsFilterRowFilterPropertyDsl()
    builder.apply(block)
    return setRowFilter(builder.build())
}

/** The AWS Lake Formation principal. */
public inline fun CfnPermissions.setDataLakePrincipal(
    block: CfnPermissionsDataLakePrincipalPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPermissionsDataLakePrincipalPropertyDsl()
    builder.apply(block)
    return setDataLakePrincipal(builder.build())
}

/** A structure for the resource. */
public inline fun CfnPermissions.setResource(
    block: CfnPermissionsResourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPermissionsResourcePropertyDsl()
    builder.apply(block)
    return setResource(builder.build())
}

/** The principal to be granted a permission. */
public inline fun CfnPrincipalPermissions.setPrincipal(
    block: CfnPrincipalPermissionsDataLakePrincipalPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPrincipalPermissionsDataLakePrincipalPropertyDsl()
    builder.apply(block)
    return setPrincipal(builder.build())
}

/** The resource to be granted or revoked permissions. */
public inline fun CfnPrincipalPermissions.setResource(
    block: CfnPrincipalPermissionsResourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPrincipalPermissionsResourcePropertyDsl()
    builder.apply(block)
    return setResource(builder.build())
}

/** UTF-8 string (valid values: `DATABASE | TABLE` ). */
public inline fun CfnTagAssociation.setResource(
    block: CfnTagAssociationResourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnTagAssociationResourcePropertyDsl()
    builder.apply(block)
    return setResource(builder.build())
}
