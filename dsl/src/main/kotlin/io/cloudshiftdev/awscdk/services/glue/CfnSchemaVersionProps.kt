package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSchemaVersionProps {
  /**
   * The schema that includes the schema version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
   */
  public fun schema(): Any

  /**
   * The schema definition for the schema version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schemadefinition)
   */
  public fun schemaDefinition(): String

  /**
   * A builder for [CfnSchemaVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param schema The schema that includes the schema version. 
     */
    public fun schema(schema: IResolvable)

    /**
     * @param schema The schema that includes the schema version. 
     */
    public fun schema(schema: CfnSchemaVersion.SchemaProperty)

    /**
     * @param schema The schema that includes the schema version. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83796bc7f21f15f0d11e20c3cc8e5b369d4915e9a06eb63940b744449dc6475e")
    public fun schema(schema: CfnSchemaVersion.SchemaProperty.Builder.() -> Unit)

    /**
     * @param schemaDefinition The schema definition for the schema version. 
     */
    public fun schemaDefinition(schemaDefinition: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaVersionProps.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaVersionProps.builder()

    /**
     * @param schema The schema that includes the schema version. 
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    /**
     * @param schema The schema that includes the schema version. 
     */
    override fun schema(schema: CfnSchemaVersion.SchemaProperty) {
      cdkBuilder.schema(schema.let(CfnSchemaVersion.SchemaProperty::unwrap))
    }

    /**
     * @param schema The schema that includes the schema version. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83796bc7f21f15f0d11e20c3cc8e5b369d4915e9a06eb63940b744449dc6475e")
    override fun schema(schema: CfnSchemaVersion.SchemaProperty.Builder.() -> Unit): Unit =
        schema(CfnSchemaVersion.SchemaProperty(schema))

    /**
     * @param schemaDefinition The schema definition for the schema version. 
     */
    override fun schemaDefinition(schemaDefinition: String) {
      cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionProps,
  ) : CdkObject(cdkObject), CfnSchemaVersionProps {
    /**
     * The schema that includes the schema version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
     */
    override fun schema(): Any = unwrap(this).getSchema()

    /**
     * The schema definition for the schema version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schemadefinition)
     */
    override fun schemaDefinition(): String = unwrap(this).getSchemaDefinition()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionProps):
        CfnSchemaVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaVersionProps):
        software.amazon.awscdk.services.glue.CfnSchemaVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnSchemaVersionProps
  }
}
