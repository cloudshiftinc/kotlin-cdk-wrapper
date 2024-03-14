package io.cloudshiftdev.awscdk.services.lookoutequipment

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInferenceSchedulerProps {
  /**
   * A period of time (in minutes) by which inference on the data is delayed after the data starts.
   *
   * For instance, if an offset delay time of five minutes was selected, inference will not begin on
   * the data until the first data measurement after the five minute mark. For example, if five minutes
   * is selected, the inference scheduler will wake up at the configured frequency with the additional
   * five minute delay time to check the customer S3 bucket. The customer can upload data at the same
   * frequency and they don't need to stop and restart the scheduler when uploading new data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datadelayoffsetinminutes)
   */
  public fun dataDelayOffsetInMinutes(): Number? = unwrap(this).getDataDelayOffsetInMinutes()

  /**
   * Specifies configuration information for the input data for the inference scheduler, including
   * delimiter, format, and dataset location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration)
   */
  public fun dataInputConfiguration(): Any

  /**
   * Specifies configuration information for the output results for the inference scheduler,
   * including the Amazon S3 location for the output.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration)
   */
  public fun dataOutputConfiguration(): Any

  /**
   * How often data is uploaded to the source S3 bucket for the input data.
   *
   * This value is the length of time between data uploads. For instance, if you select 5 minutes,
   * Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5
   * minutes. This frequency also determines how often Amazon Lookout for Equipment starts a scheduled
   * inference on your data. In this example, it starts once every 5 minutes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datauploadfrequency)
   */
  public fun dataUploadFrequency(): String

  /**
   * The name of the inference scheduler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-inferenceschedulername)
   */
  public fun inferenceSchedulerName(): String? = unwrap(this).getInferenceSchedulerName()

  /**
   * The name of the machine learning model used for the inference scheduler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-modelname)
   */
  public fun modelName(): String

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source being used
   * for the inference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-rolearn)
   */
  public fun roleArn(): String

  /**
   * Provides the identifier of the AWS KMS key used to encrypt inference scheduler data by Amazon
   * Lookout for Equipment .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-serversidekmskeyid)
   */
  public fun serverSideKmsKeyId(): String? = unwrap(this).getServerSideKmsKeyId()

  /**
   * Any tags associated with the inference scheduler.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInferenceSchedulerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataDelayOffsetInMinutes A period of time (in minutes) by which inference on the data
     * is delayed after the data starts.
     * For instance, if an offset delay time of five minutes was selected, inference will not begin
     * on the data until the first data measurement after the five minute mark. For example, if five
     * minutes is selected, the inference scheduler will wake up at the configured frequency with the
     * additional five minute delay time to check the customer S3 bucket. The customer can upload data
     * at the same frequency and they don't need to stop and restart the scheduler when uploading new
     * data.
     */
    public fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number)

    /**
     * @param dataInputConfiguration Specifies configuration information for the input data for the
     * inference scheduler, including delimiter, format, and dataset location. 
     */
    public fun dataInputConfiguration(dataInputConfiguration: Any)

    /**
     * @param dataOutputConfiguration Specifies configuration information for the output results for
     * the inference scheduler, including the Amazon S3 location for the output. 
     */
    public fun dataOutputConfiguration(dataOutputConfiguration: Any)

    /**
     * @param dataUploadFrequency How often data is uploaded to the source S3 bucket for the input
     * data. 
     * This value is the length of time between data uploads. For instance, if you select 5 minutes,
     * Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5
     * minutes. This frequency also determines how often Amazon Lookout for Equipment starts a
     * scheduled inference on your data. In this example, it starts once every 5 minutes.
     */
    public fun dataUploadFrequency(dataUploadFrequency: String)

    /**
     * @param inferenceSchedulerName The name of the inference scheduler.
     */
    public fun inferenceSchedulerName(inferenceSchedulerName: String)

    /**
     * @param modelName The name of the machine learning model used for the inference scheduler. 
     */
    public fun modelName(modelName: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source being used for the inference. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param serverSideKmsKeyId Provides the identifier of the AWS KMS key used to encrypt
     * inference scheduler data by Amazon Lookout for Equipment .
     */
    public fun serverSideKmsKeyId(serverSideKmsKeyId: String)

    /**
     * @param tags Any tags associated with the inference scheduler.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags associated with the inference scheduler.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps.Builder =
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps.builder()

    /**
     * @param dataDelayOffsetInMinutes A period of time (in minutes) by which inference on the data
     * is delayed after the data starts.
     * For instance, if an offset delay time of five minutes was selected, inference will not begin
     * on the data until the first data measurement after the five minute mark. For example, if five
     * minutes is selected, the inference scheduler will wake up at the configured frequency with the
     * additional five minute delay time to check the customer S3 bucket. The customer can upload data
     * at the same frequency and they don't need to stop and restart the scheduler when uploading new
     * data.
     */
    override fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number) {
      cdkBuilder.dataDelayOffsetInMinutes(dataDelayOffsetInMinutes)
    }

    /**
     * @param dataInputConfiguration Specifies configuration information for the input data for the
     * inference scheduler, including delimiter, format, and dataset location. 
     */
    override fun dataInputConfiguration(dataInputConfiguration: Any) {
      cdkBuilder.dataInputConfiguration(dataInputConfiguration)
    }

    /**
     * @param dataOutputConfiguration Specifies configuration information for the output results for
     * the inference scheduler, including the Amazon S3 location for the output. 
     */
    override fun dataOutputConfiguration(dataOutputConfiguration: Any) {
      cdkBuilder.dataOutputConfiguration(dataOutputConfiguration)
    }

    /**
     * @param dataUploadFrequency How often data is uploaded to the source S3 bucket for the input
     * data. 
     * This value is the length of time between data uploads. For instance, if you select 5 minutes,
     * Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5
     * minutes. This frequency also determines how often Amazon Lookout for Equipment starts a
     * scheduled inference on your data. In this example, it starts once every 5 minutes.
     */
    override fun dataUploadFrequency(dataUploadFrequency: String) {
      cdkBuilder.dataUploadFrequency(dataUploadFrequency)
    }

    /**
     * @param inferenceSchedulerName The name of the inference scheduler.
     */
    override fun inferenceSchedulerName(inferenceSchedulerName: String) {
      cdkBuilder.inferenceSchedulerName(inferenceSchedulerName)
    }

    /**
     * @param modelName The name of the machine learning model used for the inference scheduler. 
     */
    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source being used for the inference. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param serverSideKmsKeyId Provides the identifier of the AWS KMS key used to encrypt
     * inference scheduler data by Amazon Lookout for Equipment .
     */
    override fun serverSideKmsKeyId(serverSideKmsKeyId: String) {
      cdkBuilder.serverSideKmsKeyId(serverSideKmsKeyId)
    }

    /**
     * @param tags Any tags associated with the inference scheduler.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags associated with the inference scheduler.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps,
  ) : CdkObject(cdkObject), CfnInferenceSchedulerProps {
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
     */
    override fun dataDelayOffsetInMinutes(): Number? = unwrap(this).getDataDelayOffsetInMinutes()

    /**
     * Specifies configuration information for the input data for the inference scheduler, including
     * delimiter, format, and dataset location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datainputconfiguration)
     */
    override fun dataInputConfiguration(): Any = unwrap(this).getDataInputConfiguration()

    /**
     * Specifies configuration information for the output results for the inference scheduler,
     * including the Amazon S3 location for the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-dataoutputconfiguration)
     */
    override fun dataOutputConfiguration(): Any = unwrap(this).getDataOutputConfiguration()

    /**
     * How often data is uploaded to the source S3 bucket for the input data.
     *
     * This value is the length of time between data uploads. For instance, if you select 5 minutes,
     * Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5
     * minutes. This frequency also determines how often Amazon Lookout for Equipment starts a
     * scheduled inference on your data. In this example, it starts once every 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-datauploadfrequency)
     */
    override fun dataUploadFrequency(): String = unwrap(this).getDataUploadFrequency()

    /**
     * The name of the inference scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-inferenceschedulername)
     */
    override fun inferenceSchedulerName(): String? = unwrap(this).getInferenceSchedulerName()

    /**
     * The name of the machine learning model used for the inference scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-modelname)
     */
    override fun modelName(): String = unwrap(this).getModelName()

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used
     * for the inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * Provides the identifier of the AWS KMS key used to encrypt inference scheduler data by Amazon
     * Lookout for Equipment .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-serversidekmskeyid)
     */
    override fun serverSideKmsKeyId(): String? = unwrap(this).getServerSideKmsKeyId()

    /**
     * Any tags associated with the inference scheduler.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html#cfn-lookoutequipment-inferencescheduler-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInferenceSchedulerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps):
        CfnInferenceSchedulerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceSchedulerProps):
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
  }
}
