@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

public open class ElasticBeanstalkEnvironmentEndpointTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.targets.ElasticBeanstalkEnvironmentEndpointTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public override fun bind(_record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  public override fun bind(_record: IRecordSet, _zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap),
      _zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.ElasticBeanstalkEnvironmentEndpointTarget):
        ElasticBeanstalkEnvironmentEndpointTarget =
        ElasticBeanstalkEnvironmentEndpointTarget(cdkObject)

    internal fun unwrap(wrapped: ElasticBeanstalkEnvironmentEndpointTarget):
        software.amazon.awscdk.services.route53.targets.ElasticBeanstalkEnvironmentEndpointTarget =
        wrapped.cdkObject
  }
}
