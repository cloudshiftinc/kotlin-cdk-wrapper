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

@CdkDslMarker
public class CfnWebACLStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.StatementProperty.Builder =
        CfnWebACL.StatementProperty.builder()

    public fun andStatement(andStatement: IResolvable) {
        cdkBuilder.andStatement(andStatement)
    }

    public fun andStatement(andStatement: CfnWebACL.AndStatementProperty) {
        cdkBuilder.andStatement(andStatement)
    }

    public fun byteMatchStatement(byteMatchStatement: IResolvable) {
        cdkBuilder.byteMatchStatement(byteMatchStatement)
    }

    public fun byteMatchStatement(byteMatchStatement: CfnWebACL.ByteMatchStatementProperty) {
        cdkBuilder.byteMatchStatement(byteMatchStatement)
    }

    public fun geoMatchStatement(geoMatchStatement: IResolvable) {
        cdkBuilder.geoMatchStatement(geoMatchStatement)
    }

    public fun geoMatchStatement(geoMatchStatement: CfnWebACL.GeoMatchStatementProperty) {
        cdkBuilder.geoMatchStatement(geoMatchStatement)
    }

    public fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
    }

    public fun ipSetReferenceStatement(ipSetReferenceStatement: CfnWebACL.IPSetReferenceStatementProperty) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
    }

    public fun labelMatchStatement(labelMatchStatement: IResolvable) {
        cdkBuilder.labelMatchStatement(labelMatchStatement)
    }

    public fun labelMatchStatement(labelMatchStatement: CfnWebACL.LabelMatchStatementProperty) {
        cdkBuilder.labelMatchStatement(labelMatchStatement)
    }

    public fun managedRuleGroupStatement(managedRuleGroupStatement: IResolvable) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement)
    }

    public fun managedRuleGroupStatement(managedRuleGroupStatement: CfnWebACL.ManagedRuleGroupStatementProperty) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement)
    }

    public fun notStatement(notStatement: IResolvable) {
        cdkBuilder.notStatement(notStatement)
    }

    public fun notStatement(notStatement: CfnWebACL.NotStatementProperty) {
        cdkBuilder.notStatement(notStatement)
    }

    public fun orStatement(orStatement: IResolvable) {
        cdkBuilder.orStatement(orStatement)
    }

    public fun orStatement(orStatement: CfnWebACL.OrStatementProperty) {
        cdkBuilder.orStatement(orStatement)
    }

    public fun rateBasedStatement(rateBasedStatement: IResolvable) {
        cdkBuilder.rateBasedStatement(rateBasedStatement)
    }

    public fun rateBasedStatement(rateBasedStatement: CfnWebACL.RateBasedStatementProperty) {
        cdkBuilder.rateBasedStatement(rateBasedStatement)
    }

    public fun regexMatchStatement(regexMatchStatement: IResolvable) {
        cdkBuilder.regexMatchStatement(regexMatchStatement)
    }

    public fun regexMatchStatement(regexMatchStatement: CfnWebACL.RegexMatchStatementProperty) {
        cdkBuilder.regexMatchStatement(regexMatchStatement)
    }

    public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
    }

    public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: CfnWebACL.RegexPatternSetReferenceStatementProperty) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
    }

    public fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: IResolvable) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement)
    }

    public fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: CfnWebACL.RuleGroupReferenceStatementProperty) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement)
    }

    public fun sizeConstraintStatement(sizeConstraintStatement: IResolvable) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
    }

    public fun sizeConstraintStatement(sizeConstraintStatement: CfnWebACL.SizeConstraintStatementProperty) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
    }

    public fun sqliMatchStatement(sqliMatchStatement: IResolvable) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement)
    }

    public fun sqliMatchStatement(sqliMatchStatement: CfnWebACL.SqliMatchStatementProperty) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement)
    }

    public fun xssMatchStatement(xssMatchStatement: IResolvable) {
        cdkBuilder.xssMatchStatement(xssMatchStatement)
    }

    public fun xssMatchStatement(xssMatchStatement: CfnWebACL.XssMatchStatementProperty) {
        cdkBuilder.xssMatchStatement(xssMatchStatement)
    }

    public fun build(): CfnWebACL.StatementProperty = cdkBuilder.build()
}
