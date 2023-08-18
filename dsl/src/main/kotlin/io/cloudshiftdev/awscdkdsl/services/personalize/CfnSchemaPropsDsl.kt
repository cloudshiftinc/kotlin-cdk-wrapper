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

package io.cloudshiftdev.awscdkdsl.services.personalize

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSchemaProps

/**
 * Properties for defining a `CfnSchema`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
 * .name("name")
 * .schema("schema")
 * // the properties below are optional
 * .domain("domain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html)
 */
@CdkDslMarker
public class CfnSchemaPropsDsl {
    private val cdkBuilder: CfnSchemaProps.Builder = CfnSchemaProps.builder()

    /**
     * @param domain The domain of a schema that you created for a dataset in a Domain dataset
     *   group.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /** @param name The name of the schema. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param schema The schema. */
    public fun schema(schema: String) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnSchemaProps = cdkBuilder.build()
}
