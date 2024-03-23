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
 * GraphqlApi graphqlApi;
 * Role role;
 * Table table;
 * DynamoDbDataSourceProps dynamoDbDataSourceProps = DynamoDbDataSourceProps.builder()
 * .api(graphqlApi)
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
public interface DynamoDbDataSourceProps : BackedDataSourceProps {
  /**
   * Specify whether this DS is read only or has read and write permissions to the DynamoDB table.
   *
   * Default: false
   */
  public fun readOnlyAccess(): Boolean? = unwrap(this).getReadOnlyAccess()

  /**
   * The DynamoDB table backing this data source.
   */
  public fun table(): ITable

  /**
   * use credentials of caller to access DynamoDB.
   *
   * Default: false
   */
  public fun useCallerCredentials(): Boolean? = unwrap(this).getUseCallerCredentials()

  /**
   * A builder for [DynamoDbDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param description the description of the data source.
     */
    public fun description(description: String)

    /**
     * @param name The name of the data source.
     */
    public fun name(name: String)

    /**
     * @param readOnlyAccess Specify whether this DS is read only or has read and write permissions
     * to the DynamoDB table.
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
     * @param useCallerCredentials use credentials of caller to access DynamoDB.
     */
    public fun useCallerCredentials(useCallerCredentials: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps.Builder
        = software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * @param description the description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data source.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param readOnlyAccess Specify whether this DS is read only or has read and write permissions
     * to the DynamoDB table.
     */
    override fun readOnlyAccess(readOnlyAccess: Boolean) {
      cdkBuilder.readOnlyAccess(readOnlyAccess)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    /**
     * @param table The DynamoDB table backing this data source. 
     */
    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable::unwrap))
    }

    /**
     * @param useCallerCredentials use credentials of caller to access DynamoDB.
     */
    override fun useCallerCredentials(useCallerCredentials: Boolean) {
      cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps,
  ) : CdkObject(cdkObject), DynamoDbDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * the description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specify whether this DS is read only or has read and write permissions to the DynamoDB table.
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
     * use credentials of caller to access DynamoDB.
     *
     * Default: false
     */
    override fun useCallerCredentials(): Boolean? = unwrap(this).getUseCallerCredentials()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDbDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps):
        DynamoDbDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? DynamoDbDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoDbDataSourceProps):
        software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps
  }
}
