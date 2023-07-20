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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateConstraintDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLaunchTemplateConstraint.Builder =
        CfnLaunchTemplateConstraint.Builder.create(scope, id)

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun rules(rules: String) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnLaunchTemplateConstraint = cdkBuilder.build()
}
