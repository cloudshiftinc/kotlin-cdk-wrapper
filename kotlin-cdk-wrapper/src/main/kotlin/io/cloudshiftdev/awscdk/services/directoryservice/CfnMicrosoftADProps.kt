@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.directoryservice

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMicrosoftAD`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.directoryservice.*;
 * CfnMicrosoftADProps cfnMicrosoftADProps = CfnMicrosoftADProps.builder()
 * .name("name")
 * .password("password")
 * .vpcSettings(VpcSettingsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * // the properties below are optional
 * .createAlias(false)
 * .edition("edition")
 * .enableSso(false)
 * .shortName("shortName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html)
 */
public interface CfnMicrosoftADProps {
  /**
   * Specifies an alias for a directory and assigns the alias to the directory.
   *
   * The alias is used to construct the access URL for the directory, such as
   * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
   *
   *
   * After an alias has been created, it cannot be deleted or reused, so this operation should only
   * be used when absolutely necessary.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias)
   */
  public fun createAlias(): Any? = unwrap(this).getCreateAlias()

  /**
   * AWS Managed Microsoft AD is available in two editions: `Standard` and `Enterprise` .
   *
   * `Enterprise` is the default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition)
   */
  public fun edition(): String? = unwrap(this).getEdition()

  /**
   * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
   *
   * Single sign-on allows users in your directory to access certain AWS services from a computer
   * joined to the directory without having to enter their credentials separately. If you don't specify
   * a value, AWS CloudFormation disables single sign-on by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
   */
  public fun enableSso(): Any? = unwrap(this).getEnableSso()

  /**
   * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as
   * `corp.example.com` . This name will resolve inside your VPC only. It does not need to be publicly
   * resolvable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
   */
  public fun name(): String

  /**
   * The password for the default administrative user named `Admin` .
   *
   * If you need to change the password for the administrator account, see the
   * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
   * API call in the *AWS Directory Service API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
   */
  public fun password(): String

  /**
   * The NetBIOS name for your domain, such as `CORP` .
   *
   * If you don't specify a NetBIOS name, it will default to the first part of your directory DNS.
   * For example, `CORP` for the directory DNS `corp.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
   */
  public fun shortName(): String? = unwrap(this).getShortName()

  /**
   * Specifies the VPC settings of the Microsoft AD directory server in AWS .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
   */
  public fun vpcSettings(): Any

  /**
   * A builder for [CfnMicrosoftADProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: Boolean)

    /**
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: IResolvable)

    /**
     * @param edition AWS Managed Microsoft AD is available in two editions: `Standard` and
     * `Enterprise` .
     * `Enterprise` is the default.
     */
    public fun edition(edition: String)

    /**
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: Boolean)

    /**
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: IResolvable)

    /**
     * @param name The fully qualified domain name for the AWS Managed Microsoft AD directory, such
     * as `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable. 
     */
    public fun name(name: String)

    /**
     * @param password The password for the default administrative user named `Admin` . 
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     */
    public fun password(password: String)

    /**
     * @param shortName The NetBIOS name for your domain, such as `CORP` .
     * If you don't specify a NetBIOS name, it will default to the first part of your directory DNS.
     * For example, `CORP` for the directory DNS `corp.example.com` .
     */
    public fun shortName(shortName: String)

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    public fun vpcSettings(vpcSettings: IResolvable)

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    public fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty)

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95143ea6926e1690fdecfccada0ff07819d070ee5685d13b3a9aa150069ee637")
    public fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder =
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.builder()

    /**
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    override fun createAlias(createAlias: Boolean) {
      cdkBuilder.createAlias(createAlias)
    }

    /**
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    override fun createAlias(createAlias: IResolvable) {
      cdkBuilder.createAlias(createAlias.let(IResolvable::unwrap))
    }

    /**
     * @param edition AWS Managed Microsoft AD is available in two editions: `Standard` and
     * `Enterprise` .
     * `Enterprise` is the default.
     */
    override fun edition(edition: String) {
      cdkBuilder.edition(edition)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     */
    override fun enableSso(enableSso: Boolean) {
      cdkBuilder.enableSso(enableSso)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     */
    override fun enableSso(enableSso: IResolvable) {
      cdkBuilder.enableSso(enableSso.let(IResolvable::unwrap))
    }

    /**
     * @param name The fully qualified domain name for the AWS Managed Microsoft AD directory, such
     * as `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param password The password for the default administrative user named `Admin` . 
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param shortName The NetBIOS name for your domain, such as `CORP` .
     * If you don't specify a NetBIOS name, it will default to the first part of your directory DNS.
     * For example, `CORP` for the directory DNS `corp.example.com` .
     */
    override fun shortName(shortName: String) {
      cdkBuilder.shortName(shortName)
    }

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    override fun vpcSettings(vpcSettings: IResolvable) {
      cdkBuilder.vpcSettings(vpcSettings.let(IResolvable::unwrap))
    }

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    override fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty) {
      cdkBuilder.vpcSettings(vpcSettings.let(CfnMicrosoftAD.VpcSettingsProperty::unwrap))
    }

    /**
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95143ea6926e1690fdecfccada0ff07819d070ee5685d13b3a9aa150069ee637")
    override fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty.Builder.() -> Unit):
        Unit = vpcSettings(CfnMicrosoftAD.VpcSettingsProperty(vpcSettings))

    public fun build(): software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps,
  ) : CdkObject(cdkObject), CfnMicrosoftADProps {
    /**
     * Specifies an alias for a directory and assigns the alias to the directory.
     *
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, AWS CloudFormation does not create an alias.
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias)
     */
    override fun createAlias(): Any? = unwrap(this).getCreateAlias()

    /**
     * AWS Managed Microsoft AD is available in two editions: `Standard` and `Enterprise` .
     *
     * `Enterprise` is the default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition)
     */
    override fun edition(): String? = unwrap(this).getEdition()

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
     */
    override fun enableSso(): Any? = unwrap(this).getEnableSso()

    /**
     * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as
     * `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The password for the default administrative user named `Admin` .
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
     */
    override fun password(): String = unwrap(this).getPassword()

    /**
     * The NetBIOS name for your domain, such as `CORP` .
     *
     * If you don't specify a NetBIOS name, it will default to the first part of your directory DNS.
     * For example, `CORP` for the directory DNS `corp.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
     */
    override fun shortName(): String? = unwrap(this).getShortName()

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     */
    override fun vpcSettings(): Any = unwrap(this).getVpcSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMicrosoftADProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps):
        CfnMicrosoftADProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftADProps):
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps
  }
}
