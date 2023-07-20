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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnHookTypeConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHookTypeConfig.Builder = CfnHookTypeConfig.Builder.create(scope, id)

    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    public fun configurationAlias(configurationAlias: String) {
        cdkBuilder.configurationAlias(configurationAlias)
    }

    public fun typeArn(typeArn: String) {
        cdkBuilder.typeArn(typeArn)
    }

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): CfnHookTypeConfig = cdkBuilder.build()
}
