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

package io.cloudshiftdev.awscdkdsl.services.devicefarm

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration
import software.constructs.Construct

/**
 * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC)
 * endpoint service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * CfnVPCEConfiguration cfnVPCEConfiguration = CfnVPCEConfiguration.Builder.create(this,
 * "MyCfnVPCEConfiguration")
 * .serviceDnsName("serviceDnsName")
 * .vpceConfigurationName("vpceConfigurationName")
 * .vpceServiceName("vpceServiceName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpceConfigurationDescription("vpceConfigurationDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html)
 */
@CdkDslMarker
public class CfnVPCEConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCEConfiguration.Builder =
        CfnVPCEConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The DNS name that Device Farm will use to map to the private service you want to access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-servicednsname)
     *
     * @param serviceDnsName The DNS name that Device Farm will use to map to the private service
     *   you want to access.
     */
    public fun serviceDnsName(serviceDnsName: String) {
        cdkBuilder.serviceDnsName(serviceDnsName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * An optional description that provides details about your VPC endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationdescription)
     *
     * @param vpceConfigurationDescription An optional description that provides details about your
     *   VPC endpoint configuration.
     */
    public fun vpceConfigurationDescription(vpceConfigurationDescription: String) {
        cdkBuilder.vpceConfigurationDescription(vpceConfigurationDescription)
    }

    /**
     * The friendly name you give to your VPC endpoint configuration to manage your configurations
     * more easily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceconfigurationname)
     *
     * @param vpceConfigurationName The friendly name you give to your VPC endpoint configuration to
     *   manage your configurations more easily.
     */
    public fun vpceConfigurationName(vpceConfigurationName: String) {
        cdkBuilder.vpceConfigurationName(vpceConfigurationName)
    }

    /**
     * The name of the VPC endpoint service that you want to access from Device Farm.
     *
     * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html#cfn-devicefarm-vpceconfiguration-vpceservicename)
     *
     * @param vpceServiceName The name of the VPC endpoint service that you want to access from
     *   Device Farm.
     */
    public fun vpceServiceName(vpceServiceName: String) {
        cdkBuilder.vpceServiceName(vpceServiceName)
    }

    public fun build(): CfnVPCEConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
