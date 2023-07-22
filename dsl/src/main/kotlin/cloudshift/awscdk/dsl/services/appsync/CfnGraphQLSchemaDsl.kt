@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.constructs.Construct

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
   * @param definition The text representation of a GraphQL schema in SDL format. 
   */
  public fun definition(definition: String) {
    cdkBuilder.definition(definition)
  }

  /**
   * The location of a GraphQL schema file in an Amazon S3 bucket.
   *
   * Use this if you want to provision with the schema living in Amazon S3 rather than embedding it
   * in your CloudFormation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
   * @param definitionS3Location The location of a GraphQL schema file in an Amazon S3 bucket. 
   */
  public fun definitionS3Location(definitionS3Location: String) {
    cdkBuilder.definitionS3Location(definitionS3Location)
  }

  public fun build(): CfnGraphQLSchema = cdkBuilder.build()
}
