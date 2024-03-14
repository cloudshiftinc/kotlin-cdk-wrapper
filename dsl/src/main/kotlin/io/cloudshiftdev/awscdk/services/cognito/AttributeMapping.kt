package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AttributeMapping {
  public fun address(): ProviderAttribute? = unwrap(this).getAddress()?.let(ProviderAttribute::wrap)

  public fun birthdate(): ProviderAttribute? =
      unwrap(this).getBirthdate()?.let(ProviderAttribute::wrap)

  public fun custom(): Map<String, ProviderAttribute> = unwrap(this).getCustom()?.mapValues {
      ProviderAttribute.wrap(it.value)} ?: emptyMap()

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

  public interface Builder {
    public fun address(address: ProviderAttribute) {
    }

    public fun birthdate(birthdate: ProviderAttribute) {
    }

    public fun custom(custom: Map<String, ProviderAttribute>) {
    }

    public fun email(email: ProviderAttribute) {
    }

    public fun familyName(familyName: ProviderAttribute) {
    }

    public fun fullname(fullname: ProviderAttribute) {
    }

    public fun gender(gender: ProviderAttribute) {
    }

    public fun givenName(givenName: ProviderAttribute) {
    }

    public fun lastUpdateTime(lastUpdateTime: ProviderAttribute) {
    }

    public fun locale(locale: ProviderAttribute) {
    }

    public fun middleName(middleName: ProviderAttribute) {
    }

    public fun nickname(nickname: ProviderAttribute) {
    }

    public fun phoneNumber(phoneNumber: ProviderAttribute) {
    }

    public fun preferredUsername(preferredUsername: ProviderAttribute) {
    }

    public fun profilePage(profilePage: ProviderAttribute) {
    }

    public fun profilePicture(profilePicture: ProviderAttribute) {
    }

    public fun timezone(timezone: ProviderAttribute) {
    }

    public fun website(website: ProviderAttribute) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AttributeMapping.Builder =
        software.amazon.awscdk.services.cognito.AttributeMapping.builder()

    public override fun address(address: ProviderAttribute) {
      cdkBuilder.address(address.let(ProviderAttribute::unwrap))
    }

    public override fun birthdate(birthdate: ProviderAttribute) {
      cdkBuilder.birthdate(birthdate.let(ProviderAttribute::unwrap))
    }

    public override fun custom(custom: Map<String, ProviderAttribute>) {
      cdkBuilder.custom(custom.mapValues { ProviderAttribute.unwrap(it.value)})
    }

    public override fun email(email: ProviderAttribute) {
      cdkBuilder.email(email.let(ProviderAttribute::unwrap))
    }

    public override fun familyName(familyName: ProviderAttribute) {
      cdkBuilder.familyName(familyName.let(ProviderAttribute::unwrap))
    }

    public override fun fullname(fullname: ProviderAttribute) {
      cdkBuilder.fullname(fullname.let(ProviderAttribute::unwrap))
    }

    public override fun gender(gender: ProviderAttribute) {
      cdkBuilder.gender(gender.let(ProviderAttribute::unwrap))
    }

    public override fun givenName(givenName: ProviderAttribute) {
      cdkBuilder.givenName(givenName.let(ProviderAttribute::unwrap))
    }

    public override fun lastUpdateTime(lastUpdateTime: ProviderAttribute) {
      cdkBuilder.lastUpdateTime(lastUpdateTime.let(ProviderAttribute::unwrap))
    }

    public override fun locale(locale: ProviderAttribute) {
      cdkBuilder.locale(locale.let(ProviderAttribute::unwrap))
    }

    public override fun middleName(middleName: ProviderAttribute) {
      cdkBuilder.middleName(middleName.let(ProviderAttribute::unwrap))
    }

    public override fun nickname(nickname: ProviderAttribute) {
      cdkBuilder.nickname(nickname.let(ProviderAttribute::unwrap))
    }

    public override fun phoneNumber(phoneNumber: ProviderAttribute) {
      cdkBuilder.phoneNumber(phoneNumber.let(ProviderAttribute::unwrap))
    }

    public override fun preferredUsername(preferredUsername: ProviderAttribute) {
      cdkBuilder.preferredUsername(preferredUsername.let(ProviderAttribute::unwrap))
    }

    public override fun profilePage(profilePage: ProviderAttribute) {
      cdkBuilder.profilePage(profilePage.let(ProviderAttribute::unwrap))
    }

    public override fun profilePicture(profilePicture: ProviderAttribute) {
      cdkBuilder.profilePicture(profilePicture.let(ProviderAttribute::unwrap))
    }

    public override fun timezone(timezone: ProviderAttribute) {
      cdkBuilder.timezone(timezone.let(ProviderAttribute::unwrap))
    }

    public override fun website(website: ProviderAttribute) {
      cdkBuilder.website(website.let(ProviderAttribute::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.AttributeMapping =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.AttributeMapping,
  ) : AttributeMapping {
    public override fun address(): ProviderAttribute? =
        unwrap(this).getAddress()?.let(ProviderAttribute::wrap)

    public override fun birthdate(): ProviderAttribute? =
        unwrap(this).getBirthdate()?.let(ProviderAttribute::wrap)

    public override fun custom(): Map<String, ProviderAttribute> =
        unwrap(this).getCustom()?.mapValues { ProviderAttribute.wrap(it.value)} ?: emptyMap()

    public override fun email(): ProviderAttribute? =
        unwrap(this).getEmail()?.let(ProviderAttribute::wrap)

    public override fun familyName(): ProviderAttribute? =
        unwrap(this).getFamilyName()?.let(ProviderAttribute::wrap)

    public override fun fullname(): ProviderAttribute? =
        unwrap(this).getFullname()?.let(ProviderAttribute::wrap)

    public override fun gender(): ProviderAttribute? =
        unwrap(this).getGender()?.let(ProviderAttribute::wrap)

    public override fun givenName(): ProviderAttribute? =
        unwrap(this).getGivenName()?.let(ProviderAttribute::wrap)

    public override fun lastUpdateTime(): ProviderAttribute? =
        unwrap(this).getLastUpdateTime()?.let(ProviderAttribute::wrap)

    public override fun locale(): ProviderAttribute? =
        unwrap(this).getLocale()?.let(ProviderAttribute::wrap)

    public override fun middleName(): ProviderAttribute? =
        unwrap(this).getMiddleName()?.let(ProviderAttribute::wrap)

    public override fun nickname(): ProviderAttribute? =
        unwrap(this).getNickname()?.let(ProviderAttribute::wrap)

    public override fun phoneNumber(): ProviderAttribute? =
        unwrap(this).getPhoneNumber()?.let(ProviderAttribute::wrap)

    public override fun preferredUsername(): ProviderAttribute? =
        unwrap(this).getPreferredUsername()?.let(ProviderAttribute::wrap)

    public override fun profilePage(): ProviderAttribute? =
        unwrap(this).getProfilePage()?.let(ProviderAttribute::wrap)

    public override fun profilePicture(): ProviderAttribute? =
        unwrap(this).getProfilePicture()?.let(ProviderAttribute::wrap)

    public override fun timezone(): ProviderAttribute? =
        unwrap(this).getTimezone()?.let(ProviderAttribute::wrap)

    public override fun website(): ProviderAttribute? =
        unwrap(this).getWebsite()?.let(ProviderAttribute::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AttributeMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AttributeMapping):
        AttributeMapping = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AttributeMapping):
        software.amazon.awscdk.services.cognito.AttributeMapping = (wrapped as Wrapper).cdkObject
  }
}
