@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDBProxyTargetGroupProps {
  public fun connectionPoolConfigurationInfo(): Any? =
      unwrap(this).getConnectionPoolConfigurationInfo()

  public fun dbClusterIdentifiers(): List<String> = unwrap(this).getDbClusterIdentifiers() ?:
      emptyList()

  public fun dbInstanceIdentifiers(): List<String> = unwrap(this).getDbInstanceIdentifiers() ?:
      emptyList()

  public fun dbProxyName(): String

  public fun targetGroupName(): String

  @CdkDslMarker
  public interface Builder {
    public fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable)

    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a81dca035ba13cf1b38b5cbc879a23df538a398f0b36ca3a18499b89c43d713a")
    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit)

    public fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>)

    public fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String)

    public fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>)

    public fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String)

    public fun dbProxyName(dbProxyName: String)

    public fun targetGroupName(targetGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps.builder()

    override fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(IResolvable::unwrap))
    }

    override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a81dca035ba13cf1b38b5cbc879a23df538a398f0b36ca3a18499b89c43d713a")
    override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit):
        Unit =
        connectionPoolConfigurationInfo(CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty(connectionPoolConfigurationInfo))

    override fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>) {
      cdkBuilder.dbClusterIdentifiers(dbClusterIdentifiers)
    }

    override fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String): Unit =
        dbClusterIdentifiers(dbClusterIdentifiers.toList())

    override fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>) {
      cdkBuilder.dbInstanceIdentifiers(dbInstanceIdentifiers)
    }

    override fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String): Unit =
        dbInstanceIdentifiers(dbInstanceIdentifiers.toList())

    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps,
  ) : CdkObject(cdkObject), CfnDBProxyTargetGroupProps {
    override fun connectionPoolConfigurationInfo(): Any? =
        unwrap(this).getConnectionPoolConfigurationInfo()

    override fun dbClusterIdentifiers(): List<String> = unwrap(this).getDbClusterIdentifiers() ?:
        emptyList()

    override fun dbInstanceIdentifiers(): List<String> = unwrap(this).getDbInstanceIdentifiers() ?:
        emptyList()

    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    override fun targetGroupName(): String = unwrap(this).getTargetGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBProxyTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps):
        CfnDBProxyTargetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyTargetGroupProps):
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps
  }
}
