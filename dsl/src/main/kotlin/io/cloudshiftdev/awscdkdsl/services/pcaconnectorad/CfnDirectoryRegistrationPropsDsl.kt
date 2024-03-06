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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps

/**
 * Properties for defining a `CfnDirectoryRegistration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnDirectoryRegistrationProps cfnDirectoryRegistrationProps =
 * CfnDirectoryRegistrationProps.builder()
 * .directoryId("directoryId")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html)
 */
@CdkDslMarker
public class CfnDirectoryRegistrationPropsDsl {
    private val cdkBuilder: CfnDirectoryRegistrationProps.Builder =
        CfnDirectoryRegistrationProps.builder()

    /** @param directoryId The identifier of the Active Directory. */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /** @param tags Metadata assigned to a directory registration consisting of a key-value pair. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDirectoryRegistrationProps = cdkBuilder.build()
}
