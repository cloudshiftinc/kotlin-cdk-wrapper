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
import software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration
import software.constructs.Construct

/**
 * Creates a directory registration that authorizes communication between AWS Private CA and an
 * Active Directory.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnDirectoryRegistration cfnDirectoryRegistration = CfnDirectoryRegistration.Builder.create(this,
 * "MyCfnDirectoryRegistration")
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
public class CfnDirectoryRegistrationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDirectoryRegistration.Builder =
        CfnDirectoryRegistration.Builder.create(scope, id)

    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-directoryid)
     *
     * @param directoryId The identifier of the Active Directory.
     */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /**
     * Metadata assigned to a directory registration consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-tags)
     *
     * @param tags Metadata assigned to a directory registration consisting of a key-value pair.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDirectoryRegistration = cdkBuilder.build()
}
