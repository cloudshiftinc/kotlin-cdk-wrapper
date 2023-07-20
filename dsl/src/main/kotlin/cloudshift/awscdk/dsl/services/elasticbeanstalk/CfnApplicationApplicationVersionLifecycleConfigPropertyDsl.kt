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

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

@CdkDslMarker
public class CfnApplicationApplicationVersionLifecycleConfigPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder =
        CfnApplication.ApplicationVersionLifecycleConfigProperty.builder()

    public fun maxAgeRule(maxAgeRule: IResolvable) {
        cdkBuilder.maxAgeRule(maxAgeRule)
    }

    public fun maxAgeRule(maxAgeRule: CfnApplication.MaxAgeRuleProperty) {
        cdkBuilder.maxAgeRule(maxAgeRule)
    }

    public fun maxCountRule(maxCountRule: IResolvable) {
        cdkBuilder.maxCountRule(maxCountRule)
    }

    public fun maxCountRule(maxCountRule: CfnApplication.MaxCountRuleProperty) {
        cdkBuilder.maxCountRule(maxCountRule)
    }

    public fun build(): CfnApplication.ApplicationVersionLifecycleConfigProperty = cdkBuilder.build()
}
