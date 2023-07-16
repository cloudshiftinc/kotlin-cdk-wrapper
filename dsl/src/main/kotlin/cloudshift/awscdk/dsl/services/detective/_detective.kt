@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.detective

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.detective.CfnGraph
import software.amazon.awscdk.services.detective.CfnGraphProps
import software.amazon.awscdk.services.detective.CfnMemberInvitation
import software.amazon.awscdk.services.detective.CfnMemberInvitationProps
import software.amazon.awscdk.services.detective.CfnOrganizationAdmin
import software.amazon.awscdk.services.detective.CfnOrganizationAdminProps
import software.constructs.Construct

public object detective {
  public inline fun cfnGraph(
    scope: Construct,
    id: String,
    block: CfnGraphDsl.() -> Unit = {},
  ): CfnGraph {
    val builder = CfnGraphDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGraphProps(block: CfnGraphPropsDsl.() -> Unit = {}): CfnGraphProps {
    val builder = CfnGraphPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMemberInvitation(
    scope: Construct,
    id: String,
    block: CfnMemberInvitationDsl.() -> Unit = {},
  ): CfnMemberInvitation {
    val builder = CfnMemberInvitationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMemberInvitationProps(block: CfnMemberInvitationPropsDsl.() -> Unit = {}):
      CfnMemberInvitationProps {
    val builder = CfnMemberInvitationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganizationAdmin(
    scope: Construct,
    id: String,
    block: CfnOrganizationAdminDsl.() -> Unit = {},
  ): CfnOrganizationAdmin {
    val builder = CfnOrganizationAdminDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganizationAdminProps(block: CfnOrganizationAdminPropsDsl.() -> Unit = {}):
      CfnOrganizationAdminProps {
    val builder = CfnOrganizationAdminPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
