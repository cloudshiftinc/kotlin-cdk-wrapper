@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents a Route 53 private hosted zone.
 */
public interface IPrivateHostedZone : IHostedZone {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IPrivateHostedZone):
        IPrivateHostedZone = CdkObjectWrappers.wrap(cdkObject) as IPrivateHostedZone

    internal fun unwrap(wrapped: IPrivateHostedZone):
        software.amazon.awscdk.services.route53.IPrivateHostedZone = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.IPrivateHostedZone
  }
}
