@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnUser
import software.constructs.Construct

@CdkDslMarker
public class CfnUserDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

  private val _groups: MutableList<String> = mutableListOf()

  private val _managedPolicyArns: MutableList<String> = mutableListOf()

  private val _policies: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun groups(vararg groups: String) {
    _groups.addAll(listOf(*groups))
  }

  public fun groups(groups: Collection<String>) {
    _groups.addAll(groups)
  }

  public fun loginProfile(loginProfile: IResolvable) {
    cdkBuilder.loginProfile(loginProfile)
  }

  public fun loginProfile(loginProfile: CfnUser.LoginProfileProperty) {
    cdkBuilder.loginProfile(loginProfile)
  }

  public fun managedPolicyArns(vararg managedPolicyArns: String) {
    _managedPolicyArns.addAll(listOf(*managedPolicyArns))
  }

  public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
    _managedPolicyArns.addAll(managedPolicyArns)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun permissionsBoundary(permissionsBoundary: String) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  public fun policies(vararg policies: Any) {
    _policies.addAll(listOf(*policies))
  }

  public fun policies(policies: Collection<Any>) {
    _policies.addAll(policies)
  }

  public fun policies(policies: IResolvable) {
    cdkBuilder.policies(policies)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnUser {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
    if(_policies.isNotEmpty()) cdkBuilder.policies(_policies)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
