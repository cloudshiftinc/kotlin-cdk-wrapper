@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLaunchTemplateProps {
  public fun launchTemplateData(): Any

  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  @CdkDslMarker
  public interface Builder {
    public fun launchTemplateData(launchTemplateData: IResolvable)

    public fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("622b4f69c0a90c2e77ae46fdc38b9be8387439ab552cc98386a6e7fb021ea84e")
    public
        fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder.() -> Unit)

    public fun launchTemplateName(launchTemplateName: String)

    public fun tagSpecifications(tagSpecifications: IResolvable)

    public fun tagSpecifications(tagSpecifications: List<Any>)

    public fun tagSpecifications(vararg tagSpecifications: Any)

    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps.Builder =
        software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps.builder()

    override fun launchTemplateData(launchTemplateData: IResolvable) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(IResolvable::unwrap))
    }

    override
        fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(CfnLaunchTemplate.LaunchTemplateDataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("622b4f69c0a90c2e77ae46fdc38b9be8387439ab552cc98386a6e7fb021ea84e")
    override
        fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder.() -> Unit):
        Unit = launchTemplateData(CfnLaunchTemplate.LaunchTemplateDataProperty(launchTemplateData))

    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps,
  ) : CdkObject(cdkObject), CfnLaunchTemplateProps {
    override fun launchTemplateData(): Any = unwrap(this).getLaunchTemplateData()

    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps):
        CfnLaunchTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchTemplateProps):
        software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps
  }
}
