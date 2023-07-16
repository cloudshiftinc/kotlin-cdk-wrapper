@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.GroupProps
import software.amazon.awscdk.services.iam.IManagedPolicy

@CdkDslMarker
public class GroupPropsDsl {
  private val cdkBuilder: GroupProps.Builder = GroupProps.builder()

  private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
    _managedPolicies.addAll(listOf(*managedPolicies))
  }

  public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
    _managedPolicies.addAll(managedPolicies)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): GroupProps {
    if(_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
    return cdkBuilder.build()
  }
}
