@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

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
 * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
 * CfnApplicationOutputV2Props cfnApplicationOutputV2Props = CfnApplicationOutputV2Props.builder()
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
public interface CfnApplicationOutputV2Props {
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
   * A builder for [CfnApplicationOutputV2Props]
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
    public fun output(output: CfnApplicationOutputV2.OutputProperty)

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1519e4e997aa577c3513d87f4f9cbfa39519711ba56948be31c1f046bae8c61")
    public fun output(output: CfnApplicationOutputV2.OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.builder()

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
    override fun output(output: CfnApplicationOutputV2.OutputProperty) {
      cdkBuilder.output(output.let(CfnApplicationOutputV2.OutputProperty::unwrap))
    }

    /**
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1519e4e997aa577c3513d87f4f9cbfa39519711ba56948be31c1f046bae8c61")
    override fun output(output: CfnApplicationOutputV2.OutputProperty.Builder.() -> Unit): Unit =
        output(CfnApplicationOutputV2.OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props,
  ) : CdkObject(cdkObject), CfnApplicationOutputV2Props {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationOutputV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props):
        CfnApplicationOutputV2Props = CdkObjectWrappers.wrap(cdkObject) as?
        CfnApplicationOutputV2Props ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutputV2Props):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
  }
}
