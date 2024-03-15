@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEnvironmentProps {
  public fun applicationName(): String

  public fun cnamePrefix(): String? = unwrap(this).getCnamePrefix()

  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public fun operationsRole(): String? = unwrap(this).getOperationsRole()

  public fun optionSettings(): Any? = unwrap(this).getOptionSettings()

  public fun platformArn(): String? = unwrap(this).getPlatformArn()

  public fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun templateName(): String? = unwrap(this).getTemplateName()

  public fun tier(): Any? = unwrap(this).getTier()

  public fun versionLabel(): String? = unwrap(this).getVersionLabel()

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun cnamePrefix(cnamePrefix: String)

    public fun description(description: String)

    public fun environmentName(environmentName: String)

    public fun operationsRole(operationsRole: String)

    public fun optionSettings(optionSettings: IResolvable)

    public fun optionSettings(optionSettings: List<Any>)

    public fun optionSettings(vararg optionSettings: Any)

    public fun platformArn(platformArn: String)

    public fun solutionStackName(solutionStackName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateName(templateName: String)

    public fun tier(tier: IResolvable)

    public fun tier(tier: CfnEnvironment.TierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0325c6bffe853836c3f1a8af9d71f618fa1b11625d09ed79c079ba050111fecb")
    public fun tier(tier: CfnEnvironment.TierProperty.Builder.() -> Unit)

    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun cnamePrefix(cnamePrefix: String) {
      cdkBuilder.cnamePrefix(cnamePrefix)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun operationsRole(operationsRole: String) {
      cdkBuilder.operationsRole(operationsRole)
    }

    override fun optionSettings(optionSettings: IResolvable) {
      cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
    }

    override fun optionSettings(optionSettings: List<Any>) {
      cdkBuilder.optionSettings(optionSettings)
    }

    override fun optionSettings(vararg optionSettings: Any): Unit =
        optionSettings(optionSettings.toList())

    override fun platformArn(platformArn: String) {
      cdkBuilder.platformArn(platformArn)
    }

    override fun solutionStackName(solutionStackName: String) {
      cdkBuilder.solutionStackName(solutionStackName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    override fun tier(tier: IResolvable) {
      cdkBuilder.tier(tier.let(IResolvable::unwrap))
    }

    override fun tier(tier: CfnEnvironment.TierProperty) {
      cdkBuilder.tier(tier.let(CfnEnvironment.TierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0325c6bffe853836c3f1a8af9d71f618fa1b11625d09ed79c079ba050111fecb")
    override fun tier(tier: CfnEnvironment.TierProperty.Builder.() -> Unit): Unit =
        tier(CfnEnvironment.TierProperty(tier))

    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun cnamePrefix(): String? = unwrap(this).getCnamePrefix()

    override fun description(): String? = unwrap(this).getDescription()

    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    override fun operationsRole(): String? = unwrap(this).getOperationsRole()

    override fun optionSettings(): Any? = unwrap(this).getOptionSettings()

    override fun platformArn(): String? = unwrap(this).getPlatformArn()

    override fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun templateName(): String? = unwrap(this).getTemplateName()

    override fun tier(): Any? = unwrap(this).getTier()

    override fun versionLabel(): String? = unwrap(this).getVersionLabel()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps
  }
}
