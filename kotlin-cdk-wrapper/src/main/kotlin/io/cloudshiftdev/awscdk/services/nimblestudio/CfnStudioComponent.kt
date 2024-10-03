@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * `GetLaunchProfileInitialization` . These initialization scripts run on streaming sessions when they
 * start. They provide users with flexibility in controlling how studio resources are configured on a
 * streaming session.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
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
public open class CfnStudioComponent(
  cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioComponentProps,
  ) :
      this(software.amazon.awscdk.services.nimblestudio.CfnStudioComponent(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStudioComponentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioComponentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStudioComponentProps(props)
  )

  /**
   * The unique identifier for the studio component resource.
   */
  public open fun attrStudioComponentId(): String = unwrap(this).getAttrStudioComponentId()

  /**
   * The configuration of the studio component, based on component type.
   */
  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The configuration of the studio component, based on component type.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of the studio component, based on component type.
   */
  public open fun configuration(`value`: StudioComponentConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(StudioComponentConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration of the studio component, based on component type.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e92352b87430c4111ddc94db4412da047f88c4fac6d19b9244cacf89cba7fd75")
  public open fun configuration(`value`: StudioComponentConfigurationProperty.Builder.() -> Unit):
      Unit = configuration(StudioComponentConfigurationProperty(`value`))

  /**
   * A human-readable description for the studio component resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A human-readable description for the studio component resource.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The EC2 security groups that control access to the studio component.
   */
  public open fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
      emptyList()

  /**
   * The EC2 security groups that control access to the studio component.
   */
  public open fun ec2SecurityGroupIds(`value`: List<String>) {
    unwrap(this).setEc2SecurityGroupIds(`value`)
  }

  /**
   * The EC2 security groups that control access to the studio component.
   */
  public open fun ec2SecurityGroupIds(vararg `value`: String): Unit =
      ec2SecurityGroupIds(`value`.toList())

  /**
   * Initialization scripts for studio components.
   */
  public open fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

  /**
   * Initialization scripts for studio components.
   */
  public open fun initializationScripts(`value`: IResolvable) {
    unwrap(this).setInitializationScripts(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Initialization scripts for studio components.
   */
  public open fun initializationScripts(`value`: List<Any>) {
    unwrap(this).setInitializationScripts(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Initialization scripts for studio components.
   */
  public open fun initializationScripts(vararg `value`: Any): Unit =
      initializationScripts(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A friendly name for the studio component resource.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name for the studio component resource.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An IAM role attached to a Studio Component that gives the studio component access to AWS
   * resources at anytime while the instance is running.
   */
  public open fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  /**
   * An IAM role attached to a Studio Component that gives the studio component access to AWS
   * resources at anytime while the instance is running.
   */
  public open fun runtimeRoleArn(`value`: String) {
    unwrap(this).setRuntimeRoleArn(`value`)
  }

  /**
   * Parameters for the studio component scripts.
   */
  public open fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

  /**
   * Parameters for the studio component scripts.
   */
  public open fun scriptParameters(`value`: IResolvable) {
    unwrap(this).setScriptParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Parameters for the studio component scripts.
   */
  public open fun scriptParameters(`value`: List<Any>) {
    unwrap(this).setScriptParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Parameters for the studio component scripts.
   */
  public open fun scriptParameters(vararg `value`: Any): Unit = scriptParameters(`value`.toList())

  /**
   * An IAM role attached to Studio Component when the system initialization script runs which give
   * the studio component access to AWS resources when the system initialization script runs.
   */
  public open fun secureInitializationRoleArn(): String? =
      unwrap(this).getSecureInitializationRoleArn()

  /**
   * An IAM role attached to Studio Component when the system initialization script runs which give
   * the studio component access to AWS resources when the system initialization script runs.
   */
  public open fun secureInitializationRoleArn(`value`: String) {
    unwrap(this).setSecureInitializationRoleArn(`value`)
  }

  /**
   * The unique identifier for a studio resource.
   */
  public open fun studioId(): String = unwrap(this).getStudioId()

  /**
   * The unique identifier for a studio resource.
   */
  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  /**
   * The specific subtype of a studio component.
   */
  public open fun subtype(): String? = unwrap(this).getSubtype()

  /**
   * The specific subtype of a studio component.
   */
  public open fun subtype(`value`: String) {
    unwrap(this).setSubtype(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The type of the studio component.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the studio component.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.nimblestudio.CfnStudioComponent].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration The configuration of the studio component, based on component type. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration The configuration of the studio component, based on component type. 
     */
    public fun configuration(configuration: StudioComponentConfigurationProperty)

    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration The configuration of the studio component, based on component type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4f6ee60322ab1a583f5a893b4f9363f4fee46ad969093a7220b7fc5676aee35")
    public fun configuration(configuration: StudioComponentConfigurationProperty.Builder.() -> Unit)

    /**
     * A human-readable description for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
     * @param description A human-readable description for the studio component resource. 
     */
    public fun description(description: String)

    /**
     * The EC2 security groups that control access to the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component. 
     */
    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>)

    /**
     * The EC2 security groups that control access to the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component. 
     */
    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String)

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts Initialization scripts for studio components. 
     */
    public fun initializationScripts(initializationScripts: IResolvable)

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts Initialization scripts for studio components. 
     */
    public fun initializationScripts(initializationScripts: List<Any>)

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts Initialization scripts for studio components. 
     */
    public fun initializationScripts(vararg initializationScripts: Any)

    /**
     * A friendly name for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
     * @param name A friendly name for the studio component resource. 
     */
    public fun name(name: String)

    /**
     * An IAM role attached to a Studio Component that gives the studio component access to AWS
     * resources at anytime while the instance is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-runtimerolearn)
     * @param runtimeRoleArn An IAM role attached to a Studio Component that gives the studio
     * component access to AWS resources at anytime while the instance is running. 
     */
    public fun runtimeRoleArn(runtimeRoleArn: String)

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters Parameters for the studio component scripts. 
     */
    public fun scriptParameters(scriptParameters: IResolvable)

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters Parameters for the studio component scripts. 
     */
    public fun scriptParameters(scriptParameters: List<Any>)

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters Parameters for the studio component scripts. 
     */
    public fun scriptParameters(vararg scriptParameters: Any)

    /**
     * An IAM role attached to Studio Component when the system initialization script runs which
     * give the studio component access to AWS resources when the system initialization script runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-secureinitializationrolearn)
     * @param secureInitializationRoleArn An IAM role attached to Studio Component when the system
     * initialization script runs which give the studio component access to AWS resources when the
     * system initialization script runs. 
     */
    public fun secureInitializationRoleArn(secureInitializationRoleArn: String)

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio, all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
     * @param studioId The unique identifier for a studio resource. 
     */
    public fun studioId(studioId: String)

    /**
     * The specific subtype of a studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
     * @param subtype The specific subtype of a studio component. 
     */
    public fun subtype(subtype: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The type of the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
     * @param type The type of the studio component. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.Builder
        = software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.Builder.create(scope, id)

    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration The configuration of the studio component, based on component type. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration The configuration of the studio component, based on component type. 
     */
    override fun configuration(configuration: StudioComponentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(StudioComponentConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration of the studio component, based on component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration The configuration of the studio component, based on component type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4f6ee60322ab1a583f5a893b4f9363f4fee46ad969093a7220b7fc5676aee35")
    override
        fun configuration(configuration: StudioComponentConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(StudioComponentConfigurationProperty(configuration))

    /**
     * A human-readable description for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
     * @param description A human-readable description for the studio component resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The EC2 security groups that control access to the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component. 
     */
    override fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>) {
      cdkBuilder.ec2SecurityGroupIds(ec2SecurityGroupIds)
    }

    /**
     * The EC2 security groups that control access to the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio
     * component. 
     */
    override fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String): Unit =
        ec2SecurityGroupIds(ec2SecurityGroupIds.toList())

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts Initialization scripts for studio components. 
     */
    override fun initializationScripts(initializationScripts: IResolvable) {
      cdkBuilder.initializationScripts(initializationScripts.let(IResolvable.Companion::unwrap))
    }

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts Initialization scripts for studio components. 
     */
    override fun initializationScripts(initializationScripts: List<Any>) {
      cdkBuilder.initializationScripts(initializationScripts.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Initialization scripts for studio components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts Initialization scripts for studio components. 
     */
    override fun initializationScripts(vararg initializationScripts: Any): Unit =
        initializationScripts(initializationScripts.toList())

    /**
     * A friendly name for the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
     * @param name A friendly name for the studio component resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An IAM role attached to a Studio Component that gives the studio component access to AWS
     * resources at anytime while the instance is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-runtimerolearn)
     * @param runtimeRoleArn An IAM role attached to a Studio Component that gives the studio
     * component access to AWS resources at anytime while the instance is running. 
     */
    override fun runtimeRoleArn(runtimeRoleArn: String) {
      cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters Parameters for the studio component scripts. 
     */
    override fun scriptParameters(scriptParameters: IResolvable) {
      cdkBuilder.scriptParameters(scriptParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters Parameters for the studio component scripts. 
     */
    override fun scriptParameters(scriptParameters: List<Any>) {
      cdkBuilder.scriptParameters(scriptParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Parameters for the studio component scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters Parameters for the studio component scripts. 
     */
    override fun scriptParameters(vararg scriptParameters: Any): Unit =
        scriptParameters(scriptParameters.toList())

    /**
     * An IAM role attached to Studio Component when the system initialization script runs which
     * give the studio component access to AWS resources when the system initialization script runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-secureinitializationrolearn)
     * @param secureInitializationRoleArn An IAM role attached to Studio Component when the system
     * initialization script runs which give the studio component access to AWS resources when the
     * system initialization script runs. 
     */
    override fun secureInitializationRoleArn(secureInitializationRoleArn: String) {
      cdkBuilder.secureInitializationRoleArn(secureInitializationRoleArn)
    }

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio, all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
     * @param studioId The unique identifier for a studio resource. 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * The specific subtype of a studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
     * @param subtype The specific subtype of a studio component. 
     */
    override fun subtype(subtype: String) {
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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The type of the studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
     * @param type The type of the studio component. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStudioComponent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStudioComponent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent):
        CfnStudioComponent = CfnStudioComponent(cdkObject)

    internal fun unwrap(wrapped: CfnStudioComponent):
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponent = wrapped.cdkObject as
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
  }

  /**
   * An LDAP attribute of an Active Directory computer account, in the form of a name:value pair.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * ActiveDirectoryComputerAttributeProperty activeDirectoryComputerAttributeProperty =
   * ActiveDirectoryComputerAttributeProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html)
   */
  public interface ActiveDirectoryComputerAttributeProperty {
    /**
     * The name for the LDAP attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html#cfn-nimblestudio-studiocomponent-activedirectorycomputerattribute-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value for the LDAP attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html#cfn-nimblestudio-studiocomponent-activedirectorycomputerattribute-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ActiveDirectoryComputerAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name for the LDAP attribute.
       */
      public fun name(name: String)

      /**
       * @param value The value for the LDAP attribute.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.builder()

      /**
       * @param name The name for the LDAP attribute.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value for the LDAP attribute.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty,
    ) : CdkObject(cdkObject),
        ActiveDirectoryComputerAttributeProperty {
      /**
       * The name for the LDAP attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html#cfn-nimblestudio-studiocomponent-activedirectorycomputerattribute-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value for the LDAP attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html#cfn-nimblestudio-studiocomponent-activedirectorycomputerattribute-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ActiveDirectoryComputerAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty):
          ActiveDirectoryComputerAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ActiveDirectoryComputerAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActiveDirectoryComputerAttributeProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty
    }
  }

  /**
   * The configuration for a AWS Directory Service for Microsoft Active Directory studio resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * ActiveDirectoryConfigurationProperty activeDirectoryConfigurationProperty =
   * ActiveDirectoryConfigurationProperty.builder()
   * .computerAttributes(List.of(ActiveDirectoryComputerAttributeProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .directoryId("directoryId")
   * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html)
   */
  public interface ActiveDirectoryConfigurationProperty {
    /**
     * A collection of custom attributes for an Active Directory computer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-computerattributes)
     */
    public fun computerAttributes(): Any? = unwrap(this).getComputerAttributes()

    /**
     * The directory ID of the AWS Directory Service for Microsoft Active Directory to access using
     * this studio component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-directoryid)
     */
    public fun directoryId(): String? = unwrap(this).getDirectoryId()

    /**
     * The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-organizationalunitdistinguishedname)
     */
    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    /**
     * A builder for [ActiveDirectoryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computerAttributes A collection of custom attributes for an Active Directory
       * computer.
       */
      public fun computerAttributes(computerAttributes: IResolvable)

      /**
       * @param computerAttributes A collection of custom attributes for an Active Directory
       * computer.
       */
      public fun computerAttributes(computerAttributes: List<Any>)

      /**
       * @param computerAttributes A collection of custom attributes for an Active Directory
       * computer.
       */
      public fun computerAttributes(vararg computerAttributes: Any)

      /**
       * @param directoryId The directory ID of the AWS Directory Service for Microsoft Active
       * Directory to access using this studio component.
       */
      public fun directoryId(directoryId: String)

      /**
       * @param organizationalUnitDistinguishedName The distinguished name (DN) and organizational
       * unit (OU) of an Active Directory computer.
       */
      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty.builder()

      /**
       * @param computerAttributes A collection of custom attributes for an Active Directory
       * computer.
       */
      override fun computerAttributes(computerAttributes: IResolvable) {
        cdkBuilder.computerAttributes(computerAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param computerAttributes A collection of custom attributes for an Active Directory
       * computer.
       */
      override fun computerAttributes(computerAttributes: List<Any>) {
        cdkBuilder.computerAttributes(computerAttributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param computerAttributes A collection of custom attributes for an Active Directory
       * computer.
       */
      override fun computerAttributes(vararg computerAttributes: Any): Unit =
          computerAttributes(computerAttributes.toList())

      /**
       * @param directoryId The directory ID of the AWS Directory Service for Microsoft Active
       * Directory to access using this studio component.
       */
      override fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
      }

      /**
       * @param organizationalUnitDistinguishedName The distinguished name (DN) and organizational
       * unit (OU) of an Active Directory computer.
       */
      override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty,
    ) : CdkObject(cdkObject),
        ActiveDirectoryConfigurationProperty {
      /**
       * A collection of custom attributes for an Active Directory computer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-computerattributes)
       */
      override fun computerAttributes(): Any? = unwrap(this).getComputerAttributes()

      /**
       * The directory ID of the AWS Directory Service for Microsoft Active Directory to access
       * using this studio component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-directoryid)
       */
      override fun directoryId(): String? = unwrap(this).getDirectoryId()

      /**
       * The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-organizationalunitdistinguishedname)
       */
      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ActiveDirectoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty):
          ActiveDirectoryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ActiveDirectoryConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty
    }
  }

  /**
   * The configuration for a render farm that is associated with a studio resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * ComputeFarmConfigurationProperty computeFarmConfigurationProperty =
   * ComputeFarmConfigurationProperty.builder()
   * .activeDirectoryUser("activeDirectoryUser")
   * .endpoint("endpoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html)
   */
  public interface ComputeFarmConfigurationProperty {
    /**
     * The name of an Active Directory user that is used on ComputeFarm worker instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html#cfn-nimblestudio-studiocomponent-computefarmconfiguration-activedirectoryuser)
     */
    public fun activeDirectoryUser(): String? = unwrap(this).getActiveDirectoryUser()

    /**
     * The endpoint of the ComputeFarm that is accessed by the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html#cfn-nimblestudio-studiocomponent-computefarmconfiguration-endpoint)
     */
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * A builder for [ComputeFarmConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activeDirectoryUser The name of an Active Directory user that is used on ComputeFarm
       * worker instances.
       */
      public fun activeDirectoryUser(activeDirectoryUser: String)

      /**
       * @param endpoint The endpoint of the ComputeFarm that is accessed by the studio component
       * resource.
       */
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty.builder()

      /**
       * @param activeDirectoryUser The name of an Active Directory user that is used on ComputeFarm
       * worker instances.
       */
      override fun activeDirectoryUser(activeDirectoryUser: String) {
        cdkBuilder.activeDirectoryUser(activeDirectoryUser)
      }

      /**
       * @param endpoint The endpoint of the ComputeFarm that is accessed by the studio component
       * resource.
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty,
    ) : CdkObject(cdkObject),
        ComputeFarmConfigurationProperty {
      /**
       * The name of an Active Directory user that is used on ComputeFarm worker instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html#cfn-nimblestudio-studiocomponent-computefarmconfiguration-activedirectoryuser)
       */
      override fun activeDirectoryUser(): String? = unwrap(this).getActiveDirectoryUser()

      /**
       * The endpoint of the ComputeFarm that is accessed by the studio component resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html#cfn-nimblestudio-studiocomponent-computefarmconfiguration-endpoint)
       */
      override fun endpoint(): String? = unwrap(this).getEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeFarmConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty):
          ComputeFarmConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComputeFarmConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeFarmConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty
    }
  }

  /**
   * The configuration for a license service that is associated with a studio resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * LicenseServiceConfigurationProperty licenseServiceConfigurationProperty =
   * LicenseServiceConfigurationProperty.builder()
   * .endpoint("endpoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-licenseserviceconfiguration.html)
   */
  public interface LicenseServiceConfigurationProperty {
    /**
     * The endpoint of the license service that is accessed by the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-licenseserviceconfiguration.html#cfn-nimblestudio-studiocomponent-licenseserviceconfiguration-endpoint)
     */
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * A builder for [LicenseServiceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoint The endpoint of the license service that is accessed by the studio
       * component resource.
       */
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.builder()

      /**
       * @param endpoint The endpoint of the license service that is accessed by the studio
       * component resource.
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty,
    ) : CdkObject(cdkObject),
        LicenseServiceConfigurationProperty {
      /**
       * The endpoint of the license service that is accessed by the studio component resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-licenseserviceconfiguration.html#cfn-nimblestudio-studiocomponent-licenseserviceconfiguration-endpoint)
       */
      override fun endpoint(): String? = unwrap(this).getEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LicenseServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty):
          LicenseServiceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LicenseServiceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LicenseServiceConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty
    }
  }

  /**
   * A parameter for a studio component script, in the form of a key-value pair.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * ScriptParameterKeyValueProperty scriptParameterKeyValueProperty =
   * ScriptParameterKeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html)
   */
  public interface ScriptParameterKeyValueProperty {
    /**
     * A script parameter key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html#cfn-nimblestudio-studiocomponent-scriptparameterkeyvalue-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A script parameter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html#cfn-nimblestudio-studiocomponent-scriptparameterkeyvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ScriptParameterKeyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key A script parameter key.
       */
      public fun key(key: String)

      /**
       * @param value A script parameter value.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty.builder()

      /**
       * @param key A script parameter key.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value A script parameter value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty,
    ) : CdkObject(cdkObject),
        ScriptParameterKeyValueProperty {
      /**
       * A script parameter key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html#cfn-nimblestudio-studiocomponent-scriptparameterkeyvalue-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * A script parameter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html#cfn-nimblestudio-studiocomponent-scriptparameterkeyvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptParameterKeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty):
          ScriptParameterKeyValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScriptParameterKeyValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptParameterKeyValueProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty
    }
  }

  /**
   * The configuration for a shared file storage system that is associated with a studio resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * SharedFileSystemConfigurationProperty sharedFileSystemConfigurationProperty =
   * SharedFileSystemConfigurationProperty.builder()
   * .endpoint("endpoint")
   * .fileSystemId("fileSystemId")
   * .linuxMountPoint("linuxMountPoint")
   * .shareName("shareName")
   * .windowsMountDrive("windowsMountDrive")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html)
   */
  public interface SharedFileSystemConfigurationProperty {
    /**
     * The endpoint of the shared file system that is accessed by the studio component resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-endpoint)
     */
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * The unique identifier for a file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-filesystemid)
     */
    public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    /**
     * The mount location for a shared file system on a Linux virtual workstation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-linuxmountpoint)
     */
    public fun linuxMountPoint(): String? = unwrap(this).getLinuxMountPoint()

    /**
     * The name of the file share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-sharename)
     */
    public fun shareName(): String? = unwrap(this).getShareName()

    /**
     * The mount location for a shared file system on a Windows virtual workstation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-windowsmountdrive)
     */
    public fun windowsMountDrive(): String? = unwrap(this).getWindowsMountDrive()

    /**
     * A builder for [SharedFileSystemConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoint The endpoint of the shared file system that is accessed by the studio
       * component resource.
       */
      public fun endpoint(endpoint: String)

      /**
       * @param fileSystemId The unique identifier for a file system.
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param linuxMountPoint The mount location for a shared file system on a Linux virtual
       * workstation.
       */
      public fun linuxMountPoint(linuxMountPoint: String)

      /**
       * @param shareName The name of the file share.
       */
      public fun shareName(shareName: String)

      /**
       * @param windowsMountDrive The mount location for a shared file system on a Windows virtual
       * workstation.
       */
      public fun windowsMountDrive(windowsMountDrive: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty.builder()

      /**
       * @param endpoint The endpoint of the shared file system that is accessed by the studio
       * component resource.
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      /**
       * @param fileSystemId The unique identifier for a file system.
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param linuxMountPoint The mount location for a shared file system on a Linux virtual
       * workstation.
       */
      override fun linuxMountPoint(linuxMountPoint: String) {
        cdkBuilder.linuxMountPoint(linuxMountPoint)
      }

      /**
       * @param shareName The name of the file share.
       */
      override fun shareName(shareName: String) {
        cdkBuilder.shareName(shareName)
      }

      /**
       * @param windowsMountDrive The mount location for a shared file system on a Windows virtual
       * workstation.
       */
      override fun windowsMountDrive(windowsMountDrive: String) {
        cdkBuilder.windowsMountDrive(windowsMountDrive)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty,
    ) : CdkObject(cdkObject),
        SharedFileSystemConfigurationProperty {
      /**
       * The endpoint of the shared file system that is accessed by the studio component resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-endpoint)
       */
      override fun endpoint(): String? = unwrap(this).getEndpoint()

      /**
       * The unique identifier for a file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-filesystemid)
       */
      override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

      /**
       * The mount location for a shared file system on a Linux virtual workstation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-linuxmountpoint)
       */
      override fun linuxMountPoint(): String? = unwrap(this).getLinuxMountPoint()

      /**
       * The name of the file share.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-sharename)
       */
      override fun shareName(): String? = unwrap(this).getShareName()

      /**
       * The mount location for a shared file system on a Windows virtual workstation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-windowsmountdrive)
       */
      override fun windowsMountDrive(): String? = unwrap(this).getWindowsMountDrive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SharedFileSystemConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty):
          SharedFileSystemConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SharedFileSystemConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharedFileSystemConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty
    }
  }

  /**
   * The configuration of the studio component, based on component type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StudioComponentConfigurationProperty studioComponentConfigurationProperty =
   * StudioComponentConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html)
   */
  public interface StudioComponentConfigurationProperty {
    /**
     * The configuration for a AWS Directory Service for Microsoft Active Directory studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-activedirectoryconfiguration)
     */
    public fun activeDirectoryConfiguration(): Any? = unwrap(this).getActiveDirectoryConfiguration()

    /**
     * The configuration for a render farm that is associated with a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-computefarmconfiguration)
     */
    public fun computeFarmConfiguration(): Any? = unwrap(this).getComputeFarmConfiguration()

    /**
     * The configuration for a license service that is associated with a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-licenseserviceconfiguration)
     */
    public fun licenseServiceConfiguration(): Any? = unwrap(this).getLicenseServiceConfiguration()

    /**
     * The configuration for a shared file storage system that is associated with a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-sharedfilesystemconfiguration)
     */
    public fun sharedFileSystemConfiguration(): Any? =
        unwrap(this).getSharedFileSystemConfiguration()

    /**
     * A builder for [StudioComponentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for
       * Microsoft Active Directory studio resource.
       */
      public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable)

      /**
       * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for
       * Microsoft Active Directory studio resource.
       */
      public
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty)

      /**
       * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for
       * Microsoft Active Directory studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580fc56564d1496b95a674cf508b6ee811b62e9ae9506daac7a54c20a4228b82")
      public
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit)

      /**
       * @param computeFarmConfiguration The configuration for a render farm that is associated with
       * a studio resource.
       */
      public fun computeFarmConfiguration(computeFarmConfiguration: IResolvable)

      /**
       * @param computeFarmConfiguration The configuration for a render farm that is associated with
       * a studio resource.
       */
      public
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty)

      /**
       * @param computeFarmConfiguration The configuration for a render farm that is associated with
       * a studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("147a6b54528749e907c7b2cd4e79aa46eb7a7d67177215e5a1555910ca5a5bd8")
      public
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty.Builder.() -> Unit)

      /**
       * @param licenseServiceConfiguration The configuration for a license service that is
       * associated with a studio resource.
       */
      public fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable)

      /**
       * @param licenseServiceConfiguration The configuration for a license service that is
       * associated with a studio resource.
       */
      public
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty)

      /**
       * @param licenseServiceConfiguration The configuration for a license service that is
       * associated with a studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac55785be2829fd2629089442fa098ee586a27c836596dad9e9eba208c9ddae")
      public
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sharedFileSystemConfiguration The configuration for a shared file storage system
       * that is associated with a studio resource.
       */
      public fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable)

      /**
       * @param sharedFileSystemConfiguration The configuration for a shared file storage system
       * that is associated with a studio resource.
       */
      public
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty)

      /**
       * @param sharedFileSystemConfiguration The configuration for a shared file storage system
       * that is associated with a studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddfcf3613f82db83ae2e014d3eaa7711b83328afb37079ba3df1de236f9a3d5")
      public
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty.builder()

      /**
       * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for
       * Microsoft Active Directory studio resource.
       */
      override fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for
       * Microsoft Active Directory studio resource.
       */
      override
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(ActiveDirectoryConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param activeDirectoryConfiguration The configuration for a AWS Directory Service for
       * Microsoft Active Directory studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580fc56564d1496b95a674cf508b6ee811b62e9ae9506daac7a54c20a4228b82")
      override
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
          Unit =
          activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty(activeDirectoryConfiguration))

      /**
       * @param computeFarmConfiguration The configuration for a render farm that is associated with
       * a studio resource.
       */
      override fun computeFarmConfiguration(computeFarmConfiguration: IResolvable) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param computeFarmConfiguration The configuration for a render farm that is associated with
       * a studio resource.
       */
      override
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration.let(ComputeFarmConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param computeFarmConfiguration The configuration for a render farm that is associated with
       * a studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("147a6b54528749e907c7b2cd4e79aa46eb7a7d67177215e5a1555910ca5a5bd8")
      override
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty.Builder.() -> Unit):
          Unit =
          computeFarmConfiguration(ComputeFarmConfigurationProperty(computeFarmConfiguration))

      /**
       * @param licenseServiceConfiguration The configuration for a license service that is
       * associated with a studio resource.
       */
      override fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param licenseServiceConfiguration The configuration for a license service that is
       * associated with a studio resource.
       */
      override
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration.let(LicenseServiceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param licenseServiceConfiguration The configuration for a license service that is
       * associated with a studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac55785be2829fd2629089442fa098ee586a27c836596dad9e9eba208c9ddae")
      override
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty.Builder.() -> Unit):
          Unit =
          licenseServiceConfiguration(LicenseServiceConfigurationProperty(licenseServiceConfiguration))

      /**
       * @param sharedFileSystemConfiguration The configuration for a shared file storage system
       * that is associated with a studio resource.
       */
      override fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sharedFileSystemConfiguration The configuration for a shared file storage system
       * that is associated with a studio resource.
       */
      override
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration.let(SharedFileSystemConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sharedFileSystemConfiguration The configuration for a shared file storage system
       * that is associated with a studio resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddfcf3613f82db83ae2e014d3eaa7711b83328afb37079ba3df1de236f9a3d5")
      override
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty.Builder.() -> Unit):
          Unit =
          sharedFileSystemConfiguration(SharedFileSystemConfigurationProperty(sharedFileSystemConfiguration))

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty,
    ) : CdkObject(cdkObject),
        StudioComponentConfigurationProperty {
      /**
       * The configuration for a AWS Directory Service for Microsoft Active Directory studio
       * resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-activedirectoryconfiguration)
       */
      override fun activeDirectoryConfiguration(): Any? =
          unwrap(this).getActiveDirectoryConfiguration()

      /**
       * The configuration for a render farm that is associated with a studio resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-computefarmconfiguration)
       */
      override fun computeFarmConfiguration(): Any? = unwrap(this).getComputeFarmConfiguration()

      /**
       * The configuration for a license service that is associated with a studio resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-licenseserviceconfiguration)
       */
      override fun licenseServiceConfiguration(): Any? =
          unwrap(this).getLicenseServiceConfiguration()

      /**
       * The configuration for a shared file storage system that is associated with a studio
       * resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-sharedfilesystemconfiguration)
       */
      override fun sharedFileSystemConfiguration(): Any? =
          unwrap(this).getSharedFileSystemConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StudioComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty):
          StudioComponentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StudioComponentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StudioComponentConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty
    }
  }

  /**
   * Initialization scripts for studio components.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StudioComponentInitializationScriptProperty studioComponentInitializationScriptProperty =
   * StudioComponentInitializationScriptProperty.builder()
   * .launchProfileProtocolVersion("launchProfileProtocolVersion")
   * .platform("platform")
   * .runContext("runContext")
   * .script("script")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html)
   */
  public interface StudioComponentInitializationScriptProperty {
    /**
     * The version number of the protocol that is used by the launch profile.
     *
     * The only valid version is "2021-03-31".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-launchprofileprotocolversion)
     */
    public fun launchProfileProtocolVersion(): String? =
        unwrap(this).getLaunchProfileProtocolVersion()

    /**
     * The platform of the initialization script, either Windows or Linux.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-platform)
     */
    public fun platform(): String? = unwrap(this).getPlatform()

    /**
     * The method to use when running the initialization script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-runcontext)
     */
    public fun runContext(): String? = unwrap(this).getRunContext()

    /**
     * The initialization script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-script)
     */
    public fun script(): String? = unwrap(this).getScript()

    /**
     * A builder for [StudioComponentInitializationScriptProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchProfileProtocolVersion The version number of the protocol that is used by the
       * launch profile.
       * The only valid version is "2021-03-31".
       */
      public fun launchProfileProtocolVersion(launchProfileProtocolVersion: String)

      /**
       * @param platform The platform of the initialization script, either Windows or Linux.
       */
      public fun platform(platform: String)

      /**
       * @param runContext The method to use when running the initialization script.
       */
      public fun runContext(runContext: String)

      /**
       * @param script The initialization script.
       */
      public fun script(script: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty.builder()

      /**
       * @param launchProfileProtocolVersion The version number of the protocol that is used by the
       * launch profile.
       * The only valid version is "2021-03-31".
       */
      override fun launchProfileProtocolVersion(launchProfileProtocolVersion: String) {
        cdkBuilder.launchProfileProtocolVersion(launchProfileProtocolVersion)
      }

      /**
       * @param platform The platform of the initialization script, either Windows or Linux.
       */
      override fun platform(platform: String) {
        cdkBuilder.platform(platform)
      }

      /**
       * @param runContext The method to use when running the initialization script.
       */
      override fun runContext(runContext: String) {
        cdkBuilder.runContext(runContext)
      }

      /**
       * @param script The initialization script.
       */
      override fun script(script: String) {
        cdkBuilder.script(script)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty,
    ) : CdkObject(cdkObject),
        StudioComponentInitializationScriptProperty {
      /**
       * The version number of the protocol that is used by the launch profile.
       *
       * The only valid version is "2021-03-31".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-launchprofileprotocolversion)
       */
      override fun launchProfileProtocolVersion(): String? =
          unwrap(this).getLaunchProfileProtocolVersion()

      /**
       * The platform of the initialization script, either Windows or Linux.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-platform)
       */
      override fun platform(): String? = unwrap(this).getPlatform()

      /**
       * The method to use when running the initialization script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-runcontext)
       */
      override fun runContext(): String? = unwrap(this).getRunContext()

      /**
       * The initialization script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-script)
       */
      override fun script(): String? = unwrap(this).getScript()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StudioComponentInitializationScriptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty):
          StudioComponentInitializationScriptProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StudioComponentInitializationScriptProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StudioComponentInitializationScriptProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty
    }
  }
}
