@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
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
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * Object authenticationMode;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
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
public interface CfnUserProps {
  /**
   * Access permissions string used for this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-accessstring)
   */
  public fun accessString(): String? = unwrap(this).getAccessString()

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
   */
  public fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-username)
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
     * @param authenticationMode Denotes whether the user requires a password to authenticate.
     * *Example:*
     *
     * `mynewdbuser: Type: AWS::MemoryDB::User Properties: AccessString: on ~* &amp;* +&#64;all
     * AuthenticationMode: Passwords: '1234567890123456' Type: password UserName: mynewdbuser
     * AuthenticationMode: { "Passwords": ["1234567890123456"], "Type": "Password" }`
     */
    public fun authenticationMode(authenticationMode: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userName The name of the user. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnUserProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnUserProps.builder()

    /**
     * @param accessString Access permissions string used for this user.
     */
    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    /**
     * @param authenticationMode Denotes whether the user requires a password to authenticate.
     * *Example:*
     *
     * `mynewdbuser: Type: AWS::MemoryDB::User Properties: AccessString: on ~* &amp;* +&#64;all
     * AuthenticationMode: Passwords: '1234567890123456' Type: password UserName: mynewdbuser
     * AuthenticationMode: { "Passwords": ["1234567890123456"], "Type": "Password" }`
     */
    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userName The name of the user. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.memorydb.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    /**
     * Access permissions string used for this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-accessstring)
     */
    override fun accessString(): String? = unwrap(this).getAccessString()

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
     */
    override fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html#cfn-memorydb-user-username)
     */
    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnUserProps):
        CfnUserProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.memorydb.CfnUserProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.memorydb.CfnUserProps
  }
}
