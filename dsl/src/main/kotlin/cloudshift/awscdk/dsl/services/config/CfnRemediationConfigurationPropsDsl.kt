@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnRemediationConfigurationProps

/**
 * Properties for defining a `CfnRemediationConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * Object parameters;
 * CfnRemediationConfigurationProps cfnRemediationConfigurationProps =
 * CfnRemediationConfigurationProps.builder()
 * .configRuleName("configRuleName")
 * .targetId("targetId")
 * .targetType("targetType")
 * // the properties below are optional
 * .automatic(false)
 * .executionControls(ExecutionControlsProperty.builder()
 * .ssmControls(SsmControlsProperty.builder()
 * .concurrentExecutionRatePercentage(123)
 * .errorPercentage(123)
 * .build())
 * .build())
 * .maximumAutomaticAttempts(123)
 * .parameters(parameters)
 * .resourceType("resourceType")
 * .retryAttemptSeconds(123)
 * .targetVersion("targetVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html)
 */
@CdkDslMarker
public class CfnRemediationConfigurationPropsDsl {
  private val cdkBuilder: CfnRemediationConfigurationProps.Builder =
      CfnRemediationConfigurationProps.builder()

  /**
   * @param automatic The remediation is triggered automatically.
   */
  public fun automatic(automatic: Boolean) {
    cdkBuilder.automatic(automatic)
  }

  /**
   * @param automatic The remediation is triggered automatically.
   */
  public fun automatic(automatic: IResolvable) {
    cdkBuilder.automatic(automatic)
  }

  /**
   * @param configRuleName The name of the AWS Config rule. 
   */
  public fun configRuleName(configRuleName: String) {
    cdkBuilder.configRuleName(configRuleName)
  }

  /**
   * @param executionControls An ExecutionControls object.
   */
  public fun executionControls(executionControls: IResolvable) {
    cdkBuilder.executionControls(executionControls)
  }

  /**
   * @param executionControls An ExecutionControls object.
   */
  public
      fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty) {
    cdkBuilder.executionControls(executionControls)
  }

  /**
   * @param maximumAutomaticAttempts The maximum number of failed attempts for auto-remediation. If
   * you do not select a number, the default is 5.
   * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
   * seconds, AWS Config will put a RemediationException on your behalf for the failing resource after
   * the 5th failed attempt within 50 seconds.
   */
  public fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number) {
    cdkBuilder.maximumAutomaticAttempts(maximumAutomaticAttempts)
  }

  /**
   * @param parameters An object of the RemediationParameterValue. For more information, see
   * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
   * .
   *
   * The type is a map of strings to RemediationParameterValue.
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters An object of the RemediationParameterValue. For more information, see
   * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
   * .
   *
   * The type is a map of strings to RemediationParameterValue.
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param resourceType The type of a resource.
   */
  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  /**
   * @param retryAttemptSeconds Maximum time in seconds that AWS Config runs auto-remediation.
   * If you do not select a number, the default is 60 seconds.
   *
   * For example, if you specify RetryAttemptSeconds as 50 seconds and MaximumAutomaticAttempts as
   * 5, AWS Config will run auto-remediations 5 times within 50 seconds before throwing an exception.
   */
  public fun retryAttemptSeconds(retryAttemptSeconds: Number) {
    cdkBuilder.retryAttemptSeconds(retryAttemptSeconds)
  }

  /**
   * @param targetId Target ID is the name of the SSM document. 
   */
  public fun targetId(targetId: String) {
    cdkBuilder.targetId(targetId)
  }

  /**
   * @param targetType The type of the target. 
   * Target executes remediation. For example, SSM document.
   */
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  /**
   * @param targetVersion Version of the target. For example, version of the SSM document.
   *
   * If you make backward incompatible changes to the SSM document, you must call
   * PutRemediationConfiguration API again to ensure the remediations can run.
   */
  public fun targetVersion(targetVersion: String) {
    cdkBuilder.targetVersion(targetVersion)
  }

  public fun build(): CfnRemediationConfigurationProps = cdkBuilder.build()
}
