@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.grafana.CfnWorkspace
import software.amazon.awscdk.services.grafana.CfnWorkspaceProps

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.grafana.*;
 * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
 * .accountAccessType("accountAccessType")
 * .authenticationProviders(List.of("authenticationProviders"))
 * .permissionType("permissionType")
 * // the properties below are optional
 * .clientToken("clientToken")
 * .dataSources(List.of("dataSources"))
 * .description("description")
 * .grafanaVersion("grafanaVersion")
 * .name("name")
 * .networkAccessControl(NetworkAccessControlProperty.builder()
 * .prefixListIds(List.of("prefixListIds"))
 * .vpceIds(List.of("vpceIds"))
 * .build())
 * .notificationDestinations(List.of("notificationDestinations"))
 * .organizationalUnits(List.of("organizationalUnits"))
 * .organizationRoleName("organizationRoleName")
 * .roleArn("roleArn")
 * .samlConfiguration(SamlConfigurationProperty.builder()
 * .idpMetadata(IdpMetadataProperty.builder()
 * .url("url")
 * .xml("xml")
 * .build())
 * // the properties below are optional
 * .allowedOrganizations(List.of("allowedOrganizations"))
 * .assertionAttributes(AssertionAttributesProperty.builder()
 * .email("email")
 * .groups("groups")
 * .login("login")
 * .name("name")
 * .org("org")
 * .role("role")
 * .build())
 * .loginValidityDuration(123)
 * .roleValues(RoleValuesProperty.builder()
 * .admin(List.of("admin"))
 * .editor(List.of("editor"))
 * .build())
 * .build())
 * .stackSetName("stackSetName")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html)
 */
@CdkDslMarker
public class CfnWorkspacePropsDsl {
  private val cdkBuilder: CfnWorkspaceProps.Builder = CfnWorkspaceProps.builder()

  private val _authenticationProviders: MutableList<String> = mutableListOf()

  private val _dataSources: MutableList<String> = mutableListOf()

  private val _notificationDestinations: MutableList<String> = mutableListOf()

  private val _organizationalUnits: MutableList<String> = mutableListOf()

  /**
   * @param accountAccessType Specifies whether the workspace can access AWS resources in this AWS
   * account only, or whether it can also access AWS resources in other accounts in the same
   * organization. 
   * If this is `ORGANIZATION` , the `OrganizationalUnits` parameter specifies which organizational
   * units the workspace can access.
   */
  public fun accountAccessType(accountAccessType: String) {
    cdkBuilder.accountAccessType(accountAccessType)
  }

  /**
   * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM Identity
   * Center (successor to AWS Single Sign-On) , or both to authenticate users for using the Grafana
   * console within a workspace. For more information, see [User authentication in Amazon Managed
   * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
   */
  public fun authenticationProviders(vararg authenticationProviders: String) {
    _authenticationProviders.addAll(listOf(*authenticationProviders))
  }

  /**
   * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM Identity
   * Center (successor to AWS Single Sign-On) , or both to authenticate users for using the Grafana
   * console within a workspace. For more information, see [User authentication in Amazon Managed
   * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
   */
  public fun authenticationProviders(authenticationProviders: Collection<String>) {
    _authenticationProviders.addAll(authenticationProviders)
  }

  /**
   * @param clientToken A unique, case-sensitive, user-provided identifier to ensure the idempotency
   * of the request.
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
   * and permissions created to allow Amazon Managed Grafana to read data from these sources.
   * This list is only used when the workspace was created through the AWS console, and the
   * `permissionType` is `SERVICE_MANAGED` .
   */
  public fun dataSources(vararg dataSources: String) {
    _dataSources.addAll(listOf(*dataSources))
  }

  /**
   * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
   * and permissions created to allow Amazon Managed Grafana to read data from these sources.
   * This list is only used when the workspace was created through the AWS console, and the
   * `permissionType` is `SERVICE_MANAGED` .
   */
  public fun dataSources(dataSources: Collection<String>) {
    _dataSources.addAll(dataSources)
  }

  /**
   * @param description The user-defined description of the workspace.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param grafanaVersion Specifies the version of Grafana to support in the new workspace.
   * Supported values are `8.4` and `9.4` .
   */
  public fun grafanaVersion(grafanaVersion: String) {
    cdkBuilder.grafanaVersion(grafanaVersion)
  }

