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

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.organizations.CfnOrganizationProps
import kotlin.String

@CdkDslMarker
public class CfnOrganizationPropsDsl {
    private val cdkBuilder: CfnOrganizationProps.Builder = CfnOrganizationProps.builder()

    public fun featureSet(featureSet: String) {
        cdkBuilder.featureSet(featureSet)
    }

    public fun build(): CfnOrganizationProps = cdkBuilder.build()
}
