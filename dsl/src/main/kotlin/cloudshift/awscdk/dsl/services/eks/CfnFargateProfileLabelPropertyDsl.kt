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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnFargateProfile

/**
 * A key-value pair.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * LabelProperty labelProperty = LabelProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-label.html)
 */
@CdkDslMarker
public class CfnFargateProfileLabelPropertyDsl {
    private val cdkBuilder: CfnFargateProfile.LabelProperty.Builder =
        CfnFargateProfile.LabelProperty.builder()

    /** @param key Enter a key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value Enter a value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFargateProfile.LabelProperty = cdkBuilder.build()
}
