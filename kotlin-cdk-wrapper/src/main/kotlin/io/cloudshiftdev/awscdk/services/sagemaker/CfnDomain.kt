@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a `Domain` .
 *
 * A domain consists of an associated Amazon Elastic File System volume, a list of authorized users,
 * and a variety of security, application, policy, and Amazon Virtual Private Cloud (VPC)
 * configurations. Users within a domain can share notebook files and other artifacts with each other.
 *
 * *EFS storage*
 *
 * When a domain is created, an EFS volume is created for use by all of the users within the domain.
 * Each user receives a private home directory within the EFS volume for notebooks, Git repositories,
 * and data files.
 *
 * SageMaker uses the AWS Key Management Service ( AWS KMS) to encrypt the EFS volume attached to
 * the domain with an AWS managed key by default. For more control, you can specify a customer managed
 * key. For more information, see [Protect Data at Rest Using
 * Encryption](https://docs.aws.amazon.com/sagemaker/latest/dg/encryption-at-rest.html) .
 *
 * *VPC configuration*
 *
 * All traffic between the domain and the Amazon EFS volume is through the specified VPC and
 * subnets. For other traffic, you can specify the `AppNetworkAccessType` parameter.
 * `AppNetworkAccessType` corresponds to the network access type that you choose when you onboard to
 * the domain. The following options are available:
 *
 * * `PublicInternetOnly` - Non-EFS traffic goes through a VPC managed by Amazon SageMaker, which
 * allows internet access. This is the default value.
 * * `VpcOnly` - All traffic is through the specified VPC and subnets. Internet access is disabled
 * by default. To allow internet access, you must specify a NAT gateway.
 *
 * When internet access is disabled, you won't be able to run a Amazon SageMaker Studio notebook or
 * to train or host models unless your VPC has an interface endpoint to the SageMaker API and runtime
 * or a NAT gateway and your security groups allow outbound connections.
 *
 *
 * NFS traffic over TCP on port 2049 needs to be allowed in both inbound and outbound rules in order
 * to launch a Amazon SageMaker Studio app successfully.
 *
 *
 * For more information, see [Connect Amazon SageMaker Studio Notebooks to Resources in a
 * VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-notebooks-and-internet-access.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .authMode("authMode")
 * .defaultUserSettings(UserSettingsProperty.builder()
 * .executionRole("executionRole")
 * // the properties below are optional
 * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
 * .build())
 * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
 * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .fileSystemPath("fileSystemPath")
 * .build())
 * .build()))
 * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .defaultLandingUri("defaultLandingUri")
 * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
 * .codeRepositories(List.of(CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .build()))
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
 * .build())
 * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .rSessionAppSettings(RSessionAppSettingsProperty.builder()
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
 * .accessStatus("accessStatus")
 * .userGroup("userGroup")
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .sharingSettings(SharingSettingsProperty.builder()
 * .notebookOutputOption("notebookOutputOption")
 * .s3KmsKeyId("s3KmsKeyId")
 * .s3OutputPath("s3OutputPath")
 * .build())
 * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
 * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
 * .defaultEbsVolumeSizeInGb(123)
 * .maximumEbsVolumeSizeInGb(123)
 * .build())
 * .build())
 * .studioWebPortal("studioWebPortal")
 * .build())
 * .domainName("domainName")
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * // the properties below are optional
 * .appNetworkAccessType("appNetworkAccessType")
 * .appSecurityGroupManagement("appSecurityGroupManagement")
 * .defaultSpaceSettings(DefaultSpaceSettingsProperty.builder()
 * .executionRole("executionRole")
 * // the properties below are optional
 * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .domainSettings(DomainSettingsProperty.builder()
 * .dockerSettings(DockerSettingsProperty.builder()
 * .enableDockerAccess("enableDockerAccess")
 * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
 * .build())
 * .rStudioServerProDomainSettings(RStudioServerProDomainSettingsProperty.builder()
 * .domainExecutionRoleArn("domainExecutionRoleArn")
 * // the properties below are optional
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .rStudioConnectUrl("rStudioConnectUrl")
 * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
 * .build())
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html)
 */
public open class CfnDomain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Specifies the VPC used for non-EFS traffic.
   *
   * The default value is `PublicInternetOnly` .
   */
  public open fun appNetworkAccessType(): String? = unwrap(this).getAppNetworkAccessType()

  /**
   * Specifies the VPC used for non-EFS traffic.
   *
   * The default value is `PublicInternetOnly` .
   */
  public open fun appNetworkAccessType(`value`: String) {
    unwrap(this).setAppNetworkAccessType(`value`)
  }

  /**
   * The entity that creates and manages the required security groups for inter-app communication in
   * `VpcOnly` mode.
   */
  public open fun appSecurityGroupManagement(): String? =
      unwrap(this).getAppSecurityGroupManagement()

  /**
   * The entity that creates and manages the required security groups for inter-app communication in
   * `VpcOnly` mode.
   */
  public open fun appSecurityGroupManagement(`value`: String) {
    unwrap(this).setAppSecurityGroupManagement(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Domain, such as
   * `arn:aws:sagemaker:us-west-2:account-id:domain/my-domain-name` .
   */
  public open fun attrDomainArn(): String = unwrap(this).getAttrDomainArn()

  /**
   * The Domain ID.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
   */
  public open fun attrHomeEfsFileSystemId(): String = unwrap(this).getAttrHomeEfsFileSystemId()

  /**
   * The ID of the security group that authorizes traffic between the `RSessionGateway` apps and the
   * `RStudioServerPro` app.
   */
  public open fun attrSecurityGroupIdForDomainBoundary(): String =
      unwrap(this).getAttrSecurityGroupIdForDomainBoundary()

  /**
   * The ARN of the application managed by SageMaker in IAM Identity Center.
   *
   * This value is only returned for domains created after October 1, 2023.
   */
  public open fun attrSingleSignOnApplicationArn(): String =
      unwrap(this).getAttrSingleSignOnApplicationArn()

  /**
   * The IAM Identity Center managed application instance ID.
   */
  public open fun attrSingleSignOnManagedApplicationInstanceId(): String =
      unwrap(this).getAttrSingleSignOnManagedApplicationInstanceId()

  /**
   * The URL for the Domain.
   */
  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  /**
   * The mode of authentication that members use to access the Domain.
   */
  public open fun authMode(): String = unwrap(this).getAuthMode()

  /**
   * The mode of authentication that members use to access the Domain.
   */
  public open fun authMode(`value`: String) {
    unwrap(this).setAuthMode(`value`)
  }

  /**
   * A collection of settings that apply to spaces created in the domain.
   */
  public open fun defaultSpaceSettings(): Any? = unwrap(this).getDefaultSpaceSettings()

  /**
   * A collection of settings that apply to spaces created in the domain.
   */
  public open fun defaultSpaceSettings(`value`: IResolvable) {
    unwrap(this).setDefaultSpaceSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * A collection of settings that apply to spaces created in the domain.
   */
  public open fun defaultSpaceSettings(`value`: DefaultSpaceSettingsProperty) {
    unwrap(this).setDefaultSpaceSettings(`value`.let(DefaultSpaceSettingsProperty::unwrap))
  }

  /**
   * A collection of settings that apply to spaces created in the domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8429aaee9219de4fa0172153b1dca8f882dbe27a0aeec0d1a2bf36272c2db21")
  public open fun defaultSpaceSettings(`value`: DefaultSpaceSettingsProperty.Builder.() -> Unit):
      Unit = defaultSpaceSettings(DefaultSpaceSettingsProperty(`value`))

  /**
   * The default user settings.
   */
  public open fun defaultUserSettings(): Any = unwrap(this).getDefaultUserSettings()

  /**
   * The default user settings.
   */
  public open fun defaultUserSettings(`value`: IResolvable) {
    unwrap(this).setDefaultUserSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default user settings.
   */
  public open fun defaultUserSettings(`value`: UserSettingsProperty) {
    unwrap(this).setDefaultUserSettings(`value`.let(UserSettingsProperty::unwrap))
  }

  /**
   * The default user settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("31b09f85c3e6881662d5d2a39f45ea403fd129de3536699ee84ac2b408d07203")
  public open fun defaultUserSettings(`value`: UserSettingsProperty.Builder.() -> Unit): Unit =
      defaultUserSettings(UserSettingsProperty(`value`))

  /**
   * The domain name.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The domain name.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * A collection of settings that apply to the `SageMaker Domain` .
   */
  public open fun domainSettings(): Any? = unwrap(this).getDomainSettings()

  /**
   * A collection of settings that apply to the `SageMaker Domain` .
   */
  public open fun domainSettings(`value`: IResolvable) {
    unwrap(this).setDomainSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * A collection of settings that apply to the `SageMaker Domain` .
   */
  public open fun domainSettings(`value`: DomainSettingsProperty) {
    unwrap(this).setDomainSettings(`value`.let(DomainSettingsProperty::unwrap))
  }

  /**
   * A collection of settings that apply to the `SageMaker Domain` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ff7ad1bcd96a974ac2f849ebceb30dbd7f77ea187306d31d23773d575f544e7")
  public open fun domainSettings(`value`: DomainSettingsProperty.Builder.() -> Unit): Unit =
      domainSettings(DomainSettingsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with an AWS managed
   * customer master key (CMK) by default.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with an AWS managed
   * customer master key (CMK) by default.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The VPC subnets that Studio uses for communication.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The VPC subnets that Studio uses for communication.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The VPC subnets that Studio uses for communication.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags to associated with the Domain.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags to associated with the Domain.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags to associated with the Domain.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for communication.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for communication.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly` .
     *
     * * `PublicInternetOnly` - Non-EFS traffic is through a VPC managed by Amazon SageMaker , which
     * allows direct internet access
     * * `VpcOnly` - All Studio traffic is through the specified VPC and subnets
     *
     * *Valid Values* : `PublicInternetOnly | VpcOnly`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-appnetworkaccesstype)
     * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is
     * `PublicInternetOnly` . 
     */
    public fun appNetworkAccessType(appNetworkAccessType: String)

    /**
     * The entity that creates and manages the required security groups for inter-app communication
     * in `VpcOnly` mode.
     *
     * Required when `CreateDomain.AppNetworkAccessType` is `VpcOnly` and
     * `DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn` is provided. If setting
     * up the domain for use with RStudio, this value must be set to `Service` .
     *
     * *Allowed Values* : `Service` | `Customer`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-appsecuritygroupmanagement)
     * @param appSecurityGroupManagement The entity that creates and manages the required security
     * groups for inter-app communication in `VpcOnly` mode. 
     */
    public fun appSecurityGroupManagement(appSecurityGroupManagement: String)

    /**
     * The mode of authentication that members use to access the Domain.
     *
     * *Valid Values* : `SSO | IAM`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-authmode)
     * @param authMode The mode of authentication that members use to access the Domain. 
     */
    public fun authMode(authMode: String)

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain. 
     */
    public fun defaultSpaceSettings(defaultSpaceSettings: IResolvable)

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain. 
     */
    public fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty)

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0541aea2d9023d83138fd5d19ec34eb6bca50e6dcc332eb676c49b71ec567f81")
    public
        fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty.Builder.() -> Unit)

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     * @param defaultUserSettings The default user settings. 
     */
    public fun defaultUserSettings(defaultUserSettings: IResolvable)

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     * @param defaultUserSettings The default user settings. 
     */
    public fun defaultUserSettings(defaultUserSettings: UserSettingsProperty)

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     * @param defaultUserSettings The default user settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67693a8dc439c00e3a65fd42feb54d1ef2cc19dc96b32eefca9bc368ad820bbe")
    public fun defaultUserSettings(defaultUserSettings: UserSettingsProperty.Builder.() -> Unit)

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainname)
     * @param domainName The domain name. 
     */
    public fun domainName(domainName: String)

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` . 
     */
    public fun domainSettings(domainSettings: IResolvable)

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` . 
     */
    public fun domainSettings(domainSettings: DomainSettingsProperty)

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bc89f7e4a4c3d6a51d1471420dc3788d7f132c548680140caa8cd6b902723c")
    public fun domainSettings(domainSettings: DomainSettingsProperty.Builder.() -> Unit)

    /**
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with an AWS managed
     * customer master key (CMK) by default.
     *
     * For more control, specify a customer managed CMK.
     *
     * *Length Constraints* : Maximum length of 2048.
     *
     * *Pattern* : `.*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-kmskeyid)
     * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with
     * an AWS managed customer master key (CMK) by default. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The VPC subnets that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-subnetids)
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The VPC subnets that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-subnetids)
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * Tags to associated with the Domain.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-tags)
     * @param tags Tags to associated with the Domain. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to associated with the Domain.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-tags)
     * @param tags Tags to associated with the Domain. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-vpcid)
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for
     * communication. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDomain.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDomain.Builder.create(scope, id)

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly` .
     *
     * * `PublicInternetOnly` - Non-EFS traffic is through a VPC managed by Amazon SageMaker , which
     * allows direct internet access
     * * `VpcOnly` - All Studio traffic is through the specified VPC and subnets
     *
     * *Valid Values* : `PublicInternetOnly | VpcOnly`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-appnetworkaccesstype)
     * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is
     * `PublicInternetOnly` . 
     */
    override fun appNetworkAccessType(appNetworkAccessType: String) {
      cdkBuilder.appNetworkAccessType(appNetworkAccessType)
    }

    /**
     * The entity that creates and manages the required security groups for inter-app communication
     * in `VpcOnly` mode.
     *
     * Required when `CreateDomain.AppNetworkAccessType` is `VpcOnly` and
     * `DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn` is provided. If setting
     * up the domain for use with RStudio, this value must be set to `Service` .
     *
     * *Allowed Values* : `Service` | `Customer`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-appsecuritygroupmanagement)
     * @param appSecurityGroupManagement The entity that creates and manages the required security
     * groups for inter-app communication in `VpcOnly` mode. 
     */
    override fun appSecurityGroupManagement(appSecurityGroupManagement: String) {
      cdkBuilder.appSecurityGroupManagement(appSecurityGroupManagement)
    }

    /**
     * The mode of authentication that members use to access the Domain.
     *
     * *Valid Values* : `SSO | IAM`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-authmode)
     * @param authMode The mode of authentication that members use to access the Domain. 
     */
    override fun authMode(authMode: String) {
      cdkBuilder.authMode(authMode)
    }

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain. 
     */
    override fun defaultSpaceSettings(defaultSpaceSettings: IResolvable) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(IResolvable::unwrap))
    }

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain. 
     */
    override fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(DefaultSpaceSettingsProperty::unwrap))
    }

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0541aea2d9023d83138fd5d19ec34eb6bca50e6dcc332eb676c49b71ec567f81")
    override
        fun defaultSpaceSettings(defaultSpaceSettings: DefaultSpaceSettingsProperty.Builder.() -> Unit):
        Unit = defaultSpaceSettings(DefaultSpaceSettingsProperty(defaultSpaceSettings))

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     * @param defaultUserSettings The default user settings. 
     */
    override fun defaultUserSettings(defaultUserSettings: IResolvable) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(IResolvable::unwrap))
    }

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     * @param defaultUserSettings The default user settings. 
     */
    override fun defaultUserSettings(defaultUserSettings: UserSettingsProperty) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(UserSettingsProperty::unwrap))
    }

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     * @param defaultUserSettings The default user settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67693a8dc439c00e3a65fd42feb54d1ef2cc19dc96b32eefca9bc368ad820bbe")
    override fun defaultUserSettings(defaultUserSettings: UserSettingsProperty.Builder.() -> Unit):
        Unit = defaultUserSettings(UserSettingsProperty(defaultUserSettings))

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainname)
     * @param domainName The domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` . 
     */
    override fun domainSettings(domainSettings: IResolvable) {
      cdkBuilder.domainSettings(domainSettings.let(IResolvable::unwrap))
    }

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` . 
     */
    override fun domainSettings(domainSettings: DomainSettingsProperty) {
      cdkBuilder.domainSettings(domainSettings.let(DomainSettingsProperty::unwrap))
    }

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bc89f7e4a4c3d6a51d1471420dc3788d7f132c548680140caa8cd6b902723c")
    override fun domainSettings(domainSettings: DomainSettingsProperty.Builder.() -> Unit): Unit =
        domainSettings(DomainSettingsProperty(domainSettings))

    /**
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with an AWS managed
     * customer master key (CMK) by default.
     *
     * For more control, specify a customer managed CMK.
     *
     * *Length Constraints* : Maximum length of 2048.
     *
     * *Pattern* : `.*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-kmskeyid)
     * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with
     * an AWS managed customer master key (CMK) by default. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The VPC subnets that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-subnetids)
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The VPC subnets that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-subnetids)
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * Tags to associated with the Domain.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-tags)
     * @param tags Tags to associated with the Domain. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags to associated with the Domain.
     *
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-tags)
     * @param tags Tags to associated with the Domain. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-vpcid)
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for
     * communication. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.sagemaker.CfnDomain =
        wrapped.cdkObject
  }

  /**
   * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type
   * that the version runs on.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html)
   */
  public interface ResourceSpecProperty {
    /**
     * The instance type that the image version runs on.
     *
     *
     * *JupyterServer apps* only support the `system` value.
     *
     * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` . KernelGateway
     * apps also support all other values for available instance types.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-lifecycleconfigarn)
     */
    public fun lifecycleConfigArn(): String? = unwrap(this).getLifecycleConfigArn()

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-sagemakerimagearn)
     */
    public fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

    /**
     * The ARN of the image version created on the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-sagemakerimageversionarn)
     */
    public fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()

    /**
     * A builder for [ResourceSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceType The instance type that the image version runs on.
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param lifecycleConfigArn The Amazon Resource Name (ARN) of the Lifecycle Configuration
       * attached to the Resource.
       */
      public fun lifecycleConfigArn(lifecycleConfigArn: String)

      /**
       * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
       */
      public fun sageMakerImageArn(sageMakerImageArn: String)

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       */
      public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty.builder()

      /**
       * @param instanceType The instance type that the image version runs on.
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param lifecycleConfigArn The Amazon Resource Name (ARN) of the Lifecycle Configuration
       * attached to the Resource.
       */
      override fun lifecycleConfigArn(lifecycleConfigArn: String) {
        cdkBuilder.lifecycleConfigArn(lifecycleConfigArn)
      }

      /**
       * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
       */
      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       */
      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty,
    ) : CdkObject(cdkObject), ResourceSpecProperty {
      /**
       * The instance type that the image version runs on.
       *
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-lifecycleconfigarn)
       */
      override fun lifecycleConfigArn(): String? = unwrap(this).getLifecycleConfigArn()

      /**
       * The ARN of the SageMaker image that the image version belongs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-sagemakerimagearn)
       */
      override fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

      /**
       * The ARN of the image version created on the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html#cfn-sagemaker-domain-resourcespec-sagemakerimageversionarn)
       */
      override fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty):
          ResourceSpecProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceSpecProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty
    }
  }

  /**
   * The JupyterServer app settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * JupyterServerAppSettingsProperty jupyterServerAppSettingsProperty =
   * JupyterServerAppSettingsProperty.builder()
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterserverappsettings.html)
   */
  public interface JupyterServerAppSettingsProperty {
    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the JupyterServer app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterserverappsettings.html#cfn-sagemaker-domain-jupyterserverappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * A builder for [JupyterServerAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16529f01fa91e18098e31e0efd963479f78925d3a88a89427ddee33f55f07774")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty.builder()

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16529f01fa91e18098e31e0efd963479f78925d3a88a89427ddee33f55f07774")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty,
    ) : CdkObject(cdkObject), JupyterServerAppSettingsProperty {
      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the JupyterServer app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterserverappsettings.html#cfn-sagemaker-domain-jupyterserverappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterServerAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty):
          JupyterServerAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JupyterServerAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterServerAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty
    }
  }

  /**
   * The KernelGateway app settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * KernelGatewayAppSettingsProperty kernelGatewayAppSettingsProperty =
   * KernelGatewayAppSettingsProperty.builder()
   * .customImages(List.of(CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build()))
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-kernelgatewayappsettings.html)
   */
  public interface KernelGatewayAppSettingsProperty {
    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-kernelgatewayappsettings.html#cfn-sagemaker-domain-kernelgatewayappsettings-customimages)
     */
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the KernelGateway app.
     *
     *
     * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
     * default instance type set here is used when Apps are created using the AWS CLI or AWS
     * CloudFormation and the instance type parameter value is not passed.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-kernelgatewayappsettings.html#cfn-sagemaker-domain-kernelgatewayappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * A builder for [KernelGatewayAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      public fun customImages(customImages: IResolvable)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      public fun customImages(customImages: List<Any>)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      public fun customImages(vararg customImages: Any)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a47ccaafec05cc6573ffbbd54efb5b81febc9dd592ca52e01555b507a1d44cf2")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty.builder()

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable::unwrap))
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages)
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      override fun customImages(vararg customImages: Any): Unit =
          customImages(customImages.toList())

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a47ccaafec05cc6573ffbbd54efb5b81febc9dd592ca52e01555b507a1d44cf2")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty,
    ) : CdkObject(cdkObject), KernelGatewayAppSettingsProperty {
      /**
       * A list of custom SageMaker images that are configured to run as a KernelGateway app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-kernelgatewayappsettings.html#cfn-sagemaker-domain-kernelgatewayappsettings-customimages)
       */
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the KernelGateway app.
       *
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-kernelgatewayappsettings.html#cfn-sagemaker-domain-kernelgatewayappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KernelGatewayAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty):
          KernelGatewayAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KernelGatewayAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty
    }
  }

  /**
   * A collection of settings that apply to the `SageMaker Domain` .
   *
   * These settings are specified through the `CreateDomain` API call.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DomainSettingsProperty domainSettingsProperty = DomainSettingsProperty.builder()
   * .dockerSettings(DockerSettingsProperty.builder()
   * .enableDockerAccess("enableDockerAccess")
   * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
   * .build())
   * .rStudioServerProDomainSettings(RStudioServerProDomainSettingsProperty.builder()
   * .domainExecutionRoleArn("domainExecutionRoleArn")
   * // the properties below are optional
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .rStudioConnectUrl("rStudioConnectUrl")
   * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
   * .build())
   * .securityGroupIds(List.of("securityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html)
   */
  public interface DomainSettingsProperty {
    /**
     * A collection of settings that configure the domain's Docker interaction.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html#cfn-sagemaker-domain-domainsettings-dockersettings)
     */
    public fun dockerSettings(): Any? = unwrap(this).getDockerSettings()

    /**
     * A collection of settings that configure the `RStudioServerPro` Domain-level app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html#cfn-sagemaker-domain-domainsettings-rstudioserverprodomainsettings)
     */
    public fun rStudioServerProDomainSettings(): Any? =
        unwrap(this).getRStudioServerProDomainSettings()

    /**
     * The security groups for the Amazon Virtual Private Cloud that the `Domain` uses for
     * communication between Domain-level apps and user apps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html#cfn-sagemaker-domain-domainsettings-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A builder for [DomainSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dockerSettings A collection of settings that configure the domain's Docker
       * interaction.
       */
      public fun dockerSettings(dockerSettings: IResolvable)

      /**
       * @param dockerSettings A collection of settings that configure the domain's Docker
       * interaction.
       */
      public fun dockerSettings(dockerSettings: DockerSettingsProperty)

      /**
       * @param dockerSettings A collection of settings that configure the domain's Docker
       * interaction.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ef0e9d4e8ab8c25f1dacd8a12798de73fea998b847b67fee5327f6c7af6f6e")
      public fun dockerSettings(dockerSettings: DockerSettingsProperty.Builder.() -> Unit)

      /**
       * @param rStudioServerProDomainSettings A collection of settings that configure the
       * `RStudioServerPro` Domain-level app.
       */
      public fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: IResolvable)

      /**
       * @param rStudioServerProDomainSettings A collection of settings that configure the
       * `RStudioServerPro` Domain-level app.
       */
      public
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty)

      /**
       * @param rStudioServerProDomainSettings A collection of settings that configure the
       * `RStudioServerPro` Domain-level app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("daf8ea9aafb59fc0d391303fa53d911f3d3db72aabed73685861fa5f8fa4501b")
      public
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty.Builder.() -> Unit)

      /**
       * @param securityGroupIds The security groups for the Amazon Virtual Private Cloud that the
       * `Domain` uses for communication between Domain-level apps and user apps.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The security groups for the Amazon Virtual Private Cloud that the
       * `Domain` uses for communication between Domain-level apps and user apps.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty.builder()

      /**
       * @param dockerSettings A collection of settings that configure the domain's Docker
       * interaction.
       */
      override fun dockerSettings(dockerSettings: IResolvable) {
        cdkBuilder.dockerSettings(dockerSettings.let(IResolvable::unwrap))
      }

      /**
       * @param dockerSettings A collection of settings that configure the domain's Docker
       * interaction.
       */
      override fun dockerSettings(dockerSettings: DockerSettingsProperty) {
        cdkBuilder.dockerSettings(dockerSettings.let(DockerSettingsProperty::unwrap))
      }

      /**
       * @param dockerSettings A collection of settings that configure the domain's Docker
       * interaction.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ef0e9d4e8ab8c25f1dacd8a12798de73fea998b847b67fee5327f6c7af6f6e")
      override fun dockerSettings(dockerSettings: DockerSettingsProperty.Builder.() -> Unit): Unit =
          dockerSettings(DockerSettingsProperty(dockerSettings))

      /**
       * @param rStudioServerProDomainSettings A collection of settings that configure the
       * `RStudioServerPro` Domain-level app.
       */
      override fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: IResolvable) {
        cdkBuilder.rStudioServerProDomainSettings(rStudioServerProDomainSettings.let(IResolvable::unwrap))
      }

      /**
       * @param rStudioServerProDomainSettings A collection of settings that configure the
       * `RStudioServerPro` Domain-level app.
       */
      override
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty) {
        cdkBuilder.rStudioServerProDomainSettings(rStudioServerProDomainSettings.let(RStudioServerProDomainSettingsProperty::unwrap))
      }

      /**
       * @param rStudioServerProDomainSettings A collection of settings that configure the
       * `RStudioServerPro` Domain-level app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("daf8ea9aafb59fc0d391303fa53d911f3d3db72aabed73685861fa5f8fa4501b")
      override
          fun rStudioServerProDomainSettings(rStudioServerProDomainSettings: RStudioServerProDomainSettingsProperty.Builder.() -> Unit):
          Unit =
          rStudioServerProDomainSettings(RStudioServerProDomainSettingsProperty(rStudioServerProDomainSettings))

      /**
       * @param securityGroupIds The security groups for the Amazon Virtual Private Cloud that the
       * `Domain` uses for communication between Domain-level apps and user apps.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The security groups for the Amazon Virtual Private Cloud that the
       * `Domain` uses for communication between Domain-level apps and user apps.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty,
    ) : CdkObject(cdkObject), DomainSettingsProperty {
      /**
       * A collection of settings that configure the domain's Docker interaction.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html#cfn-sagemaker-domain-domainsettings-dockersettings)
       */
      override fun dockerSettings(): Any? = unwrap(this).getDockerSettings()

      /**
       * A collection of settings that configure the `RStudioServerPro` Domain-level app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html#cfn-sagemaker-domain-domainsettings-rstudioserverprodomainsettings)
       */
      override fun rStudioServerProDomainSettings(): Any? =
          unwrap(this).getRStudioServerProDomainSettings()

      /**
       * The security groups for the Amazon Virtual Private Cloud that the `Domain` uses for
       * communication between Domain-level apps and user apps.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-domainsettings.html#cfn-sagemaker-domain-domainsettings-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty):
          DomainSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? DomainSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.DomainSettingsProperty
    }
  }

  /**
   * The settings for the JupyterLab application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * JupyterLabAppSettingsProperty jupyterLabAppSettingsProperty =
   * JupyterLabAppSettingsProperty.builder()
   * .codeRepositories(List.of(CodeRepositoryProperty.builder()
   * .repositoryUrl("repositoryUrl")
   * .build()))
   * .customImages(List.of(CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build()))
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html)
   */
  public interface JupyterLabAppSettingsProperty {
    /**
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the
     * JupyterLab application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-coderepositories)
     */
    public fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

    /**
     * A list of custom SageMaker images that are configured to run as a JupyterLab app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-customimages)
     */
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the JupyterLab app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * The Amazon Resource Name (ARN) of the lifecycle configurations attached to the user profile
     * or domain.
     *
     * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-lifecycleconfigarns)
     */
    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    /**
     * A builder for [JupyterLabAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      public fun codeRepositories(codeRepositories: IResolvable)

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      public fun codeRepositories(codeRepositories: List<Any>)

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      public fun codeRepositories(vararg codeRepositories: Any)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      public fun customImages(customImages: IResolvable)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      public fun customImages(customImages: List<Any>)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      public fun customImages(vararg customImages: Any)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("266454404c3559506035e15f27dc96253bd259f3afcf56558668eea5984c9728")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(vararg lifecycleConfigArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty.builder()

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      override fun codeRepositories(codeRepositories: IResolvable) {
        cdkBuilder.codeRepositories(codeRepositories.let(IResolvable::unwrap))
      }

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      override fun codeRepositories(codeRepositories: List<Any>) {
        cdkBuilder.codeRepositories(codeRepositories)
      }

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      override fun codeRepositories(vararg codeRepositories: Any): Unit =
          codeRepositories(codeRepositories.toList())

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable::unwrap))
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages)
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      override fun customImages(vararg customImages: Any): Unit =
          customImages(customImages.toList())

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("266454404c3559506035e15f27dc96253bd259f3afcf56558668eea5984c9728")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(vararg lifecycleConfigArns: String): Unit =
          lifecycleConfigArns(lifecycleConfigArns.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty,
    ) : CdkObject(cdkObject), JupyterLabAppSettingsProperty {
      /**
       * A list of Git repositories that SageMaker automatically displays to users for cloning in
       * the JupyterLab application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-coderepositories)
       */
      override fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

      /**
       * A list of custom SageMaker images that are configured to run as a JupyterLab app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-customimages)
       */
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the JupyterLab app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      /**
       * The Amazon Resource Name (ARN) of the lifecycle configurations attached to the user profile
       * or domain.
       *
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-jupyterlabappsettings.html#cfn-sagemaker-domain-jupyterlabappsettings-lifecycleconfigarns)
       */
      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterLabAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty):
          JupyterLabAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JupyterLabAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterLabAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterLabAppSettingsProperty
    }
  }

  /**
   * A collection of settings that apply to an `RSessionGateway` app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * RSessionAppSettingsProperty rSessionAppSettingsProperty = RSessionAppSettingsProperty.builder()
   * .customImages(List.of(CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build()))
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rsessionappsettings.html)
   */
  public interface RSessionAppSettingsProperty {
    /**
     * A list of custom SageMaker images that are configured to run as a RSession app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rsessionappsettings.html#cfn-sagemaker-domain-rsessionappsettings-customimages)
     */
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rsessionappsettings.html#cfn-sagemaker-domain-rsessionappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * A builder for [RSessionAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * RSession app.
       */
      public fun customImages(customImages: IResolvable)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * RSession app.
       */
      public fun customImages(customImages: List<Any>)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * RSession app.
       */
      public fun customImages(vararg customImages: Any)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a627ac087547f2fa8011456158e16dc224536d2876b05ab54de322e83484b78")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty.builder()

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * RSession app.
       */
      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable::unwrap))
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * RSession app.
       */
      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages)
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * RSession app.
       */
      override fun customImages(vararg customImages: Any): Unit =
          customImages(customImages.toList())

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a627ac087547f2fa8011456158e16dc224536d2876b05ab54de322e83484b78")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty,
    ) : CdkObject(cdkObject), RSessionAppSettingsProperty {
      /**
       * A list of custom SageMaker images that are configured to run as a RSession app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rsessionappsettings.html#cfn-sagemaker-domain-rsessionappsettings-customimages)
       */
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      /**
       * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
       * that the version runs on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rsessionappsettings.html#cfn-sagemaker-domain-rsessionappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RSessionAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty):
          RSessionAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RSessionAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RSessionAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.RSessionAppSettingsProperty
    }
  }

  /**
   * A collection of settings that configure the `RStudioServerPro` Domain-level app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * RStudioServerProDomainSettingsProperty rStudioServerProDomainSettingsProperty =
   * RStudioServerProDomainSettingsProperty.builder()
   * .domainExecutionRoleArn("domainExecutionRoleArn")
   * // the properties below are optional
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .rStudioConnectUrl("rStudioConnectUrl")
   * .rStudioPackageManagerUrl("rStudioPackageManagerUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html)
   */
  public interface RStudioServerProDomainSettingsProperty {
    /**
     * A collection that defines the default `InstanceType` , `SageMakerImageArn` , and
     * `SageMakerImageVersionArn` for the Domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * The ARN of the execution role for the `RStudioServerPro` Domain-level app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-domainexecutionrolearn)
     */
    public fun domainExecutionRoleArn(): String

    /**
     * A URL pointing to an RStudio Connect server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-rstudioconnecturl)
     */
    public fun rStudioConnectUrl(): String? = unwrap(this).getRStudioConnectUrl()

    /**
     * A URL pointing to an RStudio Package Manager server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-rstudiopackagemanagerurl)
     */
    public fun rStudioPackageManagerUrl(): String? = unwrap(this).getRStudioPackageManagerUrl()

    /**
     * A builder for [RStudioServerProDomainSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
       * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
       * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
       * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72a63478d8ec45d9581a7adbbbc76ad8ca6e261c1076d4ddd8e9a5aa058a1698")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      /**
       * @param domainExecutionRoleArn The ARN of the execution role for the `RStudioServerPro`
       * Domain-level app. 
       */
      public fun domainExecutionRoleArn(domainExecutionRoleArn: String)

      /**
       * @param rStudioConnectUrl A URL pointing to an RStudio Connect server.
       */
      public fun rStudioConnectUrl(rStudioConnectUrl: String)

      /**
       * @param rStudioPackageManagerUrl A URL pointing to an RStudio Package Manager server.
       */
      public fun rStudioPackageManagerUrl(rStudioPackageManagerUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty.builder()

      /**
       * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
       * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      /**
       * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
       * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      /**
       * @param defaultResourceSpec A collection that defines the default `InstanceType` ,
       * `SageMakerImageArn` , and `SageMakerImageVersionArn` for the Domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72a63478d8ec45d9581a7adbbbc76ad8ca6e261c1076d4ddd8e9a5aa058a1698")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      /**
       * @param domainExecutionRoleArn The ARN of the execution role for the `RStudioServerPro`
       * Domain-level app. 
       */
      override fun domainExecutionRoleArn(domainExecutionRoleArn: String) {
        cdkBuilder.domainExecutionRoleArn(domainExecutionRoleArn)
      }

      /**
       * @param rStudioConnectUrl A URL pointing to an RStudio Connect server.
       */
      override fun rStudioConnectUrl(rStudioConnectUrl: String) {
        cdkBuilder.rStudioConnectUrl(rStudioConnectUrl)
      }

      /**
       * @param rStudioPackageManagerUrl A URL pointing to an RStudio Package Manager server.
       */
      override fun rStudioPackageManagerUrl(rStudioPackageManagerUrl: String) {
        cdkBuilder.rStudioPackageManagerUrl(rStudioPackageManagerUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty,
    ) : CdkObject(cdkObject), RStudioServerProDomainSettingsProperty {
      /**
       * A collection that defines the default `InstanceType` , `SageMakerImageArn` , and
       * `SageMakerImageVersionArn` for the Domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      /**
       * The ARN of the execution role for the `RStudioServerPro` Domain-level app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-domainexecutionrolearn)
       */
      override fun domainExecutionRoleArn(): String = unwrap(this).getDomainExecutionRoleArn()

      /**
       * A URL pointing to an RStudio Connect server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-rstudioconnecturl)
       */
      override fun rStudioConnectUrl(): String? = unwrap(this).getRStudioConnectUrl()

      /**
       * A URL pointing to an RStudio Package Manager server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverprodomainsettings.html#cfn-sagemaker-domain-rstudioserverprodomainsettings-rstudiopackagemanagerurl)
       */
      override fun rStudioPackageManagerUrl(): String? = unwrap(this).getRStudioPackageManagerUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RStudioServerProDomainSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty):
          RStudioServerProDomainSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RStudioServerProDomainSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RStudioServerProDomainSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProDomainSettingsProperty
    }
  }

  /**
   * A collection of settings that configure the domain's Docker interaction.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DockerSettingsProperty dockerSettingsProperty = DockerSettingsProperty.builder()
   * .enableDockerAccess("enableDockerAccess")
   * .vpcOnlyTrustedAccounts(List.of("vpcOnlyTrustedAccounts"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-dockersettings.html)
   */
  public interface DockerSettingsProperty {
    /**
     * Indicates whether the domain can access Docker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-dockersettings.html#cfn-sagemaker-domain-dockersettings-enabledockeraccess)
     */
    public fun enableDockerAccess(): String? = unwrap(this).getEnableDockerAccess()

    /**
     * The list of AWS accounts that are trusted when the domain is created in VPC-only mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-dockersettings.html#cfn-sagemaker-domain-dockersettings-vpconlytrustedaccounts)
     */
    public fun vpcOnlyTrustedAccounts(): List<String> = unwrap(this).getVpcOnlyTrustedAccounts() ?:
        emptyList()

    /**
     * A builder for [DockerSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableDockerAccess Indicates whether the domain can access Docker.
       */
      public fun enableDockerAccess(enableDockerAccess: String)

      /**
       * @param vpcOnlyTrustedAccounts The list of AWS accounts that are trusted when the domain is
       * created in VPC-only mode.
       */
      public fun vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts: List<String>)

      /**
       * @param vpcOnlyTrustedAccounts The list of AWS accounts that are trusted when the domain is
       * created in VPC-only mode.
       */
      public fun vpcOnlyTrustedAccounts(vararg vpcOnlyTrustedAccounts: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty.builder()

      /**
       * @param enableDockerAccess Indicates whether the domain can access Docker.
       */
      override fun enableDockerAccess(enableDockerAccess: String) {
        cdkBuilder.enableDockerAccess(enableDockerAccess)
      }

      /**
       * @param vpcOnlyTrustedAccounts The list of AWS accounts that are trusted when the domain is
       * created in VPC-only mode.
       */
      override fun vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts: List<String>) {
        cdkBuilder.vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts)
      }

      /**
       * @param vpcOnlyTrustedAccounts The list of AWS accounts that are trusted when the domain is
       * created in VPC-only mode.
       */
      override fun vpcOnlyTrustedAccounts(vararg vpcOnlyTrustedAccounts: String): Unit =
          vpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts.toList())

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty,
    ) : CdkObject(cdkObject), DockerSettingsProperty {
      /**
       * Indicates whether the domain can access Docker.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-dockersettings.html#cfn-sagemaker-domain-dockersettings-enabledockeraccess)
       */
      override fun enableDockerAccess(): String? = unwrap(this).getEnableDockerAccess()

      /**
       * The list of AWS accounts that are trusted when the domain is created in VPC-only mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-dockersettings.html#cfn-sagemaker-domain-dockersettings-vpconlytrustedaccounts)
       */
      override fun vpcOnlyTrustedAccounts(): List<String> = unwrap(this).getVpcOnlyTrustedAccounts()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DockerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty):
          DockerSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? DockerSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DockerSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.DockerSettingsProperty
    }
  }

  /**
   * A collection of settings that configure user interaction with the `RStudioServerPro` app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * RStudioServerProAppSettingsProperty rStudioServerProAppSettingsProperty =
   * RStudioServerProAppSettingsProperty.builder()
   * .accessStatus("accessStatus")
   * .userGroup("userGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverproappsettings.html)
   */
  public interface RStudioServerProAppSettingsProperty {
    /**
     * Indicates whether the current user has access to the `RStudioServerPro` app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverproappsettings.html#cfn-sagemaker-domain-rstudioserverproappsettings-accessstatus)
     */
    public fun accessStatus(): String? = unwrap(this).getAccessStatus()

    /**
     * The level of permissions that the user has within the `RStudioServerPro` app.
     *
     * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
     * Administrative Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverproappsettings.html#cfn-sagemaker-domain-rstudioserverproappsettings-usergroup)
     */
    public fun userGroup(): String? = unwrap(this).getUserGroup()

    /**
     * A builder for [RStudioServerProAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessStatus Indicates whether the current user has access to the `RStudioServerPro`
       * app.
       */
      public fun accessStatus(accessStatus: String)

      /**
       * @param userGroup The level of permissions that the user has within the `RStudioServerPro`
       * app.
       * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
       * Administrative Dashboard.
       */
      public fun userGroup(userGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty.builder()

      /**
       * @param accessStatus Indicates whether the current user has access to the `RStudioServerPro`
       * app.
       */
      override fun accessStatus(accessStatus: String) {
        cdkBuilder.accessStatus(accessStatus)
      }

      /**
       * @param userGroup The level of permissions that the user has within the `RStudioServerPro`
       * app.
       * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
       * Administrative Dashboard.
       */
      override fun userGroup(userGroup: String) {
        cdkBuilder.userGroup(userGroup)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty,
    ) : CdkObject(cdkObject), RStudioServerProAppSettingsProperty {
      /**
       * Indicates whether the current user has access to the `RStudioServerPro` app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverproappsettings.html#cfn-sagemaker-domain-rstudioserverproappsettings-accessstatus)
       */
      override fun accessStatus(): String? = unwrap(this).getAccessStatus()

      /**
       * The level of permissions that the user has within the `RStudioServerPro` app.
       *
       * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
       * Administrative Dashboard.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-rstudioserverproappsettings.html#cfn-sagemaker-domain-rstudioserverproappsettings-usergroup)
       */
      override fun userGroup(): String? = unwrap(this).getUserGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RStudioServerProAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty):
          RStudioServerProAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RStudioServerProAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RStudioServerProAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.RStudioServerProAppSettingsProperty
    }
  }

  /**
   * The settings for assigning a custom file system to a user profile or space for an Amazon
   * SageMaker Domain.
   *
   * Permitted users can access this file system in Amazon SageMaker Studio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CustomFileSystemConfigProperty customFileSystemConfigProperty =
   * CustomFileSystemConfigProperty.builder()
   * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .fileSystemPath("fileSystemPath")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customfilesystemconfig.html)
   */
  public interface CustomFileSystemConfigProperty {
    /**
     * The settings for a custom Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customfilesystemconfig.html#cfn-sagemaker-domain-customfilesystemconfig-efsfilesystemconfig)
     */
    public fun efsFileSystemConfig(): Any? = unwrap(this).getEfsFileSystemConfig()

    /**
     * A builder for [CustomFileSystemConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      public fun efsFileSystemConfig(efsFileSystemConfig: IResolvable)

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      public fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty)

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51d19063b8418bdcc7fb6317565668cc527b6fd40ba7621f9328e0ac5ac8d994")
      public
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty.builder()

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      override fun efsFileSystemConfig(efsFileSystemConfig: IResolvable) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(IResolvable::unwrap))
      }

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      override fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(EFSFileSystemConfigProperty::unwrap))
      }

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51d19063b8418bdcc7fb6317565668cc527b6fd40ba7621f9328e0ac5ac8d994")
      override
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit):
          Unit = efsFileSystemConfig(EFSFileSystemConfigProperty(efsFileSystemConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty,
    ) : CdkObject(cdkObject), CustomFileSystemConfigProperty {
      /**
       * The settings for a custom Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customfilesystemconfig.html#cfn-sagemaker-domain-customfilesystemconfig-efsfilesystemconfig)
       */
      override fun efsFileSystemConfig(): Any? = unwrap(this).getEfsFileSystemConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomFileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty):
          CustomFileSystemConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomFileSystemConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomFileSystemConfigProperty
    }
  }

  /**
   * A custom SageMaker image.
   *
   * For more information, see [Bring your own SageMaker
   * image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CustomImageProperty customImageProperty = CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html)
   */
  public interface CustomImageProperty {
    /**
     * The name of the AppImageConfig.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html#cfn-sagemaker-domain-customimage-appimageconfigname)
     */
    public fun appImageConfigName(): String

    /**
     * The name of the CustomImage.
     *
     * Must be unique to your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html#cfn-sagemaker-domain-customimage-imagename)
     */
    public fun imageName(): String

    /**
     * The version number of the CustomImage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html#cfn-sagemaker-domain-customimage-imageversionnumber)
     */
    public fun imageVersionNumber(): Number? = unwrap(this).getImageVersionNumber()

    /**
     * A builder for [CustomImageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appImageConfigName The name of the AppImageConfig. 
       */
      public fun appImageConfigName(appImageConfigName: String)

      /**
       * @param imageName The name of the CustomImage. 
       * Must be unique to your account.
       */
      public fun imageName(imageName: String)

      /**
       * @param imageVersionNumber The version number of the CustomImage.
       */
      public fun imageVersionNumber(imageVersionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty.builder()

      /**
       * @param appImageConfigName The name of the AppImageConfig. 
       */
      override fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
      }

      /**
       * @param imageName The name of the CustomImage. 
       * Must be unique to your account.
       */
      override fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
      }

      /**
       * @param imageVersionNumber The version number of the CustomImage.
       */
      override fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty,
    ) : CdkObject(cdkObject), CustomImageProperty {
      /**
       * The name of the AppImageConfig.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html#cfn-sagemaker-domain-customimage-appimageconfigname)
       */
      override fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

      /**
       * The name of the CustomImage.
       *
       * Must be unique to your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html#cfn-sagemaker-domain-customimage-imagename)
       */
      override fun imageName(): String = unwrap(this).getImageName()

      /**
       * The version number of the CustomImage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customimage.html#cfn-sagemaker-domain-customimage-imageversionnumber)
       */
      override fun imageVersionNumber(): Number? = unwrap(this).getImageVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomImageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty):
          CustomImageProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomImageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty
    }
  }

  /**
   * A Git repository that SageMaker automatically displays to users for cloning in the
   * JupyterServer application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
   * .repositoryUrl("repositoryUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-coderepository.html)
   */
  public interface CodeRepositoryProperty {
    /**
     * The URL of the Git repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-coderepository.html#cfn-sagemaker-domain-coderepository-repositoryurl)
     */
    public fun repositoryUrl(): String

    /**
     * A builder for [CodeRepositoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositoryUrl The URL of the Git repository. 
       */
      public fun repositoryUrl(repositoryUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty.builder()

      /**
       * @param repositoryUrl The URL of the Git repository. 
       */
      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty,
    ) : CdkObject(cdkObject), CodeRepositoryProperty {
      /**
       * The URL of the Git repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-coderepository.html#cfn-sagemaker-domain-coderepository-repositoryurl)
       */
      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty):
          CodeRepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as? CodeRepositoryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeRepositoryProperty
    }
  }

  /**
   * The settings for assigning a custom Amazon EFS file system to a user profile or space for an
   * Amazon SageMaker Domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * EFSFileSystemConfigProperty eFSFileSystemConfigProperty = EFSFileSystemConfigProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .fileSystemPath("fileSystemPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-efsfilesystemconfig.html)
   */
  public interface EFSFileSystemConfigProperty {
    /**
     * The ID of your Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-efsfilesystemconfig.html#cfn-sagemaker-domain-efsfilesystemconfig-filesystemid)
     */
    public fun fileSystemId(): String

    /**
     * The path to the file system directory that is accessible in Amazon SageMaker Studio.
     *
     * Permitted users can access only this directory and below.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-efsfilesystemconfig.html#cfn-sagemaker-domain-efsfilesystemconfig-filesystempath)
     */
    public fun fileSystemPath(): String? = unwrap(this).getFileSystemPath()

    /**
     * A builder for [EFSFileSystemConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemId The ID of your Amazon EFS file system. 
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param fileSystemPath The path to the file system directory that is accessible in Amazon
       * SageMaker Studio.
       * Permitted users can access only this directory and below.
       */
      public fun fileSystemPath(fileSystemPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty.builder()

      /**
       * @param fileSystemId The ID of your Amazon EFS file system. 
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param fileSystemPath The path to the file system directory that is accessible in Amazon
       * SageMaker Studio.
       * Permitted users can access only this directory and below.
       */
      override fun fileSystemPath(fileSystemPath: String) {
        cdkBuilder.fileSystemPath(fileSystemPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty,
    ) : CdkObject(cdkObject), EFSFileSystemConfigProperty {
      /**
       * The ID of your Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-efsfilesystemconfig.html#cfn-sagemaker-domain-efsfilesystemconfig-filesystemid)
       */
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      /**
       * The path to the file system directory that is accessible in Amazon SageMaker Studio.
       *
       * Permitted users can access only this directory and below.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-efsfilesystemconfig.html#cfn-sagemaker-domain-efsfilesystemconfig-filesystempath)
       */
      override fun fileSystemPath(): String? = unwrap(this).getFileSystemPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EFSFileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty):
          EFSFileSystemConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EFSFileSystemConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.EFSFileSystemConfigProperty
    }
  }

  /**
   * Details about the POSIX identity that is used for file system operations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CustomPosixUserConfigProperty customPosixUserConfigProperty =
   * CustomPosixUserConfigProperty.builder()
   * .gid(123)
   * .uid(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customposixuserconfig.html)
   */
  public interface CustomPosixUserConfigProperty {
    /**
     * The POSIX group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customposixuserconfig.html#cfn-sagemaker-domain-customposixuserconfig-gid)
     */
    public fun gid(): Number

    /**
     * The POSIX user ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customposixuserconfig.html#cfn-sagemaker-domain-customposixuserconfig-uid)
     */
    public fun uid(): Number

    /**
     * A builder for [CustomPosixUserConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gid The POSIX group ID. 
       */
      public fun gid(gid: Number)

      /**
       * @param uid The POSIX user ID. 
       */
      public fun uid(uid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty.builder()

      /**
       * @param gid The POSIX group ID. 
       */
      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      /**
       * @param uid The POSIX user ID. 
       */
      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty,
    ) : CdkObject(cdkObject), CustomPosixUserConfigProperty {
      /**
       * The POSIX group ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customposixuserconfig.html#cfn-sagemaker-domain-customposixuserconfig-gid)
       */
      override fun gid(): Number = unwrap(this).getGid()

      /**
       * The POSIX user ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customposixuserconfig.html#cfn-sagemaker-domain-customposixuserconfig-uid)
       */
      override fun uid(): Number = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPosixUserConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty):
          CustomPosixUserConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomPosixUserConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPosixUserConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.CustomPosixUserConfigProperty
    }
  }

  /**
   * The Code Editor application settings.
   *
   * For more information about Code Editor, see [Get started with Code Editor in Amazon
   * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/code-editor.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CodeEditorAppSettingsProperty codeEditorAppSettingsProperty =
   * CodeEditorAppSettingsProperty.builder()
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-codeeditorappsettings.html)
   */
  public interface CodeEditorAppSettingsProperty {
    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the Code Editor app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-codeeditorappsettings.html#cfn-sagemaker-domain-codeeditorappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * The Amazon Resource Name (ARN) of the Code Editor application lifecycle configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-codeeditorappsettings.html#cfn-sagemaker-domain-codeeditorappsettings-lifecycleconfigarns)
     */
    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    /**
     * A builder for [CodeEditorAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("961a4ba4cd6ca5198b7d476da95436026be65e6edf209e7e7897180d63d719c3")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      public fun lifecycleConfigArns(vararg lifecycleConfigArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty.builder()

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("961a4ba4cd6ca5198b7d476da95436026be65e6edf209e7e7897180d63d719c3")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      override fun lifecycleConfigArns(vararg lifecycleConfigArns: String): Unit =
          lifecycleConfigArns(lifecycleConfigArns.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty,
    ) : CdkObject(cdkObject), CodeEditorAppSettingsProperty {
      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the Code Editor app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-codeeditorappsettings.html#cfn-sagemaker-domain-codeeditorappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      /**
       * The Amazon Resource Name (ARN) of the Code Editor application lifecycle configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-codeeditorappsettings.html#cfn-sagemaker-domain-codeeditorappsettings-lifecycleconfigarns)
       */
      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeEditorAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty):
          CodeEditorAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeEditorAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeEditorAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.CodeEditorAppSettingsProperty
    }
  }

  /**
   * A collection of default EBS storage settings that applies to private spaces created within a
   * domain or user profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DefaultEbsStorageSettingsProperty defaultEbsStorageSettingsProperty =
   * DefaultEbsStorageSettingsProperty.builder()
   * .defaultEbsVolumeSizeInGb(123)
   * .maximumEbsVolumeSizeInGb(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultebsstoragesettings.html)
   */
  public interface DefaultEbsStorageSettingsProperty {
    /**
     * The default size of the EBS storage volume for a private space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultebsstoragesettings.html#cfn-sagemaker-domain-defaultebsstoragesettings-defaultebsvolumesizeingb)
     */
    public fun defaultEbsVolumeSizeInGb(): Number

    /**
     * The maximum size of the EBS storage volume for a private space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultebsstoragesettings.html#cfn-sagemaker-domain-defaultebsstoragesettings-maximumebsvolumesizeingb)
     */
    public fun maximumEbsVolumeSizeInGb(): Number

    /**
     * A builder for [DefaultEbsStorageSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultEbsVolumeSizeInGb The default size of the EBS storage volume for a private
       * space. 
       */
      public fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number)

      /**
       * @param maximumEbsVolumeSizeInGb The maximum size of the EBS storage volume for a private
       * space. 
       */
      public fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty.builder()

      /**
       * @param defaultEbsVolumeSizeInGb The default size of the EBS storage volume for a private
       * space. 
       */
      override fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number) {
        cdkBuilder.defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb)
      }

      /**
       * @param maximumEbsVolumeSizeInGb The maximum size of the EBS storage volume for a private
       * space. 
       */
      override fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number) {
        cdkBuilder.maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty,
    ) : CdkObject(cdkObject), DefaultEbsStorageSettingsProperty {
      /**
       * The default size of the EBS storage volume for a private space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultebsstoragesettings.html#cfn-sagemaker-domain-defaultebsstoragesettings-defaultebsvolumesizeingb)
       */
      override fun defaultEbsVolumeSizeInGb(): Number = unwrap(this).getDefaultEbsVolumeSizeInGb()

      /**
       * The maximum size of the EBS storage volume for a private space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultebsstoragesettings.html#cfn-sagemaker-domain-defaultebsstoragesettings-maximumebsvolumesizeingb)
       */
      override fun maximumEbsVolumeSizeInGb(): Number = unwrap(this).getMaximumEbsVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultEbsStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty):
          DefaultEbsStorageSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultEbsStorageSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultEbsStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultEbsStorageSettingsProperty
    }
  }

  /**
   * A collection of settings that apply to users of Amazon SageMaker Studio.
   *
   * These settings are specified when the
   * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
   * API is called, and as `DefaultUserSettings` when the
   * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
   * API is called.
   *
   * `SecurityGroups` is aggregated when specified in both calls. For all other settings in
   * `UserSettings` , the values specified in `CreateUserProfile` take precedence over those specified
   * in `CreateDomain` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * UserSettingsProperty userSettingsProperty = UserSettingsProperty.builder()
   * .executionRole("executionRole")
   * // the properties below are optional
   * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
   * .build())
   * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
   * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .fileSystemPath("fileSystemPath")
   * .build())
   * .build()))
   * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
   * .gid(123)
   * .uid(123)
   * .build())
   * .defaultLandingUri("defaultLandingUri")
   * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
   * .codeRepositories(List.of(CodeRepositoryProperty.builder()
   * .repositoryUrl("repositoryUrl")
   * .build()))
   * .customImages(List.of(CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build()))
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
   * .build())
   * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build())
   * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
   * .customImages(List.of(CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build()))
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build())
   * .rSessionAppSettings(RSessionAppSettingsProperty.builder()
   * .customImages(List.of(CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build()))
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build())
   * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
   * .accessStatus("accessStatus")
   * .userGroup("userGroup")
   * .build())
   * .securityGroups(List.of("securityGroups"))
   * .sharingSettings(SharingSettingsProperty.builder()
   * .notebookOutputOption("notebookOutputOption")
   * .s3KmsKeyId("s3KmsKeyId")
   * .s3OutputPath("s3OutputPath")
   * .build())
   * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
   * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
   * .defaultEbsVolumeSizeInGb(123)
   * .maximumEbsVolumeSizeInGb(123)
   * .build())
   * .build())
   * .studioWebPortal("studioWebPortal")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html)
   */
  public interface UserSettingsProperty {
    /**
     * The Code Editor application settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-codeeditorappsettings)
     */
    public fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

    /**
     * The settings for assigning a custom file system to a user profile.
     *
     * Permitted users can access this file system in Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-customfilesystemconfigs)
     */
    public fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

    /**
     * Details about the POSIX identity that is used for file system operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-customposixuserconfig)
     */
    public fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

    /**
     * The default experience that the user is directed to when accessing the domain. The supported
     * values are:.
     *
     * * `studio::` : Indicates that Studio is the default experience. This value can only be passed
     * if `StudioWebPortal` is set to `ENABLED` .
     * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-defaultlandinguri)
     */
    public fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

    /**
     * The execution role for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-executionrole)
     */
    public fun executionRole(): String

    /**
     * The settings for the JupyterLab application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-jupyterlabappsettings)
     */
    public fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

    /**
     * The Jupyter server's app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-jupyterserverappsettings)
     */
    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    /**
     * The kernel gateway app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-kernelgatewayappsettings)
     */
    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    /**
     * A collection of settings that configure the `RSessionGateway` app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-rsessionappsettings)
     */
    public fun rSessionAppSettings(): Any? = unwrap(this).getRSessionAppSettings()

    /**
     * A collection of settings that configure user interaction with the `RStudioServerPro` app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-rstudioserverproappsettings)
     */
    public fun rStudioServerProAppSettings(): Any? = unwrap(this).getRStudioServerProAppSettings()

    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for
     * communication.
     *
     * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
     * `PublicInternetOnly` .
     *
     * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` , unless
     * specified as part of the `DefaultUserSettings` for the domain.
     *
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
     * Therefore, the number of security groups that you can specify is one less than the maximum
     * number shown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * Specifies options for sharing Amazon SageMaker Studio notebooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-sharingsettings)
     */
    public fun sharingSettings(): Any? = unwrap(this).getSharingSettings()

    /**
     * The storage settings for a private space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-spacestoragesettings)
     */
    public fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

    /**
     * Whether the user can access Studio.
     *
     * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
     * default experience for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-studiowebportal)
     */
    public fun studioWebPortal(): String? = unwrap(this).getStudioWebPortal()

    /**
     * A builder for [UserSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable)

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      public fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty)

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4efe1cbcf116b00bf28ee2dea6f2e7016d8969fc73b002a063cb1fa3d4de7a47")
      public
          fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      public fun customFileSystemConfigs(customFileSystemConfigs: IResolvable)

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      public fun customFileSystemConfigs(customFileSystemConfigs: List<Any>)

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      public fun customFileSystemConfigs(vararg customFileSystemConfigs: Any)

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      public fun customPosixUserConfig(customPosixUserConfig: IResolvable)

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      public fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty)

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bee93cda65afaeafe67b14506c41615fd81e0789bb79e798e5b9288ffc9fa40")
      public
          fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty.Builder.() -> Unit)

      /**
       * @param defaultLandingUri The default experience that the user is directed to when accessing
       * the domain. The supported values are:.
       * * `studio::` : Indicates that Studio is the default experience. This value can only be
       * passed if `StudioWebPortal` is set to `ENABLED` .
       * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
       */
      public fun defaultLandingUri(defaultLandingUri: String)

      /**
       * @param executionRole The execution role for the user. 
       */
      public fun executionRole(executionRole: String)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      public fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f3b69c867059c09728cf81b6b719b840463a94d379ae6f52619fa454c24c7d4")
      public
          fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5216496e30a90adc157724786ace371107aee769a065a245cacae930fa5b2899")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4d814192f96e3065098606ab1cc4616e36486c9f14952a07ba7f26a3c51370c")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway`
       * app.
       */
      public fun rSessionAppSettings(rSessionAppSettings: IResolvable)

      /**
       * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway`
       * app.
       */
      public fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty)

      /**
       * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway`
       * app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81f78fa82c9334f24ab7a4ad9a3b8a2f1adaf4e91696e79d83a9b27793fabca")
      public
          fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable)

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty)

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbb9e77b11195350c75cd55642c7472fb755619bbe3f65ccbc8780c7b4a8063")
      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      public fun sharingSettings(sharingSettings: IResolvable)

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      public fun sharingSettings(sharingSettings: SharingSettingsProperty)

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c1f110e5a5c496b5a1af40ba1b094eeaa34ed4f7f1f095fd2c54606d0c7b86a")
      public fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit)

      /**
       * @param spaceStorageSettings The storage settings for a private space.
       */
      public fun spaceStorageSettings(spaceStorageSettings: IResolvable)

      /**
       * @param spaceStorageSettings The storage settings for a private space.
       */
      public fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty)

      /**
       * @param spaceStorageSettings The storage settings for a private space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a3aae4112a7de18e3c56555dbe10493634a6f69dfe8f103aab3796ca359b6f1")
      public
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit)

      /**
       * @param studioWebPortal Whether the user can access Studio.
       * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
       * default experience for the domain.
       */
      public fun studioWebPortal(studioWebPortal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty.builder()

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      override fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      override fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(CodeEditorAppSettingsProperty::unwrap))
      }

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4efe1cbcf116b00bf28ee2dea6f2e7016d8969fc73b002a063cb1fa3d4de7a47")
      override
          fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty.Builder.() -> Unit):
          Unit = codeEditorAppSettings(CodeEditorAppSettingsProperty(codeEditorAppSettings))

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      override fun customFileSystemConfigs(customFileSystemConfigs: IResolvable) {
        cdkBuilder.customFileSystemConfigs(customFileSystemConfigs.let(IResolvable::unwrap))
      }

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      override fun customFileSystemConfigs(customFileSystemConfigs: List<Any>) {
        cdkBuilder.customFileSystemConfigs(customFileSystemConfigs)
      }

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      override fun customFileSystemConfigs(vararg customFileSystemConfigs: Any): Unit =
          customFileSystemConfigs(customFileSystemConfigs.toList())

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      override fun customPosixUserConfig(customPosixUserConfig: IResolvable) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig.let(IResolvable::unwrap))
      }

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      override fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig.let(CustomPosixUserConfigProperty::unwrap))
      }

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bee93cda65afaeafe67b14506c41615fd81e0789bb79e798e5b9288ffc9fa40")
      override
          fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty.Builder.() -> Unit):
          Unit = customPosixUserConfig(CustomPosixUserConfigProperty(customPosixUserConfig))

      /**
       * @param defaultLandingUri The default experience that the user is directed to when accessing
       * the domain. The supported values are:.
       * * `studio::` : Indicates that Studio is the default experience. This value can only be
       * passed if `StudioWebPortal` is set to `ENABLED` .
       * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
       */
      override fun defaultLandingUri(defaultLandingUri: String) {
        cdkBuilder.defaultLandingUri(defaultLandingUri)
      }

      /**
       * @param executionRole The execution role for the user. 
       */
      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      override fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      override fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(JupyterLabAppSettingsProperty::unwrap))
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f3b69c867059c09728cf81b6b719b840463a94d379ae6f52619fa454c24c7d4")
      override
          fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty.Builder.() -> Unit):
          Unit = jupyterLabAppSettings(JupyterLabAppSettingsProperty(jupyterLabAppSettings))

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      override fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(JupyterServerAppSettingsProperty::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5216496e30a90adc157724786ace371107aee769a065a245cacae930fa5b2899")
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit):
          Unit =
          jupyterServerAppSettings(JupyterServerAppSettingsProperty(jupyterServerAppSettings))

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      override fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(KernelGatewayAppSettingsProperty::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4d814192f96e3065098606ab1cc4616e36486c9f14952a07ba7f26a3c51370c")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      /**
       * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway`
       * app.
       */
      override fun rSessionAppSettings(rSessionAppSettings: IResolvable) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway`
       * app.
       */
      override fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings.let(RSessionAppSettingsProperty::unwrap))
      }

      /**
       * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway`
       * app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81f78fa82c9334f24ab7a4ad9a3b8a2f1adaf4e91696e79d83a9b27793fabca")
      override
          fun rSessionAppSettings(rSessionAppSettings: RSessionAppSettingsProperty.Builder.() -> Unit):
          Unit = rSessionAppSettings(RSessionAppSettingsProperty(rSessionAppSettings))

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      override fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      override
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(RStudioServerProAppSettingsProperty::unwrap))
      }

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbb9e77b11195350c75cd55642c7472fb755619bbe3f65ccbc8780c7b4a8063")
      override
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty.Builder.() -> Unit):
          Unit =
          rStudioServerProAppSettings(RStudioServerProAppSettingsProperty(rStudioServerProAppSettings))

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      override fun sharingSettings(sharingSettings: IResolvable) {
        cdkBuilder.sharingSettings(sharingSettings.let(IResolvable::unwrap))
      }

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      override fun sharingSettings(sharingSettings: SharingSettingsProperty) {
        cdkBuilder.sharingSettings(sharingSettings.let(SharingSettingsProperty::unwrap))
      }

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c1f110e5a5c496b5a1af40ba1b094eeaa34ed4f7f1f095fd2c54606d0c7b86a")
      override fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit):
          Unit = sharingSettings(SharingSettingsProperty(sharingSettings))

      /**
       * @param spaceStorageSettings The storage settings for a private space.
       */
      override fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(IResolvable::unwrap))
      }

      /**
       * @param spaceStorageSettings The storage settings for a private space.
       */
      override fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(DefaultSpaceStorageSettingsProperty::unwrap))
      }

      /**
       * @param spaceStorageSettings The storage settings for a private space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a3aae4112a7de18e3c56555dbe10493634a6f69dfe8f103aab3796ca359b6f1")
      override
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit):
          Unit = spaceStorageSettings(DefaultSpaceStorageSettingsProperty(spaceStorageSettings))

      /**
       * @param studioWebPortal Whether the user can access Studio.
       * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
       * default experience for the domain.
       */
      override fun studioWebPortal(studioWebPortal: String) {
        cdkBuilder.studioWebPortal(studioWebPortal)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty,
    ) : CdkObject(cdkObject), UserSettingsProperty {
      /**
       * The Code Editor application settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-codeeditorappsettings)
       */
      override fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

      /**
       * The settings for assigning a custom file system to a user profile.
       *
       * Permitted users can access this file system in Amazon SageMaker Studio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-customfilesystemconfigs)
       */
      override fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

      /**
       * Details about the POSIX identity that is used for file system operations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-customposixuserconfig)
       */
      override fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

      /**
       * The default experience that the user is directed to when accessing the domain. The
       * supported values are:.
       *
       * * `studio::` : Indicates that Studio is the default experience. This value can only be
       * passed if `StudioWebPortal` is set to `ENABLED` .
       * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-defaultlandinguri)
       */
      override fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

      /**
       * The execution role for the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-executionrole)
       */
      override fun executionRole(): String = unwrap(this).getExecutionRole()

      /**
       * The settings for the JupyterLab application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-jupyterlabappsettings)
       */
      override fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

      /**
       * The Jupyter server's app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-jupyterserverappsettings)
       */
      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      /**
       * The kernel gateway app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-kernelgatewayappsettings)
       */
      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      /**
       * A collection of settings that configure the `RSessionGateway` app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-rsessionappsettings)
       */
      override fun rSessionAppSettings(): Any? = unwrap(this).getRSessionAppSettings()

      /**
       * A collection of settings that configure user interaction with the `RStudioServerPro` app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-rstudioserverproappsettings)
       */
      override fun rStudioServerProAppSettings(): Any? =
          unwrap(this).getRStudioServerProAppSettings()

      /**
       * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for
       * communication.
       *
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * Specifies options for sharing Amazon SageMaker Studio notebooks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-sharingsettings)
       */
      override fun sharingSettings(): Any? = unwrap(this).getSharingSettings()

      /**
       * The storage settings for a private space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-spacestoragesettings)
       */
      override fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

      /**
       * Whether the user can access Studio.
       *
       * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
       * default experience for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html#cfn-sagemaker-domain-usersettings-studiowebportal)
       */
      override fun studioWebPortal(): String? = unwrap(this).getStudioWebPortal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty):
          UserSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? UserSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty
    }
  }

  /**
   * The default storage settings for a private space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DefaultSpaceStorageSettingsProperty defaultSpaceStorageSettingsProperty =
   * DefaultSpaceStorageSettingsProperty.builder()
   * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
   * .defaultEbsVolumeSizeInGb(123)
   * .maximumEbsVolumeSizeInGb(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacestoragesettings.html)
   */
  public interface DefaultSpaceStorageSettingsProperty {
    /**
     * The default EBS storage settings for a private space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacestoragesettings.html#cfn-sagemaker-domain-defaultspacestoragesettings-defaultebsstoragesettings)
     */
    public fun defaultEbsStorageSettings(): Any? = unwrap(this).getDefaultEbsStorageSettings()

    /**
     * A builder for [DefaultSpaceStorageSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a private space.
       */
      public fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable)

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a private space.
       */
      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty)

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a private space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88b9375c272d3f8eacbde4ab8643a541071d5490c41fe7713e8c92223e3ea688")
      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty.builder()

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a private space.
       */
      override fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(IResolvable::unwrap))
      }

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a private space.
       */
      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(DefaultEbsStorageSettingsProperty::unwrap))
      }

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a private space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88b9375c272d3f8eacbde4ab8643a541071d5490c41fe7713e8c92223e3ea688")
      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit):
          Unit =
          defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty(defaultEbsStorageSettings))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty,
    ) : CdkObject(cdkObject), DefaultSpaceStorageSettingsProperty {
      /**
       * The default EBS storage settings for a private space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacestoragesettings.html#cfn-sagemaker-domain-defaultspacestoragesettings-defaultebsstoragesettings)
       */
      override fun defaultEbsStorageSettings(): Any? = unwrap(this).getDefaultEbsStorageSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultSpaceStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty):
          DefaultSpaceStorageSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultSpaceStorageSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultSpaceStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceStorageSettingsProperty
    }
  }

  /**
   * A collection of settings that apply to spaces created in the domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DefaultSpaceSettingsProperty defaultSpaceSettingsProperty =
   * DefaultSpaceSettingsProperty.builder()
   * .executionRole("executionRole")
   * // the properties below are optional
   * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build())
   * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
   * .customImages(List.of(CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build()))
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build())
   * .securityGroups(List.of("securityGroups"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html)
   */
  public interface DefaultSpaceSettingsProperty {
    /**
     * The ARN of the execution role for the space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-executionrole)
     */
    public fun executionRole(): String

    /**
     * The JupyterServer app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-jupyterserverappsettings)
     */
    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    /**
     * The KernelGateway app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-kernelgatewayappsettings)
     */
    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    /**
     * The security group IDs for the Amazon VPC that the space uses for communication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * A builder for [DefaultSpaceSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionRole The ARN of the execution role for the space. 
       */
      public fun executionRole(executionRole: String)

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05ce34e60196679116a9944bb5f40ddbeceb3301b86e4b3f2dd1541883bf3ee1")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("460295676976450cdae2cda859fd7bce6c46c68c626bdf664e452eb8d49fe133")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param securityGroups The security group IDs for the Amazon VPC that the space uses for
       * communication.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The security group IDs for the Amazon VPC that the space uses for
       * communication.
       */
      public fun securityGroups(vararg securityGroups: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty.builder()

      /**
       * @param executionRole The ARN of the execution role for the space. 
       */
      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      override fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(JupyterServerAppSettingsProperty::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05ce34e60196679116a9944bb5f40ddbeceb3301b86e4b3f2dd1541883bf3ee1")
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit):
          Unit =
          jupyterServerAppSettings(JupyterServerAppSettingsProperty(jupyterServerAppSettings))

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      override fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(IResolvable::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(KernelGatewayAppSettingsProperty::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("460295676976450cdae2cda859fd7bce6c46c68c626bdf664e452eb8d49fe133")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      /**
       * @param securityGroups The security group IDs for the Amazon VPC that the space uses for
       * communication.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The security group IDs for the Amazon VPC that the space uses for
       * communication.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty,
    ) : CdkObject(cdkObject), DefaultSpaceSettingsProperty {
      /**
       * The ARN of the execution role for the space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-executionrole)
       */
      override fun executionRole(): String = unwrap(this).getExecutionRole()

      /**
       * The JupyterServer app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-jupyterserverappsettings)
       */
      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      /**
       * The KernelGateway app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-kernelgatewayappsettings)
       */
      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      /**
       * The security group IDs for the Amazon VPC that the space uses for communication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html#cfn-sagemaker-domain-defaultspacesettings-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultSpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty):
          DefaultSpaceSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultSpaceSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultSpaceSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.DefaultSpaceSettingsProperty
    }
  }

  /**
   * Specifies options when sharing an Amazon SageMaker Studio notebook.
   *
   * These settings are specified as part of `DefaultUserSettings` when the
   * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
   * API is called, and as part of `UserSettings` when the
   * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
   * API is called.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SharingSettingsProperty sharingSettingsProperty = SharingSettingsProperty.builder()
   * .notebookOutputOption("notebookOutputOption")
   * .s3KmsKeyId("s3KmsKeyId")
   * .s3OutputPath("s3OutputPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html)
   */
  public interface SharingSettingsProperty {
    /**
     * Whether to include the notebook cell output when sharing the notebook.
     *
     * The default is `Disabled` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html#cfn-sagemaker-domain-sharingsettings-notebookoutputoption)
     */
    public fun notebookOutputOption(): String? = unwrap(this).getNotebookOutputOption()

    /**
     * When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service (KMS) encryption
     * key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html#cfn-sagemaker-domain-sharingsettings-s3kmskeyid)
     */
    public fun s3KmsKeyId(): String? = unwrap(this).getS3KmsKeyId()

    /**
     * When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to store the shared
     * notebook snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html#cfn-sagemaker-domain-sharingsettings-s3outputpath)
     */
    public fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()

    /**
     * A builder for [SharingSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notebookOutputOption Whether to include the notebook cell output when sharing the
       * notebook.
       * The default is `Disabled` .
       */
      public fun notebookOutputOption(notebookOutputOption: String)

      /**
       * @param s3KmsKeyId When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service
       * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
       */
      public fun s3KmsKeyId(s3KmsKeyId: String)

      /**
       * @param s3OutputPath When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to
       * store the shared notebook snapshots.
       */
      public fun s3OutputPath(s3OutputPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty.builder()

      /**
       * @param notebookOutputOption Whether to include the notebook cell output when sharing the
       * notebook.
       * The default is `Disabled` .
       */
      override fun notebookOutputOption(notebookOutputOption: String) {
        cdkBuilder.notebookOutputOption(notebookOutputOption)
      }

      /**
       * @param s3KmsKeyId When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service
       * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
       */
      override fun s3KmsKeyId(s3KmsKeyId: String) {
        cdkBuilder.s3KmsKeyId(s3KmsKeyId)
      }

      /**
       * @param s3OutputPath When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to
       * store the shared notebook snapshots.
       */
      override fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty,
    ) : CdkObject(cdkObject), SharingSettingsProperty {
      /**
       * Whether to include the notebook cell output when sharing the notebook.
       *
       * The default is `Disabled` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html#cfn-sagemaker-domain-sharingsettings-notebookoutputoption)
       */
      override fun notebookOutputOption(): String? = unwrap(this).getNotebookOutputOption()

      /**
       * When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service (KMS) encryption
       * key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html#cfn-sagemaker-domain-sharingsettings-s3kmskeyid)
       */
      override fun s3KmsKeyId(): String? = unwrap(this).getS3KmsKeyId()

      /**
       * When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to store the shared
       * notebook snapshots.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-sharingsettings.html#cfn-sagemaker-domain-sharingsettings-s3outputpath)
       */
      override fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SharingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty):
          SharingSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? SharingSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharingSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty
    }
  }
}
