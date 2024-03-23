@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplicationOutput`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplicationOutputProps cfnApplicationOutputProps = CfnApplicationOutputProps.builder()
 * .applicationName("applicationName")
 * .output(OutputProperty.builder()
 * .destinationSchema(DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build())
 * // the properties below are optional
 * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .lambdaOutput(LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html)
 */
public interface CfnApplicationOutputProps {
  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-applicationname)
   */
  public fun applicationName(): String

  /**
   * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
   * which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written.
   *
   * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
   */
  public fun output(): Any

  /**
   * A builder for [CfnApplicationOutputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    public fun output(output: IResolvable)

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    public fun output(output: CfnApplicationOutput.OutputProperty)

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8135adb7051a626323a5ccf85de017c0d6e7bc8bb87575fe2019d7a16b5c58")
    public fun output(output: CfnApplicationOutput.OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps.Builder =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps.builder()

    /**
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    override fun output(output: CfnApplicationOutput.OutputProperty) {
      cdkBuilder.output(output.let(CfnApplicationOutput.OutputProperty::unwrap))
    }

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8135adb7051a626323a5ccf85de017c0d6e7bc8bb87575fe2019d7a16b5c58")
    override fun output(output: CfnApplicationOutput.OutputProperty.Builder.() -> Unit): Unit =
        output(CfnApplicationOutput.OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps,
  ) : CdkObject(cdkObject), CfnApplicationOutputProps {
    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the in-application
     * stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     */
    override fun output(): Any = unwrap(this).getOutput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps):
        CfnApplicationOutputProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationOutputProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutputProps):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps
  }
}
