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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
import software.constructs.Construct

/**
 * The `AWS::NimbleStudio::StudioComponent` resource represents a network resource that is used by a
 * studio's users and workflows.
 *
 * A typical studio contains studio components for the following: a render farm, an Active
 * Directory, a licensing service, and a shared file system.
 *
 * Access to a studio component is managed by specifying security groups for the resource, as well
 * as its endpoint.
 *
 * A studio component also has a set of initialization scripts, which are returned by
 * `GetLaunchProfileInitialization` . These initialization scripts run on streaming sessions when
 * they start. They provide users with flexibility in controlling how studio resources are
 * configured on a streaming session.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * CfnStudioComponent cfnStudioComponent = CfnStudioComponent.Builder.create(this,
 * "MyCfnStudioComponent")
 * .name("name")
 * .studioId("studioId")
 * .type("type")
 * // the properties below are optional
 * .configuration(StudioComponentConfigurationProperty.builder()
 * .activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty.builder()
 * .computerAttributes(List.of(ActiveDirectoryComputerAttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .directoryId("directoryId")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .build())
 * .computeFarmConfiguration(ComputeFarmConfigurationProperty.builder()
 * .activeDirectoryUser("activeDirectoryUser")
 * .endpoint("endpoint")
 * .build())
 * .licenseServiceConfiguration(LicenseServiceConfigurationProperty.builder()
 * .endpoint("endpoint")
 * .build())
 * .sharedFileSystemConfiguration(SharedFileSystemConfigurationProperty.builder()
 * .endpoint("endpoint")
 * .fileSystemId("fileSystemId")
 * .linuxMountPoint("linuxMountPoint")
 * .shareName("shareName")
 * .windowsMountDrive("windowsMountDrive")
 * .build())
 * .build())
 * .description("description")
 * .ec2SecurityGroupIds(List.of("ec2SecurityGroupIds"))
 * .initializationScripts(List.of(StudioComponentInitializationScriptProperty.builder()
 * .launchProfileProtocolVersion("launchProfileProtocolVersion")
 * .platform("platform")
 * .runContext("runContext")
 * .script("script")
 * .build()))
 * .runtimeRoleArn("runtimeRoleArn")
 * .scriptParameters(List.of(ScriptParameterKeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .secureInitializationRoleArn("secureInitializationRoleArn")
 * .subtype("subtype")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html)
 */
@CdkDslMarker
public class CfnStudioComponentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStudioComponent.Builder =
        CfnStudioComponent.Builder.create(scope, id)

    private val _ec2SecurityGroupIds: MutableList<String> = mutableListOf()

    private val _initializationScripts: MutableList<Any> = mutableListOf()

    private val _scriptParameters: MutableList<Any> = mutableListOf()

    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     *
     * @param configuration The configuration of the studio component, based on component type.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     *
     * @param configuration The configuration of the studio component, based on component type.
     */
    public fun configuration(
        configuration: CfnStudioComponent.StudioComponentConfigurationProperty
    ) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * A human-readable description for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
     *
     * @param description A human-readable description for the studio component resource.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The EC2 security groups that control access to the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     *
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     *   component.
     */
    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String) {
        _ec2SecurityGroupIds.addAll(listOf(*ec2SecurityGroupIds))
    }

    /**
     * The EC2 security groups that control access to the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     *
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     *   component.
     */
    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: Collection<String>) {
        _ec2SecurityGroupIds.addAll(ec2SecurityGroupIds)
    }

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     *
     * @param initializationScripts Initialization scripts for studio components.
     */
    public fun initializationScripts(vararg initializationScripts: Any) {
        _initializationScripts.addAll(listOf(*initializationScripts))
    }

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     *
     * @param initializationScripts Initialization scripts for studio components.
     */
    public fun initializationScripts(initializationScripts: Collection<Any>) {
        _initializationScripts.addAll(initializationScripts)
    }

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     *
     * @param initializationScripts Initialization scripts for studio components.
     */
    public fun initializationScripts(initializationScripts: IResolvable) {
        cdkBuilder.initializationScripts(initializationScripts)
    }

    /**
     * A friendly name for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
     *
     * @param name A friendly name for the studio component resource.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-runtimerolearn)
     *
     * @param runtimeRoleArn
     */
    public fun runtimeRoleArn(runtimeRoleArn: String) {
        cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     *
     * @param scriptParameters Parameters for the studio component scripts.
     */
    public fun scriptParameters(vararg scriptParameters: Any) {
        _scriptParameters.addAll(listOf(*scriptParameters))
    }

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     *
     * @param scriptParameters Parameters for the studio component scripts.
     */
    public fun scriptParameters(scriptParameters: Collection<Any>) {
        _scriptParameters.addAll(scriptParameters)
    }

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     *
     * @param scriptParameters Parameters for the studio component scripts.
     */
    public fun scriptParameters(scriptParameters: IResolvable) {
        cdkBuilder.scriptParameters(scriptParameters)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-secureinitializationrolearn)
     *
     * @param secureInitializationRoleArn
     */
    public fun secureInitializationRoleArn(secureInitializationRoleArn: String) {
        cdkBuilder.secureInitializationRoleArn(secureInitializationRoleArn)
    }

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
     *
     * @param studioId The unique identifier for a studio resource.
     */
    public fun studioId(studioId: String) {
        cdkBuilder.studioId(studioId)
    }

    /**
     * The specific subtype of a studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
     *
     * @param subtype The specific subtype of a studio component.
     */
    public fun subtype(subtype: String) {
        cdkBuilder.subtype(subtype)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The type of the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
     *
     * @param type The type of the studio component.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnStudioComponent {
        if (_ec2SecurityGroupIds.isNotEmpty()) cdkBuilder.ec2SecurityGroupIds(_ec2SecurityGroupIds)
        if (_initializationScripts.isNotEmpty())
            cdkBuilder.initializationScripts(_initializationScripts)
        if (_scriptParameters.isNotEmpty()) cdkBuilder.scriptParameters(_scriptParameters)
        return cdkBuilder.build()
    }
}
