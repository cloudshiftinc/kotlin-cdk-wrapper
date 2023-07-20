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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appconfig.CfnExtension
import kotlin.String

@CdkDslMarker
public class CfnExtensionActionPropertyDsl {
    private val cdkBuilder: CfnExtension.ActionProperty.Builder =
        CfnExtension.ActionProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnExtension.ActionProperty = cdkBuilder.build()
}
