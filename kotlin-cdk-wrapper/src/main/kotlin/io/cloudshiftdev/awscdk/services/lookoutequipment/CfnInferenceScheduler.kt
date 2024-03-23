@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lookoutequipment

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a scheduled inference.
 *
 * Scheduling an inference is setting up a continuous real-time inference plan to analyze new
 * measurement data. When setting up the schedule, you provide an Amazon S3 bucket location for the
 * input data, assign it a delimiter between separate entries in the data, set an offset delay if
 * desired, and set the frequency of inferencing. You must also provide an Amazon S3 bucket location
 * for the output data.
 *
 *
 * Updating some properties below (for example, InferenceSchedulerName and ServerSideKmsKeyId)
 * triggers a resource replacement, which requires a new model. To replace such a property using AWS
 * CloudFormation , but without creating a completely new stack, you must replace ModelName. If you
 * need to replace the property, but want to use the same model, delete the current stack and create a
 * new one with the updated properties.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lookoutequipment.*;
 * Object dataInputConfiguration;
 * Object dataOutputConfiguration;
 * CfnInferenceScheduler cfnInferenceScheduler = CfnInferenceScheduler.Builder.create(this,
 * "MyCfnInferenceScheduler")
 * .dataInputConfiguration(dataInputConfiguration)
 * .dataOutputConfiguration(dataOutputConfiguration)
 * .dataUploadFrequency("dataUploadFrequency")
 * .modelName("modelName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .dataDelayOffsetInMinutes(123)
 * .inferenceSchedulerName("inferenceSchedulerName")
 * .serverSideKmsKeyId("serverSideKmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html)
 */
public open class CfnInferenceScheduler internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInferenceSchedulerProps,
  ) :
      this(software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInferenceSchedulerProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInferenceSchedulerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInferenceSchedulerProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the inference scheduler being created.
   */
  public open fun attrInferenceSchedulerArn(): String = unwrap(this).getAttrInferenceSchedulerArn()

  /**
   * A period of time (in minutes) by which inference on the data is delayed after the data starts.
   */
  public open fun dataDelayOffsetInMinutes(): Number? = unwrap(this).getDataDelayOffsetInMinutes()

  /**
   * A period of time (in minutes) by which inference on the data is delayed after the data starts.
   */
  public open fun dataDelayOffsetInMinutes(`value`: Number) {
    unwrap(this).setDataDelayOffsetInMinutes(`value`)
  }

  /**
   * Specifies configuration information for the input data for the inference scheduler, including
   * delimiter, format, and dataset location.
   */
  public open fun dataInputConfiguration(): Any = unwrap(this).getDataInputConfiguration()

  /**
   * Specifies configuration information for the input data for the inference scheduler, including
   * delimiter, format, and dataset location.
   */
  public open fun dataInputConfiguration(`value`: Any) {
    unwrap(this).setDataInputConfiguration(`value`)
  }

  /**
   * Specifies configuration information for the output results for the inference scheduler,
   * including the Amazon S3 location for the output.
   */
  public open fun dataOutputConfiguration(): Any = unwrap(this).getDataOutputConfiguration()

  /**
   * Specifies configuration information for the output results for the inference scheduler,
   * including the Amazon S3 location for the output.
   */
  public open fun dataOutputConfiguration(`value`: Any) {
    unwrap(this).setDataOutputConfiguration(`value`)
  }

  /**
   * How often data is uploaded to the source S3 bucket for the input data.
   */
  public open fun dataUploadFrequency(): String = unwrap(this).getDataUploadFrequency()

  /**
   * How often data is uploaded to the source S3 bucket for the input data.
   */
  public open fun dataUploadFrequency(`value`: String) {
    unwrap(this).setDataUploadFrequency(`value`)
  }

  /**
   * The name of the inference scheduler.
   */
  public open fun inferenceSchedulerName(): String? = unwrap(this).getInferenceSchedulerName()

  /**
   * The name of the inference scheduler.
   */
  public open fun inferenceSchedulerName(`value`: String) {
    unwrap(this).setInferenceSchedulerName(`value`)
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
   * The name of the machine learning model used for the inference scheduler.
   */
  public open fun modelName(): String = unwrap(this).getModelName()

  /**
   * The name of the machine learning model used for the inference scheduler.
   */
  public open fun modelName(`value`: String) {
    unwrap(this).setModelName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source being used
   * for the inference.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source being used
   * for the inference.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Provides the identifier of the AWS KMS key used to encrypt inference scheduler data by Amazon
   * Lookout for Equipment .
   */
  public open fun serverSideKmsKeyId(): String? = unwrap(this).getServerSideKmsKeyId()

  /**
   * Provides the identifier of the AWS KMS key used to encrypt inference scheduler data by Amazon
   * Lookout for Equipment .
   */
  public open fun serverSideKmsKeyId(`value`: String) {
    unwrap(this).setServerSideKmsKeyId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags associated with the inference scheduler.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags associated with the inference scheduler.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags associated with the inference scheduler.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lookoutequipment.CfnInferenceScheduler].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A period of time (in minutes) by which inference on the data is delayed after the data
     * starts.
     *
     * For instance, if an offset delay time of five minutes was selected, inference will not begin
     * on the data until the first data measurement after the five minute mark. For example, if five
     * minutes is selected, the inference scheduler will wake up at the configured frequency with the
     * additional five minute delay time to check the customer S3 bucket. The customer can upload data
     * at the same frequency and they don't need to stop and restart the scheduler when uploading new
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datadelayoffsetinminutes)
     * @param dataDelayOffsetInMinutes A period of time (in minutes) by which inference on the data
     * is delayed after the data starts. 
     */
    public fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number)

    /**
     * Specifies configuration information for the input data for the inference scheduler, including
     * delimiter, format, and dataset location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration)
     * @param dataInputConfiguration Specifies configuration information for the input data for the
     * inference scheduler, including delimiter, format, and dataset location. 
     */
    public fun dataInputConfiguration(dataInputConfiguration: Any)

    /**
     * Specifies configuration information for the output results for the inference scheduler,
     * including the Amazon S3 location for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration)
     * @param dataOutputConfiguration Specifies configuration information for the output results for
     * the inference scheduler, including the Amazon S3 location for the output. 
     */
    public fun dataOutputConfiguration(dataOutputConfiguration: Any)

    /**
     * How often data is uploaded to the source S3 bucket for the input data.
     *
     * This value is the length of time between data uploads. For instance, if you select 5 minutes,
     * Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5
     * minutes. This frequency also determines how often Amazon Lookout for Equipment starts a
     * scheduled inference on your data. In this example, it starts once every 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datauploadfrequency)
     * @param dataUploadFrequency How often data is uploaded to the source S3 bucket for the input
     * data. 
     */
    public fun dataUploadFrequency(dataUploadFrequency: String)

    /**
     * The name of the inference scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-inferenceschedulername)
     * @param inferenceSchedulerName The name of the inference scheduler. 
     */
    public fun inferenceSchedulerName(inferenceSchedulerName: String)

    /**
     * The name of the machine learning model used for the inference scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-modelname)
     * @param modelName The name of the machine learning model used for the inference scheduler. 
     */
    public fun modelName(modelName: String)

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used
     * for the inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source being used for the inference. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Provides the identifier of the AWS KMS key used to encrypt inference scheduler data by Amazon
     * Lookout for Equipment .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-serversidekmskeyid)
     * @param serverSideKmsKeyId Provides the identifier of the AWS KMS key used to encrypt
     * inference scheduler data by Amazon Lookout for Equipment . 
     */
    public fun serverSideKmsKeyId(serverSideKmsKeyId: String)

    /**
     * Any tags associated with the inference scheduler.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-tags)
     * @param tags Any tags associated with the inference scheduler. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags associated with the inference scheduler.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-tags)
     * @param tags Any tags associated with the inference scheduler. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.Builder =
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.Builder.create(scope,
        id)

    /**
     * A period of time (in minutes) by which inference on the data is delayed after the data
     * starts.
     *
     * For instance, if an offset delay time of five minutes was selected, inference will not begin
     * on the data until the first data measurement after the five minute mark. For example, if five
     * minutes is selected, the inference scheduler will wake up at the configured frequency with the
     * additional five minute delay time to check the customer S3 bucket. The customer can upload data
     * at the same frequency and they don't need to stop and restart the scheduler when uploading new
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datadelayoffsetinminutes)
     * @param dataDelayOffsetInMinutes A period of time (in minutes) by which inference on the data
     * is delayed after the data starts. 
     */
    override fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number) {
      cdkBuilder.dataDelayOffsetInMinutes(dataDelayOffsetInMinutes)
    }

    /**
     * Specifies configuration information for the input data for the inference scheduler, including
     * delimiter, format, and dataset location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration)
     * @param dataInputConfiguration Specifies configuration information for the input data for the
     * inference scheduler, including delimiter, format, and dataset location. 
     */
    override fun dataInputConfiguration(dataInputConfiguration: Any) {
      cdkBuilder.dataInputConfiguration(dataInputConfiguration)
    }

    /**
     * Specifies configuration information for the output results for the inference scheduler,
     * including the Amazon S3 location for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration)
     * @param dataOutputConfiguration Specifies configuration information for the output results for
     * the inference scheduler, including the Amazon S3 location for the output. 
     */
    override fun dataOutputConfiguration(dataOutputConfiguration: Any) {
      cdkBuilder.dataOutputConfiguration(dataOutputConfiguration)
    }

    /**
     * How often data is uploaded to the source S3 bucket for the input data.
     *
     * This value is the length of time between data uploads. For instance, if you select 5 minutes,
     * Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5
     * minutes. This frequency also determines how often Amazon Lookout for Equipment starts a
     * scheduled inference on your data. In this example, it starts once every 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datauploadfrequency)
     * @param dataUploadFrequency How often data is uploaded to the source S3 bucket for the input
     * data. 
     */
    override fun dataUploadFrequency(dataUploadFrequency: String) {
      cdkBuilder.dataUploadFrequency(dataUploadFrequency)
    }

    /**
     * The name of the inference scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-inferenceschedulername)
     * @param inferenceSchedulerName The name of the inference scheduler. 
     */
    override fun inferenceSchedulerName(inferenceSchedulerName: String) {
      cdkBuilder.inferenceSchedulerName(inferenceSchedulerName)
    }

    /**
     * The name of the machine learning model used for the inference scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-modelname)
     * @param modelName The name of the machine learning model used for the inference scheduler. 
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used
     * for the inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source being used for the inference. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Provides the identifier of the AWS KMS key used to encrypt inference scheduler data by Amazon
     * Lookout for Equipment .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-serversidekmskeyid)
     * @param serverSideKmsKeyId Provides the identifier of the AWS KMS key used to encrypt
     * inference scheduler data by Amazon Lookout for Equipment . 
     */
    override fun serverSideKmsKeyId(serverSideKmsKeyId: String) {
      cdkBuilder.serverSideKmsKeyId(serverSideKmsKeyId)
    }

    /**
     * Any tags associated with the inference scheduler.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-tags)
     * @param tags Any tags associated with the inference scheduler. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags associated with the inference scheduler.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-tags)
     * @param tags Any tags associated with the inference scheduler. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInferenceScheduler {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInferenceScheduler(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler):
        CfnInferenceScheduler = CfnInferenceScheduler(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceScheduler):
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler = wrapped.cdkObject
  }

  /**
   * Specifies configuration information for the input data for the inference scheduler, including
   * delimiter, format, and dataset location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutequipment.*;
   * DataInputConfigurationProperty dataInputConfigurationProperty =
   * DataInputConfigurationProperty.builder()
   * .s3InputConfiguration(S3InputConfigurationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .inferenceInputNameConfiguration(InputNameConfigurationProperty.builder()
   * .componentTimestampDelimiter("componentTimestampDelimiter")
   * .timestampFormat("timestampFormat")
   * .build())
   * .inputTimeZoneOffset("inputTimeZoneOffset")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html)
   */
  public interface DataInputConfigurationProperty {
    /**
     * Specifies configuration information for the input data for the inference, including timestamp
     * format and delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration-inferenceinputnameconfiguration)
     */
    public fun inferenceInputNameConfiguration(): Any? =
        unwrap(this).getInferenceInputNameConfiguration()

    /**
     * Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration-inputtimezoneoffset)
     */
    public fun inputTimeZoneOffset(): String? = unwrap(this).getInputTimeZoneOffset()

    /**
     * Specifies configuration information for the input data for the inference, including input
     * data S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration-s3inputconfiguration)
     */
    public fun s3InputConfiguration(): Any

    /**
     * A builder for [DataInputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inferenceInputNameConfiguration Specifies configuration information for the input
       * data for the inference, including timestamp format and delimiter.
       */
      public fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: IResolvable)

      /**
       * @param inferenceInputNameConfiguration Specifies configuration information for the input
       * data for the inference, including timestamp format and delimiter.
       */
      public
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty)

      /**
       * @param inferenceInputNameConfiguration Specifies configuration information for the input
       * data for the inference, including timestamp format and delimiter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc3f0e0ed00422f895da9a493862858ac7c1a8f3e5221bac391be6a411abf54")
      public
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty.Builder.() -> Unit)

      /**
       * @param inputTimeZoneOffset Indicates the difference between your time zone and Greenwich
       * Mean Time (GMT).
       */
      public fun inputTimeZoneOffset(inputTimeZoneOffset: String)

      /**
       * @param s3InputConfiguration Specifies configuration information for the input data for the
       * inference, including input data S3 location. 
       */
      public fun s3InputConfiguration(s3InputConfiguration: IResolvable)

      /**
       * @param s3InputConfiguration Specifies configuration information for the input data for the
       * inference, including input data S3 location. 
       */
      public fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty)

      /**
       * @param s3InputConfiguration Specifies configuration information for the input data for the
       * inference, including input data S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("581c61355ec25fe90a3613d8b08027e9c9a03c8b726cb116e503600ae4ef83c9")
      public
          fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty.builder()

      /**
       * @param inferenceInputNameConfiguration Specifies configuration information for the input
       * data for the inference, including timestamp format and delimiter.
       */
      override fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: IResolvable) {
        cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param inferenceInputNameConfiguration Specifies configuration information for the input
       * data for the inference, including timestamp format and delimiter.
       */
      override
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty) {
        cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration.let(InputNameConfigurationProperty::unwrap))
      }

      /**
       * @param inferenceInputNameConfiguration Specifies configuration information for the input
       * data for the inference, including timestamp format and delimiter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc3f0e0ed00422f895da9a493862858ac7c1a8f3e5221bac391be6a411abf54")
      override
          fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: InputNameConfigurationProperty.Builder.() -> Unit):
          Unit =
          inferenceInputNameConfiguration(InputNameConfigurationProperty(inferenceInputNameConfiguration))

      /**
       * @param inputTimeZoneOffset Indicates the difference between your time zone and Greenwich
       * Mean Time (GMT).
       */
      override fun inputTimeZoneOffset(inputTimeZoneOffset: String) {
        cdkBuilder.inputTimeZoneOffset(inputTimeZoneOffset)
      }

      /**
       * @param s3InputConfiguration Specifies configuration information for the input data for the
       * inference, including input data S3 location. 
       */
      override fun s3InputConfiguration(s3InputConfiguration: IResolvable) {
        cdkBuilder.s3InputConfiguration(s3InputConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param s3InputConfiguration Specifies configuration information for the input data for the
       * inference, including input data S3 location. 
       */
      override fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty) {
        cdkBuilder.s3InputConfiguration(s3InputConfiguration.let(S3InputConfigurationProperty::unwrap))
      }

      /**
       * @param s3InputConfiguration Specifies configuration information for the input data for the
       * inference, including input data S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("581c61355ec25fe90a3613d8b08027e9c9a03c8b726cb116e503600ae4ef83c9")
      override
          fun s3InputConfiguration(s3InputConfiguration: S3InputConfigurationProperty.Builder.() -> Unit):
          Unit = s3InputConfiguration(S3InputConfigurationProperty(s3InputConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty,
    ) : CdkObject(cdkObject), DataInputConfigurationProperty {
      /**
       * Specifies configuration information for the input data for the inference, including
       * timestamp format and delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration-inferenceinputnameconfiguration)
       */
      override fun inferenceInputNameConfiguration(): Any? =
          unwrap(this).getInferenceInputNameConfiguration()

      /**
       * Indicates the difference between your time zone and Greenwich Mean Time (GMT).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration-inputtimezoneoffset)
       */
      override fun inputTimeZoneOffset(): String? = unwrap(this).getInputTimeZoneOffset()

      /**
       * Specifies configuration information for the input data for the inference, including input
       * data S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration-s3inputconfiguration)
       */
      override fun s3InputConfiguration(): Any = unwrap(this).getS3InputConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataInputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty):
          DataInputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataInputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataInputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataInputConfigurationProperty
    }
  }

  /**
   * Specifies configuration information for the output results for the inference scheduler,
   * including the S3 location for the output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutequipment.*;
   * DataOutputConfigurationProperty dataOutputConfigurationProperty =
   * DataOutputConfigurationProperty.builder()
   * .s3OutputConfiguration(S3OutputConfigurationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-dataoutputconfiguration.html)
   */
  public interface DataOutputConfigurationProperty {
    /**
     * The ID number for the AWS KMS key used to encrypt the inference output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-dataoutputconfiguration.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies configuration information for the output results from the inference, including
     * output S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-dataoutputconfiguration.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration-s3outputconfiguration)
     */
    public fun s3OutputConfiguration(): Any

    /**
     * A builder for [DataOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The ID number for the AWS KMS key used to encrypt the inference output.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param s3OutputConfiguration Specifies configuration information for the output results
       * from the inference, including output S3 location. 
       */
      public fun s3OutputConfiguration(s3OutputConfiguration: IResolvable)

      /**
       * @param s3OutputConfiguration Specifies configuration information for the output results
       * from the inference, including output S3 location. 
       */
      public fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty)

      /**
       * @param s3OutputConfiguration Specifies configuration information for the output results
       * from the inference, including output S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f2e19d838f5a1605d85010c381976bec8cbbb520d702395aa620174c42879c")
      public
          fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty.builder()

      /**
       * @param kmsKeyId The ID number for the AWS KMS key used to encrypt the inference output.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param s3OutputConfiguration Specifies configuration information for the output results
       * from the inference, including output S3 location. 
       */
      override fun s3OutputConfiguration(s3OutputConfiguration: IResolvable) {
        cdkBuilder.s3OutputConfiguration(s3OutputConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param s3OutputConfiguration Specifies configuration information for the output results
       * from the inference, including output S3 location. 
       */
      override fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty) {
        cdkBuilder.s3OutputConfiguration(s3OutputConfiguration.let(S3OutputConfigurationProperty::unwrap))
      }

      /**
       * @param s3OutputConfiguration Specifies configuration information for the output results
       * from the inference, including output S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f2e19d838f5a1605d85010c381976bec8cbbb520d702395aa620174c42879c")
      override
          fun s3OutputConfiguration(s3OutputConfiguration: S3OutputConfigurationProperty.Builder.() -> Unit):
          Unit = s3OutputConfiguration(S3OutputConfigurationProperty(s3OutputConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty,
    ) : CdkObject(cdkObject), DataOutputConfigurationProperty {
      /**
       * The ID number for the AWS KMS key used to encrypt the inference output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-dataoutputconfiguration.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Specifies configuration information for the output results from the inference, including
       * output S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-dataoutputconfiguration.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration-s3outputconfiguration)
       */
      override fun s3OutputConfiguration(): Any = unwrap(this).getS3OutputConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty):
          DataOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataOutputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.DataOutputConfigurationProperty
    }
  }

  /**
   * Specifies configuration information for the input data for the inference, including timestamp
   * format and delimiter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutequipment.*;
   * InputNameConfigurationProperty inputNameConfigurationProperty =
   * InputNameConfigurationProperty.builder()
   * .componentTimestampDelimiter("componentTimestampDelimiter")
   * .timestampFormat("timestampFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-inputnameconfiguration.html)
   */
  public interface InputNameConfigurationProperty {
    /**
     * Indicates the delimiter character used between items in the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-inputnameconfiguration.html#cfn-lookoutequipment-inferencescheduler-inputnameconfiguration-componenttimestampdelimiter)
     */
    public fun componentTimestampDelimiter(): String? =
        unwrap(this).getComponentTimestampDelimiter()

    /**
     * The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-inputnameconfiguration.html#cfn-lookoutequipment-inferencescheduler-inputnameconfiguration-timestampformat)
     */
    public fun timestampFormat(): String? = unwrap(this).getTimestampFormat()

    /**
     * A builder for [InputNameConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentTimestampDelimiter Indicates the delimiter character used between items in
       * the data.
       */
      public fun componentTimestampDelimiter(componentTimestampDelimiter: String)

      /**
       * @param timestampFormat The format of the timestamp, whether Epoch time, or standard, with
       * or without hyphens (-).
       */
      public fun timestampFormat(timestampFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty.builder()

      /**
       * @param componentTimestampDelimiter Indicates the delimiter character used between items in
       * the data.
       */
      override fun componentTimestampDelimiter(componentTimestampDelimiter: String) {
        cdkBuilder.componentTimestampDelimiter(componentTimestampDelimiter)
      }

      /**
       * @param timestampFormat The format of the timestamp, whether Epoch time, or standard, with
       * or without hyphens (-).
       */
      override fun timestampFormat(timestampFormat: String) {
        cdkBuilder.timestampFormat(timestampFormat)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty,
    ) : CdkObject(cdkObject), InputNameConfigurationProperty {
      /**
       * Indicates the delimiter character used between items in the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-inputnameconfiguration.html#cfn-lookoutequipment-inferencescheduler-inputnameconfiguration-componenttimestampdelimiter)
       */
      override fun componentTimestampDelimiter(): String? =
          unwrap(this).getComponentTimestampDelimiter()

      /**
       * The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-inputnameconfiguration.html#cfn-lookoutequipment-inferencescheduler-inputnameconfiguration-timestampformat)
       */
      override fun timestampFormat(): String? = unwrap(this).getTimestampFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputNameConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty):
          InputNameConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputNameConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputNameConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.InputNameConfigurationProperty
    }
  }

  /**
   * Specifies configuration information for the input data for the inference, including input data
   * S3 location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutequipment.*;
   * S3InputConfigurationProperty s3InputConfigurationProperty =
   * S3InputConfigurationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3inputconfiguration.html)
   */
  public interface S3InputConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3inputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3inputconfiguration-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3inputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3inputconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3InputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set. 
       */
      public fun bucket(bucket: String)

      /**
       * @param prefix the value to be set.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty.builder()

      /**
       * @param bucket the value to be set. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param prefix the value to be set.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty,
    ) : CdkObject(cdkObject), S3InputConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3inputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3inputconfiguration-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3inputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3inputconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3InputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty):
          S3InputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3InputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3InputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3InputConfigurationProperty
    }
  }

  /**
   * Specifies configuration information for the output results from the inference, including output
   * S3 location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutequipment.*;
   * S3OutputConfigurationProperty s3OutputConfigurationProperty =
   * S3OutputConfigurationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3outputconfiguration.html)
   */
  public interface S3OutputConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3outputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3outputconfiguration-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3outputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3outputconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3OutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set. 
       */
      public fun bucket(bucket: String)

      /**
       * @param prefix the value to be set.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty.builder()

      /**
       * @param bucket the value to be set. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param prefix the value to be set.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty,
    ) : CdkObject(cdkObject), S3OutputConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3outputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3outputconfiguration-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3outputconfiguration.html#cfn-lookoutequipment-inferencescheduler-s3outputconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty):
          S3OutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3OutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputConfigurationProperty):
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler.S3OutputConfigurationProperty
    }
  }
}
