@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The configuration that determines how Amazon AppFlow should format the flow output data when
 * Amazon S3 is used as the destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * S3OutputFormatConfigProperty s3OutputFormatConfigProperty =
 * S3OutputFormatConfigProperty.builder()
 * .aggregationConfig(AggregationConfigProperty.builder()
 * .aggregationType("aggregationType")
 * .targetFileSize(123)
 * .build())
 * .fileType("fileType")
 * .prefixConfig(PrefixConfigProperty.builder()
 * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
 * .prefixFormat("prefixFormat")
 * .prefixType("prefixType")
 * .build())
 * .preserveSourceDataTyping(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3outputformatconfig.html)
 */
@CdkDslMarker
public class CfnFlowS3OutputFormatConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.S3OutputFormatConfigProperty.Builder =
      CfnFlow.S3OutputFormatConfigProperty.builder()

  /**
   * @param aggregationConfig The aggregation settings that you can use to customize the output
   * format of your flow data.
   */
  public fun aggregationConfig(aggregationConfig: IResolvable) {
    cdkBuilder.aggregationConfig(aggregationConfig)
  }

  /**
   * @param aggregationConfig The aggregation settings that you can use to customize the output
   * format of your flow data.
   */
  public fun aggregationConfig(aggregationConfig: CfnFlow.AggregationConfigProperty) {
    cdkBuilder.aggregationConfig(aggregationConfig)
  }

  /**
   * @param fileType Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
   */
  public fun fileType(fileType: String) {
    cdkBuilder.fileType(fileType)
  }

  /**
   * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the
   * Amazon S3 bucket.
   * You can name folders according to the flow frequency and date.
   */
  public fun prefixConfig(prefixConfig: IResolvable) {
    cdkBuilder.prefixConfig(prefixConfig)
  }

  /**
   * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the
   * Amazon S3 bucket.
   * You can name folders according to the flow frequency and date.
   */
  public fun prefixConfig(prefixConfig: CfnFlow.PrefixConfigProperty) {
    cdkBuilder.prefixConfig(prefixConfig)
  }

  /**
   * @param preserveSourceDataTyping the value to be set.
   */
  public fun preserveSourceDataTyping(preserveSourceDataTyping: Boolean) {
    cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping)
  }

  /**
   * @param preserveSourceDataTyping the value to be set.
   */
  public fun preserveSourceDataTyping(preserveSourceDataTyping: IResolvable) {
    cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping)
  }

  public fun build(): CfnFlow.S3OutputFormatConfigProperty = cdkBuilder.build()
}
