@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInstanceStorageConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnInstanceStorageConfigProps cfnInstanceStorageConfigProps =
 * CfnInstanceStorageConfigProps.builder()
 * .instanceArn("instanceArn")
 * .resourceType("resourceType")
 * .storageType("storageType")
 * // the properties below are optional
 * .kinesisFirehoseConfig(KinesisFirehoseConfigProperty.builder()
 * .firehoseArn("firehoseArn")
 * .build())
 * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
 * .streamArn("streamArn")
 * .build())
 * .kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty.builder()
 * .encryptionConfig(EncryptionConfigProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .prefix("prefix")
 * .retentionPeriodHours(123)
 * .build())
 * .s3Config(S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * // the properties below are optional
 * .encryptionConfig(EncryptionConfigProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html)
 */
public interface CfnInstanceStorageConfigProps {
  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The configuration of the Kinesis Firehose delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
   */
  public fun kinesisFirehoseConfig(): Any? = unwrap(this).getKinesisFirehoseConfig()

  /**
   * The configuration of the Kinesis data stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
   */
  public fun kinesisStreamConfig(): Any? = unwrap(this).getKinesisStreamConfig()

  /**
   * The configuration of the Kinesis video stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
   */
  public fun kinesisVideoStreamConfig(): Any? = unwrap(this).getKinesisVideoStreamConfig()

  /**
   * A valid resource type.
   *
   * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
   * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-resourcetype)
   */
  public fun resourceType(): String

  /**
   * The S3 bucket configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
   */
  public fun s3Config(): Any? = unwrap(this).getS3Config()

  /**
   * A valid storage type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-storagetype)
   */
  public fun storageType(): String

  /**
   * A builder for [CfnInstanceStorageConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable)

    /**
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    public
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty)

    /**
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f939387890bbef1e631967af20e190c6bd1ae637316c38d992c17fa899a77e7e")
    public
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder.() -> Unit)

    /**
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable)

    /**
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    public
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty)

    /**
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f964d777fe3257da6aab597537b8fcac5df036916048e8644404f58c1b4acc")
    public
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder.() -> Unit)

    /**
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable)

    /**
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    public
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty)

    /**
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fcd69952ced2cc8c898f8a8ad318b90713a1d3b9a81f264e6aca7f92897bdde")
    public
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder.() -> Unit)

    /**
     * @param resourceType A valid resource type. 
     * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
     * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
     */
    public fun resourceType(resourceType: String)

    /**
     * @param s3Config The S3 bucket configuration.
     */
    public fun s3Config(s3Config: IResolvable)

    /**
     * @param s3Config The S3 bucket configuration.
     */
    public fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty)

    /**
     * @param s3Config The S3 bucket configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d82f0bd8cd95ff5062bb481b56ca2bd931d5deeab25df14606a61f363e0fddfb")
    public fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty.Builder.() -> Unit)

    /**
     * @param storageType A valid storage type. 
     */
    public fun storageType(storageType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps.Builder =
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps.builder()

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    override fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(IResolvable::unwrap))
    }

    /**
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    override
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(CfnInstanceStorageConfig.KinesisFirehoseConfigProperty::unwrap))
    }

    /**
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f939387890bbef1e631967af20e190c6bd1ae637316c38d992c17fa899a77e7e")
    override
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder.() -> Unit):
        Unit =
        kinesisFirehoseConfig(CfnInstanceStorageConfig.KinesisFirehoseConfigProperty(kinesisFirehoseConfig))

    /**
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    override fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(IResolvable::unwrap))
    }

    /**
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    override
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(CfnInstanceStorageConfig.KinesisStreamConfigProperty::unwrap))
    }

    /**
     * @param kinesisStreamConfig The configuration of the Kinesis data stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f964d777fe3257da6aab597537b8fcac5df036916048e8644404f58c1b4acc")
    override
        fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamConfig(CfnInstanceStorageConfig.KinesisStreamConfigProperty(kinesisStreamConfig))

    /**
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    override fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(IResolvable::unwrap))
    }

    /**
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty::unwrap))
    }

    /**
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fcd69952ced2cc8c898f8a8ad318b90713a1d3b9a81f264e6aca7f92897bdde")
    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder.() -> Unit):
        Unit =
        kinesisVideoStreamConfig(CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty(kinesisVideoStreamConfig))

    /**
     * @param resourceType A valid resource type. 
     * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
     * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param s3Config The S3 bucket configuration.
     */
    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
    }

    /**
     * @param s3Config The S3 bucket configuration.
     */
    override fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(CfnInstanceStorageConfig.S3ConfigProperty::unwrap))
    }

    /**
     * @param s3Config The S3 bucket configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d82f0bd8cd95ff5062bb481b56ca2bd931d5deeab25df14606a61f363e0fddfb")
    override fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty.Builder.() -> Unit):
        Unit = s3Config(CfnInstanceStorageConfig.S3ConfigProperty(s3Config))

    /**
     * @param storageType A valid storage type. 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps,
  ) : CdkObject(cdkObject), CfnInstanceStorageConfigProps {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     */
    override fun kinesisFirehoseConfig(): Any? = unwrap(this).getKinesisFirehoseConfig()

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     */
    override fun kinesisStreamConfig(): Any? = unwrap(this).getKinesisStreamConfig()

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     */
    override fun kinesisVideoStreamConfig(): Any? = unwrap(this).getKinesisVideoStreamConfig()

    /**
     * A valid resource type.
     *
     * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
     * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-resourcetype)
     */
    override fun resourceType(): String = unwrap(this).getResourceType()

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     */
    override fun s3Config(): Any? = unwrap(this).getS3Config()

    /**
     * A valid storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-storagetype)
     */
    override fun storageType(): String = unwrap(this).getStorageType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceStorageConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps):
        CfnInstanceStorageConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInstanceStorageConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceStorageConfigProps):
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps
  }
}
