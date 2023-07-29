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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CustomActionProperty

/**
 * The creation attributes used for defining a configuration property of a custom Action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * CustomActionProperty customActionProperty = CustomActionProperty.builder()
 * .name("name")
 * .required(false)
 * // the properties below are optional
 * .description("description")
 * .key(false)
 * .queryable(false)
 * .secret(false)
 * .type("type")
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomActionPropertyDsl {
    private val cdkBuilder: CustomActionProperty.Builder = CustomActionProperty.builder()

    /** @param description The description of the property. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param key Whether this property is a key. */
    public fun key(key: Boolean) {
        cdkBuilder.key(key)
    }

    /**
     * @param name The name of the property. You use this name in the `configuration` attribute when
     *   defining your custom Action class.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param queryable Whether this property is queryable. Note that only a single property of a
     *   custom Action can be queryable.
     */
    public fun queryable(queryable: Boolean) {
        cdkBuilder.queryable(queryable)
    }

    /** @param required Whether this property is required. */
    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    /** @param secret Whether this property is secret, like a password, or access key. */
    public fun secret(secret: Boolean) {
        cdkBuilder.secret(secret)
    }

    /** @param type The type of the property, like 'String', 'Number', or 'Boolean'. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CustomActionProperty = cdkBuilder.build()
}
