@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for an AppSync DynamoDB datasource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.dynamodb.*;
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class DynamoDbDataSourcePropsDsl {
    private val cdkBuilder: DynamoDbDataSourceProps.Builder = DynamoDbDataSourceProps.builder()

    /** @param api The API to attach this data source to. */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /** @param description the description of the data source. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the data source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param readOnlyAccess Specify whether this DS is read only or has read and write permissions
     *   to the DynamoDB table.
     */
    public fun readOnlyAccess(readOnlyAccess: Boolean) {
        cdkBuilder.readOnlyAccess(readOnlyAccess)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     *   source.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /** @param table The DynamoDB table backing this data source. */
    public fun table(table: ITable) {
        cdkBuilder.table(table)
    }

    /** @param useCallerCredentials use credentials of caller to access DynamoDB. */
    public fun useCallerCredentials(useCallerCredentials: Boolean) {
        cdkBuilder.useCallerCredentials(useCallerCredentials)
    }

    public fun build(): DynamoDbDataSourceProps = cdkBuilder.build()
}
