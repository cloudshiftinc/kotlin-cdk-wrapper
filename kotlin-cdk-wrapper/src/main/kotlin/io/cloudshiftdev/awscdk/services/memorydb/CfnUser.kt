@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a MemoryDB user.
 *
 * For more information, see [Authenticating users with Access Contol Lists
 * (ACLs)](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * Object authenticationMode;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
 * .userName("userName")
 * // the properties below are optional
 * .accessString("accessString")
 * .authenticationMode(authenticationMode)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html)
 */
public open class CfnUser internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.memorydb.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Access permissions string used for this user.
   */
  public open fun accessString(): String? = unwrap(this).getAccessString()

  /**
   * Access permissions string used for this user.
   */
  public open fun accessString(`value`: String) {
    unwrap(this).setAccessString(`value`)
  }

  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the user, such as `arn:aws:memorydb:us-east-1:123456789012:user/user1`.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates the user status.
   *
   * *Valid values* : `active` | `modifying` | `deleting`
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Denotes whether the user requires a password to authenticate.
   */
  public open fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  /**
   * Denotes whether the user requires a password to authenticate.
   */
  public open fun authenticationMode(`value`: Any) {
    unwrap(this).setAuthenticationMode(`value`)
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the user.
   */
  public open fun userName(): String = unwrap(this).getUserName()

  /**
   * The name of the user.
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.memorydb.CfnUser].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Access permissions string used for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-accessstring)
     * @param accessString Access permissions string used for this user. 
     */
    public fun accessString(accessString: String)

    /**
     * Denotes whether the user requires a password to authenticate.
     *
     * *Example:*
     *
     * `mynewdbuser: Type: AWS::MemoryDB::User Properties: AccessString: on ~* &amp;* +&#64;all
     * AuthenticationMode: Passwords: '1234567890123456' Type: password UserName: mynewdbuser
     * AuthenticationMode: { "Passwords": ["1234567890123456"], "Type": "Password" }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-authenticationmode)
     * @param authenticationMode Denotes whether the user requires a password to authenticate. 
     */
    public fun authenticationMode(authenticationMode: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-username)
     * @param userName The name of the user. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnUser.Builder =
        software.amazon.awscdk.services.memorydb.CfnUser.Builder.create(scope, id)

    /**
     * Access permissions string used for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-accessstring)
     * @param accessString Access permissions string used for this user. 
     */
    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    /**
     * Denotes whether the user requires a password to authenticate.
     *
     * *Example:*
     *
     * `mynewdbuser: Type: AWS::MemoryDB::User Properties: AccessString: on ~* &amp;* +&#64;all
     * AuthenticationMode: Passwords: '1234567890123456' Type: password UserName: mynewdbuser
     * AuthenticationMode: { "Passwords": ["1234567890123456"], "Type": "Password" }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-authenticationmode)
     * @param authenticationMode Denotes whether the user requires a password to authenticate. 
     */
    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-username)
     * @param userName The name of the user. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.memorydb.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.memorydb.CfnUser =
        wrapped.cdkObject
  }

  /**
   * Denotes the user's authentication properties, such as whether it requires a password to
   * authenticate.
   *
   * Used in output responses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.memorydb.*;
   * AuthenticationModeProperty authenticationModeProperty = AuthenticationModeProperty.builder()
   * .passwords(List.of("passwords"))
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-user-authenticationmode.html)
   */
  public interface AuthenticationModeProperty {
    /**
     * The password(s) used for authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-user-authenticationmode.html#cfn-memorydb-user-authenticationmode-passwords)
     */
    public fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

    /**
     * Indicates whether the user requires a password to authenticate.
     *
     * All newly-created users require a password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-user-authenticationmode.html#cfn-memorydb-user-authenticationmode-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [AuthenticationModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param passwords The password(s) used for authentication.
       */
      public fun passwords(passwords: List<String>)

      /**
       * @param passwords The password(s) used for authentication.
       */
      public fun passwords(vararg passwords: String)

      /**
       * @param type Indicates whether the user requires a password to authenticate.
       * All newly-created users require a password.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty.Builder =
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty.builder()

      /**
       * @param passwords The password(s) used for authentication.
       */
      override fun passwords(passwords: List<String>) {
        cdkBuilder.passwords(passwords)
      }

      /**
       * @param passwords The password(s) used for authentication.
       */
      override fun passwords(vararg passwords: String): Unit = passwords(passwords.toList())

      /**
       * @param type Indicates whether the user requires a password to authenticate.
       * All newly-created users require a password.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty,
    ) : CdkObject(cdkObject), AuthenticationModeProperty {
      /**
       * The password(s) used for authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-user-authenticationmode.html#cfn-memorydb-user-authenticationmode-passwords)
       */
      override fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

      /**
       * Indicates whether the user requires a password to authenticate.
       *
       * All newly-created users require a password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-user-authenticationmode.html#cfn-memorydb-user-authenticationmode-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticationModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty):
          AuthenticationModeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationModeProperty):
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty
    }
  }
}
