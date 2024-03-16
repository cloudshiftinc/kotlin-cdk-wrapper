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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget):
        IAliasRecordTarget = CdkObjectWrappers.wrap(cdkObject) as IAliasRecordTarget

    internal fun unwrap(wrapped: IAliasRecordTarget):
        software.amazon.awscdk.services.route53.IAliasRecordTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.IAliasRecordTarget
  }
}
