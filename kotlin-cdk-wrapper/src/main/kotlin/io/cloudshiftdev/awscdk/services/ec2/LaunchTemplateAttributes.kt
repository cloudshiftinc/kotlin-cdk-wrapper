@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface LaunchTemplateAttributes {
  public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  public fun versionNumber(): String? = unwrap(this).getVersionNumber()

  @CdkDslMarker
  public interface Builder {
    public fun launchTemplateId(launchTemplateId: String)

    public fun launchTemplateName(launchTemplateName: String)

    public fun versionNumber(versionNumber: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplateAttributes.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateAttributes.builder()

    override fun launchTemplateId(launchTemplateId: String) {
      cdkBuilder.launchTemplateId(launchTemplateId)
    }

    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    override fun versionNumber(versionNumber: String) {
      cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateAttributes,
  ) : CdkObject(cdkObject), LaunchTemplateAttributes {
    override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    override fun versionNumber(): String? = unwrap(this).getVersionNumber()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateAttributes):
        LaunchTemplateAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateAttributes):
        software.amazon.awscdk.services.ec2.LaunchTemplateAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.LaunchTemplateAttributes
  }
}
