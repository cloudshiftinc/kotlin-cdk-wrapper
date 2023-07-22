@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

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
