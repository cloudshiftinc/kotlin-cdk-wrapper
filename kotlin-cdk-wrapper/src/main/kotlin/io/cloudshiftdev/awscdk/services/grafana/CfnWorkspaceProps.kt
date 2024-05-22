@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.grafana

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.grafana.*;
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
 * .pluginAdminEnabled(false)
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
public interface CfnWorkspaceProps {
  /**
   * Specifies whether the workspace can access AWS resources in this AWS account only, or whether
   * it can also access AWS resources in other accounts in the same organization.
   *
   * If this is `ORGANIZATION` , the `OrganizationalUnits` parameter specifies which organizational
   * units the workspace can access.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-accountaccesstype)
   */
  public fun accountAccessType(): String

  /**
   * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
   * authenticate users for using the Grafana console within a workspace. For more information, see
   * [User authentication in Amazon Managed
   * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-authenticationproviders)
   */
  public fun authenticationProviders(): List<String>

  /**
   * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Specifies the AWS data sources that have been configured to have IAM roles and permissions
   * created to allow Amazon Managed Grafana to read data from these sources.
   *
   * This list is only used when the workspace was created through the AWS console, and the
   * `permissionType` is `SERVICE_MANAGED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-datasources)
   */
  public fun dataSources(): List<String> = unwrap(this).getDataSources() ?: emptyList()

  /**
   * The user-defined description of the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies the version of Grafana to support in the workspace.
   *
   * Defaults to the latest version on create (for example, 9.4), or the current version of the
   * workspace on update.
   *
   * Can only be used to upgrade (for example, from 8.4 to 9.4), not downgrade (for example, from
   * 9.4 to 8.4).
   *
   * To know what versions are available to upgrade to for a specific workspace, see the
   * [ListVersions](https://docs.aws.amazon.com/grafana/latest/APIReference/API_ListVersions.html)
   * operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-grafanaversion)
   */
  public fun grafanaVersion(): String? = unwrap(this).getGrafanaVersion()

  /**
   * The name of the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The configuration settings for network access to your workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
   */
  public fun networkAccessControl(): Any? = unwrap(this).getNetworkAccessControl()

  /**
   * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
   * and permissions for, to allow Amazon Managed Grafana to use these channels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-notificationdestinations)
   */
  public fun notificationDestinations(): List<String> = unwrap(this).getNotificationDestinations()
      ?: emptyList()

  /**
   * The name of the IAM role that is used to access resources through Organizations .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationrolename)
   */
  public fun organizationRoleName(): String? = unwrap(this).getOrganizationRoleName()

  /**
   * Specifies the organizational units that this workspace is allowed to use data sources from, if
   * this workspace is in an account that is part of an organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationalunits)
   */
  public fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
      emptyList()

  /**
   * If this is `SERVICE_MANAGED` , and the workplace was created through the Amazon Managed Grafana
   * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the
   * permissions that the workspace needs to use AWS data sources and notification channels.
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-permissiontype)
   */
  public fun permissionType(): String

  /**
   * Whether plugin administration is enabled in the workspace.
   *
   * Setting to `true` allows workspace admins to install, uninstall, and update plugins from within
   * the Grafana workspace.
   *
   *
   * This option is only valid for workspaces that support Grafana version 9 or newer.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-pluginadminenabled)
   */
  public fun pluginAdminEnabled(): Any? = unwrap(this).getPluginAdminEnabled()

  /**
   * The IAM role that grants permissions to the AWS resources that the workspace will view data
   * from.
   *
   * This role must already exist.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
   * user information and define which groups in the assertion attribute are to have the `Admin` and
   * `Editor` roles in the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
   */
  public fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()

  /**
   * The name of the AWS CloudFormation stack set that is used to generate IAM roles to be used for
   * this workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-stacksetname)
   */
  public fun stackSetName(): String? = unwrap(this).getStackSetName()

