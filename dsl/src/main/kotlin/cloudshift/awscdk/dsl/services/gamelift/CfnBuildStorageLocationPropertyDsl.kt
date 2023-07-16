@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnBuild

@CdkDslMarker
public class CfnBuildStorageLocationPropertyDsl {
  private val cdkBuilder: CfnBuild.StorageLocationProperty.Builder =
      CfnBuild.StorageLocationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnBuild.StorageLocationProperty = cdkBuilder.build()
}
