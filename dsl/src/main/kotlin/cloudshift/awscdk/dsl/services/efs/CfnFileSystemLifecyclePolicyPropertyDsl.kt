@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemLifecyclePolicyPropertyDsl {
  private val cdkBuilder: CfnFileSystem.LifecyclePolicyProperty.Builder =
      CfnFileSystem.LifecyclePolicyProperty.builder()

  /**
   * @param transitionToIa Describes the period of time that a file is not accessed, after which it
   * transitions to IA storage.
   * Metadata operations such as listing the contents of a directory don't count as file access
   * events.
   */
  public fun transitionToIa(transitionToIa: String) {
    cdkBuilder.transitionToIa(transitionToIa)
  }

  /**
   * @param transitionToPrimaryStorageClass Describes when to transition a file from IA storage to
   * primary storage.
   * Metadata operations such as listing the contents of a directory don't count as file access
   * events.
   */
  public fun transitionToPrimaryStorageClass(transitionToPrimaryStorageClass: String) {
    cdkBuilder.transitionToPrimaryStorageClass(transitionToPrimaryStorageClass)
  }

  public fun build(): CfnFileSystem.LifecyclePolicyProperty = cdkBuilder.build()
}
