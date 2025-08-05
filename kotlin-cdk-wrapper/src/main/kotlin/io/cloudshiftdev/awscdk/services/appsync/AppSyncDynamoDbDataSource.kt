@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync datasource backed by a DynamoDB table.
 *
 * Example:
 *
 * ```
 * EventApi api = EventApi.Builder.create(this, "EventApiDynamoDB")
 * .apiName("DynamoDBEventApi")
 * .build();
 * Table table = Table.Builder.create(this, "table")
 * .tableName("event-messages")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .build();
 * AppSyncDynamoDbDataSource dataSource = api.addDynamoDbDataSource("ddbsource", table);
 * ```
 */
public open class AppSyncDynamoDbDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource,
) : AppSyncBackedDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncDynamoDbDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AppSyncDynamoDbDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncDynamoDbDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, AppSyncDynamoDbDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.AppSyncDynamoDbDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
     */
    public fun description(description: String)

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * Specify whether this Data Source is read only or has read and write permissions to the
     * DynamoDB table.
     *
     * Default: false
     *
     * @param readOnlyAccess Specify whether this Data Source is read only or has read and write
     * permissions to the DynamoDB table. 
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
     * Use credentials of caller to access DynamoDB.
     *
     * Default: false
     *
     * @param useCallerCredentials Use credentials of caller to access DynamoDB. 
     */
    public fun useCallerCredentials(useCallerCredentials: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource.Builder =
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specify whether this Data Source is read only or has read and write permissions to the
     * DynamoDB table.
     *
     * Default: false
     *
     * @param readOnlyAccess Specify whether this Data Source is read only or has read and write
     * permissions to the DynamoDB table. 
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
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    /**
     * The DynamoDB table backing this data source.
     *
     * @param table The DynamoDB table backing this data source. 
     */
    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable.Companion::unwrap))
    }

    /**
     * Use credentials of caller to access DynamoDB.
     *
     * Default: false
     *
     * @param useCallerCredentials Use credentials of caller to access DynamoDB. 
     */
    override fun useCallerCredentials(useCallerCredentials: Boolean) {
      cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AppSyncDynamoDbDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AppSyncDynamoDbDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource):
        AppSyncDynamoDbDataSource = AppSyncDynamoDbDataSource(cdkObject)

    internal fun unwrap(wrapped: AppSyncDynamoDbDataSource):
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource
  }
}
