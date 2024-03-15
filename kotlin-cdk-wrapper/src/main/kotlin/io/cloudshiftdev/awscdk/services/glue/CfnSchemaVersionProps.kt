@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSchemaVersionProps {
  public fun schema(): Any

  public fun schemaDefinition(): String

  @CdkDslMarker
  public interface Builder {
    public fun schema(schema: IResolvable)

    public fun schema(schema: CfnSchemaVersion.SchemaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83796bc7f21f15f0d11e20c3cc8e5b369d4915e9a06eb63940b744449dc6475e")
    public fun schema(schema: CfnSchemaVersion.SchemaProperty.Builder.() -> Unit)

    public fun schemaDefinition(schemaDefinition: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaVersionProps.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaVersionProps.builder()

    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    override fun schema(schema: CfnSchemaVersion.SchemaProperty) {
      cdkBuilder.schema(schema.let(CfnSchemaVersion.SchemaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83796bc7f21f15f0d11e20c3cc8e5b369d4915e9a06eb63940b744449dc6475e")
    override fun schema(schema: CfnSchemaVersion.SchemaProperty.Builder.() -> Unit): Unit =
        schema(CfnSchemaVersion.SchemaProperty(schema))

    override fun schemaDefinition(schemaDefinition: String) {
      cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionProps,
  ) : CdkObject(cdkObject), CfnSchemaVersionProps {
    override fun schema(): Any = unwrap(this).getSchema()

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
