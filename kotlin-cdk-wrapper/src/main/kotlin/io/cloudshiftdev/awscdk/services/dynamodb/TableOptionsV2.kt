@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Options used to configure a DynamoDB table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * PolicyDocument policyDocument;
 * Stream stream;
 * TableOptionsV2 tableOptionsV2 = TableOptionsV2.builder()
 * .contributorInsights(false)
 * .deletionProtection(false)
 * .kinesisStream(stream)
 * .pointInTimeRecovery(false)
 * .resourcePolicy(policyDocument)
 * .tableClass(TableClass.STANDARD)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 */
public interface TableOptionsV2 {
  /**
   * Whether CloudWatch contributor insights is enabled.
   *
   * Default: false
   */
  public fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

  /**
   * Whether deletion protection is enabled.
   *
   * Default: false
   */
  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  /**
   * Kinesis Data Stream to capture item level changes.
   *
   * Default: - no Kinesis Data Stream
   */
  public fun kinesisStream(): IStream? = unwrap(this).getKinesisStream()?.let(IStream::wrap)

  /**
   * Whether point-in-time recovery is enabled.
   *
   * Default: false
   */
  public fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

  /**
   * Resource policy to assign to DynamoDB Table.
   *
   * Default: - No resource policy statements are added to the created table.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html#cfn-dynamodb-globaltable-replicaspecification-resourcepolicy)
   */
  public fun resourcePolicy(): PolicyDocument? =
      unwrap(this).getResourcePolicy()?.let(PolicyDocument::wrap)

  /**
   * The table class.
   *
   * Default: TableClass.STANDARD
   */
  public fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

  /**
   * Tags to be applied to the table or replica table.
   *
   * Default: - no tags
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [TableOptionsV2]
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
     * @param kinesisStream Kinesis Data Stream to capture item level changes.
     */
    public fun kinesisStream(kinesisStream: IStream)

    /**
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    /**
     * @param resourcePolicy Resource policy to assign to DynamoDB Table.
     */
    public fun resourcePolicy(resourcePolicy: PolicyDocument)

    /**
     * @param resourcePolicy Resource policy to assign to DynamoDB Table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31d9374340158b2b3fe0d25aa45e06e7b7b0405e3e0f1deb28a433bf51c07dc4")
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
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableOptionsV2.Builder =
        software.amazon.awscdk.services.dynamodb.TableOptionsV2.builder()

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
     * @param kinesisStream Kinesis Data Stream to capture item level changes.
     */
    override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream.Companion::unwrap))
    }

    /**
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
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
    @JvmName("31d9374340158b2b3fe0d25aa45e06e7b7b0405e3e0f1deb28a433bf51c07dc4")
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

    public fun build(): software.amazon.awscdk.services.dynamodb.TableOptionsV2 = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.TableOptionsV2,
  ) : CdkObject(cdkObject),
      TableOptionsV2 {
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
     * Kinesis Data Stream to capture item level changes.
     *
     * Default: - no Kinesis Data Stream
     */
    override fun kinesisStream(): IStream? = unwrap(this).getKinesisStream()?.let(IStream::wrap)

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: false
     */
    override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): TableOptionsV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableOptionsV2):
        TableOptionsV2 = CdkObjectWrappers.wrap(cdkObject) as? TableOptionsV2 ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableOptionsV2):
        software.amazon.awscdk.services.dynamodb.TableOptionsV2 = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dynamodb.TableOptionsV2
  }
}
