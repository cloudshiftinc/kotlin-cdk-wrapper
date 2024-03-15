@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fis

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnExperimentTemplateProps {
  public fun actions(): Any? = unwrap(this).getActions()

  public fun description(): String

  public fun experimentOptions(): Any? = unwrap(this).getExperimentOptions()

  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  public fun roleArn(): String

  public fun stopConditions(): Any

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun targets(): Any

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: Map<String, Any>)

    public fun description(description: String)

    public fun experimentOptions(experimentOptions: IResolvable)

    public
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bbdc1f234d99a5c5a8e37a49d7fd2300e00ed88a5f41732748f1139103378e60")
    public
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit)

    public fun logConfiguration(logConfiguration: IResolvable)

    public
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("008e95c28cc0f3bf73077846cd94298726ccb0c4f4682232d394ccf492ddffc7")
    public
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun stopConditions(stopConditions: IResolvable)

    public fun stopConditions(stopConditions: List<Any>)

    public fun stopConditions(vararg stopConditions: Any)

    public fun tags(tags: Map<String, String>)

    public fun targets(targets: IResolvable)

    public fun targets(targets: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fis.CfnExperimentTemplateProps.Builder =
        software.amazon.awscdk.services.fis.CfnExperimentTemplateProps.builder()

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: Map<String, Any>) {
      cdkBuilder.actions(actions)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun experimentOptions(experimentOptions: IResolvable) {
      cdkBuilder.experimentOptions(experimentOptions.let(IResolvable::unwrap))
    }

    override
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty) {
      cdkBuilder.experimentOptions(experimentOptions.let(CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bbdc1f234d99a5c5a8e37a49d7fd2300e00ed88a5f41732748f1139103378e60")
    override
        fun experimentOptions(experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.Builder.() -> Unit):
        Unit =
        experimentOptions(CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty(experimentOptions))

    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    override
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("008e95c28cc0f3bf73077846cd94298726ccb0c4f4682232d394ccf492ddffc7")
    override
        fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder.() -> Unit):
        Unit =
        logConfiguration(CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty(logConfiguration))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stopConditions(stopConditions: IResolvable) {
      cdkBuilder.stopConditions(stopConditions.let(IResolvable::unwrap))
    }

    override fun stopConditions(stopConditions: List<Any>) {
      cdkBuilder.stopConditions(stopConditions)
    }

    override fun stopConditions(vararg stopConditions: Any): Unit =
        stopConditions(stopConditions.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: Map<String, Any>) {
      cdkBuilder.targets(targets)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnExperimentTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplateProps,
  ) : CdkObject(cdkObject), CfnExperimentTemplateProps {
    override fun actions(): Any? = unwrap(this).getActions()

    override fun description(): String = unwrap(this).getDescription()

    override fun experimentOptions(): Any? = unwrap(this).getExperimentOptions()

    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun stopConditions(): Any = unwrap(this).getStopConditions()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun targets(): Any = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExperimentTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnExperimentTemplateProps):
        CfnExperimentTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExperimentTemplateProps):
        software.amazon.awscdk.services.fis.CfnExperimentTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fis.CfnExperimentTemplateProps
  }
}
