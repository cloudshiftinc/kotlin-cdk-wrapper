@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

@CdkDslMarker
public class CfnSignalCatalogBranchPropertyDsl {
  private val cdkBuilder: CfnSignalCatalog.BranchProperty.Builder =
      CfnSignalCatalog.BranchProperty.builder()

  /**
   * @param description (Optional) A brief description of the branch.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param fullyQualifiedName The fully qualified name of the branch. 
   * For example, the fully qualified name of a branch might be `Vehicle.Body.Engine` .
   */
  public fun fullyQualifiedName(fullyQualifiedName: String) {
    cdkBuilder.fullyQualifiedName(fullyQualifiedName)
  }

  public fun build(): CfnSignalCatalog.BranchProperty = cdkBuilder.build()
}
