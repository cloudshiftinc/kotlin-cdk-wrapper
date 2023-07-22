@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.CfnResourceSignal

/**
 * When AWS CloudFormation creates the associated resource, configures the number of required
 * success signals and the length of time that AWS CloudFormation waits for those signals.
 *
 * Example:
 *
 * ```
 * CfnResource resource;
 * resource.getCfnOptions().getCreationPolicy() = CfnCreationPolicy.builder()
 * .resourceSignal(CfnResourceSignal.builder()
 * .count(3)
 * .timeout("PR15M")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnResourceSignalDsl {
  private val cdkBuilder: CfnResourceSignal.Builder = CfnResourceSignal.builder()

  /**
   * @param count The number of success signals AWS CloudFormation must receive before it sets the
   * resource status as CREATE_COMPLETE.
   * If the resource receives a failure signal or doesn't receive the specified number of signals
   * before the timeout period
   * expires, the resource creation fails and AWS CloudFormation rolls the stack back.
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  /**
   * @param timeout The length of time that AWS CloudFormation waits for the number of signals that
   * was specified in the Count property.
   * The timeout period starts after AWS CloudFormation starts creating the resource, and the
   * timeout expires no sooner
   * than the time you specify but can occur shortly thereafter. The maximum time that you can
   * specify is 12 hours.
   */
  public fun timeout(timeout: String) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnResourceSignal = cdkBuilder.build()
}
