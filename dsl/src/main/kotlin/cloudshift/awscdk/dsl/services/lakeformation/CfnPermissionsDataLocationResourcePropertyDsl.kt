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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPermissions

/**
 * A structure for a data location object where permissions are granted or revoked.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * DataLocationResourceProperty dataLocationResourceProperty =
 * DataLocationResourceProperty.builder()
 * .catalogId("catalogId")
 * .s3Resource("s3Resource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html)
 */
@CdkDslMarker
public class CfnPermissionsDataLocationResourcePropertyDsl {
    private val cdkBuilder: CfnPermissions.DataLocationResourceProperty.Builder =
        CfnPermissions.DataLocationResourceProperty.builder()

    /**
     * @param catalogId The identifier for the Data Catalog . By default, it is the account ID of
     *   the caller.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param s3Resource The Amazon Resource Name (ARN) that uniquely identifies the data location
     *   resource.
     */
    public fun s3Resource(s3Resource: String) {
        cdkBuilder.s3Resource(s3Resource)
    }

    public fun build(): CfnPermissions.DataLocationResourceProperty = cdkBuilder.build()
}
