@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.StandardAttributesMask

/**
 * This interface contains standard attributes recognized by Cognito from
 * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
 * including built-in attributes `email_verified` and `phone_number_verified`.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * ClientAttributes clientWriteAttributes = (new
 * ClientAttributes()).withStandardAttributes(StandardAttributesMask.builder().fullname(true).email(true).build()).withCustomAttributes("favouritePizza",
 * "favouriteBeverage");
 * ClientAttributes clientReadAttributes =
 * clientWriteAttributes.withStandardAttributes(StandardAttributesMask.builder().emailVerified(true).build()).withCustomAttributes("pointsEarned");
 * pool.addClient("app-client", UserPoolClientOptions.builder()
 * // ...
 * .readAttributes(clientReadAttributes)
 * .writeAttributes(clientWriteAttributes)
 * .build());
 * ```
 */
@CdkDslMarker
public class StandardAttributesMaskDsl {
  private val cdkBuilder: StandardAttributesMask.Builder = StandardAttributesMask.builder()

  /**
   * @param address The user's postal address.
   */
  public fun address(address: Boolean) {
    cdkBuilder.address(address)
  }

  /**
   * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
   */
  public fun birthdate(birthdate: Boolean) {
    cdkBuilder.birthdate(birthdate)
  }

  /**
   * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
   */
  public fun email(email: Boolean) {
    cdkBuilder.email(email)
  }

  /**
   * @param emailVerified Whether the email address has been verified.
   */
  public fun emailVerified(emailVerified: Boolean) {
    cdkBuilder.emailVerified(emailVerified)
  }

  /**
   * @param familyName The surname or last name of the user.
   */
  public fun familyName(familyName: Boolean) {
    cdkBuilder.familyName(familyName)
  }

  /**
   * @param fullname The user's full name in displayable form, including all name parts, titles and
   * suffixes.
   */
  public fun fullname(fullname: Boolean) {
    cdkBuilder.fullname(fullname)
  }

  /**
   * @param gender The user's gender.
   */
  public fun gender(gender: Boolean) {
    cdkBuilder.gender(gender)
  }

  /**
   * @param givenName The user's first name or give name.
   */
  public fun givenName(givenName: Boolean) {
    cdkBuilder.givenName(givenName)
  }

  /**
   * @param lastUpdateTime The time, the user's information was last updated.
   */
  public fun lastUpdateTime(lastUpdateTime: Boolean) {
    cdkBuilder.lastUpdateTime(lastUpdateTime)
  }

  /**
   * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
   */
  public fun locale(locale: Boolean) {
    cdkBuilder.locale(locale)
  }

  /**
   * @param middleName The user's middle name.
   */
  public fun middleName(middleName: Boolean) {
    cdkBuilder.middleName(middleName)
  }

  /**
   * @param nickname The user's nickname or casual name.
   */
  public fun nickname(nickname: Boolean) {
    cdkBuilder.nickname(nickname)
  }

  /**
   * @param phoneNumber The user's telephone number.
   */
  public fun phoneNumber(phoneNumber: Boolean) {
    cdkBuilder.phoneNumber(phoneNumber)
  }

  /**
   * @param phoneNumberVerified Whether the phone number has been verified.
   */
  public fun phoneNumberVerified(phoneNumberVerified: Boolean) {
    cdkBuilder.phoneNumberVerified(phoneNumberVerified)
  }

  /**
   * @param preferredUsername The user's preffered username, different from the immutable user name.
   */
  public fun preferredUsername(preferredUsername: Boolean) {
    cdkBuilder.preferredUsername(preferredUsername)
  }

  /**
   * @param profilePage The URL to the user's profile page.
   */
  public fun profilePage(profilePage: Boolean) {
    cdkBuilder.profilePage(profilePage)
  }

  /**
   * @param profilePicture The URL to the user's profile picture.
   */
  public fun profilePicture(profilePicture: Boolean) {
    cdkBuilder.profilePicture(profilePicture)
  }

  /**
   * @param timezone The user's time zone.
   */
  public fun timezone(timezone: Boolean) {
    cdkBuilder.timezone(timezone)
  }

  /**
   * @param website The URL to the user's web page or blog.
   */
  public fun website(website: Boolean) {
    cdkBuilder.website(website)
  }

  public fun build(): StandardAttributesMask = cdkBuilder.build()
}
