@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CloudFormation::Macro` resource is a CloudFormation resource type that creates a
 * CloudFormation macro to perform custom processing on CloudFormation templates.
 *
 * For more information, see [Perform custom processing on CloudFormation templates with template
 * macros](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html) in the
 * *AWS CloudFormation User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnMacro cfnMacro = CfnMacro.Builder.create(this, "MyCfnMacro")
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
public open class CfnMacro(
  cdkObject: software.amazon.awscdk.services.cloudformation.CfnMacro,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMacroProps,
  ) :
      this(software.amazon.awscdk.services.cloudformation.CfnMacro(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMacroProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMacroProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMacroProps(props)
  )

  /**
   * Returns a unique identifier for the resource.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the macro.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the macro.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the underlying Lambda function that you want CloudFormation
   * to invoke when the macro is run.
   */
  public open fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * The Amazon Resource Name (ARN) of the underlying Lambda function that you want CloudFormation
   * to invoke when the macro is run.
   */
  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The CloudWatch Logs group to which CloudFormation sends error logging information when invoking
   * the macro's underlying Lambda function.
   */
  public open fun logGroupName(): String? = unwrap(this).getLogGroupName()

  /**
   * The CloudWatch Logs group to which CloudFormation sends error logging information when invoking
   * the macro's underlying Lambda function.
   */
  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  /**
   * The ARN of the role CloudFormation should assume when sending log entries to CloudWatch Logs .
   */
  public open fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

  /**
   * The ARN of the role CloudFormation should assume when sending log entries to CloudWatch Logs .
   */
  public open fun logRoleArn(`value`: String) {
    unwrap(this).setLogRoleArn(`value`)
  }

  /**
   * The name of the macro.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the macro.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnMacro].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the macro.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-description)
     * @param description A description of the macro. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the underlying Lambda function that you want CloudFormation
     * to invoke when the macro is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-functionname)
     * @param functionName The Amazon Resource Name (ARN) of the underlying Lambda function that you
     * want CloudFormation to invoke when the macro is run. 
     */
    public fun functionName(functionName: String)

    /**
     * The CloudWatch Logs group to which CloudFormation sends error logging information when
     * invoking the macro's underlying Lambda function.
     *
     * This will be an existing CloudWatch Logs LogGroup. Neither CloudFormation or Lambda will
     * create the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-loggroupname)
     * @param logGroupName The CloudWatch Logs group to which CloudFormation sends error logging
     * information when invoking the macro's underlying Lambda function. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * The ARN of the role CloudFormation should assume when sending log entries to CloudWatch Logs
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-logrolearn)
     * @param logRoleArn The ARN of the role CloudFormation should assume when sending log entries
     * to CloudWatch Logs . 
     */
    public fun logRoleArn(logRoleArn: String)

    /**
     * The name of the macro.
     *
     * The name of the macro must be unique across all macros in the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-name)
     * @param name The name of the macro. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnMacro.Builder =
        software.amazon.awscdk.services.cloudformation.CfnMacro.Builder.create(scope, id)

    /**
     * A description of the macro.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-description)
     * @param description A description of the macro. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the underlying Lambda function that you want CloudFormation
     * to invoke when the macro is run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-functionname)
     * @param functionName The Amazon Resource Name (ARN) of the underlying Lambda function that you
     * want CloudFormation to invoke when the macro is run. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * The CloudWatch Logs group to which CloudFormation sends error logging information when
     * invoking the macro's underlying Lambda function.
     *
     * This will be an existing CloudWatch Logs LogGroup. Neither CloudFormation or Lambda will
     * create the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-loggroupname)
     * @param logGroupName The CloudWatch Logs group to which CloudFormation sends error logging
     * information when invoking the macro's underlying Lambda function. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The ARN of the role CloudFormation should assume when sending log entries to CloudWatch Logs
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html#cfn-cloudformation-macro-logrolearn)
     * @param logRoleArn The ARN of the role CloudFormation should assume when sending log entries
     * to CloudWatch Logs . 
     */
    override fun logRoleArn(logRoleArn: String) {
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
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnMacro = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnMacro.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMacro {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMacro(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnMacro): CfnMacro
        = CfnMacro(cdkObject)

    internal fun unwrap(wrapped: CfnMacro): software.amazon.awscdk.services.cloudformation.CfnMacro
        = wrapped.cdkObject as software.amazon.awscdk.services.cloudformation.CfnMacro
  }
}
