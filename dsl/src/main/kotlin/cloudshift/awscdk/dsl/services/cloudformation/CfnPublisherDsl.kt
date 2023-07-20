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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnPublisher
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnPublisherDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPublisher.Builder = CfnPublisher.Builder.create(scope, id)

    public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
        cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
        cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    public fun build(): CfnPublisher = cdkBuilder.build()
}
