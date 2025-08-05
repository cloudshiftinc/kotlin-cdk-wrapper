@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

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
 * ClientAttributes()).withStandardAttributes(StandardAttributesMask.builder().fullname(true).email(true).build()).withCustomAttributes("favoritePizza",
 * "favoriteBeverage");
 * ClientAttributes clientReadAttributes =
 * clientWriteAttributes.withStandardAttributes(StandardAttributesMask.builder().emailVerified(true).build()).withCustomAttributes("pointsEarned");
 * pool.addClient("app-client", UserPoolClientOptions.builder()
 * // ...
 * .readAttributes(clientReadAttributes)
 * .writeAttributes(clientWriteAttributes)
 * .build());
 * ```
 */
public interface StandardAttributesMask {
  /**
   * The user's postal address.
   *
   * Default: false
   */
  public fun address(): Boolean? = unwrap(this).getAddress()

  /**
   * The user's birthday, represented as an ISO 8601:2004 format.
   *
   * Default: false
   */
  public fun birthdate(): Boolean? = unwrap(this).getBirthdate()

  /**
   * The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
   *
   * Default: false
   */
  public fun email(): Boolean? = unwrap(this).getEmail()

  /**
   * Whether the email address has been verified.
   *
   * Default: false
   */
  public fun emailVerified(): Boolean? = unwrap(this).getEmailVerified()

  /**
   * The surname or last name of the user.
   *
   * Default: false
   */
  public fun familyName(): Boolean? = unwrap(this).getFamilyName()

  /**
   * The user's full name in displayable form, including all name parts, titles and suffixes.
   *
   * Default: false
   */
  public fun fullname(): Boolean? = unwrap(this).getFullname()

  /**
   * The user's gender.
   *
   * Default: false
   */
  public fun gender(): Boolean? = unwrap(this).getGender()

  /**
   * The user's first name or give name.
   *
   * Default: false
   */
  public fun givenName(): Boolean? = unwrap(this).getGivenName()

  /**
   * The time, the user's information was last updated.
   *
   * Default: false
   */
  public fun lastUpdateTime(): Boolean? = unwrap(this).getLastUpdateTime()

  /**
   * The user's locale, represented as a BCP47 [RFC5646] language tag.
   *
   * Default: false
   */
  public fun locale(): Boolean? = unwrap(this).getLocale()

  /**
   * The user's middle name.
   *
   * Default: false
   */
  public fun middleName(): Boolean? = unwrap(this).getMiddleName()

  /**
   * The user's nickname or casual name.
   *
   * Default: false
   */
  public fun nickname(): Boolean? = unwrap(this).getNickname()

  /**
   * The user's telephone number.
   *
   * Default: false
   */
  public fun phoneNumber(): Boolean? = unwrap(this).getPhoneNumber()

  /**
   * Whether the phone number has been verified.
   *
   * Default: false
   */
  public fun phoneNumberVerified(): Boolean? = unwrap(this).getPhoneNumberVerified()

  /**
   * The user's preferred username, different from the immutable user name.
   *
   * Default: false
   */
  public fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

  /**
   * The URL to the user's profile page.
   *
   * Default: false
   */
  public fun profilePage(): Boolean? = unwrap(this).getProfilePage()

  /**
   * The URL to the user's profile picture.
   *
   * Default: false
   */
  public fun profilePicture(): Boolean? = unwrap(this).getProfilePicture()

  /**
   * The user's time zone.
   *
   * Default: false
   */
  public fun timezone(): Boolean? = unwrap(this).getTimezone()

  /**
   * The URL to the user's web page or blog.
   *
   * Default: false
   */
  public fun website(): Boolean? = unwrap(this).getWebsite()

  /**
   * A builder for [StandardAttributesMask]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param address The user's postal address.
     */
    public fun address(address: Boolean)

    /**
     * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
     */
    public fun birthdate(birthdate: Boolean)

    /**
     * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     */
    public fun email(email: Boolean)

    /**
     * @param emailVerified Whether the email address has been verified.
     */
    public fun emailVerified(emailVerified: Boolean)

    /**
     * @param familyName The surname or last name of the user.
     */
    public fun familyName(familyName: Boolean)

    /**
     * @param fullname The user's full name in displayable form, including all name parts, titles
     * and suffixes.
     */
    public fun fullname(fullname: Boolean)

    /**
     * @param gender The user's gender.
     */
    public fun gender(gender: Boolean)

    /**
     * @param givenName The user's first name or give name.
     */
    public fun givenName(givenName: Boolean)

    /**
     * @param lastUpdateTime The time, the user's information was last updated.
     */
    public fun lastUpdateTime(lastUpdateTime: Boolean)

    /**
     * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
     */
    public fun locale(locale: Boolean)

    /**
     * @param middleName The user's middle name.
     */
    public fun middleName(middleName: Boolean)

    /**
     * @param nickname The user's nickname or casual name.
     */
    public fun nickname(nickname: Boolean)

    /**
     * @param phoneNumber The user's telephone number.
     */
    public fun phoneNumber(phoneNumber: Boolean)

    /**
     * @param phoneNumberVerified Whether the phone number has been verified.
     */
    public fun phoneNumberVerified(phoneNumberVerified: Boolean)

    /**
     * @param preferredUsername The user's preferred username, different from the immutable user
     * name.
     */
    public fun preferredUsername(preferredUsername: Boolean)

    /**
     * @param profilePage The URL to the user's profile page.
     */
    public fun profilePage(profilePage: Boolean)

    /**
     * @param profilePicture The URL to the user's profile picture.
     */
    public fun profilePicture(profilePicture: Boolean)

    /**
     * @param timezone The user's time zone.
     */
    public fun timezone(timezone: Boolean)

    /**
     * @param website The URL to the user's web page or blog.
     */
    public fun website(website: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StandardAttributesMask.Builder =
        software.amazon.awscdk.services.cognito.StandardAttributesMask.builder()

    /**
     * @param address The user's postal address.
     */
    override fun address(address: Boolean) {
      cdkBuilder.address(address)
    }

    /**
     * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
     */
    override fun birthdate(birthdate: Boolean) {
      cdkBuilder.birthdate(birthdate)
    }

    /**
     * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     */
    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    /**
     * @param emailVerified Whether the email address has been verified.
     */
    override fun emailVerified(emailVerified: Boolean) {
      cdkBuilder.emailVerified(emailVerified)
    }

    /**
     * @param familyName The surname or last name of the user.
     */
    override fun familyName(familyName: Boolean) {
      cdkBuilder.familyName(familyName)
    }

    /**
     * @param fullname The user's full name in displayable form, including all name parts, titles
     * and suffixes.
     */
    override fun fullname(fullname: Boolean) {
      cdkBuilder.fullname(fullname)
    }

    /**
     * @param gender The user's gender.
     */
    override fun gender(gender: Boolean) {
      cdkBuilder.gender(gender)
    }

    /**
     * @param givenName The user's first name or give name.
     */
    override fun givenName(givenName: Boolean) {
      cdkBuilder.givenName(givenName)
    }

    /**
     * @param lastUpdateTime The time, the user's information was last updated.
     */
    override fun lastUpdateTime(lastUpdateTime: Boolean) {
      cdkBuilder.lastUpdateTime(lastUpdateTime)
    }

    /**
     * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
     */
    override fun locale(locale: Boolean) {
      cdkBuilder.locale(locale)
    }

    /**
     * @param middleName The user's middle name.
     */
    override fun middleName(middleName: Boolean) {
      cdkBuilder.middleName(middleName)
    }

    /**
     * @param nickname The user's nickname or casual name.
     */
    override fun nickname(nickname: Boolean) {
      cdkBuilder.nickname(nickname)
    }

    /**
     * @param phoneNumber The user's telephone number.
     */
    override fun phoneNumber(phoneNumber: Boolean) {
      cdkBuilder.phoneNumber(phoneNumber)
    }

    /**
     * @param phoneNumberVerified Whether the phone number has been verified.
     */
    override fun phoneNumberVerified(phoneNumberVerified: Boolean) {
      cdkBuilder.phoneNumberVerified(phoneNumberVerified)
    }

    /**
     * @param preferredUsername The user's preferred username, different from the immutable user
     * name.
     */
    override fun preferredUsername(preferredUsername: Boolean) {
      cdkBuilder.preferredUsername(preferredUsername)
    }

    /**
     * @param profilePage The URL to the user's profile page.
     */
    override fun profilePage(profilePage: Boolean) {
      cdkBuilder.profilePage(profilePage)
    }

    /**
     * @param profilePicture The URL to the user's profile picture.
     */
    override fun profilePicture(profilePicture: Boolean) {
      cdkBuilder.profilePicture(profilePicture)
    }

    /**
     * @param timezone The user's time zone.
     */
    override fun timezone(timezone: Boolean) {
      cdkBuilder.timezone(timezone)
    }

    /**
     * @param website The URL to the user's web page or blog.
     */
    override fun website(website: Boolean) {
      cdkBuilder.website(website)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StandardAttributesMask =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.StandardAttributesMask,
  ) : CdkObject(cdkObject),
      StandardAttributesMask {
    /**
     * The user's postal address.
     *
     * Default: false
     */
    override fun address(): Boolean? = unwrap(this).getAddress()

    /**
     * The user's birthday, represented as an ISO 8601:2004 format.
     *
     * Default: false
     */
    override fun birthdate(): Boolean? = unwrap(this).getBirthdate()

    /**
     * The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     *
     * Default: false
     */
    override fun email(): Boolean? = unwrap(this).getEmail()

    /**
     * Whether the email address has been verified.
     *
     * Default: false
     */
    override fun emailVerified(): Boolean? = unwrap(this).getEmailVerified()

    /**
     * The surname or last name of the user.
     *
     * Default: false
     */
    override fun familyName(): Boolean? = unwrap(this).getFamilyName()

    /**
     * The user's full name in displayable form, including all name parts, titles and suffixes.
     *
     * Default: false
     */
    override fun fullname(): Boolean? = unwrap(this).getFullname()

    /**
     * The user's gender.
     *
     * Default: false
     */
    override fun gender(): Boolean? = unwrap(this).getGender()

    /**
     * The user's first name or give name.
     *
     * Default: false
     */
    override fun givenName(): Boolean? = unwrap(this).getGivenName()

    /**
     * The time, the user's information was last updated.
     *
     * Default: false
     */
    override fun lastUpdateTime(): Boolean? = unwrap(this).getLastUpdateTime()

    /**
     * The user's locale, represented as a BCP47 [RFC5646] language tag.
     *
     * Default: false
     */
    override fun locale(): Boolean? = unwrap(this).getLocale()

    /**
     * The user's middle name.
     *
     * Default: false
     */
    override fun middleName(): Boolean? = unwrap(this).getMiddleName()

    /**
     * The user's nickname or casual name.
     *
     * Default: false
     */
    override fun nickname(): Boolean? = unwrap(this).getNickname()

    /**
     * The user's telephone number.
     *
     * Default: false
     */
    override fun phoneNumber(): Boolean? = unwrap(this).getPhoneNumber()

    /**
     * Whether the phone number has been verified.
     *
     * Default: false
     */
    override fun phoneNumberVerified(): Boolean? = unwrap(this).getPhoneNumberVerified()

    /**
     * The user's preferred username, different from the immutable user name.
     *
     * Default: false
     */
    override fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

    /**
     * The URL to the user's profile page.
     *
     * Default: false
     */
    override fun profilePage(): Boolean? = unwrap(this).getProfilePage()

    /**
     * The URL to the user's profile picture.
     *
     * Default: false
     */
    override fun profilePicture(): Boolean? = unwrap(this).getProfilePicture()

    /**
     * The user's time zone.
     *
     * Default: false
     */
    override fun timezone(): Boolean? = unwrap(this).getTimezone()

    /**
     * The URL to the user's web page or blog.
     *
     * Default: false
     */
    override fun website(): Boolean? = unwrap(this).getWebsite()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StandardAttributesMask {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StandardAttributesMask):
        StandardAttributesMask = CdkObjectWrappers.wrap(cdkObject) as? StandardAttributesMask ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StandardAttributesMask):
        software.amazon.awscdk.services.cognito.StandardAttributesMask = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.StandardAttributesMask
  }
}
