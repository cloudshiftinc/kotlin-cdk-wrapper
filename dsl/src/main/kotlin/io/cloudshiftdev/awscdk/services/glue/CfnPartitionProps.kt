package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnPartitionProps {
  /**
   * The AWS account ID of the catalog in which the partion is to be created.
   *
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId`
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid)
   */
  public fun catalogId(): String

  /**
   * The name of the catalog database in which to create the partition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename)
   */
  public fun databaseName(): String

  /**
   * The structure used to create and update a partition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
   */
  public fun partitionInput(): Any

  /**
   * The name of the metadata table in which the partition is to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename)
   */
  public fun tableName(): String

  /**
   * A builder for [CfnPartitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogId The AWS account ID of the catalog in which the partion is to be created. 
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     */
    public fun catalogId(catalogId: String)

    /**
     * @param databaseName The name of the catalog database in which to create the partition. 
     */
    public fun databaseName(databaseName: String)

    /**
     * @param partitionInput The structure used to create and update a partition. 
     */
    public fun partitionInput(partitionInput: IResolvable)

    /**
     * @param partitionInput The structure used to create and update a partition. 
     */
    public fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty)

    /**
     * @param partitionInput The structure used to create and update a partition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7fb63a1e6bd1063f61e880e0f8702da56a48e29efeba0399d5ba9038f14d0ad")
    public
        fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty.Builder.() -> Unit)

    /**
     * @param tableName The name of the metadata table in which the partition is to be created. 
     */
    public fun tableName(tableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnPartitionProps.Builder =
        software.amazon.awscdk.services.glue.CfnPartitionProps.builder()

    /**
     * @param catalogId The AWS account ID of the catalog in which the partion is to be created. 
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param databaseName The name of the catalog database in which to create the partition. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param partitionInput The structure used to create and update a partition. 
     */
    override fun partitionInput(partitionInput: IResolvable) {
      cdkBuilder.partitionInput(partitionInput.let(IResolvable::unwrap))
    }

    /**
     * @param partitionInput The structure used to create and update a partition. 
     */
    override fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty) {
      cdkBuilder.partitionInput(partitionInput.let(CfnPartition.PartitionInputProperty::unwrap))
    }

    /**
     * @param partitionInput The structure used to create and update a partition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7fb63a1e6bd1063f61e880e0f8702da56a48e29efeba0399d5ba9038f14d0ad")
    override
        fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty.Builder.() -> Unit):
        Unit = partitionInput(CfnPartition.PartitionInputProperty(partitionInput))

    /**
     * @param tableName The name of the metadata table in which the partition is to be created. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnPartitionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnPartitionProps,
  ) : CdkObject(cdkObject), CfnPartitionProps {
    /**
     * The AWS account ID of the catalog in which the partion is to be created.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid)
     */
    override fun catalogId(): String = unwrap(this).getCatalogId()

    /**
     * The name of the catalog database in which to create the partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename)
     */
    override fun databaseName(): String = unwrap(this).getDatabaseName()

    /**
     * The structure used to create and update a partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
     */
    override fun partitionInput(): Any = unwrap(this).getPartitionInput()

    /**
     * The name of the metadata table in which the partition is to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename)
     */
    override fun tableName(): String = unwrap(this).getTableName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPartitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartitionProps):
        CfnPartitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPartitionProps):
        software.amazon.awscdk.services.glue.CfnPartitionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnPartitionProps
  }
}
