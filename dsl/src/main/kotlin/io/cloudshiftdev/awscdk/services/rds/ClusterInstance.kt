package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class ClusterInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.ClusterInstance,
) : CdkObject(cdkObject), IClusterInstance {
  /**
   * Add the ClusterInstance to the cluster.
   *
   * @param scope 
   * @param cluster 
   * @param props 
   */
  public override fun bind(
    scope: Construct,
    cluster: IDatabaseCluster,
    props: ClusterInstanceBindOptions,
  ): IAuroraClusterInstance = unwrap(this).bind(scope.let(Construct::unwrap),
      cluster.let(IDatabaseCluster::unwrap),
      props.let(ClusterInstanceBindOptions::unwrap)).let(IAuroraClusterInstance::wrap)

  /**
   * Add the ClusterInstance to the cluster.
   *
   * @param scope 
   * @param cluster 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("399891285f8ba8d6e579258f766002e872fa6db6740626abf35971b320798eee")
  public override fun bind(
    scope: Construct,
    cluster: IDatabaseCluster,
    props: ClusterInstanceBindOptions.Builder.() -> Unit,
  ): IAuroraClusterInstance = bind(scope, cluster, ClusterInstanceBindOptions(props))

  public companion object {
    public fun provisioned(id: String): IClusterInstance =
        software.amazon.awscdk.services.rds.ClusterInstance.provisioned(id).let(IClusterInstance::wrap)

    public fun provisioned(id: String, props: ProvisionedClusterInstanceProps): IClusterInstance =
        software.amazon.awscdk.services.rds.ClusterInstance.provisioned(id,
        props.let(ProvisionedClusterInstanceProps::unwrap)).let(IClusterInstance::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d781f29fad51f76e0bd5fa96d5869cf89788dae13f9423dd8350045fd31dd643")
    public fun provisioned(id: String, props: ProvisionedClusterInstanceProps.Builder.() -> Unit):
        IClusterInstance = provisioned(id, ProvisionedClusterInstanceProps(props))

    public fun serverlessV2(id: String): IClusterInstance =
        software.amazon.awscdk.services.rds.ClusterInstance.serverlessV2(id).let(IClusterInstance::wrap)

    public fun serverlessV2(id: String, props: ServerlessV2ClusterInstanceProps): IClusterInstance =
        software.amazon.awscdk.services.rds.ClusterInstance.serverlessV2(id,
        props.let(ServerlessV2ClusterInstanceProps::unwrap)).let(IClusterInstance::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73be7bc5cb344f273c10e948ec127924955eca80caa2aa170c4b72f334319798")
    public fun serverlessV2(id: String, props: ServerlessV2ClusterInstanceProps.Builder.() -> Unit):
        IClusterInstance = serverlessV2(id, ServerlessV2ClusterInstanceProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterInstance):
        ClusterInstance = ClusterInstance(cdkObject)

    internal fun unwrap(wrapped: ClusterInstance):
        software.amazon.awscdk.services.rds.ClusterInstance = wrapped.cdkObject
  }
}
