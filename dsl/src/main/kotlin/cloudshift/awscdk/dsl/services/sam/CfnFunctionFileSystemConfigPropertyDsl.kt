@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * FileSystemConfigProperty fileSystemConfigProperty = FileSystemConfigProperty.builder()
 * .arn("arn")
 * .localMountPath("localMountPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-filesystemconfig.html)
 */
@CdkDslMarker
public class CfnFunctionFileSystemConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.FileSystemConfigProperty.Builder =
      CfnFunction.FileSystemConfigProperty.builder()

  /**
   * @param arn the value to be set.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param localMountPath the value to be set.
   */
  public fun localMountPath(localMountPath: String) {
    cdkBuilder.localMountPath(localMountPath)
  }

  public fun build(): CfnFunction.FileSystemConfigProperty = cdkBuilder.build()
}
