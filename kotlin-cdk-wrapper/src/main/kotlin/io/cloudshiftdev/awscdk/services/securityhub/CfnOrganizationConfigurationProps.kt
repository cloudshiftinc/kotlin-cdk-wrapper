@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnOrganizationConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnOrganizationConfigurationProps cfnOrganizationConfigurationProps =
 * CfnOrganizationConfigurationProps.builder()
 * .autoEnable(false)
 * // the properties below are optional
 * .autoEnableStandards("autoEnableStandards")
 * .configurationType("configurationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html)
 */
public interface CfnOrganizationConfigurationProps {
  /**
   * Whether to automatically enable Security Hub in new member accounts when they join the
   * organization.
   *
   * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
   * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
   * `false` .
   *
   * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set to
   * `false` and can't be changed in the home Region and linked Regions. However, in that case, the
   * delegated administrator can create a configuration policy in which Security Hub is enabled and
   * associate the policy with new organization accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenable)
   */
  public fun autoEnable(): Any

  /**
   * Whether to automatically enable Security Hub [default
   * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
   * in new member accounts when they join the organization.
   *
   * The default value of this parameter is equal to `DEFAULT` .
   *
   * If equal to `DEFAULT` , then Security Hub default standards are automatically enabled for new
   * member accounts. If equal to `NONE` , then default standards are not automatically enabled for new
   * member accounts.
   *
   * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set to
   * `NONE` and can't be changed in the home Region and linked Regions. However, in that case, the
   * delegated administrator can create a configuration policy in which specific security standards are
   * enabled and associate the policy with new organization accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-autoenablestandards)
   */
  public fun autoEnableStandards(): String? = unwrap(this).getAutoEnableStandards()

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
   * security controls in multiple accounts and Regions. If you want new organization accounts to use a
   * specific configuration, you can create a configuration policy and associate it with the root or
   * specific organizational units (OUs). New accounts will inherit the policy from the root or their
   * assigned OU.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-organizationconfiguration.html#cfn-securityhub-organizationconfiguration-configurationtype)
   */
  public fun configurationType(): String? = unwrap(this).getConfigurationType()

  /**
   * A builder for [CfnOrganizationConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     */
    public fun autoEnable(autoEnable: Boolean)

    /**
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     */
    public fun autoEnable(autoEnable: IResolvable)

    /**
     * @param autoEnableStandards Whether to automatically enable Security Hub [default
     * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
     * in new member accounts when they join the organization.
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
     */
    public fun autoEnableStandards(autoEnableStandards: String)

    /**
     * @param configurationType Indicates whether the organization uses local or central
     * configuration.
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
     */
    public fun configurationType(configurationType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps.builder()

    /**
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     */
    override fun autoEnable(autoEnable: Boolean) {
      cdkBuilder.autoEnable(autoEnable)
    }

    /**
     * @param autoEnable Whether to automatically enable Security Hub in new member accounts when
     * they join the organization. 
     * If set to `true` , then Security Hub is automatically enabled in new accounts. If set to
     * `false` , then Security Hub isn't enabled in new accounts automatically. The default value is
     * `false` .
     *
     * If the `ConfigurationType` of your organization is set to `CENTRAL` , then this field is set
     * to `false` and can't be changed in the home Region and linked Regions. However, in that case,
     * the delegated administrator can create a configuration policy in which Security Hub is enabled
     * and associate the policy with new organization accounts.
     */
    override fun autoEnable(autoEnable: IResolvable) {
      cdkBuilder.autoEnable(autoEnable.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param autoEnableStandards Whether to automatically enable Security Hub [default
     * standards](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html)
     * in new member accounts when they join the organization.
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
     */
    override fun autoEnableStandards(autoEnableStandards: String) {
      cdkBuilder.autoEnableStandards(autoEnableStandards)
    }

    /**
     * @param configurationType Indicates whether the organization uses local or central
     * configuration.
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
     */
    override fun configurationType(configurationType: String) {
      cdkBuilder.configurationType(configurationType)
    }

    public fun build():
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnOrganizationConfigurationProps {
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
     */
    override fun autoEnable(): Any = unwrap(this).getAutoEnable()

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
     */
    override fun autoEnableStandards(): String? = unwrap(this).getAutoEnableStandards()

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
     */
    override fun configurationType(): String? = unwrap(this).getConfigurationType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps):
        CfnOrganizationConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnOrganizationConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationConfigurationProps):
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps
  }
}
