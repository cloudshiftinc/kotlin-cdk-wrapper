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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment

/**
 * The `CanarySetting` property type specifies settings for the canary deployment in this stage.
 *
 * `CanarySetting` is a property of the
 * [StageDescription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html)
 */
@CdkDslMarker
public class CfnDeploymentCanarySettingPropertyDsl {
    private val cdkBuilder: CfnDeployment.CanarySettingProperty.Builder =
        CfnDeployment.CanarySettingProperty.builder()

    /** @param percentTraffic The percent (0-100) of traffic diverted to a canary deployment. */
    public fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
    }

    /**
     * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
     *   including new stage variables introduced in the canary. These stage variables are
     *   represented as a string-to-string map between stage variable names and their values.
     */
    public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
    }

    /**
     * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
     *   including new stage variables introduced in the canary. These stage variables are
     *   represented as a string-to-string map between stage variable names and their values.
     */
    public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
    }

    /**
     * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the stage
     *   cache or not.
     */
    public fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
    }

    /**
     * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the stage
     *   cache or not.
     */
    public fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache)
    }

    public fun build(): CfnDeployment.CanarySettingProperty = cdkBuilder.build()
}