  /**
   * @param name The name of the workspace.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param networkAccessControl The configuration settings for network access to your workspace.
   */
  public fun networkAccessControl(networkAccessControl: IResolvable) {
    cdkBuilder.networkAccessControl(networkAccessControl)
  }

  /**
   * @param networkAccessControl The configuration settings for network access to your workspace.
   */
  public fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty) {
    cdkBuilder.networkAccessControl(networkAccessControl)
  }

  /**
   * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
   * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
   * channels.
   */
  public fun notificationDestinations(vararg notificationDestinations: String) {
    _notificationDestinations.addAll(listOf(*notificationDestinations))
  }

  /**
   * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
   * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
   * channels.
   */
  public fun notificationDestinations(notificationDestinations: Collection<String>) {
    _notificationDestinations.addAll(notificationDestinations)
  }

  /**
   * @param organizationRoleName The name of the IAM role that is used to access resources through
   * Organizations .
   */
  public fun organizationRoleName(organizationRoleName: String) {
    cdkBuilder.organizationRoleName(organizationRoleName)
  }

  /**
   * @param organizationalUnits Specifies the organizational units that this workspace is allowed to
   * use data sources from, if this workspace is in an account that is part of an organization.
   */
  public fun organizationalUnits(vararg organizationalUnits: String) {
    _organizationalUnits.addAll(listOf(*organizationalUnits))
  }

  /**
   * @param organizationalUnits Specifies the organizational units that this workspace is allowed to
   * use data sources from, if this workspace is in an account that is part of an organization.
   */
  public fun organizationalUnits(organizationalUnits: Collection<String>) {
    _organizationalUnits.addAll(organizationalUnits)
  }

  /**
   * @param permissionType If this is `SERVICE_MANAGED` , and the workplace was created through the
   * Amazon Managed Grafana console, then Amazon Managed Grafana automatically creates the IAM roles
   * and provisions the permissions that the workspace needs to use AWS data sources and notification
   * channels. 
   * If this is `CUSTOMER_MANAGED` , you must manage those roles and permissions yourself.
   *
   * If you are working with a workspace in a member account of an organization and that account is
   * not a delegated administrator account, and you want the workspace to access data sources in other
   * AWS accounts in the organization, this parameter must be set to `CUSTOMER_MANAGED` .
   *
   * For more information about converting between customer and service managed, see [Managing
   * permissions for data sources and notification
   * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html)
   * . For more information about the roles and permissions that must be managed for customer managed
   * workspaces, see [Amazon Managed Grafana permissions and policies for AWS data sources and
   * notification
   * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html)
   */
  public fun permissionType(permissionType: String) {
    cdkBuilder.permissionType(permissionType)
  }

  /**
   * @param roleArn The IAM role that grants permissions to the AWS resources that the workspace
   * will view data from.
   * This role must already exist.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
   * attributes to workspace user information and define which groups in the assertion attribute are to
   * have the `Admin` and `Editor` roles in the workspace.
   */
  public fun samlConfiguration(samlConfiguration: IResolvable) {
    cdkBuilder.samlConfiguration(samlConfiguration)
  }

  /**
   * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
   * attributes to workspace user information and define which groups in the assertion attribute are to
   * have the `Admin` and `Editor` roles in the workspace.
   */
  public fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty) {
    cdkBuilder.samlConfiguration(samlConfiguration)
  }

  /**
   * @param stackSetName The name of the AWS CloudFormation stack set that is used to generate IAM
   * roles to be used for this workspace.
   */
  public fun stackSetName(stackSetName: String) {
    cdkBuilder.stackSetName(stackSetName)
  }

  /**
   * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data sources
   * for your Grafana workspace to connect to.
   *
   * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
   * (ap-northeast-2).
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data sources
   * for your Grafana workspace to connect to.
   *
   * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
   * (ap-northeast-2).
   */
  public fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnWorkspaceProps {
    if(_authenticationProviders.isNotEmpty())
        cdkBuilder.authenticationProviders(_authenticationProviders)
    if(_dataSources.isNotEmpty()) cdkBuilder.dataSources(_dataSources)
    if(_notificationDestinations.isNotEmpty())
        cdkBuilder.notificationDestinations(_notificationDestinations)
    if(_organizationalUnits.isNotEmpty()) cdkBuilder.organizationalUnits(_organizationalUnits)
    return cdkBuilder.build()
  }
}
