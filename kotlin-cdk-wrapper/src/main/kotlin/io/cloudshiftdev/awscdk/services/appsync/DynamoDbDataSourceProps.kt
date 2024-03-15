@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface DynamoDbDataSourceProps : BackedDataSourceProps {
  public fun readOnlyAccess(): Boolean? = unwrap(this).getReadOnlyAccess()

  public fun table(): ITable

  public fun useCallerCredentials(): Boolean? = unwrap(this).getUseCallerCredentials()

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun description(description: String)

    public fun name(name: String)

    public fun readOnlyAccess(readOnlyAccess: Boolean)

    public fun serviceRole(serviceRole: IRole)

    public fun table(table: ITable)

    public fun useCallerCredentials(useCallerCredentials: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps.Builder
        = software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps.builder()

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun readOnlyAccess(readOnlyAccess: Boolean) {
      cdkBuilder.readOnlyAccess(readOnlyAccess)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable::unwrap))
    }

    override fun useCallerCredentials(useCallerCredentials: Boolean) {
      cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps,
  ) : CdkObject(cdkObject), DynamoDbDataSourceProps {
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun readOnlyAccess(): Boolean? = unwrap(this).getReadOnlyAccess()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    override fun table(): ITable = unwrap(this).getTable().let(ITable::wrap)

    override fun useCallerCredentials(): Boolean? = unwrap(this).getUseCallerCredentials()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDbDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps):
        DynamoDbDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoDbDataSourceProps):
        software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps
  }
}
