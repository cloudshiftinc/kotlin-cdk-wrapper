@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnGraphQLSchema`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
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
public interface CfnGraphQLSchemaProps {
  /**
   * The AWS AppSync GraphQL API identifier to which you want to apply this schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
   */
  public fun apiId(): String

  /**
   * The text representation of a GraphQL schema in SDL format.
   *
   * For more information about using the `Ref` function, see
   * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition)
   */
  public fun definition(): String? = unwrap(this).getDefinition()

  /**
   * The location of a GraphQL schema file in an Amazon S3 bucket.
   *
   * Use this if you want to provision with the schema living in Amazon S3 rather than embedding it
   * in your CloudFormation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
   */
  public fun definitionS3Location(): String? = unwrap(this).getDefinitionS3Location()

  /**
   * A builder for [CfnGraphQLSchemaProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The AWS AppSync GraphQL API identifier to which you want to apply this schema. 
     */
    public fun apiId(apiId: String)

    /**
     * @param definition The text representation of a GraphQL schema in SDL format.
     * For more information about using the `Ref` function, see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref)
     * .
     */
    public fun definition(definition: String)

    /**
     * @param definitionS3Location The location of a GraphQL schema file in an Amazon S3 bucket.
     * Use this if you want to provision with the schema living in Amazon S3 rather than embedding
     * it in your CloudFormation template.
     */
    public fun definitionS3Location(definitionS3Location: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.builder()

    /**
     * @param apiId The AWS AppSync GraphQL API identifier to which you want to apply this schema. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param definition The text representation of a GraphQL schema in SDL format.
     * For more information about using the `Ref` function, see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref)
     * .
     */
    override fun definition(definition: String) {
      cdkBuilder.definition(definition)
    }

    /**
     * @param definitionS3Location The location of a GraphQL schema file in an Amazon S3 bucket.
     * Use this if you want to provision with the schema living in Amazon S3 rather than embedding
     * it in your CloudFormation template.
     */
    override fun definitionS3Location(definitionS3Location: String) {
      cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps,
  ) : CdkObject(cdkObject), CfnGraphQLSchemaProps {
    /**
     * The AWS AppSync GraphQL API identifier to which you want to apply this schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The text representation of a GraphQL schema in SDL format.
     *
     * For more information about using the `Ref` function, see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition)
     */
    override fun definition(): String? = unwrap(this).getDefinition()

    /**
     * The location of a GraphQL schema file in an Amazon S3 bucket.
     *
     * Use this if you want to provision with the schema living in Amazon S3 rather than embedding
     * it in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
     */
    override fun definitionS3Location(): String? = unwrap(this).getDefinitionS3Location()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphQLSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps):
        CfnGraphQLSchemaProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGraphQLSchemaProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLSchemaProps):
        software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps
  }
}
