@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String

/**
 * Properties the alias record target.
 */
public interface IAliasRecordTargetProps {
  /**
   * Evaluate target health.
   *
   * Default: - no health check configuration
   */
  public fun evaluateTargetHealth(): Boolean? = unwrap(this).getEvaluateTargetHealth()

  /**
   * Target Hosted zone ID.
   *
   * Default: - hosted zone ID for the EBS endpoint will be retrieved based on the stack's region.
   */
  public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.targets.IAliasRecordTargetProps,
  ) : CdkObject(cdkObject),
      IAliasRecordTargetProps {
    /**
     * Evaluate target health.
     *
     * Default: - no health check configuration
     */
    override fun evaluateTargetHealth(): Boolean? = unwrap(this).getEvaluateTargetHealth()

    /**
     * Target Hosted zone ID.
     *
     * Default: - hosted zone ID for the EBS endpoint will be retrieved based on the stack's region.
     */
    override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.IAliasRecordTargetProps):
        IAliasRecordTargetProps = CdkObjectWrappers.wrap(cdkObject) as? IAliasRecordTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAliasRecordTargetProps):
        software.amazon.awscdk.services.route53.targets.IAliasRecordTargetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.targets.IAliasRecordTargetProps
  }
}
