package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationOutputProps {
  /**
   * Name of the application to which you want to add the output configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
   */
  public fun applicationName(): String

  /**
   * An array of objects, each describing one output configuration.
   *
   * In the output configuration, you specify the name of an in-application stream, a destination
   * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
   * function), and record the formation to use when writing to the destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
   */
  public fun output(): Any

  /**
   * A builder for [CfnApplicationOutputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName Name of the application to which you want to add the output
     * configuration. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param output An array of objects, each describing one output configuration. 
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     */
    public fun output(output: IResolvable)

    /**
     * @param output An array of objects, each describing one output configuration. 
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     */
    public fun output(output: CfnApplicationOutput.OutputProperty)

    /**
     * @param output An array of objects, each describing one output configuration. 
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8921cd506252307c3f1b15a17a62ac7c74599ea22a5d37b24ea86757f6cc9e84")
    public fun output(output: CfnApplicationOutput.OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.builder()

    /**
     * @param applicationName Name of the application to which you want to add the output
     * configuration. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param output An array of objects, each describing one output configuration. 
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     */
    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    /**
     * @param output An array of objects, each describing one output configuration. 
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     */
    override fun output(output: CfnApplicationOutput.OutputProperty) {
      cdkBuilder.output(output.let(CfnApplicationOutput.OutputProperty::unwrap))
    }

    /**
     * @param output An array of objects, each describing one output configuration. 
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8921cd506252307c3f1b15a17a62ac7c74599ea22a5d37b24ea86757f6cc9e84")
    override fun output(output: CfnApplicationOutput.OutputProperty.Builder.() -> Unit): Unit =
        output(CfnApplicationOutput.OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps,
  ) : CdkObject(cdkObject), CfnApplicationOutputProps {
    /**
     * Name of the application to which you want to add the output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     */
    override fun output(): Any = unwrap(this).getOutput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps):
        CfnApplicationOutputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutputProps):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps
  }
}
