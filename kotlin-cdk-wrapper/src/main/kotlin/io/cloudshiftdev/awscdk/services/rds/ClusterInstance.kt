@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Create an RDS Aurora Cluster Instance.
 *
 * You can create either provisioned or
 * serverless v2 instances.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster myCluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
 * .build()))
 * .serverlessV2MinCapacity(6.5)
 * .serverlessV2MaxCapacity(64)
 * .readers(List.of(ClusterInstance.serverlessV2("reader1",
 * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
 * ClusterInstance.serverlessV2("reader2")))
 * .vpc(vpc)
 * .build();
 * ```
 */
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d781f29fad51f76e0bd5fa96d5869cf89788dae13f9423dd8350045fd31dd643")
    public fun provisioned(id: String, props: ProvisionedClusterInstanceProps.Builder.() -> Unit):
        IClusterInstance = provisioned(id, ProvisionedClusterInstanceProps(props))

    public fun serverlessV2(id: String): IClusterInstance =
        software.amazon.awscdk.services.rds.ClusterInstance.serverlessV2(id).let(IClusterInstance::wrap)

    public fun serverlessV2(id: String, props: ServerlessV2ClusterInstanceProps): IClusterInstance =
        software.amazon.awscdk.services.rds.ClusterInstance.serverlessV2(id,
        props.let(ServerlessV2ClusterInstanceProps::unwrap)).let(IClusterInstance::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73be7bc5cb344f273c10e948ec127924955eca80caa2aa170c4b72f334319798")
    public fun serverlessV2(id: String, props: ServerlessV2ClusterInstanceProps.Builder.() -> Unit):
        IClusterInstance = serverlessV2(id, ServerlessV2ClusterInstanceProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterInstance):
        ClusterInstance = ClusterInstance(cdkObject)

    internal fun unwrap(wrapped: ClusterInstance):
        software.amazon.awscdk.services.rds.ClusterInstance = wrapped.cdkObject
  }
}
