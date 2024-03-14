package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

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
      cdkBuilder.kinesisStream(kinesisStream.let(IStream::unwrap))
    }

    /**
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * @param tableClass The table class.
     */
    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    /**
     * @param tags Tags to be applied to the table or replica table.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags to be applied to the table or replica table.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dynamodb.TableOptionsV2 = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.TableOptionsV2,
  ) : TableOptionsV2 {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TableOptionsV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableOptionsV2):
        TableOptionsV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableOptionsV2):
        software.amazon.awscdk.services.dynamodb.TableOptionsV2 = (wrapped as Wrapper).cdkObject
  }
}
