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

package io.cloudshiftdev.awscdkdsl.services.s3objectlambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

/**
 * The alias of an Object Lambda Access Point.
 *
 * For more information, see
 * [How to use a bucket-style alias for your S3 bucket Object Lambda Access Point](https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-use.html#ol-access-points-alias)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * AliasProperty aliasProperty = AliasProperty.builder()
 * .status("status")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-alias.html)
 */
@CdkDslMarker
public class CfnAccessPointAliasPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.AliasProperty.Builder =
        CfnAccessPoint.AliasProperty.builder()

    /**
     * @param status The status of the Object Lambda Access Point alias. If the status is
     *   `PROVISIONING` , the Object Lambda Access Point is provisioning the alias and the alias is
     *   not ready for use yet. If the status is `READY` , the Object Lambda Access Point alias is
     *   successfully provisioned and ready for use.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param value The alias value of the Object Lambda Access Point. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAccessPoint.AliasProperty = cdkBuilder.build()
}
