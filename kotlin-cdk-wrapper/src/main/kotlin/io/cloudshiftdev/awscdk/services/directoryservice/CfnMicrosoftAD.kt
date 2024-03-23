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
 * The `AWS::DirectoryService::MicrosoftAD` resource specifies a Microsoft Active Directory in AWS
 * so that your directory users and groups can access the AWS Management Console and AWS applications
 * using their existing credentials.
 *
 * For more information, see [AWS Managed Microsoft
 * AD](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html) in
 * the *AWS Directory Service Admin Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.directoryservice.*;
 * CfnMicrosoftAD cfnMicrosoftAD = CfnMicrosoftAD.Builder.create(this, "MyCfnMicrosoftAD")
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
public open class CfnMicrosoftAD(
  cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMicrosoftADProps,
  ) :
      this(software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMicrosoftADProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMicrosoftADProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMicrosoftADProps(props)
  )

  /**
   * The alias for a directory.
   *
   * For example: `d-12373a053a` or `alias4-mydirectory-12345abcgmzsk` (if you have the
   * `CreateAlias` property set to true).
   */
  public open fun attrAlias(): String = unwrap(this).getAttrAlias()

  /**
   * The IP addresses of the DNS servers for the directory, such as `[ "192.0.2.1", "192.0.2.2" ]` .
   */
  public open fun attrDnsIpAddresses(): List<String> = unwrap(this).getAttrDnsIpAddresses()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies an alias for a directory and assigns the alias to the directory.
   */
  public open fun createAlias(): Any? = unwrap(this).getCreateAlias()

  /**
   * Specifies an alias for a directory and assigns the alias to the directory.
   */
  public open fun createAlias(`value`: Boolean) {
    unwrap(this).setCreateAlias(`value`)
  }

  /**
   * Specifies an alias for a directory and assigns the alias to the directory.
   */
  public open fun createAlias(`value`: IResolvable) {
    unwrap(this).setCreateAlias(`value`.let(IResolvable::unwrap))
  }

  /**
   * AWS Managed Microsoft AD is available in two editions: `Standard` and `Enterprise` .
   */
  public open fun edition(): String? = unwrap(this).getEdition()

  /**
   * AWS Managed Microsoft AD is available in two editions: `Standard` and `Enterprise` .
   */
  public open fun edition(`value`: String) {
    unwrap(this).setEdition(`value`)
  }

  /**
   * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
   */
  public open fun enableSso(): Any? = unwrap(this).getEnableSso()

  /**
   * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
   */
  public open fun enableSso(`value`: Boolean) {
    unwrap(this).setEnableSso(`value`)
  }

  /**
   * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
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
   * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as
   * `corp.example.com` . This name will resolve inside your VPC only. It does not need to be publicly
   * resolvable.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as
   * `corp.example.com` . This name will resolve inside your VPC only. It does not need to be publicly
   * resolvable.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The password for the default administrative user named `Admin` .
   */
  public open fun password(): String = unwrap(this).getPassword()

  /**
   * The password for the default administrative user named `Admin` .
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * The NetBIOS name for your domain, such as `CORP` .
   */
  public open fun shortName(): String? = unwrap(this).getShortName()

  /**
   * The NetBIOS name for your domain, such as `CORP` .
   */
  public open fun shortName(`value`: String) {
    unwrap(this).setShortName(`value`)
  }

  /**
   * Specifies the VPC settings of the Microsoft AD directory server in AWS .
   */
  public open fun vpcSettings(): Any = unwrap(this).getVpcSettings()

  /**
   * Specifies the VPC settings of the Microsoft AD directory server in AWS .
   */
  public open fun vpcSettings(`value`: IResolvable) {
    unwrap(this).setVpcSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the VPC settings of the Microsoft AD directory server in AWS .
   */
  public open fun vpcSettings(`value`: VpcSettingsProperty) {
    unwrap(this).setVpcSettings(`value`.let(VpcSettingsProperty::unwrap))
  }

  /**
   * Specifies the VPC settings of the Microsoft AD directory server in AWS .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ca074bab455425bf1964e80da83b96f13bd0d3fbd336b55cc732fb2a5626353")
  public open fun vpcSettings(`value`: VpcSettingsProperty.Builder.() -> Unit): Unit =
      vpcSettings(VpcSettingsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.directoryservice.CfnMicrosoftAD].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * 
     */
    public fun createAlias(createAlias: Boolean)

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
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * 
     */
    public fun createAlias(createAlias: IResolvable)

    /**
     * AWS Managed Microsoft AD is available in two editions: `Standard` and `Enterprise` .
     *
     * `Enterprise` is the default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition)
     * @param edition AWS Managed Microsoft AD is available in two editions: `Standard` and
     * `Enterprise` . 
     */
    public fun edition(edition: String)

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS . 
     */
    public fun enableSso(enableSso: Boolean)

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS . 
     */
    public fun enableSso(enableSso: IResolvable)

    /**
     * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as
     * `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
     * @param name The fully qualified domain name for the AWS Managed Microsoft AD directory, such
     * as `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable. 
     */
    public fun name(name: String)

    /**
     * The password for the default administrative user named `Admin` .
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
     * @param password The password for the default administrative user named `Admin` . 
     */
    public fun password(password: String)

    /**
     * The NetBIOS name for your domain, such as `CORP` .
     *
     * If you don't specify a NetBIOS name, it will default to the first part of your directory DNS.
     * For example, `CORP` for the directory DNS `corp.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
     * @param shortName The NetBIOS name for your domain, such as `CORP` . 
     */
    public fun shortName(shortName: String)

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    public fun vpcSettings(vpcSettings: IResolvable)

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    public fun vpcSettings(vpcSettings: VpcSettingsProperty)

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2517bf878b722d8257bf82c412000e68a26bc458a8c5dc345dced022bef50eab")
    public fun vpcSettings(vpcSettings: VpcSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.Builder
        = software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.Builder.create(scope, id)

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
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * 
     */
    override fun createAlias(createAlias: Boolean) {
      cdkBuilder.createAlias(createAlias)
    }

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
     * @param createAlias Specifies an alias for a directory and assigns the alias to the directory.
     * 
     */
    override fun createAlias(createAlias: IResolvable) {
      cdkBuilder.createAlias(createAlias.let(IResolvable::unwrap))
    }

    /**
     * AWS Managed Microsoft AD is available in two editions: `Standard` and `Enterprise` .
     *
     * `Enterprise` is the default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-edition)
     * @param edition AWS Managed Microsoft AD is available in two editions: `Standard` and
     * `Enterprise` . 
     */
    override fun edition(edition: String) {
      cdkBuilder.edition(edition)
    }

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS . 
     */
    override fun enableSso(enableSso: Boolean) {
      cdkBuilder.enableSso(enableSso)
    }

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS .
     *
     * Single sign-on allows users in your directory to access certain AWS services from a computer
     * joined to the directory without having to enter their credentials separately. If you don't
     * specify a value, AWS CloudFormation disables single sign-on by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
     * @param enableSso Whether to enable single sign-on for a Microsoft Active Directory in AWS . 
     */
    override fun enableSso(enableSso: IResolvable) {
      cdkBuilder.enableSso(enableSso.let(IResolvable::unwrap))
    }

    /**
     * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as
     * `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
     * @param name The fully qualified domain name for the AWS Managed Microsoft AD directory, such
     * as `corp.example.com` . This name will resolve inside your VPC only. It does not need to be
     * publicly resolvable. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The password for the default administrative user named `Admin` .
     *
     * If you need to change the password for the administrator account, see the
     * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
     * API call in the *AWS Directory Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
     * @param password The password for the default administrative user named `Admin` . 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * The NetBIOS name for your domain, such as `CORP` .
     *
     * If you don't specify a NetBIOS name, it will default to the first part of your directory DNS.
     * For example, `CORP` for the directory DNS `corp.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
     * @param shortName The NetBIOS name for your domain, such as `CORP` . 
     */
    override fun shortName(shortName: String) {
      cdkBuilder.shortName(shortName)
    }

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    override fun vpcSettings(vpcSettings: IResolvable) {
      cdkBuilder.vpcSettings(vpcSettings.let(IResolvable::unwrap))
    }

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    override fun vpcSettings(vpcSettings: VpcSettingsProperty) {
      cdkBuilder.vpcSettings(vpcSettings.let(VpcSettingsProperty::unwrap))
    }

    /**
     * Specifies the VPC settings of the Microsoft AD directory server in AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
     * @param vpcSettings Specifies the VPC settings of the Microsoft AD directory server in AWS . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2517bf878b722d8257bf82c412000e68a26bc458a8c5dc345dced022bef50eab")
    override fun vpcSettings(vpcSettings: VpcSettingsProperty.Builder.() -> Unit): Unit =
        vpcSettings(VpcSettingsProperty(vpcSettings))

    public fun build(): software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMicrosoftAD {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMicrosoftAD(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD):
        CfnMicrosoftAD = CfnMicrosoftAD(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftAD):
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD = wrapped.cdkObject as
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html)
   */
  public interface VpcSettingsProperty {
    /**
     * The identifiers of the subnets for the directory servers.
     *
     * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
     * directory server and a DNS server in each of these subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html#cfn-directoryservice-microsoftad-vpcsettings-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * The identifier of the VPC in which to create the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html#cfn-directoryservice-microsoftad-vpcsettings-vpcid)
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
          software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty.Builder
          =
          software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty.builder()

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
          software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty,
    ) : CdkObject(cdkObject), VpcSettingsProperty {
      /**
       * The identifiers of the subnets for the directory servers.
       *
       * The two subnets must be in different Availability Zones. AWS Directory Service specifies a
       * directory server and a DNS server in each of these subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html#cfn-directoryservice-microsoftad-vpcsettings-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

      /**
       * The identifier of the VPC in which to create the directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html#cfn-directoryservice-microsoftad-vpcsettings-vpcid)
       */
      override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty):
          VpcSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcSettingsProperty):
          software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty
    }
  }
}
