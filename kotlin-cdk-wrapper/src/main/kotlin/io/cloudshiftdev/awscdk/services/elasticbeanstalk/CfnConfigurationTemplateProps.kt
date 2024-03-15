@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfigurationTemplateProps {
  public fun applicationName(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentId(): String? = unwrap(this).getEnvironmentId()

  public fun optionSettings(): Any? = unwrap(this).getOptionSettings()

  public fun platformArn(): String? = unwrap(this).getPlatformArn()

  public fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

  public fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun description(description: String)

    public fun environmentId(environmentId: String)

    public fun optionSettings(optionSettings: IResolvable)

    public fun optionSettings(optionSettings: List<Any>)

    public fun optionSettings(vararg optionSettings: Any)

    public fun platformArn(platformArn: String)

    public fun solutionStackName(solutionStackName: String)

    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    public
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c68c5258b737ceeec172522c1c98d600aba99dcc18cc631de89bc374d504eea")
    public
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
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

    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(CfnConfigurationTemplate.SourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c68c5258b737ceeec172522c1c98d600aba99dcc18cc631de89bc374d504eea")
    override
        fun sourceConfiguration(sourceConfiguration: CfnConfigurationTemplate.SourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        sourceConfiguration(CfnConfigurationTemplate.SourceConfigurationProperty(sourceConfiguration))

    public fun build():
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps,
  ) : CdkObject(cdkObject), CfnConfigurationTemplateProps {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun environmentId(): String? = unwrap(this).getEnvironmentId()

    override fun optionSettings(): Any? = unwrap(this).getOptionSettings()

    override fun platformArn(): String? = unwrap(this).getPlatformArn()

    override fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

    override fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps):
        CfnConfigurationTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationTemplateProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps
  }
}
