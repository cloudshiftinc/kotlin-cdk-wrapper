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

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.supportapp.CfnAccountAliasProps
import kotlin.String

@CdkDslMarker
public class CfnAccountAliasPropsDsl {
    private val cdkBuilder: CfnAccountAliasProps.Builder = CfnAccountAliasProps.builder()

    public fun accountAlias(accountAlias: String) {
        cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): CfnAccountAliasProps = cdkBuilder.build()
}
