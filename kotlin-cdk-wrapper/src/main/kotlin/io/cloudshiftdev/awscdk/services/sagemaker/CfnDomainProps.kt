@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
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
public interface CfnDomainProps {
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
   */
  public fun appNetworkAccessType(): String? = unwrap(this).getAppNetworkAccessType()

  /**
   * The entity that creates and manages the required security groups for inter-app communication in
   * `VpcOnly` mode.
   *
   * Required when `CreateDomain.AppNetworkAccessType` is `VpcOnly` and
   * `DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn` is provided. If setting up
   * the domain for use with RStudio, this value must be set to `Service` .
   *
   * *Allowed Values* : `Service` | `Customer`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-appsecuritygroupmanagement)
   */
  public fun appSecurityGroupManagement(): String? = unwrap(this).getAppSecurityGroupManagement()

  /**
   * The mode of authentication that members use to access the Domain.
   *
   * *Valid Values* : `SSO | IAM`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-authmode)
   */
  public fun authMode(): String

  /**
   * A collection of settings that apply to spaces created in the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
   */
  public fun defaultSpaceSettings(): Any? = unwrap(this).getDefaultSpaceSettings()

  /**
   * The default user settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
   */
  public fun defaultUserSettings(): Any

  /**
   * The domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainname)
   */
  public fun domainName(): String

  /**
   * A collection of settings that apply to the `SageMaker Domain` .
   *
   * These settings are specified through the `CreateDomain` API call.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
   */
  public fun domainSettings(): Any? = unwrap(this).getDomainSettings()

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
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

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
   */
  public fun subnetIds(): List<String>

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for communication.
   *
   * *Length Constraints* : Maximum length of 32.
   *
   * *Pattern* : `[-0-9a-zA-Z]+`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is
     * `PublicInternetOnly` .
     * * `PublicInternetOnly` - Non-EFS traffic is through a VPC managed by Amazon SageMaker , which
     * allows direct internet access
     * * `VpcOnly` - All Studio traffic is through the specified VPC and subnets
     *
     * *Valid Values* : `PublicInternetOnly | VpcOnly`
     */
    public fun appNetworkAccessType(appNetworkAccessType: String)

    /**
     * @param appSecurityGroupManagement The entity that creates and manages the required security
     * groups for inter-app communication in `VpcOnly` mode.
     * Required when `CreateDomain.AppNetworkAccessType` is `VpcOnly` and
     * `DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn` is provided. If setting
     * up the domain for use with RStudio, this value must be set to `Service` .
     *
     * *Allowed Values* : `Service` | `Customer`
     */
    public fun appSecurityGroupManagement(appSecurityGroupManagement: String)

    /**
     * @param authMode The mode of authentication that members use to access the Domain. 
     * *Valid Values* : `SSO | IAM`
     */
    public fun authMode(authMode: String)

    /**
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain.
     */
    public fun defaultSpaceSettings(defaultSpaceSettings: IResolvable)

