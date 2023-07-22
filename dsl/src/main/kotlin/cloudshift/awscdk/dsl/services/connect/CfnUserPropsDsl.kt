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
import software.amazon.awscdk.services.connect.CfnUserProps

@CdkDslMarker
public class CfnUserPropsDsl {
  private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

  private val _securityProfileArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param directoryUserId The identifier of the user account in the directory used for identity
   * management.
   */
  public fun directoryUserId(directoryUserId: String) {
    cdkBuilder.directoryUserId(directoryUserId)
  }

  /**
   * @param hierarchyGroupArn The Amazon Resource Name (ARN) of the user's hierarchy group.
   */
  public fun hierarchyGroupArn(hierarchyGroupArn: String) {
    cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
  }

  /**
   * @param identityInfo Information about the user identity.
   */
  public fun identityInfo(identityInfo: IResolvable) {
    cdkBuilder.identityInfo(identityInfo)
  }

  /**
   * @param identityInfo Information about the user identity.
   */
  public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty) {
    cdkBuilder.identityInfo(identityInfo)
  }

  /**
   * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param password The user's password.
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param phoneConfig Information about the phone configuration for the user. 
   */
  public fun phoneConfig(phoneConfig: IResolvable) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  /**
   * @param phoneConfig Information about the phone configuration for the user. 
   */
  public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  /**
   * @param routingProfileArn The Amazon Resource Name (ARN) of the user's routing profile. 
   */
  public fun routingProfileArn(routingProfileArn: String) {
    cdkBuilder.routingProfileArn(routingProfileArn)
  }

  /**
   * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
   */
  public fun securityProfileArns(vararg securityProfileArns: String) {
    _securityProfileArns.addAll(listOf(*securityProfileArns))
  }

  /**
   * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
   */
  public fun securityProfileArns(securityProfileArns: Collection<String>) {
    _securityProfileArns.addAll(securityProfileArns)
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param username The user name assigned to the user account. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnUserProps {
    if(_securityProfileArns.isNotEmpty()) cdkBuilder.securityProfileArns(_securityProfileArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
