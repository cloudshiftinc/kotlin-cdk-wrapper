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

package io.cloudshiftdev.awscdkdsl.services.eventschemas

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.amazon.awscdk.services.eventschemas.CfnRegistryProps

/**
 * Properties for defining a `CfnRegistry`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * CfnRegistryProps cfnRegistryProps = CfnRegistryProps.builder()
 * .description("description")
 * .registryName("registryName")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html)
 */
@CdkDslMarker
public class CfnRegistryPropsDsl {
    private val cdkBuilder: CfnRegistryProps.Builder = CfnRegistryProps.builder()

    private val _tags: MutableList<CfnRegistry.TagsEntryProperty> = mutableListOf()

    /** @param description A description of the registry to be created. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param registryName The name of the schema registry. */
    public fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
    }

    /** @param tags Tags to associate with the registry. */
    public fun tags(tags: CfnRegistryTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnRegistryTagsEntryPropertyDsl().apply(tags).build())
    }

    /** @param tags Tags to associate with the registry. */
    public fun tags(tags: Collection<CfnRegistry.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRegistryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
