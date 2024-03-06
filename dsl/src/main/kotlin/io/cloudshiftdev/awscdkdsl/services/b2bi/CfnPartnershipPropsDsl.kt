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

package io.cloudshiftdev.awscdkdsl.services.b2bi

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.b2bi.CfnPartnershipProps

/**
 * Properties for defining a `CfnPartnership`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * CfnPartnershipProps cfnPartnershipProps = CfnPartnershipProps.builder()
 * .email("email")
 * .name("name")
 * .profileId("profileId")
 * // the properties below are optional
 * .capabilities(List.of("capabilities"))
 * .phone("phone")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html)
 */
@CdkDslMarker
public class CfnPartnershipPropsDsl {
    private val cdkBuilder: CfnPartnershipProps.Builder = CfnPartnershipProps.builder()

    private val _capabilities: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param capabilities Returns one or more capabilities associated with this partnership. */
    public fun capabilities(vararg capabilities: String) {
        _capabilities.addAll(listOf(*capabilities))
    }

    /** @param capabilities Returns one or more capabilities associated with this partnership. */
    public fun capabilities(capabilities: Collection<String>) {
        _capabilities.addAll(capabilities)
    }

    /** @param email the value to be set. */
    public fun email(email: String) {
        cdkBuilder.email(email)
    }

    /** @param name Returns the name of the partnership. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param phone the value to be set. */
    public fun phone(phone: String) {
        cdkBuilder.phone(phone)
    }

    /**
     * @param profileId Returns the unique, system-generated identifier for the profile connected to
     *   this partnership.
     */
    public fun profileId(profileId: String) {
        cdkBuilder.profileId(profileId)
    }

    /**
     * @param tags A key-value pair for a specific partnership. Tags are metadata that you can use
     *   to search for and group capabilities for various purposes.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A key-value pair for a specific partnership. Tags are metadata that you can use
     *   to search for and group capabilities for various purposes.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPartnershipProps {
        if (_capabilities.isNotEmpty()) cdkBuilder.capabilities(_capabilities)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
