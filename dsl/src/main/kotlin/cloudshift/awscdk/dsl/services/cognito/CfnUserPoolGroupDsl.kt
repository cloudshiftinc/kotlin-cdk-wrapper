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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnUserPoolGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPoolGroup.Builder = CfnUserPoolGroup.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun precedence(precedence: Number) {
        cdkBuilder.precedence(precedence)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolGroup = cdkBuilder.build()
}
