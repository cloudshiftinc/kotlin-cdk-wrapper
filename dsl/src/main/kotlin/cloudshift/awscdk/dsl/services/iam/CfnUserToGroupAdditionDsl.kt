@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnUserToGroupAddition
import software.constructs.Construct

@CdkDslMarker
public class CfnUserToGroupAdditionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserToGroupAddition.Builder =
      CfnUserToGroupAddition.Builder.create(scope, id)

  private val _users: MutableList<String> = mutableListOf()

  /**
   * The name of the group to update.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-groupname)
   * @param groupName The name of the group to update. 
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * A list of the names of the users that you want to add to the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
   * @param users A list of the names of the users that you want to add to the group. 
   */
  public fun users(vararg users: String) {
    _users.addAll(listOf(*users))
  }

  /**
   * A list of the names of the users that you want to add to the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-usertogroupaddition.html#cfn-iam-usertogroupaddition-users)
   * @param users A list of the names of the users that you want to add to the group. 
   */
  public fun users(users: Collection<String>) {
    _users.addAll(users)
  }

  public fun build(): CfnUserToGroupAddition {
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}
