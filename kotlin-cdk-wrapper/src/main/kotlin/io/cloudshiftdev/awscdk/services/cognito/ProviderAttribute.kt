@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * An attribute available from a third party identity provider.
 *
 * Example:
 *
 * ```
 * UserPool userpool = new UserPool(this, "Pool");
 * UserPoolIdentityProviderAmazon.Builder.create(this, "Amazon")
 * .clientId("amzn-client-id")
 * .clientSecret("amzn-client-secret")
 * .userPool(userpool)
 * .attributeMapping(AttributeMapping.builder()
 * .email(ProviderAttribute.AMAZON_EMAIL)
 * .website(ProviderAttribute.other("url")) // use other() when an attribute is not pre-defined in
 * the CDK
 * .custom(Map.of(
 * // custom user pool attributes go here
 * "uniqueId", ProviderAttribute.AMAZON_USER_ID))
 * .build())
 * .build();
 * ```
 */
public open class ProviderAttribute(
  cdkObject: software.amazon.awscdk.services.cognito.ProviderAttribute,
) : CdkObject(cdkObject) {
  /**
   * The attribute value string as recognized by the provider.
   */
  public open fun attributeName(): String = unwrap(this).getAttributeName()

  public companion object {
    public val AMAZON_EMAIL: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.AMAZON_EMAIL)

    public val AMAZON_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.AMAZON_NAME)

    public val AMAZON_POSTAL_CODE: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.AMAZON_POSTAL_CODE)

    public val AMAZON_USER_ID: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.AMAZON_USER_ID)

    public val APPLE_EMAIL: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.APPLE_EMAIL)

    public val APPLE_EMAIL_VERIFIED: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.APPLE_EMAIL_VERIFIED)

    public val APPLE_FIRST_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.APPLE_FIRST_NAME)

    public val APPLE_LAST_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.APPLE_LAST_NAME)

    public val APPLE_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.APPLE_NAME)

    public val FACEBOOK_BIRTHDAY: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_BIRTHDAY)

    public val FACEBOOK_EMAIL: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_EMAIL)

    public val FACEBOOK_FIRST_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_FIRST_NAME)

    public val FACEBOOK_GENDER: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_GENDER)

    public val FACEBOOK_ID: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_ID)

    public val FACEBOOK_LAST_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_LAST_NAME)

    public val FACEBOOK_LOCALE: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_LOCALE)

    public val FACEBOOK_MIDDLE_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_MIDDLE_NAME)

    public val FACEBOOK_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.FACEBOOK_NAME)

    public val GOOGLE_BIRTHDAYS: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_BIRTHDAYS)

    public val GOOGLE_EMAIL: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_EMAIL)

    public val GOOGLE_EMAIL_VERIFIED: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_EMAIL_VERIFIED)

    public val GOOGLE_FAMILY_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_FAMILY_NAME)

    public val GOOGLE_GENDER: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_GENDER)

    public val GOOGLE_GIVEN_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_GIVEN_NAME)

    public val GOOGLE_NAME: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_NAME)

    public val GOOGLE_NAMES: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_NAMES)

    public val GOOGLE_PHONE_NUMBERS: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_PHONE_NUMBERS)

    public val GOOGLE_PICTURE: ProviderAttribute =
        ProviderAttribute.wrap(software.amazon.awscdk.services.cognito.ProviderAttribute.GOOGLE_PICTURE)

    public fun other(attributeName: String): ProviderAttribute =
        software.amazon.awscdk.services.cognito.ProviderAttribute.other(attributeName).let(ProviderAttribute::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ProviderAttribute):
        ProviderAttribute = ProviderAttribute(cdkObject)

    internal fun unwrap(wrapped: ProviderAttribute):
        software.amazon.awscdk.services.cognito.ProviderAttribute = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.ProviderAttribute
  }
}
