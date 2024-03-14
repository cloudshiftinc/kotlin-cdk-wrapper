package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface LocalSecondaryIndexProps : SecondaryIndexProps {
  public fun sortKey(): Attribute

  public interface Builder {
    public fun indexName(indexName: String)

    public fun nonKeyAttributes(nonKeyAttributes: List<String>)

    public fun nonKeyAttributes(vararg nonKeyAttributes: String)

    public fun projectionType(projectionType: ProjectionType)

    public fun sortKey(sortKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c886d09806679b298f25bbf7fdda5a00deacee4c6bfe47a743ab2e6aaa13058c")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder =
        software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.builder()

    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
      cdkBuilder.nonKeyAttributes(nonKeyAttributes)
    }

    override fun nonKeyAttributes(vararg nonKeyAttributes: String): Unit =
        nonKeyAttributes(nonKeyAttributes.toList())

    override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c886d09806679b298f25bbf7fdda5a00deacee4c6bfe47a743ab2e6aaa13058c")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    public fun build(): software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps,
  ) : LocalSecondaryIndexProps {
    override fun indexName(): String = unwrap(this).getIndexName()

    override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
        emptyList()

    override fun projectionType(): ProjectionType? =
        unwrap(this).getProjectionType()?.let(ProjectionType::wrap)

    override fun sortKey(): Attribute = unwrap(this).getSortKey().let(Attribute::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LocalSecondaryIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps):
        LocalSecondaryIndexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LocalSecondaryIndexProps):
        software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps = (wrapped as
        Wrapper).cdkObject
  }
}
