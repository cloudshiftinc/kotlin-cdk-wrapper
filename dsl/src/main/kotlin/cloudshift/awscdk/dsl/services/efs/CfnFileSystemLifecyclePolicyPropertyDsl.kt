@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemLifecyclePolicyPropertyDsl {
  private val cdkBuilder: CfnFileSystem.LifecyclePolicyProperty.Builder =
      CfnFileSystem.LifecyclePolicyProperty.builder()

  public fun transitionToIa(transitionToIa: String) {
    cdkBuilder.transitionToIa(transitionToIa)
  }

  public fun transitionToPrimaryStorageClass(transitionToPrimaryStorageClass: String) {
    cdkBuilder.transitionToPrimaryStorageClass(transitionToPrimaryStorageClass)
  }

  public fun build(): CfnFileSystem.LifecyclePolicyProperty = cdkBuilder.build()
}
