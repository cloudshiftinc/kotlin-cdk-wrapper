@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSecurityProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnSecurityProfileProps cfnSecurityProfileProps = CfnSecurityProfileProps.builder()
 * .instanceArn("instanceArn")
 * .securityProfileName("securityProfileName")
 * // the properties below are optional
 * .allowedAccessControlTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .description("description")
 * .permissions(List.of("permissions"))
 * .tagRestrictedResources(List.of("tagRestrictedResources"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html)
 */
public interface CfnSecurityProfileProps {
  /**
   * The list of tags that a security profile uses to restrict access to resources in Amazon
   * Connect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
   */
  public fun allowedAccessControlTags(): Any? = unwrap(this).getAllowedAccessControlTags()

  /**
   * The description of the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-instancearn)
   */
  public fun instanceArn(): String

  /**
   * Permissions assigned to the security profile.
   *
   * For a list of valid permissions, see [List of security profile
   * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-permissions)
   */
  public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  /**
   * The name for the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-securityprofilename)
   */
  public fun securityProfileName(): String

  /**
   * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tagrestrictedresources)
   */
  public fun tagRestrictedResources(): List<String> = unwrap(this).getTagRestrictedResources() ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSecurityProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect.
     */
    public fun allowedAccessControlTags(allowedAccessControlTags: IResolvable)

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect.
     */
    public fun allowedAccessControlTags(allowedAccessControlTags: List<Any>)

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect.
     */
    public fun allowedAccessControlTags(vararg allowedAccessControlTags: Any)

    /**
     * @param description The description of the security profile.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param permissions Permissions assigned to the security profile.
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     */
    public fun permissions(permissions: List<String>)

    /**
     * @param permissions Permissions assigned to the security profile.
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     */
    public fun permissions(vararg permissions: String)

    /**
     * @param securityProfileName The name for the security profile. 
     */
    public fun securityProfileName(securityProfileName: String)

    /**
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect.
     */
    public fun tagRestrictedResources(tagRestrictedResources: List<String>)

    /**
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect.
     */
    public fun tagRestrictedResources(vararg tagRestrictedResources: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityProfileProps.Builder
        = software.amazon.awscdk.services.connect.CfnSecurityProfileProps.builder()

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect.
     */
    override fun allowedAccessControlTags(allowedAccessControlTags: IResolvable) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags.let(IResolvable::unwrap))
    }

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect.
     */
    override fun allowedAccessControlTags(allowedAccessControlTags: List<Any>) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags)
    }

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     * access to resources in Amazon Connect.
     */
    override fun allowedAccessControlTags(vararg allowedAccessControlTags: Any): Unit =
        allowedAccessControlTags(allowedAccessControlTags.toList())

    /**
     * @param description The description of the security profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param permissions Permissions assigned to the security profile.
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     */
    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * @param permissions Permissions assigned to the security profile.
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     */
    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    /**
     * @param securityProfileName The name for the security profile. 
     */
    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    /**
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect.
     */
    override fun tagRestrictedResources(tagRestrictedResources: List<String>) {
      cdkBuilder.tagRestrictedResources(tagRestrictedResources)
    }

    /**
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     * restrictions to in Amazon Connect.
     */
    override fun tagRestrictedResources(vararg tagRestrictedResources: String): Unit =
        tagRestrictedResources(tagRestrictedResources.toList())

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfileProps,
  ) : CdkObject(cdkObject), CfnSecurityProfileProps {
    /**
     * The list of tags that a security profile uses to restrict access to resources in Amazon
     * Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontroltags)
     */
    override fun allowedAccessControlTags(): Any? = unwrap(this).getAllowedAccessControlTags()

    /**
     * The description of the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * Permissions assigned to the security profile.
     *
     * For a list of valid permissions, see [List of security profile
     * permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-permissions)
     */
    override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    /**
     * The name for the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-securityprofilename)
     */
    override fun securityProfileName(): String = unwrap(this).getSecurityProfileName()

    /**
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tagrestrictedresources)
     */
    override fun tagRestrictedResources(): List<String> = unwrap(this).getTagRestrictedResources()
        ?: emptyList()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfileProps):
        CfnSecurityProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSecurityProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfileProps):
        software.amazon.awscdk.services.connect.CfnSecurityProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnSecurityProfileProps
  }
}
