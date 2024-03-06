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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnConnector
import software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .directoryId("directoryId")
 * .vpcInformation(VpcInformationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html)
 */
@CdkDslMarker
public class CfnConnectorPropsDsl {
    private val cdkBuilder: CfnConnectorProps.Builder = CfnConnectorProps.builder()

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     *   being used.
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /** @param directoryId The identifier of the Active Directory. */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /** @param tags Metadata assigned to a connector consisting of a key-value pair. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector.
     */
    public fun vpcInformation(vpcInformation: IResolvable) {
        cdkBuilder.vpcInformation(vpcInformation)
    }

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector.
     */
    public fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty) {
        cdkBuilder.vpcInformation(vpcInformation)
    }

    public fun build(): CfnConnectorProps = cdkBuilder.build()
}
