@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnUser
import software.constructs.Construct

@CdkDslMarker
public class CfnUserDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

  private val _securityProfileArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun directoryUserId(directoryUserId: String) {
    cdkBuilder.directoryUserId(directoryUserId)
  }

  public fun hierarchyGroupArn(hierarchyGroupArn: String) {
    cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
  }

  public fun identityInfo(identityInfo: IResolvable) {
    cdkBuilder.identityInfo(identityInfo)
  }

  public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty) {
    cdkBuilder.identityInfo(identityInfo)
  }

  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun phoneConfig(phoneConfig: IResolvable) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  public fun routingProfileArn(routingProfileArn: String) {
    cdkBuilder.routingProfileArn(routingProfileArn)
  }

  public fun securityProfileArns(vararg securityProfileArns: String) {
    _securityProfileArns.addAll(listOf(*securityProfileArns))
  }

  public fun securityProfileArns(securityProfileArns: Collection<String>) {
    _securityProfileArns.addAll(securityProfileArns)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnUser {
    if(_securityProfileArns.isNotEmpty()) cdkBuilder.securityProfileArns(_securityProfileArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
