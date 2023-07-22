@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.ProviderAttribute

@CdkDslMarker
public class AttributeMappingDsl {
  private val cdkBuilder: AttributeMapping.Builder = AttributeMapping.builder()

  /**
   * @param address The user's postal address is a required attribute.
   */
  public fun address(address: ProviderAttribute) {
    cdkBuilder.address(address)
  }

  /**
   * @param birthdate The user's birthday.
   */
  public fun birthdate(birthdate: ProviderAttribute) {
    cdkBuilder.birthdate(birthdate)
  }

  /**
   * @param custom Specify custom attribute mapping here and mapping for any standard attributes not
   * supported yet.
   */
  public fun custom(custom: Map<String, ProviderAttribute>) {
    cdkBuilder.custom(custom)
  }

  /**
   * @param email The user's e-mail address.
   */
  public fun email(email: ProviderAttribute) {
    cdkBuilder.email(email)
  }

  /**
   * @param familyName The surname or last name of user.
   */
  public fun familyName(familyName: ProviderAttribute) {
    cdkBuilder.familyName(familyName)
  }

  /**
   * @param fullname The user's full name in displayable form.
   */
  public fun fullname(fullname: ProviderAttribute) {
    cdkBuilder.fullname(fullname)
  }

  /**
   * @param gender The user's gender.
   */
  public fun gender(gender: ProviderAttribute) {
    cdkBuilder.gender(gender)
  }

  /**
   * @param givenName The user's first name or give name.
   */
  public fun givenName(givenName: ProviderAttribute) {
    cdkBuilder.givenName(givenName)
  }

  /**
   * @param lastUpdateTime Time, the user's information was last updated.
   */
  public fun lastUpdateTime(lastUpdateTime: ProviderAttribute) {
    cdkBuilder.lastUpdateTime(lastUpdateTime)
  }

  /**
   * @param locale The user's locale.
   */
  public fun locale(locale: ProviderAttribute) {
    cdkBuilder.locale(locale)
  }

  /**
   * @param middleName The user's middle name.
   */
  public fun middleName(middleName: ProviderAttribute) {
    cdkBuilder.middleName(middleName)
  }

  /**
   * @param nickname The user's nickname or casual name.
   */
  public fun nickname(nickname: ProviderAttribute) {
    cdkBuilder.nickname(nickname)
  }

  /**
   * @param phoneNumber The user's telephone number.
   */
  public fun phoneNumber(phoneNumber: ProviderAttribute) {
    cdkBuilder.phoneNumber(phoneNumber)
  }

  /**
   * @param preferredUsername The user's preferred username.
   */
  public fun preferredUsername(preferredUsername: ProviderAttribute) {
    cdkBuilder.preferredUsername(preferredUsername)
  }

  /**
   * @param profilePage The URL to the user's profile page.
   */
  public fun profilePage(profilePage: ProviderAttribute) {
    cdkBuilder.profilePage(profilePage)
  }

  /**
   * @param profilePicture The URL to the user's profile picture.
   */
  public fun profilePicture(profilePicture: ProviderAttribute) {
    cdkBuilder.profilePicture(profilePicture)
  }

  /**
   * @param timezone The user's time zone.
   */
  public fun timezone(timezone: ProviderAttribute) {
    cdkBuilder.timezone(timezone)
  }

  /**
   * @param website The URL to the user's web page or blog.
   */
  public fun website(website: ProviderAttribute) {
    cdkBuilder.website(website)
  }

  public fun build(): AttributeMapping = cdkBuilder.build()
}
