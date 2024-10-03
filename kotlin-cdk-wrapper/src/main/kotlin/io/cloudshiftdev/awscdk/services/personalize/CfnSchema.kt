@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Personalize schema from the specified schema string.
 *
 * The schema you create must be in Avro JSON format.
 *
 * Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset
 * type and has a set of required field and keywords. If you are creating a schema for a dataset in a
 * Domain dataset group, you provide the domain of the Domain dataset group. You specify a schema when
 * you call [CreateDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html) .
 *
 * For more information on schemas, see [Datasets and
 * schemas](https://docs.aws.amazon.com/personalize/latest/dg/how-it-works-dataset-schema.html) .
 *
 * **Related APIs** -
 * [ListSchemas](https://docs.aws.amazon.com/personalize/latest/dg/API_ListSchemas.html)
 *
 * * [DescribeSchema](https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSchema.html)
 * * [DeleteSchema](https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteSchema.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.personalize.*;
 * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
 * .name("name")
 * .schema("schema")
 * // the properties below are optional
 * .domain("domain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html)
 */
public open class CfnSchema(
  cdkObject: software.amazon.awscdk.services.personalize.CfnSchema,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSchemaProps,
  ) :
      this(software.amazon.awscdk.services.personalize.CfnSchema(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSchemaProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSchemaProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSchemaProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the schema.
   */
  public open fun attrSchemaArn(): String = unwrap(this).getAttrSchemaArn()

  /**
   * The domain of a schema that you created for a dataset in a Domain dataset group.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * The domain of a schema that you created for a dataset in a Domain dataset group.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the schema.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the schema.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The schema.
   */
  public open fun schema(): String = unwrap(this).getSchema()

  /**
   * The schema.
   */
  public open fun schema(`value`: String) {
    unwrap(this).setSchema(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.personalize.CfnSchema].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The domain of a schema that you created for a dataset in a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-domain)
     * @param domain The domain of a schema that you created for a dataset in a Domain dataset
     * group. 
     */
    public fun domain(domain: String)

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-name)
     * @param name The name of the schema. 
     */
    public fun name(name: String)

    /**
     * The schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-schema)
     * @param schema The schema. 
     */
    public fun schema(schema: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSchema.Builder =
        software.amazon.awscdk.services.personalize.CfnSchema.Builder.create(scope, id)

    /**
     * The domain of a schema that you created for a dataset in a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-domain)
     * @param domain The domain of a schema that you created for a dataset in a Domain dataset
     * group. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-name)
     * @param name The name of the schema. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-schema)
     * @param schema The schema. 
     */
    override fun schema(schema: String) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnSchema = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.personalize.CfnSchema.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSchema): CfnSchema =
        CfnSchema(cdkObject)

    internal fun unwrap(wrapped: CfnSchema): software.amazon.awscdk.services.personalize.CfnSchema =
        wrapped.cdkObject as software.amazon.awscdk.services.personalize.CfnSchema
  }
}
