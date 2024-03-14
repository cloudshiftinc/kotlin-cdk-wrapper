package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AttributeMapping {
    /**
     * The user's postal address is a required attribute.
     *
     * Default: - not mapped
     */
    public fun address(): ProviderAttribute? =
        unwrap(this).getAddress()?.let(ProviderAttribute::wrap)

    /**
     * The user's birthday.
     *
     * Default: - not mapped
     */
    public fun birthdate(): ProviderAttribute? =
        unwrap(this).getBirthdate()?.let(ProviderAttribute::wrap)

    /**
     * Specify custom attribute mapping here and mapping for any standard attributes not supported
     * yet.
     *
     * Default: - no custom attribute mapping
     */
    public fun custom(): Map<String, ProviderAttribute> =
        unwrap(this).getCustom()?.mapValues { ProviderAttribute.wrap(it.value) } ?: emptyMap()

    /**
     * The user's e-mail address.
     *
     * Default: - not mapped
     */
    public fun email(): ProviderAttribute? = unwrap(this).getEmail()?.let(ProviderAttribute::wrap)

    /**
     * The surname or last name of user.
     *
     * Default: - not mapped
     */
    public fun familyName(): ProviderAttribute? =
        unwrap(this).getFamilyName()?.let(ProviderAttribute::wrap)

    /**
     * The user's full name in displayable form.
     *
     * Default: - not mapped
     */
    public fun fullname(): ProviderAttribute? =
        unwrap(this).getFullname()?.let(ProviderAttribute::wrap)

    /**
     * The user's gender.
     *
     * Default: - not mapped
     */
    public fun gender(): ProviderAttribute? = unwrap(this).getGender()?.let(ProviderAttribute::wrap)

    /**
     * The user's first name or give name.
     *
     * Default: - not mapped
     */
    public fun givenName(): ProviderAttribute? =
        unwrap(this).getGivenName()?.let(ProviderAttribute::wrap)

    /**
     * Time, the user's information was last updated.
     *
     * Default: - not mapped
     */
    public fun lastUpdateTime(): ProviderAttribute? =
        unwrap(this).getLastUpdateTime()?.let(ProviderAttribute::wrap)

    /**
     * The user's locale.
     *
     * Default: - not mapped
     */
    public fun locale(): ProviderAttribute? = unwrap(this).getLocale()?.let(ProviderAttribute::wrap)

    /**
     * The user's middle name.
     *
     * Default: - not mapped
     */
    public fun middleName(): ProviderAttribute? =
        unwrap(this).getMiddleName()?.let(ProviderAttribute::wrap)

    /**
     * The user's nickname or casual name.
     *
     * Default: - not mapped
     */
    public fun nickname(): ProviderAttribute? =
        unwrap(this).getNickname()?.let(ProviderAttribute::wrap)

    /**
     * The user's telephone number.
     *
     * Default: - not mapped
     */
    public fun phoneNumber(): ProviderAttribute? =
        unwrap(this).getPhoneNumber()?.let(ProviderAttribute::wrap)

    /**
     * The user's preferred username.
     *
     * Default: - not mapped
     */
    public fun preferredUsername(): ProviderAttribute? =
        unwrap(this).getPreferredUsername()?.let(ProviderAttribute::wrap)

    /**
     * The URL to the user's profile page.
     *
     * Default: - not mapped
     */
    public fun profilePage(): ProviderAttribute? =
        unwrap(this).getProfilePage()?.let(ProviderAttribute::wrap)

    /**
     * The URL to the user's profile picture.
     *
     * Default: - not mapped
     */
    public fun profilePicture(): ProviderAttribute? =
        unwrap(this).getProfilePicture()?.let(ProviderAttribute::wrap)

    /**
     * The user's time zone.
     *
     * Default: - not mapped
     */
    public fun timezone(): ProviderAttribute? =
        unwrap(this).getTimezone()?.let(ProviderAttribute::wrap)

    /**
     * The URL to the user's web page or blog.
     *
     * Default: - not mapped
     */
    public fun website(): ProviderAttribute? =
        unwrap(this).getWebsite()?.let(ProviderAttribute::wrap)

    /** A builder for [AttributeMapping] */
    @CdkDslMarker
    public interface Builder {
        /** @param address The user's postal address is a required attribute. */
        public fun address(address: ProviderAttribute)

        /** @param birthdate The user's birthday. */
        public fun birthdate(birthdate: ProviderAttribute)

        /**
         * @param custom Specify custom attribute mapping here and mapping for any standard
         *   attributes not supported yet.
         */
        public fun custom(custom: Map<String, ProviderAttribute>)

        /** @param email The user's e-mail address. */
        public fun email(email: ProviderAttribute)

        /** @param familyName The surname or last name of user. */
        public fun familyName(familyName: ProviderAttribute)

        /** @param fullname The user's full name in displayable form. */
        public fun fullname(fullname: ProviderAttribute)

        /** @param gender The user's gender. */
        public fun gender(gender: ProviderAttribute)

        /** @param givenName The user's first name or give name. */
        public fun givenName(givenName: ProviderAttribute)

        /** @param lastUpdateTime Time, the user's information was last updated. */
        public fun lastUpdateTime(lastUpdateTime: ProviderAttribute)

        /** @param locale The user's locale. */
        public fun locale(locale: ProviderAttribute)

        /** @param middleName The user's middle name. */
        public fun middleName(middleName: ProviderAttribute)

        /** @param nickname The user's nickname or casual name. */
        public fun nickname(nickname: ProviderAttribute)

        /** @param phoneNumber The user's telephone number. */
        public fun phoneNumber(phoneNumber: ProviderAttribute)

        /** @param preferredUsername The user's preferred username. */
        public fun preferredUsername(preferredUsername: ProviderAttribute)

        /** @param profilePage The URL to the user's profile page. */
        public fun profilePage(profilePage: ProviderAttribute)

        /** @param profilePicture The URL to the user's profile picture. */
        public fun profilePicture(profilePicture: ProviderAttribute)

        /** @param timezone The user's time zone. */
        public fun timezone(timezone: ProviderAttribute)

        /** @param website The URL to the user's web page or blog. */
        public fun website(website: ProviderAttribute)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cognito.AttributeMapping.Builder =
            software.amazon.awscdk.services.cognito.AttributeMapping.builder()

        /** @param address The user's postal address is a required attribute. */
        override fun address(address: ProviderAttribute) {
            cdkBuilder.address(address.let(ProviderAttribute::unwrap))
        }

        /** @param birthdate The user's birthday. */
        override fun birthdate(birthdate: ProviderAttribute) {
            cdkBuilder.birthdate(birthdate.let(ProviderAttribute::unwrap))
        }

        /**
         * @param custom Specify custom attribute mapping here and mapping for any standard
         *   attributes not supported yet.
         */
        override fun custom(custom: Map<String, ProviderAttribute>) {
            cdkBuilder.custom(custom.mapValues { ProviderAttribute.unwrap(it.value) })
        }

        /** @param email The user's e-mail address. */
        override fun email(email: ProviderAttribute) {
            cdkBuilder.email(email.let(ProviderAttribute::unwrap))
        }

        /** @param familyName The surname or last name of user. */
        override fun familyName(familyName: ProviderAttribute) {
            cdkBuilder.familyName(familyName.let(ProviderAttribute::unwrap))
        }

        /** @param fullname The user's full name in displayable form. */
        override fun fullname(fullname: ProviderAttribute) {
            cdkBuilder.fullname(fullname.let(ProviderAttribute::unwrap))
        }

        /** @param gender The user's gender. */
        override fun gender(gender: ProviderAttribute) {
            cdkBuilder.gender(gender.let(ProviderAttribute::unwrap))
        }

        /** @param givenName The user's first name or give name. */
        override fun givenName(givenName: ProviderAttribute) {
            cdkBuilder.givenName(givenName.let(ProviderAttribute::unwrap))
        }

        /** @param lastUpdateTime Time, the user's information was last updated. */
        override fun lastUpdateTime(lastUpdateTime: ProviderAttribute) {
            cdkBuilder.lastUpdateTime(lastUpdateTime.let(ProviderAttribute::unwrap))
        }

        /** @param locale The user's locale. */
        override fun locale(locale: ProviderAttribute) {
            cdkBuilder.locale(locale.let(ProviderAttribute::unwrap))
        }

        /** @param middleName The user's middle name. */
        override fun middleName(middleName: ProviderAttribute) {
            cdkBuilder.middleName(middleName.let(ProviderAttribute::unwrap))
        }

        /** @param nickname The user's nickname or casual name. */
        override fun nickname(nickname: ProviderAttribute) {
            cdkBuilder.nickname(nickname.let(ProviderAttribute::unwrap))
        }

        /** @param phoneNumber The user's telephone number. */
        override fun phoneNumber(phoneNumber: ProviderAttribute) {
            cdkBuilder.phoneNumber(phoneNumber.let(ProviderAttribute::unwrap))
        }

        /** @param preferredUsername The user's preferred username. */
        override fun preferredUsername(preferredUsername: ProviderAttribute) {
            cdkBuilder.preferredUsername(preferredUsername.let(ProviderAttribute::unwrap))
        }

        /** @param profilePage The URL to the user's profile page. */
        override fun profilePage(profilePage: ProviderAttribute) {
            cdkBuilder.profilePage(profilePage.let(ProviderAttribute::unwrap))
        }

        /** @param profilePicture The URL to the user's profile picture. */
        override fun profilePicture(profilePicture: ProviderAttribute) {
            cdkBuilder.profilePicture(profilePicture.let(ProviderAttribute::unwrap))
        }

        /** @param timezone The user's time zone. */
        override fun timezone(timezone: ProviderAttribute) {
            cdkBuilder.timezone(timezone.let(ProviderAttribute::unwrap))
        }

        /** @param website The URL to the user's web page or blog. */
        override fun website(website: ProviderAttribute) {
            cdkBuilder.website(website.let(ProviderAttribute::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.cognito.AttributeMapping =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cognito.AttributeMapping,
    ) : AttributeMapping {
        /**
         * The user's postal address is a required attribute.
         *
         * Default: - not mapped
         */
        override fun address(): ProviderAttribute? =
            unwrap(this).getAddress()?.let(ProviderAttribute::wrap)

        /**
         * The user's birthday.
         *
         * Default: - not mapped
         */
        override fun birthdate(): ProviderAttribute? =
            unwrap(this).getBirthdate()?.let(ProviderAttribute::wrap)

        /**
         * Specify custom attribute mapping here and mapping for any standard attributes not
         * supported yet.
         *
         * Default: - no custom attribute mapping
         */
        override fun custom(): Map<String, ProviderAttribute> =
            unwrap(this).getCustom()?.mapValues { ProviderAttribute.wrap(it.value) } ?: emptyMap()

        /**
         * The user's e-mail address.
         *
         * Default: - not mapped
         */
        override fun email(): ProviderAttribute? =
            unwrap(this).getEmail()?.let(ProviderAttribute::wrap)

        /**
         * The surname or last name of user.
         *
         * Default: - not mapped
         */
        override fun familyName(): ProviderAttribute? =
            unwrap(this).getFamilyName()?.let(ProviderAttribute::wrap)

        /**
         * The user's full name in displayable form.
         *
         * Default: - not mapped
         */
        override fun fullname(): ProviderAttribute? =
            unwrap(this).getFullname()?.let(ProviderAttribute::wrap)

        /**
         * The user's gender.
         *
         * Default: - not mapped
         */
        override fun gender(): ProviderAttribute? =
            unwrap(this).getGender()?.let(ProviderAttribute::wrap)

        /**
         * The user's first name or give name.
         *
         * Default: - not mapped
         */
        override fun givenName(): ProviderAttribute? =
            unwrap(this).getGivenName()?.let(ProviderAttribute::wrap)

        /**
         * Time, the user's information was last updated.
         *
         * Default: - not mapped
         */
        override fun lastUpdateTime(): ProviderAttribute? =
            unwrap(this).getLastUpdateTime()?.let(ProviderAttribute::wrap)

        /**
         * The user's locale.
         *
         * Default: - not mapped
         */
        override fun locale(): ProviderAttribute? =
            unwrap(this).getLocale()?.let(ProviderAttribute::wrap)

        /**
         * The user's middle name.
         *
         * Default: - not mapped
         */
        override fun middleName(): ProviderAttribute? =
            unwrap(this).getMiddleName()?.let(ProviderAttribute::wrap)

        /**
         * The user's nickname or casual name.
         *
         * Default: - not mapped
         */
        override fun nickname(): ProviderAttribute? =
            unwrap(this).getNickname()?.let(ProviderAttribute::wrap)

        /**
         * The user's telephone number.
         *
         * Default: - not mapped
         */
        override fun phoneNumber(): ProviderAttribute? =
            unwrap(this).getPhoneNumber()?.let(ProviderAttribute::wrap)

        /**
         * The user's preferred username.
         *
         * Default: - not mapped
         */
        override fun preferredUsername(): ProviderAttribute? =
            unwrap(this).getPreferredUsername()?.let(ProviderAttribute::wrap)

        /**
         * The URL to the user's profile page.
         *
         * Default: - not mapped
         */
        override fun profilePage(): ProviderAttribute? =
            unwrap(this).getProfilePage()?.let(ProviderAttribute::wrap)

        /**
         * The URL to the user's profile picture.
         *
         * Default: - not mapped
         */
        override fun profilePicture(): ProviderAttribute? =
            unwrap(this).getProfilePicture()?.let(ProviderAttribute::wrap)

        /**
         * The user's time zone.
         *
         * Default: - not mapped
         */
        override fun timezone(): ProviderAttribute? =
            unwrap(this).getTimezone()?.let(ProviderAttribute::wrap)

        /**
         * The URL to the user's web page or blog.
         *
         * Default: - not mapped
         */
        override fun website(): ProviderAttribute? =
            unwrap(this).getWebsite()?.let(ProviderAttribute::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AttributeMapping {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.AttributeMapping
        ): AttributeMapping = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AttributeMapping
        ): software.amazon.awscdk.services.cognito.AttributeMapping = (wrapped as Wrapper).cdkObject
    }
}
