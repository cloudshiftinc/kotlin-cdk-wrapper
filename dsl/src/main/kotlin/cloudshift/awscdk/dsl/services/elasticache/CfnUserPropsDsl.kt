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
import software.amazon.awscdk.services.elasticache.CfnUserProps

@CdkDslMarker
public class CfnUserPropsDsl {
  private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

  private val _passwords: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accessString Access permissions string used for this user.
   */
  public fun accessString(accessString: String) {
    cdkBuilder.accessString(accessString)
  }

  /**
   * @param authenticationMode Specifies the authentication mode to use. Below is an example of the
   * possible JSON values:.
   * ```
   * { Type: &lt;iam | no-password-required | password&gt; Passwords: ["*****", "******"] // If Type
   * is password.
   * }
   * ```
   */
  public fun authenticationMode(authenticationMode: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(authenticationMode)
    cdkBuilder.authenticationMode(builder.map)
  }

  /**
   * @param authenticationMode Specifies the authentication mode to use. Below is an example of the
   * possible JSON values:.
   * ```
   * { Type: &lt;iam | no-password-required | password&gt; Passwords: ["*****", "******"] // If Type
   * is password.
   * }
   * ```
   */
  public fun authenticationMode(authenticationMode: Any) {
    cdkBuilder.authenticationMode(authenticationMode)
  }

  /**
   * @param engine The current supported value is redis. 
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  /**
   * @param noPasswordRequired Indicates a password is not required for this user.
   */
  public fun noPasswordRequired(noPasswordRequired: Boolean) {
    cdkBuilder.noPasswordRequired(noPasswordRequired)
  }

  /**
   * @param noPasswordRequired Indicates a password is not required for this user.
   */
  public fun noPasswordRequired(noPasswordRequired: IResolvable) {
    cdkBuilder.noPasswordRequired(noPasswordRequired)
  }

  /**
   * @param passwords Passwords used for this user.
   * You can create up to two passwords for each user.
   */
  public fun passwords(vararg passwords: String) {
    _passwords.addAll(listOf(*passwords))
  }

  /**
   * @param passwords Passwords used for this user.
   * You can create up to two passwords for each user.
   */
  public fun passwords(passwords: Collection<String>) {
    _passwords.addAll(passwords)
  }

  /**
   * @param tags An array of key-value pairs to apply to this user.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this user.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param userId The ID of the user. 
   */
  public fun userId(userId: String) {
    cdkBuilder.userId(userId)
  }

  /**
   * @param userName The username of the user. 
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnUserProps {
    if(_passwords.isNotEmpty()) cdkBuilder.passwords(_passwords)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
