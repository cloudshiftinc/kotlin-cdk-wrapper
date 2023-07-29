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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnAccessPoint

/**
 * A tag is a key-value pair attached to a file system.
 *
 * Allowed characters in the `Key` and `Value` properties are letters, white space, and numbers that
 * can be represented in UTF-8, and the following characters: `+ - = . _ : /`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * AccessPointTagProperty accessPointTagProperty = AccessPointTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-accesspointtag.html)
 */
@CdkDslMarker
public class CfnAccessPointAccessPointTagPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.AccessPointTagProperty.Builder =
        CfnAccessPoint.AccessPointTagProperty.builder()

    /** @param key The tag key (String). The key can't start with `aws:` . */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value of the tag key. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAccessPoint.AccessPointTagProperty = cdkBuilder.build()
}
