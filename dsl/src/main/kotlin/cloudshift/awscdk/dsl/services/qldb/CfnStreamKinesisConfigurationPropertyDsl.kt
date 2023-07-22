@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.qldb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.qldb.CfnStream

@CdkDslMarker
public class CfnStreamKinesisConfigurationPropertyDsl {
  private val cdkBuilder: CfnStream.KinesisConfigurationProperty.Builder =
      CfnStream.KinesisConfigurationProperty.builder()

  /**
   * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
   * Data Streams record, increasing the number of records sent per API call.
   * Default: `True`
   *
   *
   * Record aggregation has important implications for processing records and requires
   * de-aggregation in your stream consumer. To learn more, see [KPL Key
   * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and [Consumer
   * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
   * in the *Amazon Kinesis Data Streams Developer Guide* .
   */
  public fun aggregationEnabled(aggregationEnabled: Boolean) {
    cdkBuilder.aggregationEnabled(aggregationEnabled)
  }

  /**
   * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
   * Data Streams record, increasing the number of records sent per API call.
   * Default: `True`
   *
   *
   * Record aggregation has important implications for processing records and requires
   * de-aggregation in your stream consumer. To learn more, see [KPL Key
   * Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html) and [Consumer
   * De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
   * in the *Amazon Kinesis Data Streams Developer Guide* .
   */
  public fun aggregationEnabled(aggregationEnabled: IResolvable) {
    cdkBuilder.aggregationEnabled(aggregationEnabled)
  }

  /**
   * @param streamArn The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnStream.KinesisConfigurationProperty = cdkBuilder.build()
}
