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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnPublisherProps
import software.amazon.awscdk.IResolvable
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnPublisherPropsDsl {
    private val cdkBuilder: CfnPublisherProps.Builder = CfnPublisherProps.builder()

    public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
        cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
        cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    public fun build(): CfnPublisherProps = cdkBuilder.build()
}
