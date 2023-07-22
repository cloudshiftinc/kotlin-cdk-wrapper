@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props

@CdkDslMarker
public class CfnApplicationOutputV2PropsDsl {
  private val cdkBuilder: CfnApplicationOutputV2Props.Builder =
      CfnApplicationOutputV2Props.builder()

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
  public fun output(output: CfnApplicationOutputV2.OutputProperty) {
    cdkBuilder.output(output)
  }

  public fun build(): CfnApplicationOutputV2Props = cdkBuilder.build()
}
