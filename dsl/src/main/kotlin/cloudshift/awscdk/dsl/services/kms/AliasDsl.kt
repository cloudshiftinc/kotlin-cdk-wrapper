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
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class AliasDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Alias.Builder = Alias.Builder.create(scope, id)

    public fun aliasName(aliasName: String) {
        cdkBuilder.aliasName(aliasName)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun targetKey(targetKey: IKey) {
        cdkBuilder.targetKey(targetKey)
    }

    public fun build(): Alias = cdkBuilder.build()
}
