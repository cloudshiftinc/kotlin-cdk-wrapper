@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

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
public interface StandardAttributes {
  /**
   * The user's postal address.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun address(): StandardAttribute? = unwrap(this).getAddress()?.let(StandardAttribute::wrap)

  /**
   * The user's birthday, represented as an ISO 8601:2004 format.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun birthdate(): StandardAttribute? =
      unwrap(this).getBirthdate()?.let(StandardAttribute::wrap)

  /**
   * The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun email(): StandardAttribute? = unwrap(this).getEmail()?.let(StandardAttribute::wrap)

  /**
   * The surname or last name of the user.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun familyName(): StandardAttribute? =
      unwrap(this).getFamilyName()?.let(StandardAttribute::wrap)

  /**
   * The user's full name in displayable form, including all name parts, titles and suffixes.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun fullname(): StandardAttribute? =
      unwrap(this).getFullname()?.let(StandardAttribute::wrap)

  /**
   * The user's gender.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun gender(): StandardAttribute? = unwrap(this).getGender()?.let(StandardAttribute::wrap)

  /**
   * The user's first name or give name.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun givenName(): StandardAttribute? =
      unwrap(this).getGivenName()?.let(StandardAttribute::wrap)

  /**
   * The time, the user's information was last updated.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun lastUpdateTime(): StandardAttribute? =
      unwrap(this).getLastUpdateTime()?.let(StandardAttribute::wrap)

  /**
   * The user's locale, represented as a BCP47 [RFC5646] language tag.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun locale(): StandardAttribute? = unwrap(this).getLocale()?.let(StandardAttribute::wrap)

  /**
   * The user's middle name.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun middleName(): StandardAttribute? =
      unwrap(this).getMiddleName()?.let(StandardAttribute::wrap)

  /**
   * The user's nickname or casual name.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun nickname(): StandardAttribute? =
      unwrap(this).getNickname()?.let(StandardAttribute::wrap)

  /**
   * The user's telephone number.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun phoneNumber(): StandardAttribute? =
      unwrap(this).getPhoneNumber()?.let(StandardAttribute::wrap)

  /**
   * The user's preffered username, different from the immutable user name.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun preferredUsername(): StandardAttribute? =
      unwrap(this).getPreferredUsername()?.let(StandardAttribute::wrap)

  /**
   * The URL to the user's profile page.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun profilePage(): StandardAttribute? =
      unwrap(this).getProfilePage()?.let(StandardAttribute::wrap)

  /**
   * The URL to the user's profile picture.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun profilePicture(): StandardAttribute? =
      unwrap(this).getProfilePicture()?.let(StandardAttribute::wrap)

  /**
   * The user's time zone.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun timezone(): StandardAttribute? =
      unwrap(this).getTimezone()?.let(StandardAttribute::wrap)

  /**
   * The URL to the user's web page or blog.
   *
   * Default: - see the defaults under `StandardAttribute`
   */
  public fun website(): StandardAttribute? = unwrap(this).getWebsite()?.let(StandardAttribute::wrap)

  /**
   * A builder for [StandardAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param address The user's postal address.
     */
    public fun address(address: StandardAttribute)

    /**
     * @param address The user's postal address.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e04863ebc081f57efe17b0846bed186edea9c6d8c9735cd8cddde22c0a181a8")
    public fun address(address: StandardAttribute.Builder.() -> Unit)

    /**
     * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
     */
    public fun birthdate(birthdate: StandardAttribute)

    /**
     * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1a776cbd8d4a823b9065f74353e7b442130186b9814904736b6178835a628f8")
    public fun birthdate(birthdate: StandardAttribute.Builder.() -> Unit)

    /**
     * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     */
    public fun email(email: StandardAttribute)

    /**
     * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c62ba4f3b957f543bca37c19bd953168f8bf999b13494785f9820cf4598839a")
    public fun email(email: StandardAttribute.Builder.() -> Unit)

    /**
     * @param familyName The surname or last name of the user.
     */
    public fun familyName(familyName: StandardAttribute)

