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

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.resiliencehub.CfnApp
import kotlin.String

@CdkDslMarker
public class CfnAppPhysicalResourceIdPropertyDsl {
    private val cdkBuilder: CfnApp.PhysicalResourceIdProperty.Builder =
        CfnApp.PhysicalResourceIdProperty.builder()

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnApp.PhysicalResourceIdProperty = cdkBuilder.build()
}