  /**
   * The configuration settings for an Amazon VPC that contains data sources for your Grafana
   * workspace to connect to.
   *
   *
   * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
   * (ap-northeast-2).
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-vpcconfiguration)
   */
  public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * A builder for [CfnWorkspaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountAccessType Specifies whether the workspace can access AWS resources in this AWS
     * account only, or whether it can also access AWS resources in other accounts in the same
     * organization. 
     * If this is `ORGANIZATION` , the `OrganizationalUnits` parameter specifies which
     * organizational units the workspace can access.
     */
    public fun accountAccessType(accountAccessType: String)

    /**
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    public fun authenticationProviders(authenticationProviders: List<String>)

    /**
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    public fun authenticationProviders(vararg authenticationProviders: String)

    /**
     * @param clientToken A unique, case-sensitive, user-provided identifier to ensure the
     * idempotency of the request.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources.
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     */
    public fun dataSources(dataSources: List<String>)

    /**
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources.
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     */
    public fun dataSources(vararg dataSources: String)

    /**
     * @param description The user-defined description of the workspace.
     */
    public fun description(description: String)

    /**
     * @param grafanaVersion Specifies the version of Grafana to support in the workspace.
     * Defaults to the latest version on create (for example, 9.4), or the current version of the
     * workspace on update.
     *
     * Can only be used to upgrade (for example, from 8.4 to 9.4), not downgrade (for example, from
     * 9.4 to 8.4).
     *
     * To know what versions are available to upgrade to for a specific workspace, see the
     * [ListVersions](https://docs.aws.amazon.com/grafana/latest/APIReference/API_ListVersions.html)
     * operation.
     */
    public fun grafanaVersion(grafanaVersion: String)

    /**
     * @param name The name of the workspace.
     */
    public fun name(name: String)

    /**
     * @param networkAccessControl The configuration settings for network access to your workspace.
     */
    public fun networkAccessControl(networkAccessControl: IResolvable)

    /**
     * @param networkAccessControl The configuration settings for network access to your workspace.
     */
    public fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty)

    /**
     * @param networkAccessControl The configuration settings for network access to your workspace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61d78fb24a54dcf54e79e434aae77e826c8c6375fe463f816a7b0b443b3f2a51")
    public
        fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty.Builder.() -> Unit)

    /**
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels.
     */
    public fun notificationDestinations(notificationDestinations: List<String>)

    /**
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels.
     */
    public fun notificationDestinations(vararg notificationDestinations: String)

    /**
     * @param organizationRoleName The name of the IAM role that is used to access resources through
     * Organizations .
     */
    public fun organizationRoleName(organizationRoleName: String)

    /**
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization.
     */
    public fun organizationalUnits(organizationalUnits: List<String>)

    /**
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization.
     */
    public fun organizationalUnits(vararg organizationalUnits: String)

    /**
     * @param permissionType If this is `SERVICE_MANAGED` , and the workplace was created through
     * the Amazon Managed Grafana console, then Amazon Managed Grafana automatically creates the IAM
     * roles and provisions the permissions that the workspace needs to use AWS data sources and
     * notification channels. 
     * If this is `CUSTOMER_MANAGED` , you must manage those roles and permissions yourself.
     *
     * If you are working with a workspace in a member account of an organization and that account
     * is not a delegated administrator account, and you want the workspace to access data sources in
     * other AWS accounts in the organization, this parameter must be set to `CUSTOMER_MANAGED` .
     *
     * For more information about converting between customer and service managed, see [Managing
     * permissions for data sources and notification
     * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html)
     * . For more information about the roles and permissions that must be managed for customer managed
     * workspaces, see [Amazon Managed Grafana permissions and policies for AWS data sources and
     * notification
     * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html)
     */
    public fun permissionType(permissionType: String)

    /**
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace.
     * Setting to `true` allows workspace admins to install, uninstall, and update plugins from
     * within the Grafana workspace.
     *
     *
     * This option is only valid for workspaces that support Grafana version 9 or newer.
     */
    public fun pluginAdminEnabled(pluginAdminEnabled: Boolean)

    /**
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace.
     * Setting to `true` allows workspace admins to install, uninstall, and update plugins from
     * within the Grafana workspace.
     *
     *
     * This option is only valid for workspaces that support Grafana version 9 or newer.
     */
    public fun pluginAdminEnabled(pluginAdminEnabled: IResolvable)

    /**
     * @param roleArn The IAM role that grants permissions to the AWS resources that the workspace
     * will view data from.
     * This role must already exist.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace.
     */
    public fun samlConfiguration(samlConfiguration: IResolvable)

