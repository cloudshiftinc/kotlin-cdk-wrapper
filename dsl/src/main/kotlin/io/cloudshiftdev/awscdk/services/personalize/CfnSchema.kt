package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchema internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.personalize.CfnSchema,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
        wrapped.cdkObject
  }
}
