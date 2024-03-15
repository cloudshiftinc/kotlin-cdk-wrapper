@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSchemaVersionMetadataProps {
  public fun key(): String

  public fun schemaVersionId(): String

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun key(key: String)

    public fun schemaVersionId(schemaVersionId: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps.builder()

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun schemaVersionId(schemaVersionId: String) {
      cdkBuilder.schemaVersionId(schemaVersionId)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps,
  ) : CdkObject(cdkObject), CfnSchemaVersionMetadataProps {
    override fun key(): String = unwrap(this).getKey()

    override fun schemaVersionId(): String = unwrap(this).getSchemaVersionId()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaVersionMetadataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps):
        CfnSchemaVersionMetadataProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaVersionMetadataProps):
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps
  }
}
