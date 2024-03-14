package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchemaVersionMetadata internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun key(): String = unwrap(this).getKey()

  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  public open fun schemaVersionId(): String = unwrap(this).getSchemaVersionId()

  public open fun schemaVersionId(`value`: String) {
    unwrap(this).setSchemaVersionId(`value`)
  }

  public open fun `value`(): String = unwrap(this).getValue()

  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  public interface Builder {
    public fun key(key: String)

    public fun schemaVersionId(schemaVersionId: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata.Builder.create(scope, id)

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun schemaVersionId(schemaVersionId: String) {
      cdkBuilder.schemaVersionId(schemaVersionId)
    }

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
