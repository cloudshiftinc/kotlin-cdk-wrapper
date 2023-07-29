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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalogappregistry.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    /** @param description The description of the application. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name of the application. The name must be unique in the region in which you
     *   are creating the application.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags Key-value pairs you can use to associate with the application. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnApplicationProps = cdkBuilder.build()
}
