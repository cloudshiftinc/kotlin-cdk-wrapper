@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties used to configure a replica table.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build()))
 * .build();
 * globalTable.addReplica(ReplicaTableProps.builder().region("us-east-2").deletionProtection(true).build());
 * ```
 */
public interface ReplicaTableProps : TableOptionsV2 {
  /**
   * Options used to configure global secondary index properties.
   *
   * Default: - inherited from the primary table
   */
  public fun globalSecondaryIndexOptions(): Map<String, ReplicaGlobalSecondaryIndexOptions> =
      unwrap(this).getGlobalSecondaryIndexOptions()?.mapValues{ReplicaGlobalSecondaryIndexOptions.wrap(it.value)}
      ?: emptyMap()

  /**
   * The maxium read request units.
   *
   * Note: This can only be configured if the primary table billing is PAY_PER_REQUEST.
   *
   * Default: - inherited from the primary table
   */
  public fun maxReadRequestUnits(): Number? = unwrap(this).getMaxReadRequestUnits()

  /**
   * The read capacity.
   *
   * Note: This can only be configured if the primary table billing is provisioned.
   *
   * Default: - inherited from the primary table
   */
  public fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

  /**
   * The region that the replica table will be created in.
   */
  public fun region(): String

  /**
   * A builder for [ReplicaTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contributorInsights Whether CloudWatch contributor insights is enabled.
     */
    public fun contributorInsights(contributorInsights: Boolean)

    /**
     * @param deletionProtection Whether deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param globalSecondaryIndexOptions Options used to configure global secondary index
     * properties.
     */
    public
        fun globalSecondaryIndexOptions(globalSecondaryIndexOptions: Map<String, ReplicaGlobalSecondaryIndexOptions>)

    /**
     * @param kinesisStream Kinesis Data Stream to capture item level changes.
     */
    public fun kinesisStream(kinesisStream: IStream)

    /**
     * @param maxReadRequestUnits The maxium read request units.
     * Note: This can only be configured if the primary table billing is PAY_PER_REQUEST.
     */
    public fun maxReadRequestUnits(maxReadRequestUnits: Number)

    /**
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    /**
     * @param readCapacity The read capacity.
     * Note: This can only be configured if the primary table billing is provisioned.
     */
    public fun readCapacity(readCapacity: Capacity)

    /**
     * @param region The region that the replica table will be created in. 
     */
    public fun region(region: String)

    /**
     * @param resourcePolicy Resource policy to assign to DynamoDB Table.
     */
    public fun resourcePolicy(resourcePolicy: PolicyDocument)

    /**
     * @param resourcePolicy Resource policy to assign to DynamoDB Table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e81c0a5c30615a10c90f2beb8354b9e6323cb71e5ea34dda62cb5e785d0c397")
    public fun resourcePolicy(resourcePolicy: PolicyDocument.Builder.() -> Unit)

    /**
     * @param tableClass The table class.
     */
    public fun tableClass(tableClass: TableClass)

    /**
     * @param tags Tags to be applied to the table or replica table.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to be applied to the table or replica table.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.ReplicaTableProps.Builder =
        software.amazon.awscdk.services.dynamodb.ReplicaTableProps.builder()

    /**
     * @param contributorInsights Whether CloudWatch contributor insights is enabled.
     */
    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * @param deletionProtection Whether deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param globalSecondaryIndexOptions Options used to configure global secondary index
     * properties.
     */
    override
        fun globalSecondaryIndexOptions(globalSecondaryIndexOptions: Map<String, ReplicaGlobalSecondaryIndexOptions>) {
      cdkBuilder.globalSecondaryIndexOptions(globalSecondaryIndexOptions.mapValues{ReplicaGlobalSecondaryIndexOptions.unwrap(it.value)})
    }

    /**
     * @param kinesisStream Kinesis Data Stream to capture item level changes.
     */
    override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream.Companion::unwrap))
    }

    /**
     * @param maxReadRequestUnits The maxium read request units.
     * Note: This can only be configured if the primary table billing is PAY_PER_REQUEST.
     */
    override fun maxReadRequestUnits(maxReadRequestUnits: Number) {
      cdkBuilder.maxReadRequestUnits(maxReadRequestUnits)
    }

    /**
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * @param readCapacity The read capacity.
     * Note: This can only be configured if the primary table billing is provisioned.
     */
    override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity.Companion::unwrap))
    }

    /**
     * @param region The region that the replica table will be created in. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param resourcePolicy Resource policy to assign to DynamoDB Table.
     */
    override fun resourcePolicy(resourcePolicy: PolicyDocument) {
      cdkBuilder.resourcePolicy(resourcePolicy.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * @param resourcePolicy Resource policy to assign to DynamoDB Table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e81c0a5c30615a10c90f2beb8354b9e6323cb71e5ea34dda62cb5e785d0c397")
    override fun resourcePolicy(resourcePolicy: PolicyDocument.Builder.() -> Unit): Unit =
        resourcePolicy(PolicyDocument(resourcePolicy))

    /**
     * @param tableClass The table class.
     */
    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass.Companion::unwrap))
    }

    /**
     * @param tags Tags to be applied to the table or replica table.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to be applied to the table or replica table.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dynamodb.ReplicaTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.ReplicaTableProps,
  ) : CdkObject(cdkObject),
      ReplicaTableProps {
    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     */
    override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    /**
     * Whether deletion protection is enabled.
     *
     * Default: false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Options used to configure global secondary index properties.
     *
     * Default: - inherited from the primary table
     */
    override fun globalSecondaryIndexOptions(): Map<String, ReplicaGlobalSecondaryIndexOptions> =
        unwrap(this).getGlobalSecondaryIndexOptions()?.mapValues{ReplicaGlobalSecondaryIndexOptions.wrap(it.value)}
        ?: emptyMap()

    /**
     * Kinesis Data Stream to capture item level changes.
     *
     * Default: - no Kinesis Data Stream
     */
    override fun kinesisStream(): IStream? = unwrap(this).getKinesisStream()?.let(IStream::wrap)

    /**
     * The maxium read request units.
     *
     * Note: This can only be configured if the primary table billing is PAY_PER_REQUEST.
     *
     * Default: - inherited from the primary table
     */
    override fun maxReadRequestUnits(): Number? = unwrap(this).getMaxReadRequestUnits()

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: false
     */
    override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

    /**
     * The read capacity.
     *
     * Note: This can only be configured if the primary table billing is provisioned.
     *
     * Default: - inherited from the primary table
     */
    override fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

    /**
     * The region that the replica table will be created in.
     */
    override fun region(): String = unwrap(this).getRegion()

    /**
     * Resource policy to assign to DynamoDB Table.
     *
     * Default: - No resource policy statements are added to the created table.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-resourcepolicy)
     */
    override fun resourcePolicy(): PolicyDocument? =
        unwrap(this).getResourcePolicy()?.let(PolicyDocument::wrap)

    /**
     * The table class.
     *
     * Default: TableClass.STANDARD
     */
    override fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

    /**
     * Tags to be applied to the table or replica table.
     *
     * Default: - no tags
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ReplicaTableProps):
        ReplicaTableProps = CdkObjectWrappers.wrap(cdkObject) as? ReplicaTableProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicaTableProps):
        software.amazon.awscdk.services.dynamodb.ReplicaTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.ReplicaTableProps
  }
}
