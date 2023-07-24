@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.licensemanager.CfnLicense
import kotlin.String

/**
 * Describes key/value pairs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * MetadataProperty metadataProperty = MetadataProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-metadata.html)
 */
@CdkDslMarker
public class CfnLicenseMetadataPropertyDsl {
    private val cdkBuilder: CfnLicense.MetadataProperty.Builder =
        CfnLicense.MetadataProperty.builder()

    /**
     * @param name The key name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value The value.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnLicense.MetadataProperty = cdkBuilder.build()
}
