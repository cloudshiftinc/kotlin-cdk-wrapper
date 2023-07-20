@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.StandardAttribute
import software.amazon.awscdk.services.cognito.StandardAttributes
import kotlin.Unit

@CdkDslMarker
public class StandardAttributesDsl {
    private val cdkBuilder: StandardAttributes.Builder = StandardAttributes.builder()

    public fun address(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.address(builder.build())
    }

    public fun address(address: StandardAttribute) {
        cdkBuilder.address(address)
    }

    public fun birthdate(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.birthdate(builder.build())
    }

    public fun birthdate(birthdate: StandardAttribute) {
        cdkBuilder.birthdate(birthdate)
    }

    public fun email(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.email(builder.build())
    }

    public fun email(email: StandardAttribute) {
        cdkBuilder.email(email)
    }

    public fun familyName(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.familyName(builder.build())
    }

    public fun familyName(familyName: StandardAttribute) {
        cdkBuilder.familyName(familyName)
    }

    public fun fullname(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.fullname(builder.build())
    }

    public fun fullname(fullname: StandardAttribute) {
        cdkBuilder.fullname(fullname)
    }

    public fun gender(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.gender(builder.build())
    }

    public fun gender(gender: StandardAttribute) {
        cdkBuilder.gender(gender)
    }

    public fun givenName(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.givenName(builder.build())
    }

    public fun givenName(givenName: StandardAttribute) {
        cdkBuilder.givenName(givenName)
    }

    public fun lastUpdateTime(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.lastUpdateTime(builder.build())
    }

    public fun lastUpdateTime(lastUpdateTime: StandardAttribute) {
        cdkBuilder.lastUpdateTime(lastUpdateTime)
    }

    public fun locale(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.locale(builder.build())
    }

    public fun locale(locale: StandardAttribute) {
        cdkBuilder.locale(locale)
    }

    public fun middleName(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.middleName(builder.build())
    }

    public fun middleName(middleName: StandardAttribute) {
        cdkBuilder.middleName(middleName)
    }

    public fun nickname(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.nickname(builder.build())
    }

    public fun nickname(nickname: StandardAttribute) {
        cdkBuilder.nickname(nickname)
    }

    public fun phoneNumber(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.phoneNumber(builder.build())
    }

    public fun phoneNumber(phoneNumber: StandardAttribute) {
        cdkBuilder.phoneNumber(phoneNumber)
    }

    public fun preferredUsername(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.preferredUsername(builder.build())
    }

    public fun preferredUsername(preferredUsername: StandardAttribute) {
        cdkBuilder.preferredUsername(preferredUsername)
    }

    public fun profilePage(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.profilePage(builder.build())
    }

    public fun profilePage(profilePage: StandardAttribute) {
        cdkBuilder.profilePage(profilePage)
    }

    public fun profilePicture(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.profilePicture(builder.build())
    }

    public fun profilePicture(profilePicture: StandardAttribute) {
        cdkBuilder.profilePicture(profilePicture)
    }

    public fun timezone(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.timezone(builder.build())
    }

    public fun timezone(timezone: StandardAttribute) {
        cdkBuilder.timezone(timezone)
    }

    public fun website(block: StandardAttributeDsl.() -> Unit = {}) {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        cdkBuilder.website(builder.build())
    }

    public fun website(website: StandardAttribute) {
        cdkBuilder.website(website)
    }

    public fun build(): StandardAttributes = cdkBuilder.build()
}
