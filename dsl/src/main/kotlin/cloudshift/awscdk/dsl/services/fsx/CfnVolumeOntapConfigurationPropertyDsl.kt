@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume

@CdkDslMarker
public class CfnVolumeOntapConfigurationPropertyDsl {
  private val cdkBuilder: CfnVolume.OntapConfigurationProperty.Builder =
      CfnVolume.OntapConfigurationProperty.builder()

  public fun copyTagsToBackups(copyTagsToBackups: String) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  public fun junctionPath(junctionPath: String) {
    cdkBuilder.junctionPath(junctionPath)
  }

  public fun ontapVolumeType(ontapVolumeType: String) {
    cdkBuilder.ontapVolumeType(ontapVolumeType)
  }

  public fun securityStyle(securityStyle: String) {
    cdkBuilder.securityStyle(securityStyle)
  }

  public fun sizeInMegabytes(sizeInMegabytes: String) {
    cdkBuilder.sizeInMegabytes(sizeInMegabytes)
  }

  public fun snapshotPolicy(snapshotPolicy: String) {
    cdkBuilder.snapshotPolicy(snapshotPolicy)
  }

  public fun storageEfficiencyEnabled(storageEfficiencyEnabled: String) {
    cdkBuilder.storageEfficiencyEnabled(storageEfficiencyEnabled)
  }

  public fun storageVirtualMachineId(storageVirtualMachineId: String) {
    cdkBuilder.storageVirtualMachineId(storageVirtualMachineId)
  }

  public fun tieringPolicy(tieringPolicy: IResolvable) {
    cdkBuilder.tieringPolicy(tieringPolicy)
  }

  public fun tieringPolicy(tieringPolicy: CfnVolume.TieringPolicyProperty) {
    cdkBuilder.tieringPolicy(tieringPolicy)
  }

  public fun build(): CfnVolume.OntapConfigurationProperty = cdkBuilder.build()
}
