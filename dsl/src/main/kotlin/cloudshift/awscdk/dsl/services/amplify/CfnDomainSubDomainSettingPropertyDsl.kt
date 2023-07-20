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

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.amplify.CfnDomain
import kotlin.String

@CdkDslMarker
public class CfnDomainSubDomainSettingPropertyDsl {
    private val cdkBuilder: CfnDomain.SubDomainSettingProperty.Builder =
        CfnDomain.SubDomainSettingProperty.builder()

    public fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnDomain.SubDomainSettingProperty = cdkBuilder.build()
}
