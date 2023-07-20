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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnKeyGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnKeyGroup.Builder = CfnKeyGroup.Builder.create(scope, id)

    public fun keyGroupConfig(keyGroupConfig: IResolvable) {
        cdkBuilder.keyGroupConfig(keyGroupConfig)
    }

    public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty) {
        cdkBuilder.keyGroupConfig(keyGroupConfig)
    }

    public fun build(): CfnKeyGroup = cdkBuilder.build()
}
