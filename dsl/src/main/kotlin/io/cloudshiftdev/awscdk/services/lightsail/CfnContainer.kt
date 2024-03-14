package io.cloudshiftdev.awscdk.services.lightsail

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

public open class CfnContainer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrContainerArn(): String = unwrap(this).getAttrContainerArn()

  public open fun attrPrincipalArn(): String = unwrap(this).getAttrPrincipalArn()

  public open fun attrPrivateRegistryAccessEcrImagePullerRolePrincipalArn(): String =
      unwrap(this).getAttrPrivateRegistryAccessEcrImagePullerRolePrincipalArn()

  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  public open fun containerServiceDeployment(): Any? = unwrap(this).getContainerServiceDeployment()

  public open fun containerServiceDeployment(`value`: IResolvable) {
    unwrap(this).setContainerServiceDeployment(`value`.let(IResolvable::unwrap))
  }

  public open fun containerServiceDeployment(`value`: ContainerServiceDeploymentProperty) {
    unwrap(this).setContainerServiceDeployment(`value`.let(ContainerServiceDeploymentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f054c56b7195a01dbd63be82d391c716c6500d8a63ffcbd1007cec40f6745569")
  public open
      fun containerServiceDeployment(`value`: ContainerServiceDeploymentProperty.Builder.() -> Unit):
      Unit = containerServiceDeployment(ContainerServiceDeploymentProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun isDisabled(): Any? = unwrap(this).getIsDisabled()

  public open fun isDisabled(`value`: Boolean) {
    unwrap(this).setIsDisabled(`value`)
  }

  public open fun isDisabled(`value`: IResolvable) {
    unwrap(this).setIsDisabled(`value`.let(IResolvable::unwrap))
  }

  public open fun power(): String = unwrap(this).getPower()

  public open fun power(`value`: String) {
    unwrap(this).setPower(`value`)
  }

  public open fun privateRegistryAccess(): Any? = unwrap(this).getPrivateRegistryAccess()

  public open fun privateRegistryAccess(`value`: IResolvable) {
    unwrap(this).setPrivateRegistryAccess(`value`.let(IResolvable::unwrap))
  }

  public open fun privateRegistryAccess(`value`: PrivateRegistryAccessProperty) {
    unwrap(this).setPrivateRegistryAccess(`value`.let(PrivateRegistryAccessProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38482a3fa868b9cf1aeb015531e2d0b7ac0ee30c2bc62b924eb011a5d4b93605")
  public open fun privateRegistryAccess(`value`: PrivateRegistryAccessProperty.Builder.() -> Unit):
      Unit = privateRegistryAccess(PrivateRegistryAccessProperty(`value`))

  public open fun publicDomainNames(): Any? = unwrap(this).getPublicDomainNames()

  public open fun publicDomainNames(`value`: IResolvable) {
    unwrap(this).setPublicDomainNames(`value`.let(IResolvable::unwrap))
  }

  public open fun publicDomainNames(__idx_ac66f0: List<Any>) {
    unwrap(this).setPublicDomainNames(__idx_ac66f0)
  }

  public open fun scale(): Number = unwrap(this).getScale()

  public open fun scale(`value`: Number) {
    unwrap(this).setScale(`value`)
  }

  public open fun serviceName(): String = unwrap(this).getServiceName()

  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
    }

    public
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("910de1d67437b07873e857602657233912e64a04b1bd95e036f3e6b94de73148")
    public
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty.Builder.() -> Unit) {
    }

    public fun isDisabled(isDisabled: Boolean) {
    }

    public fun isDisabled(isDisabled: IResolvable) {
    }

    public fun power(power: String) {
    }

    public fun privateRegistryAccess(privateRegistryAccess: IResolvable) {
    }

    public fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51d988934b3c0025c7ccb6fe2246ff1029e269c5028299f7e8ee97c8f8ce44eb")
    public
        fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty.Builder.() -> Unit) {
    }

    public fun publicDomainNames(publicDomainNames: IResolvable) {
    }

    public fun publicDomainNames(publicDomainNames: List<Any>) {
    }

    public fun scale(scale: Number) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnContainer.Builder =
        software.amazon.awscdk.services.lightsail.CfnContainer.Builder.create(scope, id)

    public override fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(IResolvable::unwrap))
    }

    public override
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(ContainerServiceDeploymentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("910de1d67437b07873e857602657233912e64a04b1bd95e036f3e6b94de73148")
    public override
        fun containerServiceDeployment(containerServiceDeployment: ContainerServiceDeploymentProperty.Builder.() -> Unit):
        Unit =
        containerServiceDeployment(ContainerServiceDeploymentProperty(containerServiceDeployment))

    public override fun isDisabled(isDisabled: Boolean) {
      cdkBuilder.isDisabled(isDisabled)
    }

    public override fun isDisabled(isDisabled: IResolvable) {
      cdkBuilder.isDisabled(isDisabled.let(IResolvable::unwrap))
    }

    public override fun power(power: String) {
      cdkBuilder.power(power)
    }

    public override fun privateRegistryAccess(privateRegistryAccess: IResolvable) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(IResolvable::unwrap))
    }

    public override
        fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(PrivateRegistryAccessProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51d988934b3c0025c7ccb6fe2246ff1029e269c5028299f7e8ee97c8f8ce44eb")
    public override
        fun privateRegistryAccess(privateRegistryAccess: PrivateRegistryAccessProperty.Builder.() -> Unit):
        Unit = privateRegistryAccess(PrivateRegistryAccessProperty(privateRegistryAccess))

    public override fun publicDomainNames(publicDomainNames: IResolvable) {
      cdkBuilder.publicDomainNames(publicDomainNames.let(IResolvable::unwrap))
    }

    public override fun publicDomainNames(publicDomainNames: List<Any>) {
      cdkBuilder.publicDomainNames(publicDomainNames)
    }

    public override fun scale(scale: Number) {
      cdkBuilder.scale(scale)
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnContainer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContainer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContainer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer):
        CfnContainer = CfnContainer(cdkObject)

    internal fun unwrap(wrapped: CfnContainer):
        software.amazon.awscdk.services.lightsail.CfnContainer = wrapped.cdkObject
  }

  public interface PrivateRegistryAccessProperty {
    public fun ecrImagePullerRole(): Any? = unwrap(this).getEcrImagePullerRole()

    public interface Builder {
      public fun ecrImagePullerRole(ecrImagePullerRole: IResolvable) {
      }

      public fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa629e212b634adb107bf727e15842e667ed1f17f336bacee57bd0201774c2b2")
      public
          fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty.builder()

      public override fun ecrImagePullerRole(ecrImagePullerRole: IResolvable) {
        cdkBuilder.ecrImagePullerRole(ecrImagePullerRole.let(IResolvable::unwrap))
      }

      public override fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty) {
        cdkBuilder.ecrImagePullerRole(ecrImagePullerRole.let(EcrImagePullerRoleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa629e212b634adb107bf727e15842e667ed1f17f336bacee57bd0201774c2b2")
      public override
          fun ecrImagePullerRole(ecrImagePullerRole: EcrImagePullerRoleProperty.Builder.() -> Unit):
          Unit = ecrImagePullerRole(EcrImagePullerRoleProperty(ecrImagePullerRole))

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty,
    ) : PrivateRegistryAccessProperty {
      public override fun ecrImagePullerRole(): Any? = unwrap(this).getEcrImagePullerRole()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateRegistryAccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty):
          PrivateRegistryAccessProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateRegistryAccessProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PrivateRegistryAccessProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EnvironmentVariableProperty {
    public fun `value`(): String? = unwrap(this).getValue()

    public fun variable(): String? = unwrap(this).getVariable()

    public interface Builder {
      public fun `value`(`value`: String) {
      }

      public fun variable(variable: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty.builder()

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public override fun variable(variable: String) {
        cdkBuilder.variable(variable)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty,
    ) : EnvironmentVariableProperty {
      public override fun `value`(): String? = unwrap(this).getValue()

      public override fun variable(): String? = unwrap(this).getVariable()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty):
          EnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.EnvironmentVariableProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PublicDomainNameProperty {
    public fun certificateName(): String? = unwrap(this).getCertificateName()

    public fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()

    public interface Builder {
      public fun certificateName(certificateName: String) {
      }

      public fun domainNames(domainNames: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty.builder()

      public override fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
      }

      public override fun domainNames(domainNames: List<String>) {
        cdkBuilder.domainNames(domainNames)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty,
    ) : PublicDomainNameProperty {
      public override fun certificateName(): String? = unwrap(this).getCertificateName()

      public override fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PublicDomainNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty):
          PublicDomainNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicDomainNameProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicDomainNameProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EcrImagePullerRoleProperty {
    public fun isActive(): Any? = unwrap(this).getIsActive()

    public fun principalArn(): String? = unwrap(this).getPrincipalArn()

    public interface Builder {
      public fun isActive(isActive: Boolean) {
      }

      public fun isActive(isActive: IResolvable) {
      }

      public fun principalArn(principalArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty.builder()

      public override fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
      }

      public override fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive.let(IResolvable::unwrap))
      }

      public override fun principalArn(principalArn: String) {
        cdkBuilder.principalArn(principalArn)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty,
    ) : EcrImagePullerRoleProperty {
      public override fun isActive(): Any? = unwrap(this).getIsActive()

      public override fun principalArn(): String? = unwrap(this).getPrincipalArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcrImagePullerRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty):
          EcrImagePullerRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcrImagePullerRoleProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.EcrImagePullerRoleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PortInfoProperty {
    public fun port(): String? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public interface Builder {
      public fun port(port: String) {
      }

      public fun protocol(protocol: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty.builder()

      public override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty,
    ) : PortInfoProperty {
      public override fun port(): String? = unwrap(this).getPort()

      public override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty):
          PortInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortInfoProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PortInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ContainerProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun containerName(): String? = unwrap(this).getContainerName()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun image(): String? = unwrap(this).getImage()

    public fun ports(): Any? = unwrap(this).getPorts()

    public interface Builder {
      public fun command(command: List<String>) {
      }

      public fun containerName(containerName: String) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: List<Any>) {
      }

      public fun image(image: String) {
      }

      public fun ports(ports: IResolvable) {
      }

      public fun ports(ports: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty.builder()

      public override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      public override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      public override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public override fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports.let(IResolvable::unwrap))
      }

      public override fun ports(ports: List<Any>) {
        cdkBuilder.ports(ports)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty,
    ) : ContainerProperty {
      public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      public override fun containerName(): String? = unwrap(this).getContainerName()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun image(): String? = unwrap(this).getImage()

      public override fun ports(): Any? = unwrap(this).getPorts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty):
          ContainerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HealthCheckConfigProperty {
    public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    public fun intervalSeconds(): Number? = unwrap(this).getIntervalSeconds()

    public fun path(): String? = unwrap(this).getPath()

    public fun successCodes(): String? = unwrap(this).getSuccessCodes()

    public fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

    public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

    public interface Builder {
      public fun healthyThreshold(healthyThreshold: Number) {
      }

      public fun intervalSeconds(intervalSeconds: Number) {
      }

      public fun path(path: String) {
      }

      public fun successCodes(successCodes: String) {
      }

      public fun timeoutSeconds(timeoutSeconds: Number) {
      }

      public fun unhealthyThreshold(unhealthyThreshold: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty.builder()

      public override fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      public override fun intervalSeconds(intervalSeconds: Number) {
        cdkBuilder.intervalSeconds(intervalSeconds)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public override fun successCodes(successCodes: String) {
        cdkBuilder.successCodes(successCodes)
      }

      public override fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
      }

      public override fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty,
    ) : HealthCheckConfigProperty {
      public override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

      public override fun intervalSeconds(): Number? = unwrap(this).getIntervalSeconds()

      public override fun path(): String? = unwrap(this).getPath()

      public override fun successCodes(): String? = unwrap(this).getSuccessCodes()

      public override fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

      public override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty):
          HealthCheckConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.HealthCheckConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContainerServiceDeploymentProperty {
    public fun containers(): Any? = unwrap(this).getContainers()

    public fun publicEndpoint(): Any? = unwrap(this).getPublicEndpoint()

    public interface Builder {
      public fun containers(containers: IResolvable) {
      }

      public fun containers(containers: List<Any>) {
      }

      public fun publicEndpoint(publicEndpoint: IResolvable) {
      }

      public fun publicEndpoint(publicEndpoint: PublicEndpointProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c45185e4c5081a7a57c2048a7d30a43fc4200b5d930c77ba5f693d10f5ced8b")
      public fun publicEndpoint(publicEndpoint: PublicEndpointProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty.builder()

      public override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      public override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      public override fun publicEndpoint(publicEndpoint: IResolvable) {
        cdkBuilder.publicEndpoint(publicEndpoint.let(IResolvable::unwrap))
      }

      public override fun publicEndpoint(publicEndpoint: PublicEndpointProperty) {
        cdkBuilder.publicEndpoint(publicEndpoint.let(PublicEndpointProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c45185e4c5081a7a57c2048a7d30a43fc4200b5d930c77ba5f693d10f5ced8b")
      public override fun publicEndpoint(publicEndpoint: PublicEndpointProperty.Builder.() -> Unit):
          Unit = publicEndpoint(PublicEndpointProperty(publicEndpoint))

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty,
    ) : ContainerServiceDeploymentProperty {
      public override fun containers(): Any? = unwrap(this).getContainers()

      public override fun publicEndpoint(): Any? = unwrap(this).getPublicEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContainerServiceDeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty):
          ContainerServiceDeploymentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerServiceDeploymentProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.ContainerServiceDeploymentProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PublicEndpointProperty {
    public fun containerName(): String? = unwrap(this).getContainerName()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

    public interface Builder {
      public fun containerName(containerName: String) {
      }

      public fun containerPort(containerPort: Number) {
      }

      public fun healthCheckConfig(healthCheckConfig: IResolvable) {
      }

      public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fa4e095f5a171e0db397ff2351377f66c7e234035c5d0f7629259cf0298758")
      public
          fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty.builder()

      public override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      public override fun healthCheckConfig(healthCheckConfig: IResolvable) {
        cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable::unwrap))
      }

      public override fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty) {
        cdkBuilder.healthCheckConfig(healthCheckConfig.let(HealthCheckConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44fa4e095f5a171e0db397ff2351377f66c7e234035c5d0f7629259cf0298758")
      public override
          fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit):
          Unit = healthCheckConfig(HealthCheckConfigProperty(healthCheckConfig))

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty,
    ) : PublicEndpointProperty {
      public override fun containerName(): String? = unwrap(this).getContainerName()

      public override fun containerPort(): Number? = unwrap(this).getContainerPort()

      public override fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PublicEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty):
          PublicEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicEndpointProperty):
          software.amazon.awscdk.services.lightsail.CfnContainer.PublicEndpointProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
