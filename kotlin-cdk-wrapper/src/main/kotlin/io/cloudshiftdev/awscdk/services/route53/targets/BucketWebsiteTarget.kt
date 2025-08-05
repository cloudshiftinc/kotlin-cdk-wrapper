@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet
import io.cloudshiftdev.awscdk.services.s3.IBucket

/**
 * Use a S3 as an alias record target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * String recordName = "www";
 * String domainName = "example.com";
 * Bucket bucketWebsite = Bucket.Builder.create(this, "BucketWebsite")
 * .bucketName(List.of(recordName, domainName).join(".")) // www.example.com
 * .publicReadAccess(true)
 * .websiteIndexDocument("index.html")
 * .build();
 * IHostedZone zone = HostedZone.fromLookup(this, "Zone",
 * HostedZoneProviderProps.builder().domainName(domainName).build()); // example.com
 * // example.com
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .recordName(recordName) // www
 * .target(RecordTarget.fromAlias(
 * new BucketWebsiteTarget(bucketWebsite, Map.of(
 * "evaluateTargetHealth", true))))
 * .build();
 * ```
 */
public open class BucketWebsiteTarget(
  cdkObject: software.amazon.awscdk.services.route53.targets.BucketWebsiteTarget,
) : CdkObject(cdkObject),
    IAliasRecordTarget {
  public constructor(bucket: IBucket) :
      this(software.amazon.awscdk.services.route53.targets.BucketWebsiteTarget(bucket.let(IBucket.Companion::unwrap))
  )

  public constructor(bucket: IBucket, props: IAliasRecordTargetProps) :
      this(software.amazon.awscdk.services.route53.targets.BucketWebsiteTarget(bucket.let(IBucket.Companion::unwrap),
      props.let(IAliasRecordTargetProps.Companion::unwrap))
  )

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet.Companion::unwrap),
      zone.let(IHostedZone.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.BucketWebsiteTarget):
        BucketWebsiteTarget = BucketWebsiteTarget(cdkObject)

    internal fun unwrap(wrapped: BucketWebsiteTarget):
        software.amazon.awscdk.services.route53.targets.BucketWebsiteTarget = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.targets.BucketWebsiteTarget
  }
}
