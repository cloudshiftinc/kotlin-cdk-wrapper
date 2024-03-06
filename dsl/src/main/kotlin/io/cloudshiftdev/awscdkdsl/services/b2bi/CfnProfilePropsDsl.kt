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
import software.amazon.awscdk.services.b2bi.CfnProfileProps

/**
 * Properties for defining a `CfnProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
 * .businessName("businessName")
 * .logging("logging")
 * .name("name")
 * .phone("phone")
 * // the properties below are optional
 * .email("email")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html)
 */
@CdkDslMarker
public class CfnProfilePropsDsl {
    private val cdkBuilder: CfnProfileProps.Builder = CfnProfileProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param businessName Returns the name for the business associated with this profile. */
    public fun businessName(businessName: String) {
        cdkBuilder.businessName(businessName)
    }

    /** @param email the value to be set. */
    public fun email(email: String) {
        cdkBuilder.email(email)
    }

    /** @param logging Specifies whether or not logging is enabled for this profile. */
    public fun logging(logging: String) {
        cdkBuilder.logging(logging)
    }

    /** @param name Returns the display name for profile. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param phone the value to be set. */
    public fun phone(phone: String) {
        cdkBuilder.phone(phone)
    }

    /**
     * @param tags A key-value pair for a specific profile. Tags are metadata that you can use to
     *   search for and group capabilities for various purposes.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A key-value pair for a specific profile. Tags are metadata that you can use to
     *   search for and group capabilities for various purposes.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProfileProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
