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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.constructs.Construct

/**
 * The `AWS::AppSync::GraphQLSchema` resource is used for your AWS AppSync GraphQL schema that
 * controls the data model for your API.
 *
 * Schema files are text written in Schema Definition Language (SDL) format. For more information
 * about schema authoring, see
 * [Designing a GraphQL API](https://docs.aws.amazon.com/appsync/latest/devguide/designing-a-graphql-api.html)
 * in the *AWS AppSync Developer Guide* .
 *
 * When you submit an update, AWS CloudFormation updates resources based on differences between what
 * you submit and the stack's current template. To cause this resource to be updated you must change
 * a property value for this resource in the CloudFormation template. Changing the Amazon S3 file
 * content without changing a property value will not result in an update operation.
 *
 * See
 * [Update Behaviors of Stack Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html)
 * in the *AWS CloudFormation User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnGraphQLSchema cfnGraphQLSchema = CfnGraphQLSchema.Builder.create(this, "MyCfnGraphQLSchema")
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
public class CfnGraphQLSchemaDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGraphQLSchema.Builder = CfnGraphQLSchema.Builder.create(scope, id)

    /**
     * The AWS AppSync GraphQL API identifier to which you want to apply this schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
     *
     * @param apiId The AWS AppSync GraphQL API identifier to which you want to apply this schema.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * The text representation of a GraphQL schema in SDL format.
     *
     * For more information about using the `Ref` function, see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition)
     *
     * @param definition The text representation of a GraphQL schema in SDL format.
     */
    public fun definition(definition: String) {
        cdkBuilder.definition(definition)
    }

    /**
     * The location of a GraphQL schema file in an Amazon S3 bucket.
     *
     * Use this if you want to provision with the schema living in Amazon S3 rather than embedding
     * it in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
     *
     * @param definitionS3Location The location of a GraphQL schema file in an Amazon S3 bucket.
     */
    public fun definitionS3Location(definitionS3Location: String) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): CfnGraphQLSchema = cdkBuilder.build()
}
