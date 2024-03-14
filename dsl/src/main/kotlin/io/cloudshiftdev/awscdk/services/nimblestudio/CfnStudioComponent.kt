package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStudioComponent internal constructor(
  private val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrStudioComponentId(): String = unwrap(this).getAttrStudioComponentId()

  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: StudioComponentConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(StudioComponentConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e92352b87430c4111ddc94db4412da047f88c4fac6d19b9244cacf89cba7fd75")
  public open fun configuration(`value`: StudioComponentConfigurationProperty.Builder.() -> Unit):
      Unit = configuration(StudioComponentConfigurationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun ec2SecurityGroupIds(): List<String> = unwrap(this).getEc2SecurityGroupIds() ?:
      emptyList()

  public open fun ec2SecurityGroupIds(`value`: List<String>) {
    unwrap(this).setEc2SecurityGroupIds(`value`)
  }

  public open fun ec2SecurityGroupIds(vararg `value`: String): Unit =
      ec2SecurityGroupIds(`value`.toList())

  public open fun initializationScripts(): Any? = unwrap(this).getInitializationScripts()

  public open fun initializationScripts(`value`: IResolvable) {
    unwrap(this).setInitializationScripts(`value`.let(IResolvable::unwrap))
  }

  public open fun initializationScripts(__idx_ac66f0: List<Any>) {
    unwrap(this).setInitializationScripts(__idx_ac66f0)
  }

  public open fun initializationScripts(vararg __idx_ac66f0: Any): Unit =
      initializationScripts(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  public open fun runtimeRoleArn(`value`: String) {
    unwrap(this).setRuntimeRoleArn(`value`)
  }

  public open fun scriptParameters(): Any? = unwrap(this).getScriptParameters()

  public open fun scriptParameters(`value`: IResolvable) {
    unwrap(this).setScriptParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun scriptParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setScriptParameters(__idx_ac66f0)
  }

  public open fun scriptParameters(vararg __idx_ac66f0: Any): Unit =
      scriptParameters(__idx_ac66f0.toList())

  public open fun secureInitializationRoleArn(): String? =
      unwrap(this).getSecureInitializationRoleArn()

  public open fun secureInitializationRoleArn(`value`: String) {
    unwrap(this).setSecureInitializationRoleArn(`value`)
  }

  public open fun studioId(): String = unwrap(this).getStudioId()

  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  public open fun subtype(): String? = unwrap(this).getSubtype()

  public open fun subtype(`value`: String) {
    unwrap(this).setSubtype(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: StudioComponentConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4f6ee60322ab1a583f5a893b4f9363f4fee46ad969093a7220b7fc5676aee35")
    public fun configuration(configuration: StudioComponentConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>)

    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String)

    public fun initializationScripts(initializationScripts: IResolvable)

    public fun initializationScripts(initializationScripts: List<Any>)

    public fun initializationScripts(vararg initializationScripts: Any)

    public fun name(name: String)

    public fun runtimeRoleArn(runtimeRoleArn: String)

    public fun scriptParameters(scriptParameters: IResolvable)

    public fun scriptParameters(scriptParameters: List<Any>)

    public fun scriptParameters(vararg scriptParameters: Any)

    public fun secureInitializationRoleArn(secureInitializationRoleArn: String)

    public fun studioId(studioId: String)

    public fun subtype(subtype: String)

    public fun tags(tags: Map<String, String>)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.Builder
        = software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.Builder.create(scope, id)

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: StudioComponentConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(StudioComponentConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4f6ee60322ab1a583f5a893b4f9363f4fee46ad969093a7220b7fc5676aee35")
    override
        fun configuration(configuration: StudioComponentConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(StudioComponentConfigurationProperty(configuration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ec2SecurityGroupIds(ec2SecurityGroupIds: List<String>) {
      cdkBuilder.ec2SecurityGroupIds(ec2SecurityGroupIds)
    }

    override fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String): Unit =
        ec2SecurityGroupIds(ec2SecurityGroupIds.toList())

    override fun initializationScripts(initializationScripts: IResolvable) {
      cdkBuilder.initializationScripts(initializationScripts.let(IResolvable::unwrap))
    }

    override fun initializationScripts(initializationScripts: List<Any>) {
      cdkBuilder.initializationScripts(initializationScripts)
    }

    override fun initializationScripts(vararg initializationScripts: Any): Unit =
        initializationScripts(initializationScripts.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun runtimeRoleArn(runtimeRoleArn: String) {
      cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    override fun scriptParameters(scriptParameters: IResolvable) {
      cdkBuilder.scriptParameters(scriptParameters.let(IResolvable::unwrap))
    }

    override fun scriptParameters(scriptParameters: List<Any>) {
      cdkBuilder.scriptParameters(scriptParameters)
    }

    override fun scriptParameters(vararg scriptParameters: Any): Unit =
        scriptParameters(scriptParameters.toList())

    override fun secureInitializationRoleArn(secureInitializationRoleArn: String) {
      cdkBuilder.secureInitializationRoleArn(secureInitializationRoleArn)
    }

    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    override fun subtype(subtype: String) {
      cdkBuilder.subtype(subtype)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.nimblestudio.CfnStudioComponent = wrapped.cdkObject
  }

  public interface SharedFileSystemConfigurationProperty {
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    public fun linuxMountPoint(): String? = unwrap(this).getLinuxMountPoint()

    public fun shareName(): String? = unwrap(this).getShareName()

    public fun windowsMountDrive(): String? = unwrap(this).getWindowsMountDrive()

    public interface Builder {
      public fun endpoint(endpoint: String)

      public fun fileSystemId(fileSystemId: String)

      public fun linuxMountPoint(linuxMountPoint: String)

      public fun shareName(shareName: String)

      public fun windowsMountDrive(windowsMountDrive: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty.builder()

      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      override fun linuxMountPoint(linuxMountPoint: String) {
        cdkBuilder.linuxMountPoint(linuxMountPoint)
      }

      override fun shareName(shareName: String) {
        cdkBuilder.shareName(shareName)
      }

      override fun windowsMountDrive(windowsMountDrive: String) {
        cdkBuilder.windowsMountDrive(windowsMountDrive)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty,
    ) : SharedFileSystemConfigurationProperty {
      override fun endpoint(): String? = unwrap(this).getEndpoint()

      override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

      override fun linuxMountPoint(): String? = unwrap(this).getLinuxMountPoint()

      override fun shareName(): String? = unwrap(this).getShareName()

      override fun windowsMountDrive(): String? = unwrap(this).getWindowsMountDrive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SharedFileSystemConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty):
          SharedFileSystemConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharedFileSystemConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScriptParameterKeyValueProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty,
    ) : ScriptParameterKeyValueProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptParameterKeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty):
          ScriptParameterKeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptParameterKeyValueProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComputeFarmConfigurationProperty {
    public fun activeDirectoryUser(): String? = unwrap(this).getActiveDirectoryUser()

    public fun endpoint(): String? = unwrap(this).getEndpoint()

    public interface Builder {
      public fun activeDirectoryUser(activeDirectoryUser: String)

      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty.builder()

      override fun activeDirectoryUser(activeDirectoryUser: String) {
        cdkBuilder.activeDirectoryUser(activeDirectoryUser)
      }

      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty,
    ) : ComputeFarmConfigurationProperty {
      override fun activeDirectoryUser(): String? = unwrap(this).getActiveDirectoryUser()

      override fun endpoint(): String? = unwrap(this).getEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeFarmConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty):
          ComputeFarmConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeFarmConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StudioComponentInitializationScriptProperty {
    public fun launchProfileProtocolVersion(): String? =
        unwrap(this).getLaunchProfileProtocolVersion()

    public fun platform(): String? = unwrap(this).getPlatform()

    public fun runContext(): String? = unwrap(this).getRunContext()

    public fun script(): String? = unwrap(this).getScript()

    public interface Builder {
      public fun launchProfileProtocolVersion(launchProfileProtocolVersion: String)

      public fun platform(platform: String)

      public fun runContext(runContext: String)

      public fun script(script: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty.builder()

      override fun launchProfileProtocolVersion(launchProfileProtocolVersion: String) {
        cdkBuilder.launchProfileProtocolVersion(launchProfileProtocolVersion)
      }

      override fun platform(platform: String) {
        cdkBuilder.platform(platform)
      }

      override fun runContext(runContext: String) {
        cdkBuilder.runContext(runContext)
      }

      override fun script(script: String) {
        cdkBuilder.script(script)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty,
    ) : StudioComponentInitializationScriptProperty {
      override fun launchProfileProtocolVersion(): String? =
          unwrap(this).getLaunchProfileProtocolVersion()

      override fun platform(): String? = unwrap(this).getPlatform()

      override fun runContext(): String? = unwrap(this).getRunContext()

      override fun script(): String? = unwrap(this).getScript()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StudioComponentInitializationScriptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty):
          StudioComponentInitializationScriptProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StudioComponentInitializationScriptProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActiveDirectoryConfigurationProperty {
    public fun computerAttributes(): Any? = unwrap(this).getComputerAttributes()

    public fun directoryId(): String? = unwrap(this).getDirectoryId()

    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    public interface Builder {
      public fun computerAttributes(computerAttributes: IResolvable)

      public fun computerAttributes(computerAttributes: List<Any>)

      public fun computerAttributes(vararg computerAttributes: Any)

      public fun directoryId(directoryId: String)

      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty.builder()

      override fun computerAttributes(computerAttributes: IResolvable) {
        cdkBuilder.computerAttributes(computerAttributes.let(IResolvable::unwrap))
      }

      override fun computerAttributes(computerAttributes: List<Any>) {
        cdkBuilder.computerAttributes(computerAttributes)
      }

      override fun computerAttributes(vararg computerAttributes: Any): Unit =
          computerAttributes(computerAttributes.toList())

      override fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
      }

      override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty,
    ) : ActiveDirectoryConfigurationProperty {
      override fun computerAttributes(): Any? = unwrap(this).getComputerAttributes()

      override fun directoryId(): String? = unwrap(this).getDirectoryId()

      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ActiveDirectoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty):
          ActiveDirectoryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LicenseServiceConfigurationProperty {
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    public interface Builder {
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.builder()

      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty,
    ) : LicenseServiceConfigurationProperty {
      override fun endpoint(): String? = unwrap(this).getEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LicenseServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty):
          LicenseServiceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LicenseServiceConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StudioComponentConfigurationProperty {
    public fun activeDirectoryConfiguration(): Any? = unwrap(this).getActiveDirectoryConfiguration()

    public fun computeFarmConfiguration(): Any? = unwrap(this).getComputeFarmConfiguration()

    public fun licenseServiceConfiguration(): Any? = unwrap(this).getLicenseServiceConfiguration()

    public fun sharedFileSystemConfiguration(): Any? =
        unwrap(this).getSharedFileSystemConfiguration()

    public interface Builder {
      public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable)

      public
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580fc56564d1496b95a674cf508b6ee811b62e9ae9506daac7a54c20a4228b82")
      public
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit)

      public fun computeFarmConfiguration(computeFarmConfiguration: IResolvable)

      public
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("147a6b54528749e907c7b2cd4e79aa46eb7a7d67177215e5a1555910ca5a5bd8")
      public
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty.Builder.() -> Unit)

      public fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable)

      public
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac55785be2829fd2629089442fa098ee586a27c836596dad9e9eba208c9ddae")
      public
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty.Builder.() -> Unit)

      public fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable)

      public
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddfcf3613f82db83ae2e014d3eaa7711b83328afb37079ba3df1de236f9a3d5")
      public
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty.builder()

      override fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(IResolvable::unwrap))
      }

      override
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(ActiveDirectoryConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580fc56564d1496b95a674cf508b6ee811b62e9ae9506daac7a54c20a4228b82")
      override
          fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
          Unit =
          activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty(activeDirectoryConfiguration))

      override fun computeFarmConfiguration(computeFarmConfiguration: IResolvable) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration.let(IResolvable::unwrap))
      }

      override
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration.let(ComputeFarmConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("147a6b54528749e907c7b2cd4e79aa46eb7a7d67177215e5a1555910ca5a5bd8")
      override
          fun computeFarmConfiguration(computeFarmConfiguration: ComputeFarmConfigurationProperty.Builder.() -> Unit):
          Unit =
          computeFarmConfiguration(ComputeFarmConfigurationProperty(computeFarmConfiguration))

      override fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration.let(IResolvable::unwrap))
      }

      override
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration.let(LicenseServiceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac55785be2829fd2629089442fa098ee586a27c836596dad9e9eba208c9ddae")
      override
          fun licenseServiceConfiguration(licenseServiceConfiguration: LicenseServiceConfigurationProperty.Builder.() -> Unit):
          Unit =
          licenseServiceConfiguration(LicenseServiceConfigurationProperty(licenseServiceConfiguration))

      override fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration.let(IResolvable::unwrap))
      }

      override
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration.let(SharedFileSystemConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddfcf3613f82db83ae2e014d3eaa7711b83328afb37079ba3df1de236f9a3d5")
      override
          fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: SharedFileSystemConfigurationProperty.Builder.() -> Unit):
          Unit =
          sharedFileSystemConfiguration(SharedFileSystemConfigurationProperty(sharedFileSystemConfiguration))

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty,
    ) : StudioComponentConfigurationProperty {
      override fun activeDirectoryConfiguration(): Any? =
          unwrap(this).getActiveDirectoryConfiguration()

      override fun computeFarmConfiguration(): Any? = unwrap(this).getComputeFarmConfiguration()

      override fun licenseServiceConfiguration(): Any? =
          unwrap(this).getLicenseServiceConfiguration()

      override fun sharedFileSystemConfiguration(): Any? =
          unwrap(this).getSharedFileSystemConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StudioComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty):
          StudioComponentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StudioComponentConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActiveDirectoryComputerAttributeProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty,
    ) : ActiveDirectoryComputerAttributeProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ActiveDirectoryComputerAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty):
          ActiveDirectoryComputerAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActiveDirectoryComputerAttributeProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
