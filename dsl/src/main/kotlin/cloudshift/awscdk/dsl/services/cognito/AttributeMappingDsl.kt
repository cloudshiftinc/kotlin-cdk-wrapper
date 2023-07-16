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

  public fun address(address: ProviderAttribute) {
    cdkBuilder.address(address)
  }

  public fun birthdate(birthdate: ProviderAttribute) {
    cdkBuilder.birthdate(birthdate)
  }

  public fun custom(custom: Map<String, out ProviderAttribute>) {
    cdkBuilder.custom(custom)
  }

  public fun email(email: ProviderAttribute) {
    cdkBuilder.email(email)
  }

  public fun familyName(familyName: ProviderAttribute) {
    cdkBuilder.familyName(familyName)
  }

  public fun fullname(fullname: ProviderAttribute) {
    cdkBuilder.fullname(fullname)
  }

  public fun gender(gender: ProviderAttribute) {
    cdkBuilder.gender(gender)
  }

  public fun givenName(givenName: ProviderAttribute) {
    cdkBuilder.givenName(givenName)
  }

  public fun lastUpdateTime(lastUpdateTime: ProviderAttribute) {
    cdkBuilder.lastUpdateTime(lastUpdateTime)
  }

  public fun locale(locale: ProviderAttribute) {
    cdkBuilder.locale(locale)
  }

  public fun middleName(middleName: ProviderAttribute) {
    cdkBuilder.middleName(middleName)
  }

  public fun nickname(nickname: ProviderAttribute) {
    cdkBuilder.nickname(nickname)
  }

  public fun phoneNumber(phoneNumber: ProviderAttribute) {
    cdkBuilder.phoneNumber(phoneNumber)
  }

  public fun preferredUsername(preferredUsername: ProviderAttribute) {
    cdkBuilder.preferredUsername(preferredUsername)
  }

  public fun profilePage(profilePage: ProviderAttribute) {
    cdkBuilder.profilePage(profilePage)
  }

  public fun profilePicture(profilePicture: ProviderAttribute) {
    cdkBuilder.profilePicture(profilePicture)
  }

  public fun timezone(timezone: ProviderAttribute) {
    cdkBuilder.timezone(timezone)
  }

  public fun website(website: ProviderAttribute) {
    cdkBuilder.website(website)
  }

  public fun build(): AttributeMapping = cdkBuilder.build()
}
