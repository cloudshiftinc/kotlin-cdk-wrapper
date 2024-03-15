@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject

public open class ClusterInstanceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceType,
) : CdkObject(cdkObject) {
  public open fun type(): InstanceType = unwrap(this).getType().let(InstanceType::wrap)

  public companion object {
    public fun provisioned(): ClusterInstanceType =
        software.amazon.awscdk.services.rds.ClusterInstanceType.provisioned().let(ClusterInstanceType::wrap)

    public fun provisioned(instanceType: io.cloudshiftdev.awscdk.services.ec2.InstanceType):
        ClusterInstanceType =
        software.amazon.awscdk.services.rds.ClusterInstanceType.provisioned(instanceType.let(io.cloudshiftdev.awscdk.services.ec2.InstanceType::unwrap)).let(ClusterInstanceType::wrap)

    public fun serverlessV2(): ClusterInstanceType =
        software.amazon.awscdk.services.rds.ClusterInstanceType.serverlessV2().let(ClusterInstanceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceType):
        ClusterInstanceType = ClusterInstanceType(cdkObject)

    internal fun unwrap(wrapped: ClusterInstanceType):
        software.amazon.awscdk.services.rds.ClusterInstanceType = wrapped.cdkObject
  }
}
