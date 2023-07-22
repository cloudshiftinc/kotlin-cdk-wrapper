@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions

/**
 * Options for the `withoutPolicyUpdates()` modifier of a Role.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * WithoutPolicyUpdatesOptions withoutPolicyUpdatesOptions = WithoutPolicyUpdatesOptions.builder()
 * .addGrantsToResources(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class WithoutPolicyUpdatesOptionsDsl {
  private val cdkBuilder: WithoutPolicyUpdatesOptions.Builder =
      WithoutPolicyUpdatesOptions.builder()

  /**
   * @param addGrantsToResources Add grants to resources instead of dropping them.
   * If this is `false` or not specified, grant permissions added to this role are ignored.
   * It is your own responsibility to make sure the role has the required permissions.
   *
   * If this is `true`, any grant permissions will be added to the resource instead.
   */
  public fun addGrantsToResources(addGrantsToResources: Boolean) {
    cdkBuilder.addGrantsToResources(addGrantsToResources)
  }

  public fun build(): WithoutPolicyUpdatesOptions = cdkBuilder.build()
}
