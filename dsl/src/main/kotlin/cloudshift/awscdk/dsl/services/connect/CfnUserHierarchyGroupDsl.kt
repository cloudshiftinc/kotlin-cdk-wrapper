@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnUserHierarchyGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserHierarchyGroup.Builder =
      CfnUserHierarchyGroup.Builder.create(scope, id)

  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parentGroupArn(parentGroupArn: String) {
    cdkBuilder.parentGroupArn(parentGroupArn)
  }

  public fun build(): CfnUserHierarchyGroup = cdkBuilder.build()
}
