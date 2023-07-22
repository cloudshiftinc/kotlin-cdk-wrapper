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
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.amazon.awscdk.services.sagemaker.CfnUserProfileProps

/**
 * Properties for defining a `CfnUserProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnUserProfileProps cfnUserProfileProps = CfnUserProfileProps.builder()
 * .domainId("domainId")
 * .userProfileName("userProfileName")
 * // the properties below are optional
 * .singleSignOnUserIdentifier("singleSignOnUserIdentifier")
 * .singleSignOnUserValue("singleSignOnUserValue")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userSettings(UserSettingsProperty.builder()
 * .executionRole("executionRole")
 * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html)
 */
@CdkDslMarker
public class CfnUserProfilePropsDsl {
  private val cdkBuilder: CfnUserProfileProps.Builder = CfnUserProfileProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param domainId The domain ID. 
   */
  public fun domainId(domainId: String) {
    cdkBuilder.domainId(domainId)
  }

  /**
   * @param singleSignOnUserIdentifier A specifier for the type of value specified in
   * SingleSignOnUserValue.
   * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
   * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this field
   * cannot be specified.
   */
  public fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String) {
    cdkBuilder.singleSignOnUserIdentifier(singleSignOnUserIdentifier)
  }

  /**
   * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this
   * UserProfile.
   * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
   * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity Center ,
   * this field cannot be specified.
   */
  public fun singleSignOnUserValue(singleSignOnUserValue: String) {
    cdkBuilder.singleSignOnUserValue(singleSignOnUserValue)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * Tags that you specify for the User Profile are also added to all apps that the User Profile
   * launches.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * Tags that you specify for the User Profile are also added to all apps that the User Profile
   * launches.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param userProfileName The user profile name. 
   */
  public fun userProfileName(userProfileName: String) {
    cdkBuilder.userProfileName(userProfileName)
  }

  /**
   * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
   */
  public fun userSettings(userSettings: IResolvable) {
    cdkBuilder.userSettings(userSettings)
  }

  /**
   * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
   */
  public fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty) {
    cdkBuilder.userSettings(userSettings)
  }

  public fun build(): CfnUserProfileProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
