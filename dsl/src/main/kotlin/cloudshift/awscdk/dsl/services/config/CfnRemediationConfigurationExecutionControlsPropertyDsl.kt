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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

/**
 * An ExecutionControls object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * ExecutionControlsProperty executionControlsProperty = ExecutionControlsProperty.builder()
 * .ssmControls(SsmControlsProperty.builder()
 * .concurrentExecutionRatePercentage(123)
 * .errorPercentage(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html)
 */
@CdkDslMarker
public class CfnRemediationConfigurationExecutionControlsPropertyDsl {
    private val cdkBuilder: CfnRemediationConfiguration.ExecutionControlsProperty.Builder =
        CfnRemediationConfiguration.ExecutionControlsProperty.builder()

    /** @param ssmControls A SsmControls object. */
    public fun ssmControls(ssmControls: IResolvable) {
        cdkBuilder.ssmControls(ssmControls)
    }

    /** @param ssmControls A SsmControls object. */
    public fun ssmControls(ssmControls: CfnRemediationConfiguration.SsmControlsProperty) {
        cdkBuilder.ssmControls(ssmControls)
    }

    public fun build(): CfnRemediationConfiguration.ExecutionControlsProperty = cdkBuilder.build()
}