    /**
     * @param familyName The surname or last name of the user.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc9ebb7e457f71a301f402ed7e077834653d6d74a4077633a6233adc8683e5f")
    public fun familyName(familyName: StandardAttribute.Builder.() -> Unit)

    /**
     * @param fullname The user's full name in displayable form, including all name parts, titles
     * and suffixes.
     */
    public fun fullname(fullname: StandardAttribute)

    /**
     * @param fullname The user's full name in displayable form, including all name parts, titles
     * and suffixes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1156dbf6f8ca71d57d86fc659d17eef238f2917e35ea865818ab41cd021d550d")
    public fun fullname(fullname: StandardAttribute.Builder.() -> Unit)

    /**
     * @param gender The user's gender.
     */
    public fun gender(gender: StandardAttribute)

    /**
     * @param gender The user's gender.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bc45bfdab47e0930e9d19829f983c5c0b55ee3a495c14bd347f5e6617b40db")
    public fun gender(gender: StandardAttribute.Builder.() -> Unit)

    /**
     * @param givenName The user's first name or give name.
     */
    public fun givenName(givenName: StandardAttribute)

    /**
     * @param givenName The user's first name or give name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d6791fec10b708d51a68e91084e7ad2624dd85034912d30c4c24854e1255ac5")
    public fun givenName(givenName: StandardAttribute.Builder.() -> Unit)

    /**
     * @param lastUpdateTime The time, the user's information was last updated.
     */
    public fun lastUpdateTime(lastUpdateTime: StandardAttribute)

    /**
     * @param lastUpdateTime The time, the user's information was last updated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea77d1ba8ed5ec407c81ef5c38b52913cf4a07cd303a82eb293ec34b5967a949")
    public fun lastUpdateTime(lastUpdateTime: StandardAttribute.Builder.() -> Unit)

    /**
     * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
     */
    public fun locale(locale: StandardAttribute)

    /**
     * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cabb7f0b2cf9dcba19df9976a7bf60b06e483e71cc0b5985b4ce75a6ae664d6a")
    public fun locale(locale: StandardAttribute.Builder.() -> Unit)

    /**
     * @param middleName The user's middle name.
     */
    public fun middleName(middleName: StandardAttribute)

    /**
     * @param middleName The user's middle name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c9a86fd429c168933ca009d4821dece105b543ece1c8220731f9f9bd4d3af6")
    public fun middleName(middleName: StandardAttribute.Builder.() -> Unit)

    /**
     * @param nickname The user's nickname or casual name.
     */
    public fun nickname(nickname: StandardAttribute)

    /**
     * @param nickname The user's nickname or casual name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed794d8269a1e8aeb73bf56a9c8c365687a181c996806aa1daab8a393de3f84b")
    public fun nickname(nickname: StandardAttribute.Builder.() -> Unit)

    /**
     * @param phoneNumber The user's telephone number.
     */
    public fun phoneNumber(phoneNumber: StandardAttribute)

    /**
     * @param phoneNumber The user's telephone number.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc070dfa1dca812d39ac604a8070f54224951a96b4a321d8220befe13d4da5d")
    public fun phoneNumber(phoneNumber: StandardAttribute.Builder.() -> Unit)

    /**
     * @param preferredUsername The user's preffered username, different from the immutable user
     * name.
     */
    public fun preferredUsername(preferredUsername: StandardAttribute)

    /**
     * @param preferredUsername The user's preffered username, different from the immutable user
     * name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdc2b200152adb09a39b9373a422c21016355d229b2386987fbe4d62df435d21")
    public fun preferredUsername(preferredUsername: StandardAttribute.Builder.() -> Unit)

    /**
     * @param profilePage The URL to the user's profile page.
     */
    public fun profilePage(profilePage: StandardAttribute)

    /**
     * @param profilePage The URL to the user's profile page.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("710aa51ac1dcd07bc9ed43908d08cd9b3d01c1e92e3a645c1373cc7a7317850a")
    public fun profilePage(profilePage: StandardAttribute.Builder.() -> Unit)

    /**
     * @param profilePicture The URL to the user's profile picture.
     */
    public fun profilePicture(profilePicture: StandardAttribute)

