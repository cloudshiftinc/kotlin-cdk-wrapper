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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps

/**
 * Properties for defining a `CfnNetworkSettings`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnNetworkSettingsProps cfnNetworkSettingsProps = CfnNetworkSettingsProps.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html)
 */
@CdkDslMarker
public class CfnNetworkSettingsPropsDsl {
    private val cdkBuilder: CfnNetworkSettingsProps.Builder = CfnNetworkSettingsProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param securityGroupIds One or more security groups used to control access from streaming
     *   instances to your VPC. *Pattern* : `^[\w+\-]+$`
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds One or more security groups used to control access from streaming
     *   instances to your VPC. *Pattern* : `^[\w+\-]+$`
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     *   instances to your VPC. At least two of these subnets must be in different availability
     *   zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     *   instances to your VPC. At least two of these subnets must be in different availability
     *   zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param tags The tags to add to the network settings resource. A tag is a key-value pair. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to add to the network settings resource. A tag is a key-value pair. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcId The VPC that streaming instances will connect to. *Pattern* : `^vpc-[0-9a-z]*$`
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnNetworkSettingsProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
