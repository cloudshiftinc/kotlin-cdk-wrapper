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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps

/**
 * Properties for defining a `CfnAppBlockBuilder`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnAppBlockBuilderProps cfnAppBlockBuilderProps = CfnAppBlockBuilderProps.builder()
 * .instanceType("instanceType")
 * .name("name")
 * .platform("platform")
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * // the properties below are optional
 * .accessEndpoints(List.of(AccessEndpointProperty.builder()
 * .endpointType("endpointType")
 * .vpceId("vpceId")
 * .build()))
 * .appBlockArns(List.of("appBlockArns"))
 * .description("description")
 * .displayName("displayName")
 * .enableDefaultInternetAccess(false)
 * .iamRoleArn("iamRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html)
 */
@CdkDslMarker
public class CfnAppBlockBuilderPropsDsl {
    private val cdkBuilder: CfnAppBlockBuilderProps.Builder = CfnAppBlockBuilderProps.builder()

    private val _accessEndpoints: MutableList<Any> = mutableListOf()

    private val _appBlockArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param accessEndpoints The access endpoints of the app block builder. */
    public fun accessEndpoints(vararg accessEndpoints: Any) {
        _accessEndpoints.addAll(listOf(*accessEndpoints))
    }

    /** @param accessEndpoints The access endpoints of the app block builder. */
    public fun accessEndpoints(accessEndpoints: Collection<Any>) {
        _accessEndpoints.addAll(accessEndpoints)
    }

    /** @param accessEndpoints The access endpoints of the app block builder. */
    public fun accessEndpoints(accessEndpoints: IResolvable) {
        cdkBuilder.accessEndpoints(accessEndpoints)
    }

    /** @param appBlockArns The ARN of the app block. *Maximum* : `1` */
    public fun appBlockArns(vararg appBlockArns: String) {
        _appBlockArns.addAll(listOf(*appBlockArns))
    }

    /** @param appBlockArns The ARN of the app block. *Maximum* : `1` */
    public fun appBlockArns(appBlockArns: Collection<String>) {
        _appBlockArns.addAll(appBlockArns)
    }

    /** @param description The description of the app block builder. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param displayName The display name of the app block builder. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     *   the app block builder.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
        cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     *   the app block builder.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
        cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /** @param iamRoleArn The ARN of the IAM role that is applied to the app block builder. */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /** @param instanceType The instance type of the app block builder. */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param name The name of the app block builder. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param platform The platform of the app block builder. *Allowed values* :
     *   `WINDOWS_SERVER_2019`
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /** @param tags The tags of the app block builder. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags of the app block builder. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vpcConfig The VPC configuration for the app block builder. */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /** @param vpcConfig The VPC configuration for the app block builder. */
    public fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnAppBlockBuilderProps {
        if (_accessEndpoints.isNotEmpty()) cdkBuilder.accessEndpoints(_accessEndpoints)
        if (_appBlockArns.isNotEmpty()) cdkBuilder.appBlockArns(_appBlockArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
