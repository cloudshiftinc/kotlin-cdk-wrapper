@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.m2.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentFsxStorageConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.FsxStorageConfigurationProperty.Builder =
      CfnEnvironment.FsxStorageConfigurationProperty.builder()

  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  public fun mountPoint(mountPoint: String) {
    cdkBuilder.mountPoint(mountPoint)
  }

  public fun build(): CfnEnvironment.FsxStorageConfigurationProperty = cdkBuilder.build()
}
