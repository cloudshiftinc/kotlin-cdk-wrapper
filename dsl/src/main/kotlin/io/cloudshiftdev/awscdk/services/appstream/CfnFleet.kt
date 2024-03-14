package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFleet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnFleet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun computeCapacity(): Any? = unwrap(this).getComputeCapacity()

  public open fun computeCapacity(`value`: IResolvable) {
    unwrap(this).setComputeCapacity(`value`.let(IResolvable::unwrap))
  }

  public open fun computeCapacity(`value`: ComputeCapacityProperty) {
    unwrap(this).setComputeCapacity(`value`.let(ComputeCapacityProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37794d389c003b805ebbcbb90439be973e5b4f6ff10370330aa9c347dbedf486")
  public open fun computeCapacity(`value`: ComputeCapacityProperty.Builder.() -> Unit): Unit =
      computeCapacity(ComputeCapacityProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun disconnectTimeoutInSeconds(): Number? =
      unwrap(this).getDisconnectTimeoutInSeconds()

  public open fun disconnectTimeoutInSeconds(`value`: Number) {
    unwrap(this).setDisconnectTimeoutInSeconds(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  public open fun domainJoinInfo(`value`: IResolvable) {
    unwrap(this).setDomainJoinInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty) {
    unwrap(this).setDomainJoinInfo(`value`.let(DomainJoinInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5146570b4a221cdcb571ccc8df220f00846c2277e1d83775ee54d06e2b9eacde")
  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
      domainJoinInfo(DomainJoinInfoProperty(`value`))

  public open fun enableDefaultInternetAccess(): Any? =
      unwrap(this).getEnableDefaultInternetAccess()

  public open fun enableDefaultInternetAccess(`value`: Boolean) {
    unwrap(this).setEnableDefaultInternetAccess(`value`)
  }

  public open fun enableDefaultInternetAccess(`value`: IResolvable) {
    unwrap(this).setEnableDefaultInternetAccess(`value`.let(IResolvable::unwrap))
  }

  public open fun fleetType(): String? = unwrap(this).getFleetType()

  public open fun fleetType(`value`: String) {
    unwrap(this).setFleetType(`value`)
  }

  public open fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  public open fun idleDisconnectTimeoutInSeconds(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInSeconds()

  public open fun idleDisconnectTimeoutInSeconds(`value`: Number) {
    unwrap(this).setIdleDisconnectTimeoutInSeconds(`value`)
  }

  public open fun imageArn(): String? = unwrap(this).getImageArn()

  public open fun imageArn(`value`: String) {
    unwrap(this).setImageArn(`value`)
  }

  public open fun imageName(): String? = unwrap(this).getImageName()

  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

  public open fun maxConcurrentSessions(`value`: Number) {
    unwrap(this).setMaxConcurrentSessions(`value`)
  }

  public open fun maxSessionsPerInstance(): Number? = unwrap(this).getMaxSessionsPerInstance()

  public open fun maxSessionsPerInstance(`value`: Number) {
    unwrap(this).setMaxSessionsPerInstance(`value`)
  }

  public open fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()

  public open fun maxUserDurationInSeconds(`value`: Number) {
    unwrap(this).setMaxUserDurationInSeconds(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun platform(): String? = unwrap(this).getPlatform()

  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  public open fun sessionScriptS3Location(): Any? = unwrap(this).getSessionScriptS3Location()

  public open fun sessionScriptS3Location(`value`: IResolvable) {
    unwrap(this).setSessionScriptS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun sessionScriptS3Location(`value`: S3LocationProperty) {
    unwrap(this).setSessionScriptS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("44157927f59c8da79ce284e6a0c98e47ff6dcf4ddeed75e94579d618da218d2b")
  public open fun sessionScriptS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      sessionScriptS3Location(S3LocationProperty(`value`))

  public open fun streamView(): String? = unwrap(this).getStreamView()

  public open fun streamView(`value`: String) {
    unwrap(this).setStreamView(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun usbDeviceFilterStrings(): List<String> = unwrap(this).getUsbDeviceFilterStrings()
      ?: emptyList()

  public open fun usbDeviceFilterStrings(`value`: List<String>) {
    unwrap(this).setUsbDeviceFilterStrings(`value`)
  }

  public open fun usbDeviceFilterStrings(vararg `value`: String): Unit =
      usbDeviceFilterStrings(`value`.toList())

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bed9f0abe9330a78431478fa3f56d00919170e6a4dd5c065ff36aae07d4966c9")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  public interface Builder {
    public fun computeCapacity(computeCapacity: IResolvable)

    public fun computeCapacity(computeCapacity: ComputeCapacityProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8195d41084fb0cc4bd88ec67ead8b8f66dc2e1cabaaef40f78689f2148083580")
    public fun computeCapacity(computeCapacity: ComputeCapacityProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number)

    public fun displayName(displayName: String)

    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("506b9b8d13972074c9bc025c0200159e6477bacb687a4372c8b938675473574d")
    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    public fun fleetType(fleetType: String)

    public fun iamRoleArn(iamRoleArn: String)

    public fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number)

    public fun imageArn(imageArn: String)

    public fun imageName(imageName: String)

    public fun instanceType(instanceType: String)

    public fun maxConcurrentSessions(maxConcurrentSessions: Number)

    public fun maxSessionsPerInstance(maxSessionsPerInstance: Number)

    public fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number)

    public fun name(name: String)

    public fun platform(platform: String)

    public fun sessionScriptS3Location(sessionScriptS3Location: IResolvable)

    public fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56683f90f907d5eb91d8a6af02a81d5f7bb017a32f5aec052db5ab5b82184de3")
    public
        fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty.Builder.() -> Unit)

    public fun streamView(streamView: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>)

    public fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29106d013b41bf806200d4877f319de3dc036117dcc422d9d2682b4e9803ed0f")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnFleet.Builder =
        software.amazon.awscdk.services.appstream.CfnFleet.Builder.create(scope, id)

    override fun computeCapacity(computeCapacity: IResolvable) {
      cdkBuilder.computeCapacity(computeCapacity.let(IResolvable::unwrap))
    }

    override fun computeCapacity(computeCapacity: ComputeCapacityProperty) {
      cdkBuilder.computeCapacity(computeCapacity.let(ComputeCapacityProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8195d41084fb0cc4bd88ec67ead8b8f66dc2e1cabaaef40f78689f2148083580")
    override fun computeCapacity(computeCapacity: ComputeCapacityProperty.Builder.() -> Unit): Unit
        = computeCapacity(ComputeCapacityProperty(computeCapacity))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number) {
      cdkBuilder.disconnectTimeoutInSeconds(disconnectTimeoutInSeconds)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable::unwrap))
    }

    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(DomainJoinInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("506b9b8d13972074c9bc025c0200159e6477bacb687a4372c8b938675473574d")
    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
        domainJoinInfo(DomainJoinInfoProperty(domainJoinInfo))

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    override fun fleetType(fleetType: String) {
      cdkBuilder.fleetType(fleetType)
    }

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number) {
      cdkBuilder.idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds)
    }

    override fun imageArn(imageArn: String) {
      cdkBuilder.imageArn(imageArn)
    }

    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun maxConcurrentSessions(maxConcurrentSessions: Number) {
      cdkBuilder.maxConcurrentSessions(maxConcurrentSessions)
    }

    override fun maxSessionsPerInstance(maxSessionsPerInstance: Number) {
      cdkBuilder.maxSessionsPerInstance(maxSessionsPerInstance)
    }

    override fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number) {
      cdkBuilder.maxUserDurationInSeconds(maxUserDurationInSeconds)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun sessionScriptS3Location(sessionScriptS3Location: IResolvable) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(IResolvable::unwrap))
    }

    override fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56683f90f907d5eb91d8a6af02a81d5f7bb017a32f5aec052db5ab5b82184de3")
    override
        fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty.Builder.() -> Unit):
        Unit = sessionScriptS3Location(S3LocationProperty(sessionScriptS3Location))

    override fun streamView(streamView: String) {
      cdkBuilder.streamView(streamView)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>) {
      cdkBuilder.usbDeviceFilterStrings(usbDeviceFilterStrings)
    }

    override fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String): Unit =
        usbDeviceFilterStrings(usbDeviceFilterStrings.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29106d013b41bf806200d4877f319de3dc036117dcc422d9d2682b4e9803ed0f")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.appstream.CfnFleet =
        wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun s3Bucket(): String

    public fun s3Key(): String

    public interface Builder {
      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty.builder()

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty,
    ) : S3LocationProperty {
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ComputeCapacityProperty {
    public fun desiredInstances(): Number? = unwrap(this).getDesiredInstances()

    public fun desiredSessions(): Number? = unwrap(this).getDesiredSessions()

    public interface Builder {
      public fun desiredInstances(desiredInstances: Number)

      public fun desiredSessions(desiredSessions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.builder()

      override fun desiredInstances(desiredInstances: Number) {
        cdkBuilder.desiredInstances(desiredInstances)
      }

      override fun desiredSessions(desiredSessions: Number) {
        cdkBuilder.desiredSessions(desiredSessions)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty,
    ) : ComputeCapacityProperty {
      override fun desiredInstances(): Number? = unwrap(this).getDesiredInstances()

      override fun desiredSessions(): Number? = unwrap(this).getDesiredSessions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeCapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty):
          ComputeCapacityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeCapacityProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DomainJoinInfoProperty {
    public fun directoryName(): String? = unwrap(this).getDirectoryName()

    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    public interface Builder {
      public fun directoryName(directoryName: String)

      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.builder()

      override fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
      }

      override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty,
    ) : DomainJoinInfoProperty {
      override fun directoryName(): String? = unwrap(this).getDirectoryName()

      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DomainJoinInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty):
          DomainJoinInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainJoinInfoProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
