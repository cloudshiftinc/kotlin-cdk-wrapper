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

/**
 * Specifies a user account for an Amazon Connect instance.
 *
 * For information about how to create user accounts using the Amazon Connect console, see [Add
 * Users](https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html) in the *Amazon
 * Connect Administrator Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
 * .instanceArn("instanceArn")
 * .phoneConfig(UserPhoneConfigProperty.builder()
 * .phoneType("phoneType")
 * // the properties below are optional
 * .afterContactWorkTimeLimit(123)
 * .autoAccept(false)
 * .deskPhoneNumber("deskPhoneNumber")
 * .build())
 * .routingProfileArn("routingProfileArn")
 * .securityProfileArns(List.of("securityProfileArns"))
 * .username("username")
 * // the properties below are optional
 * .directoryUserId("directoryUserId")
 * .hierarchyGroupArn("hierarchyGroupArn")
 * .identityInfo(UserIdentityInfoProperty.builder()
 * .email("email")
 * .firstName("firstName")
 * .lastName("lastName")
 * .mobile("mobile")
 * .secondaryEmail("secondaryEmail")
 * .build())
 * .password("password")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html)
 */
@CdkDslMarker
public class CfnUserDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

  private val _securityProfileArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The identifier of the user account in the directory used for identity management.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-directoryuserid)
   * @param directoryUserId The identifier of the user account in the directory used for identity
   * management. 
   */
  public fun directoryUserId(directoryUserId: String) {
    cdkBuilder.directoryUserId(directoryUserId)
  }

  /**
   * The Amazon Resource Name (ARN) of the user's hierarchy group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-hierarchygrouparn)
   * @param hierarchyGroupArn The Amazon Resource Name (ARN) of the user's hierarchy group. 
   */
  public fun hierarchyGroupArn(hierarchyGroupArn: String) {
    cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
  }

  /**
   * Information about the user identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
   * @param identityInfo Information about the user identity. 
   */
  public fun identityInfo(identityInfo: IResolvable) {
    cdkBuilder.identityInfo(identityInfo)
  }

  /**
   * Information about the user identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-identityinfo)
   * @param identityInfo Information about the user identity. 
   */
  public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty) {
    cdkBuilder.identityInfo(identityInfo)
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-instancearn)
   * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * The user's password.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-password)
   * @param password The user's password. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * Information about the phone configuration for the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
   * @param phoneConfig Information about the phone configuration for the user. 
   */
  public fun phoneConfig(phoneConfig: IResolvable) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  /**
   * Information about the phone configuration for the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-phoneconfig)
   * @param phoneConfig Information about the phone configuration for the user. 
   */
  public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  /**
   * The Amazon Resource Name (ARN) of the user's routing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-routingprofilearn)
   * @param routingProfileArn The Amazon Resource Name (ARN) of the user's routing profile. 
   */
  public fun routingProfileArn(routingProfileArn: String) {
    cdkBuilder.routingProfileArn(routingProfileArn)
  }

  /**
   * The Amazon Resource Name (ARN) of the user's security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
   * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
   */
  public fun securityProfileArns(vararg securityProfileArns: String) {
    _securityProfileArns.addAll(listOf(*securityProfileArns))
  }

  /**
   * The Amazon Resource Name (ARN) of the user's security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-securityprofilearns)
   * @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. 
   */
  public fun securityProfileArns(securityProfileArns: Collection<String>) {
    _securityProfileArns.addAll(securityProfileArns)
  }

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
   * @param tags The tags. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-tags)
   * @param tags The tags. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The user name assigned to the user account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html#cfn-connect-user-username)
   * @param username The user name assigned to the user account. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnUser {
    if(_securityProfileArns.isNotEmpty()) cdkBuilder.securityProfileArns(_securityProfileArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
