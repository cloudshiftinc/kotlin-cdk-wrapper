package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTableOptimizer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun catalogId(): String = unwrap(this).getCatalogId()

  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tableName(): String = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  public open fun tableOptimizerConfiguration(): Any = unwrap(this).getTableOptimizerConfiguration()

  public open fun tableOptimizerConfiguration(`value`: IResolvable) {
    unwrap(this).setTableOptimizerConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun tableOptimizerConfiguration(`value`: TableOptimizerConfigurationProperty) {
    unwrap(this).setTableOptimizerConfiguration(`value`.let(TableOptimizerConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6acec22b313a6085ba5e377067e32e85711a941ea7f2359e7304e530517931cc")
  public open
      fun tableOptimizerConfiguration(`value`: TableOptimizerConfigurationProperty.Builder.() -> Unit):
      Unit = tableOptimizerConfiguration(TableOptimizerConfigurationProperty(`value`))

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseName(databaseName: String)

    public fun tableName(tableName: String)

    public fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable)

    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2c8297cdf6212a0fbaf3da179bd2b62e493c16bf68663d123d3d098e086c04")
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTableOptimizer.Builder =
        software.amazon.awscdk.services.glue.CfnTableOptimizer.Builder.create(scope, id)

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(IResolvable::unwrap))
    }

    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(TableOptimizerConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2c8297cdf6212a0fbaf3da179bd2b62e493c16bf68663d123d3d098e086c04")
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty.Builder.() -> Unit):
        Unit =
        tableOptimizerConfiguration(TableOptimizerConfigurationProperty(tableOptimizerConfiguration))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTableOptimizer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTableOptimizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTableOptimizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer):
        CfnTableOptimizer = CfnTableOptimizer(cdkObject)

    internal fun unwrap(wrapped: CfnTableOptimizer):
        software.amazon.awscdk.services.glue.CfnTableOptimizer = wrapped.cdkObject
  }

  public interface TableOptimizerConfigurationProperty {
    public fun enabled(): Any

    public fun roleArn(): String

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty,
    ) : TableOptimizerConfigurationProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TableOptimizerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty):
          TableOptimizerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableOptimizerConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
