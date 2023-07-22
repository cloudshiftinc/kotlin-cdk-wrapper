@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnUser
import software.constructs.Construct

@CdkDslMarker
public class CfnUserDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

  private val _passwords: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Access permissions string used for this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-accessstring)
   * @param accessString Access permissions string used for this user. 
   */
  public fun accessString(accessString: String) {
    cdkBuilder.accessString(accessString)
  }

  /**
   * Specifies the authentication mode to use. Below is an example of the possible JSON values:.
   *
   * ```
   * { Type: &lt;iam | no-password-required | password&gt; Passwords: ["*****", "******"] // If Type
   * is password.
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-authenticationmode)
   * @param authenticationMode Specifies the authentication mode to use. Below is an example of the
   * possible JSON values:. 
   */
  public fun authenticationMode(authenticationMode: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(authenticationMode)
    cdkBuilder.authenticationMode(builder.map)
  }

  /**
   * Specifies the authentication mode to use. Below is an example of the possible JSON values:.
   *
   * ```
   * { Type: &lt;iam | no-password-required | password&gt; Passwords: ["*****", "******"] // If Type
   * is password.
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-authenticationmode)
   * @param authenticationMode Specifies the authentication mode to use. Below is an example of the
   * possible JSON values:. 
   */
  public fun authenticationMode(authenticationMode: Any) {
    cdkBuilder.authenticationMode(authenticationMode)
  }

  /**
   * The current supported value is redis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-engine)
   * @param engine The current supported value is redis. 
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  /**
   * Indicates a password is not required for this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
   * @param noPasswordRequired Indicates a password is not required for this user. 
   */
  public fun noPasswordRequired(noPasswordRequired: Boolean) {
    cdkBuilder.noPasswordRequired(noPasswordRequired)
  }

  /**
   * Indicates a password is not required for this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-nopasswordrequired)
   * @param noPasswordRequired Indicates a password is not required for this user. 
   */
  public fun noPasswordRequired(noPasswordRequired: IResolvable) {
    cdkBuilder.noPasswordRequired(noPasswordRequired)
  }

  /**
   * Passwords used for this user.
   *
   * You can create up to two passwords for each user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
   * @param passwords Passwords used for this user. 
   */
  public fun passwords(vararg passwords: String) {
    _passwords.addAll(listOf(*passwords))
  }

  /**
   * Passwords used for this user.
   *
   * You can create up to two passwords for each user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-passwords)
   * @param passwords Passwords used for this user. 
   */
  public fun passwords(passwords: Collection<String>) {
    _passwords.addAll(passwords)
  }

  /**
   * An array of key-value pairs to apply to this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
   * @param tags An array of key-value pairs to apply to this user. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-tags)
   * @param tags An array of key-value pairs to apply to this user. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-userid)
   * @param userId The ID of the user. 
   */
  public fun userId(userId: String) {
    cdkBuilder.userId(userId)
  }

  /**
   * The username of the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-user.html#cfn-elasticache-user-username)
   * @param userName The username of the user. 
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnUser {
    if(_passwords.isNotEmpty()) cdkBuilder.passwords(_passwords)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
