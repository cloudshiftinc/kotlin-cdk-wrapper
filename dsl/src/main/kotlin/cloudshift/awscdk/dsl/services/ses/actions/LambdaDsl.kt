@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.ses.actions.Lambda
import software.amazon.awscdk.services.ses.actions.LambdaInvocationType
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class LambdaDsl {
  private val cdkBuilder: Lambda.Builder = Lambda.Builder.create()

  /**
   * The Lambda function to invoke.
   *
   * @param function The Lambda function to invoke. 
   */
  public fun function(function: IFunction) {
    cdkBuilder.function(function)
  }

  /**
   * The invocation type of the Lambda function.
   *
   * Default: Event
   *
   * @param invocationType The invocation type of the Lambda function. 
   */
  public fun invocationType(invocationType: LambdaInvocationType) {
    cdkBuilder.invocationType(invocationType)
  }

  /**
   * The SNS topic to notify when the Lambda action is taken.
   *
   * Default: no notification
   *
   * @param topic The SNS topic to notify when the Lambda action is taken. 
   */
  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): Lambda = cdkBuilder.build()
}
