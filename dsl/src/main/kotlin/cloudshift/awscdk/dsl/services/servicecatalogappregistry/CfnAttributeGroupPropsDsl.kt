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

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps

/**
 * Properties for defining a `CfnAttributeGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalogappregistry.*;
 * Object attributes;
 * CfnAttributeGroupProps cfnAttributeGroupProps = CfnAttributeGroupProps.builder()
 * .attributes(attributes)
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html)
 */
@CdkDslMarker
public class CfnAttributeGroupPropsDsl {
    private val cdkBuilder: CfnAttributeGroupProps.Builder = CfnAttributeGroupProps.builder()

    /**
     * @param attributes A nested object in a JSON or YAML template that supports arbitrary
     *   definitions. Represents the attributes in an attribute group that describes an application
     *   and its components.
     */
    public fun attributes(attributes: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(attributes)
        cdkBuilder.attributes(builder.map)
    }

    /**
     * @param attributes A nested object in a JSON or YAML template that supports arbitrary
     *   definitions. Represents the attributes in an attribute group that describes an application
     *   and its components.
     */
    public fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
    }

    /** @param description The description of the attribute group that the user provides. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the attribute group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags Key-value pairs you can use to associate with the attribute group. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnAttributeGroupProps = cdkBuilder.build()
}
