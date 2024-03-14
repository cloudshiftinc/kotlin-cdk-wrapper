package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchemaVersionMetadata internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A metadata key in a key-value pair for metadata.
   */
  public open fun key(): String = unwrap(this).getKey()

  /**
   * A metadata key in a key-value pair for metadata.
   */
  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  /**
   * The version number of the schema.
   */
  public open fun schemaVersionId(): String = unwrap(this).getSchemaVersionId()

  /**
   * The version number of the schema.
   */
  public open fun schemaVersionId(`value`: String) {
    unwrap(this).setSchemaVersionId(`value`)
  }

  /**
   * A metadata key's corresponding value.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  /**
   * A metadata key's corresponding value.
   */
  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnSchemaVersionMetadata].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A metadata key in a key-value pair for metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-key)
     * @param key A metadata key in a key-value pair for metadata. 
     */
    public fun key(key: String)

    /**
     * The version number of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-schemaversionid)
     * @param schemaVersionId The version number of the schema. 
     */
    public fun schemaVersionId(schemaVersionId: String)

    /**
     * A metadata key's corresponding value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-value)
     * @param value A metadata key's corresponding value. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata.Builder.create(scope, id)

    /**
     * A metadata key in a key-value pair for metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-key)
     * @param key A metadata key in a key-value pair for metadata. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * The version number of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-schemaversionid)
     * @param schemaVersionId The version number of the schema. 
     */
    override fun schemaVersionId(schemaVersionId: String) {
      cdkBuilder.schemaVersionId(schemaVersionId)
    }

    /**
     * A metadata key's corresponding value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-value)
     * @param value A metadata key's corresponding value. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchemaVersionMetadata {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchemaVersionMetadata(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata):
        CfnSchemaVersionMetadata = CfnSchemaVersionMetadata(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaVersionMetadata):
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata = wrapped.cdkObject
  }
}
