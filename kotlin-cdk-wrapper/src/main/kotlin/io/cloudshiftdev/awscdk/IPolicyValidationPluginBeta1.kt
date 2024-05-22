@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * Represents a validation plugin that will be executed during synthesis.
 *
 * Example:
 *
 * ```
 * public class MyPlugin implements IPolicyValidationPluginBeta1 {
 * public final Object name;
 * public PolicyValidationPluginReportBeta1 validate(IPolicyValidationContextBeta1 context) {
 * // First read the templates using context.templatePaths...
 * // ...then perform the validation, and then compose and return the report.
 * // Using hard-coded values here for better clarity:
 * return PolicyValidationPluginReportBeta1.builder()
 * .success(false)
 * .violations(List.of(PolicyViolationBeta1.builder()
 * .ruleName("CKV_AWS_117")
 * .description("Ensure that AWS Lambda function is configured inside a VPC")
 * .fix("https://docs.bridgecrew.io/docs/ensure-that-aws-lambda-function-is-configured-inside-a-vpc-1")
 * .violatingResources(List.of(PolicyViolatingResourceBeta1.builder()
 * .resourceLogicalId("MyFunction3BAA72D1")
 * .templatePath("/home/johndoe/myapp/cdk.out/MyService.template.json")
 * .locations(List.of("Properties/VpcConfig"))
 * .build()))
 * .build()))
 * .build();
 * }
 * }
 * ```
 */
public interface IPolicyValidationPluginBeta1 {
  /**
   * The name of the plugin that will be displayed in the validation report.
   */
  public fun name(): String

  /**
   * The list of rule IDs that the plugin will evaluate.
   *
   * Used for analytics
   * purposes.
   *
   * Default: - No rule is reported
   */
  public fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

  /**
   * The method that will be called by the CDK framework to perform validations.
   *
   * This is where the plugin will evaluate the CloudFormation
   * templates for compliance and report and violations
   *
   * @param context 
   */
  public fun validate(context: IPolicyValidationContextBeta1): PolicyValidationPluginReportBeta1

  /**
   * The version of the plugin, following the Semantic Versioning specification (see
   * https://semver.org/). This version is used for analytics purposes, to measure the usage of
   * different plugins and different versions. The value of this property should be kept in sync with
   * the actual version of the software package. If the version is not provided or is not a valid
   * semantic version, it will be reported as `0.0.0`.
   */
  public fun version(): String? = unwrap(this).getVersion()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1,
  ) : CdkObject(cdkObject), IPolicyValidationPluginBeta1 {
    /**
     * The name of the plugin that will be displayed in the validation report.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The list of rule IDs that the plugin will evaluate.
     *
     * Used for analytics
     * purposes.
     *
     * Default: - No rule is reported
     */
    override fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

    /**
     * The method that will be called by the CDK framework to perform validations.
     *
     * This is where the plugin will evaluate the CloudFormation
     * templates for compliance and report and violations
     *
     * @param context 
     */
    override fun validate(context: IPolicyValidationContextBeta1): PolicyValidationPluginReportBeta1
        =
        unwrap(this).validate(context.let(IPolicyValidationContextBeta1.Companion::unwrap)).let(PolicyValidationPluginReportBeta1::wrap)

    /**
     * The version of the plugin, following the Semantic Versioning specification (see
     * https://semver.org/). This version is used for analytics purposes, to measure the usage of
     * different plugins and different versions. The value of this property should be kept in sync with
     * the actual version of the software package. If the version is not provided or is not a valid
     * semantic version, it will be reported as `0.0.0`.
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1):
        IPolicyValidationPluginBeta1 = CdkObjectWrappers.wrap(cdkObject) as?
        IPolicyValidationPluginBeta1 ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPolicyValidationPluginBeta1):
        software.amazon.awscdk.IPolicyValidationPluginBeta1 = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IPolicyValidationPluginBeta1
  }
}
