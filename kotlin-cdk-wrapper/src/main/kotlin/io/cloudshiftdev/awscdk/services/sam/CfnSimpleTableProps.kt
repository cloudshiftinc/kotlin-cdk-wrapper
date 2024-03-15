@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnSimpleTableProps {
  public fun primaryKey(): Any? = unwrap(this).getPrimaryKey()

  public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun primaryKey(primaryKey: IResolvable)

    public fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ada208fb5cc6f1198cf6abc7fb9ecbad931c6cb65671961f1d0be3573e9f76")
    public fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty.Builder.() -> Unit)

    public fun provisionedThroughput(provisionedThroughput: IResolvable)

    public
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d3cd86b22e2170b95d98b9c4e4867bb98ca342a974d3dc2499235621accc5")
    public
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty.Builder.() -> Unit)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09c2260bcf659b3654d1c01b8d002470949c34457544e45ef06524702fab5d7f")
    public
        fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty.Builder.() -> Unit)

    public fun tableName(tableName: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder =
        software.amazon.awscdk.services.sam.CfnSimpleTableProps.builder()

    override fun primaryKey(primaryKey: IResolvable) {
      cdkBuilder.primaryKey(primaryKey.let(IResolvable::unwrap))
    }

    override fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty) {
      cdkBuilder.primaryKey(primaryKey.let(CfnSimpleTable.PrimaryKeyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ada208fb5cc6f1198cf6abc7fb9ecbad931c6cb65671961f1d0be3573e9f76")
    override fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty.Builder.() -> Unit): Unit
        = primaryKey(CfnSimpleTable.PrimaryKeyProperty(primaryKey))

    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
    }

    override
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(CfnSimpleTable.ProvisionedThroughputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d3cd86b22e2170b95d98b9c4e4867bb98ca342a974d3dc2499235621accc5")
    override
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit =
        provisionedThroughput(CfnSimpleTable.ProvisionedThroughputProperty(provisionedThroughput))

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnSimpleTable.SSESpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09c2260bcf659b3654d1c01b8d002470949c34457544e45ef06524702fab5d7f")
    override
        fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnSimpleTable.SSESpecificationProperty(sseSpecification))

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnSimpleTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTableProps,
  ) : CdkObject(cdkObject), CfnSimpleTableProps {
    override fun primaryKey(): Any? = unwrap(this).getPrimaryKey()

    override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    override fun tableName(): String? = unwrap(this).getTableName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimpleTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTableProps):
        CfnSimpleTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimpleTableProps):
        software.amazon.awscdk.services.sam.CfnSimpleTableProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnSimpleTableProps
  }
}
