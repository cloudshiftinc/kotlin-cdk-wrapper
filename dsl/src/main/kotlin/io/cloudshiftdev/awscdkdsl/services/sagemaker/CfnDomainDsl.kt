@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain
import software.constructs.Construct

/**
 * Creates a `Domain` used by Amazon SageMaker Studio.
 *
 * A domain consists of an associated Amazon Elastic File System (EFS) volume, a list of authorized
 * users, and a variety of security, application, policy, and Amazon Virtual Private Cloud (VPC)
 * configurations. Users within a domain can share notebook files and other artifacts with each
 * other.
 *
 * *EFS storage*
 *
 * When a domain is created, an EFS volume is created for use by all of the users within the domain.
 * Each user receives a private home directory within the EFS volume for notebooks, Git
 * repositories, and data files.
 *
 * SageMaker uses the AWS Key Management Service ( AWS KMS) to encrypt the EFS volume attached to
 * the domain with an AWS managed key by default. For more control, you can specify a customer
 * managed key. For more information, see
 * [Protect Data at Rest Using Encryption](https://docs.aws.amazon.com/sagemaker/latest/dg/encryption-at-rest.html)
 * .
 *
 * *VPC configuration*
 *
 * All SageMaker Studio traffic between the domain and the EFS volume is through the specified VPC
 * and subnets. For other Studio traffic, you can specify the `AppNetworkAccessType` parameter.
 * `AppNetworkAccessType` corresponds to the network access type that you choose when you onboard to
 * Studio. The following options are available:
 * * `PublicInternetOnly` - Non-EFS traffic goes through a VPC managed by Amazon SageMaker, which
 *   allows internet access. This is the default value.
 * * `VpcOnly` - All Studio traffic is through the specified VPC and subnets. Internet access is
 *   disabled by default. To allow internet access, you must specify a NAT gateway.
 *
 * When internet access is disabled, you won't be able to run a Studio notebook or to train or host
 * models unless your VPC has an interface endpoint to the SageMaker API and runtime or a NAT
 * gateway and your security groups allow outbound connections.
 *
 * NFS traffic over TCP on port 2049 needs to be allowed in both inbound and outbound rules in order
 * to launch a SageMaker Studio app successfully.
 *
 * For more information, see
 * [Connect SageMaker Studio Notebooks to Resources in a VPC](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-notebooks-and-internet-access.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .authMode("authMode")
 * .defaultUserSettings(UserSettingsProperty.builder()
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
@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly` .
     * * `PublicInternetOnly` - Non-EFS traffic is through a VPC managed by Amazon SageMaker , which
     *   allows direct internet access
     * * `VpcOnly` - All Studio traffic is through the specified VPC and subnets
     *
     * *Valid Values* : `PublicInternetOnly | VpcOnly`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-appnetworkaccesstype)
     *
     * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is
     *   `PublicInternetOnly` .
     */
    public fun appNetworkAccessType(appNetworkAccessType: String) {
        cdkBuilder.appNetworkAccessType(appNetworkAccessType)
    }

    /**
     * The entity that creates and manages the required security groups for inter-app communication
     * in `VpcOnly` mode.
     *
     * Required when `CreateDomain.AppNetworkAccessType` is `VpcOnly` and
     * `DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn` is provided. If
     * setting up the domain for use with RStudio, this value must be set to `Service` .
     *
     * *Allowed Values* : `Service` | `Customer`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-appsecuritygroupmanagement)
     *
     * @param appSecurityGroupManagement The entity that creates and manages the required security
     *   groups for inter-app communication in `VpcOnly` mode.
     */
    public fun appSecurityGroupManagement(appSecurityGroupManagement: String) {
        cdkBuilder.appSecurityGroupManagement(appSecurityGroupManagement)
    }

    /**
     * The mode of authentication that members use to access the Domain.
     *
     * *Valid Values* : `SSO | IAM`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-authmode)
     *
     * @param authMode The mode of authentication that members use to access the Domain.
     */
    public fun authMode(authMode: String) {
        cdkBuilder.authMode(authMode)
    }

    /**
     * A collection of settings that apply to spaces of Amazon SageMaker Studio.
     *
     * These settings are specified when the Create/Update Domain API is called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     *
     * @param defaultSpaceSettings A collection of settings that apply to spaces of Amazon SageMaker
     *   Studio.
     */
    public fun defaultSpaceSettings(defaultSpaceSettings: IResolvable) {
        cdkBuilder.defaultSpaceSettings(defaultSpaceSettings)
    }

    /**
     * A collection of settings that apply to spaces of Amazon SageMaker Studio.
     *
     * These settings are specified when the Create/Update Domain API is called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultspacesettings)
     *
     * @param defaultSpaceSettings A collection of settings that apply to spaces of Amazon SageMaker
     *   Studio.
     */
    public fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty) {
        cdkBuilder.defaultSpaceSettings(defaultSpaceSettings)
    }

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     *
     * @param defaultUserSettings The default user settings.
     */
    public fun defaultUserSettings(defaultUserSettings: IResolvable) {
        cdkBuilder.defaultUserSettings(defaultUserSettings)
    }

    /**
     * The default user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-defaultusersettings)
     *
     * @param defaultUserSettings The default user settings.
     */
    public fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty) {
        cdkBuilder.defaultUserSettings(defaultUserSettings)
    }

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainname)
     *
     * @param domainName The domain name.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     *
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     */
    public fun domainSettings(domainSettings: IResolvable) {
        cdkBuilder.domainSettings(domainSettings)
    }

    /**
     * A collection of settings that apply to the `SageMaker Domain` .
     *
     * These settings are specified through the `CreateDomain` API call.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-domainsettings)
     *
     * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
     */
    public fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty) {
        cdkBuilder.domainSettings(domainSettings)
    }

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
     *
     * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with
     *   an AWS managed customer master key (CMK) by default.
     */
    public fun kmsKeyId(kmsKeyId: String) {
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
     *
     * @param subnetIds The VPC subnets that Studio uses for communication.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
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
     *
     * @param subnetIds The VPC subnets that Studio uses for communication.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
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
     *
     * @param tags Tags to associated with the Domain.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
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
     *
     * @param tags Tags to associated with the Domain.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for communication.
     *
     * *Length Constraints* : Maximum length of 32.
     *
     * *Pattern* : `[-0-9a-zA-Z]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-domain.html#cfn-sagemaker-domain-vpcid)
     *
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for
     *   communication.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnDomain {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
