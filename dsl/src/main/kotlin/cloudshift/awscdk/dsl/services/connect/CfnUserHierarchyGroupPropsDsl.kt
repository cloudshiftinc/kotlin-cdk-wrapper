@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps

@CdkDslMarker
public class CfnUserHierarchyGroupPropsDsl {
  private val cdkBuilder: CfnUserHierarchyGroupProps.Builder = CfnUserHierarchyGroupProps.builder()

  /**
   * @param instanceArn The Amazon Resource Name (ARN) of the user hierarchy group. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param name The name of the user hierarchy group. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param parentGroupArn The Amazon Resource Name (ARN) of the parent group.
   */
  public fun parentGroupArn(parentGroupArn: String) {
    cdkBuilder.parentGroupArn(parentGroupArn)
  }

  public fun build(): CfnUserHierarchyGroupProps = cdkBuilder.build()
}
