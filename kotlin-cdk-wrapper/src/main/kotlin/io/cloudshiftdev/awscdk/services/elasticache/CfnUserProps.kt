@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * Object authenticationMode;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
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
public interface CfnUserProps {
  /**
   * Access permissions string used for this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-accessstring)
   */
  public fun accessString(): String? = unwrap(this).getAccessString()

  /**
   * Specifies the authentication mode to use. Below is an example of the possible JSON values:.
   *
   * ```
   * { Passwords: ["*****", "******"] // If Type is password.
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-authenticationmode)
   */
  public fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  /**
   * The current supported value is redis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-engine)
   */
  public fun engine(): String

  /**
   * Indicates a password is not required for this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
   */
  public fun noPasswordRequired(): Any? = unwrap(this).getNoPasswordRequired()

  /**
   * Passwords used for this user.
   *
   * You can create up to two passwords for each user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
   */
  public fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

  /**
   * An array of key-value pairs to apply to this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-userid)
   */
  public fun userId(): String

  /**
   * The username of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-username)
   */
  public fun userName(): String

  /**
   * A builder for [CfnUserProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessString Access permissions string used for this user.
     */
    public fun accessString(accessString: String)

    /**
     * @param authenticationMode Specifies the authentication mode to use. Below is an example of
     * the possible JSON values:.
     * ```
     * { Passwords: ["*****", "******"] // If Type is password.
     * }
     * ```
     */
    public fun authenticationMode(authenticationMode: Any)

    /**
     * @param engine The current supported value is redis. 
     */
    public fun engine(engine: String)

    /**
     * @param noPasswordRequired Indicates a password is not required for this user.
     */
    public fun noPasswordRequired(noPasswordRequired: Boolean)

    /**
     * @param noPasswordRequired Indicates a password is not required for this user.
     */
    public fun noPasswordRequired(noPasswordRequired: IResolvable)

    /**
     * @param passwords Passwords used for this user.
     * You can create up to two passwords for each user.
     */
    public fun passwords(passwords: List<String>)

    /**
     * @param passwords Passwords used for this user.
     * You can create up to two passwords for each user.
     */
    public fun passwords(vararg passwords: String)

    /**
     * @param tags An array of key-value pairs to apply to this user.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this user.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userId The ID of the user. 
     */
    public fun userId(userId: String)

    /**
     * @param userName The username of the user. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUserProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnUserProps.builder()

    /**
     * @param accessString Access permissions string used for this user.
     */
    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    /**
     * @param authenticationMode Specifies the authentication mode to use. Below is an example of
     * the possible JSON values:.
     * ```
     * { Passwords: ["*****", "******"] // If Type is password.
     * }
     * ```
     */
    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    /**
     * @param engine The current supported value is redis. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param noPasswordRequired Indicates a password is not required for this user.
     */
    override fun noPasswordRequired(noPasswordRequired: Boolean) {
      cdkBuilder.noPasswordRequired(noPasswordRequired)
    }

    /**
     * @param noPasswordRequired Indicates a password is not required for this user.
     */
    override fun noPasswordRequired(noPasswordRequired: IResolvable) {
      cdkBuilder.noPasswordRequired(noPasswordRequired.let(IResolvable::unwrap))
    }

    /**
     * @param passwords Passwords used for this user.
     * You can create up to two passwords for each user.
     */
    override fun passwords(passwords: List<String>) {
      cdkBuilder.passwords(passwords)
    }

    /**
     * @param passwords Passwords used for this user.
     * You can create up to two passwords for each user.
     */
    override fun passwords(vararg passwords: String): Unit = passwords(passwords.toList())

    /**
     * @param tags An array of key-value pairs to apply to this user.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this user.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userId The ID of the user. 
     */
    override fun userId(userId: String) {
      cdkBuilder.userId(userId)
    }

    /**
     * @param userName The username of the user. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnUserProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    /**
     * Access permissions string used for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-accessstring)
     */
    override fun accessString(): String? = unwrap(this).getAccessString()

    /**
     * Specifies the authentication mode to use. Below is an example of the possible JSON values:.
     *
     * ```
     * { Passwords: ["*****", "******"] // If Type is password.
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-authenticationmode)
     */
    override fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

    /**
     * The current supported value is redis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-engine)
     */
    override fun engine(): String = unwrap(this).getEngine()

    /**
     * Indicates a password is not required for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
     */
    override fun noPasswordRequired(): Any? = unwrap(this).getNoPasswordRequired()

    /**
     * Passwords used for this user.
     *
     * You can create up to two passwords for each user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
     */
    override fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-userid)
     */
    override fun userId(): String = unwrap(this).getUserId()

    /**
     * The username of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-username)
     */
    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUserProps):
        CfnUserProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.elasticache.CfnUserProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.elasticache.CfnUserProps
  }
}
