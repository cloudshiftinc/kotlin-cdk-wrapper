package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUserProfileProps {
  /**
   * The domain ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-domainid)
   */
  public fun domainId(): String

  /**
   * A specifier for the type of value specified in SingleSignOnUserValue.
   *
   * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
   * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this field
   * cannot be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuseridentifier)
   */
  public fun singleSignOnUserIdentifier(): String? = unwrap(this).getSingleSignOnUserIdentifier()

  /**
   * The username of the associated AWS Single Sign-On User for this UserProfile.
   *
   * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
   * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity Center ,
   * this field cannot be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuservalue)
   */
  public fun singleSignOnUserValue(): String? = unwrap(this).getSingleSignOnUserValue()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The user profile name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-userprofilename)
   */
  public fun userProfileName(): String

  /**
   * A collection of settings that apply to users of Amazon SageMaker Studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
   */
  public fun userSettings(): Any? = unwrap(this).getUserSettings()

  /**
   * A builder for [CfnUserProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainId The domain ID. 
     */
    public fun domainId(domainId: String)

    /**
     * @param singleSignOnUserIdentifier A specifier for the type of value specified in
     * SingleSignOnUserValue.
     * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
     * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this
     * field cannot be specified.
     */
    public fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String)

    /**
     * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this
     * UserProfile.
     * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
     * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity Center
     * , this field cannot be specified.
     */
    public fun singleSignOnUserValue(singleSignOnUserValue: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userProfileName The user profile name. 
     */
    public fun userProfileName(userProfileName: String)

    /**
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    public fun userSettings(userSettings: IResolvable)

    /**
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    public fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty)

    /**
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bcf6fd929ae9cd9adb24082a8e008715a7f32f53b602961c419112dbda2b75c")
    public fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnUserProfileProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnUserProfileProps.builder()

    /**
     * @param domainId The domain ID. 
     */
    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    /**
     * @param singleSignOnUserIdentifier A specifier for the type of value specified in
     * SingleSignOnUserValue.
     * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
     * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this
     * field cannot be specified.
     */
    override fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String) {
      cdkBuilder.singleSignOnUserIdentifier(singleSignOnUserIdentifier)
    }

    /**
     * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this
     * UserProfile.
     * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
     * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity Center
     * , this field cannot be specified.
     */
    override fun singleSignOnUserValue(singleSignOnUserValue: String) {
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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userProfileName The user profile name. 
     */
    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    /**
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    override fun userSettings(userSettings: IResolvable) {
      cdkBuilder.userSettings(userSettings.let(IResolvable::unwrap))
    }

    /**
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    override fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty) {
      cdkBuilder.userSettings(userSettings.let(CfnUserProfile.UserSettingsProperty::unwrap))
    }

    /**
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bcf6fd929ae9cd9adb24082a8e008715a7f32f53b602961c419112dbda2b75c")
    override fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty.Builder.() -> Unit):
        Unit = userSettings(CfnUserProfile.UserSettingsProperty(userSettings))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnUserProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfileProps,
  ) : CdkObject(cdkObject), CfnUserProfileProps {
    /**
     * The domain ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-domainid)
     */
    override fun domainId(): String = unwrap(this).getDomainId()

    /**
     * A specifier for the type of value specified in SingleSignOnUserValue.
     *
     * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
     * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this
     * field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuseridentifier)
     */
    override fun singleSignOnUserIdentifier(): String? =
        unwrap(this).getSingleSignOnUserIdentifier()

    /**
     * The username of the associated AWS Single Sign-On User for this UserProfile.
     *
     * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
     * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity Center
     * , this field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuservalue)
     */
    override fun singleSignOnUserValue(): String? = unwrap(this).getSingleSignOnUserValue()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The user profile name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-userprofilename)
     */
    override fun userProfileName(): String = unwrap(this).getUserProfileName()

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     */
    override fun userSettings(): Any? = unwrap(this).getUserSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfileProps):
        CfnUserProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfileProps):
        software.amazon.awscdk.services.sagemaker.CfnUserProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnUserProfileProps
  }
}
