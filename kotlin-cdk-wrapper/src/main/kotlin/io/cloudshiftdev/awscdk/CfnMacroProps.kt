@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnMacro`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnMacroProps cfnMacroProps = CfnMacroProps.builder()
 * .functionName("functionName")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .logGroupName("logGroupName")
 * .logRoleArn("logRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html)
 */
public interface CfnMacroProps {
  /**
   * A description of the macro.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the underlying AWS Lambda function that you want AWS
   * CloudFormation to invoke when the macro is run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-functionname)
   */
  public fun functionName(): String

  /**
   * The CloudWatch Logs group to which AWS CloudFormation sends error logging information when
   * invoking the macro's underlying AWS Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-loggroupname)
   */
  public fun logGroupName(): String? = unwrap(this).getLogGroupName()

  /**
   * The ARN of the role AWS CloudFormation should assume when sending log entries to CloudWatch
   * Logs .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-logrolearn)
   */
  public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

  /**
   * The name of the macro.
   *
   * The name of the macro must be unique across all macros in the account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnMacroProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the macro.
     */
    public fun description(description: String)

    /**
     * @param functionName The Amazon Resource Name (ARN) of the underlying AWS Lambda function that
     * you want AWS CloudFormation to invoke when the macro is run. 
     */
    public fun functionName(functionName: String)

    /**
     * @param logGroupName The CloudWatch Logs group to which AWS CloudFormation sends error logging
     * information when invoking the macro's underlying AWS Lambda function.
     */
    public fun logGroupName(logGroupName: String)

    /**
     * @param logRoleArn The ARN of the role AWS CloudFormation should assume when sending log
     * entries to CloudWatch Logs .
     */
    public fun logRoleArn(logRoleArn: String)

    /**
     * @param name The name of the macro. 
     * The name of the macro must be unique across all macros in the account.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnMacroProps.Builder =
        software.amazon.awscdk.CfnMacroProps.builder()

    /**
     * @param description A description of the macro.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param functionName The Amazon Resource Name (ARN) of the underlying AWS Lambda function that
     * you want AWS CloudFormation to invoke when the macro is run. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param logGroupName The CloudWatch Logs group to which AWS CloudFormation sends error logging
     * information when invoking the macro's underlying AWS Lambda function.
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param logRoleArn The ARN of the role AWS CloudFormation should assume when sending log
     * entries to CloudWatch Logs .
     */
    override fun logRoleArn(logRoleArn: String) {
      cdkBuilder.logRoleArn(logRoleArn)
    }

    /**
     * @param name The name of the macro. 
     * The name of the macro must be unique across all macros in the account.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.CfnMacroProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnMacroProps,
  ) : CdkObject(cdkObject), CfnMacroProps {
    /**
     * A description of the macro.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the underlying AWS Lambda function that you want AWS
     * CloudFormation to invoke when the macro is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-functionname)
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * The CloudWatch Logs group to which AWS CloudFormation sends error logging information when
     * invoking the macro's underlying AWS Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-loggroupname)
     */
    override fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * The ARN of the role AWS CloudFormation should assume when sending log entries to CloudWatch
     * Logs .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-logrolearn)
     */
    override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

    /**
     * The name of the macro.
     *
     * The name of the macro must be unique across all macros in the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMacroProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnMacroProps): CfnMacroProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMacroProps): software.amazon.awscdk.CfnMacroProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnMacroProps
  }
}
