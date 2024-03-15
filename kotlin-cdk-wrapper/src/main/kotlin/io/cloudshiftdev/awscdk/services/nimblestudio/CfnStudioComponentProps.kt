@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStudioComponent`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
 * CfnStudioComponentProps cfnStudioComponentProps = CfnStudioComponentProps.builder()
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
public interface CfnStudioComponentProps {
  /**
   * The configuration of the studio component, based on component type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * A human-readable description for the studio component resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The EC2 security groups that control access to the studio component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
   */
  public fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
      emptyList()

  /**
   * Initialization scripts for studio components.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
   */
  public fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

  /**
   * A friendly name for the studio component resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
   */
  public fun name(): String

  /**
   * An IAM role attached to a Studio Component that gives the studio component access to AWS
   * resources at anytime while the instance is running.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-runtimerolearn)
   */
  public fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  /**
   * Parameters for the studio component scripts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
   */
  public fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

  /**
   * An IAM role attached to Studio Component when the system initialization script runs which give
   * the studio component access to AWS resources when the system initialization script runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-secureinitializationrolearn)
   */
  public fun secureInitializationRoleArn(): String? = unwrap(this).getSecureInitializationRoleArn()

  /**
   * The unique identifier for a studio resource.
   *
   * In Nimble Studio , all other resources are contained in a studio resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
   */
  public fun studioId(): String

  /**
   * The specific subtype of a studio component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
   */
  public fun subtype(): String? = unwrap(this).getSubtype()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The type of the studio component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnStudioComponentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration The configuration of the studio component, based on component type.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration The configuration of the studio component, based on component type.
     */
    public fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty)

    /**
     * @param configuration The configuration of the studio component, based on component type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3ae6329dcd29294cb05a8362f31818aa25fdd3b66bb5ebc7c23386e83b61c5")
    public
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A human-readable description for the studio component resource.
     */
    public fun description(description: String)

    /**
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component.
     */
    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>)

    /**
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component.
     */
    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String)

    /**
     * @param initializationScripts Initialization scripts for studio components.
     */
    public fun initializationScripts(initializationScripts: IResolvable)

    /**
     * @param initializationScripts Initialization scripts for studio components.
     */
    public fun initializationScripts(initializationScripts: List<Any>)

    /**
     * @param initializationScripts Initialization scripts for studio components.
     */
    public fun initializationScripts(vararg initializationScripts: Any)

    /**
     * @param name A friendly name for the studio component resource. 
     */
    public fun name(name: String)

    /**
     * @param runtimeRoleArn An IAM role attached to a Studio Component that gives the studio
     * component access to AWS resources at anytime while the instance is running.
     */
    public fun runtimeRoleArn(runtimeRoleArn: String)

    /**
     * @param scriptParameters Parameters for the studio component scripts.
     */
    public fun scriptParameters(scriptParameters: IResolvable)

    /**
     * @param scriptParameters Parameters for the studio component scripts.
     */
    public fun scriptParameters(scriptParameters: List<Any>)

    /**
     * @param scriptParameters Parameters for the studio component scripts.
     */
    public fun scriptParameters(vararg scriptParameters: Any)

    /**
     * @param secureInitializationRoleArn An IAM role attached to Studio Component when the system
     * initialization script runs which give the studio component access to AWS resources when the
     * system initialization script runs.
     */
    public fun secureInitializationRoleArn(secureInitializationRoleArn: String)

    /**
     * @param studioId The unique identifier for a studio resource. 
     * In Nimble Studio , all other resources are contained in a studio resource.
     */
    public fun studioId(studioId: String)

    /**
     * @param subtype The specific subtype of a studio component.
     */
    public fun subtype(subtype: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param type The type of the studio component. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps.builder()

    /**
     * @param configuration The configuration of the studio component, based on component type.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration The configuration of the studio component, based on component type.
     */
    override
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnStudioComponent.StudioComponentConfigurationProperty::unwrap))
    }

    /**
     * @param configuration The configuration of the studio component, based on component type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3ae6329dcd29294cb05a8362f31818aa25fdd3b66bb5ebc7c23386e83b61c5")
    override
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnStudioComponent.StudioComponentConfigurationProperty(configuration))

    /**
     * @param description A human-readable description for the studio component resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component.
     */
    override fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>) {
      cdkBuilder.ec2SecurityGroupIds(ec2SecurityGroupIds)
    }

    /**
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component.
     */
    override fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String): Unit =
        ec2SecurityGroupIds(ec2SecurityGroupIds.toList())

    /**
     * @param initializationScripts Initialization scripts for studio components.
     */
    override fun initializationScripts(initializationScripts: IResolvable) {
      cdkBuilder.initializationScripts(initializationScripts.let(IResolvable::unwrap))
    }

    /**
     * @param initializationScripts Initialization scripts for studio components.
     */
    override fun initializationScripts(initializationScripts: List<Any>) {
      cdkBuilder.initializationScripts(initializationScripts)
    }

    /**
     * @param initializationScripts Initialization scripts for studio components.
     */
    override fun initializationScripts(vararg initializationScripts: Any): Unit =
        initializationScripts(initializationScripts.toList())

    /**
     * @param name A friendly name for the studio component resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param runtimeRoleArn An IAM role attached to a Studio Component that gives the studio
     * component access to AWS resources at anytime while the instance is running.
     */
    override fun runtimeRoleArn(runtimeRoleArn: String) {
      cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    /**
     * @param scriptParameters Parameters for the studio component scripts.
     */
    override fun scriptParameters(scriptParameters: IResolvable) {
      cdkBuilder.scriptParameters(scriptParameters.let(IResolvable::unwrap))
    }

    /**
     * @param scriptParameters Parameters for the studio component scripts.
     */
    override fun scriptParameters(scriptParameters: List<Any>) {
      cdkBuilder.scriptParameters(scriptParameters)
    }

    /**
     * @param scriptParameters Parameters for the studio component scripts.
     */
    override fun scriptParameters(vararg scriptParameters: Any): Unit =
        scriptParameters(scriptParameters.toList())

    /**
     * @param secureInitializationRoleArn An IAM role attached to Studio Component when the system
     * initialization script runs which give the studio component access to AWS resources when the
     * system initialization script runs.
     */
    override fun secureInitializationRoleArn(secureInitializationRoleArn: String) {
      cdkBuilder.secureInitializationRoleArn(secureInitializationRoleArn)
    }

    /**
     * @param studioId The unique identifier for a studio resource. 
     * In Nimble Studio , all other resources are contained in a studio resource.
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * @param subtype The specific subtype of a studio component.
     */
    override fun subtype(subtype: String) {
      cdkBuilder.subtype(subtype)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param type The type of the studio component. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps,
  ) : CdkObject(cdkObject), CfnStudioComponentProps {
    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * A human-readable description for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The EC2 security groups that control access to the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     */
    override fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
        emptyList()

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     */
    override fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

    /**
     * A friendly name for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An IAM role attached to a Studio Component that gives the studio component access to AWS
     * resources at anytime while the instance is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-runtimerolearn)
     */
    override fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     */
    override fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

    /**
     * An IAM role attached to Studio Component when the system initialization script runs which
     * give the studio component access to AWS resources when the system initialization script runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-secureinitializationrolearn)
     */
    override fun secureInitializationRoleArn(): String? =
        unwrap(this).getSecureInitializationRoleArn()

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
     */
    override fun studioId(): String = unwrap(this).getStudioId()

    /**
     * The specific subtype of a studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
     */
    override fun subtype(): String? = unwrap(this).getSubtype()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The type of the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps):
        CfnStudioComponentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioComponentProps):
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps
  }
}
