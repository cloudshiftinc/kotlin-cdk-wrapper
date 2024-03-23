@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The type of Aurora Cluster Instance.
 *
 * Can be either serverless v2
 * or provisioned
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * ClusterInstanceType clusterInstanceType = new ClusterInstanceType("instanceType",
 * InstanceType.PROVISIONED);
 * ```
 */
public open class ClusterInstanceType(
  cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceType,
) : CdkObject(cdkObject) {
  public constructor(instanceType: String, type: InstanceType) :
      this(software.amazon.awscdk.services.rds.ClusterInstanceType(instanceType,
      type.let(InstanceType::unwrap))
  )

  /**
   *
   */
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
        software.amazon.awscdk.services.rds.ClusterInstanceType = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.ClusterInstanceType
  }
}
