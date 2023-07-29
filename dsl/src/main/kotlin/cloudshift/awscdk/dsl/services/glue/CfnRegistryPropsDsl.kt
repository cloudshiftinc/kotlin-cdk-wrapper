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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.glue.CfnRegistryProps

/**
 * Properties for defining a `CfnRegistry`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnRegistryProps cfnRegistryProps = CfnRegistryProps.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html)
 */
@CdkDslMarker
public class CfnRegistryPropsDsl {
    private val cdkBuilder: CfnRegistryProps.Builder = CfnRegistryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the registry. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the registry. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRegistryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
