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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLRequestInspectionPropertyDsl {
    private val cdkBuilder: CfnWebACL.RequestInspectionProperty.Builder =
        CfnWebACL.RequestInspectionProperty.builder()

    public fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField)
    }

    public fun passwordField(passwordField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField)
    }

    public fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
    }

    public fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField)
    }

    public fun usernameField(usernameField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField)
    }

    public fun build(): CfnWebACL.RequestInspectionProperty = cdkBuilder.build()
}
