@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * For Redis engine version 6.0 onwards: Creates a Redis user. For more information, see [Using Role
 * Based Access Control
 * (RBAC)](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * Object authenticationMode;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
 * .engine("engine")
 * .userId("userId")
 * .userName("userName")
 * // the properties below are optional
 * .accessString("accessString")
 * .authenticationMode(authenticationMode)
 * .noPasswordRequired(false)
 * .passwords(List.of("passwords"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html)
 */
public open class CfnUser internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.elasticache.CfnUser,
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
   * The Amazon Resource Name (ARN) of the user.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates the user status.
   *
   * Can be "active", "modifying" or "deleting".
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Specifies the authentication mode to use.
   *
   * Below is an example of the possible JSON values:.
   */
  public open fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  /**
   * Specifies the authentication mode to use.
   *
   * Below is an example of the possible JSON values:.
   */
  public open fun authenticationMode(`value`: Any) {
    unwrap(this).setAuthenticationMode(`value`)
  }

  /**
   * The current supported value is redis.
   */
  public open fun engine(): String = unwrap(this).getEngine()

  /**
   * The current supported value is redis.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
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
   * Indicates a password is not required for this user.
   */
  public open fun noPasswordRequired(): Any? = unwrap(this).getNoPasswordRequired()

  /**
   * Indicates a password is not required for this user.
   */
  public open fun noPasswordRequired(`value`: Boolean) {
    unwrap(this).setNoPasswordRequired(`value`)
  }

  /**
   * Indicates a password is not required for this user.
   */
  public open fun noPasswordRequired(`value`: IResolvable) {
    unwrap(this).setNoPasswordRequired(`value`.let(IResolvable::unwrap))
  }

  /**
   * Passwords used for this user.
   */
  public open fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

  /**
   * Passwords used for this user.
   */
  public open fun passwords(`value`: List<String>) {
    unwrap(this).setPasswords(`value`)
  }

  /**
   * Passwords used for this user.
   */
  public open fun passwords(vararg `value`: String): Unit = passwords(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this user.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this user.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this user.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the user.
   */
  public open fun userId(): String = unwrap(this).getUserId()

  /**
   * The ID of the user.
   */
  public open fun userId(`value`: String) {
    unwrap(this).setUserId(`value`)
  }

  /**
   * The username of the user.
   */
  public open fun userName(): String = unwrap(this).getUserName()

  /**
   * The username of the user.
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnUser].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Access permissions string used for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-accessstring)
     * @param accessString Access permissions string used for this user. 
     */
    public fun accessString(accessString: String)

    /**
     * Specifies the authentication mode to use. Below is an example of the possible JSON values:.
     *
     * ```
     * { Passwords: ["*****", "******"] // If Type is password.
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-authenticationmode)
     * @param authenticationMode Specifies the authentication mode to use. Below is an example of
     * the possible JSON values:. 
     */
    public fun authenticationMode(authenticationMode: Any)

    /**
     * The current supported value is redis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-engine)
     * @param engine The current supported value is redis. 
     */
    public fun engine(engine: String)

    /**
     * Indicates a password is not required for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
     * @param noPasswordRequired Indicates a password is not required for this user. 
     */
    public fun noPasswordRequired(noPasswordRequired: Boolean)

    /**
     * Indicates a password is not required for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
     * @param noPasswordRequired Indicates a password is not required for this user. 
     */
    public fun noPasswordRequired(noPasswordRequired: IResolvable)

    /**
     * Passwords used for this user.
     *
     * You can create up to two passwords for each user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
     * @param passwords Passwords used for this user. 
     */
    public fun passwords(passwords: List<String>)

    /**
     * Passwords used for this user.
     *
     * You can create up to two passwords for each user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
     * @param passwords Passwords used for this user. 
     */
    public fun passwords(vararg passwords: String)

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-userid)
     * @param userId The ID of the user. 
     */
    public fun userId(userId: String)

    /**
     * The username of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-username)
     * @param userName The username of the user. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUser.Builder =
        software.amazon.awscdk.services.elasticache.CfnUser.Builder.create(scope, id)

    /**
     * Access permissions string used for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-accessstring)
     * @param accessString Access permissions string used for this user. 
     */
    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    /**
     * Specifies the authentication mode to use. Below is an example of the possible JSON values:.
     *
     * ```
     * { Passwords: ["*****", "******"] // If Type is password.
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-authenticationmode)
     * @param authenticationMode Specifies the authentication mode to use. Below is an example of
     * the possible JSON values:. 
     */
    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    /**
     * The current supported value is redis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-engine)
     * @param engine The current supported value is redis. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * Indicates a password is not required for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
     * @param noPasswordRequired Indicates a password is not required for this user. 
     */
    override fun noPasswordRequired(noPasswordRequired: Boolean) {
      cdkBuilder.noPasswordRequired(noPasswordRequired)
    }

    /**
     * Indicates a password is not required for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
     * @param noPasswordRequired Indicates a password is not required for this user. 
     */
    override fun noPasswordRequired(noPasswordRequired: IResolvable) {
      cdkBuilder.noPasswordRequired(noPasswordRequired.let(IResolvable::unwrap))
    }

    /**
     * Passwords used for this user.
     *
     * You can create up to two passwords for each user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
     * @param passwords Passwords used for this user. 
     */
    override fun passwords(passwords: List<String>) {
      cdkBuilder.passwords(passwords)
    }

    /**
     * Passwords used for this user.
     *
     * You can create up to two passwords for each user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
     * @param passwords Passwords used for this user. 
     */
    override fun passwords(vararg passwords: String): Unit = passwords(passwords.toList())

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-userid)
     * @param userId The ID of the user. 
     */
    override fun userId(userId: String) {
      cdkBuilder.userId(userId)
    }

    /**
     * The username of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-username)
     * @param userName The username of the user. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.elasticache.CfnUser =
        wrapped.cdkObject
  }

  /**
   * Specifies the authentication mode to use.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * AuthenticationModeProperty authenticationModeProperty = AuthenticationModeProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .passwords(List.of("passwords"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-user-authenticationmode.html)
   */
  public interface AuthenticationModeProperty {
    /**
     * Specifies the passwords to use for authentication if `Type` is set to `password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-user-authenticationmode.html#cfn-elasticache-user-authenticationmode-passwords)
     */
    public fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

    /**
     * Specifies the authentication type.
     *
     * Possible options are IAM authentication, password and no password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-user-authenticationmode.html#cfn-elasticache-user-authenticationmode-type)
     */
    public fun type(): String

    /**
     * A builder for [AuthenticationModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param passwords Specifies the passwords to use for authentication if `Type` is set to
       * `password` .
       */
      public fun passwords(passwords: List<String>)

      /**
       * @param passwords Specifies the passwords to use for authentication if `Type` is set to
       * `password` .
       */
      public fun passwords(vararg passwords: String)

      /**
       * @param type Specifies the authentication type. 
       * Possible options are IAM authentication, password and no password.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty.Builder =
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty.builder()

      /**
       * @param passwords Specifies the passwords to use for authentication if `Type` is set to
       * `password` .
       */
      override fun passwords(passwords: List<String>) {
        cdkBuilder.passwords(passwords)
      }

      /**
       * @param passwords Specifies the passwords to use for authentication if `Type` is set to
       * `password` .
       */
      override fun passwords(vararg passwords: String): Unit = passwords(passwords.toList())

      /**
       * @param type Specifies the authentication type. 
       * Possible options are IAM authentication, password and no password.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty,
    ) : CdkObject(cdkObject), AuthenticationModeProperty {
      /**
       * Specifies the passwords to use for authentication if `Type` is set to `password` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-user-authenticationmode.html#cfn-elasticache-user-authenticationmode-passwords)
       */
      override fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

      /**
       * Specifies the authentication type.
       *
       * Possible options are IAM authentication, password and no password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-user-authenticationmode.html#cfn-elasticache-user-authenticationmode-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticationModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty):
          AuthenticationModeProperty = CdkObjectWrappers.wrap(cdkObject) as
          AuthenticationModeProperty

      internal fun unwrap(wrapped: AuthenticationModeProperty):
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty
    }
  }
}
