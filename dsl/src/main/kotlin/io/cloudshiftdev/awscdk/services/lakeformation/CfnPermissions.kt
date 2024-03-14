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

public open class CfnPermissions internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun dataLakePrincipal(): Any = unwrap(this).getDataLakePrincipal()

  public open fun dataLakePrincipal(`value`: IResolvable) {
    unwrap(this).setDataLakePrincipal(`value`.let(IResolvable::unwrap))
  }

  public open fun dataLakePrincipal(`value`: DataLakePrincipalProperty) {
    unwrap(this).setDataLakePrincipal(`value`.let(DataLakePrincipalProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d420e816ac0fcb72829d752bbe548221af202e6cedcfae5e4dfc0ef9dc3cb0c3")
  public open fun dataLakePrincipal(`value`: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
      dataLakePrincipal(DataLakePrincipalProperty(`value`))

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

  public open fun resource(): Any = unwrap(this).getResource()

  public open fun resource(`value`: IResolvable) {
    unwrap(this).setResource(`value`.let(IResolvable::unwrap))
  }

  public open fun resource(`value`: ResourceProperty) {
    unwrap(this).setResource(`value`.let(ResourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2745a1838854d0f33710243e67527d5459d9d83ad350c997fc118b013f89c28d")
  public open fun resource(`value`: ResourceProperty.Builder.() -> Unit): Unit =
      resource(ResourceProperty(`value`))

  public interface Builder {
    public fun dataLakePrincipal(dataLakePrincipal: IResolvable)

    public fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14d5340514d6def66fd861c1839f5875d5a4725e3ee4ee0a253c952e91bacea")
    public fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty.Builder.() -> Unit)

    public fun permissions(permissions: List<String>)

    public fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>)

    public fun resource(resource: IResolvable)

    public fun resource(resource: ResourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605cb1f3cd7839c0c21f1aa993c8991148c17ab756e86124b7df6f4b51a95609")
    public fun resource(resource: ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnPermissions.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPermissions.Builder.create(scope, id)

    override fun dataLakePrincipal(dataLakePrincipal: IResolvable) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(IResolvable::unwrap))
    }

    override fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(DataLakePrincipalProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14d5340514d6def66fd861c1839f5875d5a4725e3ee4ee0a253c952e91bacea")
    override fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty.Builder.() -> Unit):
        Unit = dataLakePrincipal(DataLakePrincipalProperty(dataLakePrincipal))

    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
      cdkBuilder.permissionsWithGrantOption(permissionsWithGrantOption)
    }

    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    override fun resource(resource: ResourceProperty) {
      cdkBuilder.resource(resource.let(ResourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605cb1f3cd7839c0c21f1aa993c8991148c17ab756e86124b7df6f4b51a95609")
    override fun resource(resource: ResourceProperty.Builder.() -> Unit): Unit =
        resource(ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPermissions =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermissions(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions):
        CfnPermissions = CfnPermissions(cdkObject)

    internal fun unwrap(wrapped: CfnPermissions):
        software.amazon.awscdk.services.lakeformation.CfnPermissions = wrapped.cdkObject
  }

  public interface DatabaseResourceProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty,
    ) : DatabaseResourceProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty):
          DatabaseResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceProperty {
    public fun dataLocationResource(): Any? = unwrap(this).getDataLocationResource()

    public fun databaseResource(): Any? = unwrap(this).getDatabaseResource()

    public fun tableResource(): Any? = unwrap(this).getTableResource()

    public fun tableWithColumnsResource(): Any? = unwrap(this).getTableWithColumnsResource()

    public interface Builder {
      public fun dataLocationResource(dataLocationResource: IResolvable)

      public fun dataLocationResource(dataLocationResource: DataLocationResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6411436c1ea8c4b37d5e2eb166ce9f794b976b9abed98ddb7d28fa0834de706")
      public
          fun dataLocationResource(dataLocationResource: DataLocationResourceProperty.Builder.() -> Unit)

      public fun databaseResource(databaseResource: IResolvable)

      public fun databaseResource(databaseResource: DatabaseResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bf46bb069e66075fa4f807bd800fb94ef2081a1cf7d117522a2f6a777ec7cd8")
      public fun databaseResource(databaseResource: DatabaseResourceProperty.Builder.() -> Unit)

      public fun tableResource(tableResource: IResolvable)

      public fun tableResource(tableResource: TableResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91a4f6b24ed2cda5195e0b77bbdb6caf22ad449f6803374aae8e569a1ec41ee")
      public fun tableResource(tableResource: TableResourceProperty.Builder.() -> Unit)

      public fun tableWithColumnsResource(tableWithColumnsResource: IResolvable)

      public
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0eb048f9c24296bdbd87bd02a8c4ac14dbba3b9e8f258a7b1f22bd63ee1f9fa7")
      public
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty.Builder =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty.builder()

      override fun dataLocationResource(dataLocationResource: IResolvable) {
        cdkBuilder.dataLocationResource(dataLocationResource.let(IResolvable::unwrap))
      }

      override fun dataLocationResource(dataLocationResource: DataLocationResourceProperty) {
        cdkBuilder.dataLocationResource(dataLocationResource.let(DataLocationResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6411436c1ea8c4b37d5e2eb166ce9f794b976b9abed98ddb7d28fa0834de706")
      override
          fun dataLocationResource(dataLocationResource: DataLocationResourceProperty.Builder.() -> Unit):
          Unit = dataLocationResource(DataLocationResourceProperty(dataLocationResource))

      override fun databaseResource(databaseResource: IResolvable) {
        cdkBuilder.databaseResource(databaseResource.let(IResolvable::unwrap))
      }

      override fun databaseResource(databaseResource: DatabaseResourceProperty) {
        cdkBuilder.databaseResource(databaseResource.let(DatabaseResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bf46bb069e66075fa4f807bd800fb94ef2081a1cf7d117522a2f6a777ec7cd8")
      override fun databaseResource(databaseResource: DatabaseResourceProperty.Builder.() -> Unit):
          Unit = databaseResource(DatabaseResourceProperty(databaseResource))

      override fun tableResource(tableResource: IResolvable) {
        cdkBuilder.tableResource(tableResource.let(IResolvable::unwrap))
      }

      override fun tableResource(tableResource: TableResourceProperty) {
        cdkBuilder.tableResource(tableResource.let(TableResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91a4f6b24ed2cda5195e0b77bbdb6caf22ad449f6803374aae8e569a1ec41ee")
      override fun tableResource(tableResource: TableResourceProperty.Builder.() -> Unit): Unit =
          tableResource(TableResourceProperty(tableResource))

      override fun tableWithColumnsResource(tableWithColumnsResource: IResolvable) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource.let(IResolvable::unwrap))
      }

      override
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource.let(TableWithColumnsResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0eb048f9c24296bdbd87bd02a8c4ac14dbba3b9e8f258a7b1f22bd63ee1f9fa7")
      override
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty.Builder.() -> Unit):
          Unit =
          tableWithColumnsResource(TableWithColumnsResourceProperty(tableWithColumnsResource))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty,
    ) : ResourceProperty {
      override fun dataLocationResource(): Any? = unwrap(this).getDataLocationResource()

      override fun databaseResource(): Any? = unwrap(this).getDatabaseResource()

      override fun tableResource(): Any? = unwrap(this).getTableResource()

      override fun tableWithColumnsResource(): Any? = unwrap(this).getTableWithColumnsResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty):
          ResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DataLocationResourceProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun s3Resource(): String? = unwrap(this).getS3Resource()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun s3Resource(s3Resource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun s3Resource(s3Resource: String) {
        cdkBuilder.s3Resource(s3Resource)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty,
    ) : DataLocationResourceProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun s3Resource(): String? = unwrap(this).getS3Resource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataLocationResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty):
          DataLocationResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLocationResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TableWithColumnsResourceProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    public fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun columnNames(columnNames: List<String>)

      public fun columnWildcard(columnWildcard: IResolvable)

      public fun columnWildcard(columnWildcard: ColumnWildcardProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f1f43739d2600a999078da5d18436656f7e2cc0f6858d1846400a1ae88d1945")
      public fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit)

      public fun databaseName(databaseName: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun columnNames(columnNames: List<String>) {
        cdkBuilder.columnNames(columnNames)
      }

      override fun columnWildcard(columnWildcard: IResolvable) {
        cdkBuilder.columnWildcard(columnWildcard.let(IResolvable::unwrap))
      }

      override fun columnWildcard(columnWildcard: ColumnWildcardProperty) {
        cdkBuilder.columnWildcard(columnWildcard.let(ColumnWildcardProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f1f43739d2600a999078da5d18436656f7e2cc0f6858d1846400a1ae88d1945")
      override fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit): Unit =
          columnWildcard(ColumnWildcardProperty(columnWildcard))

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty,
    ) : TableWithColumnsResourceProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

      override fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableWithColumnsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty):
          TableWithColumnsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWithColumnsResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColumnWildcardProperty {
    public fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
        emptyList()

    public interface Builder {
      public fun excludedColumnNames(excludedColumnNames: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty.builder()

      override fun excludedColumnNames(excludedColumnNames: List<String>) {
        cdkBuilder.excludedColumnNames(excludedColumnNames)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty,
    ) : ColumnWildcardProperty {
      override fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnWildcardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty):
          ColumnWildcardProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TableResourceProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun name(): String? = unwrap(this).getName()

    public fun tableWildcard(): Any? = unwrap(this).getTableWildcard()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun name(name: String)

      public fun tableWildcard(tableWildcard: IResolvable)

      public fun tableWildcard(tableWildcard: TableWildcardProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328be344fd6ec36d119d60130993428b05c5bd2d30fb548e31653bcdcdff9f9d")
      public fun tableWildcard(tableWildcard: TableWildcardProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun tableWildcard(tableWildcard: IResolvable) {
        cdkBuilder.tableWildcard(tableWildcard.let(IResolvable::unwrap))
      }

      override fun tableWildcard(tableWildcard: TableWildcardProperty) {
        cdkBuilder.tableWildcard(tableWildcard.let(TableWildcardProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328be344fd6ec36d119d60130993428b05c5bd2d30fb548e31653bcdcdff9f9d")
      override fun tableWildcard(tableWildcard: TableWildcardProperty.Builder.() -> Unit): Unit =
          tableWildcard(TableWildcardProperty(tableWildcard))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty,
    ) : TableResourceProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty):
          TableResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TableWildcardProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty.builder()

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty,
    ) : TableWildcardProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableWildcardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty):
          TableWildcardProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataLakePrincipalProperty {
    public fun dataLakePrincipalIdentifier(): String? =
        unwrap(this).getDataLakePrincipalIdentifier()

    public interface Builder {
      public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty.builder()

      override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty,
    ) : DataLakePrincipalProperty {
      override fun dataLakePrincipalIdentifier(): String? =
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty):
          DataLakePrincipalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
