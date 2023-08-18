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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * The minimum and maximum amount of total local storage, in GB.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TotalLocalStorageGBProperty totalLocalStorageGBProperty = TotalLocalStorageGBProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-totallocalstoragegb.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateTotalLocalStorageGBPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.TotalLocalStorageGBProperty.Builder =
        CfnLaunchTemplate.TotalLocalStorageGBProperty.builder()

    /**
     * @param max The maximum amount of total local storage, in GB. To specify no maximum limit,
     *   omit this parameter.
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum amount of total local storage, in GB. To specify no minimum limit,
     *   omit this parameter.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnLaunchTemplate.TotalLocalStorageGBProperty = cdkBuilder.build()
}