    /**
     * @param profilePicture The URL to the user's profile picture.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0dff460635705a89b71defa15770cc304b5a2c01bd1eec13939fe951f132a24")
    public fun profilePicture(profilePicture: StandardAttribute.Builder.() -> Unit)

    /**
     * @param timezone The user's time zone.
     */
    public fun timezone(timezone: StandardAttribute)

    /**
     * @param timezone The user's time zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e35eec5baefac887beb5b7f804a432162f2f185b12df54c38ffff44e343f090e")
    public fun timezone(timezone: StandardAttribute.Builder.() -> Unit)

    /**
     * @param website The URL to the user's web page or blog.
     */
    public fun website(website: StandardAttribute)

    /**
     * @param website The URL to the user's web page or blog.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09768ac325f5e6faa34d94a66c1e506bc228fe24f7f7b29bac6f5d14caf7181d")
    public fun website(website: StandardAttribute.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StandardAttributes.Builder =
        software.amazon.awscdk.services.cognito.StandardAttributes.builder()

    /**
     * @param address The user's postal address.
     */
    override fun address(address: StandardAttribute) {
      cdkBuilder.address(address.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param address The user's postal address.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e04863ebc081f57efe17b0846bed186edea9c6d8c9735cd8cddde22c0a181a8")
    override fun address(address: StandardAttribute.Builder.() -> Unit): Unit =
        address(StandardAttribute(address))

    /**
     * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
     */
    override fun birthdate(birthdate: StandardAttribute) {
      cdkBuilder.birthdate(birthdate.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param birthdate The user's birthday, represented as an ISO 8601:2004 format.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1a776cbd8d4a823b9065f74353e7b442130186b9814904736b6178835a628f8")
    override fun birthdate(birthdate: StandardAttribute.Builder.() -> Unit): Unit =
        birthdate(StandardAttribute(birthdate))

    /**
     * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     */
    override fun email(email: StandardAttribute) {
      cdkBuilder.email(email.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param email The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c62ba4f3b957f543bca37c19bd953168f8bf999b13494785f9820cf4598839a")
    override fun email(email: StandardAttribute.Builder.() -> Unit): Unit =
        email(StandardAttribute(email))

    /**
     * @param familyName The surname or last name of the user.
     */
    override fun familyName(familyName: StandardAttribute) {
      cdkBuilder.familyName(familyName.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param familyName The surname or last name of the user.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc9ebb7e457f71a301f402ed7e077834653d6d74a4077633a6233adc8683e5f")
    override fun familyName(familyName: StandardAttribute.Builder.() -> Unit): Unit =
        familyName(StandardAttribute(familyName))

    /**
     * @param fullname The user's full name in displayable form, including all name parts, titles
     * and suffixes.
     */
    override fun fullname(fullname: StandardAttribute) {
      cdkBuilder.fullname(fullname.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param fullname The user's full name in displayable form, including all name parts, titles
     * and suffixes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1156dbf6f8ca71d57d86fc659d17eef238f2917e35ea865818ab41cd021d550d")
    override fun fullname(fullname: StandardAttribute.Builder.() -> Unit): Unit =
        fullname(StandardAttribute(fullname))

    /**
     * @param gender The user's gender.
     */
    override fun gender(gender: StandardAttribute) {
      cdkBuilder.gender(gender.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param gender The user's gender.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bc45bfdab47e0930e9d19829f983c5c0b55ee3a495c14bd347f5e6617b40db")
    override fun gender(gender: StandardAttribute.Builder.() -> Unit): Unit =
        gender(StandardAttribute(gender))

    /**
     * @param givenName The user's first name or give name.
     */
    override fun givenName(givenName: StandardAttribute) {
      cdkBuilder.givenName(givenName.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param givenName The user's first name or give name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d6791fec10b708d51a68e91084e7ad2624dd85034912d30c4c24854e1255ac5")
    override fun givenName(givenName: StandardAttribute.Builder.() -> Unit): Unit =
        givenName(StandardAttribute(givenName))

    /**
     * @param lastUpdateTime The time, the user's information was last updated.
     */
    override fun lastUpdateTime(lastUpdateTime: StandardAttribute) {
      cdkBuilder.lastUpdateTime(lastUpdateTime.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param lastUpdateTime The time, the user's information was last updated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea77d1ba8ed5ec407c81ef5c38b52913cf4a07cd303a82eb293ec34b5967a949")
    override fun lastUpdateTime(lastUpdateTime: StandardAttribute.Builder.() -> Unit): Unit =
        lastUpdateTime(StandardAttribute(lastUpdateTime))

    /**
     * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
     */
    override fun locale(locale: StandardAttribute) {
      cdkBuilder.locale(locale.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param locale The user's locale, represented as a BCP47 [RFC5646] language tag.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cabb7f0b2cf9dcba19df9976a7bf60b06e483e71cc0b5985b4ce75a6ae664d6a")
    override fun locale(locale: StandardAttribute.Builder.() -> Unit): Unit =
        locale(StandardAttribute(locale))

    /**
     * @param middleName The user's middle name.
     */
    override fun middleName(middleName: StandardAttribute) {
      cdkBuilder.middleName(middleName.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param middleName The user's middle name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c9a86fd429c168933ca009d4821dece105b543ece1c8220731f9f9bd4d3af6")
    override fun middleName(middleName: StandardAttribute.Builder.() -> Unit): Unit =
        middleName(StandardAttribute(middleName))

    /**
     * @param nickname The user's nickname or casual name.
     */
    override fun nickname(nickname: StandardAttribute) {
      cdkBuilder.nickname(nickname.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param nickname The user's nickname or casual name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed794d8269a1e8aeb73bf56a9c8c365687a181c996806aa1daab8a393de3f84b")
    override fun nickname(nickname: StandardAttribute.Builder.() -> Unit): Unit =
        nickname(StandardAttribute(nickname))

    /**
     * @param phoneNumber The user's telephone number.
     */
    override fun phoneNumber(phoneNumber: StandardAttribute) {
      cdkBuilder.phoneNumber(phoneNumber.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param phoneNumber The user's telephone number.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc070dfa1dca812d39ac604a8070f54224951a96b4a321d8220befe13d4da5d")
    override fun phoneNumber(phoneNumber: StandardAttribute.Builder.() -> Unit): Unit =
        phoneNumber(StandardAttribute(phoneNumber))

    /**
     * @param preferredUsername The user's preffered username, different from the immutable user
     * name.
     */
    override fun preferredUsername(preferredUsername: StandardAttribute) {
      cdkBuilder.preferredUsername(preferredUsername.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param preferredUsername The user's preffered username, different from the immutable user
     * name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdc2b200152adb09a39b9373a422c21016355d229b2386987fbe4d62df435d21")
    override fun preferredUsername(preferredUsername: StandardAttribute.Builder.() -> Unit): Unit =
        preferredUsername(StandardAttribute(preferredUsername))

    /**
     * @param profilePage The URL to the user's profile page.
     */
    override fun profilePage(profilePage: StandardAttribute) {
      cdkBuilder.profilePage(profilePage.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param profilePage The URL to the user's profile page.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("710aa51ac1dcd07bc9ed43908d08cd9b3d01c1e92e3a645c1373cc7a7317850a")
    override fun profilePage(profilePage: StandardAttribute.Builder.() -> Unit): Unit =
        profilePage(StandardAttribute(profilePage))

    /**
     * @param profilePicture The URL to the user's profile picture.
     */
    override fun profilePicture(profilePicture: StandardAttribute) {
      cdkBuilder.profilePicture(profilePicture.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param profilePicture The URL to the user's profile picture.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0dff460635705a89b71defa15770cc304b5a2c01bd1eec13939fe951f132a24")
    override fun profilePicture(profilePicture: StandardAttribute.Builder.() -> Unit): Unit =
        profilePicture(StandardAttribute(profilePicture))

    /**
     * @param timezone The user's time zone.
     */
    override fun timezone(timezone: StandardAttribute) {
      cdkBuilder.timezone(timezone.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param timezone The user's time zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e35eec5baefac887beb5b7f804a432162f2f185b12df54c38ffff44e343f090e")
    override fun timezone(timezone: StandardAttribute.Builder.() -> Unit): Unit =
        timezone(StandardAttribute(timezone))

    /**
     * @param website The URL to the user's web page or blog.
     */
    override fun website(website: StandardAttribute) {
      cdkBuilder.website(website.let(StandardAttribute.Companion::unwrap))
    }

    /**
     * @param website The URL to the user's web page or blog.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09768ac325f5e6faa34d94a66c1e506bc228fe24f7f7b29bac6f5d14caf7181d")
    override fun website(website: StandardAttribute.Builder.() -> Unit): Unit =
        website(StandardAttribute(website))

    public fun build(): software.amazon.awscdk.services.cognito.StandardAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.StandardAttributes,
  ) : CdkObject(cdkObject),
      StandardAttributes {
    /**
     * The user's postal address.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun address(): StandardAttribute? =
        unwrap(this).getAddress()?.let(StandardAttribute::wrap)

    /**
     * The user's birthday, represented as an ISO 8601:2004 format.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun birthdate(): StandardAttribute? =
        unwrap(this).getBirthdate()?.let(StandardAttribute::wrap)

    /**
     * The user's e-mail address, represented as an RFC 5322 [RFC5322] addr-spec.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun email(): StandardAttribute? = unwrap(this).getEmail()?.let(StandardAttribute::wrap)

    /**
     * The surname or last name of the user.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun familyName(): StandardAttribute? =
        unwrap(this).getFamilyName()?.let(StandardAttribute::wrap)

    /**
     * The user's full name in displayable form, including all name parts, titles and suffixes.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun fullname(): StandardAttribute? =
        unwrap(this).getFullname()?.let(StandardAttribute::wrap)

    /**
     * The user's gender.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun gender(): StandardAttribute? =
        unwrap(this).getGender()?.let(StandardAttribute::wrap)

    /**
     * The user's first name or give name.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun givenName(): StandardAttribute? =
        unwrap(this).getGivenName()?.let(StandardAttribute::wrap)

    /**
     * The time, the user's information was last updated.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun lastUpdateTime(): StandardAttribute? =
        unwrap(this).getLastUpdateTime()?.let(StandardAttribute::wrap)

    /**
     * The user's locale, represented as a BCP47 [RFC5646] language tag.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun locale(): StandardAttribute? =
        unwrap(this).getLocale()?.let(StandardAttribute::wrap)

    /**
     * The user's middle name.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun middleName(): StandardAttribute? =
        unwrap(this).getMiddleName()?.let(StandardAttribute::wrap)

    /**
     * The user's nickname or casual name.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun nickname(): StandardAttribute? =
        unwrap(this).getNickname()?.let(StandardAttribute::wrap)

    /**
     * The user's telephone number.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun phoneNumber(): StandardAttribute? =
        unwrap(this).getPhoneNumber()?.let(StandardAttribute::wrap)

    /**
     * The user's preffered username, different from the immutable user name.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun preferredUsername(): StandardAttribute? =
        unwrap(this).getPreferredUsername()?.let(StandardAttribute::wrap)

    /**
     * The URL to the user's profile page.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun profilePage(): StandardAttribute? =
        unwrap(this).getProfilePage()?.let(StandardAttribute::wrap)

    /**
     * The URL to the user's profile picture.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun profilePicture(): StandardAttribute? =
        unwrap(this).getProfilePicture()?.let(StandardAttribute::wrap)

    /**
     * The user's time zone.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun timezone(): StandardAttribute? =
        unwrap(this).getTimezone()?.let(StandardAttribute::wrap)

    /**
     * The URL to the user's web page or blog.
     *
     * Default: - see the defaults under `StandardAttribute`
     */
    override fun website(): StandardAttribute? =
        unwrap(this).getWebsite()?.let(StandardAttribute::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StandardAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StandardAttributes):
        StandardAttributes = CdkObjectWrappers.wrap(cdkObject) as? StandardAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StandardAttributes):
        software.amazon.awscdk.services.cognito.StandardAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.StandardAttributes
  }
}
