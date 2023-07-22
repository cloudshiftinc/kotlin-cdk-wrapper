@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.constructs.Construct

/**
 * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.
 *
 * If you want Kinesis Data Analytics to deliver data from an in-application stream within your
 * application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose
 * delivery stream, or an Amazon Lambda function), you add the relevant configuration to your
 * application using this operation. You can configure one or more outputs for your application. Each
 * output configuration maps an in-application stream and an external destination.
 *
 * You can use one of the output configurations to deliver data from your in-application error
 * stream to an external destination so that you can analyze the errors.
 *
 * Any configuration update, including adding a streaming source using this operation, results in a
 * new version of the application. You can use the
 * [DescribeApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_DescribeApplication.html)
 * operation to find the current application version.
 *
 *
 * Creation of multiple outputs should be sequential (use of DependsOn) to avoid a problem with a
 * stale application version ( *ConcurrentModificationException* ).
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CfnApplicationOutputV2 cfnApplicationOutputV2 = CfnApplicationOutputV2.Builder.create(this,
 * "MyCfnApplicationOutputV2")
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
@CdkDslMarker
public class CfnApplicationOutputV2Dsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationOutputV2.Builder =
      CfnApplicationOutputV2.Builder.create(scope, id)

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-applicationname)
   * @param applicationName The name of the application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
   * identify an in-application stream and a destination where you want the in-application stream data
   * to be written.
   *
   * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
   * @param output Describes a SQL-based Kinesis Data Analytics application's output configuration,
   * in which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written. 
   */
  public fun output(output: IResolvable) {
    cdkBuilder.output(output)
  }

  /**
   * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
   * identify an in-application stream and a destination where you want the in-application stream data
   * to be written.
   *
   * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
   * @param output Describes a SQL-based Kinesis Data Analytics application's output configuration,
   * in which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written. 
   */
  public fun output(output: CfnApplicationOutputV2.OutputProperty) {
    cdkBuilder.output(output)
  }

  public fun build(): CfnApplicationOutputV2 = cdkBuilder.build()
}
