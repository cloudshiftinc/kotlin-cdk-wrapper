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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateIamInstanceProfilePropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.IamInstanceProfileProperty.Builder =
        CfnLaunchTemplate.IamInstanceProfileProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnLaunchTemplate.IamInstanceProfileProperty = cdkBuilder.build()
}
