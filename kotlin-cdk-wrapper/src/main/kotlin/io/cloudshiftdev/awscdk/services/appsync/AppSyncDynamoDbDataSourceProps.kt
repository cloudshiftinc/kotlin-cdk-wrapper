@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for an AppSync DynamoDB datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * IApi api;
 * Role role;
 * Table table;
 * AppSyncDynamoDbDataSourceProps appSyncDynamoDbDataSourceProps =
 * AppSyncDynamoDbDataSourceProps.builder()
 * .api(api)
 * .table(table)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .readOnlyAccess(false)
 * .serviceRole(role)
 * .useCallerCredentials(false)
 * .build();
 * ```
 */
public interface AppSyncDynamoDbDataSourceProps : AppSyncBackedDataSourceProps {
  /**
   * Specify whether this Data Source is read only or has read and write permissions to the DynamoDB
   * table.
   *
   * Default: false
   */
  public fun readOnlyAccess(): Boolean? = unwrap(this).getReadOnlyAccess()

  /**
   * The DynamoDB table backing this data source.
   */
  public fun table(): ITable

  /**
   * Use credentials of caller to access DynamoDB.
   *
   * Default: false
   */
  public fun useCallerCredentials(): Boolean? = unwrap(this).getUseCallerCredentials()

  /**
   * A builder for [AppSyncDynamoDbDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * @param description The description of the data source.
     */
    public fun description(description: String)

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     */
    public fun name(name: String)

    /**
     * @param readOnlyAccess Specify whether this Data Source is read only or has read and write
     * permissions to the DynamoDB table.
     */
    public fun readOnlyAccess(readOnlyAccess: Boolean)

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * @param table The DynamoDB table backing this data source. 
     */
    public fun table(table: ITable)

    /**
     * @param useCallerCredentials Use credentials of caller to access DynamoDB.
     */
    public fun useCallerCredentials(useCallerCredentials: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * @param description The description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param readOnlyAccess Specify whether this Data Source is read only or has read and write
     * permissions to the DynamoDB table.
     */
    override fun readOnlyAccess(readOnlyAccess: Boolean) {
      cdkBuilder.readOnlyAccess(readOnlyAccess)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param table The DynamoDB table backing this data source. 
     */
    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable.Companion::unwrap))
    }

    /**
     * @param useCallerCredentials Use credentials of caller to access DynamoDB.
     */
    override fun useCallerCredentials(useCallerCredentials: Boolean) {
      cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps,
  ) : CdkObject(cdkObject),
      AppSyncDynamoDbDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IApi = unwrap(this).getApi().let(IApi::wrap)

    /**
     * The description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specify whether this Data Source is read only or has read and write permissions to the
     * DynamoDB table.
     *
     * Default: false
     */
    override fun readOnlyAccess(): Boolean? = unwrap(this).getReadOnlyAccess()

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    /**
     * The DynamoDB table backing this data source.
     */
    override fun table(): ITable = unwrap(this).getTable().let(ITable::wrap)

    /**
     * Use credentials of caller to access DynamoDB.
     *
     * Default: false
     */
    override fun useCallerCredentials(): Boolean? = unwrap(this).getUseCallerCredentials()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncDynamoDbDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps):
        AppSyncDynamoDbDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        AppSyncDynamoDbDataSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncDynamoDbDataSourceProps):
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps
  }
}
