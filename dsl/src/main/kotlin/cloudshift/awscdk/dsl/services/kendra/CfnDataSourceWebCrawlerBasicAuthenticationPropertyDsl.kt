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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDataSourceWebCrawlerBasicAuthenticationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerBasicAuthenticationProperty.Builder =
        CfnDataSource.WebCrawlerBasicAuthenticationProperty.builder()

    public fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
    }

    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.WebCrawlerBasicAuthenticationProperty = cdkBuilder.build()
}
