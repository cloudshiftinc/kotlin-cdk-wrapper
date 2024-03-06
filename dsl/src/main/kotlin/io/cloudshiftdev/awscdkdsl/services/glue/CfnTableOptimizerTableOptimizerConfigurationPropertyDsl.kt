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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTableOptimizer

/**
 * Specifies configuration details of a table optimizer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * TableOptimizerConfigurationProperty tableOptimizerConfigurationProperty =
 * TableOptimizerConfigurationProperty.builder()
 * .enabled(false)
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-tableoptimizer-tableoptimizerconfiguration.html)
 */
@CdkDslMarker
public class CfnTableOptimizerTableOptimizerConfigurationPropertyDsl {
    private val cdkBuilder: CfnTableOptimizer.TableOptimizerConfigurationProperty.Builder =
        CfnTableOptimizer.TableOptimizerConfigurationProperty.builder()

    /** @param enabled Whether the table optimization is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Whether the table optimization is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param roleArn A role passed by the caller which gives the service permission to update the
     *   resources associated with the optimizer on the caller's behalf.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTableOptimizer.TableOptimizerConfigurationProperty = cdkBuilder.build()
}
