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

/**
 * Properties for defining a `CfnDBProxyTargetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBProxyTargetGroupProps cfnDBProxyTargetGroupProps = CfnDBProxyTargetGroupProps.builder()
 * .dbProxyName("dbProxyName")
 * .targetGroupName("targetGroupName")
 * // the properties below are optional
 * .connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty.builder()
 * .connectionBorrowTimeout(123)
 * .initQuery("initQuery")
 * .maxConnectionsPercent(123)
 * .maxIdleConnectionsPercent(123)
 * .sessionPinningFilters(List.of("sessionPinningFilters"))
 * .build())
 * .dbClusterIdentifiers(List.of("dbClusterIdentifiers"))
 * .dbInstanceIdentifiers(List.of("dbInstanceIdentifiers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html)
 */
public interface CfnDBProxyTargetGroupProps {
  /**
   * Settings that control the size and behavior of the connection pool associated with a
   * `DBProxyTargetGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
   */
  public fun connectionPoolConfigurationInfo(): Any? =
      unwrap(this).getConnectionPoolConfigurationInfo()

  /**
   * One or more DB cluster identifiers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
   */
  public fun dbClusterIdentifiers(): List<String> = unwrap(this).getDbClusterIdentifiers() ?:
      emptyList()

  /**
   * One or more DB instance identifiers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
   */
  public fun dbInstanceIdentifiers(): List<String> = unwrap(this).getDbInstanceIdentifiers() ?:
      emptyList()

  /**
   * The identifier of the `DBProxy` that is associated with the `DBProxyTargetGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname)
   */
  public fun dbProxyName(): String

  /**
   * The identifier for the target group.
   *
   *
   * Currently, this property must be set to `default` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-targetgroupname)
   */
  public fun targetGroupName(): String

  /**
   * A builder for [CfnDBProxyTargetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     * connection pool associated with a `DBProxyTargetGroup` .
     */
    public fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable)

    /**
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     * connection pool associated with a `DBProxyTargetGroup` .
     */
    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty)

    /**
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     * connection pool associated with a `DBProxyTargetGroup` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a81dca035ba13cf1b38b5cbc879a23df538a398f0b36ca3a18499b89c43d713a")
    public
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit)

    /**
     * @param dbClusterIdentifiers One or more DB cluster identifiers.
     */
    public fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>)

    /**
     * @param dbClusterIdentifiers One or more DB cluster identifiers.
     */
    public fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String)

    /**
     * @param dbInstanceIdentifiers One or more DB instance identifiers.
     */
    public fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>)

    /**
     * @param dbInstanceIdentifiers One or more DB instance identifiers.
     */
    public fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String)

    /**
     * @param dbProxyName The identifier of the `DBProxy` that is associated with the
     * `DBProxyTargetGroup` . 
     */
    public fun dbProxyName(dbProxyName: String)

    /**
     * @param targetGroupName The identifier for the target group. 
     *
     * Currently, this property must be set to `default` .
     */
    public fun targetGroupName(targetGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps.builder()

    /**
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     * connection pool associated with a `DBProxyTargetGroup` .
     */
    override fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: IResolvable) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(IResolvable::unwrap))
    }

    /**
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     * connection pool associated with a `DBProxyTargetGroup` .
     */
    override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty) {
      cdkBuilder.connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.let(CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty::unwrap))
    }

    /**
     * @param connectionPoolConfigurationInfo Settings that control the size and behavior of the
     * connection pool associated with a `DBProxyTargetGroup` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a81dca035ba13cf1b38b5cbc879a23df538a398f0b36ca3a18499b89c43d713a")
    override
        fun connectionPoolConfigurationInfo(connectionPoolConfigurationInfo: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit):
        Unit =
        connectionPoolConfigurationInfo(CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty(connectionPoolConfigurationInfo))

    /**
     * @param dbClusterIdentifiers One or more DB cluster identifiers.
     */
    override fun dbClusterIdentifiers(dbClusterIdentifiers: List<String>) {
      cdkBuilder.dbClusterIdentifiers(dbClusterIdentifiers)
    }

    /**
     * @param dbClusterIdentifiers One or more DB cluster identifiers.
     */
    override fun dbClusterIdentifiers(vararg dbClusterIdentifiers: String): Unit =
        dbClusterIdentifiers(dbClusterIdentifiers.toList())

    /**
     * @param dbInstanceIdentifiers One or more DB instance identifiers.
     */
    override fun dbInstanceIdentifiers(dbInstanceIdentifiers: List<String>) {
      cdkBuilder.dbInstanceIdentifiers(dbInstanceIdentifiers)
    }

    /**
     * @param dbInstanceIdentifiers One or more DB instance identifiers.
     */
    override fun dbInstanceIdentifiers(vararg dbInstanceIdentifiers: String): Unit =
        dbInstanceIdentifiers(dbInstanceIdentifiers.toList())

    /**
     * @param dbProxyName The identifier of the `DBProxy` that is associated with the
     * `DBProxyTargetGroup` . 
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * @param targetGroupName The identifier for the target group. 
     *
     * Currently, this property must be set to `default` .
     */
    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps,
  ) : CdkObject(cdkObject), CfnDBProxyTargetGroupProps {
    /**
     * Settings that control the size and behavior of the connection pool associated with a
     * `DBProxyTargetGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-connectionpoolconfigurationinfo)
     */
    override fun connectionPoolConfigurationInfo(): Any? =
        unwrap(this).getConnectionPoolConfigurationInfo()

    /**
     * One or more DB cluster identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers)
     */
    override fun dbClusterIdentifiers(): List<String> = unwrap(this).getDbClusterIdentifiers() ?:
        emptyList()

    /**
     * One or more DB instance identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers)
     */
    override fun dbInstanceIdentifiers(): List<String> = unwrap(this).getDbInstanceIdentifiers() ?:
        emptyList()

    /**
     * The identifier of the `DBProxy` that is associated with the `DBProxyTargetGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname)
     */
    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    /**
     * The identifier for the target group.
     *
     *
     * Currently, this property must be set to `default` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-targetgroupname)
     */
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
