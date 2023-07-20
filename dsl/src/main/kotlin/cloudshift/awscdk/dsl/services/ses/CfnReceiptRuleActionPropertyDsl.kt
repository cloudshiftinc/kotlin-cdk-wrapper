@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule

@CdkDslMarker
public class CfnReceiptRuleActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.ActionProperty.Builder =
      CfnReceiptRule.ActionProperty.builder()

  public fun addHeaderAction(addHeaderAction: IResolvable) {
    cdkBuilder.addHeaderAction(addHeaderAction)
  }

  public fun addHeaderAction(addHeaderAction: CfnReceiptRule.AddHeaderActionProperty) {
    cdkBuilder.addHeaderAction(addHeaderAction)
  }

  public fun bounceAction(bounceAction: IResolvable) {
    cdkBuilder.bounceAction(bounceAction)
  }

  public fun bounceAction(bounceAction: CfnReceiptRule.BounceActionProperty) {
    cdkBuilder.bounceAction(bounceAction)
  }

  public fun lambdaAction(lambdaAction: IResolvable) {
    cdkBuilder.lambdaAction(lambdaAction)
  }

  public fun lambdaAction(lambdaAction: CfnReceiptRule.LambdaActionProperty) {
    cdkBuilder.lambdaAction(lambdaAction)
  }

  public fun s3Action(s3Action: IResolvable) {
    cdkBuilder.s3Action(s3Action)
  }

  public fun s3Action(s3Action: CfnReceiptRule.S3ActionProperty) {
    cdkBuilder.s3Action(s3Action)
  }

  public fun snsAction(snsAction: IResolvable) {
    cdkBuilder.snsAction(snsAction)
  }

  public fun snsAction(snsAction: CfnReceiptRule.SNSActionProperty) {
    cdkBuilder.snsAction(snsAction)
  }

  public fun stopAction(stopAction: IResolvable) {
    cdkBuilder.stopAction(stopAction)
  }

  public fun stopAction(stopAction: CfnReceiptRule.StopActionProperty) {
    cdkBuilder.stopAction(stopAction)
  }

  public fun workmailAction(workmailAction: IResolvable) {
    cdkBuilder.workmailAction(workmailAction)
  }

  public fun workmailAction(workmailAction: CfnReceiptRule.WorkmailActionProperty) {
    cdkBuilder.workmailAction(workmailAction)
  }

  public fun build(): CfnReceiptRule.ActionProperty = cdkBuilder.build()
}
