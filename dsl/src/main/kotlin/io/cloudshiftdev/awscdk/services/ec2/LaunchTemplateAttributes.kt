package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface LaunchTemplateAttributes {
  /**
   * The identifier of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
   *
   * Default: None
   */
  public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

  /**
   * The name of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
   *
   * Default: None
   */
  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  /**
   * The version number of this launch template to use.
   *
   * Default: Version: "$Default"
   */
  public fun versionNumber(): String? = unwrap(this).getVersionNumber()

  /**
   * A builder for [LaunchTemplateAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param launchTemplateId The identifier of the Launch Template.
     * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
     */
    public fun launchTemplateId(launchTemplateId: String)

    /**
     * @param launchTemplateName The name of the Launch Template.
     * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
     */
    public fun launchTemplateName(launchTemplateName: String)

    /**
     * @param versionNumber The version number of this launch template to use.
     */
    public fun versionNumber(versionNumber: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplateAttributes.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateAttributes.builder()

    /**
     * @param launchTemplateId The identifier of the Launch Template.
     * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
     */
    override fun launchTemplateId(launchTemplateId: String) {
      cdkBuilder.launchTemplateId(launchTemplateId)
    }

    /**
     * @param launchTemplateName The name of the Launch Template.
     * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
     */
    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param versionNumber The version number of this launch template to use.
     */
    override fun versionNumber(versionNumber: String) {
      cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateAttributes,
  ) : CdkObject(cdkObject), LaunchTemplateAttributes {
    /**
     * The identifier of the Launch Template.
     *
     * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
     *
     * Default: None
     */
    override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the Launch Template.
     *
     * Exactly one of `launchTemplateId` and `launchTemplateName` may be set.
     *
     * Default: None
     */
    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The version number of this launch template to use.
     *
     * Default: Version: "$Default"
     */
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
