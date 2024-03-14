package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTagAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrResourceIdentifier(): String = unwrap(this).getAttrResourceIdentifier()

  public open fun attrTagsIdentifier(): String = unwrap(this).getAttrTagsIdentifier()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lfTags(): Any = unwrap(this).getLfTags()

  public open fun lfTags(`value`: IResolvable) {
    unwrap(this).setLfTags(`value`.let(IResolvable::unwrap))
  }

  public open fun lfTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setLfTags(__idx_ac66f0)
  }

  public open fun lfTags(vararg __idx_ac66f0: Any): Unit = lfTags(__idx_ac66f0.toList())

  public open fun resource(): Any = unwrap(this).getResource()

  public open fun resource(`value`: IResolvable) {
    unwrap(this).setResource(`value`.let(IResolvable::unwrap))
  }

  public open fun resource(`value`: ResourceProperty) {
    unwrap(this).setResource(`value`.let(ResourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cccb07ab6492bcc0b5b63d4931c7013cd14fcbf6b0e06abd4bb6d3a782074288")
  public open fun resource(`value`: ResourceProperty.Builder.() -> Unit): Unit =
      resource(ResourceProperty(`value`))

  public interface Builder {
    public fun lfTags(lfTags: IResolvable)

    public fun lfTags(lfTags: List<Any>)

    public fun lfTags(vararg lfTags: Any)

    public fun resource(resource: IResolvable)

    public fun resource(resource: ResourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94892b7ca3d7baf8fb6d41c4ebbb0d927fa34d8552a92ec08081dc4c04bd9cde")
    public fun resource(resource: ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.Builder
        = software.amazon.awscdk.services.lakeformation.CfnTagAssociation.Builder.create(scope, id)

    override fun lfTags(lfTags: IResolvable) {
      cdkBuilder.lfTags(lfTags.let(IResolvable::unwrap))
    }

    override fun lfTags(lfTags: List<Any>) {
      cdkBuilder.lfTags(lfTags)
    }

    override fun lfTags(vararg lfTags: Any): Unit = lfTags(lfTags.toList())

    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    override fun resource(resource: ResourceProperty) {
      cdkBuilder.resource(resource.let(ResourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94892b7ca3d7baf8fb6d41c4ebbb0d927fa34d8552a92ec08081dc4c04bd9cde")
    override fun resource(resource: ResourceProperty.Builder.() -> Unit): Unit =
        resource(ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTagAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTagAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTagAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation):
        CfnTagAssociation = CfnTagAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnTagAssociation):
        software.amazon.awscdk.services.lakeformation.CfnTagAssociation = wrapped.cdkObject
  }

  public interface ResourceProperty {
    public fun catalog(): Any? = unwrap(this).getCatalog()

    public fun database(): Any? = unwrap(this).getDatabase()

    public fun table(): Any? = unwrap(this).getTable()

    public fun tableWithColumns(): Any? = unwrap(this).getTableWithColumns()

    public interface Builder {
      public fun catalog(catalog: Any)

      public fun database(database: IResolvable)

      public fun database(database: DatabaseResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97176c28c0e94cb42304507c85985874dcaebccbb3157e601c84f47a1b83b608")
      public fun database(database: DatabaseResourceProperty.Builder.() -> Unit)

      public fun table(table: IResolvable)

      public fun table(table: TableResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222f937de1b3ea7ce39f737cd3d76c9d79c51727be76d73727495101f8d808d4")
      public fun table(table: TableResourceProperty.Builder.() -> Unit)

      public fun tableWithColumns(tableWithColumns: IResolvable)

      public fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4db238db16749c277996565207f773ff92a79866045d6c0b2cb4ecb6d5008c3f")
      public
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty.Builder =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty.builder()

      override fun catalog(catalog: Any) {
        cdkBuilder.catalog(catalog)
      }

      override fun database(database: IResolvable) {
        cdkBuilder.database(database.let(IResolvable::unwrap))
      }

      override fun database(database: DatabaseResourceProperty) {
        cdkBuilder.database(database.let(DatabaseResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97176c28c0e94cb42304507c85985874dcaebccbb3157e601c84f47a1b83b608")
      override fun database(database: DatabaseResourceProperty.Builder.() -> Unit): Unit =
          database(DatabaseResourceProperty(database))

      override fun table(table: IResolvable) {
        cdkBuilder.table(table.let(IResolvable::unwrap))
      }

      override fun table(table: TableResourceProperty) {
        cdkBuilder.table(table.let(TableResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222f937de1b3ea7ce39f737cd3d76c9d79c51727be76d73727495101f8d808d4")
      override fun table(table: TableResourceProperty.Builder.() -> Unit): Unit =
          table(TableResourceProperty(table))

      override fun tableWithColumns(tableWithColumns: IResolvable) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(IResolvable::unwrap))
      }

      override fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(TableWithColumnsResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4db238db16749c277996565207f773ff92a79866045d6c0b2cb4ecb6d5008c3f")
      override
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit):
          Unit = tableWithColumns(TableWithColumnsResourceProperty(tableWithColumns))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty,
    ) : ResourceProperty {
      override fun catalog(): Any? = unwrap(this).getCatalog()

      override fun database(): Any? = unwrap(this).getDatabase()

      override fun table(): Any? = unwrap(this).getTable()

      override fun tableWithColumns(): Any? = unwrap(this).getTableWithColumns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty):
          ResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatabaseResourceProperty {
    public fun catalogId(): String

    public fun name(): String

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty,
    ) : DatabaseResourceProperty {
      override fun catalogId(): String = unwrap(this).getCatalogId()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty):
          DatabaseResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TableWithColumnsResourceProperty {
    public fun catalogId(): String

    public fun columnNames(): List<String>

    public fun databaseName(): String

    public fun name(): String

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun columnNames(columnNames: List<String>)

      public fun columnNames(vararg columnNames: String)

      public fun databaseName(databaseName: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun columnNames(columnNames: List<String>) {
        cdkBuilder.columnNames(columnNames)
      }

      override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty,
    ) : TableWithColumnsResourceProperty {
      override fun catalogId(): String = unwrap(this).getCatalogId()

      override fun columnNames(): List<String> = unwrap(this).getColumnNames()

      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableWithColumnsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty):
          TableWithColumnsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWithColumnsResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LFTagPairProperty {
    public fun catalogId(): String

    public fun tagKey(): String

    public fun tagValues(): List<String>

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun tagKey(tagKey: String)

      public fun tagValues(tagValues: List<String>)

      public fun tagValues(vararg tagValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty,
    ) : LFTagPairProperty {
      override fun catalogId(): String = unwrap(this).getCatalogId()

      override fun tagKey(): String = unwrap(this).getTagKey()

      override fun tagValues(): List<String> = unwrap(this).getTagValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagPairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty):
          LFTagPairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagPairProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TableResourceProperty {
    public fun catalogId(): String

    public fun databaseName(): String

    public fun name(): String? = unwrap(this).getName()

    public fun tableWildcard(): Any? = unwrap(this).getTableWildcard()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun name(name: String)

      public fun tableWildcard(tableWildcard: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun tableWildcard(tableWildcard: Any) {
        cdkBuilder.tableWildcard(tableWildcard)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty,
    ) : TableResourceProperty {
      override fun catalogId(): String = unwrap(this).getCatalogId()

      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun name(): String? = unwrap(this).getName()

      override fun tableWildcard(): Any? = unwrap(this).getTableWildcard()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty):
          TableResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
