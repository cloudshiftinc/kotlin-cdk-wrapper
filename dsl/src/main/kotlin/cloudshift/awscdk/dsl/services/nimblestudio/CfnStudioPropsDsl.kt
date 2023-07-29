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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.amazon.awscdk.services.nimblestudio.CfnStudioProps

/**
 * Properties for defining a `CfnStudio`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * CfnStudioProps cfnStudioProps = CfnStudioProps.builder()
 * .adminRoleArn("adminRoleArn")
 * .displayName("displayName")
 * .studioName("studioName")
 * .userRoleArn("userRoleArn")
 * // the properties below are optional
 * .studioEncryptionConfiguration(StudioEncryptionConfigurationProperty.builder()
 * .keyType("keyType")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html)
 */
@CdkDslMarker
public class CfnStudioPropsDsl {
    private val cdkBuilder: CfnStudioProps.Builder = CfnStudioProps.builder()

    /**
     * @param adminRoleArn The IAM role that studio admins assume when logging in to the Nimble
     *   Studio portal.
     */
    public fun adminRoleArn(adminRoleArn: String) {
        cdkBuilder.adminRoleArn(adminRoleArn)
    }

    /** @param displayName A friendly name for the studio. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     *   the studio.
     */
    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
        cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration)
    }

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     *   the studio.
     */
    public fun studioEncryptionConfiguration(
        studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty
    ) {
        cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration)
    }

    /**
     * @param studioName The name of the studio, as included in the URL when accessing it in the
     *   Nimble Studio portal.
     */
    public fun studioName(studioName: String) {
        cdkBuilder.studioName(studioName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param userRoleArn The IAM role that studio users assume when logging in to the Nimble Studio
     *   portal.
     */
    public fun userRoleArn(userRoleArn: String) {
        cdkBuilder.userRoleArn(userRoleArn)
    }

    public fun build(): CfnStudioProps = cdkBuilder.build()
}
