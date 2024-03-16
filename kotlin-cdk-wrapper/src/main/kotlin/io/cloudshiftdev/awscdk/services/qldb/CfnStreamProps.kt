@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qldb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qldb.*;
 * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
 * .inclusiveStartTime("inclusiveStartTime")
 * .kinesisConfiguration(KinesisConfigurationProperty.builder()
 * .aggregationEnabled(false)
 * .streamArn("streamArn")
 * .build())
 * .ledgerName("ledgerName")
 * .roleArn("roleArn")
 * .streamName("streamName")
 * // the properties below are optional
 * .exclusiveEndTime("exclusiveEndTime")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html)
 */
public interface CfnStreamProps {
  /**
   * The exclusive date and time that specifies when the stream ends.
   *
   * If you don't define this parameter, the stream runs indefinitely until you cancel it.
   *
   * The `ExclusiveEndTime` must be in `ISO 8601` date and time format and in Universal Coordinated
   * Time (UTC). For example: `2019-06-13T21:36:34Z` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-exclusiveendtime)
   */
  public fun exclusiveEndTime(): String? = unwrap(this).getExclusiveEndTime()

  /**
   * The inclusive start date and time from which to start streaming journal data.
   *
   * This parameter must be in `ISO 8601` date and time format and in Universal Coordinated Time
   * (UTC). For example: `2019-06-13T21:36:34Z` .
   *
   * The `InclusiveStartTime` cannot be in the future and must be before `ExclusiveEndTime` .
   *
   * If you provide an `InclusiveStartTime` that is before the ledger's `CreationDateTime` , QLDB
   * effectively defaults it to the ledger's `CreationDateTime` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-inclusivestarttime)
   */
  public fun inclusiveStartTime(): String

  /**
   * The configuration settings of the Kinesis Data Streams destination for your stream request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
   */
  public fun kinesisConfiguration(): Any

