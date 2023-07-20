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

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kms.CfnAliasProps
import kotlin.String

@CdkDslMarker
public class CfnAliasPropsDsl {
    private val cdkBuilder: CfnAliasProps.Builder = CfnAliasProps.builder()

    public fun aliasName(aliasName: String) {
        cdkBuilder.aliasName(aliasName)
    }

    public fun targetKeyId(targetKeyId: String) {
        cdkBuilder.targetKeyId(targetKeyId)
    }

    public fun build(): CfnAliasProps = cdkBuilder.build()
}
