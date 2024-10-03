@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::OrganizationConfiguration` resource specifies the way that your AWS
 * organization is configured in AWS Security Hub .
 *
 * Specifically, you can use this resource to specify the configuration type for your organization
 * and whether to automatically Security Hub and security standards in new member accounts. For more
 * information, see [Managing administrator and member
 * accounts](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-accounts.html) in the
 * *AWS Security Hub User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnOrganizationConfiguration cfnOrganizationConfiguration =
 * CfnOrganizationConfiguration.Builder.create(this, "MyCfnOrganizationConfiguration")
 * .autoEnable(false)
 * // the properties below are optional
 * .autoEnableStandards("autoEnableStandards")
 * .configurationType("configurationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html)
 */
public open class CfnOrganizationConfiguration(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnOrganizationConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOrganizationConfigurationProps(props)
  )

  /**
   * Whether the maximum number of allowed member accounts are already associated with the Security
   * Hub administrator account.
   */
  public open fun attrMemberAccountLimitReached(): IResolvable =
      unwrap(this).getAttrMemberAccountLimitReached().let(IResolvable::wrap)

  /**
   * The organization configuration identifier, formatted as
   * `AccountId/Region/securityhub-organization-configuration` .
   *
   * For example, `123456789012/us-east-1/securityhub-organization-configuration` .
   */
  public open fun attrOrganizationConfigurationIdentifier(): String =
      unwrap(this).getAttrOrganizationConfigurationIdentifier()

  /**
   * Describes whether central configuration could be enabled as the `ConfigurationType` for the
   * organization.
   *
   * If your `ConfigurationType` is local configuration, then the value of `Status` is always
   * `ENABLED` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Provides an explanation if the value of `Status` is equal to `FAILED` when `ConfigurationType`
   * is equal to `CENTRAL` .
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * Whether to automatically enable Security Hub in new member accounts when they join the
   * organization.
   */
  public open fun autoEnable(): Any = unwrap(this).getAutoEnable()

  /**
   * Whether to automatically enable Security Hub in new member accounts when they join the
   * organization.
   */
  public open fun autoEnable(`value`: Boolean) {
    unwrap(this).setAutoEnable(`value`)
  }

  /**
   * Whether to automatically enable Security Hub in new member accounts when they join the
   * organization.
   */
  public open fun autoEnable(`value`: IResolvable) {
    unwrap(this).setAutoEnable(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Whether to automatically enable Security Hub [default
   * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
   * in new member accounts when they join the organization.
   */
  public open fun autoEnableStandards(): String? = unwrap(this).getAutoEnableStandards()

  /**
   * Whether to automatically enable Security Hub [default
   * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
   * in new member accounts when they join the organization.
   */
  public open fun autoEnableStandards(`value`: String) {
    unwrap(this).setAutoEnableStandards(`value`)
  }

  /**
   * Indicates whether the organization uses local or central configuration.
   */
  public open fun configurationType(): String? = unwrap(this).getConfigurationType()

  /**
   * Indicates whether the organization uses local or central configuration.
   */
  public open fun configurationType(`value`: String) {
    unwrap(this).setConfigurationType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.securityhub.CfnOrganizationConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to automatically enable Security Hub in new member accounts when they join the
     * organization.
     *
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenable)
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     */
    public fun autoEnable(autoEnable: Boolean)

    /**
     * Whether to automatically enable Security Hub in new member accounts when they join the
     * organization.
     *
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenable)
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     */
    public fun autoEnable(autoEnable: IResolvable)

    /**
     * Whether to automatically enable Security Hub [default
     * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
     * in new member accounts when they join the organization.
     *
     * The default value of this parameter is equal to `DEFAULT` .
     *
     * If equal to `DEFAULT` , then Security Hub default standards are automatically enabled for new
     * member accounts. If equal to `NONE` , then default standards are not automatically enabled for
     * new member accounts.
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `NONE` and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which specific security standards
     * are enabled and associate the policy with new organization accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenablestandards)
     * @param autoEnableStandards Whether to automatically enable Security Hub [default
     * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
     * in new member accounts when they join the organization. 
     */
    public fun autoEnableStandards(autoEnableStandards: String)

    /**
     * Indicates whether the organization uses local or central configuration.
     *
     * If you use local configuration, the Security Hub delegated administrator can set `AutoEnable`
     * to `true` and `AutoEnableStandards` to `DEFAULT` . This automatically enables Security Hub and
     * default security standards in new organization accounts. These new account settings must be set
     * separately in each AWS Region , and settings may be different in each Region.
     *
     * If you use central configuration, the delegated administrator can create configuration
     * policies. Configuration policies can be used to configure Security Hub, security standards, and
     * security controls in multiple accounts and Regions. If you want new organization accounts to use
     * a specific configuration, you can create a configuration policy and associate it with the root
     * or specific organizational units (OUs). New accounts will inherit the policy from the root or
     * their assigned OU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-configurationtype)
     * @param configurationType Indicates whether the organization uses local or central
     * configuration. 
     */
    public fun configurationType(configurationType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration.Builder =
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration.Builder.create(scope,
        id)

    /**
     * Whether to automatically enable Security Hub in new member accounts when they join the
     * organization.
     *
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenable)
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     */
    override fun autoEnable(autoEnable: Boolean) {
      cdkBuilder.autoEnable(autoEnable)
    }

    /**
     * Whether to automatically enable Security Hub in new member accounts when they join the
     * organization.
     *
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenable)
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     */
    override fun autoEnable(autoEnable: IResolvable) {
      cdkBuilder.autoEnable(autoEnable.let(IResolvable.Companion::unwrap))
    }

    /**
     * Whether to automatically enable Security Hub [default
     * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
     * in new member accounts when they join the organization.
     *
     * The default value of this parameter is equal to `DEFAULT` .
     *
     * If equal to `DEFAULT` , then Security Hub default standards are automatically enabled for new
     * member accounts. If equal to `NONE` , then default standards are not automatically enabled for
     * new member accounts.
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `NONE` and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which specific security standards
     * are enabled and associate the policy with new organization accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenablestandards)
     * @param autoEnableStandards Whether to automatically enable Security Hub [default
     * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
     * in new member accounts when they join the organization. 
     */
    override fun autoEnableStandards(autoEnableStandards: String) {
      cdkBuilder.autoEnableStandards(autoEnableStandards)
    }

    /**
     * Indicates whether the organization uses local or central configuration.
     *
     * If you use local configuration, the Security Hub delegated administrator can set `AutoEnable`
     * to `true` and `AutoEnableStandards` to `DEFAULT` . This automatically enables Security Hub and
     * default security standards in new organization accounts. These new account settings must be set
     * separately in each AWS Region , and settings may be different in each Region.
     *
     * If you use central configuration, the delegated administrator can create configuration
     * policies. Configuration policies can be used to configure Security Hub, security standards, and
     * security controls in multiple accounts and Regions. If you want new organization accounts to use
     * a specific configuration, you can create a configuration policy and associate it with the root
     * or specific organizational units (OUs). New accounts will inherit the policy from the root or
     * their assigned OU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-configurationtype)
     * @param configurationType Indicates whether the organization uses local or central
     * configuration. 
     */
    override fun configurationType(configurationType: String) {
      cdkBuilder.configurationType(configurationType)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganizationConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganizationConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration):
        CfnOrganizationConfiguration = CfnOrganizationConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationConfiguration):
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration = wrapped.cdkObject
        as software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration
  }
}
