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
public class CfnWebACLManagedRuleGroupConfigPropertyDsl {
    private val cdkBuilder: CfnWebACL.ManagedRuleGroupConfigProperty.Builder =
        CfnWebACL.ManagedRuleGroupConfigProperty.builder()

    public fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet)
    }

    public fun awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet: CfnWebACL.AWSManagedRulesATPRuleSetProperty) {
        cdkBuilder.awsManagedRulesAtpRuleSet(awsManagedRulesAtpRuleSet)
    }

    public fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: IResolvable) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet)
    }

    public fun awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet: CfnWebACL.AWSManagedRulesBotControlRuleSetProperty) {
        cdkBuilder.awsManagedRulesBotControlRuleSet(awsManagedRulesBotControlRuleSet)
    }

    public fun loginPath(loginPath: String) {
        cdkBuilder.loginPath(loginPath)
    }

    public fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField)
    }

    public fun passwordField(passwordField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField)
    }

    public fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
    }

    public fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField)
    }

    public fun usernameField(usernameField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField)
    }

    public fun build(): CfnWebACL.ManagedRuleGroupConfigProperty = cdkBuilder.build()
}
