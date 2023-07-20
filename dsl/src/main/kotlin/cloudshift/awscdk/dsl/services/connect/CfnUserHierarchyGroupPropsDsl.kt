@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps

@CdkDslMarker
public class CfnUserHierarchyGroupPropsDsl {
  private val cdkBuilder: CfnUserHierarchyGroupProps.Builder = CfnUserHierarchyGroupProps.builder()

  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parentGroupArn(parentGroupArn: String) {
    cdkBuilder.parentGroupArn(parentGroupArn)
  }

  public fun build(): CfnUserHierarchyGroupProps = cdkBuilder.build()
}
