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

public open class CfnPrincipalPermissions internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrPrincipalIdentifier(): String = unwrap(this).getAttrPrincipalIdentifier()

  public open fun attrResourceIdentifier(): String = unwrap(this).getAttrResourceIdentifier()

  public open fun catalog(): String? = unwrap(this).getCatalog()

  public open fun catalog(`value`: String) {
    unwrap(this).setCatalog(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  public open fun permissions(`value`: List<String>) {
    unwrap(this).setPermissions(`value`)
  }

  public open fun permissionsWithGrantOption(): List<String> =
      unwrap(this).getPermissionsWithGrantOption() ?: emptyList()

  public open fun permissionsWithGrantOption(`value`: List<String>) {
    unwrap(this).setPermissionsWithGrantOption(`value`)
  }

  public open fun principal(): Any = unwrap(this).getPrincipal()

  public open fun principal(`value`: IResolvable) {
    unwrap(this).setPrincipal(`value`.let(IResolvable::unwrap))
  }

  public open fun principal(`value`: DataLakePrincipalProperty) {
    unwrap(this).setPrincipal(`value`.let(DataLakePrincipalProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5b12d2ee943bcdc5bcd4c8f8e88a7bc0a87de2425c867fa4e98da8f13841247")
  public open fun principal(`value`: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
      principal(DataLakePrincipalProperty(`value`))

  public open fun resource(): Any = unwrap(this).getResource()

  public open fun resource(`value`: IResolvable) {
    unwrap(this).setResource(`value`.let(IResolvable::unwrap))
  }

  public open fun resource(`value`: ResourceProperty) {
    unwrap(this).setResource(`value`.let(ResourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("787381cc8c9d8f7e6379e551bab29247bcc52963c3237276eccf246e6b8abfbb")
  public open fun resource(`value`: ResourceProperty.Builder.() -> Unit): Unit =
      resource(ResourceProperty(`value`))

  public interface Builder {
    public fun catalog(catalog: String) {
    }

    public fun permissions(permissions: List<String>) {
    }

    public fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
    }

    public fun principal(principal: IResolvable) {
    }

    public fun principal(principal: DataLakePrincipalProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ada9de85da6a893ceb9189292d0a98668a4322aceecb7431d3cfc1cd81b58517")
    public fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit) {
    }

    public fun resource(resource: IResolvable) {
    }

    public fun resource(resource: ResourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e8ad70521eebb61655507ef9c8bf21f74f4a785b1336b8f2b5c53f809318bed")
    public fun resource(resource: ResourceProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.Builder.create(scope,
        id)

    public override fun catalog(catalog: String) {
      cdkBuilder.catalog(catalog)
    }

    public override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    public override fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
      cdkBuilder.permissionsWithGrantOption(permissionsWithGrantOption)
    }

    public override fun principal(principal: IResolvable) {
      cdkBuilder.principal(principal.let(IResolvable::unwrap))
    }

    public override fun principal(principal: DataLakePrincipalProperty) {
      cdkBuilder.principal(principal.let(DataLakePrincipalProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ada9de85da6a893ceb9189292d0a98668a4322aceecb7431d3cfc1cd81b58517")
    public override fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
        principal(DataLakePrincipalProperty(principal))

    public override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    public override fun resource(resource: ResourceProperty) {
      cdkBuilder.resource(resource.let(ResourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e8ad70521eebb61655507ef9c8bf21f74f4a785b1336b8f2b5c53f809318bed")
    public override fun resource(resource: ResourceProperty.Builder.() -> Unit): Unit =
        resource(ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrincipalPermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrincipalPermissions(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions):
        CfnPrincipalPermissions = CfnPrincipalPermissions(cdkObject)

    internal fun unwrap(wrapped: CfnPrincipalPermissions):
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions = wrapped.cdkObject
  }

  public interface ResourceProperty {
    public fun catalog(): Any? = unwrap(this).getCatalog()

    public fun dataCellsFilter(): Any? = unwrap(this).getDataCellsFilter()

    public fun dataLocation(): Any? = unwrap(this).getDataLocation()

    public fun database(): Any? = unwrap(this).getDatabase()

    public fun lfTag(): Any? = unwrap(this).getLfTag()

    public fun lfTagPolicy(): Any? = unwrap(this).getLfTagPolicy()

    public fun table(): Any? = unwrap(this).getTable()

    public fun tableWithColumns(): Any? = unwrap(this).getTableWithColumns()

    public interface Builder {
      public fun catalog(catalog: Any) {
      }

      public fun dataCellsFilter(dataCellsFilter: IResolvable) {
      }

      public fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("214f04098257eade207ce95738dd89ae45720eed005e04929106480571dbf4a3")
      public
          fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty.Builder.() -> Unit) {
      }

      public fun dataLocation(dataLocation: IResolvable) {
      }

      public fun dataLocation(dataLocation: DataLocationResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7b4189fe1269e009c363138ef33cb5e5b1a0ceb7590abade6833e9511b923a9")
      public fun dataLocation(dataLocation: DataLocationResourceProperty.Builder.() -> Unit) {
      }

      public fun database(database: IResolvable) {
      }

      public fun database(database: DatabaseResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9178c566a6b0e2f38e909d226ef8ee536c735477b7bb2850f24587b92e3994c")
      public fun database(database: DatabaseResourceProperty.Builder.() -> Unit) {
      }

      public fun lfTag(lfTag: IResolvable) {
      }

      public fun lfTag(lfTag: LFTagKeyResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9063595a464c4850bf8fb02619ca7219d953c8e0863d3da41fc189880be8b10d")
      public fun lfTag(lfTag: LFTagKeyResourceProperty.Builder.() -> Unit) {
      }

      public fun lfTagPolicy(lfTagPolicy: IResolvable) {
      }

      public fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e7fbdb2b7dbf0e67b4e4467adb58fce79882b5f0045c739c4d75f5326b5bb21")
      public fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty.Builder.() -> Unit) {
      }

      public fun table(table: IResolvable) {
      }

      public fun table(table: TableResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36417835e8a5689f515c4ced639994f9578a56d03631f8db9e7dc0316bf5e613")
      public fun table(table: TableResourceProperty.Builder.() -> Unit) {
      }

      public fun tableWithColumns(tableWithColumns: IResolvable) {
      }

      public fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e4893b877fcfc70d7d8b3a0774a35e0f6ac5d636a9becbdab0e51e8b38f5432")
      public
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty.builder()

      public override fun catalog(catalog: Any) {
        cdkBuilder.catalog(catalog)
      }

      public override fun dataCellsFilter(dataCellsFilter: IResolvable) {
        cdkBuilder.dataCellsFilter(dataCellsFilter.let(IResolvable::unwrap))
      }

      public override fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty) {
        cdkBuilder.dataCellsFilter(dataCellsFilter.let(DataCellsFilterResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("214f04098257eade207ce95738dd89ae45720eed005e04929106480571dbf4a3")
      public override
          fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty.Builder.() -> Unit):
          Unit = dataCellsFilter(DataCellsFilterResourceProperty(dataCellsFilter))

      public override fun dataLocation(dataLocation: IResolvable) {
        cdkBuilder.dataLocation(dataLocation.let(IResolvable::unwrap))
      }

      public override fun dataLocation(dataLocation: DataLocationResourceProperty) {
        cdkBuilder.dataLocation(dataLocation.let(DataLocationResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7b4189fe1269e009c363138ef33cb5e5b1a0ceb7590abade6833e9511b923a9")
      public override
          fun dataLocation(dataLocation: DataLocationResourceProperty.Builder.() -> Unit): Unit =
          dataLocation(DataLocationResourceProperty(dataLocation))

      public override fun database(database: IResolvable) {
        cdkBuilder.database(database.let(IResolvable::unwrap))
      }

      public override fun database(database: DatabaseResourceProperty) {
        cdkBuilder.database(database.let(DatabaseResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9178c566a6b0e2f38e909d226ef8ee536c735477b7bb2850f24587b92e3994c")
      public override fun database(database: DatabaseResourceProperty.Builder.() -> Unit): Unit =
          database(DatabaseResourceProperty(database))

      public override fun lfTag(lfTag: IResolvable) {
        cdkBuilder.lfTag(lfTag.let(IResolvable::unwrap))
      }

      public override fun lfTag(lfTag: LFTagKeyResourceProperty) {
        cdkBuilder.lfTag(lfTag.let(LFTagKeyResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9063595a464c4850bf8fb02619ca7219d953c8e0863d3da41fc189880be8b10d")
      public override fun lfTag(lfTag: LFTagKeyResourceProperty.Builder.() -> Unit): Unit =
          lfTag(LFTagKeyResourceProperty(lfTag))

      public override fun lfTagPolicy(lfTagPolicy: IResolvable) {
        cdkBuilder.lfTagPolicy(lfTagPolicy.let(IResolvable::unwrap))
      }

      public override fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty) {
        cdkBuilder.lfTagPolicy(lfTagPolicy.let(LFTagPolicyResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e7fbdb2b7dbf0e67b4e4467adb58fce79882b5f0045c739c4d75f5326b5bb21")
      public override fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty.Builder.() -> Unit):
          Unit = lfTagPolicy(LFTagPolicyResourceProperty(lfTagPolicy))

      public override fun table(table: IResolvable) {
        cdkBuilder.table(table.let(IResolvable::unwrap))
      }

      public override fun table(table: TableResourceProperty) {
        cdkBuilder.table(table.let(TableResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36417835e8a5689f515c4ced639994f9578a56d03631f8db9e7dc0316bf5e613")
      public override fun table(table: TableResourceProperty.Builder.() -> Unit): Unit =
          table(TableResourceProperty(table))

      public override fun tableWithColumns(tableWithColumns: IResolvable) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(IResolvable::unwrap))
      }

      public override fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(TableWithColumnsResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e4893b877fcfc70d7d8b3a0774a35e0f6ac5d636a9becbdab0e51e8b38f5432")
      public override
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit):
          Unit = tableWithColumns(TableWithColumnsResourceProperty(tableWithColumns))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty,
    ) : ResourceProperty {
      public override fun catalog(): Any? = unwrap(this).getCatalog()

      public override fun dataCellsFilter(): Any? = unwrap(this).getDataCellsFilter()

      public override fun dataLocation(): Any? = unwrap(this).getDataLocation()

      public override fun database(): Any? = unwrap(this).getDatabase()

      public override fun lfTag(): Any? = unwrap(this).getLfTag()

      public override fun lfTagPolicy(): Any? = unwrap(this).getLfTagPolicy()

      public override fun table(): Any? = unwrap(this).getTable()

      public override fun tableWithColumns(): Any? = unwrap(this).getTableWithColumns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty):
          ResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataLocationResourceProperty {
    public fun catalogId(): String

    public fun resourceArn(): String

    public interface Builder {
      public fun catalogId(catalogId: String) {
      }

      public fun resourceArn(resourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty.builder()

      public override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty,
    ) : DataLocationResourceProperty {
      public override fun catalogId(): String = unwrap(this).getCatalogId()

      public override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataLocationResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty):
          DataLocationResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLocationResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataCellsFilterResourceProperty {
    public fun databaseName(): String

    public fun name(): String

    public fun tableCatalogId(): String

    public fun tableName(): String

    public interface Builder {
      public fun databaseName(databaseName: String) {
      }

      public fun name(name: String) {
      }

      public fun tableCatalogId(tableCatalogId: String) {
      }

      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty.builder()

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun tableCatalogId(tableCatalogId: String) {
        cdkBuilder.tableCatalogId(tableCatalogId)
      }

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty,
    ) : DataCellsFilterResourceProperty {
      public override fun databaseName(): String = unwrap(this).getDatabaseName()

      public override fun name(): String = unwrap(this).getName()

      public override fun tableCatalogId(): String = unwrap(this).getTableCatalogId()

      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataCellsFilterResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty):
          DataCellsFilterResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCellsFilterResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TableWithColumnsResourceProperty {
    public fun catalogId(): String

    public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    public fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

    public fun databaseName(): String

    public fun name(): String

    public interface Builder {
      public fun catalogId(catalogId: String) {
      }

      public fun columnNames(columnNames: List<String>) {
      }

      public fun columnWildcard(columnWildcard: IResolvable) {
      }

      public fun columnWildcard(columnWildcard: ColumnWildcardProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fb7005c47af5b8bd04299f7cb2a0e2fce1bf66c6e464fbe689c31bacf0605ab")
      public fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit) {
      }

      public fun databaseName(databaseName: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty.builder()

      public override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      public override fun columnNames(columnNames: List<String>) {
        cdkBuilder.columnNames(columnNames)
      }

      public override fun columnWildcard(columnWildcard: IResolvable) {
        cdkBuilder.columnWildcard(columnWildcard.let(IResolvable::unwrap))
      }

      public override fun columnWildcard(columnWildcard: ColumnWildcardProperty) {
        cdkBuilder.columnWildcard(columnWildcard.let(ColumnWildcardProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fb7005c47af5b8bd04299f7cb2a0e2fce1bf66c6e464fbe689c31bacf0605ab")
      public override fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit):
          Unit = columnWildcard(ColumnWildcardProperty(columnWildcard))

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty,
    ) : TableWithColumnsResourceProperty {
      public override fun catalogId(): String = unwrap(this).getCatalogId()

      public override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

      public override fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

      public override fun databaseName(): String = unwrap(this).getDatabaseName()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableWithColumnsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty):
          TableWithColumnsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWithColumnsResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataLakePrincipalProperty {
    public fun dataLakePrincipalIdentifier(): String? =
        unwrap(this).getDataLakePrincipalIdentifier()

    public interface Builder {
      public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty.builder()

      public override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty,
    ) : DataLakePrincipalProperty {
      public override fun dataLakePrincipalIdentifier(): String? =
          unwrap(this).getDataLakePrincipalIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataLakePrincipalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty):
          DataLakePrincipalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LFTagKeyResourceProperty {
    public fun catalogId(): String

    public fun tagKey(): String

    public fun tagValues(): List<String>

    public interface Builder {
      public fun catalogId(catalogId: String) {
      }

      public fun tagKey(tagKey: String) {
      }

      public fun tagValues(tagValues: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty.builder()

      public override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      public override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      public override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty,
    ) : LFTagKeyResourceProperty {
      public override fun catalogId(): String = unwrap(this).getCatalogId()

      public override fun tagKey(): String = unwrap(this).getTagKey()

      public override fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagKeyResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty):
          LFTagKeyResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagKeyResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LFTagPolicyResourceProperty {
    public fun catalogId(): String

    public fun expression(): Any

    public fun resourceType(): String

    public interface Builder {
      public fun catalogId(catalogId: String) {
      }

      public fun expression(expression: IResolvable) {
      }

      public fun expression(expression: List<Any>) {
      }

      public fun resourceType(resourceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty.builder()

      public override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      public override fun expression(expression: IResolvable) {
        cdkBuilder.expression(expression.let(IResolvable::unwrap))
      }

      public override fun expression(expression: List<Any>) {
        cdkBuilder.expression(expression)
      }

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty,
    ) : LFTagPolicyResourceProperty {
      public override fun catalogId(): String = unwrap(this).getCatalogId()

      public override fun expression(): Any = unwrap(this).getExpression()

      public override fun resourceType(): String = unwrap(this).getResourceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagPolicyResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty):
          LFTagPolicyResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagPolicyResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColumnWildcardProperty {
    public fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
        emptyList()

    public interface Builder {
      public fun excludedColumnNames(excludedColumnNames: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty.builder()

      public override fun excludedColumnNames(excludedColumnNames: List<String>) {
        cdkBuilder.excludedColumnNames(excludedColumnNames)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty,
    ) : ColumnWildcardProperty {
      public override fun excludedColumnNames(): List<String> =
          unwrap(this).getExcludedColumnNames() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnWildcardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty):
          ColumnWildcardProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TableResourceProperty {
    public fun catalogId(): String

    public fun databaseName(): String

    public fun name(): String? = unwrap(this).getName()

    public fun tableWildcard(): Any? = unwrap(this).getTableWildcard()

    public interface Builder {
      public fun catalogId(catalogId: String) {
      }

      public fun databaseName(databaseName: String) {
      }

      public fun name(name: String) {
      }

      public fun tableWildcard(tableWildcard: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty.builder()

      public override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun tableWildcard(tableWildcard: Any) {
        cdkBuilder.tableWildcard(tableWildcard)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty,
    ) : TableResourceProperty {
      public override fun catalogId(): String = unwrap(this).getCatalogId()

      public override fun databaseName(): String = unwrap(this).getDatabaseName()

      public override fun name(): String? = unwrap(this).getName()

      public override fun tableWildcard(): Any? = unwrap(this).getTableWildcard()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty):
          TableResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatabaseResourceProperty {
    public fun catalogId(): String

    public fun name(): String

    public interface Builder {
      public fun catalogId(catalogId: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty.builder()

      public override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty,
    ) : DatabaseResourceProperty {
      public override fun catalogId(): String = unwrap(this).getCatalogId()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty):
          DatabaseResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LFTagProperty {
    public fun tagKey(): String? = unwrap(this).getTagKey()

    public fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()

    public interface Builder {
      public fun tagKey(tagKey: String) {
      }

      public fun tagValues(tagValues: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty.builder()

      public override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      public override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty,
    ) : LFTagProperty {
      public override fun tagKey(): String? = unwrap(this).getTagKey()

      public override fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty):
          LFTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
