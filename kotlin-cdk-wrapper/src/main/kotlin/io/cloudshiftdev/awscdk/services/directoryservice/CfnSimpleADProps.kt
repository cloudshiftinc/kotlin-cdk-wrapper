@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.directoryservice

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSimpleAD`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.directoryservice.*;
 * CfnSimpleADProps cfnSimpleADProps = CfnSimpleADProps.builder()
 * .name("name")
 * .size("size")
 * .vpcSettings(VpcSettingsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * // the properties below are optional
 * .createAlias(false)
 * .description("description")
 * .enableSso(false)
 * .password("password")
 * .shortName("shortName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html)
 */
public interface CfnSimpleADProps {
  /**
   * If set to `true` , specifies an alias for a directory and assigns the alias to the directory.
   *
   * The alias is used to construct the access URL for the directory, such as
   * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
   *
   *
   * After an alias has been created, it cannot be deleted or reused, so this operation should only
   * be used when absolutely necessary.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias)
   */
  public fun createAlias(): Any? = unwrap(this).getCreateAlias()

  /**
   * A description for the directory.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Whether to enable single sign-on for a directory.
   *
   * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
   */
  public fun enableSso(): Any? = unwrap(this).getEnableSso()

  /**
   * The fully qualified name for the directory, such as `corp.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
   */
  public fun name(): String

  /**
   * The password for the directory administrator.
   *
   * The directory creation process creates a directory administrator account with the user name
   * `Administrator` and this password.
   *
   * If you need to change the password for the administrator account, see the
   * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
   * API call in the *AWS Directory Service API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * The NetBIOS name of the directory, such as `CORP` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
   */
  public fun shortName(): String? = unwrap(this).getShortName()

  /**
   * The size of the directory.
   *
   * For valid values, see
   * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
   * in the *AWS Directory Service API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
   */
  public fun size(): String

  /**
   * A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
   */
  public fun vpcSettings(): Any

  /**
   * A builder for [CfnSimpleADProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: Boolean)

    /**
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    public fun createAlias(createAlias: IResolvable)

    /**
     * @param description A description for the directory.
     */
    public fun description(description: String)

    /**
     * @param enableSso Whether to enable single sign-on for a directory.
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: Boolean)

    /**
     * @param enableSso Whether to enable single sign-on for a directory.
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     */
    public fun enableSso(enableSso: IResolvable)

    /**
     * @param name The fully qualified name for the directory, such as `corp.example.com` . 
     */
    public fun name(name: String)

    /**
     * @param password The password for the directory administrator.
     * The directory creation process creates a directory administrator account with the user name
     * `Administrator` and this password.
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     */
    public fun password(password: String)

    /**
     * @param shortName The NetBIOS name of the directory, such as `CORP` .
     */
    public fun shortName(shortName: String)

    /**
     * @param size The size of the directory. 
     * For valid values, see
     * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     * in the *AWS Directory Service API Reference* .
     */
    public fun size(size: String)

    /**
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    public fun vpcSettings(vpcSettings: IResolvable)

    /**
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    public fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty)

    /**
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("530911a8d5febb9ead01961f40fc63e78b7dfbab76256c6b2e988fd801b36300")
    public fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder =
        software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.builder()

    /**
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    override fun createAlias(createAlias: Boolean) {
      cdkBuilder.createAlias(createAlias)
    }

    /**
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     */
    override fun createAlias(createAlias: IResolvable) {
      cdkBuilder.createAlias(createAlias.let(IResolvable::unwrap))
    }

    /**
     * @param description A description for the directory.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a directory.
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     */
    override fun enableSso(enableSso: Boolean) {
      cdkBuilder.enableSso(enableSso)
    }

    /**
     * @param enableSso Whether to enable single sign-on for a directory.
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     */
    override fun enableSso(enableSso: IResolvable) {
      cdkBuilder.enableSso(enableSso.let(IResolvable::unwrap))
    }

    /**
     * @param name The fully qualified name for the directory, such as `corp.example.com` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param password The password for the directory administrator.
     * The directory creation process creates a directory administrator account with the user name
     * `Administrator` and this password.
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param shortName The NetBIOS name of the directory, such as `CORP` .
     */
    override fun shortName(shortName: String) {
      cdkBuilder.shortName(shortName)
    }

    /**
     * @param size The size of the directory. 
     * For valid values, see
     * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     * in the *AWS Directory Service API Reference* .
     */
    override fun size(size: String) {
      cdkBuilder.size(size)
    }

    /**
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    override fun vpcSettings(vpcSettings: IResolvable) {
      cdkBuilder.vpcSettings(vpcSettings.let(IResolvable::unwrap))
    }

    /**
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    override fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty) {
      cdkBuilder.vpcSettings(vpcSettings.let(CfnSimpleAD.VpcSettingsProperty::unwrap))
    }

    /**
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("530911a8d5febb9ead01961f40fc63e78b7dfbab76256c6b2e988fd801b36300")
    override fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty.Builder.() -> Unit): Unit
        = vpcSettings(CfnSimpleAD.VpcSettingsProperty(vpcSettings))

    public fun build(): software.amazon.awscdk.services.directoryservice.CfnSimpleADProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleADProps,
  ) : CdkObject(cdkObject), CfnSimpleADProps {
    /**
     * If set to `true` , specifies an alias for a directory and assigns the alias to the directory.
     *
     * The alias is used to construct the access URL for the directory, such as
     * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
     *
     *
     * After an alias has been created, it cannot be deleted or reused, so this operation should
     * only be used when absolutely necessary.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias)
     */
    override fun createAlias(): Any? = unwrap(this).getCreateAlias()

    /**
     * A description for the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Whether to enable single sign-on for a directory.
     *
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
     */
    override fun enableSso(): Any? = unwrap(this).getEnableSso()

    /**
     * The fully qualified name for the directory, such as `corp.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The password for the directory administrator.
     *
     * The directory creation process creates a directory administrator account with the user name
     * `Administrator` and this password.
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

    /**
     * The NetBIOS name of the directory, such as `CORP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
     */
    override fun shortName(): String? = unwrap(this).getShortName()

    /**
     * The size of the directory.
     *
     * For valid values, see
     * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     * in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
     */
    override fun size(): String = unwrap(this).getSize()

    /**
     * A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
     */
    override fun vpcSettings(): Any = unwrap(this).getVpcSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimpleADProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleADProps):
        CfnSimpleADProps = CdkObjectWrappers.wrap(cdkObject) as CfnSimpleADProps

    internal fun unwrap(wrapped: CfnSimpleADProps):
        software.amazon.awscdk.services.directoryservice.CfnSimpleADProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
  }
}
