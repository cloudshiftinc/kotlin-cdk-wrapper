package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBProxyTargetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrTargetGroupArn(): String = unwrap(this).getAttrTargetGroupArn()

  public open fun connectionPoolConfigurationInfo(): Any? =
      unwrap(this).getConnectionPoolConfigurationInfo()

  public open fun connectionPoolConfigurationInfo(`value`: IResolvable) {
    unwrap(this).setConnectionPoolConfigurationInfo(`value`.let(IResolvable::unwrap))
  }

  public open
      fun connectionPoolConfigurationInfo(`value`: ConnectionPoolConfigurationInfoFormatProperty) {
    unwrap(this).setConnectionPoolConfigurationInfo(`value`.let(ConnectionPoolConfigurationInfoFormatProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4063fded1e953b2425194863b7aa1da8f32b08cbb6781e2f8a45201e7e82b26d")
  public open
      fun connectionPoolConfigurationInfo(`value`: ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit):
      Unit = connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty(`value`))

  public open fun dbClusterIdentifiers(): List<String> = unwrap(this).getDbClusterIdentifiers() ?:
      emptyList()

  public open fun dbClusterIdentifiers(`value`: List<String>) {
    unwrap(this).setDbClusterIdentifiers(`value`)
  }

  public open fun dbInstanceIdentifiers(): List<String> = unwrap(this).getDbInstanceIdentifiers() ?:
      emptyList()

  public open fun dbInstanceIdentifiers(`value`: List<String>) {
    unwrap(this).setDbInstanceIdentifiers(`value`)
  }

  public open fun dbProxyName(): String = unwrap(this).getDbProxyName()

  public open fun dbProxyName(`value`: String) {
    unwrap(this).setDbProxyName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun targetGroupName(): String = unwrap(this).getTargetGroupName()

  public open fun targetGroupName(`value`: String) {
    unwrap(this).setTargetGroupName(`value`)
  }

  public interface Builder {
    public fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
    }

    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b82b793ddcdd39d423ca86d9874701672489a79685d22d7c87246e2dcc494f2")
    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit) {
    }

    public fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>) {
    }

    public fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>) {
    }

    public fun dbProxyName(dbProxyName: String) {
    }

    public fun targetGroupName(targetGroupName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.Builder.create(scope, id)

    public override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(IResolvable::unwrap))
    }

    public override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(ConnectionPoolConfigurationInfoFormatProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b82b793ddcdd39d423ca86d9874701672489a79685d22d7c87246e2dcc494f2")
    public override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit):
        Unit =
        connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty(connectionPoolConfigurationInfo))

    public override fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>) {
      cdkBuilder.dbClusterIdentifiers(dbClusterIdentifiers)
    }

    public override fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>) {
      cdkBuilder.dbInstanceIdentifiers(dbInstanceIdentifiers)
    }

    public override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    public override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBProxyTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBProxyTargetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup):
        CfnDBProxyTargetGroup = CfnDBProxyTargetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyTargetGroup):
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup = wrapped.cdkObject
  }

  public interface ConnectionPoolConfigurationInfoFormatProperty {
    public fun connectionBorrowTimeout(): Number? = unwrap(this).getConnectionBorrowTimeout()

    public fun initQuery(): String? = unwrap(this).getInitQuery()

    public fun maxConnectionsPercent(): Number? = unwrap(this).getMaxConnectionsPercent()

    public fun maxIdleConnectionsPercent(): Number? = unwrap(this).getMaxIdleConnectionsPercent()

    public fun sessionPinningFilters(): List<String> = unwrap(this).getSessionPinningFilters() ?:
        emptyList()

    public interface Builder {
      public fun connectionBorrowTimeout(connectionBorrowTimeout: Number) {
      }

      public fun initQuery(initQuery: String) {
      }

      public fun maxConnectionsPercent(maxConnectionsPercent: Number) {
      }

      public fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
      }

      public fun sessionPinningFilters(sessionPinningFilters: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder
          =
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.builder()

      public override fun connectionBorrowTimeout(connectionBorrowTimeout: Number) {
        cdkBuilder.connectionBorrowTimeout(connectionBorrowTimeout)
      }

      public override fun initQuery(initQuery: String) {
        cdkBuilder.initQuery(initQuery)
      }

      public override fun maxConnectionsPercent(maxConnectionsPercent: Number) {
        cdkBuilder.maxConnectionsPercent(maxConnectionsPercent)
      }

      public override fun maxIdleConnectionsPercent(maxIdleConnectionsPercent: Number) {
        cdkBuilder.maxIdleConnectionsPercent(maxIdleConnectionsPercent)
      }

      public override fun sessionPinningFilters(sessionPinningFilters: List<String>) {
        cdkBuilder.sessionPinningFilters(sessionPinningFilters)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty,
    ) : ConnectionPoolConfigurationInfoFormatProperty {
      public override fun connectionBorrowTimeout(): Number? =
          unwrap(this).getConnectionBorrowTimeout()

      public override fun initQuery(): String? = unwrap(this).getInitQuery()

      public override fun maxConnectionsPercent(): Number? = unwrap(this).getMaxConnectionsPercent()

      public override fun maxIdleConnectionsPercent(): Number? =
          unwrap(this).getMaxIdleConnectionsPercent()

      public override fun sessionPinningFilters(): List<String> =
          unwrap(this).getSessionPinningFilters() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionPoolConfigurationInfoFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty):
          ConnectionPoolConfigurationInfoFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionPoolConfigurationInfoFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
