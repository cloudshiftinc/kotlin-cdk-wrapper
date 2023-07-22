@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps

@CdkDslMarker
public class CfnUserToGroupAdditionPropsDsl {
  private val cdkBuilder: CfnUserToGroupAdditionProps.Builder =
      CfnUserToGroupAdditionProps.builder()

  private val _users: MutableList<String> = mutableListOf()

  /**
   * @param groupName The name of the group to update. 
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param users A list of the names of the users that you want to add to the group. 
   */
  public fun users(vararg users: String) {
    _users.addAll(listOf(*users))
  }

  /**
   * @param users A list of the names of the users that you want to add to the group. 
   */
  public fun users(users: Collection<String>) {
    _users.addAll(users)
  }

  public fun build(): CfnUserToGroupAdditionProps {
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
