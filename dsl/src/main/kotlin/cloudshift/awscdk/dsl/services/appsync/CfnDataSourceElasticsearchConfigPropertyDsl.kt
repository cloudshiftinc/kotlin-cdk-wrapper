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
import software.amazon.awscdk.services.appsync.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceElasticsearchConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.ElasticsearchConfigProperty.Builder =
        CfnDataSource.ElasticsearchConfigProperty.builder()

    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun build(): CfnDataSource.ElasticsearchConfigProperty = cdkBuilder.build()
}
