@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnUser
import software.amazon.awscdk.services.connect.CfnUserProps

/**
 * Properties for defining a `CfnUser`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnUserProps cfnUserProps = CfnUserProps.builder()
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
 * .userProficiencies(List.of(UserProficiencyProperty.builder()
 * .attributeName("attributeName")
 * .attributeValue("attributeValue")
 * .level(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html)
 */
@CdkDslMarker
public class CfnUserPropsDsl {
    private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

    private val _securityProfileArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userProficiencies: MutableList<Any> = mutableListOf()

    /**
     * @param directoryUserId The identifier of the user account in the directory used for identity
     *   management.
     */
    public fun directoryUserId(directoryUserId: String) {
        cdkBuilder.directoryUserId(directoryUserId)
    }

    /** @param hierarchyGroupArn The Amazon Resource Name (ARN) of the user's hierarchy group. */
    public fun hierarchyGroupArn(hierarchyGroupArn: String) {
        cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
    }

    /** @param identityInfo Information about the user identity. */
    public fun identityInfo(identityInfo: IResolvable) {
        cdkBuilder.identityInfo(identityInfo)
    }

    /** @param identityInfo Information about the user identity. */
    public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty) {
        cdkBuilder.identityInfo(identityInfo)
    }

    /** @param instanceArn The Amazon Resource Name (ARN) of the instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param password The user's password. */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param phoneConfig Information about the phone configuration for the user. */
    public fun phoneConfig(phoneConfig: IResolvable) {
        cdkBuilder.phoneConfig(phoneConfig)
    }

    /** @param phoneConfig Information about the phone configuration for the user. */
    public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty) {
        cdkBuilder.phoneConfig(phoneConfig)
    }

    /** @param routingProfileArn The Amazon Resource Name (ARN) of the user's routing profile. */
    public fun routingProfileArn(routingProfileArn: String) {
        cdkBuilder.routingProfileArn(routingProfileArn)
    }

    /** @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. */
    public fun securityProfileArns(vararg securityProfileArns: String) {
        _securityProfileArns.addAll(listOf(*securityProfileArns))
    }

    /** @param securityProfileArns The Amazon Resource Name (ARN) of the user's security profile. */
    public fun securityProfileArns(securityProfileArns: Collection<String>) {
        _securityProfileArns.addAll(securityProfileArns)
    }

    /** @param tags The tags. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     *   value that indicates how their level of skill in a specified area.
     */
    public fun userProficiencies(vararg userProficiencies: Any) {
        _userProficiencies.addAll(listOf(*userProficiencies))
    }

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     *   value that indicates how their level of skill in a specified area.
     */
    public fun userProficiencies(userProficiencies: Collection<Any>) {
        _userProficiencies.addAll(userProficiencies)
    }

    /**
     * @param userProficiencies One or more predefined attributes assigned to a user, with a numeric
     *   value that indicates how their level of skill in a specified area.
     */
    public fun userProficiencies(userProficiencies: IResolvable) {
        cdkBuilder.userProficiencies(userProficiencies)
    }

    /** @param username The user name assigned to the user account. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnUserProps {
        if (_securityProfileArns.isNotEmpty()) cdkBuilder.securityProfileArns(_securityProfileArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userProficiencies.isNotEmpty()) cdkBuilder.userProficiencies(_userProficiencies)
        return cdkBuilder.build()
    }
}
