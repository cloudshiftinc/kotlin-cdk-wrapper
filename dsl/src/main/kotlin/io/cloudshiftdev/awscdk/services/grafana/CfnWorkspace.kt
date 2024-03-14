package io.cloudshiftdev.awscdk.services.grafana

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkspace internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies whether the workspace can access AWS resources in this AWS account only, or whether
   * it can also access AWS resources in other accounts in the same organization.
   */
  public open fun accountAccessType(): String = unwrap(this).getAccountAccessType()

  /**
   * Specifies whether the workspace can access AWS resources in this AWS account only, or whether
   * it can also access AWS resources in other accounts in the same organization.
   */
  public open fun accountAccessType(`value`: String) {
    unwrap(this).setAccountAccessType(`value`)
  }

  /**
   * The date that the workspace was created.
   *
   * Type: Timestamp
   */
  public open fun attrCreationTimestamp(): String = unwrap(this).getAttrCreationTimestamp()

  /**
   * The URL that users can use to access the Grafana console in the workspace.
   *
   * Type: String
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * Specifies the version of Grafana supported by this workspace.
   *
   * Type: String
   */
  public open fun attrGrafanaVersion(): String = unwrap(this).getAttrGrafanaVersion()

  /**
   * The unique ID of this workspace.
   *
   * Type: String
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The most recent date that the workspace was modified.
   *
   * Type: Timestamp
   */
  public open fun attrModificationTimestamp(): String = unwrap(this).getAttrModificationTimestamp()

  /**
   * Specifies whether the workspace's SAML configuration is complete.
   *
   * Valid values: `CONFIGURED | NOT_CONFIGURED`
   *
   * Type: String
   */
  public open fun attrSamlConfigurationStatus(): String =
      unwrap(this).getAttrSamlConfigurationStatus()

  /**
   * The ID of the IAM Identity Center-managed application that is created by Amazon Managed Grafana
   * .
   *
   * Type: String
   */
  public open fun attrSsoClientId(): String = unwrap(this).getAttrSsoClientId()

  /**
   * The current status of the workspace.
   *
   * Valid values: `ACTIVE | CREATING | DELETING | FAILED | UPDATING | UPGRADING | DELETION_FAILED |
   * CREATION_FAILED | UPDATE_FAILED | UPGRADE_FAILED | LICENSE_REMOVAL_FAILED`
   *
   * Type: String
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
   * authenticate users for using the Grafana console within a workspace. For more information, see
   * [User authentication in Amazon Managed
   * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
   */
  public open fun authenticationProviders(): List<String> =
      unwrap(this).getAuthenticationProviders()

  /**
   * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
   * authenticate users for using the Grafana console within a workspace. For more information, see
   * [User authentication in Amazon Managed
   * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
   */
  public open fun authenticationProviders(`value`: List<String>) {
    unwrap(this).setAuthenticationProviders(`value`)
  }

  /**
   * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
   * authenticate users for using the Grafana console within a workspace. For more information, see
   * [User authentication in Amazon Managed
   * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
   */
  public open fun authenticationProviders(vararg `value`: String): Unit =
      authenticationProviders(`value`.toList())

  /**
   * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
   */
  public open fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
   */
  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  /**
   * Specifies the AWS data sources that have been configured to have IAM roles and permissions
   * created to allow Amazon Managed Grafana to read data from these sources.
   */
  public open fun dataSources(): List<String> = unwrap(this).getDataSources() ?: emptyList()

  /**
   * Specifies the AWS data sources that have been configured to have IAM roles and permissions
   * created to allow Amazon Managed Grafana to read data from these sources.
   */
  public open fun dataSources(`value`: List<String>) {
    unwrap(this).setDataSources(`value`)
  }

  /**
   * Specifies the AWS data sources that have been configured to have IAM roles and permissions
   * created to allow Amazon Managed Grafana to read data from these sources.
   */
  public open fun dataSources(vararg `value`: String): Unit = dataSources(`value`.toList())

  /**
   * The user-defined description of the workspace.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The user-defined description of the workspace.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Specifies the version of Grafana to support in the workspace.
   */
  public open fun grafanaVersion(): String? = unwrap(this).getGrafanaVersion()

  /**
   * Specifies the version of Grafana to support in the workspace.
   */
  public open fun grafanaVersion(`value`: String) {
    unwrap(this).setGrafanaVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the workspace.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the workspace.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The configuration settings for network access to your workspace.
   */
  public open fun networkAccessControl(): Any? = unwrap(this).getNetworkAccessControl()

  /**
   * The configuration settings for network access to your workspace.
   */
  public open fun networkAccessControl(`value`: IResolvable) {
    unwrap(this).setNetworkAccessControl(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration settings for network access to your workspace.
   */
  public open fun networkAccessControl(`value`: NetworkAccessControlProperty) {
    unwrap(this).setNetworkAccessControl(`value`.let(NetworkAccessControlProperty::unwrap))
  }

  /**
   * The configuration settings for network access to your workspace.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f31a5420c793bc08ef1229cc07500938747140f3715a4eb12bcf8673389f0352")
  public open fun networkAccessControl(`value`: NetworkAccessControlProperty.Builder.() -> Unit):
      Unit = networkAccessControl(NetworkAccessControlProperty(`value`))

  /**
   * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
   * and permissions for, to allow Amazon Managed Grafana to use these channels.
   */
  public open fun notificationDestinations(): List<String> =
      unwrap(this).getNotificationDestinations() ?: emptyList()

  /**
   * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
   * and permissions for, to allow Amazon Managed Grafana to use these channels.
   */
  public open fun notificationDestinations(`value`: List<String>) {
    unwrap(this).setNotificationDestinations(`value`)
  }

  /**
   * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
   * and permissions for, to allow Amazon Managed Grafana to use these channels.
   */
  public open fun notificationDestinations(vararg `value`: String): Unit =
      notificationDestinations(`value`.toList())

  /**
   * The name of the IAM role that is used to access resources through Organizations .
   */
  public open fun organizationRoleName(): String? = unwrap(this).getOrganizationRoleName()

  /**
   * The name of the IAM role that is used to access resources through Organizations .
   */
  public open fun organizationRoleName(`value`: String) {
    unwrap(this).setOrganizationRoleName(`value`)
  }

  /**
   * Specifies the organizational units that this workspace is allowed to use data sources from, if
   * this workspace is in an account that is part of an organization.
   */
  public open fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
      emptyList()

  /**
   * Specifies the organizational units that this workspace is allowed to use data sources from, if
   * this workspace is in an account that is part of an organization.
   */
  public open fun organizationalUnits(`value`: List<String>) {
    unwrap(this).setOrganizationalUnits(`value`)
  }

  /**
   * Specifies the organizational units that this workspace is allowed to use data sources from, if
   * this workspace is in an account that is part of an organization.
   */
  public open fun organizationalUnits(vararg `value`: String): Unit =
      organizationalUnits(`value`.toList())

  /**
   * If this is `SERVICE_MANAGED` , and the workplace was created through the Amazon Managed Grafana
   * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the
   * permissions that the workspace needs to use AWS data sources and notification channels.
   */
  public open fun permissionType(): String = unwrap(this).getPermissionType()

  /**
   * If this is `SERVICE_MANAGED` , and the workplace was created through the Amazon Managed Grafana
   * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the
   * permissions that the workspace needs to use AWS data sources and notification channels.
   */
  public open fun permissionType(`value`: String) {
    unwrap(this).setPermissionType(`value`)
  }

  /**
   * Whether plugin administration is enabled in the workspace.
   */
  public open fun pluginAdminEnabled(): Any? = unwrap(this).getPluginAdminEnabled()

  /**
   * Whether plugin administration is enabled in the workspace.
   */
  public open fun pluginAdminEnabled(`value`: Boolean) {
    unwrap(this).setPluginAdminEnabled(`value`)
  }

  /**
   * Whether plugin administration is enabled in the workspace.
   */
  public open fun pluginAdminEnabled(`value`: IResolvable) {
    unwrap(this).setPluginAdminEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IAM role that grants permissions to the AWS resources that the workspace will view data
   * from.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The IAM role that grants permissions to the AWS resources that the workspace will view data
   * from.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
   * user information and define which groups in the assertion attribute are to have the `Admin` and
   * `Editor` roles in the workspace.
   */
  public open fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()

  /**
   * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
   * user information and define which groups in the assertion attribute are to have the `Admin` and
   * `Editor` roles in the workspace.
   */
  public open fun samlConfiguration(`value`: IResolvable) {
    unwrap(this).setSamlConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
   * user information and define which groups in the assertion attribute are to have the `Admin` and
   * `Editor` roles in the workspace.
   */
  public open fun samlConfiguration(`value`: SamlConfigurationProperty) {
    unwrap(this).setSamlConfiguration(`value`.let(SamlConfigurationProperty::unwrap))
  }

  /**
   * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
   * user information and define which groups in the assertion attribute are to have the `Admin` and
   * `Editor` roles in the workspace.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f40c8cae3318f11b1d97dc3e51dee7d8563d983c14ded98df2fa00aae49e0e46")
  public open fun samlConfiguration(`value`: SamlConfigurationProperty.Builder.() -> Unit): Unit =
      samlConfiguration(SamlConfigurationProperty(`value`))

  /**
   * The name of the AWS CloudFormation stack set that is used to generate IAM roles to be used for
   * this workspace.
   */
  public open fun stackSetName(): String? = unwrap(this).getStackSetName()

  /**
   * The name of the AWS CloudFormation stack set that is used to generate IAM roles to be used for
   * this workspace.
   */
  public open fun stackSetName(`value`: String) {
    unwrap(this).setStackSetName(`value`)
  }

  /**
   * The configuration settings for an Amazon VPC that contains data sources for your Grafana
   * workspace to connect to.
   */
  public open fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * The configuration settings for an Amazon VPC that contains data sources for your Grafana
   * workspace to connect to.
   */
  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration settings for an Amazon VPC that contains data sources for your Grafana
   * workspace to connect to.
   */
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(VpcConfigurationProperty::unwrap))
  }

  /**
   * The configuration settings for an Amazon VPC that contains data sources for your Grafana
   * workspace to connect to.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("107b8a12692f631c878f8a7babb0fdd31d9cf9add58049709b52ba456bf0cf9f")
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty.Builder.() -> Unit): Unit =
      vpcConfiguration(VpcConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.grafana.CfnWorkspace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the workspace can access AWS resources in this AWS account only, or whether
     * it can also access AWS resources in other accounts in the same organization.
     *
     * If this is `ORGANIZATION` , the `OrganizationalUnits` parameter specifies which
     * organizational units the workspace can access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-accountaccesstype)
     * @param accountAccessType Specifies whether the workspace can access AWS resources in this AWS
     * account only, or whether it can also access AWS resources in other accounts in the same
     * organization. 
     */
    public fun accountAccessType(accountAccessType: String)

    /**
     * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see
     * [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-authenticationproviders)
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    public fun authenticationProviders(authenticationProviders: List<String>)

    /**
     * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see
     * [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-authenticationproviders)
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    public fun authenticationProviders(vararg authenticationProviders: String)

    /**
     * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-clienttoken)
     * @param clientToken A unique, case-sensitive, user-provided identifier to ensure the
     * idempotency of the request. 
     */
    public fun clientToken(clientToken: String)

    /**
     * Specifies the AWS data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     *
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-datasources)
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources. 
     */
    public fun dataSources(dataSources: List<String>)

    /**
     * Specifies the AWS data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     *
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-datasources)
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources. 
     */
    public fun dataSources(vararg dataSources: String)

    /**
     * The user-defined description of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-description)
     * @param description The user-defined description of the workspace. 
     */
    public fun description(description: String)

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
     * @param grafanaVersion Specifies the version of Grafana to support in the workspace. 
     */
    public fun grafanaVersion(grafanaVersion: String)

    /**
     * The name of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-name)
     * @param name The name of the workspace. 
     */
    public fun name(name: String)

    /**
     * The configuration settings for network access to your workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
     * @param networkAccessControl The configuration settings for network access to your workspace. 
     */
    public fun networkAccessControl(networkAccessControl: IResolvable)

    /**
     * The configuration settings for network access to your workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
     * @param networkAccessControl The configuration settings for network access to your workspace. 
     */
    public fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty)

    /**
     * The configuration settings for network access to your workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
     * @param networkAccessControl The configuration settings for network access to your workspace. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df2922984192277a6cb4babdf86c15baf8ea0664de96e9273ca37d3ccaf3d04d")
    public
        fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty.Builder.() -> Unit)

    /**
     * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
     * and permissions for, to allow Amazon Managed Grafana to use these channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-notificationdestinations)
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels. 
     */
    public fun notificationDestinations(notificationDestinations: List<String>)

    /**
     * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
     * and permissions for, to allow Amazon Managed Grafana to use these channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-notificationdestinations)
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels. 
     */
    public fun notificationDestinations(vararg notificationDestinations: String)

    /**
     * The name of the IAM role that is used to access resources through Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationrolename)
     * @param organizationRoleName The name of the IAM role that is used to access resources through
     * Organizations . 
     */
    public fun organizationRoleName(organizationRoleName: String)

    /**
     * Specifies the organizational units that this workspace is allowed to use data sources from,
     * if this workspace is in an account that is part of an organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationalunits)
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization. 
     */
    public fun organizationalUnits(organizationalUnits: List<String>)

    /**
     * Specifies the organizational units that this workspace is allowed to use data sources from,
     * if this workspace is in an account that is part of an organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationalunits)
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization. 
     */
    public fun organizationalUnits(vararg organizationalUnits: String)

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
     * @param permissionType If this is `SERVICE_MANAGED` , and the workplace was created through
     * the Amazon Managed Grafana console, then Amazon Managed Grafana automatically creates the IAM
     * roles and provisions the permissions that the workspace needs to use AWS data sources and
     * notification channels. 
     */
    public fun permissionType(permissionType: String)

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
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace. 
     */
    public fun pluginAdminEnabled(pluginAdminEnabled: Boolean)

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
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace. 
     */
    public fun pluginAdminEnabled(pluginAdminEnabled: IResolvable)

    /**
     * The IAM role that grants permissions to the AWS resources that the workspace will view data
     * from.
     *
     * This role must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-rolearn)
     * @param roleArn The IAM role that grants permissions to the AWS resources that the workspace
     * will view data from. 
     */
    public fun roleArn(roleArn: String)

    /**
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
     * user information and define which groups in the assertion attribute are to have the `Admin` and
     * `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace. 
     */
    public fun samlConfiguration(samlConfiguration: IResolvable)

    /**
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
     * user information and define which groups in the assertion attribute are to have the `Admin` and
     * `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace. 
     */
    public fun samlConfiguration(samlConfiguration: SamlConfigurationProperty)

    /**
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
     * user information and define which groups in the assertion attribute are to have the `Admin` and
     * `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f9da4b10020d14cb5d2bc9761e2de07ca9b315e7d18d487e8454cf8b620839")
    public fun samlConfiguration(samlConfiguration: SamlConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the AWS CloudFormation stack set that is used to generate IAM roles to be used
     * for this workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-stacksetname)
     * @param stackSetName The name of the AWS CloudFormation stack set that is used to generate IAM
     * roles to be used for this workspace. 
     */
    public fun stackSetName(stackSetName: String)

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
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to. 
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

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
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to. 
     */
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

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
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2b9aa7bdef0230100506279e9d2fd971b43162c1bd618c02fec5efd930d5b25")
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.grafana.CfnWorkspace.Builder =
        software.amazon.awscdk.services.grafana.CfnWorkspace.Builder.create(scope, id)

    /**
     * Specifies whether the workspace can access AWS resources in this AWS account only, or whether
     * it can also access AWS resources in other accounts in the same organization.
     *
     * If this is `ORGANIZATION` , the `OrganizationalUnits` parameter specifies which
     * organizational units the workspace can access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-accountaccesstype)
     * @param accountAccessType Specifies whether the workspace can access AWS resources in this AWS
     * account only, or whether it can also access AWS resources in other accounts in the same
     * organization. 
     */
    override fun accountAccessType(accountAccessType: String) {
      cdkBuilder.accountAccessType(accountAccessType)
    }

    /**
     * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see
     * [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-authenticationproviders)
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    override fun authenticationProviders(authenticationProviders: List<String>) {
      cdkBuilder.authenticationProviders(authenticationProviders)
    }

    /**
     * Specifies whether this workspace uses SAML 2.0, AWS IAM Identity Center , or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see
     * [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-authenticationproviders)
     * @param authenticationProviders Specifies whether this workspace uses SAML 2.0, AWS IAM
     * Identity Center , or both to authenticate users for using the Grafana console within a
     * workspace. For more information, see [User authentication in Amazon Managed
     * Grafana](https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html) . 
     */
    override fun authenticationProviders(vararg authenticationProviders: String): Unit =
        authenticationProviders(authenticationProviders.toList())

    /**
     * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-clienttoken)
     * @param clientToken A unique, case-sensitive, user-provided identifier to ensure the
     * idempotency of the request. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * Specifies the AWS data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     *
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-datasources)
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources. 
     */
    override fun dataSources(dataSources: List<String>) {
      cdkBuilder.dataSources(dataSources)
    }

    /**
     * Specifies the AWS data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     *
     * This list is only used when the workspace was created through the AWS console, and the
     * `permissionType` is `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-datasources)
     * @param dataSources Specifies the AWS data sources that have been configured to have IAM roles
     * and permissions created to allow Amazon Managed Grafana to read data from these sources. 
     */
    override fun dataSources(vararg dataSources: String): Unit = dataSources(dataSources.toList())

    /**
     * The user-defined description of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-description)
     * @param description The user-defined description of the workspace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param grafanaVersion Specifies the version of Grafana to support in the workspace. 
     */
    override fun grafanaVersion(grafanaVersion: String) {
      cdkBuilder.grafanaVersion(grafanaVersion)
    }

    /**
     * The name of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-name)
     * @param name The name of the workspace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The configuration settings for network access to your workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
     * @param networkAccessControl The configuration settings for network access to your workspace. 
     */
    override fun networkAccessControl(networkAccessControl: IResolvable) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(IResolvable::unwrap))
    }

    /**
     * The configuration settings for network access to your workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
     * @param networkAccessControl The configuration settings for network access to your workspace. 
     */
    override fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(NetworkAccessControlProperty::unwrap))
    }

    /**
     * The configuration settings for network access to your workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-networkaccesscontrol)
     * @param networkAccessControl The configuration settings for network access to your workspace. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df2922984192277a6cb4babdf86c15baf8ea0664de96e9273ca37d3ccaf3d04d")
    override
        fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty.Builder.() -> Unit):
        Unit = networkAccessControl(NetworkAccessControlProperty(networkAccessControl))

    /**
     * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
     * and permissions for, to allow Amazon Managed Grafana to use these channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-notificationdestinations)
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels. 
     */
    override fun notificationDestinations(notificationDestinations: List<String>) {
      cdkBuilder.notificationDestinations(notificationDestinations)
    }

    /**
     * The AWS notification channels that Amazon Managed Grafana can automatically create IAM roles
     * and permissions for, to allow Amazon Managed Grafana to use these channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-notificationdestinations)
     * @param notificationDestinations The AWS notification channels that Amazon Managed Grafana can
     * automatically create IAM roles and permissions for, to allow Amazon Managed Grafana to use these
     * channels. 
     */
    override fun notificationDestinations(vararg notificationDestinations: String): Unit =
        notificationDestinations(notificationDestinations.toList())

    /**
     * The name of the IAM role that is used to access resources through Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationrolename)
     * @param organizationRoleName The name of the IAM role that is used to access resources through
     * Organizations . 
     */
    override fun organizationRoleName(organizationRoleName: String) {
      cdkBuilder.organizationRoleName(organizationRoleName)
    }

    /**
     * Specifies the organizational units that this workspace is allowed to use data sources from,
     * if this workspace is in an account that is part of an organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationalunits)
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization. 
     */
    override fun organizationalUnits(organizationalUnits: List<String>) {
      cdkBuilder.organizationalUnits(organizationalUnits)
    }

    /**
     * Specifies the organizational units that this workspace is allowed to use data sources from,
     * if this workspace is in an account that is part of an organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-organizationalunits)
     * @param organizationalUnits Specifies the organizational units that this workspace is allowed
     * to use data sources from, if this workspace is in an account that is part of an organization. 
     */
    override fun organizationalUnits(vararg organizationalUnits: String): Unit =
        organizationalUnits(organizationalUnits.toList())

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
     * @param permissionType If this is `SERVICE_MANAGED` , and the workplace was created through
     * the Amazon Managed Grafana console, then Amazon Managed Grafana automatically creates the IAM
     * roles and provisions the permissions that the workspace needs to use AWS data sources and
     * notification channels. 
     */
    override fun permissionType(permissionType: String) {
      cdkBuilder.permissionType(permissionType)
    }

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
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace. 
     */
    override fun pluginAdminEnabled(pluginAdminEnabled: Boolean) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled)
    }

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
     * @param pluginAdminEnabled Whether plugin administration is enabled in the workspace. 
     */
    override fun pluginAdminEnabled(pluginAdminEnabled: IResolvable) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled.let(IResolvable::unwrap))
    }

    /**
     * The IAM role that grants permissions to the AWS resources that the workspace will view data
     * from.
     *
     * This role must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-rolearn)
     * @param roleArn The IAM role that grants permissions to the AWS resources that the workspace
     * will view data from. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
     * user information and define which groups in the assertion attribute are to have the `Admin` and
     * `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace. 
     */
    override fun samlConfiguration(samlConfiguration: IResolvable) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(IResolvable::unwrap))
    }

    /**
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
     * user information and define which groups in the assertion attribute are to have the `Admin` and
     * `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace. 
     */
    override fun samlConfiguration(samlConfiguration: SamlConfigurationProperty) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(SamlConfigurationProperty::unwrap))
    }

    /**
     * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace
     * user information and define which groups in the assertion attribute are to have the `Admin` and
     * `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-samlconfiguration)
     * @param samlConfiguration If the workspace uses SAML, use this structure to map SAML assertion
     * attributes to workspace user information and define which groups in the assertion attribute are
     * to have the `Admin` and `Editor` roles in the workspace. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f9da4b10020d14cb5d2bc9761e2de07ca9b315e7d18d487e8454cf8b620839")
    override fun samlConfiguration(samlConfiguration: SamlConfigurationProperty.Builder.() -> Unit):
        Unit = samlConfiguration(SamlConfigurationProperty(samlConfiguration))

    /**
     * The name of the AWS CloudFormation stack set that is used to generate IAM roles to be used
     * for this workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html#cfn-grafana-workspace-stacksetname)
     * @param stackSetName The name of the AWS CloudFormation stack set that is used to generate IAM
     * roles to be used for this workspace. 
     */
    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

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
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to. 
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

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
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to. 
     */
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
    }

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
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data
     * sources for your Grafana workspace to connect to. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2b9aa7bdef0230100506279e9d2fd971b43162c1bd618c02fec5efd930d5b25")
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspace = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace): CfnWorkspace
        = CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace): software.amazon.awscdk.services.grafana.CfnWorkspace
        = wrapped.cdkObject
  }

  public interface AssertionAttributesProperty {
    /**
     * The name of the attribute within the SAML assertion to use as the email names for SAML users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-email)
     */
    public fun email(): String? = unwrap(this).getEmail()

    /**
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names
     * for user groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-groups)
     */
    public fun groups(): String? = unwrap(this).getGroups()

    /**
     * The name of the attribute within the SAML assertion to use as the login names for SAML users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-login)
     */
    public fun login(): String? = unwrap(this).getLogin()

    /**
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names
     * for SAML users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names
     * for the users' organizations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-org)
     */
    public fun org(): String? = unwrap(this).getOrg()

    /**
     * The name of the attribute within the SAML assertion to use as the user roles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-role)
     */
    public fun role(): String? = unwrap(this).getRole()

    /**
     * A builder for [AssertionAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param email The name of the attribute within the SAML assertion to use as the email names
       * for SAML users.
       */
      public fun email(email: String)

      /**
       * @param groups The name of the attribute within the SAML assertion to use as the user full
       * "friendly" names for user groups.
       */
      public fun groups(groups: String)

      /**
       * @param login The name of the attribute within the SAML assertion to use as the login names
       * for SAML users.
       */
      public fun login(login: String)

      /**
       * @param name The name of the attribute within the SAML assertion to use as the user full
       * "friendly" names for SAML users.
       */
      public fun name(name: String)

      /**
       * @param org The name of the attribute within the SAML assertion to use as the user full
       * "friendly" names for the users' organizations.
       */
      public fun org(org: String)

      /**
       * @param role The name of the attribute within the SAML assertion to use as the user roles.
       */
      public fun role(role: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty.builder()

      /**
       * @param email The name of the attribute within the SAML assertion to use as the email names
       * for SAML users.
       */
      override fun email(email: String) {
        cdkBuilder.email(email)
      }

      /**
       * @param groups The name of the attribute within the SAML assertion to use as the user full
       * "friendly" names for user groups.
       */
      override fun groups(groups: String) {
        cdkBuilder.groups(groups)
      }

      /**
       * @param login The name of the attribute within the SAML assertion to use as the login names
       * for SAML users.
       */
      override fun login(login: String) {
        cdkBuilder.login(login)
      }

      /**
       * @param name The name of the attribute within the SAML assertion to use as the user full
       * "friendly" names for SAML users.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param org The name of the attribute within the SAML assertion to use as the user full
       * "friendly" names for the users' organizations.
       */
      override fun org(org: String) {
        cdkBuilder.org(org)
      }

      /**
       * @param role The name of the attribute within the SAML assertion to use as the user roles.
       */
      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty,
    ) : CdkObject(cdkObject), AssertionAttributesProperty {
      /**
       * The name of the attribute within the SAML assertion to use as the email names for SAML
       * users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-email)
       */
      override fun email(): String? = unwrap(this).getEmail()

      /**
       * The name of the attribute within the SAML assertion to use as the user full "friendly"
       * names for user groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-groups)
       */
      override fun groups(): String? = unwrap(this).getGroups()

      /**
       * The name of the attribute within the SAML assertion to use as the login names for SAML
       * users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-login)
       */
      override fun login(): String? = unwrap(this).getLogin()

      /**
       * The name of the attribute within the SAML assertion to use as the user full "friendly"
       * names for SAML users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The name of the attribute within the SAML assertion to use as the user full "friendly"
       * names for the users' organizations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-org)
       */
      override fun org(): String? = unwrap(this).getOrg()

      /**
       * The name of the attribute within the SAML assertion to use as the user roles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html#cfn-grafana-workspace-assertionattributes-role)
       */
      override fun role(): String? = unwrap(this).getRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssertionAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty):
          AssertionAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssertionAttributesProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty
    }
  }

  public interface IdpMetadataProperty {
    /**
     * The URL of the location containing the IdP metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-idpmetadata.html#cfn-grafana-workspace-idpmetadata-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * The full IdP metadata, in XML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-idpmetadata.html#cfn-grafana-workspace-idpmetadata-xml)
     */
    public fun xml(): String? = unwrap(this).getXml()

    /**
     * A builder for [IdpMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param url The URL of the location containing the IdP metadata.
       */
      public fun url(url: String)

      /**
       * @param xml The full IdP metadata, in XML format.
       */
      public fun xml(xml: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty.builder()

      /**
       * @param url The URL of the location containing the IdP metadata.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      /**
       * @param xml The full IdP metadata, in XML format.
       */
      override fun xml(xml: String) {
        cdkBuilder.xml(xml)
      }

      public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty,
    ) : CdkObject(cdkObject), IdpMetadataProperty {
      /**
       * The URL of the location containing the IdP metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-idpmetadata.html#cfn-grafana-workspace-idpmetadata-url)
       */
      override fun url(): String? = unwrap(this).getUrl()

      /**
       * The full IdP metadata, in XML format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-idpmetadata.html#cfn-grafana-workspace-idpmetadata-xml)
       */
      override fun xml(): String? = unwrap(this).getXml()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdpMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty):
          IdpMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdpMetadataProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty
    }
  }

  public interface SamlConfigurationProperty {
    /**
     * Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed
     * Grafana workspace.
     *
     * If this is empty, all organizations in the assertion attribute have access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-allowedorganizations)
     */
    public fun allowedOrganizations(): List<String> = unwrap(this).getAllowedOrganizations() ?:
        emptyList()

    /**
     * A structure that defines which attributes in the SAML assertion are to be used to define
     * information about the users authenticated by that IdP to use the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-assertionattributes)
     */
    public fun assertionAttributes(): Any? = unwrap(this).getAssertionAttributes()

    /**
     * A structure containing the identity provider (IdP) metadata used to integrate the identity
     * provider with this workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-idpmetadata)
     */
    public fun idpMetadata(): Any

    /**
     * How long a sign-on session by a SAML user is valid, before the user has to sign on again.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-loginvalidityduration)
     */
    public fun loginValidityDuration(): Number? = unwrap(this).getLoginValidityDuration()

    /**
     * A structure containing arrays that map group names in the SAML assertion to the Grafana
     * `Admin` and `Editor` roles in the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-rolevalues)
     */
    public fun roleValues(): Any? = unwrap(this).getRoleValues()

    /**
     * A builder for [SamlConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedOrganizations Lists which organizations defined in the SAML assertion are
       * allowed to use the Amazon Managed Grafana workspace.
       * If this is empty, all organizations in the assertion attribute have access.
       */
      public fun allowedOrganizations(allowedOrganizations: List<String>)

      /**
       * @param allowedOrganizations Lists which organizations defined in the SAML assertion are
       * allowed to use the Amazon Managed Grafana workspace.
       * If this is empty, all organizations in the assertion attribute have access.
       */
      public fun allowedOrganizations(vararg allowedOrganizations: String)

      /**
       * @param assertionAttributes A structure that defines which attributes in the SAML assertion
       * are to be used to define information about the users authenticated by that IdP to use the
       * workspace.
       */
      public fun assertionAttributes(assertionAttributes: IResolvable)

      /**
       * @param assertionAttributes A structure that defines which attributes in the SAML assertion
       * are to be used to define information about the users authenticated by that IdP to use the
       * workspace.
       */
      public fun assertionAttributes(assertionAttributes: AssertionAttributesProperty)

      /**
       * @param assertionAttributes A structure that defines which attributes in the SAML assertion
       * are to be used to define information about the users authenticated by that IdP to use the
       * workspace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04e8718853837bb26880a91e92d3c04665c0bb5204515f23f9cde811673e1eb2")
      public
          fun assertionAttributes(assertionAttributes: AssertionAttributesProperty.Builder.() -> Unit)

      /**
       * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
       * integrate the identity provider with this workspace. 
       */
      public fun idpMetadata(idpMetadata: IResolvable)

      /**
       * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
       * integrate the identity provider with this workspace. 
       */
      public fun idpMetadata(idpMetadata: IdpMetadataProperty)

      /**
       * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
       * integrate the identity provider with this workspace. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21db845b00d8cebed8b48c0525e0e7ebc5800bc202c0bb6bbed0a2f90ba0fdaa")
      public fun idpMetadata(idpMetadata: IdpMetadataProperty.Builder.() -> Unit)

      /**
       * @param loginValidityDuration How long a sign-on session by a SAML user is valid, before the
       * user has to sign on again.
       */
      public fun loginValidityDuration(loginValidityDuration: Number)

      /**
       * @param roleValues A structure containing arrays that map group names in the SAML assertion
       * to the Grafana `Admin` and `Editor` roles in the workspace.
       */
      public fun roleValues(roleValues: IResolvable)

      /**
       * @param roleValues A structure containing arrays that map group names in the SAML assertion
       * to the Grafana `Admin` and `Editor` roles in the workspace.
       */
      public fun roleValues(roleValues: RoleValuesProperty)

      /**
       * @param roleValues A structure containing arrays that map group names in the SAML assertion
       * to the Grafana `Admin` and `Editor` roles in the workspace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ceb493a89a71363274d243185fa55a080b787a7563005bb6ca53f91798daa70")
      public fun roleValues(roleValues: RoleValuesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty.builder()

      /**
       * @param allowedOrganizations Lists which organizations defined in the SAML assertion are
       * allowed to use the Amazon Managed Grafana workspace.
       * If this is empty, all organizations in the assertion attribute have access.
       */
      override fun allowedOrganizations(allowedOrganizations: List<String>) {
        cdkBuilder.allowedOrganizations(allowedOrganizations)
      }

      /**
       * @param allowedOrganizations Lists which organizations defined in the SAML assertion are
       * allowed to use the Amazon Managed Grafana workspace.
       * If this is empty, all organizations in the assertion attribute have access.
       */
      override fun allowedOrganizations(vararg allowedOrganizations: String): Unit =
          allowedOrganizations(allowedOrganizations.toList())

      /**
       * @param assertionAttributes A structure that defines which attributes in the SAML assertion
       * are to be used to define information about the users authenticated by that IdP to use the
       * workspace.
       */
      override fun assertionAttributes(assertionAttributes: IResolvable) {
        cdkBuilder.assertionAttributes(assertionAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param assertionAttributes A structure that defines which attributes in the SAML assertion
       * are to be used to define information about the users authenticated by that IdP to use the
       * workspace.
       */
      override fun assertionAttributes(assertionAttributes: AssertionAttributesProperty) {
        cdkBuilder.assertionAttributes(assertionAttributes.let(AssertionAttributesProperty::unwrap))
      }

      /**
       * @param assertionAttributes A structure that defines which attributes in the SAML assertion
       * are to be used to define information about the users authenticated by that IdP to use the
       * workspace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04e8718853837bb26880a91e92d3c04665c0bb5204515f23f9cde811673e1eb2")
      override
          fun assertionAttributes(assertionAttributes: AssertionAttributesProperty.Builder.() -> Unit):
          Unit = assertionAttributes(AssertionAttributesProperty(assertionAttributes))

      /**
       * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
       * integrate the identity provider with this workspace. 
       */
      override fun idpMetadata(idpMetadata: IResolvable) {
        cdkBuilder.idpMetadata(idpMetadata.let(IResolvable::unwrap))
      }

      /**
       * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
       * integrate the identity provider with this workspace. 
       */
      override fun idpMetadata(idpMetadata: IdpMetadataProperty) {
        cdkBuilder.idpMetadata(idpMetadata.let(IdpMetadataProperty::unwrap))
      }

      /**
       * @param idpMetadata A structure containing the identity provider (IdP) metadata used to
       * integrate the identity provider with this workspace. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21db845b00d8cebed8b48c0525e0e7ebc5800bc202c0bb6bbed0a2f90ba0fdaa")
      override fun idpMetadata(idpMetadata: IdpMetadataProperty.Builder.() -> Unit): Unit =
          idpMetadata(IdpMetadataProperty(idpMetadata))

      /**
       * @param loginValidityDuration How long a sign-on session by a SAML user is valid, before the
       * user has to sign on again.
       */
      override fun loginValidityDuration(loginValidityDuration: Number) {
        cdkBuilder.loginValidityDuration(loginValidityDuration)
      }

      /**
       * @param roleValues A structure containing arrays that map group names in the SAML assertion
       * to the Grafana `Admin` and `Editor` roles in the workspace.
       */
      override fun roleValues(roleValues: IResolvable) {
        cdkBuilder.roleValues(roleValues.let(IResolvable::unwrap))
      }

      /**
       * @param roleValues A structure containing arrays that map group names in the SAML assertion
       * to the Grafana `Admin` and `Editor` roles in the workspace.
       */
      override fun roleValues(roleValues: RoleValuesProperty) {
        cdkBuilder.roleValues(roleValues.let(RoleValuesProperty::unwrap))
      }

      /**
       * @param roleValues A structure containing arrays that map group names in the SAML assertion
       * to the Grafana `Admin` and `Editor` roles in the workspace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ceb493a89a71363274d243185fa55a080b787a7563005bb6ca53f91798daa70")
      override fun roleValues(roleValues: RoleValuesProperty.Builder.() -> Unit): Unit =
          roleValues(RoleValuesProperty(roleValues))

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty,
    ) : CdkObject(cdkObject), SamlConfigurationProperty {
      /**
       * Lists which organizations defined in the SAML assertion are allowed to use the Amazon
       * Managed Grafana workspace.
       *
       * If this is empty, all organizations in the assertion attribute have access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-allowedorganizations)
       */
      override fun allowedOrganizations(): List<String> = unwrap(this).getAllowedOrganizations() ?:
          emptyList()

      /**
       * A structure that defines which attributes in the SAML assertion are to be used to define
       * information about the users authenticated by that IdP to use the workspace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-assertionattributes)
       */
      override fun assertionAttributes(): Any? = unwrap(this).getAssertionAttributes()

      /**
       * A structure containing the identity provider (IdP) metadata used to integrate the identity
       * provider with this workspace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-idpmetadata)
       */
      override fun idpMetadata(): Any = unwrap(this).getIdpMetadata()

      /**
       * How long a sign-on session by a SAML user is valid, before the user has to sign on again.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-loginvalidityduration)
       */
      override fun loginValidityDuration(): Number? = unwrap(this).getLoginValidityDuration()

      /**
       * A structure containing arrays that map group names in the SAML assertion to the Grafana
       * `Admin` and `Editor` roles in the workspace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html#cfn-grafana-workspace-samlconfiguration-rolevalues)
       */
      override fun roleValues(): Any? = unwrap(this).getRoleValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SamlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty):
          SamlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamlConfigurationProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty
    }
  }

  public interface NetworkAccessControlProperty {
    /**
     * An array of prefix list IDs.
     *
     * A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified are
     * allowed to access your workspace. If the list is not included in the configuration (passed an
     * empty array) then no IP addresses are allowed to access the workspace. You create a prefix list
     * using the Amazon VPC console.
     *
     * Prefix list IDs have the format `pl- *1a2b3c4d*` .
     *
     * For more information about prefix lists, see [Group CIDR blocks using managed prefix
     * lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html) in the
     * *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-networkaccesscontrol.html#cfn-grafana-workspace-networkaccesscontrol-prefixlistids)
     */
    public fun prefixListIds(): List<String> = unwrap(this).getPrefixListIds() ?: emptyList()

    /**
     * An array of Amazon VPC endpoint IDs for the workspace.
     *
     * You can create VPC endpoints to your Amazon Managed Grafana workspace for access from within
     * a VPC. If a `NetworkAccessConfiguration` is specified then only VPC endpoints specified here are
     * allowed to access the workspace. If you pass in an empty array of strings, then no VPCs are
     * allowed to access the workspace.
     *
     * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
     *
     * For more information about creating an interface VPC endpoint, see [Interface VPC
     * endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints) in the *Amazon
     * Managed Grafana User Guide* .
     *
     *
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
     * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
     * endpoints are ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-networkaccesscontrol.html#cfn-grafana-workspace-networkaccesscontrol-vpceids)
     */
    public fun vpceIds(): List<String> = unwrap(this).getVpceIds() ?: emptyList()

    /**
     * A builder for [NetworkAccessControlProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prefixListIds An array of prefix list IDs.
       * A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified are
       * allowed to access your workspace. If the list is not included in the configuration (passed an
       * empty array) then no IP addresses are allowed to access the workspace. You create a prefix
       * list using the Amazon VPC console.
       *
       * Prefix list IDs have the format `pl- *1a2b3c4d*` .
       *
       * For more information about prefix lists, see [Group CIDR blocks using managed prefix
       * lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html) in the
       * *Amazon Virtual Private Cloud User Guide* .
       */
      public fun prefixListIds(prefixListIds: List<String>)

      /**
       * @param prefixListIds An array of prefix list IDs.
       * A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified are
       * allowed to access your workspace. If the list is not included in the configuration (passed an
       * empty array) then no IP addresses are allowed to access the workspace. You create a prefix
       * list using the Amazon VPC console.
       *
       * Prefix list IDs have the format `pl- *1a2b3c4d*` .
       *
       * For more information about prefix lists, see [Group CIDR blocks using managed prefix
       * lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html) in the
       * *Amazon Virtual Private Cloud User Guide* .
       */
      public fun prefixListIds(vararg prefixListIds: String)

      /**
       * @param vpceIds An array of Amazon VPC endpoint IDs for the workspace.
       * You can create VPC endpoints to your Amazon Managed Grafana workspace for access from
       * within a VPC. If a `NetworkAccessConfiguration` is specified then only VPC endpoints specified
       * here are allowed to access the workspace. If you pass in an empty array of strings, then no
       * VPCs are allowed to access the workspace.
       *
       * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
       *
       * For more information about creating an interface VPC endpoint, see [Interface VPC
       * endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints) in the *Amazon
       * Managed Grafana User Guide* .
       *
       *
       * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
       * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
       * endpoints are ignored.
       */
      public fun vpceIds(vpceIds: List<String>)

      /**
       * @param vpceIds An array of Amazon VPC endpoint IDs for the workspace.
       * You can create VPC endpoints to your Amazon Managed Grafana workspace for access from
       * within a VPC. If a `NetworkAccessConfiguration` is specified then only VPC endpoints specified
       * here are allowed to access the workspace. If you pass in an empty array of strings, then no
       * VPCs are allowed to access the workspace.
       *
       * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
       *
       * For more information about creating an interface VPC endpoint, see [Interface VPC
       * endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints) in the *Amazon
       * Managed Grafana User Guide* .
       *
       *
       * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
       * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
       * endpoints are ignored.
       */
      public fun vpceIds(vararg vpceIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty.Builder
          =
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty.builder()

      /**
       * @param prefixListIds An array of prefix list IDs.
       * A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified are
       * allowed to access your workspace. If the list is not included in the configuration (passed an
       * empty array) then no IP addresses are allowed to access the workspace. You create a prefix
       * list using the Amazon VPC console.
       *
       * Prefix list IDs have the format `pl- *1a2b3c4d*` .
       *
       * For more information about prefix lists, see [Group CIDR blocks using managed prefix
       * lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html) in the
       * *Amazon Virtual Private Cloud User Guide* .
       */
      override fun prefixListIds(prefixListIds: List<String>) {
        cdkBuilder.prefixListIds(prefixListIds)
      }

      /**
       * @param prefixListIds An array of prefix list IDs.
       * A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified are
       * allowed to access your workspace. If the list is not included in the configuration (passed an
       * empty array) then no IP addresses are allowed to access the workspace. You create a prefix
       * list using the Amazon VPC console.
       *
       * Prefix list IDs have the format `pl- *1a2b3c4d*` .
       *
       * For more information about prefix lists, see [Group CIDR blocks using managed prefix
       * lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html) in the
       * *Amazon Virtual Private Cloud User Guide* .
       */
      override fun prefixListIds(vararg prefixListIds: String): Unit =
          prefixListIds(prefixListIds.toList())

      /**
       * @param vpceIds An array of Amazon VPC endpoint IDs for the workspace.
       * You can create VPC endpoints to your Amazon Managed Grafana workspace for access from
       * within a VPC. If a `NetworkAccessConfiguration` is specified then only VPC endpoints specified
       * here are allowed to access the workspace. If you pass in an empty array of strings, then no
       * VPCs are allowed to access the workspace.
       *
       * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
       *
       * For more information about creating an interface VPC endpoint, see [Interface VPC
       * endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints) in the *Amazon
       * Managed Grafana User Guide* .
       *
       *
       * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
       * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
       * endpoints are ignored.
       */
      override fun vpceIds(vpceIds: List<String>) {
        cdkBuilder.vpceIds(vpceIds)
      }

      /**
       * @param vpceIds An array of Amazon VPC endpoint IDs for the workspace.
       * You can create VPC endpoints to your Amazon Managed Grafana workspace for access from
       * within a VPC. If a `NetworkAccessConfiguration` is specified then only VPC endpoints specified
       * here are allowed to access the workspace. If you pass in an empty array of strings, then no
       * VPCs are allowed to access the workspace.
       *
       * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
       *
       * For more information about creating an interface VPC endpoint, see [Interface VPC
       * endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints) in the *Amazon
       * Managed Grafana User Guide* .
       *
       *
       * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
       * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
       * endpoints are ignored.
       */
      override fun vpceIds(vararg vpceIds: String): Unit = vpceIds(vpceIds.toList())

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty,
    ) : CdkObject(cdkObject), NetworkAccessControlProperty {
      /**
       * An array of prefix list IDs.
       *
       * A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified are
       * allowed to access your workspace. If the list is not included in the configuration (passed an
       * empty array) then no IP addresses are allowed to access the workspace. You create a prefix
       * list using the Amazon VPC console.
       *
       * Prefix list IDs have the format `pl- *1a2b3c4d*` .
       *
       * For more information about prefix lists, see [Group CIDR blocks using managed prefix
       * lists](https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html) in the
       * *Amazon Virtual Private Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-networkaccesscontrol.html#cfn-grafana-workspace-networkaccesscontrol-prefixlistids)
       */
      override fun prefixListIds(): List<String> = unwrap(this).getPrefixListIds() ?: emptyList()

      /**
       * An array of Amazon VPC endpoint IDs for the workspace.
       *
       * You can create VPC endpoints to your Amazon Managed Grafana workspace for access from
       * within a VPC. If a `NetworkAccessConfiguration` is specified then only VPC endpoints specified
       * here are allowed to access the workspace. If you pass in an empty array of strings, then no
       * VPCs are allowed to access the workspace.
       *
       * VPC endpoint IDs have the format `vpce- *1a2b3c4d*` .
       *
       * For more information about creating an interface VPC endpoint, see [Interface VPC
       * endpoints](https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints) in the *Amazon
       * Managed Grafana User Guide* .
       *
       *
       * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana
       * workspaces (using the `com.amazonaws.[region].grafana-workspace` service endpoint). Other VPC
       * endpoints are ignored.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-networkaccesscontrol.html#cfn-grafana-workspace-networkaccesscontrol-vpceids)
       */
      override fun vpceIds(): List<String> = unwrap(this).getVpceIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkAccessControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty):
          NetworkAccessControlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkAccessControlProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty
    }
  }

  public interface VpcConfigurationProperty {
    /**
     * The list of Amazon EC2 security group IDs attached to the Amazon VPC for your Grafana
     * workspace to connect.
     *
     * Duplicates not allowed.
     *
     * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
     *
     * *Length* : Minimum length of 0. Maximum length of 255.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-vpcconfiguration.html#cfn-grafana-workspace-vpcconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The list of Amazon EC2 subnet IDs created in the Amazon VPC for your Grafana workspace to
     * connect.
     *
     * Duplicates not allowed.
     *
     * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
     *
     * *Length* : Minimum length of 0. Maximum length of 255.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-vpcconfiguration.html#cfn-grafana-workspace-vpcconfiguration-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The list of Amazon EC2 security group IDs attached to the Amazon
       * VPC for your Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The list of Amazon EC2 security group IDs attached to the Amazon
       * VPC for your Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The list of Amazon EC2 subnet IDs created in the Amazon VPC for your
       * Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The list of Amazon EC2 subnet IDs created in the Amazon VPC for your
       * Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty.builder()

      /**
       * @param securityGroupIds The list of Amazon EC2 security group IDs attached to the Amazon
       * VPC for your Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The list of Amazon EC2 security group IDs attached to the Amazon
       * VPC for your Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The list of Amazon EC2 subnet IDs created in the Amazon VPC for your
       * Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The list of Amazon EC2 subnet IDs created in the Amazon VPC for your
       * Grafana workspace to connect. 
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty,
    ) : CdkObject(cdkObject), VpcConfigurationProperty {
      /**
       * The list of Amazon EC2 security group IDs attached to the Amazon VPC for your Grafana
       * workspace to connect.
       *
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 1 items. Maximum number of 5 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-vpcconfiguration.html#cfn-grafana-workspace-vpcconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The list of Amazon EC2 subnet IDs created in the Amazon VPC for your Grafana workspace to
       * connect.
       *
       * Duplicates not allowed.
       *
       * *Array Members* : Minimum number of 2 items. Maximum number of 6 items.
       *
       * *Length* : Minimum length of 0. Maximum length of 255.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-vpcconfiguration.html#cfn-grafana-workspace-vpcconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty
    }
  }

  public interface RoleValuesProperty {
    /**
     * A list of groups from the SAML assertion attribute to grant the Grafana `Admin` role to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-rolevalues.html#cfn-grafana-workspace-rolevalues-admin)
     */
    public fun admin(): List<String> = unwrap(this).getAdmin() ?: emptyList()

    /**
     * A list of groups from the SAML assertion attribute to grant the Grafana `Editor` role to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-rolevalues.html#cfn-grafana-workspace-rolevalues-editor)
     */
    public fun editor(): List<String> = unwrap(this).getEditor() ?: emptyList()

    /**
     * A builder for [RoleValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param admin A list of groups from the SAML assertion attribute to grant the Grafana
       * `Admin` role to.
       */
      public fun admin(admin: List<String>)

      /**
       * @param admin A list of groups from the SAML assertion attribute to grant the Grafana
       * `Admin` role to.
       */
      public fun admin(vararg admin: String)

      /**
       * @param editor A list of groups from the SAML assertion attribute to grant the Grafana
       * `Editor` role to.
       */
      public fun editor(editor: List<String>)

      /**
       * @param editor A list of groups from the SAML assertion attribute to grant the Grafana
       * `Editor` role to.
       */
      public fun editor(vararg editor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty.builder()

      /**
       * @param admin A list of groups from the SAML assertion attribute to grant the Grafana
       * `Admin` role to.
       */
      override fun admin(admin: List<String>) {
        cdkBuilder.admin(admin)
      }

      /**
       * @param admin A list of groups from the SAML assertion attribute to grant the Grafana
       * `Admin` role to.
       */
      override fun admin(vararg admin: String): Unit = admin(admin.toList())

      /**
       * @param editor A list of groups from the SAML assertion attribute to grant the Grafana
       * `Editor` role to.
       */
      override fun editor(editor: List<String>) {
        cdkBuilder.editor(editor)
      }

      /**
       * @param editor A list of groups from the SAML assertion attribute to grant the Grafana
       * `Editor` role to.
       */
      override fun editor(vararg editor: String): Unit = editor(editor.toList())

      public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty,
    ) : CdkObject(cdkObject), RoleValuesProperty {
      /**
       * A list of groups from the SAML assertion attribute to grant the Grafana `Admin` role to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-rolevalues.html#cfn-grafana-workspace-rolevalues-admin)
       */
      override fun admin(): List<String> = unwrap(this).getAdmin() ?: emptyList()

      /**
       * A list of groups from the SAML assertion attribute to grant the Grafana `Editor` role to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-rolevalues.html#cfn-grafana-workspace-rolevalues-editor)
       */
      override fun editor(): List<String> = unwrap(this).getEditor() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoleValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty):
          RoleValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoleValuesProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty
    }
  }
}
