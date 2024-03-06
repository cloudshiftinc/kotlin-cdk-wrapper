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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pcaconnectorad.CfnConnector

/**
 * Information about your VPC and security groups used with the connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * VpcInformationProperty vpcInformationProperty = VpcInformationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-connector-vpcinformation.html)
 */
@CdkDslMarker
public class CfnConnectorVpcInformationPropertyDsl {
    private val cdkBuilder: CfnConnector.VpcInformationProperty.Builder =
        CfnConnector.VpcInformationProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    /**
     * @param securityGroupIds The security groups used with the connector. You can use a maximum of
     *   4 security groups with a connector.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The security groups used with the connector. You can use a maximum of
     *   4 security groups with a connector.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun build(): CfnConnector.VpcInformationProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
