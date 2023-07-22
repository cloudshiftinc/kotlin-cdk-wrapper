@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

@CdkDslMarker
public class CfnFunctionFileSystemConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.FileSystemConfigProperty.Builder =
      CfnFunction.FileSystemConfigProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access
   * to the file system. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param localMountPath The path where the function can access the file system, starting with
   * `/mnt/` . 
   */
  public fun localMountPath(localMountPath: String) {
    cdkBuilder.localMountPath(localMountPath)
  }

  public fun build(): CfnFunction.FileSystemConfigProperty = cdkBuilder.build()
}
