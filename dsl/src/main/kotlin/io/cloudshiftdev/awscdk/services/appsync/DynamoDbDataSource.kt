package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DynamoDbDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.DynamoDbDataSource,
) : BackedDataSource(cdkObject) {
  public interface Builder {
    public fun api(api: IGraphqlApi) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun readOnlyAccess(readOnlyAccess: Boolean) {
    }

    public fun serviceRole(serviceRole: IRole) {
    }

    public fun table(table: ITable) {
    }

    public fun useCallerCredentials(useCallerCredentials: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DynamoDbDataSource.Builder =
        software.amazon.awscdk.services.appsync.DynamoDbDataSource.Builder.create(scope, id)

    public override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun readOnlyAccess(readOnlyAccess: Boolean) {
      cdkBuilder.readOnlyAccess(readOnlyAccess)
    }

    public override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable::unwrap))
    }

    public override fun useCallerCredentials(useCallerCredentials: Boolean) {
      cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DynamoDbDataSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DynamoDbDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DynamoDbDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.DynamoDbDataSource):
        DynamoDbDataSource = DynamoDbDataSource(cdkObject)

    internal fun unwrap(wrapped: DynamoDbDataSource):
        software.amazon.awscdk.services.appsync.DynamoDbDataSource = wrapped.cdkObject
  }
}
