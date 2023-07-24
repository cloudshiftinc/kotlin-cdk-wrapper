@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import kotlin.String

/**
 * The Lake Formation principal.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-datalakeprincipal.html)
 */
@CdkDslMarker
public class CfnDataLakeSettingsDataLakePrincipalPropertyDsl {
    private val cdkBuilder: CfnDataLakeSettings.DataLakePrincipalProperty.Builder =
        CfnDataLakeSettings.DataLakePrincipalProperty.builder()

    /**
     * @param dataLakePrincipalIdentifier An identifier for the Lake Formation principal.
     */
    public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
    }

    public fun build(): CfnDataLakeSettings.DataLakePrincipalProperty = cdkBuilder.build()
}
