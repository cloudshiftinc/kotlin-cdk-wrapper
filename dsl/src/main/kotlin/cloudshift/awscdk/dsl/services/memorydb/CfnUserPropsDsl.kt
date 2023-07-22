@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.memorydb.CfnUserProps

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.memorydb.*;
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
@CdkDslMarker
public class CfnUserPropsDsl {
  private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accessString Access permissions string used for this user.
   */
  public fun accessString(accessString: String) {
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
  public fun authenticationMode(authenticationMode: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(authenticationMode)
    cdkBuilder.authenticationMode(builder.map)
  }

  /**
   * @param authenticationMode Denotes whether the user requires a password to authenticate.
   * *Example:*
   *
   * `mynewdbuser: Type: AWS::MemoryDB::User Properties: AccessString: on ~* &amp;* +&#64;all
   * AuthenticationMode: Passwords: '1234567890123456' Type: password UserName: mynewdbuser
   * AuthenticationMode: { "Passwords": ["1234567890123456"], "Type": "Password" }`
   */
  public fun authenticationMode(authenticationMode: Any) {
    cdkBuilder.authenticationMode(authenticationMode)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param userName The name of the user. 
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnUserProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
