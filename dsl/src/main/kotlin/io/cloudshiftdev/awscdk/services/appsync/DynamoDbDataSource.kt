package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DynamoDbDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.DynamoDbDataSource,
) : BackedDataSource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.DynamoDbDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    public fun description(description: String)

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * Specify whether this DS is read only or has read and write permissions to the DynamoDB table.
     *
     * Default: false
     *
     * @param readOnlyAccess Specify whether this DS is read only or has read and write permissions
     * to the DynamoDB table. 
     */
    public fun readOnlyAccess(readOnlyAccess: Boolean)

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * The DynamoDB table backing this data source.
     *
     * @param table The DynamoDB table backing this data source. 
     */
    public fun table(table: ITable)

    /**
     * use credentials of caller to access DynamoDB.
     *
     * Default: false
     *
     * @param useCallerCredentials use credentials of caller to access DynamoDB. 
     */
    public fun useCallerCredentials(useCallerCredentials: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DynamoDbDataSource.Builder =
        software.amazon.awscdk.services.appsync.DynamoDbDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specify whether this DS is read only or has read and write permissions to the DynamoDB table.
     *
     * Default: false
     *
     * @param readOnlyAccess Specify whether this DS is read only or has read and write permissions
     * to the DynamoDB table. 
     */
    override fun readOnlyAccess(readOnlyAccess: Boolean) {
      cdkBuilder.readOnlyAccess(readOnlyAccess)
    }

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    /**
     * The DynamoDB table backing this data source.
     *
     * @param table The DynamoDB table backing this data source. 
     */
    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable::unwrap))
    }

    /**
     * use credentials of caller to access DynamoDB.
     *
     * Default: false
     *
     * @param useCallerCredentials use credentials of caller to access DynamoDB. 
     */
    override fun useCallerCredentials(useCallerCredentials: Boolean) {
      cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DynamoDbDataSource =
        cdkBuilder.build()
  }

  public companion object {
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
