@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.elasticache.CfnUserGroupProps

@CdkDslMarker
public class CfnUserGroupPropsDsl {
  private val cdkBuilder: CfnUserGroupProps.Builder = CfnUserGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _userIds: MutableList<String> = mutableListOf()

  /**
   * @param engine The current supported value is redis. 
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
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
   * @param userGroupId The ID of the user group. 
   */
  public fun userGroupId(userGroupId: String) {
    cdkBuilder.userGroupId(userGroupId)
  }

  /**
   * @param userIds The list of user IDs that belong to the user group. 
   * A user named `default` must be included.
   */
  public fun userIds(vararg userIds: String) {
    _userIds.addAll(listOf(*userIds))
  }

  /**
   * @param userIds The list of user IDs that belong to the user group. 
   * A user named `default` must be included.
   */
  public fun userIds(userIds: Collection<String>) {
    _userIds.addAll(userIds)
  }

  public fun build(): CfnUserGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_userIds.isNotEmpty()) cdkBuilder.userIds(_userIds)
    return cdkBuilder.build()
  }
}
