@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEmptyDirPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EmptyDirProperty.Builder =
      CfnJobDefinition.EmptyDirProperty.builder()

  /**
   * @param medium the value to be set.
   */
  public fun medium(medium: String) {
    cdkBuilder.medium(medium)
  }

  /**
   * @param sizeLimit the value to be set.
   */
  public fun sizeLimit(sizeLimit: String) {
    cdkBuilder.sizeLimit(sizeLimit)
  }

  public fun build(): CfnJobDefinition.EmptyDirProperty = cdkBuilder.build()
}
