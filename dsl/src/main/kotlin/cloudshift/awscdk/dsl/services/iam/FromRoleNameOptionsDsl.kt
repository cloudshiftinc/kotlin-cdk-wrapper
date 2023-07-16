@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.iam.FromRoleNameOptions

@CdkDslMarker
public class FromRoleNameOptionsDsl {
  private val cdkBuilder: FromRoleNameOptions.Builder = FromRoleNameOptions.builder()

  public fun addGrantsToResources(addGrantsToResources: Boolean) {
    cdkBuilder.addGrantsToResources(addGrantsToResources)
  }

  public fun defaultPolicyName(defaultPolicyName: String) {
    cdkBuilder.defaultPolicyName(defaultPolicyName)
  }

  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): FromRoleNameOptions = cdkBuilder.build()
}
