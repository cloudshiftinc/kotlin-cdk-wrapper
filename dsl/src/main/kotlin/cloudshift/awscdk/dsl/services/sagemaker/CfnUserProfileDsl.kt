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
import software.constructs.Construct

/**
 * Creates a user profile.
 *
 * A user profile represents a single user within a domain, and is the main way to reference a
 * "person" for the purposes of sharing, reporting, and other user-oriented features. This entity is
 * created when a user onboards to Amazon SageMaker Studio. If an administrator invites a person by
 * email or imports them from IAM Identity Center , a user profile is automatically created. A user
 * profile is the primary holder of settings for an individual user and has a reference to the
 * user's private Amazon Elastic File System (EFS) home directory.
 *
 * If you're using IAM Identity Center authentication, a user in IAM Identity Center , or a group in
 * IAM Identity Center containing that user, must be assigned to the Amazon SageMaker Studio
 * application from the IAM Identity Center Console to create a user profile. For more information
 * about application assignment, see
 * [Assign user access](https://docs.aws.amazon.com/singlesignon/latest/userguide/assignuserstoapp.html)
 * . After assignment is complete, a user profile can be created for that user in IAM Identity
 * Center with AWS CloudFormation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnUserProfile cfnUserProfile = CfnUserProfile.Builder.create(this, "MyCfnUserProfile")
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
public class CfnUserProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserProfile.Builder = CfnUserProfile.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The domain ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-domainid)
     *
     * @param domainId The domain ID.
     */
    public fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
    }

    /**
     * A specifier for the type of value specified in SingleSignOnUserValue.
     *
     * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
     * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this
     * field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuseridentifier)
     *
     * @param singleSignOnUserIdentifier A specifier for the type of value specified in
     *   SingleSignOnUserValue.
     */
    public fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String) {
        cdkBuilder.singleSignOnUserIdentifier(singleSignOnUserIdentifier)
    }

    /**
     * The username of the associated AWS Single Sign-On User for this UserProfile.
     *
     * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
     * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity
     * Center , this field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuservalue)
     *
     * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this
     *   UserProfile.
     */
    public fun singleSignOnUserValue(singleSignOnUserValue: String) {
        cdkBuilder.singleSignOnUserValue(singleSignOnUserValue)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The user profile name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-userprofilename)
     *
     * @param userProfileName The user profile name.
     */
    public fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
    }

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     *
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    public fun userSettings(userSettings: IResolvable) {
        cdkBuilder.userSettings(userSettings)
    }

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     *
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    public fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty) {
        cdkBuilder.userSettings(userSettings)
    }

    public fun build(): CfnUserProfile {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
