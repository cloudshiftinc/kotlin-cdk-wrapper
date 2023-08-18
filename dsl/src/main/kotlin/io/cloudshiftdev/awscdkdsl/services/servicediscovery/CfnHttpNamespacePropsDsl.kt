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

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps

/**
 * Properties for defining a `CfnHttpNamespace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * CfnHttpNamespaceProps cfnHttpNamespaceProps = CfnHttpNamespaceProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html)
 */
@CdkDslMarker
public class CfnHttpNamespacePropsDsl {
    private val cdkBuilder: CfnHttpNamespaceProps.Builder = CfnHttpNamespaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description for the namespace. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name that you want to assign to this namespace. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags for the namespace. Each tag consists of a key and an optional value,
     *   both of which you define. Tag keys can have a maximum character length of 128 characters,
     *   and tag values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags for the namespace. Each tag consists of a key and an optional value,
     *   both of which you define. Tag keys can have a maximum character length of 128 characters,
     *   and tag values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnHttpNamespaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
