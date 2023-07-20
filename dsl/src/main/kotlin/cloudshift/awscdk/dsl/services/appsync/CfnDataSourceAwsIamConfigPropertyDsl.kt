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
public class CfnDataSourceAwsIamConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.AwsIamConfigProperty.Builder =
        CfnDataSource.AwsIamConfigProperty.builder()

    public fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
    }

    public fun signingServiceName(signingServiceName: String) {
        cdkBuilder.signingServiceName(signingServiceName)
    }

    public fun build(): CfnDataSource.AwsIamConfigProperty = cdkBuilder.build()
}
