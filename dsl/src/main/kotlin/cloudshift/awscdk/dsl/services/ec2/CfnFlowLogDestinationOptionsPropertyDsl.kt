@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnFlowLog

/**
 * Describes the destination options for a flow log.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * DestinationOptionsProperty destinationOptionsProperty = DestinationOptionsProperty.builder()
 * .fileFormat("fileFormat")
 * .hiveCompatiblePartitions(false)
 * .perHourPartition(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html)
 */
@CdkDslMarker
public class CfnFlowLogDestinationOptionsPropertyDsl {
  private val cdkBuilder: CfnFlowLog.DestinationOptionsProperty.Builder =
      CfnFlowLog.DestinationOptionsProperty.builder()

  /**
   * @param fileFormat The format for the flow log. 
   * The default is `plain-text` .
   */
  public fun fileFormat(fileFormat: String) {
    cdkBuilder.fileFormat(fileFormat)
  }

  /**
   * @param hiveCompatiblePartitions Indicates whether to use Hive-compatible prefixes for flow logs
   * stored in Amazon S3. 
   * The default is `false` .
   */
  public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
    cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
  }

  /**
   * @param hiveCompatiblePartitions Indicates whether to use Hive-compatible prefixes for flow logs
   * stored in Amazon S3. 
   * The default is `false` .
   */
  public fun hiveCompatiblePartitions(hiveCompatiblePartitions: IResolvable) {
    cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
  }

  /**
   * @param perHourPartition Indicates whether to partition the flow log per hour. 
   * This reduces the cost and response time for queries. The default is `false` .
   */
  public fun perHourPartition(perHourPartition: Boolean) {
    cdkBuilder.perHourPartition(perHourPartition)
  }

  /**
   * @param perHourPartition Indicates whether to partition the flow log per hour. 
   * This reduces the cost and response time for queries. The default is `false` .
   */
  public fun perHourPartition(perHourPartition: IResolvable) {
    cdkBuilder.perHourPartition(perHourPartition)
  }

  public fun build(): CfnFlowLog.DestinationOptionsProperty = cdkBuilder.build()
}
