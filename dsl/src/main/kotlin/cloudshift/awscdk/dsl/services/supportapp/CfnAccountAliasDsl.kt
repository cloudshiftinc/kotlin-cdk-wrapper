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
import software.amazon.awscdk.services.supportapp.CfnAccountAlias
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnAccountAliasDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccountAlias.Builder = CfnAccountAlias.Builder.create(scope, id)

    public fun accountAlias(accountAlias: String) {
        cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): CfnAccountAlias = cdkBuilder.build()
}
