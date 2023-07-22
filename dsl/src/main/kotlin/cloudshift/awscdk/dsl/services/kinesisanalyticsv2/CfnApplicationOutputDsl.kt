@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationOutputDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationOutput.Builder = CfnApplicationOutput.Builder.create(scope,
      id)

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
  public fun output(output: CfnApplicationOutput.OutputProperty) {
    cdkBuilder.output(output)
  }

  public fun build(): CfnApplicationOutput = cdkBuilder.build()
}
