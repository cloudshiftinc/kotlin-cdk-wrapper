@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a user account for an Amazon Connect instance.
 *
 * For information about how to create user accounts using the Amazon Connect console, see [Add
 * Users](https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html) in the *Amazon
 * Connect Administrator Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
 * .instanceArn("instanceArn")
 * .phoneConfig(UserPhoneConfigProperty.builder()
 * .phoneType("phoneType")
 * // the properties below are optional
 * .afterContactWorkTimeLimit(123)
 * .autoAccept(false)
 * .deskPhoneNumber("deskPhoneNumber")
 * .build())
 * .routingProfileArn("routingProfileArn")
 * .securityProfileArns(List.of("securityProfileArns"))
 * .username("username")
 * // the properties below are optional
 * .directoryUserId("directoryUserId")
 * .hierarchyGroupArn("hierarchyGroupArn")
 * .identityInfo(UserIdentityInfoProperty.builder()
 * .email("email")
 * .firstName("firstName")
 * .lastName("lastName")
 * .mobile("mobile")
 * .secondaryEmail("secondaryEmail")
 * .build())
 * .password("password")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userProficiencies(List.of(UserProficiencyProperty.builder()
 * .attributeName("attributeName")
 * .attributeValue("attributeValue")
 * .level(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html)
 */
public open class CfnUser internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the user.
   */
  public open fun attrUserArn(): String = unwrap(this).getAttrUserArn()

  /**
   * The identifier of the user account in the directory used for identity management.
   */
  public open fun directoryUserId(): String? = unwrap(this).getDirectoryUserId()

  /**
   * The identifier of the user account in the directory used for identity management.
   */
  public open fun directoryUserId(`value`: String) {
    unwrap(this).setDirectoryUserId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the user's hierarchy group.
   */
  public open fun hierarchyGroupArn(): String? = unwrap(this).getHierarchyGroupArn()

  /**
   * The Amazon Resource Name (ARN) of the user's hierarchy group.
   */
  public open fun hierarchyGroupArn(`value`: String) {
    unwrap(this).setHierarchyGroupArn(`value`)
  }

  /**
   * Information about the user identity.
   */
  public open fun identityInfo(): Any? = unwrap(this).getIdentityInfo()

  /**
   * Information about the user identity.
   */
  public open fun identityInfo(`value`: IResolvable) {
    unwrap(this).setIdentityInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the user identity.
   */
  public open fun identityInfo(`value`: UserIdentityInfoProperty) {
    unwrap(this).setIdentityInfo(`value`.let(UserIdentityInfoProperty::unwrap))
  }

  /**
   * Information about the user identity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff79e441ebbe10588e09a13e2cf1121e56cb3de7540c9846f71f2fb06cdfa5ed")
  public open fun identityInfo(`value`: UserIdentityInfoProperty.Builder.() -> Unit): Unit =
      identityInfo(UserIdentityInfoProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The user's password.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * The user's password.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * Information about the phone configuration for the user.
   */
  public open fun phoneConfig(): Any = unwrap(this).getPhoneConfig()

  /**
   * Information about the phone configuration for the user.
   */
  public open fun phoneConfig(`value`: IResolvable) {
    unwrap(this).setPhoneConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the phone configuration for the user.
   */
  public open fun phoneConfig(`value`: UserPhoneConfigProperty) {
    unwrap(this).setPhoneConfig(`value`.let(UserPhoneConfigProperty::unwrap))
  }

  /**
   * Information about the phone configuration for the user.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("af736fefd737d248289e55f54f4616fd734d12ba10ccd63453474bb0456961bd")
  public open fun phoneConfig(`value`: UserPhoneConfigProperty.Builder.() -> Unit): Unit =
      phoneConfig(UserPhoneConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the user's routing profile.
   */
  public open fun routingProfileArn(): String = unwrap(this).getRoutingProfileArn()

  /**
   * The Amazon Resource Name (ARN) of the user's routing profile.
   */
  public open fun routingProfileArn(`value`: String) {
    unwrap(this).setRoutingProfileArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the user's security profile.
   */
  public open fun securityProfileArns(): List<String> = unwrap(this).getSecurityProfileArns()

  /**
   * The Amazon Resource Name (ARN) of the user's security profile.
   */
  public open fun securityProfileArns(`value`: List<String>) {
    unwrap(this).setSecurityProfileArns(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the user's security profile.
   */
  public open fun securityProfileArns(vararg `value`: String): Unit =
      securityProfileArns(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * One or more predefined attributes assigned to a user, with a numeric value that indicates how
   * their level of skill in a specified area.
   */
  public open fun userProficiencies(): Any? = unwrap(this).getUserProficiencies()

  /**
   * One or more predefined attributes assigned to a user, with a numeric value that indicates how
   * their level of skill in a specified area.
   */
  public open fun userProficiencies(`value`: IResolvable) {
    unwrap(this).setUserProficiencies(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more predefined attributes assigned to a user, with a numeric value that indicates how
   * their level of skill in a specified area.
   */
  public open fun userProficiencies(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserProficiencies(__idx_ac66f0)
  }

  /**
   * One or more predefined attributes assigned to a user, with a numeric value that indicates how
   * their level of skill in a specified area.
   */
  public open fun userProficiencies(vararg __idx_ac66f0: Any): Unit =
      userProficiencies(__idx_ac66f0.toList())

  /**
   * The user name assigned to the user account.
   */
  public open fun username(): String = unwrap(this).getUsername()

  /**
   * The user name assigned to the user account.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnUser].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the user account in the directory used for identity management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-directoryuserid)
     * @param directoryUserId The identifier of the user account in the directory used for identity
     * management. 
     */
    public fun directoryUserId(directoryUserId: String)

    /**
     * The Amazon Resource Name (ARN) of the user's hierarchy group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-hierarchygrouparn)
     * @param hierarchyGroupArn The Amazon Resource Name (ARN) of the user's hierarchy group. 
     */
    public fun hierarchyGroupArn(hierarchyGroupArn: String)

    /**
     * Information about the user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
     * @param identityInfo Information about the user identity. 
     */
    public fun identityInfo(identityInfo: IResolvable)

    /**
     * Information about the user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
     * @param identityInfo Information about the user identity. 
     */
    public fun identityInfo(identityInfo: UserIdentityInfoProperty)

    /**
     * Information about the user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
     * @param identityInfo Information about the user identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38519efe9ab8819df44aad45dd3fcf21a2f035505d17447ebc022a463c8ceaa")
    public fun identityInfo(identityInfo: UserIdentityInfoProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The user's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-password)
     * @param password The user's password. 
     */
    public fun password(password: String)

    /**
     * Information about the phone configuration for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    public fun phoneConfig(phoneConfig: IResolvable)

    /**
     * Information about the phone configuration for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    public fun phoneConfig(phoneConfig: UserPhoneConfigProperty)

    /**
     * Information about the phone configuration for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a5cc7ef2d9aa0d6fcefd7d98b71f5717effba00a526aae27e382ca3fb1dde29")
    public fun phoneConfig(phoneConfig: UserPhoneConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the user's routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-routingprofilearn)
     * @param routingProfileArn The Amazon Resource Name (ARN) of the user's routing profile. 
     */
    public fun routingProfileArn(routingProfileArn: String)

    /**
     * The Amazon Resource Name (ARN) of the user's security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    public fun securityProfileArns(securityProfileArns: List<String>)

    /**
     * The Amazon Resource Name (ARN) of the user's security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    public fun securityProfileArns(vararg securityProfileArns: String)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
     * @param tags The tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
     * @param tags The tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * One or more predefined attributes assigned to a user, with a numeric value that indicates how
     * their level of skill in a specified area.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area. 
     */
    public fun userProficiencies(userProficiencies: IResolvable)

    /**
     * One or more predefined attributes assigned to a user, with a numeric value that indicates how
     * their level of skill in a specified area.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area. 
     */
    public fun userProficiencies(userProficiencies: List<Any>)

    /**
     * One or more predefined attributes assigned to a user, with a numeric value that indicates how
     * their level of skill in a specified area.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area. 
     */
    public fun userProficiencies(vararg userProficiencies: Any)

    /**
     * The user name assigned to the user account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-username)
     * @param username The user name assigned to the user account. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnUser.Builder =
        software.amazon.awscdk.services.connect.CfnUser.Builder.create(scope, id)

    /**
     * The identifier of the user account in the directory used for identity management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-directoryuserid)
     * @param directoryUserId The identifier of the user account in the directory used for identity
     * management. 
     */
    override fun directoryUserId(directoryUserId: String) {
      cdkBuilder.directoryUserId(directoryUserId)
    }

    /**
     * The Amazon Resource Name (ARN) of the user's hierarchy group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-hierarchygrouparn)
     * @param hierarchyGroupArn The Amazon Resource Name (ARN) of the user's hierarchy group. 
     */
    override fun hierarchyGroupArn(hierarchyGroupArn: String) {
      cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
    }

    /**
     * Information about the user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
     * @param identityInfo Information about the user identity. 
     */
    override fun identityInfo(identityInfo: IResolvable) {
      cdkBuilder.identityInfo(identityInfo.let(IResolvable::unwrap))
    }

    /**
     * Information about the user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
     * @param identityInfo Information about the user identity. 
     */
    override fun identityInfo(identityInfo: UserIdentityInfoProperty) {
      cdkBuilder.identityInfo(identityInfo.let(UserIdentityInfoProperty::unwrap))
    }

    /**
     * Information about the user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
     * @param identityInfo Information about the user identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38519efe9ab8819df44aad45dd3fcf21a2f035505d17447ebc022a463c8ceaa")
    override fun identityInfo(identityInfo: UserIdentityInfoProperty.Builder.() -> Unit): Unit =
        identityInfo(UserIdentityInfoProperty(identityInfo))

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The user's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-password)
     * @param password The user's password. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * Information about the phone configuration for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    override fun phoneConfig(phoneConfig: IResolvable) {
      cdkBuilder.phoneConfig(phoneConfig.let(IResolvable::unwrap))
    }

    /**
     * Information about the phone configuration for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    override fun phoneConfig(phoneConfig: UserPhoneConfigProperty) {
      cdkBuilder.phoneConfig(phoneConfig.let(UserPhoneConfigProperty::unwrap))
    }

    /**
     * Information about the phone configuration for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a5cc7ef2d9aa0d6fcefd7d98b71f5717effba00a526aae27e382ca3fb1dde29")
    override fun phoneConfig(phoneConfig: UserPhoneConfigProperty.Builder.() -> Unit): Unit =
        phoneConfig(UserPhoneConfigProperty(phoneConfig))

    /**
     * The Amazon Resource Name (ARN) of the user's routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-routingprofilearn)
     * @param routingProfileArn The Amazon Resource Name (ARN) of the user's routing profile. 
     */
    override fun routingProfileArn(routingProfileArn: String) {
      cdkBuilder.routingProfileArn(routingProfileArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the user's security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    override fun securityProfileArns(securityProfileArns: List<String>) {
      cdkBuilder.securityProfileArns(securityProfileArns)
    }

    /**
     * The Amazon Resource Name (ARN) of the user's security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    override fun securityProfileArns(vararg securityProfileArns: String): Unit =
        securityProfileArns(securityProfileArns.toList())

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
     * @param tags The tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
     * @param tags The tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * One or more predefined attributes assigned to a user, with a numeric value that indicates how
     * their level of skill in a specified area.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area. 
     */
    override fun userProficiencies(userProficiencies: IResolvable) {
      cdkBuilder.userProficiencies(userProficiencies.let(IResolvable::unwrap))
    }

    /**
     * One or more predefined attributes assigned to a user, with a numeric value that indicates how
     * their level of skill in a specified area.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area. 
     */
    override fun userProficiencies(userProficiencies: List<Any>) {
      cdkBuilder.userProficiencies(userProficiencies)
    }

    /**
     * One or more predefined attributes assigned to a user, with a numeric value that indicates how
     * their level of skill in a specified area.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area. 
     */
    override fun userProficiencies(vararg userProficiencies: Any): Unit =
        userProficiencies(userProficiencies.toList())

    /**
     * The user name assigned to the user account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-username)
     * @param username The user name assigned to the user account. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.connect.CfnUser =
        wrapped.cdkObject
  }

  /**
   * Contains information about the identity of a user.
   *
   *
   * For Amazon Connect instances that are created with the `EXISTING_DIRECTORY` identity management
   * type, `FirstName` , `LastName` , and `Email` cannot be updated from within Amazon Connect because
   * they are managed by the directory.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * UserIdentityInfoProperty userIdentityInfoProperty = UserIdentityInfoProperty.builder()
   * .email("email")
   * .firstName("firstName")
   * .lastName("lastName")
   * .mobile("mobile")
   * .secondaryEmail("secondaryEmail")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html)
   */
  public interface UserIdentityInfoProperty {
    /**
     * The email address.
     *
     * If you are using SAML for identity management and include this parameter, an error is
     * returned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-email)
     */
    public fun email(): String? = unwrap(this).getEmail()

    /**
     * The first name.
     *
     * This is required if you are using Amazon Connect or SAML for identity management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-firstname)
     */
    public fun firstName(): String? = unwrap(this).getFirstName()

    /**
     * The last name.
     *
     * This is required if you are using Amazon Connect or SAML for identity management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-lastname)
     */
    public fun lastName(): String? = unwrap(this).getLastName()

    /**
     * The user's mobile number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-mobile)
     */
    public fun mobile(): String? = unwrap(this).getMobile()

    /**
     * The user's secondary email address.
     *
     * If you provide a secondary email, the user receives email notifications -- other than
     * password reset notifications -- to this email address instead of to their primary email address.
     *
     * *Pattern* : `(?=^.{0,265}$)[a-zA-Z0-9._%+-]+&#64;[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-secondaryemail)
     */
    public fun secondaryEmail(): String? = unwrap(this).getSecondaryEmail()

    /**
     * A builder for [UserIdentityInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param email The email address.
       * If you are using SAML for identity management and include this parameter, an error is
       * returned.
       */
      public fun email(email: String)

      /**
       * @param firstName The first name.
       * This is required if you are using Amazon Connect or SAML for identity management.
       */
      public fun firstName(firstName: String)

      /**
       * @param lastName The last name.
       * This is required if you are using Amazon Connect or SAML for identity management.
       */
      public fun lastName(lastName: String)

      /**
       * @param mobile The user's mobile number.
       */
      public fun mobile(mobile: String)

      /**
       * @param secondaryEmail The user's secondary email address.
       * If you provide a secondary email, the user receives email notifications -- other than
       * password reset notifications -- to this email address instead of to their primary email
       * address.
       *
       * *Pattern* : `(?=^.{0,265}$)[a-zA-Z0-9._%+-]+&#64;[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}`
       */
      public fun secondaryEmail(secondaryEmail: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty.Builder =
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty.builder()

      /**
       * @param email The email address.
       * If you are using SAML for identity management and include this parameter, an error is
       * returned.
       */
      override fun email(email: String) {
        cdkBuilder.email(email)
      }

      /**
       * @param firstName The first name.
       * This is required if you are using Amazon Connect or SAML for identity management.
       */
      override fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
      }

      /**
       * @param lastName The last name.
       * This is required if you are using Amazon Connect or SAML for identity management.
       */
      override fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
      }

      /**
       * @param mobile The user's mobile number.
       */
      override fun mobile(mobile: String) {
        cdkBuilder.mobile(mobile)
      }

      /**
       * @param secondaryEmail The user's secondary email address.
       * If you provide a secondary email, the user receives email notifications -- other than
       * password reset notifications -- to this email address instead of to their primary email
       * address.
       *
       * *Pattern* : `(?=^.{0,265}$)[a-zA-Z0-9._%+-]+&#64;[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}`
       */
      override fun secondaryEmail(secondaryEmail: String) {
        cdkBuilder.secondaryEmail(secondaryEmail)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty,
    ) : CdkObject(cdkObject), UserIdentityInfoProperty {
      /**
       * The email address.
       *
       * If you are using SAML for identity management and include this parameter, an error is
       * returned.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-email)
       */
      override fun email(): String? = unwrap(this).getEmail()

      /**
       * The first name.
       *
       * This is required if you are using Amazon Connect or SAML for identity management.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-firstname)
       */
      override fun firstName(): String? = unwrap(this).getFirstName()

      /**
       * The last name.
       *
       * This is required if you are using Amazon Connect or SAML for identity management.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-lastname)
       */
      override fun lastName(): String? = unwrap(this).getLastName()

      /**
       * The user's mobile number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-mobile)
       */
      override fun mobile(): String? = unwrap(this).getMobile()

      /**
       * The user's secondary email address.
       *
       * If you provide a secondary email, the user receives email notifications -- other than
       * password reset notifications -- to this email address instead of to their primary email
       * address.
       *
       * *Pattern* : `(?=^.{0,265}$)[a-zA-Z0-9._%+-]+&#64;[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html#cfn-connect-user-useridentityinfo-secondaryemail)
       */
      override fun secondaryEmail(): String? = unwrap(this).getSecondaryEmail()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserIdentityInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty):
          UserIdentityInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserIdentityInfoProperty):
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty
    }
  }

  /**
   * A predefined attribute must be created before using `UserProficiencies` in the Cloudformation
   * *User* template.
   *
   * For more information, see [Predefined
   * attributes](https://docs.aws.amazon.com/connect/latest/adminguide/predefined-attributes.html) .
   *
   * Proficiency of a user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * UserProficiencyProperty userProficiencyProperty = UserProficiencyProperty.builder()
   * .attributeName("attributeName")
   * .attributeValue("attributeValue")
   * .level(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html)
   */
  public interface UserProficiencyProperty {
    /**
     * The name of user’s proficiency.
     *
     * You must use a predefined attribute name that is present in the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html#cfn-connect-user-userproficiency-attributename)
     */
    public fun attributeName(): String

    /**
     * The value of user’s proficiency.
     *
     * You must use a predefined attribute value that is present in the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html#cfn-connect-user-userproficiency-attributevalue)
     */
    public fun attributeValue(): String

    /**
     * The level of the proficiency.
     *
     * The valid values are 1, 2, 3, 4 and 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html#cfn-connect-user-userproficiency-level)
     */
    public fun level(): Number

    /**
     * A builder for [UserProficiencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The name of user’s proficiency. 
       * You must use a predefined attribute name that is present in the Amazon Connect instance.
       */
      public fun attributeName(attributeName: String)

      /**
       * @param attributeValue The value of user’s proficiency. 
       * You must use a predefined attribute value that is present in the Amazon Connect instance.
       */
      public fun attributeValue(attributeValue: String)

      /**
       * @param level The level of the proficiency. 
       * The valid values are 1, 2, 3, 4 and 5.
       */
      public fun level(level: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty.Builder =
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty.builder()

      /**
       * @param attributeName The name of user’s proficiency. 
       * You must use a predefined attribute name that is present in the Amazon Connect instance.
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param attributeValue The value of user’s proficiency. 
       * You must use a predefined attribute value that is present in the Amazon Connect instance.
       */
      override fun attributeValue(attributeValue: String) {
        cdkBuilder.attributeValue(attributeValue)
      }

      /**
       * @param level The level of the proficiency. 
       * The valid values are 1, 2, 3, 4 and 5.
       */
      override fun level(level: Number) {
        cdkBuilder.level(level)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty,
    ) : CdkObject(cdkObject), UserProficiencyProperty {
      /**
       * The name of user’s proficiency.
       *
       * You must use a predefined attribute name that is present in the Amazon Connect instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html#cfn-connect-user-userproficiency-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()

      /**
       * The value of user’s proficiency.
       *
       * You must use a predefined attribute value that is present in the Amazon Connect instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html#cfn-connect-user-userproficiency-attributevalue)
       */
      override fun attributeValue(): String = unwrap(this).getAttributeValue()

      /**
       * The level of the proficiency.
       *
       * The valid values are 1, 2, 3, 4 and 5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userproficiency.html#cfn-connect-user-userproficiency-level)
       */
      override fun level(): Number = unwrap(this).getLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserProficiencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty):
          UserProficiencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserProficiencyProperty):
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty
    }
  }

  /**
   * Contains information about the phone configuration settings for a user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * UserPhoneConfigProperty userPhoneConfigProperty = UserPhoneConfigProperty.builder()
   * .phoneType("phoneType")
   * // the properties below are optional
   * .afterContactWorkTimeLimit(123)
   * .autoAccept(false)
   * .deskPhoneNumber("deskPhoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html)
   */
  public interface UserPhoneConfigProperty {
    /**
     * The After Call Work (ACW) timeout setting, in seconds.
     *
     * This parameter has a minimum value of 0 and a maximum value of 2,000,000 seconds (24 days).
     * Enter 0 if you don't want to allocate a specific amount of ACW time. It essentially means an
     * indefinite amount of time. When the conversation ends, ACW starts; the agent must choose Close
     * contact to end ACW.
     *
     *
     * When returned by a `SearchUsers` call, `AfterContactWorkTimeLimit` is returned in
     * milliseconds.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-aftercontactworktimelimit)
     */
    public fun afterContactWorkTimeLimit(): Number? = unwrap(this).getAfterContactWorkTimeLimit()

    /**
     * The Auto accept setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-autoaccept)
     */
    public fun autoAccept(): Any? = unwrap(this).getAutoAccept()

    /**
     * The phone number for the user's desk phone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-deskphonenumber)
     */
    public fun deskPhoneNumber(): String? = unwrap(this).getDeskPhoneNumber()

    /**
     * The phone type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-phonetype)
     */
    public fun phoneType(): String

    /**
     * A builder for [UserPhoneConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param afterContactWorkTimeLimit The After Call Work (ACW) timeout setting, in seconds.
       * This parameter has a minimum value of 0 and a maximum value of 2,000,000 seconds (24 days).
       * Enter 0 if you don't want to allocate a specific amount of ACW time. It essentially means an
       * indefinite amount of time. When the conversation ends, ACW starts; the agent must choose Close
       * contact to end ACW.
       *
       *
       * When returned by a `SearchUsers` call, `AfterContactWorkTimeLimit` is returned in
       * milliseconds.
       */
      public fun afterContactWorkTimeLimit(afterContactWorkTimeLimit: Number)

      /**
       * @param autoAccept The Auto accept setting.
       */
      public fun autoAccept(autoAccept: Boolean)

      /**
       * @param autoAccept The Auto accept setting.
       */
      public fun autoAccept(autoAccept: IResolvable)

      /**
       * @param deskPhoneNumber The phone number for the user's desk phone.
       */
      public fun deskPhoneNumber(deskPhoneNumber: String)

      /**
       * @param phoneType The phone type. 
       */
      public fun phoneType(phoneType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty.Builder =
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty.builder()

      /**
       * @param afterContactWorkTimeLimit The After Call Work (ACW) timeout setting, in seconds.
       * This parameter has a minimum value of 0 and a maximum value of 2,000,000 seconds (24 days).
       * Enter 0 if you don't want to allocate a specific amount of ACW time. It essentially means an
       * indefinite amount of time. When the conversation ends, ACW starts; the agent must choose Close
       * contact to end ACW.
       *
       *
       * When returned by a `SearchUsers` call, `AfterContactWorkTimeLimit` is returned in
       * milliseconds.
       */
      override fun afterContactWorkTimeLimit(afterContactWorkTimeLimit: Number) {
        cdkBuilder.afterContactWorkTimeLimit(afterContactWorkTimeLimit)
      }

      /**
       * @param autoAccept The Auto accept setting.
       */
      override fun autoAccept(autoAccept: Boolean) {
        cdkBuilder.autoAccept(autoAccept)
      }

      /**
       * @param autoAccept The Auto accept setting.
       */
      override fun autoAccept(autoAccept: IResolvable) {
        cdkBuilder.autoAccept(autoAccept.let(IResolvable::unwrap))
      }

      /**
       * @param deskPhoneNumber The phone number for the user's desk phone.
       */
      override fun deskPhoneNumber(deskPhoneNumber: String) {
        cdkBuilder.deskPhoneNumber(deskPhoneNumber)
      }

      /**
       * @param phoneType The phone type. 
       */
      override fun phoneType(phoneType: String) {
        cdkBuilder.phoneType(phoneType)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty,
    ) : CdkObject(cdkObject), UserPhoneConfigProperty {
      /**
       * The After Call Work (ACW) timeout setting, in seconds.
       *
       * This parameter has a minimum value of 0 and a maximum value of 2,000,000 seconds (24 days).
       * Enter 0 if you don't want to allocate a specific amount of ACW time. It essentially means an
       * indefinite amount of time. When the conversation ends, ACW starts; the agent must choose Close
       * contact to end ACW.
       *
       *
       * When returned by a `SearchUsers` call, `AfterContactWorkTimeLimit` is returned in
       * milliseconds.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-aftercontactworktimelimit)
       */
      override fun afterContactWorkTimeLimit(): Number? =
          unwrap(this).getAfterContactWorkTimeLimit()

      /**
       * The Auto accept setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-autoaccept)
       */
      override fun autoAccept(): Any? = unwrap(this).getAutoAccept()

      /**
       * The phone number for the user's desk phone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-deskphonenumber)
       */
      override fun deskPhoneNumber(): String? = unwrap(this).getDeskPhoneNumber()

      /**
       * The phone type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html#cfn-connect-user-userphoneconfig-phonetype)
       */
      override fun phoneType(): String = unwrap(this).getPhoneType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserPhoneConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty):
          UserPhoneConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPhoneConfigProperty):
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty
    }
  }
}
