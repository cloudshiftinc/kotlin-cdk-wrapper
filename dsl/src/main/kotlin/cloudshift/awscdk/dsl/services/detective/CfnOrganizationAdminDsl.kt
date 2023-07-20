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

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.detective.CfnOrganizationAdmin
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnOrganizationAdminDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOrganizationAdmin.Builder = CfnOrganizationAdmin.Builder.create(
        scope,
        id,
    )

    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    public fun build(): CfnOrganizationAdmin = cdkBuilder.build()
}
