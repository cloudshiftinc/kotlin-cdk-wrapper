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
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

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
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalocationresource.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsDataLocationResourcePropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.DataLocationResourceProperty.Builder =
        CfnPrincipalPermissions.DataLocationResourceProperty.builder()

    /**
     * @param catalogId The identifier for the Data Catalog where the location is registered with
     *   AWS Lake Formation .
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies the data location
     *   resource.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnPrincipalPermissions.DataLocationResourceProperty = cdkBuilder.build()
}
