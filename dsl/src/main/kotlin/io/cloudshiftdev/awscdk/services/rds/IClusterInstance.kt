package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IClusterInstance {
  /**
   * Create the database instance within the provided cluster.
   *
   * @param scope 
   * @param cluster 
   * @param options 
   */
  public fun bind(
    scope: Construct,
    cluster: IDatabaseCluster,
    options: ClusterInstanceBindOptions,
  ): IAuroraClusterInstance

  /**
   * Create the database instance within the provided cluster.
   *
   * @param scope 
   * @param cluster 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("399891285f8ba8d6e579258f766002e872fa6db6740626abf35971b320798eee")
  public fun bind(
    scope: Construct,
    cluster: IDatabaseCluster,
    options: ClusterInstanceBindOptions.Builder.() -> Unit,
  ): IAuroraClusterInstance

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.IClusterInstance,
  ) : CdkObject(cdkObject), IClusterInstance {
    /**
     * Create the database instance within the provided cluster.
     *
     * @param scope 
     * @param cluster 
     * @param options 
     */
    override fun bind(
      scope: Construct,
      cluster: IDatabaseCluster,
      options: ClusterInstanceBindOptions,
    ): IAuroraClusterInstance = unwrap(this).bind(scope.let(Construct::unwrap),
        cluster.let(IDatabaseCluster::unwrap),
        options.let(ClusterInstanceBindOptions::unwrap)).let(IAuroraClusterInstance::wrap)

    /**
     * Create the database instance within the provided cluster.
     *
     * @param scope 
     * @param cluster 
     * @param options 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("399891285f8ba8d6e579258f766002e872fa6db6740626abf35971b320798eee")
    override fun bind(
      scope: Construct,
      cluster: IDatabaseCluster,
      options: ClusterInstanceBindOptions.Builder.() -> Unit,
    ): IAuroraClusterInstance = bind(scope, cluster, ClusterInstanceBindOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IClusterInstance):
        IClusterInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IClusterInstance):
        software.amazon.awscdk.services.rds.IClusterInstance = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IClusterInstance
  }
}
