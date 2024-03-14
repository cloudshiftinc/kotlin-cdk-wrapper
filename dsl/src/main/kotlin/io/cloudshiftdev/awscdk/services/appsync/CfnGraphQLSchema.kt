package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGraphQLSchema internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchema,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The AWS AppSync GraphQL API identifier to which you want to apply this schema.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The AWS AppSync GraphQL API identifier to which you want to apply this schema.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The ID value.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The text representation of a GraphQL schema in SDL format.
   */
  public open fun definition(): String? = unwrap(this).getDefinition()

  /**
   * The text representation of a GraphQL schema in SDL format.
   */
  public open fun definition(`value`: String) {
    unwrap(this).setDefinition(`value`)
  }

  /**
   * The location of a GraphQL schema file in an Amazon S3 bucket.
   */
  public open fun definitionS3Location(): String? = unwrap(this).getDefinitionS3Location()

  /**
   * The location of a GraphQL schema file in an Amazon S3 bucket.
   */
  public open fun definitionS3Location(`value`: String) {
    unwrap(this).setDefinitionS3Location(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnGraphQLSchema].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS AppSync GraphQL API identifier to which you want to apply this schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
     * @param apiId The AWS AppSync GraphQL API identifier to which you want to apply this schema. 
     */
    public fun apiId(apiId: String)

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
    public fun definition(definition: String)

    /**
     * The location of a GraphQL schema file in an Amazon S3 bucket.
     *
     * Use this if you want to provision with the schema living in Amazon S3 rather than embedding
     * it in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
     * @param definitionS3Location The location of a GraphQL schema file in an Amazon S3 bucket. 
     */
    public fun definitionS3Location(definitionS3Location: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLSchema.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLSchema.Builder.create(scope, id)

    /**
     * The AWS AppSync GraphQL API identifier to which you want to apply this schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
     * @param apiId The AWS AppSync GraphQL API identifier to which you want to apply this schema. 
     */
    override fun apiId(apiId: String) {
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
    override fun definition(definition: String) {
      cdkBuilder.definition(definition)
    }

    /**
     * The location of a GraphQL schema file in an Amazon S3 bucket.
     *
     * Use this if you want to provision with the schema living in Amazon S3 rather than embedding
     * it in your CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
     * @param definitionS3Location The location of a GraphQL schema file in an Amazon S3 bucket. 
     */
    override fun definitionS3Location(definitionS3Location: String) {
      cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLSchema =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraphQLSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraphQLSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchema):
        CfnGraphQLSchema = CfnGraphQLSchema(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLSchema):
        software.amazon.awscdk.services.appsync.CfnGraphQLSchema = wrapped.cdkObject
  }
}
