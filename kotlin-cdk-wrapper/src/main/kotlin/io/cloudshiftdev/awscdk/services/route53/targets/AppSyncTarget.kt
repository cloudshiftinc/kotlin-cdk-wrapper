@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.appsync.GraphqlApi
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

/**
 * Defines an AppSync Graphql API as the alias target.
 *
 * Requires that the domain
 * name will be defined through `GraphqlApiProps.domainName`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * HostedZone zone;
 * GraphqlApi graphqlApi;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new AppSyncTarget(graphqlApi)))
 * .build();
 * ```
 */
public open class AppSyncTarget(
  cdkObject: software.amazon.awscdk.services.route53.targets.AppSyncTarget,
) : CdkObject(cdkObject),
    IAliasRecordTarget {
  public constructor(graphqlApi: GraphqlApi) :
      this(software.amazon.awscdk.services.route53.targets.AppSyncTarget(graphqlApi.let(GraphqlApi.Companion::unwrap))
  )

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet.Companion::unwrap),
      zone.let(IHostedZone.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.AppSyncTarget):
        AppSyncTarget = AppSyncTarget(cdkObject)

    internal fun unwrap(wrapped: AppSyncTarget):
        software.amazon.awscdk.services.route53.targets.AppSyncTarget = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.targets.AppSyncTarget
  }
}
