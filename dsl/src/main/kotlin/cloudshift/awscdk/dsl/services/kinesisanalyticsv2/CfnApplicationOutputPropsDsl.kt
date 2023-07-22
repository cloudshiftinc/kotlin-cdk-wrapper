@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps

@CdkDslMarker
public class CfnApplicationOutputPropsDsl {
  private val cdkBuilder: CfnApplicationOutputProps.Builder = CfnApplicationOutputProps.builder()

  /**
   * @param applicationName The name of the application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param output Describes a SQL-based Kinesis Data Analytics application's output configuration,
   * in which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written. 
   * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
   */
  public fun output(output: IResolvable) {
    cdkBuilder.output(output)
  }

  /**
   * @param output Describes a SQL-based Kinesis Data Analytics application's output configuration,
   * in which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written. 
   * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
   */
  public fun output(output: CfnApplicationOutput.OutputProperty) {
    cdkBuilder.output(output)
  }

  public fun build(): CfnApplicationOutputProps = cdkBuilder.build()
}
