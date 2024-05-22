@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * Proxy target: Instance or Cluster.
 *
 * A target group is a collection of databases that the proxy can connect to.
 * Currently, you can specify only one RDS DB instance or Aurora DB cluster.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
 * .version(AuroraMysqlEngineVersion.VER_3_03_0)
 * .build()))
 * .writer(ClusterInstance.provisioned("writer"))
 * .vpc(vpc)
 * .build();
 * DatabaseProxy proxy = DatabaseProxy.Builder.create(this, "Proxy")
 * .proxyTarget(ProxyTarget.fromCluster(cluster))
 * .secrets(List.of(cluster.getSecret()))
 * .vpc(vpc)
 * .build();
 * Role role = Role.Builder.create(this, "DBProxyRole").assumedBy(new
 * AccountPrincipal(this.account)).build();
 * proxy.grantConnect(role, "admin");
 * ```
 */
public open class ProxyTarget(
  cdkObject: software.amazon.awscdk.services.rds.ProxyTarget,
) : CdkObject(cdkObject) {
  /**
   * Bind this target to the specified database proxy.
   *
   * @param proxy 
   */
  public open fun bind(proxy: DatabaseProxy): ProxyTargetConfig =
      unwrap(this).bind(proxy.let(DatabaseProxy.Companion::unwrap)).let(ProxyTargetConfig::wrap)

  public companion object {
    public fun fromCluster(cluster: IDatabaseCluster): ProxyTarget =
        software.amazon.awscdk.services.rds.ProxyTarget.fromCluster(cluster.let(IDatabaseCluster.Companion::unwrap)).let(ProxyTarget::wrap)

    public fun fromInstance(instance: IDatabaseInstance): ProxyTarget =
        software.amazon.awscdk.services.rds.ProxyTarget.fromInstance(instance.let(IDatabaseInstance.Companion::unwrap)).let(ProxyTarget::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ProxyTarget): ProxyTarget =
        ProxyTarget(cdkObject)

    internal fun unwrap(wrapped: ProxyTarget): software.amazon.awscdk.services.rds.ProxyTarget =
        wrapped.cdkObject as software.amazon.awscdk.services.rds.ProxyTarget
  }
}
