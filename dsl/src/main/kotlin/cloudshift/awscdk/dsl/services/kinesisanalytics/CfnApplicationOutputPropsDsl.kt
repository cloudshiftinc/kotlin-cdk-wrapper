@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps

@CdkDslMarker
public class CfnApplicationOutputPropsDsl {
  private val cdkBuilder: CfnApplicationOutputProps.Builder = CfnApplicationOutputProps.builder()

  /**
   * @param applicationName Name of the application to which you want to add the output
   * configuration. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param output An array of objects, each describing one output configuration. 
   * In the output configuration, you specify the name of an in-application stream, a destination
   * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
   * function), and record the formation to use when writing to the destination.
   */
  public fun output(output: IResolvable) {
    cdkBuilder.output(output)
  }

  /**
   * @param output An array of objects, each describing one output configuration. 
   * In the output configuration, you specify the name of an in-application stream, a destination
   * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
   * function), and record the formation to use when writing to the destination.
   */
  public fun output(output: CfnApplicationOutput.OutputProperty) {
    cdkBuilder.output(output)
  }

  public fun build(): CfnApplicationOutputProps = cdkBuilder.build()
}
