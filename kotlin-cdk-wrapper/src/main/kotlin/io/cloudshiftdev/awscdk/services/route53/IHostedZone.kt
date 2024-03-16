@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.collections.List

/**
 * Imported or created hosted zone.
 */
public interface IHostedZone : IResource {
  /**
   * Grant permissions to add delegation records to this zone.
   *
   * @param grantee 
   */
  public fun grantDelegation(grantee: IGrantable): Grant

  /**
   * ARN of this hosted zone, such as arn:${Partition}:route53:::hostedzone/${Id}.
   */
  public fun hostedZoneArn(): String

  /**
   * ID of this hosted zone, such as "Z23ABC4XYZL05B".
   */
  public fun hostedZoneId(): String

  /**
   * Returns the set of name servers for the specific hosted zone. For example: ns1.example.com.
   *
   * This attribute will be undefined for private hosted zones or hosted zones imported from another
   * stack.
   */
  public fun hostedZoneNameServers(): List<String> = unwrap(this).getHostedZoneNameServers() ?:
      emptyList()

  /**
   * FQDN of this hosted zone.
   */
  public fun zoneName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IHostedZone): IHostedZone =
        CdkObjectWrappers.wrap(cdkObject) as IHostedZone

    internal fun unwrap(wrapped: IHostedZone): software.amazon.awscdk.services.route53.IHostedZone =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.route53.IHostedZone
  }
}
