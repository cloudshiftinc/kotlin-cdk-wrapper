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
import software.amazon.awscdk.services.detective.CfnOrganizationAdminProps
import kotlin.String

@CdkDslMarker
public class CfnOrganizationAdminPropsDsl {
    private val cdkBuilder: CfnOrganizationAdminProps.Builder = CfnOrganizationAdminProps.builder()

    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    public fun build(): CfnOrganizationAdminProps = cdkBuilder.build()
}
