@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit

public interface RdsDataSourceProps : BackedDataSourceProps {
  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  public fun secretStore(): ISecret

  public fun serverlessCluster(): IServerlessCluster

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun databaseName(databaseName: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun secretStore(secretStore: ISecret)

    public fun serverlessCluster(serverlessCluster: IServerlessCluster)

    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.RdsDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.RdsDataSourceProps.builder()

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun secretStore(secretStore: ISecret) {
      cdkBuilder.secretStore(secretStore.let(ISecret::unwrap))
    }

    override fun serverlessCluster(serverlessCluster: IServerlessCluster) {
      cdkBuilder.serverlessCluster(serverlessCluster.let(IServerlessCluster::unwrap))
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.RdsDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.RdsDataSourceProps,
  ) : CdkObject(cdkObject), RdsDataSourceProps {
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun secretStore(): ISecret = unwrap(this).getSecretStore().let(ISecret::wrap)

    override fun serverlessCluster(): IServerlessCluster =
        unwrap(this).getServerlessCluster().let(IServerlessCluster::wrap)

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RdsDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.RdsDataSourceProps):
        RdsDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RdsDataSourceProps):
        software.amazon.awscdk.services.appsync.RdsDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.RdsDataSourceProps
  }
}
