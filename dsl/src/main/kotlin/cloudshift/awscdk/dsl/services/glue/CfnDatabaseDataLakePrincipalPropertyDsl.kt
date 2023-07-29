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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDatabase

/**
 * The AWS Lake Formation principal.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-datalakeprincipal.html)
 */
@CdkDslMarker
public class CfnDatabaseDataLakePrincipalPropertyDsl {
    private val cdkBuilder: CfnDatabase.DataLakePrincipalProperty.Builder =
        CfnDatabase.DataLakePrincipalProperty.builder()

    /** @param dataLakePrincipalIdentifier An identifier for the AWS Lake Formation principal. */
    public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
    }

    public fun build(): CfnDatabase.DataLakePrincipalProperty = cdkBuilder.build()
}
