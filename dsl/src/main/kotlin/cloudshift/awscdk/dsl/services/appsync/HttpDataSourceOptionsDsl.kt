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
import software.amazon.awscdk.services.appsync.AwsIamConfig
import software.amazon.awscdk.services.appsync.HttpDataSourceOptions
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class HttpDataSourceOptionsDsl {
    private val cdkBuilder: HttpDataSourceOptions.Builder = HttpDataSourceOptions.builder()

    public fun authorizationConfig(block: AwsIamConfigDsl.() -> Unit = {}) {
        val builder = AwsIamConfigDsl()
        builder.apply(block)
        cdkBuilder.authorizationConfig(builder.build())
    }

    public fun authorizationConfig(authorizationConfig: AwsIamConfig) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): HttpDataSourceOptions = cdkBuilder.build()
}
