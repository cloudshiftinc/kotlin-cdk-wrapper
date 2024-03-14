package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class CloudFrontTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.targets.CloudFrontTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(_record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(_record: IRecordSet, _zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap),
      _zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    public val CLOUDFRONT_ZONE_ID: String =
        software.amazon.awscdk.services.route53.targets.CloudFrontTarget.CLOUDFRONT_ZONE_ID

    public fun hostedZoneId(scope: IConstruct): String =
        software.amazon.awscdk.services.route53.targets.CloudFrontTarget.getHostedZoneId(scope.let(IConstruct::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.CloudFrontTarget):
        CloudFrontTarget = CloudFrontTarget(cdkObject)

    internal fun unwrap(wrapped: CloudFrontTarget):
        software.amazon.awscdk.services.route53.targets.CloudFrontTarget = wrapped.cdkObject
  }
}
