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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html.
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
   *
   */
  public open fun attrStudioComponentId(): String = unwrap(this).getAttrStudioComponentId()

  /**
   *
   */
  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   *
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun configuration(`value`: StudioComponentConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(StudioComponentConfigurationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e92352b87430c4111ddc94db4412da047f88c4fac6d19b9244cacf89cba7fd75")
  public open fun configuration(`value`: StudioComponentConfigurationProperty.Builder.() -> Unit):
      Unit = configuration(StudioComponentConfigurationProperty(`value`))

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
      emptyList()

  /**
   *
   */
  public open fun ec2SecurityGroupIds(`value`: List<String>) {
    unwrap(this).setEc2SecurityGroupIds(`value`)
  }

  /**
   *
   */
  public open fun ec2SecurityGroupIds(vararg `value`: String): Unit =
      ec2SecurityGroupIds(`value`.toList())

  /**
   *
   */
  public open fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

  /**
   *
   */
  public open fun initializationScripts(`value`: IResolvable) {
    unwrap(this).setInitializationScripts(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun initializationScripts(`value`: List<Any>) {
    unwrap(this).setInitializationScripts(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
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
   *
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

  /**
   *
   */
  public open fun scriptParameters(`value`: IResolvable) {
    unwrap(this).setScriptParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun scriptParameters(`value`: List<Any>) {
    unwrap(this).setScriptParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
   */
  public open fun scriptParameters(vararg `value`: Any): Unit = scriptParameters(`value`.toList())

  /**
   *
   */
  public open fun studioId(): String = unwrap(this).getStudioId()

  /**
   *
   */
  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  /**
   *
   */
  public open fun subtype(): String? = unwrap(this).getSubtype()

  /**
   *
   */
  public open fun subtype(`value`: String) {
    unwrap(this).setSubtype(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   *
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration 
     */
    public fun configuration(configuration: StudioComponentConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4f6ee60322ab1a583f5a893b4f9363f4fee46ad969093a7220b7fc5676aee35")
    public fun configuration(configuration: StudioComponentConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds 
     */
    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds 
     */
    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts 
     */
    public fun initializationScripts(initializationScripts: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts 
     */
    public fun initializationScripts(initializationScripts: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts 
     */
    public fun initializationScripts(vararg initializationScripts: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters 
     */
    public fun scriptParameters(scriptParameters: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters 
     */
    public fun scriptParameters(scriptParameters: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters 
     */
    public fun scriptParameters(vararg scriptParameters: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
     * @param studioId 
     */
    public fun studioId(studioId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
     * @param subtype 
     */
    public fun subtype(subtype: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
     * @param type 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration 
     */
    override fun configuration(configuration: StudioComponentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(StudioComponentConfigurationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-configuration)
     * @param configuration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4f6ee60322ab1a583f5a893b4f9363f4fee46ad969093a7220b7fc5676aee35")
    override
        fun configuration(configuration: StudioComponentConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(StudioComponentConfigurationProperty(configuration))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds 
     */
    override fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>) {
      cdkBuilder.ec2SecurityGroupIds(ec2SecurityGroupIds)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-ec2securitygroupids)
     * @param ec2SecurityGroupIds 
     */
    override fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String): Unit =
        ec2SecurityGroupIds(ec2SecurityGroupIds.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts 
     */
    override fun initializationScripts(initializationScripts: IResolvable) {
      cdkBuilder.initializationScripts(initializationScripts.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts 
     */
    override fun initializationScripts(initializationScripts: List<Any>) {
      cdkBuilder.initializationScripts(initializationScripts.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-initializationscripts)
     * @param initializationScripts 
     */
    override fun initializationScripts(vararg initializationScripts: Any): Unit =
        initializationScripts(initializationScripts.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters 
     */
    override fun scriptParameters(scriptParameters: IResolvable) {
      cdkBuilder.scriptParameters(scriptParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters 
     */
    override fun scriptParameters(scriptParameters: List<Any>) {
      cdkBuilder.scriptParameters(scriptParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-scriptparameters)
     * @param scriptParameters 
     */
    override fun scriptParameters(vararg scriptParameters: Any): Unit =
        scriptParameters(scriptParameters.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-studioid)
     * @param studioId 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-subtype)
     * @param subtype 
     */
    override fun subtype(subtype: String) {
      cdkBuilder.subtype(subtype)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html#cfn-nimblestudio-studiocomponent-type)
     * @param type 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html#cfn-nimblestudio-studiocomponent-activedirectorycomputerattribute-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html#cfn-nimblestudio-studiocomponent-activedirectorycomputerattribute-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ActiveDirectoryComputerAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set.
       */
      public fun name(name: String)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.builder()

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html#cfn-nimblestudio-studiocomponent-activedirectorycomputerattribute-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-computerattributes)
     */
    public fun computerAttributes(): Any? = unwrap(this).getComputerAttributes()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-directoryid)
     */
    public fun directoryId(): String? = unwrap(this).getDirectoryId()

    /**
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
       * @param computerAttributes the value to be set.
       */
      public fun computerAttributes(computerAttributes: IResolvable)

      /**
       * @param computerAttributes the value to be set.
       */
      public fun computerAttributes(computerAttributes: List<Any>)

      /**
       * @param computerAttributes the value to be set.
       */
      public fun computerAttributes(vararg computerAttributes: Any)

      /**
       * @param directoryId the value to be set.
       */
      public fun directoryId(directoryId: String)

      /**
       * @param organizationalUnitDistinguishedName the value to be set.
       */
      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty.builder()

      /**
       * @param computerAttributes the value to be set.
       */
      override fun computerAttributes(computerAttributes: IResolvable) {
        cdkBuilder.computerAttributes(computerAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param computerAttributes the value to be set.
       */
      override fun computerAttributes(computerAttributes: List<Any>) {
        cdkBuilder.computerAttributes(computerAttributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param computerAttributes the value to be set.
       */
      override fun computerAttributes(vararg computerAttributes: Any): Unit =
          computerAttributes(computerAttributes.toList())

      /**
       * @param directoryId the value to be set.
       */
      override fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
      }

      /**
       * @param organizationalUnitDistinguishedName the value to be set.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-computerattributes)
       */
      override fun computerAttributes(): Any? = unwrap(this).getComputerAttributes()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html#cfn-nimblestudio-studiocomponent-activedirectoryconfiguration-directoryid)
       */
      override fun directoryId(): String? = unwrap(this).getDirectoryId()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html#cfn-nimblestudio-studiocomponent-computefarmconfiguration-activedirectoryuser)
     */
    public fun activeDirectoryUser(): String? = unwrap(this).getActiveDirectoryUser()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html#cfn-nimblestudio-studiocomponent-computefarmconfiguration-endpoint)
     */
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * A builder for [ComputeFarmConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activeDirectoryUser the value to be set.
       */
      public fun activeDirectoryUser(activeDirectoryUser: String)

      /**
       * @param endpoint the value to be set.
       */
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty.builder()

      /**
       * @param activeDirectoryUser the value to be set.
       */
      override fun activeDirectoryUser(activeDirectoryUser: String) {
        cdkBuilder.activeDirectoryUser(activeDirectoryUser)
      }

      /**
       * @param endpoint the value to be set.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html#cfn-nimblestudio-studiocomponent-computefarmconfiguration-activedirectoryuser)
       */
      override fun activeDirectoryUser(): String? = unwrap(this).getActiveDirectoryUser()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-licenseserviceconfiguration.html#cfn-nimblestudio-studiocomponent-licenseserviceconfiguration-endpoint)
     */
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * A builder for [LicenseServiceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoint the value to be set.
       */
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.builder()

      /**
       * @param endpoint the value to be set.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html#cfn-nimblestudio-studiocomponent-scriptparameterkeyvalue-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html#cfn-nimblestudio-studiocomponent-scriptparameterkeyvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ScriptParameterKeyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key the value to be set.
       */
      public fun key(key: String)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty.builder()

      /**
       * @param key the value to be set.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value the value to be set.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html#cfn-nimblestudio-studiocomponent-scriptparameterkeyvalue-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-endpoint)
     */
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-filesystemid)
     */
    public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-linuxmountpoint)
     */
    public fun linuxMountPoint(): String? = unwrap(this).getLinuxMountPoint()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-sharename)
     */
    public fun shareName(): String? = unwrap(this).getShareName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-windowsmountdrive)
     */
    public fun windowsMountDrive(): String? = unwrap(this).getWindowsMountDrive()

    /**
     * A builder for [SharedFileSystemConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoint the value to be set.
       */
      public fun endpoint(endpoint: String)

      /**
       * @param fileSystemId the value to be set.
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param linuxMountPoint the value to be set.
       */
      public fun linuxMountPoint(linuxMountPoint: String)

      /**
       * @param shareName the value to be set.
       */
      public fun shareName(shareName: String)

      /**
       * @param windowsMountDrive the value to be set.
       */
      public fun windowsMountDrive(windowsMountDrive: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty.builder()

      /**
       * @param endpoint the value to be set.
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      /**
       * @param fileSystemId the value to be set.
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param linuxMountPoint the value to be set.
       */
      override fun linuxMountPoint(linuxMountPoint: String) {
        cdkBuilder.linuxMountPoint(linuxMountPoint)
      }

      /**
       * @param shareName the value to be set.
       */
      override fun shareName(shareName: String) {
        cdkBuilder.shareName(shareName)
      }

      /**
       * @param windowsMountDrive the value to be set.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-endpoint)
       */
      override fun endpoint(): String? = unwrap(this).getEndpoint()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-filesystemid)
       */
      override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-linuxmountpoint)
       */
      override fun linuxMountPoint(): String? = unwrap(this).getLinuxMountPoint()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html#cfn-nimblestudio-studiocomponent-sharedfilesystemconfiguration-sharename)
       */
      override fun shareName(): String? = unwrap(this).getShareName()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-activedirectoryconfiguration)
     */
    public fun activeDirectoryConfiguration(): Any? = unwrap(this).getActiveDirectoryConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-computefarmconfiguration)
     */
    public fun computeFarmConfiguration(): Any? = unwrap(this).getComputeFarmConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-licenseserviceconfiguration)
     */
    public fun licenseServiceConfiguration(): Any? = unwrap(this).getLicenseServiceConfiguration()

    /**
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
       * @param activeDirectoryConfiguration the value to be set.
       */
      public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable)

      /**
       * @param activeDirectoryConfiguration the value to be set.
       */
      public
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty)

      /**
       * @param activeDirectoryConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580fc56564d1496b95a674cf508b6ee811b62e9ae9506daac7a54c20a4228b82")
      public
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit)

      /**
       * @param computeFarmConfiguration the value to be set.
       */
      public fun computeFarmConfiguration(computeFarmConfiguration: IResolvable)

      /**
       * @param computeFarmConfiguration the value to be set.
       */
      public
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty)

      /**
       * @param computeFarmConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("147a6b54528749e907c7b2cd4e79aa46eb7a7d67177215e5a1555910ca5a5bd8")
      public
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty.Builder.() -> Unit)

      /**
       * @param licenseServiceConfiguration the value to be set.
       */
      public fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable)

      /**
       * @param licenseServiceConfiguration the value to be set.
       */
      public
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty)

      /**
       * @param licenseServiceConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac55785be2829fd2629089442fa098ee586a27c836596dad9e9eba208c9ddae")
      public
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sharedFileSystemConfiguration the value to be set.
       */
      public fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable)

      /**
       * @param sharedFileSystemConfiguration the value to be set.
       */
      public
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty)

      /**
       * @param sharedFileSystemConfiguration the value to be set.
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
       * @param activeDirectoryConfiguration the value to be set.
       */
      override fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param activeDirectoryConfiguration the value to be set.
       */
      override
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(ActiveDirectoryConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param activeDirectoryConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580fc56564d1496b95a674cf508b6ee811b62e9ae9506daac7a54c20a4228b82")
      override
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
          Unit =
          activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty(activeDirectoryConfiguration))

      /**
       * @param computeFarmConfiguration the value to be set.
       */
      override fun computeFarmConfiguration(computeFarmConfiguration: IResolvable) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param computeFarmConfiguration the value to be set.
       */
      override
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration.let(ComputeFarmConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param computeFarmConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("147a6b54528749e907c7b2cd4e79aa46eb7a7d67177215e5a1555910ca5a5bd8")
      override
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty.Builder.() -> Unit):
          Unit =
          computeFarmConfiguration(ComputeFarmConfigurationProperty(computeFarmConfiguration))

      /**
       * @param licenseServiceConfiguration the value to be set.
       */
      override fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param licenseServiceConfiguration the value to be set.
       */
      override
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration.let(LicenseServiceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param licenseServiceConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac55785be2829fd2629089442fa098ee586a27c836596dad9e9eba208c9ddae")
      override
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty.Builder.() -> Unit):
          Unit =
          licenseServiceConfiguration(LicenseServiceConfigurationProperty(licenseServiceConfiguration))

      /**
       * @param sharedFileSystemConfiguration the value to be set.
       */
      override fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sharedFileSystemConfiguration the value to be set.
       */
      override
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration.let(SharedFileSystemConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sharedFileSystemConfiguration the value to be set.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-activedirectoryconfiguration)
       */
      override fun activeDirectoryConfiguration(): Any? =
          unwrap(this).getActiveDirectoryConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-computefarmconfiguration)
       */
      override fun computeFarmConfiguration(): Any? = unwrap(this).getComputeFarmConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html#cfn-nimblestudio-studiocomponent-studiocomponentconfiguration-licenseserviceconfiguration)
       */
      override fun licenseServiceConfiguration(): Any? =
          unwrap(this).getLicenseServiceConfiguration()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-launchprofileprotocolversion)
     */
    public fun launchProfileProtocolVersion(): String? =
        unwrap(this).getLaunchProfileProtocolVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-platform)
     */
    public fun platform(): String? = unwrap(this).getPlatform()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-runcontext)
     */
    public fun runContext(): String? = unwrap(this).getRunContext()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-script)
     */
    public fun script(): String? = unwrap(this).getScript()

    /**
     * A builder for [StudioComponentInitializationScriptProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchProfileProtocolVersion the value to be set.
       */
      public fun launchProfileProtocolVersion(launchProfileProtocolVersion: String)

      /**
       * @param platform the value to be set.
       */
      public fun platform(platform: String)

      /**
       * @param runContext the value to be set.
       */
      public fun runContext(runContext: String)

      /**
       * @param script the value to be set.
       */
      public fun script(script: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty.builder()

      /**
       * @param launchProfileProtocolVersion the value to be set.
       */
      override fun launchProfileProtocolVersion(launchProfileProtocolVersion: String) {
        cdkBuilder.launchProfileProtocolVersion(launchProfileProtocolVersion)
      }

      /**
       * @param platform the value to be set.
       */
      override fun platform(platform: String) {
        cdkBuilder.platform(platform)
      }

      /**
       * @param runContext the value to be set.
       */
      override fun runContext(runContext: String) {
        cdkBuilder.runContext(runContext)
      }

      /**
       * @param script the value to be set.
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-launchprofileprotocolversion)
       */
      override fun launchProfileProtocolVersion(): String? =
          unwrap(this).getLaunchProfileProtocolVersion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-platform)
       */
      override fun platform(): String? = unwrap(this).getPlatform()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html#cfn-nimblestudio-studiocomponent-studiocomponentinitializationscript-runcontext)
       */
      override fun runContext(): String? = unwrap(this).getRunContext()

      /**
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
