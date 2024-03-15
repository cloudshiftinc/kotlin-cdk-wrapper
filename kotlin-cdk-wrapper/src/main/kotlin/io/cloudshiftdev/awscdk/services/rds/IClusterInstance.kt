@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IClusterInstance {
  public fun bind(
    arg0: Construct,
    arg1: IDatabaseCluster,
    arg2: ClusterInstanceBindOptions,
  ): IAuroraClusterInstance

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("399891285f8ba8d6e579258f766002e872fa6db6740626abf35971b320798eee")
  public fun bind(
    arg0: Construct,
    arg1: IDatabaseCluster,
    arg2: ClusterInstanceBindOptions.Builder.() -> Unit,
  ): IAuroraClusterInstance

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.IClusterInstance,
  ) : CdkObject(cdkObject), IClusterInstance {
    override fun bind(
      arg0: Construct,
      arg1: IDatabaseCluster,
      arg2: ClusterInstanceBindOptions,
    ): IAuroraClusterInstance = unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IDatabaseCluster::unwrap),
        arg2.let(ClusterInstanceBindOptions::unwrap)).let(IAuroraClusterInstance::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("399891285f8ba8d6e579258f766002e872fa6db6740626abf35971b320798eee")
    override fun bind(
      arg0: Construct,
      arg1: IDatabaseCluster,
      arg2: ClusterInstanceBindOptions.Builder.() -> Unit,
    ): IAuroraClusterInstance = bind(arg0, arg1, ClusterInstanceBindOptions(arg2))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IClusterInstance):
        IClusterInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IClusterInstance):
        software.amazon.awscdk.services.rds.IClusterInstance = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IClusterInstance
  }
}
