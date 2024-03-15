@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AttributeMapping {
  public fun address(): ProviderAttribute? = unwrap(this).getAddress()?.let(ProviderAttribute::wrap)

  public fun birthdate(): ProviderAttribute? =
      unwrap(this).getBirthdate()?.let(ProviderAttribute::wrap)

  public fun custom(): Map<String, ProviderAttribute> =
      unwrap(this).getCustom()?.mapValues{ProviderAttribute.wrap(it.value)} ?: emptyMap()

  public fun email(): ProviderAttribute? = unwrap(this).getEmail()?.let(ProviderAttribute::wrap)

  public fun familyName(): ProviderAttribute? =
      unwrap(this).getFamilyName()?.let(ProviderAttribute::wrap)

  public fun fullname(): ProviderAttribute? =
      unwrap(this).getFullname()?.let(ProviderAttribute::wrap)

  public fun gender(): ProviderAttribute? = unwrap(this).getGender()?.let(ProviderAttribute::wrap)

  public fun givenName(): ProviderAttribute? =
      unwrap(this).getGivenName()?.let(ProviderAttribute::wrap)

  public fun lastUpdateTime(): ProviderAttribute? =
      unwrap(this).getLastUpdateTime()?.let(ProviderAttribute::wrap)

  public fun locale(): ProviderAttribute? = unwrap(this).getLocale()?.let(ProviderAttribute::wrap)

  public fun middleName(): ProviderAttribute? =
      unwrap(this).getMiddleName()?.let(ProviderAttribute::wrap)

  public fun nickname(): ProviderAttribute? =
      unwrap(this).getNickname()?.let(ProviderAttribute::wrap)

  public fun phoneNumber(): ProviderAttribute? =
      unwrap(this).getPhoneNumber()?.let(ProviderAttribute::wrap)

  public fun preferredUsername(): ProviderAttribute? =
      unwrap(this).getPreferredUsername()?.let(ProviderAttribute::wrap)

  public fun profilePage(): ProviderAttribute? =
      unwrap(this).getProfilePage()?.let(ProviderAttribute::wrap)

  public fun profilePicture(): ProviderAttribute? =
      unwrap(this).getProfilePicture()?.let(ProviderAttribute::wrap)

  public fun timezone(): ProviderAttribute? =
      unwrap(this).getTimezone()?.let(ProviderAttribute::wrap)

  public fun website(): ProviderAttribute? = unwrap(this).getWebsite()?.let(ProviderAttribute::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun address(address: ProviderAttribute)

    public fun birthdate(birthdate: ProviderAttribute)

    public fun custom(custom: Map<String, ProviderAttribute>)

    public fun email(email: ProviderAttribute)

    public fun familyName(familyName: ProviderAttribute)

    public fun fullname(fullname: ProviderAttribute)

    public fun gender(gender: ProviderAttribute)

    public fun givenName(givenName: ProviderAttribute)

    public fun lastUpdateTime(lastUpdateTime: ProviderAttribute)

    public fun locale(locale: ProviderAttribute)

    public fun middleName(middleName: ProviderAttribute)

    public fun nickname(nickname: ProviderAttribute)

    public fun phoneNumber(phoneNumber: ProviderAttribute)

    public fun preferredUsername(preferredUsername: ProviderAttribute)

    public fun profilePage(profilePage: ProviderAttribute)

    public fun profilePicture(profilePicture: ProviderAttribute)

    public fun timezone(timezone: ProviderAttribute)

    public fun website(website: ProviderAttribute)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AttributeMapping.Builder =
        software.amazon.awscdk.services.cognito.AttributeMapping.builder()

    override fun address(address: ProviderAttribute) {
      cdkBuilder.address(address.let(ProviderAttribute::unwrap))
    }

    override fun birthdate(birthdate: ProviderAttribute) {
      cdkBuilder.birthdate(birthdate.let(ProviderAttribute::unwrap))
    }

    override fun custom(custom: Map<String, ProviderAttribute>) {
      cdkBuilder.custom(custom.mapValues{ProviderAttribute.unwrap(it.value)})
    }

    override fun email(email: ProviderAttribute) {
      cdkBuilder.email(email.let(ProviderAttribute::unwrap))
    }

    override fun familyName(familyName: ProviderAttribute) {
      cdkBuilder.familyName(familyName.let(ProviderAttribute::unwrap))
    }

    override fun fullname(fullname: ProviderAttribute) {
      cdkBuilder.fullname(fullname.let(ProviderAttribute::unwrap))
    }

    override fun gender(gender: ProviderAttribute) {
      cdkBuilder.gender(gender.let(ProviderAttribute::unwrap))
    }

    override fun givenName(givenName: ProviderAttribute) {
      cdkBuilder.givenName(givenName.let(ProviderAttribute::unwrap))
    }

    override fun lastUpdateTime(lastUpdateTime: ProviderAttribute) {
      cdkBuilder.lastUpdateTime(lastUpdateTime.let(ProviderAttribute::unwrap))
    }

    override fun locale(locale: ProviderAttribute) {
      cdkBuilder.locale(locale.let(ProviderAttribute::unwrap))
    }

    override fun middleName(middleName: ProviderAttribute) {
      cdkBuilder.middleName(middleName.let(ProviderAttribute::unwrap))
    }

    override fun nickname(nickname: ProviderAttribute) {
      cdkBuilder.nickname(nickname.let(ProviderAttribute::unwrap))
    }

    override fun phoneNumber(phoneNumber: ProviderAttribute) {
      cdkBuilder.phoneNumber(phoneNumber.let(ProviderAttribute::unwrap))
    }

    override fun preferredUsername(preferredUsername: ProviderAttribute) {
      cdkBuilder.preferredUsername(preferredUsername.let(ProviderAttribute::unwrap))
    }

    override fun profilePage(profilePage: ProviderAttribute) {
      cdkBuilder.profilePage(profilePage.let(ProviderAttribute::unwrap))
    }

    override fun profilePicture(profilePicture: ProviderAttribute) {
      cdkBuilder.profilePicture(profilePicture.let(ProviderAttribute::unwrap))
    }

    override fun timezone(timezone: ProviderAttribute) {
      cdkBuilder.timezone(timezone.let(ProviderAttribute::unwrap))
    }

    override fun website(website: ProviderAttribute) {
      cdkBuilder.website(website.let(ProviderAttribute::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.AttributeMapping =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.AttributeMapping,
  ) : CdkObject(cdkObject), AttributeMapping {
    override fun address(): ProviderAttribute? =
        unwrap(this).getAddress()?.let(ProviderAttribute::wrap)

    override fun birthdate(): ProviderAttribute? =
        unwrap(this).getBirthdate()?.let(ProviderAttribute::wrap)

    override fun custom(): Map<String, ProviderAttribute> =
        unwrap(this).getCustom()?.mapValues{ProviderAttribute.wrap(it.value)} ?: emptyMap()

    override fun email(): ProviderAttribute? = unwrap(this).getEmail()?.let(ProviderAttribute::wrap)

    override fun familyName(): ProviderAttribute? =
        unwrap(this).getFamilyName()?.let(ProviderAttribute::wrap)

    override fun fullname(): ProviderAttribute? =
        unwrap(this).getFullname()?.let(ProviderAttribute::wrap)

    override fun gender(): ProviderAttribute? =
        unwrap(this).getGender()?.let(ProviderAttribute::wrap)

    override fun givenName(): ProviderAttribute? =
        unwrap(this).getGivenName()?.let(ProviderAttribute::wrap)

    override fun lastUpdateTime(): ProviderAttribute? =
        unwrap(this).getLastUpdateTime()?.let(ProviderAttribute::wrap)

    override fun locale(): ProviderAttribute? =
        unwrap(this).getLocale()?.let(ProviderAttribute::wrap)

    override fun middleName(): ProviderAttribute? =
        unwrap(this).getMiddleName()?.let(ProviderAttribute::wrap)

    override fun nickname(): ProviderAttribute? =
        unwrap(this).getNickname()?.let(ProviderAttribute::wrap)

    override fun phoneNumber(): ProviderAttribute? =
        unwrap(this).getPhoneNumber()?.let(ProviderAttribute::wrap)

    override fun preferredUsername(): ProviderAttribute? =
        unwrap(this).getPreferredUsername()?.let(ProviderAttribute::wrap)

    override fun profilePage(): ProviderAttribute? =
        unwrap(this).getProfilePage()?.let(ProviderAttribute::wrap)

    override fun profilePicture(): ProviderAttribute? =
        unwrap(this).getProfilePicture()?.let(ProviderAttribute::wrap)

    override fun timezone(): ProviderAttribute? =
        unwrap(this).getTimezone()?.let(ProviderAttribute::wrap)

    override fun website(): ProviderAttribute? =
        unwrap(this).getWebsite()?.let(ProviderAttribute::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AttributeMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AttributeMapping):
        AttributeMapping = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AttributeMapping):
        software.amazon.awscdk.services.cognito.AttributeMapping = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.AttributeMapping
  }
}
