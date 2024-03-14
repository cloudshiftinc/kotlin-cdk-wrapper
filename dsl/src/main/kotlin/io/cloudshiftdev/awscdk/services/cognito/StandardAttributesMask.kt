package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.Unit

public interface StandardAttributesMask {
  public fun address(): Boolean? = unwrap(this).getAddress()

  public fun birthdate(): Boolean? = unwrap(this).getBirthdate()

  public fun email(): Boolean? = unwrap(this).getEmail()

  public fun emailVerified(): Boolean? = unwrap(this).getEmailVerified()

  public fun familyName(): Boolean? = unwrap(this).getFamilyName()

  public fun fullname(): Boolean? = unwrap(this).getFullname()

  public fun gender(): Boolean? = unwrap(this).getGender()

  public fun givenName(): Boolean? = unwrap(this).getGivenName()

  public fun lastUpdateTime(): Boolean? = unwrap(this).getLastUpdateTime()

  public fun locale(): Boolean? = unwrap(this).getLocale()

  public fun middleName(): Boolean? = unwrap(this).getMiddleName()

  public fun nickname(): Boolean? = unwrap(this).getNickname()

  public fun phoneNumber(): Boolean? = unwrap(this).getPhoneNumber()

  public fun phoneNumberVerified(): Boolean? = unwrap(this).getPhoneNumberVerified()

  public fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

  public fun profilePage(): Boolean? = unwrap(this).getProfilePage()

  public fun profilePicture(): Boolean? = unwrap(this).getProfilePicture()

  public fun timezone(): Boolean? = unwrap(this).getTimezone()

  public fun website(): Boolean? = unwrap(this).getWebsite()

  public interface Builder {
    public fun address(address: Boolean) {
    }

    public fun birthdate(birthdate: Boolean) {
    }

    public fun email(email: Boolean) {
    }

    public fun emailVerified(emailVerified: Boolean) {
    }

    public fun familyName(familyName: Boolean) {
    }

    public fun fullname(fullname: Boolean) {
    }

    public fun gender(gender: Boolean) {
    }

    public fun givenName(givenName: Boolean) {
    }

    public fun lastUpdateTime(lastUpdateTime: Boolean) {
    }

    public fun locale(locale: Boolean) {
    }

    public fun middleName(middleName: Boolean) {
    }

    public fun nickname(nickname: Boolean) {
    }

    public fun phoneNumber(phoneNumber: Boolean) {
    }

    public fun phoneNumberVerified(phoneNumberVerified: Boolean) {
    }

    public fun preferredUsername(preferredUsername: Boolean) {
    }

    public fun profilePage(profilePage: Boolean) {
    }

    public fun profilePicture(profilePicture: Boolean) {
    }

    public fun timezone(timezone: Boolean) {
    }

    public fun website(website: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StandardAttributesMask.Builder =
        software.amazon.awscdk.services.cognito.StandardAttributesMask.builder()

    public override fun address(address: Boolean) {
      cdkBuilder.address(address)
    }

    public override fun birthdate(birthdate: Boolean) {
      cdkBuilder.birthdate(birthdate)
    }

    public override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    public override fun emailVerified(emailVerified: Boolean) {
      cdkBuilder.emailVerified(emailVerified)
    }

    public override fun familyName(familyName: Boolean) {
      cdkBuilder.familyName(familyName)
    }

    public override fun fullname(fullname: Boolean) {
      cdkBuilder.fullname(fullname)
    }

    public override fun gender(gender: Boolean) {
      cdkBuilder.gender(gender)
    }

    public override fun givenName(givenName: Boolean) {
      cdkBuilder.givenName(givenName)
    }

    public override fun lastUpdateTime(lastUpdateTime: Boolean) {
      cdkBuilder.lastUpdateTime(lastUpdateTime)
    }

    public override fun locale(locale: Boolean) {
      cdkBuilder.locale(locale)
    }

    public override fun middleName(middleName: Boolean) {
      cdkBuilder.middleName(middleName)
    }

    public override fun nickname(nickname: Boolean) {
      cdkBuilder.nickname(nickname)
    }

    public override fun phoneNumber(phoneNumber: Boolean) {
      cdkBuilder.phoneNumber(phoneNumber)
    }

    public override fun phoneNumberVerified(phoneNumberVerified: Boolean) {
      cdkBuilder.phoneNumberVerified(phoneNumberVerified)
    }

    public override fun preferredUsername(preferredUsername: Boolean) {
      cdkBuilder.preferredUsername(preferredUsername)
    }

    public override fun profilePage(profilePage: Boolean) {
      cdkBuilder.profilePage(profilePage)
    }

    public override fun profilePicture(profilePicture: Boolean) {
      cdkBuilder.profilePicture(profilePicture)
    }

    public override fun timezone(timezone: Boolean) {
      cdkBuilder.timezone(timezone)
    }

    public override fun website(website: Boolean) {
      cdkBuilder.website(website)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StandardAttributesMask =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.StandardAttributesMask,
  ) : StandardAttributesMask {
    public override fun address(): Boolean? = unwrap(this).getAddress()

    public override fun birthdate(): Boolean? = unwrap(this).getBirthdate()

    public override fun email(): Boolean? = unwrap(this).getEmail()

    public override fun emailVerified(): Boolean? = unwrap(this).getEmailVerified()

    public override fun familyName(): Boolean? = unwrap(this).getFamilyName()

    public override fun fullname(): Boolean? = unwrap(this).getFullname()

    public override fun gender(): Boolean? = unwrap(this).getGender()

    public override fun givenName(): Boolean? = unwrap(this).getGivenName()

    public override fun lastUpdateTime(): Boolean? = unwrap(this).getLastUpdateTime()

    public override fun locale(): Boolean? = unwrap(this).getLocale()

    public override fun middleName(): Boolean? = unwrap(this).getMiddleName()

    public override fun nickname(): Boolean? = unwrap(this).getNickname()

    public override fun phoneNumber(): Boolean? = unwrap(this).getPhoneNumber()

    public override fun phoneNumberVerified(): Boolean? = unwrap(this).getPhoneNumberVerified()

    public override fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

    public override fun profilePage(): Boolean? = unwrap(this).getProfilePage()

    public override fun profilePicture(): Boolean? = unwrap(this).getProfilePicture()

    public override fun timezone(): Boolean? = unwrap(this).getTimezone()

    public override fun website(): Boolean? = unwrap(this).getWebsite()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StandardAttributesMask {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StandardAttributesMask):
        StandardAttributesMask = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StandardAttributesMask):
        software.amazon.awscdk.services.cognito.StandardAttributesMask = (wrapped as
        Wrapper).cdkObject
  }
}
