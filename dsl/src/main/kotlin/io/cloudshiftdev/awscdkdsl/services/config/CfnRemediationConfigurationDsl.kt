@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.constructs.Construct

/**
 * An object that represents the details about the remediation configuration that includes the
 * remediation action, parameters, and data to execute the action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * Object parameters;
 * CfnRemediationConfiguration cfnRemediationConfiguration =
 * CfnRemediationConfiguration.Builder.create(this, "MyCfnRemediationConfiguration")
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
public class CfnRemediationConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRemediationConfiguration.Builder =
        CfnRemediationConfiguration.Builder.create(scope, id)

    /**
     * The remediation is triggered automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
     *
     * @param automatic The remediation is triggered automatically.
     */
    public fun automatic(automatic: Boolean) {
        cdkBuilder.automatic(automatic)
    }

    /**
     * The remediation is triggered automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
     *
     * @param automatic The remediation is triggered automatically.
     */
    public fun automatic(automatic: IResolvable) {
        cdkBuilder.automatic(automatic)
    }

    /**
     * The name of the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename)
     *
     * @param configRuleName The name of the AWS Config rule.
     */
    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     *
     * @param executionControls An ExecutionControls object.
     */
    public fun executionControls(executionControls: IResolvable) {
        cdkBuilder.executionControls(executionControls)
    }

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     *
     * @param executionControls An ExecutionControls object.
     */
    public fun executionControls(
        executionControls: CfnRemediationConfiguration.ExecutionControlsProperty
    ) {
        cdkBuilder.executionControls(executionControls)
    }

    /**
     * The maximum number of failed attempts for auto-remediation. If you do not select a number,
     * the default is 5.
     *
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
     * seconds, AWS Config will put a RemediationException on your behalf for the failing resource
     * after the 5th failed attempt within 50 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts)
     *
     * @param maximumAutomaticAttempts The maximum number of failed attempts for auto-remediation.
     *   If you do not select a number, the default is 5.
     */
    public fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number) {
        cdkBuilder.maximumAutomaticAttempts(maximumAutomaticAttempts)
    }

    /**
     * An object of the RemediationParameterValue. For more information, see
     * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     * .
     *
     * The type is a map of strings to RemediationParameterValue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters)
     *
     * @param parameters An object of the RemediationParameterValue. For more information, see
     *   [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     *   .
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * An object of the RemediationParameterValue. For more information, see
     * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     * .
     *
     * The type is a map of strings to RemediationParameterValue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters)
     *
     * @param parameters An object of the RemediationParameterValue. For more information, see
     *   [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     *   .
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The type of a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype)
     *
     * @param resourceType The type of a resource.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * Time window to determine whether or not to add a remediation exception to prevent infinite
     * remediation attempts.
     *
     * If `MaximumAutomaticAttempts` remediation attempts have been made under `RetryAttemptSeconds`
     * , a remediation exception will be added to the resource. If you do not select a number, the
     * default is 60 seconds.
     *
     * For example, if you specify `RetryAttemptSeconds` as 50 seconds and
     * `MaximumAutomaticAttempts` as 5, AWS Config will run auto-remediations 5 times within 50
     * seconds before adding a remediation exception to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-retryattemptseconds)
     *
     * @param retryAttemptSeconds Time window to determine whether or not to add a remediation
     *   exception to prevent infinite remediation attempts.
     */
    public fun retryAttemptSeconds(retryAttemptSeconds: Number) {
        cdkBuilder.retryAttemptSeconds(retryAttemptSeconds)
    }

    /**
     * Target ID is the name of the SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid)
     *
     * @param targetId Target ID is the name of the SSM document.
     */
    public fun targetId(targetId: String) {
        cdkBuilder.targetId(targetId)
    }

    /**
     * The type of the target.
     *
     * Target executes remediation. For example, SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype)
     *
     * @param targetType The type of the target.
     */
    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    /**
     * Version of the target. For example, version of the SSM document.
     *
     * If you make backward incompatible changes to the SSM document, you must call
     * PutRemediationConfiguration API again to ensure the remediations can run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion)
     *
     * @param targetVersion Version of the target. For example, version of the SSM document.
     */
    public fun targetVersion(targetVersion: String) {
        cdkBuilder.targetVersion(targetVersion)
    }

    public fun build(): CfnRemediationConfiguration = cdkBuilder.build()
}
