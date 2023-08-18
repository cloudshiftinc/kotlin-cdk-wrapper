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

package io.cloudshiftdev.awscdkdsl.cxapi

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.Environment

/**
 * Models an AWS execution environment, for use within the CDK toolkit.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * Environment environment = Environment.builder()
 * .account("account")
 * .name("name")
 * .region("region")
 * .build();
 * ```
 */
@CdkDslMarker
public class EnvironmentDsl {
    private val cdkBuilder: Environment.Builder = Environment.builder()

    /** @param account The AWS account this environment deploys into. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param name The arbitrary name of this environment (user-set, or at least user-meaningful).
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param region The AWS region name where this environment deploys into. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): Environment = cdkBuilder.build()
}
