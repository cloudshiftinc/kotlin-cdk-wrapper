@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.opensearchservice.IDomain
import kotlin.String

@CdkDslMarker
public class OpenSearchDataSourcePropsDsl {
    private val cdkBuilder: OpenSearchDataSourceProps.Builder = OpenSearchDataSourceProps.builder()

    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun domain(domain: IDomain) {
        cdkBuilder.domain(domain)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): OpenSearchDataSourceProps = cdkBuilder.build()
}
