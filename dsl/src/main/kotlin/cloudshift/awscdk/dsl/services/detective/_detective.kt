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
  /**
   * The `AWS::Detective::Graph` resource is an Amazon Detective resource type that creates a
   * Detective behavior graph.
   *
   * The requesting account becomes the administrator account for the behavior graph.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.detective.*;
   * CfnGraph cfnGraph = CfnGraph.Builder.create(this, "MyCfnGraph")
   * .autoEnableMembers(false)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html)
   */
  public inline fun cfnGraph(
    scope: Construct,
    id: String,
    block: CfnGraphDsl.() -> Unit = {},
  ): CfnGraph {
    val builder = CfnGraphDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnGraph`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.detective.*;
   * CfnGraphProps cfnGraphProps = CfnGraphProps.builder()
   * .autoEnableMembers(false)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html)
   */
  public inline fun cfnGraphProps(block: CfnGraphPropsDsl.() -> Unit = {}): CfnGraphProps {
    val builder = CfnGraphPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Detective::MemberInvitation` resource is an Amazon Detective resource type that
   * creates an invitation to join a Detective behavior graph.
   *
   * The administrator account can choose whether to send an email notification of the invitation to
   * the root user email address of the AWS account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.detective.*;
   * CfnMemberInvitation cfnMemberInvitation = CfnMemberInvitation.Builder.create(this,
   * "MyCfnMemberInvitation")
   * .graphArn("graphArn")
   * .memberEmailAddress("memberEmailAddress")
   * .memberId("memberId")
   * // the properties below are optional
   * .disableEmailNotification(false)
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html)
   */
  public inline fun cfnMemberInvitation(
    scope: Construct,
    id: String,
    block: CfnMemberInvitationDsl.() -> Unit = {},
  ): CfnMemberInvitation {
    val builder = CfnMemberInvitationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnMemberInvitation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.detective.*;
   * CfnMemberInvitationProps cfnMemberInvitationProps = CfnMemberInvitationProps.builder()
   * .graphArn("graphArn")
   * .memberEmailAddress("memberEmailAddress")
   * .memberId("memberId")
   * // the properties below are optional
   * .disableEmailNotification(false)
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html)
   */
  public inline fun cfnMemberInvitationProps(block: CfnMemberInvitationPropsDsl.() -> Unit = {}):
      CfnMemberInvitationProps {
    val builder = CfnMemberInvitationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Detective::OrganizationAdmin` resource is an Amazon Detective resource type that
   * designates the Detective administrator account for the organization in the current region.
   *
   * If the account does not have Detective enabled, then this resource enables Detective for that
   * account and creates a new behavior graph.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.detective.*;
   * CfnOrganizationAdmin cfnOrganizationAdmin = CfnOrganizationAdmin.Builder.create(this,
   * "MyCfnOrganizationAdmin")
   * .accountId("accountId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
   */
  public inline fun cfnOrganizationAdmin(
    scope: Construct,
    id: String,
    block: CfnOrganizationAdminDsl.() -> Unit = {},
  ): CfnOrganizationAdmin {
    val builder = CfnOrganizationAdminDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnOrganizationAdmin`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.detective.*;
   * CfnOrganizationAdminProps cfnOrganizationAdminProps = CfnOrganizationAdminProps.builder()
   * .accountId("accountId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
   */
  public inline fun cfnOrganizationAdminProps(block: CfnOrganizationAdminPropsDsl.() -> Unit = {}):
      CfnOrganizationAdminProps {
    val builder = CfnOrganizationAdminPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
