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
import software.constructs.Construct

/**
 * Creates a connector between AWS Private CA and an Active Directory.
 *
 * You must specify the private CA, directory ID, and security groups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
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
public class CfnConnectorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnector.Builder = CfnConnector.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-certificateauthorityarn)
     *
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     *   being used.
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-directoryid)
     *
     * @param directoryId The identifier of the Active Directory.
     */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /**
     * Metadata assigned to a connector consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-tags)
     *
     * @param tags Metadata assigned to a connector consisting of a key-value pair.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     *
     * @param vpcInformation Information of the VPC and security group(s) used with the connector.
     */
    public fun vpcInformation(vpcInformation: IResolvable) {
        cdkBuilder.vpcInformation(vpcInformation)
    }

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     *
     * @param vpcInformation Information of the VPC and security group(s) used with the connector.
     */
    public fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty) {
        cdkBuilder.vpcInformation(vpcInformation)
    }

    public fun build(): CfnConnector = cdkBuilder.build()
}
