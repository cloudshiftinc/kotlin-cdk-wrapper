@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.AwsDestination
import kotlin.String

/**
 * Destination for assets that need to be uploaded to AWS.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * AwsDestination awsDestination = AwsDestination.builder()
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsDestinationDsl {
    private val cdkBuilder: AwsDestination.Builder = AwsDestination.builder()

    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
        cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param region The region where this asset will need to be published.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): AwsDestination = cdkBuilder.build()
}
