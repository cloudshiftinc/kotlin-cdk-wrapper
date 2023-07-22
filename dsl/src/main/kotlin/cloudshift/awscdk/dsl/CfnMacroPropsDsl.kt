@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnMacroProps

@CdkDslMarker
public class CfnMacroPropsDsl {
  private val cdkBuilder: CfnMacroProps.Builder = CfnMacroProps.builder()

  /**
   * @param description A description of the macro.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param functionName The Amazon Resource Name (ARN) of the underlying AWS Lambda function that
   * you want AWS CloudFormation to invoke when the macro is run. 
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  /**
   * @param logGroupName The CloudWatch Logs group to which AWS CloudFormation sends error logging
   * information when invoking the macro's underlying AWS Lambda function.
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param logRoleArn The ARN of the role AWS CloudFormation should assume when sending log entries
   * to CloudWatch Logs .
   */
  public fun logRoleArn(logRoleArn: String) {
    cdkBuilder.logRoleArn(logRoleArn)
  }

  /**
   * @param name The name of the macro. 
   * The name of the macro must be unique across all macros in the account.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnMacroProps = cdkBuilder.build()
}
