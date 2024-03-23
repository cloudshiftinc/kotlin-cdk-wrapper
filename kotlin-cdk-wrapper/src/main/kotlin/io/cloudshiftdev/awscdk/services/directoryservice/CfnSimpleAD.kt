@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.directoryservice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DirectoryService::SimpleAD` resource specifies an AWS Directory Service Simple Active
 * Directory ( Simple AD ) in AWS so that your directory users and groups can access the AWS Management
 * Console and AWS applications using their existing credentials.
 *
 * Simple AD is a Microsoft Active Directory–compatible directory. For more information, see [Simple
 * Active
 * Directory](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_simple_ad.html)
 * in the *AWS Directory Service Admin Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.directoryservice.*;
 * CfnSimpleAD cfnSimpleAD = CfnSimpleAD.Builder.create(this, "MyCfnSimpleAD")
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
public open class CfnSimpleAD(
  cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleAD,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSimpleADProps,
  ) :
      this(software.amazon.awscdk.services.directoryservice.CfnSimpleAD(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSimpleADProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSimpleADProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSimpleADProps(props)
  )

  /**
   * The alias for a directory.
   *
   * For example: `d-12373a053a` or `alias4-mydirectory-12345abcgmzsk` (if you have the
   * `CreateAlias` property set to true).
   */
  public open fun attrAlias(): String = unwrap(this).getAttrAlias()

  /**
   * The unique identifier for a directory.
   */
  public open fun attrDirectoryId(): String = unwrap(this).getAttrDirectoryId()

  /**
   * The IP addresses of the DNS servers for the directory, such as `[ "172.31.3.154",
   * "172.31.63.203" ]` .
   */
  public open fun attrDnsIpAddresses(): List<String> = unwrap(this).getAttrDnsIpAddresses()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * If set to `true` , specifies an alias for a directory and assigns the alias to the directory.
   */
  public open fun createAlias(): Any? = unwrap(this).getCreateAlias()

  /**
   * If set to `true` , specifies an alias for a directory and assigns the alias to the directory.
   */
  public open fun createAlias(`value`: Boolean) {
    unwrap(this).setCreateAlias(`value`)
  }

  /**
   * If set to `true` , specifies an alias for a directory and assigns the alias to the directory.
   */
  public open fun createAlias(`value`: IResolvable) {
    unwrap(this).setCreateAlias(`value`.let(IResolvable::unwrap))
  }

  /**
   * A description for the directory.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the directory.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Whether to enable single sign-on for a directory.
   */
  public open fun enableSso(): Any? = unwrap(this).getEnableSso()

  /**
   * Whether to enable single sign-on for a directory.
   */
  public open fun enableSso(`value`: Boolean) {
    unwrap(this).setEnableSso(`value`)
  }

  /**
   * Whether to enable single sign-on for a directory.
   */
  public open fun enableSso(`value`: IResolvable) {
    unwrap(this).setEnableSso(`value`.let(IResolvable::unwrap))
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
   * The fully qualified name for the directory, such as `corp.example.com` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The fully qualified name for the directory, such as `corp.example.com` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The password for the directory administrator.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * The password for the directory administrator.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * The NetBIOS name of the directory, such as `CORP` .
   */
  public open fun shortName(): String? = unwrap(this).getShortName()

  /**
   * The NetBIOS name of the directory, such as `CORP` .
   */
  public open fun shortName(`value`: String) {
    unwrap(this).setShortName(`value`)
  }

  /**
   * The size of the directory.
   */
  public open fun size(): String = unwrap(this).getSize()

  /**
   * The size of the directory.
   */
  public open fun size(`value`: String) {
    unwrap(this).setSize(`value`)
  }

  /**
   * A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation.
   */
  public open fun vpcSettings(): Any = unwrap(this).getVpcSettings()

  /**
   * A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation.
   */
  public open fun vpcSettings(`value`: IResolvable) {
    unwrap(this).setVpcSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation.
   */
  public open fun vpcSettings(`value`: VpcSettingsProperty) {
    unwrap(this).setVpcSettings(`value`.let(VpcSettingsProperty::unwrap))
  }

  /**
   * A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47e78bc7646037fe346704e010d125e528573bc695948fa3eccdfe4a53bb7f0e")
  public open fun vpcSettings(`value`: VpcSettingsProperty.Builder.() -> Unit): Unit =
      vpcSettings(VpcSettingsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.directoryservice.CfnSimpleAD].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory. 
     */
    public fun createAlias(createAlias: Boolean)

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
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory. 
     */
    public fun createAlias(createAlias: IResolvable)

    /**
     * A description for the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
     * @param description A description for the directory. 
     */
    public fun description(description: String)

    /**
     * Whether to enable single sign-on for a directory.
     *
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
     * @param enableSso Whether to enable single sign-on for a directory. 
     */
    public fun enableSso(enableSso: Boolean)

    /**
     * Whether to enable single sign-on for a directory.
     *
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
     * @param enableSso Whether to enable single sign-on for a directory. 
     */
    public fun enableSso(enableSso: IResolvable)

    /**
     * The fully qualified name for the directory, such as `corp.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
     * @param name The fully qualified name for the directory, such as `corp.example.com` . 
     */
    public fun name(name: String)

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
     * @param password The password for the directory administrator. 
     */
    public fun password(password: String)

    /**
     * The NetBIOS name of the directory, such as `CORP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
     * @param shortName The NetBIOS name of the directory, such as `CORP` . 
     */
    public fun shortName(shortName: String)

    /**
     * The size of the directory.
     *
     * For valid values, see
     * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     * in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
     * @param size The size of the directory. 
     */
    public fun size(size: String)

    /**
     * A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    public fun vpcSettings(vpcSettings: IResolvable)

    /**
     * A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    public fun vpcSettings(vpcSettings: VpcSettingsProperty)

    /**
     * A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06938425c1880b897c4b7fd462955552bb200383b70970f1a80e0897655bddab")
    public fun vpcSettings(vpcSettings: VpcSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.directoryservice.CfnSimpleAD.Builder =
        software.amazon.awscdk.services.directoryservice.CfnSimpleAD.Builder.create(scope, id)

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
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory. 
     */
    override fun createAlias(createAlias: Boolean) {
      cdkBuilder.createAlias(createAlias)
    }

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
     * @param createAlias If set to `true` , specifies an alias for a directory and assigns the
     * alias to the directory. 
     */
    override fun createAlias(createAlias: IResolvable) {
      cdkBuilder.createAlias(createAlias.let(IResolvable::unwrap))
    }

    /**
     * A description for the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
     * @param description A description for the directory. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Whether to enable single sign-on for a directory.
     *
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
     * @param enableSso Whether to enable single sign-on for a directory. 
     */
    override fun enableSso(enableSso: Boolean) {
      cdkBuilder.enableSso(enableSso)
    }

    /**
     * Whether to enable single sign-on for a directory.
     *
     * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
     * @param enableSso Whether to enable single sign-on for a directory. 
     */
    override fun enableSso(enableSso: IResolvable) {
      cdkBuilder.enableSso(enableSso.let(IResolvable::unwrap))
    }

    /**
     * The fully qualified name for the directory, such as `corp.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
     * @param name The fully qualified name for the directory, such as `corp.example.com` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param password The password for the directory administrator. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * The NetBIOS name of the directory, such as `CORP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
     * @param shortName The NetBIOS name of the directory, such as `CORP` . 
     */
    override fun shortName(shortName: String) {
      cdkBuilder.shortName(shortName)
    }

    /**
     * The size of the directory.
     *
     * For valid values, see
     * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
     * in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
     * @param size The size of the directory. 
     */
    override fun size(size: String) {
      cdkBuilder.size(size)
    }

    /**
     * A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    override fun vpcSettings(vpcSettings: IResolvable) {
      cdkBuilder.vpcSettings(vpcSettings.let(IResolvable::unwrap))
    }

    /**
     * A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    override fun vpcSettings(vpcSettings: VpcSettingsProperty) {
      cdkBuilder.vpcSettings(vpcSettings.let(VpcSettingsProperty::unwrap))
    }

    /**
     * A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
     * @param vpcSettings A
     * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
     * object that contains additional information for the operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06938425c1880b897c4b7fd462955552bb200383b70970f1a80e0897655bddab")
    override fun vpcSettings(vpcSettings: VpcSettingsProperty.Builder.() -> Unit): Unit =
        vpcSettings(VpcSettingsProperty(vpcSettings))

    public fun build(): software.amazon.awscdk.services.directoryservice.CfnSimpleAD =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.directoryservice.CfnSimpleAD.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimpleAD {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimpleAD(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleAD):
        CfnSimpleAD = CfnSimpleAD(cdkObject)

    internal fun unwrap(wrapped: CfnSimpleAD):
        software.amazon.awscdk.services.directoryservice.CfnSimpleAD = wrapped.cdkObject as
        software.amazon.awscdk.services.directoryservice.CfnSimpleAD
  }

  /**
   * Contains VPC information for the
   * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
   * or
   * [CreateMicrosoftAD](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateMicrosoftAD.html)
   * operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.directoryservice.*;
   * VpcSettingsProperty vpcSettingsProperty = VpcSettingsProperty.builder()
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html)
   */
  public interface VpcSettingsProperty {
    /**
     * The identifiers of the subnets for the directory servers.
     *
     * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
     * directory server and a DNS server in each of these subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html#cfn-directoryservice-simplead-vpcsettings-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * The identifier of the VPC in which to create the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html#cfn-directoryservice-simplead-vpcsettings-vpcid)
     */
    public fun vpcId(): String

    /**
     * A builder for [VpcSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param subnetIds The identifiers of the subnets for the directory servers. 
       * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
       * directory server and a DNS server in each of these subnets.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The identifiers of the subnets for the directory servers. 
       * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
       * directory server and a DNS server in each of these subnets.
       */
      public fun subnetIds(vararg subnetIds: String)

      /**
       * @param vpcId The identifier of the VPC in which to create the directory. 
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder =
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.builder()

      /**
       * @param subnetIds The identifiers of the subnets for the directory servers. 
       * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
       * directory server and a DNS server in each of these subnets.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The identifiers of the subnets for the directory servers. 
       * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
       * directory server and a DNS server in each of these subnets.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      /**
       * @param vpcId The identifier of the VPC in which to create the directory. 
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty,
    ) : CdkObject(cdkObject), VpcSettingsProperty {
      /**
       * The identifiers of the subnets for the directory servers.
       *
       * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
       * directory server and a DNS server in each of these subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html#cfn-directoryservice-simplead-vpcsettings-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

      /**
       * The identifier of the VPC in which to create the directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html#cfn-directoryservice-simplead-vpcsettings-vpcid)
       */
      override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty):
          VpcSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcSettingsProperty):
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty
    }
  }
}
