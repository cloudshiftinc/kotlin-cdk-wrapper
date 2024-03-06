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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnAccessGrant

/**
 * The configuration options of the S3 Access Grants location.
 *
 * It contains the `S3SubPrefix` field. The grant scope, the data to which you are granting access,
 * is the result of appending the `Subprefix` field to the scope of the registered location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AccessGrantsLocationConfigurationProperty accessGrantsLocationConfigurationProperty =
 * AccessGrantsLocationConfigurationProperty.builder()
 * .s3SubPrefix("s3SubPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-accessgrantslocationconfiguration.html)
 */
@CdkDslMarker
public class CfnAccessGrantAccessGrantsLocationConfigurationPropertyDsl {
    private val cdkBuilder: CfnAccessGrant.AccessGrantsLocationConfigurationProperty.Builder =
        CfnAccessGrant.AccessGrantsLocationConfigurationProperty.builder()

    /**
     * @param s3SubPrefix The `S3SubPrefix` is appended to the location scope creating the grant
     *   scope. Use this field to narrow the scope of the grant to a subset of the location scope.
     *   This field is required if the location scope is the default location `s3://` because you
     *   cannot create a grant for all of your S3 data in the Region and must narrow the scope. For
     *   example, if the location scope is the default location `s3://` , the `S3SubPrefx` can be a
     *   `&lt;bucket-name&gt;/ *` , so the full grant scope path would be `s3://&lt;bucket-name&gt;/
     *   *` . Or the `S3SubPrefx` can be `&lt;bucket-name&gt;/&lt;prefix-name&gt;*` , so the full
     *   grant scope path would be `s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*` .
     *
     * If the `S3SubPrefix` includes a prefix, append the wildcard character `*` after the prefix to
     * indicate that you want to include all object key names in the bucket that start with that
     * prefix.
     */
    public fun s3SubPrefix(s3SubPrefix: String) {
        cdkBuilder.s3SubPrefix(s3SubPrefix)
    }

    public fun build(): CfnAccessGrant.AccessGrantsLocationConfigurationProperty =
        cdkBuilder.build()
}
