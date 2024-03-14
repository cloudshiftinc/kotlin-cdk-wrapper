package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The list of tags that a security profile uses to restrict access to resources in Amazon
   * Connect.
   */
  public open fun allowedAccessControlTags(): Any? = unwrap(this).getAllowedAccessControlTags()

  /**
   * The list of tags that a security profile uses to restrict access to resources in Amazon
   * Connect.
   */
  public open fun allowedAccessControlTags(`value`: IResolvable) {
    unwrap(this).setAllowedAccessControlTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of tags that a security profile uses to restrict access to resources in Amazon
   * Connect.
   */
  public open fun allowedAccessControlTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setAllowedAccessControlTags(__idx_ac66f0)
  }

  /**
   * The list of tags that a security profile uses to restrict access to resources in Amazon
   * Connect.
   */
  public open fun allowedAccessControlTags(vararg __idx_ac66f0: Any): Unit =
      allowedAccessControlTags(__idx_ac66f0.toList())

  /**
   * The Amazon Resource Name (ARN) of the security profile.
   */
  public open fun attrSecurityProfileArn(): String = unwrap(this).getAttrSecurityProfileArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the security profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the security profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * Permissions assigned to the security profile.
   */
  public open fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  /**
   * Permissions assigned to the security profile.
   */
  public open fun permissions(`value`: List<String>) {
    unwrap(this).setPermissions(`value`)
  }

  /**
   * Permissions assigned to the security profile.
   */
  public open fun permissions(vararg `value`: String): Unit = permissions(`value`.toList())

  /**
   * The name for the security profile.
   */
  public open fun securityProfileName(): String = unwrap(this).getSecurityProfileName()

  /**
   * The name for the security profile.
   */
  public open fun securityProfileName(`value`: String) {
    unwrap(this).setSecurityProfileName(`value`)
  }

  /**
   * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
   */
  public open fun tagRestrictedResources(): List<String> = unwrap(this).getTagRestrictedResources()
      ?: emptyList()

  /**
   * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
   */
  public open fun tagRestrictedResources(`value`: List<String>) {
    unwrap(this).setTagRestrictedResources(`value`)
  }

  /**
   * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
   */
  public open fun tagRestrictedResources(vararg `value`: String): Unit =
      tagRestrictedResources(`value`.toList())

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnSecurityProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of tags that a security profile uses to restrict access to resources in Amazon
     * Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect. 
     */
    public fun allowedAccessControlTags(allowedAccessControlTags: IResolvable)

    /**
     * The list of tags that a security profile uses to restrict access to resources in Amazon
     * Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect. 
     */
    public fun allowedAccessControlTags(allowedAccessControlTags: List<Any>)

    /**
     * The list of tags that a security profile uses to restrict access to resources in Amazon
     * Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect. 
     */
    public fun allowedAccessControlTags(vararg allowedAccessControlTags: Any)

    /**
     * The description of the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-description)
     * @param description The description of the security profile. 
     */
    public fun description(description: String)

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * Permissions assigned to the security profile.
     *
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-permissions)
     * @param permissions Permissions assigned to the security profile. 
     */
    public fun permissions(permissions: List<String>)

    /**
     * Permissions assigned to the security profile.
     *
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-permissions)
     * @param permissions Permissions assigned to the security profile. 
     */
    public fun permissions(vararg permissions: String)

    /**
     * The name for the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-securityprofilename)
     * @param securityProfileName The name for the security profile. 
     */
    public fun securityProfileName(securityProfileName: String)

    /**
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tagrestrictedresources)
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect. 
     */
    public fun tagRestrictedResources(tagRestrictedResources: List<String>)

    /**
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tagrestrictedresources)
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect. 
     */
    public fun tagRestrictedResources(vararg tagRestrictedResources: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityProfile.Builder =
        software.amazon.awscdk.services.connect.CfnSecurityProfile.Builder.create(scope, id)

    /**
     * The list of tags that a security profile uses to restrict access to resources in Amazon
     * Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect. 
     */
    override fun allowedAccessControlTags(allowedAccessControlTags: IResolvable) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags.let(IResolvable::unwrap))
    }

    /**
     * The list of tags that a security profile uses to restrict access to resources in Amazon
     * Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect. 
     */
    override fun allowedAccessControlTags(allowedAccessControlTags: List<Any>) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags)
    }

    /**
     * The list of tags that a security profile uses to restrict access to resources in Amazon
     * Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect. 
     */
    override fun allowedAccessControlTags(vararg allowedAccessControlTags: Any): Unit =
        allowedAccessControlTags(allowedAccessControlTags.toList())

    /**
     * The description of the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-description)
     * @param description The description of the security profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * Permissions assigned to the security profile.
     *
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-permissions)
     * @param permissions Permissions assigned to the security profile. 
     */
    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * Permissions assigned to the security profile.
     *
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-permissions)
     * @param permissions Permissions assigned to the security profile. 
     */
    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    /**
     * The name for the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-securityprofilename)
     * @param securityProfileName The name for the security profile. 
     */
    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    /**
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tagrestrictedresources)
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect. 
     */
    override fun tagRestrictedResources(tagRestrictedResources: List<String>) {
      cdkBuilder.tagRestrictedResources(tagRestrictedResources)
    }

    /**
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tagrestrictedresources)
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect. 
     */
    override fun tagRestrictedResources(vararg tagRestrictedResources: String): Unit =
        tagRestrictedResources(tagRestrictedResources.toList())

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnSecurityProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfile):
        CfnSecurityProfile = CfnSecurityProfile(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfile):
        software.amazon.awscdk.services.connect.CfnSecurityProfile = wrapped.cdkObject
  }
}
