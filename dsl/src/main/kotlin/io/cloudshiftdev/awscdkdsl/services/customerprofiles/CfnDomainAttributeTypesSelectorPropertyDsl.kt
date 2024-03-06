@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * Configures information about the `AttributeTypesSelector` which rule-based identity resolution
 * uses to match profiles.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * AttributeTypesSelectorProperty attributeTypesSelectorProperty =
 * AttributeTypesSelectorProperty.builder()
 * .attributeMatchingModel("attributeMatchingModel")
 * // the properties below are optional
 * .address(List.of("address"))
 * .emailAddress(List.of("emailAddress"))
 * .phoneNumber(List.of("phoneNumber"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html)
 */
@CdkDslMarker
public class CfnDomainAttributeTypesSelectorPropertyDsl {
    private val cdkBuilder: CfnDomain.AttributeTypesSelectorProperty.Builder =
        CfnDomain.AttributeTypesSelectorProperty.builder()

    private val _address: MutableList<String> = mutableListOf()

    private val _emailAddress: MutableList<String> = mutableListOf()

    private val _phoneNumber: MutableList<String> = mutableListOf()

    /**
     * @param address The `Address` type. You can choose from `Address` , `BusinessAddress` ,
     *   `MaillingAddress` , and `ShippingAddress` . You only can use the `Address` type in the
     *   `MatchingRule` . For example, if you want to match a profile based on
     *   `BusinessAddress.City` or `MaillingAddress.City` , you can choose the `BusinessAddress` and
     *   the `MaillingAddress` to represent the `Address` type and specify the `Address.City` on the
     *   matching rule.
     */
    public fun address(vararg address: String) {
        _address.addAll(listOf(*address))
    }

    /**
     * @param address The `Address` type. You can choose from `Address` , `BusinessAddress` ,
     *   `MaillingAddress` , and `ShippingAddress` . You only can use the `Address` type in the
     *   `MatchingRule` . For example, if you want to match a profile based on
     *   `BusinessAddress.City` or `MaillingAddress.City` , you can choose the `BusinessAddress` and
     *   the `MaillingAddress` to represent the `Address` type and specify the `Address.City` on the
     *   matching rule.
     */
    public fun address(address: Collection<String>) {
        _address.addAll(address)
    }

    /**
     * @param attributeMatchingModel Configures the `AttributeMatchingModel` , you can either choose
     *   `ONE_TO_ONE` or `MANY_TO_MANY` .
     */
    public fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
    }

    /**
     * @param emailAddress The Email type. You can choose from `EmailAddress` ,
     *   `BusinessEmailAddress` and `PersonalEmailAddress` . You only can use the `EmailAddress`
     *   type in the `MatchingRule` . For example, if you want to match profile based on
     *   `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
     *   `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type
     *   and only specify the `EmailAddress` on the matching rule.
     */
    public fun emailAddress(vararg emailAddress: String) {
        _emailAddress.addAll(listOf(*emailAddress))
    }

    /**
     * @param emailAddress The Email type. You can choose from `EmailAddress` ,
     *   `BusinessEmailAddress` and `PersonalEmailAddress` . You only can use the `EmailAddress`
     *   type in the `MatchingRule` . For example, if you want to match profile based on
     *   `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
     *   `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type
     *   and only specify the `EmailAddress` on the matching rule.
     */
    public fun emailAddress(emailAddress: Collection<String>) {
        _emailAddress.addAll(emailAddress)
    }

    /**
     * @param phoneNumber The `PhoneNumber` type. You can choose from `PhoneNumber` ,
     *   `HomePhoneNumber` , and `MobilePhoneNumber` . You only can use the `PhoneNumber` type in
     *   the `MatchingRule` . For example, if you want to match a profile based on `Phone` or
     *   `HomePhone` , you can choose the `Phone` and the `HomePhone` to represent the `PhoneNumber`
     *   type and only specify the `PhoneNumber` on the matching rule.
     */
    public fun phoneNumber(vararg phoneNumber: String) {
        _phoneNumber.addAll(listOf(*phoneNumber))
    }

    /**
     * @param phoneNumber The `PhoneNumber` type. You can choose from `PhoneNumber` ,
     *   `HomePhoneNumber` , and `MobilePhoneNumber` . You only can use the `PhoneNumber` type in
     *   the `MatchingRule` . For example, if you want to match a profile based on `Phone` or
     *   `HomePhone` , you can choose the `Phone` and the `HomePhone` to represent the `PhoneNumber`
     *   type and only specify the `PhoneNumber` on the matching rule.
     */
    public fun phoneNumber(phoneNumber: Collection<String>) {
        _phoneNumber.addAll(phoneNumber)
    }

    public fun build(): CfnDomain.AttributeTypesSelectorProperty {
        if (_address.isNotEmpty()) cdkBuilder.address(_address)
        if (_emailAddress.isNotEmpty()) cdkBuilder.emailAddress(_emailAddress)
        if (_phoneNumber.isNotEmpty()) cdkBuilder.phoneNumber(_phoneNumber)
        return cdkBuilder.build()
    }
}
