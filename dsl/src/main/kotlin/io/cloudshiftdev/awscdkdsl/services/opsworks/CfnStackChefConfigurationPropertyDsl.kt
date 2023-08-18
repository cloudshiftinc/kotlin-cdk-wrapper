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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnStack

/**
 * Describes the Chef configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * ChefConfigurationProperty chefConfigurationProperty = ChefConfigurationProperty.builder()
 * .berkshelfVersion("berkshelfVersion")
 * .manageBerkshelf(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html)
 */
@CdkDslMarker
public class CfnStackChefConfigurationPropertyDsl {
    private val cdkBuilder: CfnStack.ChefConfigurationProperty.Builder =
        CfnStack.ChefConfigurationProperty.builder()

    /** @param berkshelfVersion The Berkshelf version. */
    public fun berkshelfVersion(berkshelfVersion: String) {
        cdkBuilder.berkshelfVersion(berkshelfVersion)
    }

    /** @param manageBerkshelf Whether to enable Berkshelf. */
    public fun manageBerkshelf(manageBerkshelf: Boolean) {
        cdkBuilder.manageBerkshelf(manageBerkshelf)
    }

    /** @param manageBerkshelf Whether to enable Berkshelf. */
    public fun manageBerkshelf(manageBerkshelf: IResolvable) {
        cdkBuilder.manageBerkshelf(manageBerkshelf)
    }

    public fun build(): CfnStack.ChefConfigurationProperty = cdkBuilder.build()
}
