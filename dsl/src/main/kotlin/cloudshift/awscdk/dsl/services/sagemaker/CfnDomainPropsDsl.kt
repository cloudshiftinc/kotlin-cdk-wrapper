@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain
import software.amazon.awscdk.services.sagemaker.CfnDomainProps

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
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
public class CfnDomainPropsDsl {
  private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is
   * `PublicInternetOnly` .
   * * `PublicInternetOnly` - Non-EFS traffic is through a VPC managed by Amazon SageMaker , which
   * allows direct internet access
   * * `VpcOnly` - All Studio traffic is through the specified VPC and subnets
   *
   * *Valid Values* : `PublicInternetOnly | VpcOnly`
   */
  public fun appNetworkAccessType(appNetworkAccessType: String) {
    cdkBuilder.appNetworkAccessType(appNetworkAccessType)
  }

  /**
   * @param appSecurityGroupManagement The entity that creates and manages the required security
   * groups for inter-app communication in `VpcOnly` mode.
   * Required when `CreateDomain.AppNetworkAccessType` is `VpcOnly` and
   * `DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn` is provided. If setting up
   * the domain for use with RStudio, this value must be set to `Service` .
   *
   * *Allowed Values* : `Service` | `Customer`
   */
  public fun appSecurityGroupManagement(appSecurityGroupManagement: String) {
    cdkBuilder.appSecurityGroupManagement(appSecurityGroupManagement)
  }

  /**
   * @param authMode The mode of authentication that members use to access the Domain. 
   * *Valid Values* : `SSO | IAM`
   */
  public fun authMode(authMode: String) {
    cdkBuilder.authMode(authMode)
  }

  /**
   * @param defaultSpaceSettings A collection of settings that apply to spaces of Amazon SageMaker
   * Studio.
   * These settings are specified when the Create/Update Domain API is called.
   */
  public fun defaultSpaceSettings(defaultSpaceSettings: IResolvable) {
    cdkBuilder.defaultSpaceSettings(defaultSpaceSettings)
  }

  /**
   * @param defaultSpaceSettings A collection of settings that apply to spaces of Amazon SageMaker
   * Studio.
   * These settings are specified when the Create/Update Domain API is called.
   */
  public fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty) {
    cdkBuilder.defaultSpaceSettings(defaultSpaceSettings)
  }

  /**
   * @param defaultUserSettings The default user settings. 
   */
  public fun defaultUserSettings(defaultUserSettings: IResolvable) {
    cdkBuilder.defaultUserSettings(defaultUserSettings)
  }

  /**
   * @param defaultUserSettings The default user settings. 
   */
  public fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty) {
    cdkBuilder.defaultUserSettings(defaultUserSettings)
  }

  /**
   * @param domainName The domain name. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
   * These settings are specified through the `CreateDomain` API call.
   */
  public fun domainSettings(domainSettings: IResolvable) {
    cdkBuilder.domainSettings(domainSettings)
  }

  /**
   * @param domainSettings A collection of settings that apply to the `SageMaker Domain` .
   * These settings are specified through the `CreateDomain` API call.
   */
  public fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty) {
    cdkBuilder.domainSettings(domainSettings)
  }

  /**
   * @param kmsKeyId SageMaker uses AWS KMS to encrypt the EFS volume attached to the Domain with an
   * AWS managed customer master key (CMK) by default.
   * For more control, specify a customer managed CMK.
   *
   * *Length Constraints* : Maximum length of 2048.
   *
   * *Pattern* : `.*`
   */
  public fun kmsKeyId(kmsKeyId: String) {
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
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The VPC subnets that Studio uses for communication. 
   * *Length Constraints* : Maximum length of 32.
   *
   * *Array members* : Minimum number of 1 item. Maximum number of 16 items.
   *
   * *Pattern* : `[-0-9a-zA-Z]+`
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) that Studio uses for
   * communication. 
   * *Length Constraints* : Maximum length of 32.
   *
   * *Pattern* : `[-0-9a-zA-Z]+`
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnDomainProps {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
