package io.cloudshiftdev.awscdk.services.glue

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

public open class CfnDatabase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnDatabase,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun catalogId(): String = unwrap(this).getCatalogId()

  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  public open fun databaseInput(): Any = unwrap(this).getDatabaseInput()

  public open fun databaseInput(`value`: IResolvable) {
    unwrap(this).setDatabaseInput(`value`.let(IResolvable::unwrap))
  }

  public open fun databaseInput(`value`: DatabaseInputProperty) {
    unwrap(this).setDatabaseInput(`value`.let(DatabaseInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8910c3394f6c7c10c51245acf8628f28a9c05a0d326653d4f1b02aefff064f81")
  public open fun databaseInput(`value`: DatabaseInputProperty.Builder.() -> Unit): Unit =
      databaseInput(DatabaseInputProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun catalogId(catalogId: String) {
    }

    public fun databaseInput(databaseInput: IResolvable) {
    }

    public fun databaseInput(databaseInput: DatabaseInputProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("977dcab4f4d2d0a2cf36d1e9a7b5532875b1237f2589a2f57b19100e301a879b")
    public fun databaseInput(databaseInput: DatabaseInputProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDatabase.Builder =
        software.amazon.awscdk.services.glue.CfnDatabase.Builder.create(scope, id)

    public override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    public override fun databaseInput(databaseInput: IResolvable) {
      cdkBuilder.databaseInput(databaseInput.let(IResolvable::unwrap))
    }

    public override fun databaseInput(databaseInput: DatabaseInputProperty) {
      cdkBuilder.databaseInput(databaseInput.let(DatabaseInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("977dcab4f4d2d0a2cf36d1e9a7b5532875b1237f2589a2f57b19100e301a879b")
    public override fun databaseInput(databaseInput: DatabaseInputProperty.Builder.() -> Unit): Unit
        = databaseInput(DatabaseInputProperty(databaseInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnDatabase = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatabase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatabase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase): CfnDatabase =
        CfnDatabase(cdkObject)

    internal fun unwrap(wrapped: CfnDatabase): software.amazon.awscdk.services.glue.CfnDatabase =
        wrapped.cdkObject
  }

  public interface DatabaseInputProperty {
    public fun createTableDefaultPermissions(): Any? =
        unwrap(this).getCreateTableDefaultPermissions()

    public fun description(): String? = unwrap(this).getDescription()

    public fun federatedDatabase(): Any? = unwrap(this).getFederatedDatabase()

    public fun locationUri(): String? = unwrap(this).getLocationUri()

    public fun name(): String? = unwrap(this).getName()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun targetDatabase(): Any? = unwrap(this).getTargetDatabase()

    public interface Builder {
      public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
      }

      public fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>) {
      }

      public fun description(description: String) {
      }

      public fun federatedDatabase(federatedDatabase: IResolvable) {
      }

      public fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b65ff7c8b03e9b65250939a9639ccc40f86571e64b8ca5ca97272767ae23b00")
      public
          fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty.Builder.() -> Unit) {
      }

      public fun locationUri(locationUri: String) {
      }

      public fun name(name: String) {
      }

      public fun parameters(parameters: Any) {
      }

      public fun targetDatabase(targetDatabase: IResolvable) {
      }

      public fun targetDatabase(targetDatabase: DatabaseIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8343aa203b412577f62ae7a45c499c1c61ea101c62145d4fd2f7b75aaecf2792")
      public fun targetDatabase(targetDatabase: DatabaseIdentifierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty.builder()

      public override
          fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions.let(IResolvable::unwrap))
      }

      public override fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun federatedDatabase(federatedDatabase: IResolvable) {
        cdkBuilder.federatedDatabase(federatedDatabase.let(IResolvable::unwrap))
      }

      public override fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty) {
        cdkBuilder.federatedDatabase(federatedDatabase.let(FederatedDatabaseProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b65ff7c8b03e9b65250939a9639ccc40f86571e64b8ca5ca97272767ae23b00")
      public override
          fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty.Builder.() -> Unit):
          Unit = federatedDatabase(FederatedDatabaseProperty(federatedDatabase))

      public override fun locationUri(locationUri: String) {
        cdkBuilder.locationUri(locationUri)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      public override fun targetDatabase(targetDatabase: IResolvable) {
        cdkBuilder.targetDatabase(targetDatabase.let(IResolvable::unwrap))
      }

      public override fun targetDatabase(targetDatabase: DatabaseIdentifierProperty) {
        cdkBuilder.targetDatabase(targetDatabase.let(DatabaseIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8343aa203b412577f62ae7a45c499c1c61ea101c62145d4fd2f7b75aaecf2792")
      public override
          fun targetDatabase(targetDatabase: DatabaseIdentifierProperty.Builder.() -> Unit): Unit =
          targetDatabase(DatabaseIdentifierProperty(targetDatabase))

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty,
    ) : DatabaseInputProperty {
      public override fun createTableDefaultPermissions(): Any? =
          unwrap(this).getCreateTableDefaultPermissions()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun federatedDatabase(): Any? = unwrap(this).getFederatedDatabase()

      public override fun locationUri(): String? = unwrap(this).getLocationUri()

      public override fun name(): String? = unwrap(this).getName()

      public override fun parameters(): Any? = unwrap(this).getParameters()

      public override fun targetDatabase(): Any? = unwrap(this).getTargetDatabase()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty):
          DatabaseInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseInputProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FederatedDatabaseProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun identifier(): String? = unwrap(this).getIdentifier()

    public interface Builder {
      public fun connectionName(connectionName: String) {
      }

      public fun identifier(identifier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty.builder()

      public override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      public override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty,
    ) : FederatedDatabaseProperty {
      public override fun connectionName(): String? = unwrap(this).getConnectionName()

      public override fun identifier(): String? = unwrap(this).getIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FederatedDatabaseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty):
          FederatedDatabaseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FederatedDatabaseProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty.builder()

      public override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty):
          DataLakePrincipalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PrincipalPrivilegesProperty {
    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    public fun principal(): Any? = unwrap(this).getPrincipal()

    public interface Builder {
      public fun permissions(permissions: List<String>) {
      }

      public fun principal(principal: IResolvable) {
      }

      public fun principal(principal: DataLakePrincipalProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26a401ea0875e6e271c7b0116fc64b0c6609b7fca88d8ba318032f56fd772af6")
      public fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty.builder()

      public override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      public override fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal.let(IResolvable::unwrap))
      }

      public override fun principal(principal: DataLakePrincipalProperty) {
        cdkBuilder.principal(principal.let(DataLakePrincipalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26a401ea0875e6e271c7b0116fc64b0c6609b7fca88d8ba318032f56fd772af6")
      public override fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
          principal(DataLakePrincipalProperty(principal))

      public fun build():
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty,
    ) : PrincipalPrivilegesProperty {
      public override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

      public override fun principal(): Any? = unwrap(this).getPrincipal()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrincipalPrivilegesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty):
          PrincipalPrivilegesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrincipalPrivilegesProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatabaseIdentifierProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun region(): String? = unwrap(this).getRegion()

    public interface Builder {
      public fun catalogId(catalogId: String) {
      }

      public fun databaseName(databaseName: String) {
      }

      public fun region(region: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty.builder()

      public override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty,
    ) : DatabaseIdentifierProperty {
      public override fun catalogId(): String? = unwrap(this).getCatalogId()

      public override fun databaseName(): String? = unwrap(this).getDatabaseName()

      public override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty):
          DatabaseIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseIdentifierProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
