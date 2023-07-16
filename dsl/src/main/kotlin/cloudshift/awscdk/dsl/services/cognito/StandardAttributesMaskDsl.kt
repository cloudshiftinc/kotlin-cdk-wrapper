@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.StandardAttributesMask

@CdkDslMarker
public class StandardAttributesMaskDsl {
  private val cdkBuilder: StandardAttributesMask.Builder = StandardAttributesMask.builder()

  public fun address(address: Boolean) {
    cdkBuilder.address(address)
  }

  public fun birthdate(birthdate: Boolean) {
    cdkBuilder.birthdate(birthdate)
  }

  public fun email(email: Boolean) {
    cdkBuilder.email(email)
  }

  public fun emailVerified(emailVerified: Boolean) {
    cdkBuilder.emailVerified(emailVerified)
  }

  public fun familyName(familyName: Boolean) {
    cdkBuilder.familyName(familyName)
  }

  public fun fullname(fullname: Boolean) {
    cdkBuilder.fullname(fullname)
  }

  public fun gender(gender: Boolean) {
    cdkBuilder.gender(gender)
  }

  public fun givenName(givenName: Boolean) {
    cdkBuilder.givenName(givenName)
  }

  public fun lastUpdateTime(lastUpdateTime: Boolean) {
    cdkBuilder.lastUpdateTime(lastUpdateTime)
  }

  public fun locale(locale: Boolean) {
    cdkBuilder.locale(locale)
  }

  public fun middleName(middleName: Boolean) {
    cdkBuilder.middleName(middleName)
  }

  public fun nickname(nickname: Boolean) {
    cdkBuilder.nickname(nickname)
  }

  public fun phoneNumber(phoneNumber: Boolean) {
    cdkBuilder.phoneNumber(phoneNumber)
  }

  public fun phoneNumberVerified(phoneNumberVerified: Boolean) {
    cdkBuilder.phoneNumberVerified(phoneNumberVerified)
  }

  public fun preferredUsername(preferredUsername: Boolean) {
    cdkBuilder.preferredUsername(preferredUsername)
  }

  public fun profilePage(profilePage: Boolean) {
    cdkBuilder.profilePage(profilePage)
  }

  public fun profilePicture(profilePicture: Boolean) {
    cdkBuilder.profilePicture(profilePicture)
  }

  public fun timezone(timezone: Boolean) {
    cdkBuilder.timezone(timezone)
  }

  public fun website(website: Boolean) {
    cdkBuilder.website(website)
  }

  public fun build(): StandardAttributesMask = cdkBuilder.build()
}
