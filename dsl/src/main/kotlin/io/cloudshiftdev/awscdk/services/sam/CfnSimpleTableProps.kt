package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnSimpleTableProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
   */
  public fun primaryKey(): Any? = unwrap(this).getPrimaryKey()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
   */
  public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
   */
  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tablename)
   */
  public fun tableName(): String? = unwrap(this).getTableName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnSimpleTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param primaryKey the value to be set.
     */
    public fun primaryKey(primaryKey: IResolvable)

    /**
     * @param primaryKey the value to be set.
     */
    public fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty)

    /**
     * @param primaryKey the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ada208fb5cc6f1198cf6abc7fb9ecbad931c6cb65671961f1d0be3573e9f76")
    public fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty.Builder.() -> Unit)

    /**
     * @param provisionedThroughput the value to be set.
     */
    public fun provisionedThroughput(provisionedThroughput: IResolvable)

    /**
     * @param provisionedThroughput the value to be set.
     */
    public
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty)

    /**
     * @param provisionedThroughput the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d3cd86b22e2170b95d98b9c4e4867bb98ca342a974d3dc2499235621accc5")
    public
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty.Builder.() -> Unit)

    /**
     * @param sseSpecification the value to be set.
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * @param sseSpecification the value to be set.
     */
    public fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty)

    /**
     * @param sseSpecification the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09c2260bcf659b3654d1c01b8d002470949c34457544e45ef06524702fab5d7f")
    public
        fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty.Builder.() -> Unit)

    /**
     * @param tableName the value to be set.
     */
    public fun tableName(tableName: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder =
        software.amazon.awscdk.services.sam.CfnSimpleTableProps.builder()

    /**
     * @param primaryKey the value to be set.
     */
    override fun primaryKey(primaryKey: IResolvable) {
      cdkBuilder.primaryKey(primaryKey.let(IResolvable::unwrap))
    }

    /**
     * @param primaryKey the value to be set.
     */
    override fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty) {
      cdkBuilder.primaryKey(primaryKey.let(CfnSimpleTable.PrimaryKeyProperty::unwrap))
    }

    /**
     * @param primaryKey the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ada208fb5cc6f1198cf6abc7fb9ecbad931c6cb65671961f1d0be3573e9f76")
    override fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty.Builder.() -> Unit): Unit
        = primaryKey(CfnSimpleTable.PrimaryKeyProperty(primaryKey))

    /**
     * @param provisionedThroughput the value to be set.
     */
    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
    }

    /**
     * @param provisionedThroughput the value to be set.
     */
    override
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(CfnSimpleTable.ProvisionedThroughputProperty::unwrap))
    }

    /**
     * @param provisionedThroughput the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f96d3cd86b22e2170b95d98b9c4e4867bb98ca342a974d3dc2499235621accc5")
    override
        fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit =
        provisionedThroughput(CfnSimpleTable.ProvisionedThroughputProperty(provisionedThroughput))

    /**
     * @param sseSpecification the value to be set.
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param sseSpecification the value to be set.
     */
    override fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnSimpleTable.SSESpecificationProperty::unwrap))
    }

    /**
     * @param sseSpecification the value to be set.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09c2260bcf659b3654d1c01b8d002470949c34457544e45ef06524702fab5d7f")
    override
        fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnSimpleTable.SSESpecificationProperty(sseSpecification))

    /**
     * @param tableName the value to be set.
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnSimpleTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTableProps,
  ) : CdkObject(cdkObject), CfnSimpleTableProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     */
    override fun primaryKey(): Any? = unwrap(this).getPrimaryKey()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     */
    override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     */
    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tablename)
     */
    override fun tableName(): String? = unwrap(this).getTableName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimpleTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTableProps):
        CfnSimpleTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimpleTableProps):
        software.amazon.awscdk.services.sam.CfnSimpleTableProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnSimpleTableProps
  }
}
