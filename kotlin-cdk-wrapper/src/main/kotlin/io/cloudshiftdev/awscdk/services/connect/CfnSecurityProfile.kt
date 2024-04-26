@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a security profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnSecurityProfile cfnSecurityProfile = CfnSecurityProfile.Builder.create(this,
 * "MyCfnSecurityProfile")
 * .instanceArn("instanceArn")
 * .securityProfileName("securityProfileName")
 * // the properties below are optional
 * .allowedAccessControlHierarchyGroupId("allowedAccessControlHierarchyGroupId")
 * .allowedAccessControlTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .applications(List.of(ApplicationProperty.builder()
 * .applicationPermissions(List.of("applicationPermissions"))
 * .namespace("namespace")
 * .build()))
 * .description("description")
 * .hierarchyRestrictedResources(List.of("hierarchyRestrictedResources"))
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
public open class CfnSecurityProfile(
  cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityProfileProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnSecurityProfile(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSecurityProfileProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityProfileProps(props)
  )

  /**
   * The identifier of the hierarchy group that a security profile uses to restrict access to
   * resources in Amazon Connect.
   */
  public open fun allowedAccessControlHierarchyGroupId(): String? =
      unwrap(this).getAllowedAccessControlHierarchyGroupId()

  /**
   * The identifier of the hierarchy group that a security profile uses to restrict access to
   * resources in Amazon Connect.
   */
  public open fun allowedAccessControlHierarchyGroupId(`value`: String) {
    unwrap(this).setAllowedAccessControlHierarchyGroupId(`value`)
  }

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
  public open fun allowedAccessControlTags(`value`: List<Any>) {
    unwrap(this).setAllowedAccessControlTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The list of tags that a security profile uses to restrict access to resources in Amazon
   * Connect.
   */
  public open fun allowedAccessControlTags(vararg `value`: Any): Unit =
      allowedAccessControlTags(`value`.toList())

  /**
   * A list of third-party applications that the security profile will give access to.
   */
  public open fun applications(): Any? = unwrap(this).getApplications()

  /**
   * A list of third-party applications that the security profile will give access to.
   */
  public open fun applications(`value`: IResolvable) {
    unwrap(this).setApplications(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of third-party applications that the security profile will give access to.
   */
  public open fun applications(`value`: List<Any>) {
    unwrap(this).setApplications(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of third-party applications that the security profile will give access to.
   */
  public open fun applications(vararg `value`: Any): Unit = applications(`value`.toList())

  /**
   * The AWS Region where this resource was last modified.
   */
  public open fun attrLastModifiedRegion(): String = unwrap(this).getAttrLastModifiedRegion()

  /**
   * The timestamp when this resource was last modified.
   */
  public open fun attrLastModifiedTime(): IResolvable =
      unwrap(this).getAttrLastModifiedTime().let(IResolvable::wrap)

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
   * The list of resources that a security profile applies hierarchy restrictions to in Amazon
   * Connect.
   */
  public open fun hierarchyRestrictedResources(): List<String> =
      unwrap(this).getHierarchyRestrictedResources() ?: emptyList()

  /**
   * The list of resources that a security profile applies hierarchy restrictions to in Amazon
   * Connect.
   */
  public open fun hierarchyRestrictedResources(`value`: List<String>) {
    unwrap(this).setHierarchyRestrictedResources(`value`)
  }

  /**
   * The list of resources that a security profile applies hierarchy restrictions to in Amazon
   * Connect.
   */
  public open fun hierarchyRestrictedResources(vararg `value`: String): Unit =
      hierarchyRestrictedResources(`value`.toList())

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
     * The identifier of the hierarchy group that a security profile uses to restrict access to
     * resources in Amazon Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontrolhierarchygroupid)
     * @param allowedAccessControlHierarchyGroupId The identifier of the hierarchy group that a
     * security profile uses to restrict access to resources in Amazon Connect. 
     */
    public fun allowedAccessControlHierarchyGroupId(allowedAccessControlHierarchyGroupId: String)

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
     * A list of third-party applications that the security profile will give access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-applications)
     * @param applications A list of third-party applications that the security profile will give
     * access to. 
     */
    public fun applications(applications: IResolvable)

    /**
     * A list of third-party applications that the security profile will give access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-applications)
     * @param applications A list of third-party applications that the security profile will give
     * access to. 
     */
    public fun applications(applications: List<Any>)

    /**
     * A list of third-party applications that the security profile will give access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-applications)
     * @param applications A list of third-party applications that the security profile will give
     * access to. 
     */
    public fun applications(vararg applications: Any)

    /**
     * The description of the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-description)
     * @param description The description of the security profile. 
     */
    public fun description(description: String)

    /**
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon
     * Connect.
     *
     * Following are acceptable ResourceNames: `User` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-hierarchyrestrictedresources)
     * @param hierarchyRestrictedResources The list of resources that a security profile applies
     * hierarchy restrictions to in Amazon Connect. 
     */
    public fun hierarchyRestrictedResources(hierarchyRestrictedResources: List<String>)

    /**
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon
     * Connect.
     *
     * Following are acceptable ResourceNames: `User` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-hierarchyrestrictedresources)
     * @param hierarchyRestrictedResources The list of resources that a security profile applies
     * hierarchy restrictions to in Amazon Connect. 
     */
    public fun hierarchyRestrictedResources(vararg hierarchyRestrictedResources: String)

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
     * The identifier of the hierarchy group that a security profile uses to restrict access to
     * resources in Amazon Connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-allowedaccesscontrolhierarchygroupid)
     * @param allowedAccessControlHierarchyGroupId The identifier of the hierarchy group that a
     * security profile uses to restrict access to resources in Amazon Connect. 
     */
    override
        fun allowedAccessControlHierarchyGroupId(allowedAccessControlHierarchyGroupId: String) {
      cdkBuilder.allowedAccessControlHierarchyGroupId(allowedAccessControlHierarchyGroupId)
    }

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
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags.map{CdkObjectWrappers.unwrap(it)})
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
     * A list of third-party applications that the security profile will give access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-applications)
     * @param applications A list of third-party applications that the security profile will give
     * access to. 
     */
    override fun applications(applications: IResolvable) {
      cdkBuilder.applications(applications.let(IResolvable::unwrap))
    }

    /**
     * A list of third-party applications that the security profile will give access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-applications)
     * @param applications A list of third-party applications that the security profile will give
     * access to. 
     */
    override fun applications(applications: List<Any>) {
      cdkBuilder.applications(applications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of third-party applications that the security profile will give access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-applications)
     * @param applications A list of third-party applications that the security profile will give
     * access to. 
     */
    override fun applications(vararg applications: Any): Unit = applications(applications.toList())

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
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon
     * Connect.
     *
     * Following are acceptable ResourceNames: `User` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-hierarchyrestrictedresources)
     * @param hierarchyRestrictedResources The list of resources that a security profile applies
     * hierarchy restrictions to in Amazon Connect. 
     */
    override fun hierarchyRestrictedResources(hierarchyRestrictedResources: List<String>) {
      cdkBuilder.hierarchyRestrictedResources(hierarchyRestrictedResources)
    }

    /**
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon
     * Connect.
     *
     * Following are acceptable ResourceNames: `User` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html#cfn-connect-securityprofile-hierarchyrestrictedresources)
     * @param hierarchyRestrictedResources The list of resources that a security profile applies
     * hierarchy restrictions to in Amazon Connect. 
     */
    override fun hierarchyRestrictedResources(vararg hierarchyRestrictedResources: String): Unit =
        hierarchyRestrictedResources(hierarchyRestrictedResources.toList())

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
        software.amazon.awscdk.services.connect.CfnSecurityProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnSecurityProfile
  }

  /**
   * This API is in preview release for Amazon Connect and is subject to change.
   *
   * A third-party application's metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * ApplicationProperty applicationProperty = ApplicationProperty.builder()
   * .applicationPermissions(List.of("applicationPermissions"))
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-securityprofile-application.html)
   */
  public interface ApplicationProperty {
    /**
     * The permissions that the agent is granted on the application.
     *
     * Only the `ACCESS` permission is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-securityprofile-application.html#cfn-connect-securityprofile-application-applicationpermissions)
     */
    public fun applicationPermissions(): List<String>

    /**
     * Namespace of the application that you want to give access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-securityprofile-application.html#cfn-connect-securityprofile-application-namespace)
     */
    public fun namespace(): String

    /**
     * A builder for [ApplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationPermissions The permissions that the agent is granted on the application.
       * 
       * Only the `ACCESS` permission is supported.
       */
      public fun applicationPermissions(applicationPermissions: List<String>)

      /**
       * @param applicationPermissions The permissions that the agent is granted on the application.
       * 
       * Only the `ACCESS` permission is supported.
       */
      public fun applicationPermissions(vararg applicationPermissions: String)

      /**
       * @param namespace Namespace of the application that you want to give access to. 
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnSecurityProfile.ApplicationProperty.Builder =
          software.amazon.awscdk.services.connect.CfnSecurityProfile.ApplicationProperty.builder()

      /**
       * @param applicationPermissions The permissions that the agent is granted on the application.
       * 
       * Only the `ACCESS` permission is supported.
       */
      override fun applicationPermissions(applicationPermissions: List<String>) {
        cdkBuilder.applicationPermissions(applicationPermissions)
      }

      /**
       * @param applicationPermissions The permissions that the agent is granted on the application.
       * 
       * Only the `ACCESS` permission is supported.
       */
      override fun applicationPermissions(vararg applicationPermissions: String): Unit =
          applicationPermissions(applicationPermissions.toList())

      /**
       * @param namespace Namespace of the application that you want to give access to. 
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnSecurityProfile.ApplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfile.ApplicationProperty,
    ) : CdkObject(cdkObject), ApplicationProperty {
      /**
       * The permissions that the agent is granted on the application.
       *
       * Only the `ACCESS` permission is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-securityprofile-application.html#cfn-connect-securityprofile-application-applicationpermissions)
       */
      override fun applicationPermissions(): List<String> = unwrap(this).getApplicationPermissions()

      /**
       * Namespace of the application that you want to give access to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-securityprofile-application.html#cfn-connect-securityprofile-application-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfile.ApplicationProperty):
          ApplicationProperty = CdkObjectWrappers.wrap(cdkObject) as? ApplicationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationProperty):
          software.amazon.awscdk.services.connect.CfnSecurityProfile.ApplicationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnSecurityProfile.ApplicationProperty
    }
  }
}
