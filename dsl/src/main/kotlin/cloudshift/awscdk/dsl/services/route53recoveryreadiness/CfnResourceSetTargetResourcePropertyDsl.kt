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

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@CdkDslMarker
public class CfnResourceSetTargetResourcePropertyDsl {
    private val cdkBuilder: CfnResourceSet.TargetResourceProperty.Builder =
        CfnResourceSet.TargetResourceProperty.builder()

    public fun nlbResource(nlbResource: IResolvable) {
        cdkBuilder.nlbResource(nlbResource)
    }

    public fun nlbResource(nlbResource: CfnResourceSet.NLBResourceProperty) {
        cdkBuilder.nlbResource(nlbResource)
    }

    public fun r53Resource(r53Resource: IResolvable) {
        cdkBuilder.r53Resource(r53Resource)
    }

    public fun r53Resource(r53Resource: CfnResourceSet.R53ResourceRecordProperty) {
        cdkBuilder.r53Resource(r53Resource)
    }

    public fun build(): CfnResourceSet.TargetResourceProperty = cdkBuilder.build()
}