    /**
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace.
     */
    public fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty)

    /**
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("990b1cf24df9062196c8e940da27e0fd5e31f6b1be4d2392c51e91cfbb599cf6")
    public
        fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty.Builder.() -> Unit)

    /**
     * @param stackSetName The name of the AWS CloudFormation stack set that is used to generate IAM
     * roles to be used for this workspace.
     */
    public fun stackSetName(stackSetName: String)

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to.
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to.
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     */
    public fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty)

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to.
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ae53ea929d2fd9619edb5856068b2a18452f07d65de8d8010083d0a130fe1c5")
    public
        fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.grafana.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.grafana.CfnWorkspaceProps.builder()

    /**
     * @param accountAccessType Specifies whether the workspace can access AWS resources in this AWS
     * account only, or whether it can also access AWS resources in other accounts in the same
     * organization. 
     * If this is `ORGANIZATION` , the `OrganizationalUnits` parameter specifies which
     * organizational units the workspace can access.
     */
    override fun accountAccessType(accountAccessType: String) {
      cdkBuilder.accountAccessType(accountAccessType)
    }

    /**
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    override fun authenticationProviders(authenticationProviders: List<String>) {
      cdkBuilder.authenticationProviders(authenticationProviders)
    }

    /**
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    override fun authenticationProviders(vararg authenticationProviders: String): Unit =
        authenticationProviders(authenticationProviders.toList())

    /**
     * @param clientToken A unique, case-sensitive, user-provided identifier to ensure the
     * idempotency of the request.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources.
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     */
    override fun dataSources(dataSources: List<String>) {
      cdkBuilder.dataSources(dataSources)
    }

    /**
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources.
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     */
    override fun dataSources(vararg dataSources: String): Unit = dataSources(dataSources.toList())

    /**
     * @param description The user-defined description of the workspace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param grafanaVersion Specifies the version of Grafana to support in the workspace.
     * Defaults to the latest version on create (for example, 9.4), or the current version of the
     * workspace on update.
     *
     * Can only be used to upgrade (for example, from 8.4 to 9.4), not downgrade (for example, from
     * 9.4 to 8.4).
     *
     * To know what versions are available to upgrade to for a specific workspace, see the
     * [ListVersions](https://docs.aws.amazon.com/grafana/latest/APIReference/API_ListVersions.html)
     * operation.
     */
    override fun grafanaVersion(grafanaVersion: String) {
      cdkBuilder.grafanaVersion(grafanaVersion)
    }

    /**
     * @param name The name of the workspace.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkAccessControl The configuration settings for network access to your workspace.
     */
    override fun networkAccessControl(networkAccessControl: IResolvable) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkAccessControl The configuration settings for network access to your workspace.
     */
    override
        fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(CfnWorkspace.NetworkAccessControlProperty.Companion::unwrap))
    }

    /**
     * @param networkAccessControl The configuration settings for network access to your workspace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61d78fb24a54dcf54e79e434aae77e826c8c6375fe463f816a7b0b443b3f2a51")
    override
        fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty.Builder.() -> Unit):
        Unit = networkAccessControl(CfnWorkspace.NetworkAccessControlProperty(networkAccessControl))

    /**
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels.
     */
    override fun notificationDestinations(notificationDestinations: List<String>) {
      cdkBuilder.notificationDestinations(notificationDestinations)
    }

    /**
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels.
     */
    override fun notificationDestinations(vararg notificationDestinations: String): Unit =
        notificationDestinations(notificationDestinations.toList())

    /**
     * @param organizationRoleName The name of the IAM role that is used to access resources through
     * Organizations .
     */
    override fun organizationRoleName(organizationRoleName: String) {
      cdkBuilder.organizationRoleName(organizationRoleName)
    }

    /**
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization.
     */
    override fun organizationalUnits(organizationalUnits: List<String>) {
      cdkBuilder.organizationalUnits(organizationalUnits)
    }

    /**
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization.
     */
    override fun organizationalUnits(vararg organizationalUnits: String): Unit =
        organizationalUnits(organizationalUnits.toList())

    /**
     * @param permissionType If this is `SERVICE_MANAGED` , and the workplace was created through
     * the Amazon Managed Grafana console, then Amazon Managed Grafana automatically creates the IAM
     * roles and provisions the permissions that the workspace needs to use AWS data sources and
     * notification channels. 
     * If this is `CUSTOMER_MANAGED` , you must manage those roles and permissions yourself.
     *
     * If you are working with a workspace in a member account of an organization and that account
     * is not a delegated administrator account, and you want the workspace to access data sources in
     * other AWS accounts in the organization, this parameter must be set to `CUSTOMER_MANAGED` .
     *
     * For more information about converting between customer and service managed, see [Managing
     * permissions for data sources and notification
     * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html)
     * . For more information about the roles and permissions that must be managed for customer managed
     * workspaces, see [Amazon Managed Grafana permissions and policies for AWS data sources and
     * notification
     * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html)
     */
    override fun permissionType(permissionType: String) {
      cdkBuilder.permissionType(permissionType)
    }

    /**
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace.
     * Setting to `true` allows workspace admins to install, uninstall, and update plugins from
     * within the Grafana workspace.
     *
     *
     * This option is only valid for workspaces that support Grafana version 9 or newer.
     */
    override fun pluginAdminEnabled(pluginAdminEnabled: Boolean) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled)
    }

    /**
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace.
     * Setting to `true` allows workspace admins to install, uninstall, and update plugins from
     * within the Grafana workspace.
     *
     *
     * This option is only valid for workspaces that support Grafana version 9 or newer.
     */
    override fun pluginAdminEnabled(pluginAdminEnabled: IResolvable) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param roleArn The IAM role that grants permissions to the AWS resources that the workspace
     * will view data from.
     * This role must already exist.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace.
     */
    override fun samlConfiguration(samlConfiguration: IResolvable) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace.
     */
    override fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(CfnWorkspace.SamlConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("990b1cf24df9062196c8e940da27e0fd5e31f6b1be4d2392c51e91cfbb599cf6")
    override
        fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty.Builder.() -> Unit):
        Unit = samlConfiguration(CfnWorkspace.SamlConfigurationProperty(samlConfiguration))

    /**
     * @param stackSetName The name of the AWS CloudFormation stack set that is used to generate IAM
     * roles to be used for this workspace.
     */
    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to.
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to.
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     */
    override fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnWorkspace.VpcConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to.
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ae53ea929d2fd9619edb5856068b2a18452f07d65de8d8010083d0a130fe1c5")
    override
        fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnWorkspace.VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspaceProps,
  ) : CdkObject(cdkObject), CfnWorkspaceProps {
    /**
     * Specifies whether the workspace can access AWS resources in this AWS account only, or whether
     * it can also access AWS resources in other accounts in the same organization.
     *
     * If this is `ORGANIZATION` , the `OrganizationalUnits` parameter specifies which
     * organizational units the workspace can access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-accountaccesstype)
     */
    override fun accountAccessType(): String = unwrap(this).getAccountAccessType()

    /**
     * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see
     * [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-authenticationproviders)
     */
    override fun authenticationProviders(): List<String> = unwrap(this).getAuthenticationProviders()

    /**
     * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * Specifies the AWS data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     *
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-datasources)
     */
    override fun dataSources(): List<String> = unwrap(this).getDataSources() ?: emptyList()

    /**
     * The user-defined description of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies the version of Grafana to support in the workspace.
     *
     * Defaults to the latest version on create (for example, 9.4), or the current version of the
     * workspace on update.
     *
     * Can only be used to upgrade (for example, from 8.4 to 9.4), not downgrade (for example, from
     * 9.4 to 8.4).
     *
     * To know what versions are available to upgrade to for a specific workspace, see the
     * [ListVersions](https://docs.aws.amazon.com/grafana/latest/APIReference/API_ListVersions.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-grafanaversion)
     */
    override fun grafanaVersion(): String? = unwrap(this).getGrafanaVersion()

    /**
     * The name of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The configuration settings for network access to your workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
     */
    override fun networkAccessControl(): Any? = unwrap(this).getNetworkAccessControl()

    /**
     * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
     * and permissions for, to allow Amazon Managed Grafana to use these channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-notificationdestinations)
     */
    override fun notificationDestinations(): List<String> =
        unwrap(this).getNotificationDestinations() ?: emptyList()

    /**
     * The name of the IAM role that is used to access resources through Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationrolename)
     */
    override fun organizationRoleName(): String? = unwrap(this).getOrganizationRoleName()

    /**
     * Specifies the organizational units that this workspace is allowed to use data sources from,
     * if this workspace is in an account that is part of an organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationalunits)
     */
    override fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
        emptyList()

    /**
     * If this is `SERVICE_MANAGED` , and the workplace was created through the Amazon Managed
     * Grafana console, then Amazon Managed Grafana automatically creates the IAM roles and provisions
     * the permissions that the workspace needs to use AWS data sources and notification channels.
     *
     * If this is `CUSTOMER_MANAGED` , you must manage those roles and permissions yourself.
     *
     * If you are working with a workspace in a member account of an organization and that account
     * is not a delegated administrator account, and you want the workspace to access data sources in
     * other AWS accounts in the organization, this parameter must be set to `CUSTOMER_MANAGED` .
     *
     * For more information about converting between customer and service managed, see [Managing
     * permissions for data sources and notification
     * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html)
     * . For more information about the roles and permissions that must be managed for customer managed
     * workspaces, see [Amazon Managed Grafana permissions and policies for AWS data sources and
     * notification
     * channels](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-permissiontype)
     */
    override fun permissionType(): String = unwrap(this).getPermissionType()

    /**
     * Whether plugin administration is enabled in the workspace.
     *
     * Setting to `true` allows workspace admins to install, uninstall, and update plugins from
     * within the Grafana workspace.
     *
     *
     * This option is only valid for workspaces that support Grafana version 9 or newer.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-pluginadminenabled)
     */
    override fun pluginAdminEnabled(): Any? = unwrap(this).getPluginAdminEnabled()

    /**
     * The IAM role that grants permissions to the AWS resources that the workspace will view data
     * from.
     *
     * This role must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
     * user information and define which groups in the assertion attribute are to have the `Admin` and
     * `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
     */
    override fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()

    /**
     * The name of the AWS CloudFormation stack set that is used to generate IAM roles to be used
     * for this workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-stacksetname)
     */
    override fun stackSetName(): String? = unwrap(this).getStackSetName()

    /**
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana
     * workspace to connect to.
     *
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-vpcconfiguration)
     */
    override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspaceProps):
        CfnWorkspaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkspaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.grafana.CfnWorkspaceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.grafana.CfnWorkspaceProps
  }
}
