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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps

/**
 * Properties for defining a `CfnGraphQLSchema`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnGraphQLSchemaProps cfnGraphQLSchemaProps = CfnGraphQLSchemaProps.builder()
 * .apiId("apiId")
 * // the properties below are optional
 * .definition("definition")
 * .definitionS3Location("definitionS3Location")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html)
 */
@CdkDslMarker
public class CfnGraphQLSchemaPropsDsl {
    private val cdkBuilder: CfnGraphQLSchemaProps.Builder = CfnGraphQLSchemaProps.builder()

    /**
     * @param apiId The AWS AppSync GraphQL API identifier to which you want to apply this schema.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * @param definition The text representation of a GraphQL schema in SDL format. For more
     *   information about using the `Ref` function, see
     *   [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref)
     *   .
     */
    public fun definition(definition: String) {
        cdkBuilder.definition(definition)
    }

    /**
     * @param definitionS3Location The location of a GraphQL schema file in an Amazon S3 bucket. Use
     *   this if you want to provision with the schema living in Amazon S3 rather than embedding it
     *   in your CloudFormation template.
     */
    public fun definitionS3Location(definitionS3Location: String) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): CfnGraphQLSchemaProps = cdkBuilder.build()
}
