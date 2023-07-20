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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CfnStorageLens
import kotlin.String

@CdkDslMarker
public class CfnStorageLensAwsOrgPropertyDsl {
    private val cdkBuilder: CfnStorageLens.AwsOrgProperty.Builder =
        CfnStorageLens.AwsOrgProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnStorageLens.AwsOrgProperty = cdkBuilder.build()
}
