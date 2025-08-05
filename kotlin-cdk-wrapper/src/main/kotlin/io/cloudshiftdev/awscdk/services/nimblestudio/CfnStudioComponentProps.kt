@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * .scriptParameters(List.of(ScriptParameterKeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
   */
  public fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
      emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
   */
  public fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
   */
  public fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
   */
  public fun studioId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
   */
  public fun subtype(): String? = unwrap(this).getSubtype()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnStudioComponentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration the value to be set.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration the value to be set.
     */
    public fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty)

    /**
     * @param configuration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3ae6329dcd29294cb05a8362f31818aa25fdd3b66bb5ebc7c23386e83b61c5")
    public
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param ec2SecurityGroupIds the value to be set.
     */
    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>)

    /**
     * @param ec2SecurityGroupIds the value to be set.
     */
    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String)

    /**
     * @param initializationScripts the value to be set.
     */
    public fun initializationScripts(initializationScripts: IResolvable)

    /**
     * @param initializationScripts the value to be set.
     */
    public fun initializationScripts(initializationScripts: List<Any>)

    /**
     * @param initializationScripts the value to be set.
     */
    public fun initializationScripts(vararg initializationScripts: Any)

    /**
     * @param name the value to be set. 
     */
    public fun name(name: String)

    /**
     * @param scriptParameters the value to be set.
     */
    public fun scriptParameters(scriptParameters: IResolvable)

    /**
     * @param scriptParameters the value to be set.
     */
    public fun scriptParameters(scriptParameters: List<Any>)

    /**
     * @param scriptParameters the value to be set.
     */
    public fun scriptParameters(vararg scriptParameters: Any)

    /**
     * @param studioId the value to be set. 
     */
    public fun studioId(studioId: String)

    /**
     * @param subtype the value to be set.
     */
    public fun subtype(subtype: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param type the value to be set. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps.builder()

    /**
     * @param configuration the value to be set.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configuration the value to be set.
     */
    override
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnStudioComponent.StudioComponentConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param configuration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3ae6329dcd29294cb05a8362f31818aa25fdd3b66bb5ebc7c23386e83b61c5")
    override
        fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnStudioComponent.StudioComponentConfigurationProperty(configuration))

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ec2SecurityGroupIds the value to be set.
     */
    override fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>) {
      cdkBuilder.ec2SecurityGroupIds(ec2SecurityGroupIds)
    }

    /**
     * @param ec2SecurityGroupIds the value to be set.
     */
    override fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String): Unit =
        ec2SecurityGroupIds(ec2SecurityGroupIds.toList())

    /**
     * @param initializationScripts the value to be set.
     */
    override fun initializationScripts(initializationScripts: IResolvable) {
      cdkBuilder.initializationScripts(initializationScripts.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param initializationScripts the value to be set.
     */
    override fun initializationScripts(initializationScripts: List<Any>) {
      cdkBuilder.initializationScripts(initializationScripts.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param initializationScripts the value to be set.
     */
    override fun initializationScripts(vararg initializationScripts: Any): Unit =
        initializationScripts(initializationScripts.toList())

    /**
     * @param name the value to be set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param scriptParameters the value to be set.
     */
    override fun scriptParameters(scriptParameters: IResolvable) {
      cdkBuilder.scriptParameters(scriptParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scriptParameters the value to be set.
     */
    override fun scriptParameters(scriptParameters: List<Any>) {
      cdkBuilder.scriptParameters(scriptParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param scriptParameters the value to be set.
     */
    override fun scriptParameters(vararg scriptParameters: Any): Unit =
        scriptParameters(scriptParameters.toList())

    /**
     * @param studioId the value to be set. 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * @param subtype the value to be set.
     */
    override fun subtype(subtype: String) {
      cdkBuilder.subtype(subtype)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param type the value to be set. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps,
  ) : CdkObject(cdkObject),
      CfnStudioComponentProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     */
    override fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     */
    override fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     */
    override fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
     */
    override fun studioId(): String = unwrap(this).getStudioId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
     */
    override fun subtype(): String? = unwrap(this).getSubtype()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
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
        CfnStudioComponentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStudioComponentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioComponentProps):
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps
  }
}
