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
import software.amazon.awscdk.services.appsync.BaseDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import kotlin.String

@CdkDslMarker
public class BaseDataSourcePropsDsl {
    private val cdkBuilder: BaseDataSourceProps.Builder = BaseDataSourceProps.builder()

    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): BaseDataSourceProps = cdkBuilder.build()
}
