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
import software.amazon.awscdk.services.lambda.AliasAttributes
import software.amazon.awscdk.services.lambda.IVersion
import kotlin.String

@CdkDslMarker
public class AliasAttributesDsl {
    private val cdkBuilder: AliasAttributes.Builder = AliasAttributes.builder()

    public fun aliasName(aliasName: String) {
        cdkBuilder.aliasName(aliasName)
    }

    public fun aliasVersion(aliasVersion: IVersion) {
        cdkBuilder.aliasVersion(aliasVersion)
    }

    public fun build(): AliasAttributes = cdkBuilder.build()
}
