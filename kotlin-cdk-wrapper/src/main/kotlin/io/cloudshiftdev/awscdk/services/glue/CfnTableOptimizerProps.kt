@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTableOptimizerProps {
  public fun catalogId(): String

  public fun databaseName(): String

  public fun tableName(): String

  public fun tableOptimizerConfiguration(): Any

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseName(databaseName: String)

    public fun tableName(tableName: String)

    public fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable)

    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d457aada3848bb90e499321d16bd07efffbb6dd76133703d496e810e99cbb1")
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTableOptimizerProps.Builder =
        software.amazon.awscdk.services.glue.CfnTableOptimizerProps.builder()

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
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(CfnTableOptimizer.TableOptimizerConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d457aada3848bb90e499321d16bd07efffbb6dd76133703d496e810e99cbb1")
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder.() -> Unit):
        Unit =
        tableOptimizerConfiguration(CfnTableOptimizer.TableOptimizerConfigurationProperty(tableOptimizerConfiguration))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTableOptimizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizerProps,
  ) : CdkObject(cdkObject), CfnTableOptimizerProps {
    override fun catalogId(): String = unwrap(this).getCatalogId()

    override fun databaseName(): String = unwrap(this).getDatabaseName()

    override fun tableName(): String = unwrap(this).getTableName()

    override fun tableOptimizerConfiguration(): Any = unwrap(this).getTableOptimizerConfiguration()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableOptimizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizerProps):
        CfnTableOptimizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableOptimizerProps):
        software.amazon.awscdk.services.glue.CfnTableOptimizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTableOptimizerProps
  }
}
