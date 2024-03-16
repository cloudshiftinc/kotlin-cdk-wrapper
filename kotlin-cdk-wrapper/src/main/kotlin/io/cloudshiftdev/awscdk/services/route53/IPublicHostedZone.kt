@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents a Route 53 public hosted zone.
 */
public interface IPublicHostedZone : IHostedZone {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IPublicHostedZone):
        IPublicHostedZone = CdkObjectWrappers.wrap(cdkObject) as IPublicHostedZone

    internal fun unwrap(wrapped: IPublicHostedZone):
        software.amazon.awscdk.services.route53.IPublicHostedZone = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.IPublicHostedZone
  }
}
