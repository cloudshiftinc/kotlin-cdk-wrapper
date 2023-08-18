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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnPermissions

/**
 * A wildcard object representing every table under a database.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * TableWildcardProperty tableWildcardProperty = TableWildcardProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewildcard.html)
 */
@CdkDslMarker
public class CfnPermissionsTableWildcardPropertyDsl {
    private val cdkBuilder: CfnPermissions.TableWildcardProperty.Builder =
        CfnPermissions.TableWildcardProperty.builder()

    public fun build(): CfnPermissions.TableWildcardProperty = cdkBuilder.build()
}
