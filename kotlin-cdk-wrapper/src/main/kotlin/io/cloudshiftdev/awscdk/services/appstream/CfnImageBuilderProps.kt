@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnImageBuilderProps {
  public fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  public fun appstreamAgentVersion(): String? = unwrap(this).getAppstreamAgentVersion()

  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  public fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  public fun imageArn(): String? = unwrap(this).getImageArn()

  public fun imageName(): String? = unwrap(this).getImageName()

  public fun instanceType(): String

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun accessEndpoints(accessEndpoints: IResolvable)

    public fun accessEndpoints(accessEndpoints: List<Any>)

    public fun accessEndpoints(vararg accessEndpoints: Any)

    public fun appstreamAgentVersion(appstreamAgentVersion: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    public fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d189c58a3040ea7993349962820ce225fa99380d3de909a549d6c5dcbfc6ab")
    public
        fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty.Builder.() -> Unit)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    public fun iamRoleArn(iamRoleArn: String)

    public fun imageArn(imageArn: String)

    public fun imageName(imageName: String)

    public fun instanceType(instanceType: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac911a63b382e511ea01922fcba40e9aaef610cbb8bcedd3a27b9d43c88197e")
    public fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder =
        software.amazon.awscdk.services.appstream.CfnImageBuilderProps.builder()

    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    override fun appstreamAgentVersion(appstreamAgentVersion: String) {
      cdkBuilder.appstreamAgentVersion(appstreamAgentVersion)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable::unwrap))
    }

    override fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(CfnImageBuilder.DomainJoinInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25d189c58a3040ea7993349962820ce225fa99380d3de909a549d6c5dcbfc6ab")
    override
        fun domainJoinInfo(domainJoinInfo: CfnImageBuilder.DomainJoinInfoProperty.Builder.() -> Unit):
        Unit = domainJoinInfo(CfnImageBuilder.DomainJoinInfoProperty(domainJoinInfo))

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
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

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnImageBuilder.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ac911a63b382e511ea01922fcba40e9aaef610cbb8bcedd3a27b9d43c88197e")
    override fun vpcConfig(vpcConfig: CfnImageBuilder.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnImageBuilder.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnImageBuilderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilderProps,
  ) : CdkObject(cdkObject), CfnImageBuilderProps {
    override fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

    override fun appstreamAgentVersion(): String? = unwrap(this).getAppstreamAgentVersion()

    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

    override fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    override fun imageArn(): String? = unwrap(this).getImageArn()

    override fun imageName(): String? = unwrap(this).getImageName()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageBuilderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilderProps):
        CfnImageBuilderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageBuilderProps):
        software.amazon.awscdk.services.appstream.CfnImageBuilderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnImageBuilderProps
  }
}
