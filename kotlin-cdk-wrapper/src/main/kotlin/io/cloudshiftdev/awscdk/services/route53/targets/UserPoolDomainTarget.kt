@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.UserPoolDomain
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

/**
 * Use a user pool domain as an alias record target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * HostedZone zone;
 * UserPoolDomain domain;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new UserPoolDomainTarget(domain)))
 * .build();
 * ```
 */
public open class UserPoolDomainTarget(
  cdkObject: software.amazon.awscdk.services.route53.targets.UserPoolDomainTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(domain: UserPoolDomain) :
      this(software.amazon.awscdk.services.route53.targets.UserPoolDomainTarget(domain.let(UserPoolDomain::unwrap))
  )

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet::unwrap),
      zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.UserPoolDomainTarget):
        UserPoolDomainTarget = UserPoolDomainTarget(cdkObject)

    internal fun unwrap(wrapped: UserPoolDomainTarget):
        software.amazon.awscdk.services.route53.targets.UserPoolDomainTarget = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.targets.UserPoolDomainTarget
  }
}
