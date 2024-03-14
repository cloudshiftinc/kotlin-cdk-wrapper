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
    public fun address(address: Boolean)

    public fun birthdate(birthdate: Boolean)

    public fun email(email: Boolean)

    public fun emailVerified(emailVerified: Boolean)

    public fun familyName(familyName: Boolean)

    public fun fullname(fullname: Boolean)

    public fun gender(gender: Boolean)

    public fun givenName(givenName: Boolean)

    public fun lastUpdateTime(lastUpdateTime: Boolean)

    public fun locale(locale: Boolean)

    public fun middleName(middleName: Boolean)

    public fun nickname(nickname: Boolean)

    public fun phoneNumber(phoneNumber: Boolean)

    public fun phoneNumberVerified(phoneNumberVerified: Boolean)

    public fun preferredUsername(preferredUsername: Boolean)

    public fun profilePage(profilePage: Boolean)

    public fun profilePicture(profilePicture: Boolean)

    public fun timezone(timezone: Boolean)

    public fun website(website: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StandardAttributesMask.Builder =
        software.amazon.awscdk.services.cognito.StandardAttributesMask.builder()

    override fun address(address: Boolean) {
      cdkBuilder.address(address)
    }

    override fun birthdate(birthdate: Boolean) {
      cdkBuilder.birthdate(birthdate)
    }

    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    override fun emailVerified(emailVerified: Boolean) {
      cdkBuilder.emailVerified(emailVerified)
    }

    override fun familyName(familyName: Boolean) {
      cdkBuilder.familyName(familyName)
    }

    override fun fullname(fullname: Boolean) {
      cdkBuilder.fullname(fullname)
    }

    override fun gender(gender: Boolean) {
      cdkBuilder.gender(gender)
    }

    override fun givenName(givenName: Boolean) {
      cdkBuilder.givenName(givenName)
    }

    override fun lastUpdateTime(lastUpdateTime: Boolean) {
      cdkBuilder.lastUpdateTime(lastUpdateTime)
    }

    override fun locale(locale: Boolean) {
      cdkBuilder.locale(locale)
    }

    override fun middleName(middleName: Boolean) {
      cdkBuilder.middleName(middleName)
    }

    override fun nickname(nickname: Boolean) {
      cdkBuilder.nickname(nickname)
    }

    override fun phoneNumber(phoneNumber: Boolean) {
      cdkBuilder.phoneNumber(phoneNumber)
    }

    override fun phoneNumberVerified(phoneNumberVerified: Boolean) {
      cdkBuilder.phoneNumberVerified(phoneNumberVerified)
    }

    override fun preferredUsername(preferredUsername: Boolean) {
      cdkBuilder.preferredUsername(preferredUsername)
    }

    override fun profilePage(profilePage: Boolean) {
      cdkBuilder.profilePage(profilePage)
    }

    override fun profilePicture(profilePicture: Boolean) {
      cdkBuilder.profilePicture(profilePicture)
    }

    override fun timezone(timezone: Boolean) {
      cdkBuilder.timezone(timezone)
    }

    override fun website(website: Boolean) {
      cdkBuilder.website(website)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StandardAttributesMask =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.StandardAttributesMask,
  ) : StandardAttributesMask {
    override fun address(): Boolean? = unwrap(this).getAddress()

    override fun birthdate(): Boolean? = unwrap(this).getBirthdate()

    override fun email(): Boolean? = unwrap(this).getEmail()

    override fun emailVerified(): Boolean? = unwrap(this).getEmailVerified()

    override fun familyName(): Boolean? = unwrap(this).getFamilyName()

    override fun fullname(): Boolean? = unwrap(this).getFullname()

    override fun gender(): Boolean? = unwrap(this).getGender()

    override fun givenName(): Boolean? = unwrap(this).getGivenName()

    override fun lastUpdateTime(): Boolean? = unwrap(this).getLastUpdateTime()

    override fun locale(): Boolean? = unwrap(this).getLocale()

    override fun middleName(): Boolean? = unwrap(this).getMiddleName()

    override fun nickname(): Boolean? = unwrap(this).getNickname()

    override fun phoneNumber(): Boolean? = unwrap(this).getPhoneNumber()

    override fun phoneNumberVerified(): Boolean? = unwrap(this).getPhoneNumberVerified()

    override fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

    override fun profilePage(): Boolean? = unwrap(this).getProfilePage()

    override fun profilePicture(): Boolean? = unwrap(this).getProfilePicture()

    override fun timezone(): Boolean? = unwrap(this).getTimezone()

    override fun website(): Boolean? = unwrap(this).getWebsite()
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
