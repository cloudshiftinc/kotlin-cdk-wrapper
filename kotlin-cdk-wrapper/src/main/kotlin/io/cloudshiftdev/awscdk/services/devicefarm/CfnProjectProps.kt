@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProjectProps {
  public fun defaultJobTimeoutMinutes(): Number? = unwrap(this).getDefaultJobTimeoutMinutes()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d1a73c3407df2efd09f1531c5376d81f273838fe2f66b19a640d3f41cb3407")
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnProjectProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnProjectProps.builder()

    override fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number) {
      cdkBuilder.defaultJobTimeoutMinutes(defaultJobTimeoutMinutes)
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

    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnProject.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d1a73c3407df2efd09f1531c5376d81f273838fe2f66b19a640d3f41cb3407")
    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnProject.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun defaultJobTimeoutMinutes(): Number? = unwrap(this).getDefaultJobTimeoutMinutes()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.devicefarm.CfnProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnProjectProps
  }
}
