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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLAWSManagedRulesATPRuleSetPropertyDsl {
    private val cdkBuilder: CfnWebACL.AWSManagedRulesATPRuleSetProperty.Builder =
        CfnWebACL.AWSManagedRulesATPRuleSetProperty.builder()

    public fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
    }

    public fun requestInspection(requestInspection: IResolvable) {
        cdkBuilder.requestInspection(requestInspection)
    }

    public fun requestInspection(requestInspection: CfnWebACL.RequestInspectionProperty) {
        cdkBuilder.requestInspection(requestInspection)
    }

    public fun responseInspection(responseInspection: IResolvable) {
        cdkBuilder.responseInspection(responseInspection)
    }

    public fun responseInspection(responseInspection: CfnWebACL.ResponseInspectionProperty) {
        cdkBuilder.responseInspection(responseInspection)
    }

    public fun build(): CfnWebACL.AWSManagedRulesATPRuleSetProperty = cdkBuilder.build()
}
