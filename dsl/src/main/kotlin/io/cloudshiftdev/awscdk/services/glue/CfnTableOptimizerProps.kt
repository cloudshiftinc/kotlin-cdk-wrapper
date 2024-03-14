package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTableOptimizerProps {
  /**
   * The catalog ID of the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-catalogid)
   */
  public fun catalogId(): String

  /**
   * The name of the database.
   *
   * For Hive compatibility, this is folded to lowercase when it is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-databasename)
   */
  public fun databaseName(): String

  /**
   * The table name.
   *
   * For Hive compatibility, this must be entirely lowercase.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tablename)
   */
  public fun tableName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
   */
  public fun tableOptimizerConfiguration(): Any

  /**
   * The type of table optimizer.
   *
   * Currently, the only valid value is compaction.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnTableOptimizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogId The catalog ID of the table. 
     */
    public fun catalogId(catalogId: String)

    /**
     * @param databaseName The name of the database. 
     * For Hive compatibility, this is folded to lowercase when it is stored.
     */
    public fun databaseName(databaseName: String)

    /**
     * @param tableName The table name. 
     * For Hive compatibility, this must be entirely lowercase.
     */
    public fun tableName(tableName: String)

    /**
     * @param tableOptimizerConfiguration the value to be set. 
     */
    public fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable)

    /**
     * @param tableOptimizerConfiguration the value to be set. 
     */
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty)

    /**
     * @param tableOptimizerConfiguration the value to be set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d457aada3848bb90e499321d16bd07efffbb6dd76133703d496e810e99cbb1")
    public
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder.() -> Unit)

    /**
     * @param type The type of table optimizer. 
     * Currently, the only valid value is compaction.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTableOptimizerProps.Builder =
        software.amazon.awscdk.services.glue.CfnTableOptimizerProps.builder()

    /**
     * @param catalogId The catalog ID of the table. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param databaseName The name of the database. 
     * For Hive compatibility, this is folded to lowercase when it is stored.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param tableName The table name. 
     * For Hive compatibility, this must be entirely lowercase.
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * @param tableOptimizerConfiguration the value to be set. 
     */
    override fun tableOptimizerConfiguration(tableOptimizerConfiguration: IResolvable) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param tableOptimizerConfiguration the value to be set. 
     */
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty) {
      cdkBuilder.tableOptimizerConfiguration(tableOptimizerConfiguration.let(CfnTableOptimizer.TableOptimizerConfigurationProperty::unwrap))
    }

    /**
     * @param tableOptimizerConfiguration the value to be set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d457aada3848bb90e499321d16bd07efffbb6dd76133703d496e810e99cbb1")
    override
        fun tableOptimizerConfiguration(tableOptimizerConfiguration: CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder.() -> Unit):
        Unit =
        tableOptimizerConfiguration(CfnTableOptimizer.TableOptimizerConfigurationProperty(tableOptimizerConfiguration))

    /**
     * @param type The type of table optimizer. 
     * Currently, the only valid value is compaction.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTableOptimizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnTableOptimizerProps,
  ) : CdkObject(cdkObject), CfnTableOptimizerProps {
    /**
     * The catalog ID of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-catalogid)
     */
    override fun catalogId(): String = unwrap(this).getCatalogId()

    /**
     * The name of the database.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-databasename)
     */
    override fun databaseName(): String = unwrap(this).getDatabaseName()

    /**
     * The table name.
     *
     * For Hive compatibility, this must be entirely lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tablename)
     */
    override fun tableName(): String = unwrap(this).getTableName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-tableoptimizerconfiguration)
     */
    override fun tableOptimizerConfiguration(): Any = unwrap(this).getTableOptimizerConfiguration()

    /**
     * The type of table optimizer.
     *
     * Currently, the only valid value is compaction.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-tableoptimizer.html#cfn-glue-tableoptimizer-type)
     */
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
