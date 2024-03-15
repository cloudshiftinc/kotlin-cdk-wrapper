@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A resource that describes the AWS Glue resource for enabling compaction to improve read
 * performance for open table formats.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnTableOptimizer cfnTableOptimizer = CfnTableOptimizer.Builder.create(this,
 * "MyCfnTableOptimizer")
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tableOptimizerConfiguration(TableOptimizerConfigurationProperty.builder()
 * .enabled(false)
 * .roleArn("roleArn")
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html)
 */
public open class CfnTableOptimizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizer,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The catalog ID of the table.
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The catalog ID of the table.
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * The name of the database.
   */
  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  /**
   * The name of the database.
   */
  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The table name.
   */
  public open fun tableName(): String = unwrap(this).getTableName()

  /**
   * The table name.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   *
   */
  public open fun tableOptimizerConfiguration(): Any = unwrap(this).getTableOptimizerConfiguration()

  /**
   *
   */
  public open fun tableOptimizerConfiguration(`value`: IResolvable) {
    unwrap(this).setTableOptimizerConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun tableOptimizerConfiguration(`value`: TableOptimizerConfigurationProperty) {
    unwrap(this).setTableOptimizerConfiguration(`value`.let(TableOptimizerConfigurationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6acec22b313a6085ba5e377067e32e85711a941ea7f2359e7304e530517931cc")
  public open
      fun tableOptimizerConfiguration(`value`: TableOptimizerConfigurationProperty.Builder.() -> Unit):
      Unit = tableOptimizerConfiguration(TableOptimizerConfigurationProperty(`value`))

  /**
   * The type of table optimizer.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of table optimizer.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnTableOptimizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The catalog ID of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-catalogid)
     * @param catalogId The catalog ID of the table. 
     */
    public fun catalogId(catalogId: String)

    /**
     * The name of the database.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-databasename)
     * @param databaseName The name of the database. 
     */
    public fun databaseName(databaseName: String)

    /**
     * The table name.
     *
     * For Hive compatibility, this must be entirely lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tablename)
     * @param tableName The table name. 
     */
    public fun tableName(tableName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration 
     */
    public fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration 
     */
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2c8297cdf6212a0fbaf3da179bd2b62e493c16bf68663d123d3d098e086c04")
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty.Builder.() -> Unit)

    /**
     * The type of table optimizer.
     *
     * Currently, the only valid value is compaction.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-type)
     * @param type The type of table optimizer. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTableOptimizer.Builder =
        software.amazon.awscdk.services.glue.CfnTableOptimizer.Builder.create(scope, id)

    /**
     * The catalog ID of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-catalogid)
     * @param catalogId The catalog ID of the table. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * The name of the database.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-databasename)
     * @param databaseName The name of the database. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * The table name.
     *
     * For Hive compatibility, this must be entirely lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tablename)
     * @param tableName The table name. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration 
     */
    override fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration 
     */
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(TableOptimizerConfigurationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     * @param tableOptimizerConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a2c8297cdf6212a0fbaf3da179bd2b62e493c16bf68663d123d3d098e086c04")
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: TableOptimizerConfigurationProperty.Builder.() -> Unit):
        Unit =
        tableOptimizerConfiguration(TableOptimizerConfigurationProperty(tableOptimizerConfiguration))

    /**
     * The type of table optimizer.
     *
     * Currently, the only valid value is compaction.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-type)
     * @param type The type of table optimizer. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTableOptimizer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnTableOptimizer.CFN_RESOURCE_TYPE_NAME

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

  /**
   * Specifies configuration details of a table optimizer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * TableOptimizerConfigurationProperty tableOptimizerConfigurationProperty =
   * TableOptimizerConfigurationProperty.builder()
   * .enabled(false)
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html)
   */
  public interface TableOptimizerConfigurationProperty {
    /**
     * Whether the table optimization is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-enabled)
     */
    public fun enabled(): Any

    /**
     * A role passed by the caller which gives the service permission to update the resources
     * associated with the optimizer on the caller's behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [TableOptimizerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param roleArn A role passed by the caller which gives the service permission to update the
       * resources associated with the optimizer on the caller's behalf. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty.builder()

      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether the table optimization is enabled. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param roleArn A role passed by the caller which gives the service permission to update the
       * resources associated with the optimizer on the caller's behalf. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty,
    ) : CdkObject(cdkObject), TableOptimizerConfigurationProperty {
      /**
       * Whether the table optimization is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * A role passed by the caller which gives the service permission to update the resources
       * associated with the optimizer on the caller's behalf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTableOptimizer.TableOptimizerConfigurationProperty
    }
  }
}
