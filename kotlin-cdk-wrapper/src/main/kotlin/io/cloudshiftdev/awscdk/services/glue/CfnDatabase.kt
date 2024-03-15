@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatabase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnDatabase,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8910c3394f6c7c10c51245acf8628f28a9c05a0d326653d4f1b02aefff064f81")
  public open fun databaseInput(`value`: DatabaseInputProperty.Builder.() -> Unit): Unit =
      databaseInput(DatabaseInputProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseInput(databaseInput: IResolvable)

    public fun databaseInput(databaseInput: DatabaseInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("977dcab4f4d2d0a2cf36d1e9a7b5532875b1237f2589a2f57b19100e301a879b")
    public fun databaseInput(databaseInput: DatabaseInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDatabase.Builder =
        software.amazon.awscdk.services.glue.CfnDatabase.Builder.create(scope, id)

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun databaseInput(databaseInput: IResolvable) {
      cdkBuilder.databaseInput(databaseInput.let(IResolvable::unwrap))
    }

    override fun databaseInput(databaseInput: DatabaseInputProperty) {
      cdkBuilder.databaseInput(databaseInput.let(DatabaseInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("977dcab4f4d2d0a2cf36d1e9a7b5532875b1237f2589a2f57b19100e301a879b")
    override fun databaseInput(databaseInput: DatabaseInputProperty.Builder.() -> Unit): Unit =
        databaseInput(DatabaseInputProperty(databaseInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnDatabase = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnDatabase.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable)

      public fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>)

      public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any)

      public fun description(description: String)

      public fun federatedDatabase(federatedDatabase: IResolvable)

      public fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b65ff7c8b03e9b65250939a9639ccc40f86571e64b8ca5ca97272767ae23b00")
      public fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty.Builder.() -> Unit)

      public fun locationUri(locationUri: String)

      public fun name(name: String)

      public fun parameters(parameters: Any)

      public fun targetDatabase(targetDatabase: IResolvable)

      public fun targetDatabase(targetDatabase: DatabaseIdentifierProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8343aa203b412577f62ae7a45c499c1c61ea101c62145d4fd2f7b75aaecf2792")
      public fun targetDatabase(targetDatabase: DatabaseIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty.builder()

      override fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions.let(IResolvable::unwrap))
      }

      override fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
      }

      override fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any): Unit =
          createTableDefaultPermissions(createTableDefaultPermissions.toList())

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun federatedDatabase(federatedDatabase: IResolvable) {
        cdkBuilder.federatedDatabase(federatedDatabase.let(IResolvable::unwrap))
      }

      override fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty) {
        cdkBuilder.federatedDatabase(federatedDatabase.let(FederatedDatabaseProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b65ff7c8b03e9b65250939a9639ccc40f86571e64b8ca5ca97272767ae23b00")
      override
          fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty.Builder.() -> Unit):
          Unit = federatedDatabase(FederatedDatabaseProperty(federatedDatabase))

      override fun locationUri(locationUri: String) {
        cdkBuilder.locationUri(locationUri)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      override fun targetDatabase(targetDatabase: IResolvable) {
        cdkBuilder.targetDatabase(targetDatabase.let(IResolvable::unwrap))
      }

      override fun targetDatabase(targetDatabase: DatabaseIdentifierProperty) {
        cdkBuilder.targetDatabase(targetDatabase.let(DatabaseIdentifierProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8343aa203b412577f62ae7a45c499c1c61ea101c62145d4fd2f7b75aaecf2792")
      override fun targetDatabase(targetDatabase: DatabaseIdentifierProperty.Builder.() -> Unit):
          Unit = targetDatabase(DatabaseIdentifierProperty(targetDatabase))

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty,
    ) : CdkObject(cdkObject), DatabaseInputProperty {
      override fun createTableDefaultPermissions(): Any? =
          unwrap(this).getCreateTableDefaultPermissions()

      override fun description(): String? = unwrap(this).getDescription()

      override fun federatedDatabase(): Any? = unwrap(this).getFederatedDatabase()

      override fun locationUri(): String? = unwrap(this).getLocationUri()

      override fun name(): String? = unwrap(this).getName()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun targetDatabase(): Any? = unwrap(this).getTargetDatabase()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty):
          DatabaseInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseInputProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty
    }
  }

  public interface FederatedDatabaseProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun identifier(): String? = unwrap(this).getIdentifier()

    @CdkDslMarker
    public interface Builder {
      public fun connectionName(connectionName: String)

      public fun identifier(identifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty.builder()

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty,
    ) : CdkObject(cdkObject), FederatedDatabaseProperty {
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun identifier(): String? = unwrap(this).getIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FederatedDatabaseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty):
          FederatedDatabaseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FederatedDatabaseProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty
    }
  }

  public interface DataLakePrincipalProperty {
    public fun dataLakePrincipalIdentifier(): String? =
        unwrap(this).getDataLakePrincipalIdentifier()

    @CdkDslMarker
    public interface Builder {
      public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty.builder()

      override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty,
    ) : CdkObject(cdkObject), DataLakePrincipalProperty {
      override fun dataLakePrincipalIdentifier(): String? =
          unwrap(this).getDataLakePrincipalIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataLakePrincipalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty):
          DataLakePrincipalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty
    }
  }

  public interface PrincipalPrivilegesProperty {
    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    public fun principal(): Any? = unwrap(this).getPrincipal()

    @CdkDslMarker
    public interface Builder {
      public fun permissions(permissions: List<String>)

      public fun permissions(vararg permissions: String)

      public fun principal(principal: IResolvable)

      public fun principal(principal: DataLakePrincipalProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26a401ea0875e6e271c7b0116fc64b0c6609b7fca88d8ba318032f56fd772af6")
      public fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty.builder()

      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      override fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal.let(IResolvable::unwrap))
      }

      override fun principal(principal: DataLakePrincipalProperty) {
        cdkBuilder.principal(principal.let(DataLakePrincipalProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26a401ea0875e6e271c7b0116fc64b0c6609b7fca88d8ba318032f56fd772af6")
      override fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
          principal(DataLakePrincipalProperty(principal))

      public fun build():
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty,
    ) : CdkObject(cdkObject), PrincipalPrivilegesProperty {
      override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

      override fun principal(): Any? = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrincipalPrivilegesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty):
          PrincipalPrivilegesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrincipalPrivilegesProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty
    }
  }

  public interface DatabaseIdentifierProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun region(): String? = unwrap(this).getRegion()

    @CdkDslMarker
    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty,
    ) : CdkObject(cdkObject), DatabaseIdentifierProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty):
          DatabaseIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseIdentifierProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty
    }
  }
}
