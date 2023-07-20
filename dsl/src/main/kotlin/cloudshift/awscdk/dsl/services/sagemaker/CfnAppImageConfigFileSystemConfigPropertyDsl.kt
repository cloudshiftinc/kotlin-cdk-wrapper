@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@CdkDslMarker
public class CfnAppImageConfigFileSystemConfigPropertyDsl {
  private val cdkBuilder: CfnAppImageConfig.FileSystemConfigProperty.Builder =
      CfnAppImageConfig.FileSystemConfigProperty.builder()

  public fun defaultGid(defaultGid: Number) {
    cdkBuilder.defaultGid(defaultGid)
  }

  public fun defaultUid(defaultUid: Number) {
    cdkBuilder.defaultUid(defaultUid)
  }

  public fun mountPath(mountPath: String) {
    cdkBuilder.mountPath(mountPath)
  }

  public fun build(): CfnAppImageConfig.FileSystemConfigProperty = cdkBuilder.build()
}
