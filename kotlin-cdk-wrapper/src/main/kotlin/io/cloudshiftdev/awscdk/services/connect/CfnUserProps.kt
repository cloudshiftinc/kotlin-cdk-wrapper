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
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
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
public interface CfnUserProps {
  /**
   * The identifier of the user account in the directory used for identity management.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-directoryuserid)
   */
  public fun directoryUserId(): String? = unwrap(this).getDirectoryUserId()

  /**
   * The Amazon Resource Name (ARN) of the user's hierarchy group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-hierarchygrouparn)
   */
  public fun hierarchyGroupArn(): String? = unwrap(this).getHierarchyGroupArn()

  /**
   * Information about the user identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
   */
  public fun identityInfo(): Any? = unwrap(this).getIdentityInfo()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The user's password.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * Information about the phone configuration for the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
   */
  public fun phoneConfig(): Any

  /**
   * The Amazon Resource Name (ARN) of the user's routing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-routingprofilearn)
   */
  public fun routingProfileArn(): String

  /**
   * The Amazon Resource Name (ARN) of the user's security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
   */
  public fun securityProfileArns(): List<String>

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * One or more predefined attributes assigned to a user, with a numeric value that indicates how
   * their level of skill in a specified area.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
   */
  public fun userProficiencies(): Any? = unwrap(this).getUserProficiencies()

  /**
   * The user name assigned to the user account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-username)
   */
  public fun username(): String

  /**
   * A builder for [CfnUserProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param directoryUserId The identifier of the user account in the directory used for identity
     * management.
     */
    public fun directoryUserId(directoryUserId: String)

    /**
     * @param hierarchyGroupArn The Amazon Resource Name (ARN) of the user's hierarchy group.
     */
    public fun hierarchyGroupArn(hierarchyGroupArn: String)

    /**
     * @param identityInfo Information about the user identity.
     */
    public fun identityInfo(identityInfo: IResolvable)

    /**
     * @param identityInfo Information about the user identity.
     */
    public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty)

    /**
     * @param identityInfo Information about the user identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27e90f37bc2ca0ab7d545f7d7481a8e8c35d5f8ac7f1eeb8bf4ebbd1c216d75e")
    public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty.Builder.() -> Unit)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param password The user's password.
     */
    public fun password(password: String)

    /**
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    public fun phoneConfig(phoneConfig: IResolvable)

    /**
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty)

    /**
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba4e8b1576f1f8aad074c03a08c3ec019f329c14a2b857515a981dae2d2d618")
    public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty.Builder.() -> Unit)

    /**
     * @param routingProfileArn The Amazon Resource Name (ARN) of the user's routing profile. 
     */
    public fun routingProfileArn(routingProfileArn: String)

    /**
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    public fun securityProfileArns(securityProfileArns: List<String>)

    /**
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    public fun securityProfileArns(vararg securityProfileArns: String)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area.
     */
    public fun userProficiencies(userProficiencies: IResolvable)

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area.
     */
    public fun userProficiencies(userProficiencies: List<Any>)

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area.
     */
    public fun userProficiencies(vararg userProficiencies: Any)

    /**
     * @param username The user name assigned to the user account. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnUserProps.Builder =
        software.amazon.awscdk.services.connect.CfnUserProps.builder()

    /**
     * @param directoryUserId The identifier of the user account in the directory used for identity
     * management.
     */
    override fun directoryUserId(directoryUserId: String) {
      cdkBuilder.directoryUserId(directoryUserId)
    }

    /**
     * @param hierarchyGroupArn The Amazon Resource Name (ARN) of the user's hierarchy group.
     */
    override fun hierarchyGroupArn(hierarchyGroupArn: String) {
      cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
    }

    /**
     * @param identityInfo Information about the user identity.
     */
    override fun identityInfo(identityInfo: IResolvable) {
      cdkBuilder.identityInfo(identityInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param identityInfo Information about the user identity.
     */
    override fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty) {
      cdkBuilder.identityInfo(identityInfo.let(CfnUser.UserIdentityInfoProperty.Companion::unwrap))
    }

    /**
     * @param identityInfo Information about the user identity.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27e90f37bc2ca0ab7d545f7d7481a8e8c35d5f8ac7f1eeb8bf4ebbd1c216d75e")
    override fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty.Builder.() -> Unit):
        Unit = identityInfo(CfnUser.UserIdentityInfoProperty(identityInfo))

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param password The user's password.
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    override fun phoneConfig(phoneConfig: IResolvable) {
      cdkBuilder.phoneConfig(phoneConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    override fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty) {
      cdkBuilder.phoneConfig(phoneConfig.let(CfnUser.UserPhoneConfigProperty.Companion::unwrap))
    }

    /**
     * @param phoneConfig Information about the phone configuration for the user. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba4e8b1576f1f8aad074c03a08c3ec019f329c14a2b857515a981dae2d2d618")
    override fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty.Builder.() -> Unit): Unit
        = phoneConfig(CfnUser.UserPhoneConfigProperty(phoneConfig))

    /**
     * @param routingProfileArn The Amazon Resource Name (ARN) of the user's routing profile. 
     */
    override fun routingProfileArn(routingProfileArn: String) {
      cdkBuilder.routingProfileArn(routingProfileArn)
    }

    /**
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    override fun securityProfileArns(securityProfileArns: List<String>) {
      cdkBuilder.securityProfileArns(securityProfileArns)
    }

    /**
     * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
     */
    override fun securityProfileArns(vararg securityProfileArns: String): Unit =
        securityProfileArns(securityProfileArns.toList())

    /**
     * @param tags The tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area.
     */
    override fun userProficiencies(userProficiencies: IResolvable) {
      cdkBuilder.userProficiencies(userProficiencies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area.
     */
    override fun userProficiencies(userProficiencies: List<Any>) {
      cdkBuilder.userProficiencies(userProficiencies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     * value that indicates how their level of skill in a specified area.
     */
    override fun userProficiencies(vararg userProficiencies: Any): Unit =
        userProficiencies(userProficiencies.toList())

    /**
     * @param username The user name assigned to the user account. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    /**
     * The identifier of the user account in the directory used for identity management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-directoryuserid)
     */
    override fun directoryUserId(): String? = unwrap(this).getDirectoryUserId()

    /**
     * The Amazon Resource Name (ARN) of the user's hierarchy group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-hierarchygrouparn)
     */
    override fun hierarchyGroupArn(): String? = unwrap(this).getHierarchyGroupArn()

    /**
     * Information about the user identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
     */
    override fun identityInfo(): Any? = unwrap(this).getIdentityInfo()

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The user's password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

    /**
     * Information about the phone configuration for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
     */
    override fun phoneConfig(): Any = unwrap(this).getPhoneConfig()

    /**
     * The Amazon Resource Name (ARN) of the user's routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-routingprofilearn)
     */
    override fun routingProfileArn(): String = unwrap(this).getRoutingProfileArn()

    /**
     * The Amazon Resource Name (ARN) of the user's security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
     */
    override fun securityProfileArns(): List<String> = unwrap(this).getSecurityProfileArns()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * One or more predefined attributes assigned to a user, with a numeric value that indicates how
     * their level of skill in a specified area.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-userproficiencies)
     */
    override fun userProficiencies(): Any? = unwrap(this).getUserProficiencies()

    /**
     * The user name assigned to the user account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-username)
     */
    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserProps): CfnUserProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnUserProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps): software.amazon.awscdk.services.connect.CfnUserProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnUserProps
  }
}
