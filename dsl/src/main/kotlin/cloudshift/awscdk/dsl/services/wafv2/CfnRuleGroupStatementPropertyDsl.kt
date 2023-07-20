@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.StatementProperty.Builder =
      CfnRuleGroup.StatementProperty.builder()

  public fun andStatement(andStatement: IResolvable) {
    cdkBuilder.andStatement(andStatement)
  }

  public fun andStatement(andStatement: CfnRuleGroup.AndStatementProperty) {
    cdkBuilder.andStatement(andStatement)
  }

  public fun byteMatchStatement(byteMatchStatement: IResolvable) {
    cdkBuilder.byteMatchStatement(byteMatchStatement)
  }

  public fun byteMatchStatement(byteMatchStatement: CfnRuleGroup.ByteMatchStatementProperty) {
    cdkBuilder.byteMatchStatement(byteMatchStatement)
  }

  public fun geoMatchStatement(geoMatchStatement: IResolvable) {
    cdkBuilder.geoMatchStatement(geoMatchStatement)
  }

  public fun geoMatchStatement(geoMatchStatement: CfnRuleGroup.GeoMatchStatementProperty) {
    cdkBuilder.geoMatchStatement(geoMatchStatement)
  }

  public fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable) {
    cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
  }

  public
      fun ipSetReferenceStatement(ipSetReferenceStatement: CfnRuleGroup.IPSetReferenceStatementProperty) {
    cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
  }

  public fun labelMatchStatement(labelMatchStatement: IResolvable) {
    cdkBuilder.labelMatchStatement(labelMatchStatement)
  }

  public fun labelMatchStatement(labelMatchStatement: CfnRuleGroup.LabelMatchStatementProperty) {
    cdkBuilder.labelMatchStatement(labelMatchStatement)
  }

  public fun notStatement(notStatement: IResolvable) {
    cdkBuilder.notStatement(notStatement)
  }

  public fun notStatement(notStatement: CfnRuleGroup.NotStatementProperty) {
    cdkBuilder.notStatement(notStatement)
  }

  public fun orStatement(orStatement: IResolvable) {
    cdkBuilder.orStatement(orStatement)
  }

  public fun orStatement(orStatement: CfnRuleGroup.OrStatementProperty) {
    cdkBuilder.orStatement(orStatement)
  }

  public fun rateBasedStatement(rateBasedStatement: IResolvable) {
    cdkBuilder.rateBasedStatement(rateBasedStatement)
  }

  public fun rateBasedStatement(rateBasedStatement: CfnRuleGroup.RateBasedStatementProperty) {
    cdkBuilder.rateBasedStatement(rateBasedStatement)
  }

  public fun regexMatchStatement(regexMatchStatement: IResolvable) {
    cdkBuilder.regexMatchStatement(regexMatchStatement)
  }

  public fun regexMatchStatement(regexMatchStatement: CfnRuleGroup.RegexMatchStatementProperty) {
    cdkBuilder.regexMatchStatement(regexMatchStatement)
  }

  public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable) {
    cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
  }

  public
      fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: CfnRuleGroup.RegexPatternSetReferenceStatementProperty) {
    cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
  }

  public fun sizeConstraintStatement(sizeConstraintStatement: IResolvable) {
    cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
  }

  public
      fun sizeConstraintStatement(sizeConstraintStatement: CfnRuleGroup.SizeConstraintStatementProperty) {
    cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
  }

  public fun sqliMatchStatement(sqliMatchStatement: IResolvable) {
    cdkBuilder.sqliMatchStatement(sqliMatchStatement)
  }

  public fun sqliMatchStatement(sqliMatchStatement: CfnRuleGroup.SqliMatchStatementProperty) {
    cdkBuilder.sqliMatchStatement(sqliMatchStatement)
  }

  public fun xssMatchStatement(xssMatchStatement: IResolvable) {
    cdkBuilder.xssMatchStatement(xssMatchStatement)
  }

  public fun xssMatchStatement(xssMatchStatement: CfnRuleGroup.XssMatchStatementProperty) {
    cdkBuilder.xssMatchStatement(xssMatchStatement)
  }

  public fun build(): CfnRuleGroup.StatementProperty = cdkBuilder.build()
}
