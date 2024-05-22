@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Classes that are valid alias record targets, like CloudFront distributions and load balancers,
 * should implement this interface.
 */
public interface IAliasRecordTarget {
  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param record 
   * @param zone
   */
  public fun bind(record: IRecordSet): AliasRecordTargetConfig

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param record 
   * @param zone
   */
  public fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget,
  ) : CdkObject(cdkObject), IAliasRecordTarget {
    /**
     * Return hosted zone ID and DNS name, usable for Route53 alias targets.
     *
     * @param record 
     * @param zone
     */
    override fun bind(record: IRecordSet): AliasRecordTargetConfig =
        unwrap(this).bind(record.let(IRecordSet.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)

    /**
     * Return hosted zone ID and DNS name, usable for Route53 alias targets.
     *
     * @param record 
     * @param zone
     */
    override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
        unwrap(this).bind(record.let(IRecordSet.Companion::unwrap),
        zone.let(IHostedZone.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget):
        IAliasRecordTarget = CdkObjectWrappers.wrap(cdkObject) as? IAliasRecordTarget ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAliasRecordTarget):
        software.amazon.awscdk.services.route53.IAliasRecordTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.IAliasRecordTarget
  }
}
