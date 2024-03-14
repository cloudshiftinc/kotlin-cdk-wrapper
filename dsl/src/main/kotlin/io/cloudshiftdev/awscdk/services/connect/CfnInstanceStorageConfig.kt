package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceStorageConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The existing association identifier that uniquely identifies the resource type and storage
   * config for the given instance ID.
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The configuration of the Kinesis Firehose delivery stream.
   */
  public open fun kinesisFirehoseConfig(): Any? = unwrap(this).getKinesisFirehoseConfig()

  /**
   * The configuration of the Kinesis Firehose delivery stream.
   */
  public open fun kinesisFirehoseConfig(`value`: IResolvable) {
    unwrap(this).setKinesisFirehoseConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of the Kinesis Firehose delivery stream.
   */
  public open fun kinesisFirehoseConfig(`value`: KinesisFirehoseConfigProperty) {
    unwrap(this).setKinesisFirehoseConfig(`value`.let(KinesisFirehoseConfigProperty::unwrap))
  }

  /**
   * The configuration of the Kinesis Firehose delivery stream.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f829ccf1a9fb3cb8f251c7a520cbb503978cfd01a74f1c8113de828be418f2e3")
  public open fun kinesisFirehoseConfig(`value`: KinesisFirehoseConfigProperty.Builder.() -> Unit):
      Unit = kinesisFirehoseConfig(KinesisFirehoseConfigProperty(`value`))

  /**
   * The configuration of the Kinesis data stream.
   */
  public open fun kinesisStreamConfig(): Any? = unwrap(this).getKinesisStreamConfig()

  /**
   * The configuration of the Kinesis data stream.
   */
  public open fun kinesisStreamConfig(`value`: IResolvable) {
    unwrap(this).setKinesisStreamConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of the Kinesis data stream.
   */
  public open fun kinesisStreamConfig(`value`: KinesisStreamConfigProperty) {
    unwrap(this).setKinesisStreamConfig(`value`.let(KinesisStreamConfigProperty::unwrap))
  }

  /**
   * The configuration of the Kinesis data stream.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe90dbc14d057fc8df2d5e2f2dc3c1ed451aa8d0573f240f5bd4c0f7bb58cf1b")
  public open fun kinesisStreamConfig(`value`: KinesisStreamConfigProperty.Builder.() -> Unit): Unit
      = kinesisStreamConfig(KinesisStreamConfigProperty(`value`))

  /**
   * The configuration of the Kinesis video stream.
   */
  public open fun kinesisVideoStreamConfig(): Any? = unwrap(this).getKinesisVideoStreamConfig()

  /**
   * The configuration of the Kinesis video stream.
   */
  public open fun kinesisVideoStreamConfig(`value`: IResolvable) {
    unwrap(this).setKinesisVideoStreamConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of the Kinesis video stream.
   */
  public open fun kinesisVideoStreamConfig(`value`: KinesisVideoStreamConfigProperty) {
    unwrap(this).setKinesisVideoStreamConfig(`value`.let(KinesisVideoStreamConfigProperty::unwrap))
  }

  /**
   * The configuration of the Kinesis video stream.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80b2083296e858d8b30c96551ab620fac29935872c4a0965d86e899f3f388705")
  public open
      fun kinesisVideoStreamConfig(`value`: KinesisVideoStreamConfigProperty.Builder.() -> Unit):
      Unit = kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty(`value`))

  /**
   * A valid resource type.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * A valid resource type.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * The S3 bucket configuration.
   */
  public open fun s3Config(): Any? = unwrap(this).getS3Config()

  /**
   * The S3 bucket configuration.
   */
  public open fun s3Config(`value`: IResolvable) {
    unwrap(this).setS3Config(`value`.let(IResolvable::unwrap))
  }

  /**
   * The S3 bucket configuration.
   */
  public open fun s3Config(`value`: S3ConfigProperty) {
    unwrap(this).setS3Config(`value`.let(S3ConfigProperty::unwrap))
  }

  /**
   * The S3 bucket configuration.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df832be7b1bfc2e38144eaf8719e82917aed11a8447a219819ec47fae0992bb6")
  public open fun s3Config(`value`: S3ConfigProperty.Builder.() -> Unit): Unit =
      s3Config(S3ConfigProperty(`value`))

  /**
   * A valid storage type.
   */
  public open fun storageType(): String = unwrap(this).getStorageType()

  /**
   * A valid storage type.
   */
  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnInstanceStorageConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream. 
     */
    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable)

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream. 
     */
    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty)

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("837242d5661f3787c2b251575e565ac16b1cc8ddceaa3e928aba36258457650d")
    public
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty.Builder.() -> Unit)

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     * @param kinesisStreamConfig The configuration of the Kinesis data stream. 
     */
    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable)

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     * @param kinesisStreamConfig The configuration of the Kinesis data stream. 
     */
    public fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty)

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     * @param kinesisStreamConfig The configuration of the Kinesis data stream. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e0974cfd229ccc4f27fe13b7d0d51afc36bdd3fe5e372817ba019ba82b8bcd0")
    public
        fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit)

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream. 
     */
    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable)

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream. 
     */
    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty)

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8797446b9b75f207d018820b7ee612f83c154f89380c02505464e74e9c664e66")
    public
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty.Builder.() -> Unit)

    /**
     * A valid resource type.
     *
     * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
     * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-resourcetype)
     * @param resourceType A valid resource type. 
     */
    public fun resourceType(resourceType: String)

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     * @param s3Config The S3 bucket configuration. 
     */
    public fun s3Config(s3Config: IResolvable)

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     * @param s3Config The S3 bucket configuration. 
     */
    public fun s3Config(s3Config: S3ConfigProperty)

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     * @param s3Config The S3 bucket configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe316cdedce46a0df936d4f551a4a4e9e688aa09135bdd653b61fde43513318")
    public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)

    /**
     * A valid storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-storagetype)
     * @param storageType A valid storage type. 
     */
    public fun storageType(storageType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.Builder
        = software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream. 
     */
    override fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream. 
     */
    override fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(KinesisFirehoseConfigProperty::unwrap))
    }

    /**
     * The configuration of the Kinesis Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig)
     * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("837242d5661f3787c2b251575e565ac16b1cc8ddceaa3e928aba36258457650d")
    override
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty.Builder.() -> Unit):
        Unit = kinesisFirehoseConfig(KinesisFirehoseConfigProperty(kinesisFirehoseConfig))

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     * @param kinesisStreamConfig The configuration of the Kinesis data stream. 
     */
    override fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     * @param kinesisStreamConfig The configuration of the Kinesis data stream. 
     */
    override fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(KinesisStreamConfigProperty::unwrap))
    }

    /**
     * The configuration of the Kinesis data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig)
     * @param kinesisStreamConfig The configuration of the Kinesis data stream. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e0974cfd229ccc4f27fe13b7d0d51afc36bdd3fe5e372817ba019ba82b8bcd0")
    override
        fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit):
        Unit = kinesisStreamConfig(KinesisStreamConfigProperty(kinesisStreamConfig))

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream. 
     */
    override fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream. 
     */
    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(KinesisVideoStreamConfigProperty::unwrap))
    }

    /**
     * The configuration of the Kinesis video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig)
     * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8797446b9b75f207d018820b7ee612f83c154f89380c02505464e74e9c664e66")
    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty.Builder.() -> Unit):
        Unit = kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty(kinesisVideoStreamConfig))

    /**
     * A valid resource type.
     *
     * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
     * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-resourcetype)
     * @param resourceType A valid resource type. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     * @param s3Config The S3 bucket configuration. 
     */
    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
    }

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     * @param s3Config The S3 bucket configuration. 
     */
    override fun s3Config(s3Config: S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
    }

    /**
     * The S3 bucket configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-s3config)
     * @param s3Config The S3 bucket configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe316cdedce46a0df936d4f551a4a4e9e688aa09135bdd653b61fde43513318")
    override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
        s3Config(S3ConfigProperty(s3Config))

    /**
     * A valid storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html#cfn-connect-instancestorageconfig-storagetype)
     * @param storageType A valid storage type. 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnInstanceStorageConfig =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceStorageConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceStorageConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig):
        CfnInstanceStorageConfig = CfnInstanceStorageConfig(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceStorageConfig):
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfig = wrapped.cdkObject
  }

  public interface KinesisStreamConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the data stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisstreamconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig-streamarn)
     */
    public fun streamArn(): String

    /**
     * A builder for [KinesisStreamConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param streamArn The Amazon Resource Name (ARN) of the data stream. 
       */
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty.builder()

      /**
       * @param streamArn The Amazon Resource Name (ARN) of the data stream. 
       */
      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty,
    ) : CdkObject(cdkObject), KinesisStreamConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the data stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisstreamconfig.html#cfn-connect-instancestorageconfig-kinesisstreamconfig-streamarn)
       */
      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty):
          KinesisStreamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty
    }
  }

  public interface KinesisFirehoseConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisfirehoseconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig-firehosearn)
     */
    public fun firehoseArn(): String

    /**
     * A builder for [KinesisFirehoseConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param firehoseArn The Amazon Resource Name (ARN) of the delivery stream. 
       */
      public fun firehoseArn(firehoseArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.builder()

      /**
       * @param firehoseArn The Amazon Resource Name (ARN) of the delivery stream. 
       */
      override fun firehoseArn(firehoseArn: String) {
        cdkBuilder.firehoseArn(firehoseArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty,
    ) : CdkObject(cdkObject), KinesisFirehoseConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisfirehoseconfig.html#cfn-connect-instancestorageconfig-kinesisfirehoseconfig-firehosearn)
       */
      override fun firehoseArn(): String = unwrap(this).getFirehoseArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty):
          KinesisFirehoseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty
    }
  }

  public interface S3ConfigProperty {
    /**
     * The S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html#cfn-connect-instancestorageconfig-s3config-bucketname)
     */
    public fun bucketName(): String

    /**
     * The S3 bucket prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html#cfn-connect-instancestorageconfig-s3config-bucketprefix)
     */
    public fun bucketPrefix(): String

    /**
     * The Amazon S3 encryption configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html#cfn-connect-instancestorageconfig-s3config-encryptionconfig)
     */
    public fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

    /**
     * A builder for [S3ConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The S3 bucket name. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The S3 bucket prefix. 
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param encryptionConfig The Amazon S3 encryption configuration.
       */
      public fun encryptionConfig(encryptionConfig: IResolvable)

      /**
       * @param encryptionConfig The Amazon S3 encryption configuration.
       */
      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty)

      /**
       * @param encryptionConfig The Amazon S3 encryption configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b587ea16dac97f9b6a3f7d9059384e699de7c3a22d9d30a3631948349c4dbec")
      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty.builder()

      /**
       * @param bucketName The S3 bucket name. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The S3 bucket prefix. 
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param encryptionConfig The Amazon S3 encryption configuration.
       */
      override fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionConfig The Amazon S3 encryption configuration.
       */
      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(EncryptionConfigProperty::unwrap))
      }

      /**
       * @param encryptionConfig The Amazon S3 encryption configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b587ea16dac97f9b6a3f7d9059384e699de7c3a22d9d30a3631948349c4dbec")
      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit):
          Unit = encryptionConfig(EncryptionConfigProperty(encryptionConfig))

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty,
    ) : CdkObject(cdkObject), S3ConfigProperty {
      /**
       * The S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html#cfn-connect-instancestorageconfig-s3config-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The S3 bucket prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html#cfn-connect-instancestorageconfig-s3config-bucketprefix)
       */
      override fun bucketPrefix(): String = unwrap(this).getBucketPrefix()

      /**
       * The Amazon S3 encryption configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html#cfn-connect-instancestorageconfig-s3config-encryptionconfig)
       */
      override fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty):
          S3ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty
    }
  }

  public interface KinesisVideoStreamConfigProperty {
    /**
     * The encryption configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig-encryptionconfig)
     */
    public fun encryptionConfig(): Any

    /**
     * The prefix of the video stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig-prefix)
     */
    public fun prefix(): String

    /**
     * The number of hours data is retained in the stream.
     *
     * Kinesis Video Streams retains the data in a data store that is associated with the stream.
     *
     * The default value is 0, indicating that the stream does not persist data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig-retentionperiodhours)
     */
    public fun retentionPeriodHours(): Number

    /**
     * A builder for [KinesisVideoStreamConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionConfig The encryption configuration. 
       */
      public fun encryptionConfig(encryptionConfig: IResolvable)

      /**
       * @param encryptionConfig The encryption configuration. 
       */
      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty)

      /**
       * @param encryptionConfig The encryption configuration. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03ae3056e2f0c36164b8c11bc25a478da4c222920ea05c9641948476c5ef590f")
      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit)

      /**
       * @param prefix The prefix of the video stream. 
       */
      public fun prefix(prefix: String)

      /**
       * @param retentionPeriodHours The number of hours data is retained in the stream. 
       * Kinesis Video Streams retains the data in a data store that is associated with the stream.
       *
       * The default value is 0, indicating that the stream does not persist data.
       */
      public fun retentionPeriodHours(retentionPeriodHours: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.builder()

      /**
       * @param encryptionConfig The encryption configuration. 
       */
      override fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionConfig The encryption configuration. 
       */
      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(EncryptionConfigProperty::unwrap))
      }

      /**
       * @param encryptionConfig The encryption configuration. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03ae3056e2f0c36164b8c11bc25a478da4c222920ea05c9641948476c5ef590f")
      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit):
          Unit = encryptionConfig(EncryptionConfigProperty(encryptionConfig))

      /**
       * @param prefix The prefix of the video stream. 
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param retentionPeriodHours The number of hours data is retained in the stream. 
       * Kinesis Video Streams retains the data in a data store that is associated with the stream.
       *
       * The default value is 0, indicating that the stream does not persist data.
       */
      override fun retentionPeriodHours(retentionPeriodHours: Number) {
        cdkBuilder.retentionPeriodHours(retentionPeriodHours)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty,
    ) : CdkObject(cdkObject), KinesisVideoStreamConfigProperty {
      /**
       * The encryption configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig-encryptionconfig)
       */
      override fun encryptionConfig(): Any = unwrap(this).getEncryptionConfig()

      /**
       * The prefix of the video stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig-prefix)
       */
      override fun prefix(): String = unwrap(this).getPrefix()

      /**
       * The number of hours data is retained in the stream.
       *
       * Kinesis Video Streams retains the data in a data store that is associated with the stream.
       *
       * The default value is 0, indicating that the stream does not persist data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html#cfn-connect-instancestorageconfig-kinesisvideostreamconfig-retentionperiodhours)
       */
      override fun retentionPeriodHours(): Number = unwrap(this).getRetentionPeriodHours()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisVideoStreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty):
          KinesisVideoStreamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisVideoStreamConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty
    }
  }

  public interface EncryptionConfigProperty {
    /**
     * The type of encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-encryptionconfig.html#cfn-connect-instancestorageconfig-encryptionconfig-encryptiontype)
     */
    public fun encryptionType(): String

    /**
     * The full ARN of the encryption key.
     *
     *
     * Be sure to provide the full ARN of the encryption key, not just the ID.
     *
     * Amazon Connect supports only KMS keys with the default key spec of
     * [`SYMMETRIC_DEFAULT`](https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-symmetric-default)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-encryptionconfig.html#cfn-connect-instancestorageconfig-encryptionconfig-keyid)
     */
    public fun keyId(): String

    /**
     * A builder for [EncryptionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionType The type of encryption. 
       */
      public fun encryptionType(encryptionType: String)

      /**
       * @param keyId The full ARN of the encryption key. 
       *
       * Be sure to provide the full ARN of the encryption key, not just the ID.
       *
       * Amazon Connect supports only KMS keys with the default key spec of
       * [`SYMMETRIC_DEFAULT`](https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-symmetric-default)
       * .
       */
      public fun keyId(keyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty.builder()

      /**
       * @param encryptionType The type of encryption. 
       */
      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      /**
       * @param keyId The full ARN of the encryption key. 
       *
       * Be sure to provide the full ARN of the encryption key, not just the ID.
       *
       * Amazon Connect supports only KMS keys with the default key spec of
       * [`SYMMETRIC_DEFAULT`](https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-symmetric-default)
       * .
       */
      override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty,
    ) : CdkObject(cdkObject), EncryptionConfigProperty {
      /**
       * The type of encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-encryptionconfig.html#cfn-connect-instancestorageconfig-encryptionconfig-encryptiontype)
       */
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      /**
       * The full ARN of the encryption key.
       *
       *
       * Be sure to provide the full ARN of the encryption key, not just the ID.
       *
       * Amazon Connect supports only KMS keys with the default key spec of
       * [`SYMMETRIC_DEFAULT`](https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-symmetric-default)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-encryptionconfig.html#cfn-connect-instancestorageconfig-encryptionconfig-keyid)
       */
      override fun keyId(): String = unwrap(this).getKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty):
          EncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty
    }
  }
}