  /**
   * The name of the ledger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-ledgername)
   */
  public fun ledgerName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal
   * stream to write data records to a Kinesis Data Streams resource.
   *
   * To pass a role to QLDB when requesting a journal stream, you must have permissions to perform
   * the `iam:PassRole` action on the IAM role resource. This is required for all journal stream
   * requests.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-rolearn)
   */
  public fun roleArn(): String

  /**
   * The name that you want to assign to the QLDB journal stream.
   *
   * User-defined names can help identify and indicate the purpose of a stream.
   *
   * Your stream name must be unique among other *active* streams for a given ledger. Stream names
   * have the same naming constraints as ledger names, as defined in [Quotas in Amazon
   * QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming) in the
   * *Amazon QLDB Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-streamname)
   */
  public fun streamName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param exclusiveEndTime The exclusive date and time that specifies when the stream ends.
     * If you don't define this parameter, the stream runs indefinitely until you cancel it.
     *
     * The `ExclusiveEndTime` must be in `ISO 8601` date and time format and in Universal
     * Coordinated Time (UTC). For example: `2019-06-13T21:36:34Z` .
     */
    public fun exclusiveEndTime(exclusiveEndTime: String)

    /**
     * @param inclusiveStartTime The inclusive start date and time from which to start streaming
     * journal data. 
     * This parameter must be in `ISO 8601` date and time format and in Universal Coordinated Time
     * (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * The `InclusiveStartTime` cannot be in the future and must be before `ExclusiveEndTime` .
     *
     * If you provide an `InclusiveStartTime` that is before the ledger's `CreationDateTime` , QLDB
     * effectively defaults it to the ledger's `CreationDateTime` .
     */
    public fun inclusiveStartTime(inclusiveStartTime: String)

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    public fun kinesisConfiguration(kinesisConfiguration: IResolvable)

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    public fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty)

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d4894f839dfa44249faaca40814fa1b334b6d61869dde6c19f666bb4db9aeb")
    public
        fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty.Builder.() -> Unit)

    /**
     * @param ledgerName The name of the ledger. 
     */
    public fun ledgerName(ledgerName: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions
     * for a journal stream to write data records to a Kinesis Data Streams resource. 
     * To pass a role to QLDB when requesting a journal stream, you must have permissions to perform
     * the `iam:PassRole` action on the IAM role resource. This is required for all journal stream
     * requests.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param streamName The name that you want to assign to the QLDB journal stream. 
     * User-defined names can help identify and indicate the purpose of a stream.
     *
     * Your stream name must be unique among other *active* streams for a given ledger. Stream names
     * have the same naming constraints as ledger names, as defined in [Quotas in Amazon
     * QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming) in the
     * *Amazon QLDB Developer Guide* .
     */
    public fun streamName(streamName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qldb.CfnStreamProps.Builder =
        software.amazon.awscdk.services.qldb.CfnStreamProps.builder()

    /**
     * @param exclusiveEndTime The exclusive date and time that specifies when the stream ends.
     * If you don't define this parameter, the stream runs indefinitely until you cancel it.
     *
     * The `ExclusiveEndTime` must be in `ISO 8601` date and time format and in Universal
     * Coordinated Time (UTC). For example: `2019-06-13T21:36:34Z` .
     */
    override fun exclusiveEndTime(exclusiveEndTime: String) {
      cdkBuilder.exclusiveEndTime(exclusiveEndTime)
    }

    /**
     * @param inclusiveStartTime The inclusive start date and time from which to start streaming
     * journal data. 
     * This parameter must be in `ISO 8601` date and time format and in Universal Coordinated Time
     * (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * The `InclusiveStartTime` cannot be in the future and must be before `ExclusiveEndTime` .
     *
     * If you provide an `InclusiveStartTime` that is before the ledger's `CreationDateTime` , QLDB
     * effectively defaults it to the ledger's `CreationDateTime` .
     */
    override fun inclusiveStartTime(inclusiveStartTime: String) {
      cdkBuilder.inclusiveStartTime(inclusiveStartTime)
    }

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    override fun kinesisConfiguration(kinesisConfiguration: IResolvable) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    override
        fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(CfnStream.KinesisConfigurationProperty::unwrap))
    }

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     * destination for your stream request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d4894f839dfa44249faaca40814fa1b334b6d61869dde6c19f666bb4db9aeb")
    override
        fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty.Builder.() -> Unit):
        Unit = kinesisConfiguration(CfnStream.KinesisConfigurationProperty(kinesisConfiguration))

    /**
     * @param ledgerName The name of the ledger. 
     */
    override fun ledgerName(ledgerName: String) {
      cdkBuilder.ledgerName(ledgerName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions
     * for a journal stream to write data records to a Kinesis Data Streams resource. 
     * To pass a role to QLDB when requesting a journal stream, you must have permissions to perform
     * the `iam:PassRole` action on the IAM role resource. This is required for all journal stream
     * requests.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param streamName The name that you want to assign to the QLDB journal stream. 
     * User-defined names can help identify and indicate the purpose of a stream.
     *
     * Your stream name must be unique among other *active* streams for a given ledger. Stream names
     * have the same naming constraints as ledger names, as defined in [Quotas in Amazon
     * QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming) in the
     * *Amazon QLDB Developer Guide* .
     */
    override fun streamName(streamName: String) {
      cdkBuilder.streamName(streamName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qldb.CfnStreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.qldb.CfnStreamProps,
  ) : CdkObject(cdkObject), CfnStreamProps {
    /**
     * The exclusive date and time that specifies when the stream ends.
     *
     * If you don't define this parameter, the stream runs indefinitely until you cancel it.
     *
     * The `ExclusiveEndTime` must be in `ISO 8601` date and time format and in Universal
     * Coordinated Time (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-exclusiveendtime)
     */
    override fun exclusiveEndTime(): String? = unwrap(this).getExclusiveEndTime()

    /**
     * The inclusive start date and time from which to start streaming journal data.
     *
     * This parameter must be in `ISO 8601` date and time format and in Universal Coordinated Time
     * (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * The `InclusiveStartTime` cannot be in the future and must be before `ExclusiveEndTime` .
     *
     * If you provide an `InclusiveStartTime` that is before the ledger's `CreationDateTime` , QLDB
     * effectively defaults it to the ledger's `CreationDateTime` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-inclusivestarttime)
     */
    override fun inclusiveStartTime(): String = unwrap(this).getInclusiveStartTime()

    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-kinesisconfiguration)
     */
    override fun kinesisConfiguration(): Any = unwrap(this).getKinesisConfiguration()

    /**
     * The name of the ledger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-ledgername)
     */
    override fun ledgerName(): String = unwrap(this).getLedgerName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal
     * stream to write data records to a Kinesis Data Streams resource.
     *
     * To pass a role to QLDB when requesting a journal stream, you must have permissions to perform
     * the `iam:PassRole` action on the IAM role resource. This is required for all journal stream
     * requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The name that you want to assign to the QLDB journal stream.
     *
     * User-defined names can help identify and indicate the purpose of a stream.
     *
     * Your stream name must be unique among other *active* streams for a given ledger. Stream names
     * have the same naming constraints as ledger names, as defined in [Quotas in Amazon
     * QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming) in the
     * *Amazon QLDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-streamname)
     */
    override fun streamName(): String = unwrap(this).getStreamName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html#cfn-qldb-stream-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnStreamProps):
        CfnStreamProps = CdkObjectWrappers.wrap(cdkObject) as CfnStreamProps

    internal fun unwrap(wrapped: CfnStreamProps):
        software.amazon.awscdk.services.qldb.CfnStreamProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.qldb.CfnStreamProps
  }
}
