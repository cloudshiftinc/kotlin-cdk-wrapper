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

public interface CfnAppBlockBuilderProps {
  public fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  public fun appBlockArns(): List<String> = unwrap(this).getAppBlockArns() ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  public fun instanceType(): String

  public fun name(): String

  public fun platform(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun accessEndpoints(accessEndpoints: IResolvable)

    public fun accessEndpoints(accessEndpoints: List<Any>)

    public fun accessEndpoints(vararg accessEndpoints: Any)

    public fun appBlockArns(appBlockArns: List<String>)

    public fun appBlockArns(vararg appBlockArns: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    public fun iamRoleArn(iamRoleArn: String)

    public fun instanceType(instanceType: String)

    public fun name(name: String)

    public fun platform(platform: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("780e93272e0f59c93eebc95748d082f36fbc729212054545a2ce81598a77bece")
    public fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps.builder()

    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    override fun appBlockArns(appBlockArns: List<String>) {
      cdkBuilder.appBlockArns(appBlockArns)
    }

    override fun appBlockArns(vararg appBlockArns: String): Unit =
        appBlockArns(appBlockArns.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnAppBlockBuilder.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("780e93272e0f59c93eebc95748d082f36fbc729212054545a2ce81598a77bece")
    override fun vpcConfig(vpcConfig: CfnAppBlockBuilder.VpcConfigProperty.Builder.() -> Unit): Unit
        = vpcConfig(CfnAppBlockBuilder.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps,
  ) : CdkObject(cdkObject), CfnAppBlockBuilderProps {
    override fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

    override fun appBlockArns(): List<String> = unwrap(this).getAppBlockArns() ?: emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun name(): String = unwrap(this).getName()

    override fun platform(): String = unwrap(this).getPlatform()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcConfig(): Any = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppBlockBuilderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps):
        CfnAppBlockBuilderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlockBuilderProps):
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps
  }
}
