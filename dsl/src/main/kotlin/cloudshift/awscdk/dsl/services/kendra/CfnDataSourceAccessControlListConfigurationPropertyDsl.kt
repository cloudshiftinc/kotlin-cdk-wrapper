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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Specifies access control list files for the documents in a data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * AccessControlListConfigurationProperty accessControlListConfigurationProperty =
 * AccessControlListConfigurationProperty.builder()
 * .keyPath("keyPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-accesscontrollistconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceAccessControlListConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.AccessControlListConfigurationProperty.Builder =
        CfnDataSource.AccessControlListConfigurationProperty.builder()

    /** @param keyPath Path to the AWS S3 bucket that contains the access control list files. */
    public fun keyPath(keyPath: String) {
        cdkBuilder.keyPath(keyPath)
    }

    public fun build(): CfnDataSource.AccessControlListConfigurationProperty = cdkBuilder.build()
}
