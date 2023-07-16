@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions

@CdkDslMarker
public class WithoutPolicyUpdatesOptionsDsl {
  private val cdkBuilder: WithoutPolicyUpdatesOptions.Builder =
      WithoutPolicyUpdatesOptions.builder()

  public fun addGrantsToResources(addGrantsToResources: Boolean) {
    cdkBuilder.addGrantsToResources(addGrantsToResources)
  }

  public fun build(): WithoutPolicyUpdatesOptions = cdkBuilder.build()
}
