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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnCodeSigningConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCodeSigningConfig.Builder = CfnCodeSigningConfig.Builder.create(
        scope,
        id,
    )

    public fun allowedPublishers(allowedPublishers: IResolvable) {
        cdkBuilder.allowedPublishers(allowedPublishers)
    }

    public fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty) {
        cdkBuilder.allowedPublishers(allowedPublishers)
    }

    public fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
        cdkBuilder.codeSigningPolicies(codeSigningPolicies)
    }

    public fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty) {
        cdkBuilder.codeSigningPolicies(codeSigningPolicies)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnCodeSigningConfig = cdkBuilder.build()
}
