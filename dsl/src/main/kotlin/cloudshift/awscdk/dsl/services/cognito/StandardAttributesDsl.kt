@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.cognito.StandardAttribute
import software.amazon.awscdk.services.cognito.StandardAttributes

/**
 * The set of standard attributes that can be marked as required or mutable.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .standardAttributes(StandardAttributes.builder()
 * .fullname(StandardAttribute.builder()
 * .required(true)
 * .mutable(false)
 * .build())
 * .address(StandardAttribute.builder()
 * .required(false)
 * .mutable(true)
 * .build())
 * .build())
 * .customAttributes(Map.of(
 * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
 * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
 * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
 * "joinedOn", new DateTimeAttribute()))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes)
 */
@CdkDslMarker
public class StandardAttributesDsl {
  private val cdkBuilder: StandardAttributes.Builder = StandardAttributes.builder()

  /**
   * @param address The user's postal address.
   */
  public fun address(address: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(address)
    cdkBuilder.address(builder.build())
  }

  /**
   * @param address The user's postal address.
   */
  public fun address(address: StandardAttribute) {
    cdkBuilder.address(address)
  }

  /**
   * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
   */
  public fun birthdate(birthdate: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(birthdate)
    cdkBuilder.birthdate(builder.build())
  }

  /**
   * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
   */
  public fun birthdate(birthdate: StandardAttribute) {
    cdkBuilder.birthdate(birthdate)
  }

  /**
   * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
   */
  public fun email(email: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(email)
    cdkBuilder.email(builder.build())
  }

  /**
   * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
   */
  public fun email(email: StandardAttribute) {
    cdkBuilder.email(email)
  }

  /**
   * @param familyName The surname or last name of the user.
   */
  public fun familyName(familyName: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(familyName)
    cdkBuilder.familyName(builder.build())
  }

  /**
   * @param familyName The surname or last name of the user.
   */
  public fun familyName(familyName: StandardAttribute) {
    cdkBuilder.familyName(familyName)
  }

  /**
   * @param fullname The user's full name in displayable form, including all name parts, titles and
   * suffixes.
   */
  public fun fullname(fullname: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(fullname)
    cdkBuilder.fullname(builder.build())
  }

  /**
   * @param fullname The user's full name in displayable form, including all name parts, titles and
   * suffixes.
   */
  public fun fullname(fullname: StandardAttribute) {
    cdkBuilder.fullname(fullname)
  }

  /**
   * @param gender The user's gender.
   */
  public fun gender(gender: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(gender)
    cdkBuilder.gender(builder.build())
  }

  /**
   * @param gender The user's gender.
   */
  public fun gender(gender: StandardAttribute) {
    cdkBuilder.gender(gender)
  }

  /**
   * @param givenName The user's first name or give name.
   */
  public fun givenName(givenName: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(givenName)
    cdkBuilder.givenName(builder.build())
  }

  /**
   * @param givenName The user's first name or give name.
   */
  public fun givenName(givenName: StandardAttribute) {
    cdkBuilder.givenName(givenName)
  }

  /**
   * @param lastUpdateTime The time, the user's information was last updated.
   */
  public fun lastUpdateTime(lastUpdateTime: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(lastUpdateTime)
    cdkBuilder.lastUpdateTime(builder.build())
  }

  /**
   * @param lastUpdateTime The time, the user's information was last updated.
   */
  public fun lastUpdateTime(lastUpdateTime: StandardAttribute) {
    cdkBuilder.lastUpdateTime(lastUpdateTime)
  }

  /**
   * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
   */
  public fun locale(locale: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(locale)
    cdkBuilder.locale(builder.build())
  }

  /**
   * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
   */
  public fun locale(locale: StandardAttribute) {
    cdkBuilder.locale(locale)
  }

  /**
   * @param middleName The user's middle name.
   */
  public fun middleName(middleName: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(middleName)
    cdkBuilder.middleName(builder.build())
  }

  /**
   * @param middleName The user's middle name.
   */
  public fun middleName(middleName: StandardAttribute) {
    cdkBuilder.middleName(middleName)
  }

  /**
   * @param nickname The user's nickname or casual name.
   */
  public fun nickname(nickname: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(nickname)
    cdkBuilder.nickname(builder.build())
  }

  /**
   * @param nickname The user's nickname or casual name.
   */
  public fun nickname(nickname: StandardAttribute) {
    cdkBuilder.nickname(nickname)
  }

  /**
   * @param phoneNumber The user's telephone number.
   */
  public fun phoneNumber(phoneNumber: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(phoneNumber)
    cdkBuilder.phoneNumber(builder.build())
  }

  /**
   * @param phoneNumber The user's telephone number.
   */
  public fun phoneNumber(phoneNumber: StandardAttribute) {
    cdkBuilder.phoneNumber(phoneNumber)
  }

  /**
   * @param preferredUsername The user's preffered username, different from the immutable user name.
   */
  public fun preferredUsername(preferredUsername: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(preferredUsername)
    cdkBuilder.preferredUsername(builder.build())
  }

  /**
   * @param preferredUsername The user's preffered username, different from the immutable user name.
   */
  public fun preferredUsername(preferredUsername: StandardAttribute) {
    cdkBuilder.preferredUsername(preferredUsername)
  }

  /**
   * @param profilePage The URL to the user's profile page.
   */
  public fun profilePage(profilePage: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(profilePage)
    cdkBuilder.profilePage(builder.build())
  }

  /**
   * @param profilePage The URL to the user's profile page.
   */
  public fun profilePage(profilePage: StandardAttribute) {
    cdkBuilder.profilePage(profilePage)
  }

  /**
   * @param profilePicture The URL to the user's profile picture.
   */
  public fun profilePicture(profilePicture: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(profilePicture)
    cdkBuilder.profilePicture(builder.build())
  }

  /**
   * @param profilePicture The URL to the user's profile picture.
   */
  public fun profilePicture(profilePicture: StandardAttribute) {
    cdkBuilder.profilePicture(profilePicture)
  }

  /**
   * @param timezone The user's time zone.
   */
  public fun timezone(timezone: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(timezone)
    cdkBuilder.timezone(builder.build())
  }

  /**
   * @param timezone The user's time zone.
   */
  public fun timezone(timezone: StandardAttribute) {
    cdkBuilder.timezone(timezone)
  }

  /**
   * @param website The URL to the user's web page or blog.
   */
  public fun website(website: StandardAttributeDsl.() -> Unit = {}) {
    val builder = StandardAttributeDsl()
    builder.apply(website)
    cdkBuilder.website(builder.build())
  }

  /**
   * @param website The URL to the user's web page or blog.
   */
  public fun website(website: StandardAttribute) {
    cdkBuilder.website(website)
  }

  public fun build(): StandardAttributes = cdkBuilder.build()
}
