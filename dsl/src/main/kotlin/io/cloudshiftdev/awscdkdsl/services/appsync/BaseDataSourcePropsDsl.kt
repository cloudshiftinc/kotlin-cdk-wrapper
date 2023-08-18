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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.BaseDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi

/**
 * Base properties for an AppSync datasource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * GraphqlApi graphqlApi;
 * BaseDataSourceProps baseDataSourceProps = BaseDataSourceProps.builder()
 * .api(graphqlApi)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseDataSourcePropsDsl {
    private val cdkBuilder: BaseDataSourceProps.Builder = BaseDataSourceProps.builder()

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

    public fun build(): BaseDataSourceProps = cdkBuilder.build()
}