    /**
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain.
     */
    public fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty)

    /**
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d001173177c9a371c53315f8f6c05f9bce841b1b38b146f07a05bd93b5ec8891")
    public
        fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty.Builder.() -> Unit)

    /**
     * @param defaultUserSettings The default user settings. 
     */
    public fun defaultUserSettings(defaultUserSettings: IResolvable)

    /**
     * @param defaultUserSettings The default user settings. 
     */
    public fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty)

    /**
     * @param defaultUserSettings The default user settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b216688dd1e1dcf9052febb0a78ff55b62f044e2f227b44a92ad15b96e79c599")
    public
        fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty.Builder.() -> Unit)

    /**
     * @param domainName The domain name. 
     */
    public fun domainName(domainName: String)

    /**
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     * These settings are specified through the `CreateDomain` API call.
     */
    public fun domainSettings(domainSettings: IResolvable)

    /**
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     * These settings are specified through the `CreateDomain` API call.
     */
    public fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty)

    /**
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     * These settings are specified through the `CreateDomain` API call.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78f87138cd1dc31667ff8090dec708a85e3fccce8bb950d9fd159432af8678e3")
    public fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with
     * an AWS managed customer master key (CMK) by default.
     * For more control, specify a customer managed CMK.
     *
     * *Length Constraints* : Maximum length of 2048.
     *
     * *Pattern* : `.*`
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags Tags to associated with the Domain.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to associated with the Domain.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for
     * communication. 
     * *Length Constraints* : Maximum length of 32.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDomainProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDomainProps.builder()

    /**
     * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is
     * `PublicInternetOnly` .
     * * `PublicInternetOnly` - Non-EFS traffic is through a VPC managed by Amazon SageMaker , which
     * allows direct internet access
     * * `VpcOnly` - All Studio traffic is through the specified VPC and subnets
     *
     * *Valid Values* : `PublicInternetOnly | VpcOnly`
     */
    override fun appNetworkAccessType(appNetworkAccessType: String) {
      cdkBuilder.appNetworkAccessType(appNetworkAccessType)
    }

    /**
     * @param appSecurityGroupManagement The entity that creates and manages the required security
     * groups for inter-app communication in `VpcOnly` mode.
     * Required when `CreateDomain.AppNetworkAccessType` is `VpcOnly` and
     * `DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn` is provided. If setting
     * up the domain for use with RStudio, this value must be set to `Service` .
     *
     * *Allowed Values* : `Service` | `Customer`
     */
    override fun appSecurityGroupManagement(appSecurityGroupManagement: String) {
      cdkBuilder.appSecurityGroupManagement(appSecurityGroupManagement)
    }

    /**
     * @param authMode The mode of authentication that members use to access the Domain. 
     * *Valid Values* : `SSO | IAM`
     */
    override fun authMode(authMode: String) {
      cdkBuilder.authMode(authMode)
    }

    /**
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain.
     */
    override fun defaultSpaceSettings(defaultSpaceSettings: IResolvable) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(IResolvable::unwrap))
    }

    /**
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain.
     */
    override
        fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(CfnDomain.DefaultSpaceSettingsProperty::unwrap))
    }

    /**
     * @param defaultSpaceSettings A collection of settings that apply to spaces created in the
     * domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d001173177c9a371c53315f8f6c05f9bce841b1b38b146f07a05bd93b5ec8891")
    override
        fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty.Builder.() -> Unit):
        Unit = defaultSpaceSettings(CfnDomain.DefaultSpaceSettingsProperty(defaultSpaceSettings))

    /**
     * @param defaultUserSettings The default user settings. 
     */
    override fun defaultUserSettings(defaultUserSettings: IResolvable) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(IResolvable::unwrap))
    }

    /**
     * @param defaultUserSettings The default user settings. 
     */
    override fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(CfnDomain.UserSettingsProperty::unwrap))
    }

    /**
     * @param defaultUserSettings The default user settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b216688dd1e1dcf9052febb0a78ff55b62f044e2f227b44a92ad15b96e79c599")
    override
        fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty.Builder.() -> Unit):
        Unit = defaultUserSettings(CfnDomain.UserSettingsProperty(defaultUserSettings))

    /**
     * @param domainName The domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     * These settings are specified through the `CreateDomain` API call.
     */
    override fun domainSettings(domainSettings: IResolvable) {
      cdkBuilder.domainSettings(domainSettings.let(IResolvable::unwrap))
    }

    /**
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     * These settings are specified through the `CreateDomain` API call.
     */
    override fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty) {
      cdkBuilder.domainSettings(domainSettings.let(CfnDomain.DomainSettingsProperty::unwrap))
    }

    /**
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     * These settings are specified through the `CreateDomain` API call.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78f87138cd1dc31667ff8090dec708a85e3fccce8bb950d9fd159432af8678e3")
    override
        fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty.Builder.() -> Unit):
        Unit = domainSettings(CfnDomain.DomainSettingsProperty(domainSettings))

    /**
     * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with
     * an AWS managed customer master key (CMK) by default.
     * For more control, specify a customer managed CMK.
     *
     * *Length Constraints* : Maximum length of 2048.
     *
     * *Pattern* : `.*`
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The VPC subnets that Studio uses for communication. 
     * *Length Constraints* : Maximum length of 32.
     *
     * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags Tags to associated with the Domain.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags to associated with the Domain.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags
     * are searchable using the Search API.
     *
     * Tags that you specify for the Domain are also added to all apps that are launched in the
     * Domain.
     *
     * *Array members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for
     * communication. 
     * *Length Constraints* : Maximum length of 32.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
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
     */
    override fun appNetworkAccessType(): String? = unwrap(this).getAppNetworkAccessType()

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
     */
    override fun appSecurityGroupManagement(): String? =
        unwrap(this).getAppSecurityGroupManagement()

    /**
     * The mode of authentication that members use to access the Domain.
     *
     * *Valid Values* : `SSO | IAM`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-authmode)
     */
    override fun authMode(): String = unwrap(this).getAuthMode()

    /**
     * A collection of settings that apply to spaces created in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     */
    override fun defaultSpaceSettings(): Any? = unwrap(this).getDefaultSpaceSettings()

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     */
    override fun defaultUserSettings(): Any = unwrap(this).getDefaultUserSettings()

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     */
    override fun domainSettings(): Any? = unwrap(this).getDomainSettings()

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
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

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
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as CfnDomainProps

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.sagemaker.CfnDomainProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnDomainProps
  }
}
