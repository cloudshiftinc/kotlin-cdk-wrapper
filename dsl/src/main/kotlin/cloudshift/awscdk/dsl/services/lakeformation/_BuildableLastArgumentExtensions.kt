@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.amazon.awscdk.services.lakeformation.CfnResource
import software.amazon.awscdk.services.lakeformation.CfnTag
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation

public inline fun CfnDataCellsFilter.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDataCellsFilter.setColumnWildcard(block: CfnDataCellsFilterColumnWildcardPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataCellsFilterColumnWildcardPropertyDsl()
  builder.apply(block)
  return setColumnWildcard(builder.build())
}

public inline
    fun CfnDataCellsFilter.setRowFilter(block: CfnDataCellsFilterRowFilterPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDataCellsFilterRowFilterPropertyDsl()
  builder.apply(block)
  return setRowFilter(builder.build())
}

public inline fun CfnDataLakeSettings.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPermissions.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPermissions.setDataLakePrincipal(block: CfnPermissionsDataLakePrincipalPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPermissionsDataLakePrincipalPropertyDsl()
  builder.apply(block)
  return setDataLakePrincipal(builder.build())
}

public inline fun CfnPermissions.setResource(block: CfnPermissionsResourcePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnPermissionsResourcePropertyDsl()
  builder.apply(block)
  return setResource(builder.build())
}

public inline fun CfnPrincipalPermissions.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPrincipalPermissions.setPrincipal(block: CfnPrincipalPermissionsDataLakePrincipalPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPrincipalPermissionsDataLakePrincipalPropertyDsl()
  builder.apply(block)
  return setPrincipal(builder.build())
}

public inline
    fun CfnPrincipalPermissions.setResource(block: CfnPrincipalPermissionsResourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPrincipalPermissionsResourcePropertyDsl()
  builder.apply(block)
  return setResource(builder.build())
}

public inline fun CfnResource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTag.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTagAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTagAssociation.setResource(block: CfnTagAssociationResourcePropertyDsl.() -> Unit = {}) {
  val builder = CfnTagAssociationResourcePropertyDsl()
  builder.apply(block)
  return setResource(builder.build())
}
