package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface StandardAttributes {
  public fun address(): StandardAttribute? = unwrap(this).getAddress()?.let(StandardAttribute::wrap)

  public fun birthdate(): StandardAttribute? =
      unwrap(this).getBirthdate()?.let(StandardAttribute::wrap)

  public fun email(): StandardAttribute? = unwrap(this).getEmail()?.let(StandardAttribute::wrap)

  public fun familyName(): StandardAttribute? =
      unwrap(this).getFamilyName()?.let(StandardAttribute::wrap)

  public fun fullname(): StandardAttribute? =
      unwrap(this).getFullname()?.let(StandardAttribute::wrap)

  public fun gender(): StandardAttribute? = unwrap(this).getGender()?.let(StandardAttribute::wrap)

  public fun givenName(): StandardAttribute? =
      unwrap(this).getGivenName()?.let(StandardAttribute::wrap)

  public fun lastUpdateTime(): StandardAttribute? =
      unwrap(this).getLastUpdateTime()?.let(StandardAttribute::wrap)

  public fun locale(): StandardAttribute? = unwrap(this).getLocale()?.let(StandardAttribute::wrap)

  public fun middleName(): StandardAttribute? =
      unwrap(this).getMiddleName()?.let(StandardAttribute::wrap)

  public fun nickname(): StandardAttribute? =
      unwrap(this).getNickname()?.let(StandardAttribute::wrap)

  public fun phoneNumber(): StandardAttribute? =
      unwrap(this).getPhoneNumber()?.let(StandardAttribute::wrap)

  public fun preferredUsername(): StandardAttribute? =
      unwrap(this).getPreferredUsername()?.let(StandardAttribute::wrap)

  public fun profilePage(): StandardAttribute? =
      unwrap(this).getProfilePage()?.let(StandardAttribute::wrap)

  public fun profilePicture(): StandardAttribute? =
      unwrap(this).getProfilePicture()?.let(StandardAttribute::wrap)

  public fun timezone(): StandardAttribute? =
      unwrap(this).getTimezone()?.let(StandardAttribute::wrap)

  public fun website(): StandardAttribute? = unwrap(this).getWebsite()?.let(StandardAttribute::wrap)

  public interface Builder {
    public fun address(address: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e04863ebc081f57efe17b0846bed186edea9c6d8c9735cd8cddde22c0a181a8")
    public fun address(address: StandardAttribute.Builder.() -> Unit)

    public fun birthdate(birthdate: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1a776cbd8d4a823b9065f74353e7b442130186b9814904736b6178835a628f8")
    public fun birthdate(birthdate: StandardAttribute.Builder.() -> Unit)

    public fun email(email: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c62ba4f3b957f543bca37c19bd953168f8bf999b13494785f9820cf4598839a")
    public fun email(email: StandardAttribute.Builder.() -> Unit)

    public fun familyName(familyName: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc9ebb7e457f71a301f402ed7e077834653d6d74a4077633a6233adc8683e5f")
    public fun familyName(familyName: StandardAttribute.Builder.() -> Unit)

    public fun fullname(fullname: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1156dbf6f8ca71d57d86fc659d17eef238f2917e35ea865818ab41cd021d550d")
    public fun fullname(fullname: StandardAttribute.Builder.() -> Unit)

    public fun gender(gender: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bc45bfdab47e0930e9d19829f983c5c0b55ee3a495c14bd347f5e6617b40db")
    public fun gender(gender: StandardAttribute.Builder.() -> Unit)

    public fun givenName(givenName: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d6791fec10b708d51a68e91084e7ad2624dd85034912d30c4c24854e1255ac5")
    public fun givenName(givenName: StandardAttribute.Builder.() -> Unit)

    public fun lastUpdateTime(lastUpdateTime: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea77d1ba8ed5ec407c81ef5c38b52913cf4a07cd303a82eb293ec34b5967a949")
    public fun lastUpdateTime(lastUpdateTime: StandardAttribute.Builder.() -> Unit)

    public fun locale(locale: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cabb7f0b2cf9dcba19df9976a7bf60b06e483e71cc0b5985b4ce75a6ae664d6a")
    public fun locale(locale: StandardAttribute.Builder.() -> Unit)

    public fun middleName(middleName: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c9a86fd429c168933ca009d4821dece105b543ece1c8220731f9f9bd4d3af6")
    public fun middleName(middleName: StandardAttribute.Builder.() -> Unit)

    public fun nickname(nickname: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed794d8269a1e8aeb73bf56a9c8c365687a181c996806aa1daab8a393de3f84b")
    public fun nickname(nickname: StandardAttribute.Builder.() -> Unit)

    public fun phoneNumber(phoneNumber: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc070dfa1dca812d39ac604a8070f54224951a96b4a321d8220befe13d4da5d")
    public fun phoneNumber(phoneNumber: StandardAttribute.Builder.() -> Unit)

    public fun preferredUsername(preferredUsername: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdc2b200152adb09a39b9373a422c21016355d229b2386987fbe4d62df435d21")
    public fun preferredUsername(preferredUsername: StandardAttribute.Builder.() -> Unit)

    public fun profilePage(profilePage: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("710aa51ac1dcd07bc9ed43908d08cd9b3d01c1e92e3a645c1373cc7a7317850a")
    public fun profilePage(profilePage: StandardAttribute.Builder.() -> Unit)

    public fun profilePicture(profilePicture: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0dff460635705a89b71defa15770cc304b5a2c01bd1eec13939fe951f132a24")
    public fun profilePicture(profilePicture: StandardAttribute.Builder.() -> Unit)

    public fun timezone(timezone: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e35eec5baefac887beb5b7f804a432162f2f185b12df54c38ffff44e343f090e")
    public fun timezone(timezone: StandardAttribute.Builder.() -> Unit)

    public fun website(website: StandardAttribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09768ac325f5e6faa34d94a66c1e506bc228fe24f7f7b29bac6f5d14caf7181d")
    public fun website(website: StandardAttribute.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StandardAttributes.Builder =
        software.amazon.awscdk.services.cognito.StandardAttributes.builder()

    override fun address(address: StandardAttribute) {
      cdkBuilder.address(address.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e04863ebc081f57efe17b0846bed186edea9c6d8c9735cd8cddde22c0a181a8")
    override fun address(address: StandardAttribute.Builder.() -> Unit): Unit =
        address(StandardAttribute(address))

    override fun birthdate(birthdate: StandardAttribute) {
      cdkBuilder.birthdate(birthdate.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1a776cbd8d4a823b9065f74353e7b442130186b9814904736b6178835a628f8")
    override fun birthdate(birthdate: StandardAttribute.Builder.() -> Unit): Unit =
        birthdate(StandardAttribute(birthdate))

    override fun email(email: StandardAttribute) {
      cdkBuilder.email(email.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c62ba4f3b957f543bca37c19bd953168f8bf999b13494785f9820cf4598839a")
    override fun email(email: StandardAttribute.Builder.() -> Unit): Unit =
        email(StandardAttribute(email))

    override fun familyName(familyName: StandardAttribute) {
      cdkBuilder.familyName(familyName.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bc9ebb7e457f71a301f402ed7e077834653d6d74a4077633a6233adc8683e5f")
    override fun familyName(familyName: StandardAttribute.Builder.() -> Unit): Unit =
        familyName(StandardAttribute(familyName))

    override fun fullname(fullname: StandardAttribute) {
      cdkBuilder.fullname(fullname.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1156dbf6f8ca71d57d86fc659d17eef238f2917e35ea865818ab41cd021d550d")
    override fun fullname(fullname: StandardAttribute.Builder.() -> Unit): Unit =
        fullname(StandardAttribute(fullname))

    override fun gender(gender: StandardAttribute) {
      cdkBuilder.gender(gender.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bc45bfdab47e0930e9d19829f983c5c0b55ee3a495c14bd347f5e6617b40db")
    override fun gender(gender: StandardAttribute.Builder.() -> Unit): Unit =
        gender(StandardAttribute(gender))

    override fun givenName(givenName: StandardAttribute) {
      cdkBuilder.givenName(givenName.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d6791fec10b708d51a68e91084e7ad2624dd85034912d30c4c24854e1255ac5")
    override fun givenName(givenName: StandardAttribute.Builder.() -> Unit): Unit =
        givenName(StandardAttribute(givenName))

    override fun lastUpdateTime(lastUpdateTime: StandardAttribute) {
      cdkBuilder.lastUpdateTime(lastUpdateTime.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea77d1ba8ed5ec407c81ef5c38b52913cf4a07cd303a82eb293ec34b5967a949")
    override fun lastUpdateTime(lastUpdateTime: StandardAttribute.Builder.() -> Unit): Unit =
        lastUpdateTime(StandardAttribute(lastUpdateTime))

    override fun locale(locale: StandardAttribute) {
      cdkBuilder.locale(locale.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cabb7f0b2cf9dcba19df9976a7bf60b06e483e71cc0b5985b4ce75a6ae664d6a")
    override fun locale(locale: StandardAttribute.Builder.() -> Unit): Unit =
        locale(StandardAttribute(locale))

    override fun middleName(middleName: StandardAttribute) {
      cdkBuilder.middleName(middleName.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c9a86fd429c168933ca009d4821dece105b543ece1c8220731f9f9bd4d3af6")
    override fun middleName(middleName: StandardAttribute.Builder.() -> Unit): Unit =
        middleName(StandardAttribute(middleName))

    override fun nickname(nickname: StandardAttribute) {
      cdkBuilder.nickname(nickname.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed794d8269a1e8aeb73bf56a9c8c365687a181c996806aa1daab8a393de3f84b")
    override fun nickname(nickname: StandardAttribute.Builder.() -> Unit): Unit =
        nickname(StandardAttribute(nickname))

    override fun phoneNumber(phoneNumber: StandardAttribute) {
      cdkBuilder.phoneNumber(phoneNumber.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc070dfa1dca812d39ac604a8070f54224951a96b4a321d8220befe13d4da5d")
    override fun phoneNumber(phoneNumber: StandardAttribute.Builder.() -> Unit): Unit =
        phoneNumber(StandardAttribute(phoneNumber))

    override fun preferredUsername(preferredUsername: StandardAttribute) {
      cdkBuilder.preferredUsername(preferredUsername.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdc2b200152adb09a39b9373a422c21016355d229b2386987fbe4d62df435d21")
    override fun preferredUsername(preferredUsername: StandardAttribute.Builder.() -> Unit): Unit =
        preferredUsername(StandardAttribute(preferredUsername))

    override fun profilePage(profilePage: StandardAttribute) {
      cdkBuilder.profilePage(profilePage.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("710aa51ac1dcd07bc9ed43908d08cd9b3d01c1e92e3a645c1373cc7a7317850a")
    override fun profilePage(profilePage: StandardAttribute.Builder.() -> Unit): Unit =
        profilePage(StandardAttribute(profilePage))

    override fun profilePicture(profilePicture: StandardAttribute) {
      cdkBuilder.profilePicture(profilePicture.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0dff460635705a89b71defa15770cc304b5a2c01bd1eec13939fe951f132a24")
    override fun profilePicture(profilePicture: StandardAttribute.Builder.() -> Unit): Unit =
        profilePicture(StandardAttribute(profilePicture))

    override fun timezone(timezone: StandardAttribute) {
      cdkBuilder.timezone(timezone.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e35eec5baefac887beb5b7f804a432162f2f185b12df54c38ffff44e343f090e")
    override fun timezone(timezone: StandardAttribute.Builder.() -> Unit): Unit =
        timezone(StandardAttribute(timezone))

    override fun website(website: StandardAttribute) {
      cdkBuilder.website(website.let(StandardAttribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09768ac325f5e6faa34d94a66c1e506bc228fe24f7f7b29bac6f5d14caf7181d")
    override fun website(website: StandardAttribute.Builder.() -> Unit): Unit =
        website(StandardAttribute(website))

    public fun build(): software.amazon.awscdk.services.cognito.StandardAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.StandardAttributes,
  ) : StandardAttributes {
    override fun address(): StandardAttribute? =
        unwrap(this).getAddress()?.let(StandardAttribute::wrap)

    override fun birthdate(): StandardAttribute? =
        unwrap(this).getBirthdate()?.let(StandardAttribute::wrap)

    override fun email(): StandardAttribute? = unwrap(this).getEmail()?.let(StandardAttribute::wrap)

    override fun familyName(): StandardAttribute? =
        unwrap(this).getFamilyName()?.let(StandardAttribute::wrap)

    override fun fullname(): StandardAttribute? =
        unwrap(this).getFullname()?.let(StandardAttribute::wrap)

    override fun gender(): StandardAttribute? =
        unwrap(this).getGender()?.let(StandardAttribute::wrap)

    override fun givenName(): StandardAttribute? =
        unwrap(this).getGivenName()?.let(StandardAttribute::wrap)

    override fun lastUpdateTime(): StandardAttribute? =
        unwrap(this).getLastUpdateTime()?.let(StandardAttribute::wrap)

    override fun locale(): StandardAttribute? =
        unwrap(this).getLocale()?.let(StandardAttribute::wrap)

    override fun middleName(): StandardAttribute? =
        unwrap(this).getMiddleName()?.let(StandardAttribute::wrap)

    override fun nickname(): StandardAttribute? =
        unwrap(this).getNickname()?.let(StandardAttribute::wrap)

    override fun phoneNumber(): StandardAttribute? =
        unwrap(this).getPhoneNumber()?.let(StandardAttribute::wrap)

    override fun preferredUsername(): StandardAttribute? =
        unwrap(this).getPreferredUsername()?.let(StandardAttribute::wrap)

    override fun profilePage(): StandardAttribute? =
        unwrap(this).getProfilePage()?.let(StandardAttribute::wrap)

    override fun profilePicture(): StandardAttribute? =
        unwrap(this).getProfilePicture()?.let(StandardAttribute::wrap)

    override fun timezone(): StandardAttribute? =
        unwrap(this).getTimezone()?.let(StandardAttribute::wrap)

    override fun website(): StandardAttribute? =
        unwrap(this).getWebsite()?.let(StandardAttribute::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StandardAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StandardAttributes):
        StandardAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StandardAttributes):
        software.amazon.awscdk.services.cognito.StandardAttributes = (wrapped as Wrapper).cdkObject
  }
}
