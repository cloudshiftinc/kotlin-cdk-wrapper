@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnContainerProps {
  public fun containerServiceDeployment(): Any? = unwrap(this).getContainerServiceDeployment()

  public fun isDisabled(): Any? = unwrap(this).getIsDisabled()

  public fun power(): String

  public fun privateRegistryAccess(): Any? = unwrap(this).getPrivateRegistryAccess()

  public fun publicDomainNames(): Any? = unwrap(this).getPublicDomainNames()

  public fun scale(): Number

  public fun serviceName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun containerServiceDeployment(containerServiceDeployment: IResolvable)

    public
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91ca67103c12a77b2f2c25432b2d80f9096d5f86be295bfd0e52280f2f471f81")
    public
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty.Builder.() -> Unit)

    public fun isDisabled(isDisabled: Boolean)

    public fun isDisabled(isDisabled: IResolvable)

    public fun power(power: String)

    public fun privateRegistryAccess(privateRegistryAccess: IResolvable)

    public
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1301d17790c71cca6a31e23f98562d69e5e0f8a6cab46abe849201a3569c8be6")
    public
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty.Builder.() -> Unit)

    public fun publicDomainNames(publicDomainNames: IResolvable)

    public fun publicDomainNames(publicDomainNames: List<Any>)

    public fun publicDomainNames(vararg publicDomainNames: Any)

    public fun scale(scale: Number)

    public fun serviceName(serviceName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnContainerProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnContainerProps.builder()

    override fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(IResolvable::unwrap))
    }

    override
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(CfnContainer.ContainerServiceDeploymentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91ca67103c12a77b2f2c25432b2d80f9096d5f86be295bfd0e52280f2f471f81")
    override
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty.Builder.() -> Unit):
        Unit =
        containerServiceDeployment(CfnContainer.ContainerServiceDeploymentProperty(containerServiceDeployment))

    override fun isDisabled(isDisabled: Boolean) {
      cdkBuilder.isDisabled(isDisabled)
    }

    override fun isDisabled(isDisabled: IResolvable) {
      cdkBuilder.isDisabled(isDisabled.let(IResolvable::unwrap))
    }

    override fun power(power: String) {
      cdkBuilder.power(power)
    }

    override fun privateRegistryAccess(privateRegistryAccess: IResolvable) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(IResolvable::unwrap))
    }

    override
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(CfnContainer.PrivateRegistryAccessProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1301d17790c71cca6a31e23f98562d69e5e0f8a6cab46abe849201a3569c8be6")
    override
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty.Builder.() -> Unit):
        Unit =
        privateRegistryAccess(CfnContainer.PrivateRegistryAccessProperty(privateRegistryAccess))

    override fun publicDomainNames(publicDomainNames: IResolvable) {
      cdkBuilder.publicDomainNames(publicDomainNames.let(IResolvable::unwrap))
    }

    override fun publicDomainNames(publicDomainNames: List<Any>) {
      cdkBuilder.publicDomainNames(publicDomainNames)
    }

    override fun publicDomainNames(vararg publicDomainNames: Any): Unit =
        publicDomainNames(publicDomainNames.toList())

    override fun scale(scale: Number) {
      cdkBuilder.scale(scale)
    }

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnContainerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnContainerProps,
  ) : CdkObject(cdkObject), CfnContainerProps {
    override fun containerServiceDeployment(): Any? = unwrap(this).getContainerServiceDeployment()

    override fun isDisabled(): Any? = unwrap(this).getIsDisabled()

    override fun power(): String = unwrap(this).getPower()

    override fun privateRegistryAccess(): Any? = unwrap(this).getPrivateRegistryAccess()

    override fun publicDomainNames(): Any? = unwrap(this).getPublicDomainNames()

    override fun scale(): Number = unwrap(this).getScale()

    override fun serviceName(): String = unwrap(this).getServiceName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainerProps):
        CfnContainerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerProps):
        software.amazon.awscdk.services.lightsail.CfnContainerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnContainerProps
  }
}
