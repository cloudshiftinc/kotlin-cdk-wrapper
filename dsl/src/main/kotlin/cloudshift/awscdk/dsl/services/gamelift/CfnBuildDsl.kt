@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.constructs.Construct

@CdkDslMarker
public class CfnBuildDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBuild.Builder = CfnBuild.Builder.create(scope, id)

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

  public fun build(): CfnBuild = cdkBuilder.build()
}
