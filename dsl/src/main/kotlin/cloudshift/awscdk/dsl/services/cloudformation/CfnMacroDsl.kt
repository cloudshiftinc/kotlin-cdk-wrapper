@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.constructs.Construct

@CdkDslMarker
public class CfnMacroDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMacro.Builder = CfnMacro.Builder.create(scope, id)

  /**
   * A description of the macro.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-description)
   * @param description A description of the macro. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The Amazon Resource Name (ARN) of the underlying AWS Lambda function that you want AWS
   * CloudFormation to invoke when the macro is run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-functionname)
   * @param functionName The Amazon Resource Name (ARN) of the underlying AWS Lambda function that
   * you want AWS CloudFormation to invoke when the macro is run. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  /**
   * The CloudWatch Logs group to which AWS CloudFormation sends error logging information when
   * invoking the macro's underlying AWS Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-loggroupname)
   * @param logGroupName The CloudWatch Logs group to which AWS CloudFormation sends error logging
   * information when invoking the macro's underlying AWS Lambda function. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * The ARN of the role AWS CloudFormation should assume when sending log entries to CloudWatch
   * Logs .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-logrolearn)
   * @param logRoleArn The ARN of the role AWS CloudFormation should assume when sending log entries
   * to CloudWatch Logs . 
   */
  public fun logRoleArn(logRoleArn: String) {
    cdkBuilder.logRoleArn(logRoleArn)
  }

  /**
   * The name of the macro.
   *
   * The name of the macro must be unique across all macros in the account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-name)
   * @param name The name of the macro. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnMacro = cdkBuilder.build()
}
