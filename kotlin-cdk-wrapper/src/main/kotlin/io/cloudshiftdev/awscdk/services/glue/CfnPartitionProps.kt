@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnPartitionProps {
  public fun catalogId(): String

  public fun databaseName(): String

  public fun partitionInput(): Any

  public fun tableName(): String

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseName(databaseName: String)

    public fun partitionInput(partitionInput: IResolvable)

    public fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7fb63a1e6bd1063f61e880e0f8702da56a48e29efeba0399d5ba9038f14d0ad")
    public
        fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty.Builder.() -> Unit)

    public fun tableName(tableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnPartitionProps.Builder =
        software.amazon.awscdk.services.glue.CfnPartitionProps.builder()

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun partitionInput(partitionInput: IResolvable) {
      cdkBuilder.partitionInput(partitionInput.let(IResolvable::unwrap))
    }

    override fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty) {
      cdkBuilder.partitionInput(partitionInput.let(CfnPartition.PartitionInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7fb63a1e6bd1063f61e880e0f8702da56a48e29efeba0399d5ba9038f14d0ad")
    override
        fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty.Builder.() -> Unit):
        Unit = partitionInput(CfnPartition.PartitionInputProperty(partitionInput))

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnPartitionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnPartitionProps,
  ) : CdkObject(cdkObject), CfnPartitionProps {
    override fun catalogId(): String = unwrap(this).getCatalogId()

    override fun databaseName(): String = unwrap(this).getDatabaseName()

    override fun partitionInput(): Any = unwrap(this).getPartitionInput()

    override fun tableName(): String = unwrap(this).getTableName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPartitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartitionProps):
        CfnPartitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPartitionProps):
        software.amazon.awscdk.services.glue.CfnPartitionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnPartitionProps
  }
}
