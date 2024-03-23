@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Specify the runtime update mode.
 *
 * Example:
 *
 * ```
 * Function.Builder.create(this, "Lambda")
 * .runtimeManagementMode(RuntimeManagementMode.AUTO)
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .build();
 * ```
 */
public open class RuntimeManagementMode(
  cdkObject: software.amazon.awscdk.services.lambda.RuntimeManagementMode,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun arn(): String? = unwrap(this).getArn()

  /**
   *
   */
  public open fun mode(): String = unwrap(this).getMode()

  /**
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html.
   */
  public open fun runtimeManagementConfig(): CfnFunction.RuntimeManagementConfigProperty =
      unwrap(this).getRuntimeManagementConfig().let(CfnFunction.RuntimeManagementConfigProperty::wrap)

  public companion object {
    public val AUTO: RuntimeManagementMode =
        RuntimeManagementMode.wrap(software.amazon.awscdk.services.lambda.RuntimeManagementMode.AUTO)

    public val FUNCTION_UPDATE: RuntimeManagementMode =
        RuntimeManagementMode.wrap(software.amazon.awscdk.services.lambda.RuntimeManagementMode.FUNCTION_UPDATE)

    public fun manual(arn: String): RuntimeManagementMode =
        software.amazon.awscdk.services.lambda.RuntimeManagementMode.manual(arn).let(RuntimeManagementMode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.RuntimeManagementMode):
        RuntimeManagementMode = RuntimeManagementMode(cdkObject)

    internal fun unwrap(wrapped: RuntimeManagementMode):
        software.amazon.awscdk.services.lambda.RuntimeManagementMode = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.RuntimeManagementMode
  }
}
