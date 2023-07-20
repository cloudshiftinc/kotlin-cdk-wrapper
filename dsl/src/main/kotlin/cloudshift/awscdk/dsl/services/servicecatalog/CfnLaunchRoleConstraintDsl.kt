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
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnLaunchRoleConstraintDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLaunchRoleConstraint.Builder =
        CfnLaunchRoleConstraint.Builder.create(scope, id)

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun localRoleName(localRoleName: String) {
        cdkBuilder.localRoleName(localRoleName)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnLaunchRoleConstraint = cdkBuilder.build()
}
