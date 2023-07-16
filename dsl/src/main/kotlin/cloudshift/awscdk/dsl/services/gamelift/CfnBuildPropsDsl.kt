@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnBuildProps

@CdkDslMarker
public class CfnBuildPropsDsl {
  private val cdkBuilder: CfnBuildProps.Builder = CfnBuildProps.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun operatingSystem(operatingSystem: String) {
    cdkBuilder.operatingSystem(operatingSystem)
  }

  public fun serverSdkVersion(serverSdkVersion: String) {
    cdkBuilder.serverSdkVersion(serverSdkVersion)
  }

  public fun storageLocation(storageLocation: IResolvable) {
    cdkBuilder.storageLocation(storageLocation)
  }

  public fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty) {
    cdkBuilder.storageLocation(storageLocation)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnBuildProps = cdkBuilder.build()
}
