@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTableProps {
  public fun databaseName(): String

  public fun magneticStoreWriteProperties(): Any? = unwrap(this).getMagneticStoreWriteProperties()

  public fun retentionProperties(): Any? = unwrap(this).getRetentionProperties()

  public fun schema(): Any? = unwrap(this).getSchema()

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun databaseName(databaseName: String)

    public fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any)

    public fun retentionProperties(retentionProperties: Any)

    public fun schema(schema: IResolvable)

    public fun schema(schema: CfnTable.SchemaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e176944cdf0bff481d12f798cfd78751404a6c0f4c0775b4cb5734d216f21777")
    public fun schema(schema: CfnTable.SchemaProperty.Builder.() -> Unit)

    public fun tableName(tableName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnTableProps.Builder =
        software.amazon.awscdk.services.timestream.CfnTableProps.builder()

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
      cdkBuilder.magneticStoreWriteProperties(magneticStoreWriteProperties)
    }

    override fun retentionProperties(retentionProperties: Any) {
      cdkBuilder.retentionProperties(retentionProperties)
    }

    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    override fun schema(schema: CfnTable.SchemaProperty) {
      cdkBuilder.schema(schema.let(CfnTable.SchemaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e176944cdf0bff481d12f798cfd78751404a6c0f4c0775b4cb5734d216f21777")
    override fun schema(schema: CfnTable.SchemaProperty.Builder.() -> Unit): Unit =
        schema(CfnTable.SchemaProperty(schema))

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.timestream.CfnTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.timestream.CfnTableProps,
  ) : CdkObject(cdkObject), CfnTableProps {
    override fun databaseName(): String = unwrap(this).getDatabaseName()

    override fun magneticStoreWriteProperties(): Any? =
        unwrap(this).getMagneticStoreWriteProperties()

    override fun retentionProperties(): Any? = unwrap(this).getRetentionProperties()

    override fun schema(): Any? = unwrap(this).getSchema()

    override fun tableName(): String? = unwrap(this).getTableName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTableProps):
        CfnTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps):
        software.amazon.awscdk.services.timestream.CfnTableProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.timestream.CfnTableProps
  }
}
