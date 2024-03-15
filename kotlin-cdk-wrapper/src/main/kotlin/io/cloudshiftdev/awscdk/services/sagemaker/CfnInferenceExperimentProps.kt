@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInferenceExperimentProps {
  public fun dataStorageConfig(): Any? = unwrap(this).getDataStorageConfig()

  public fun description(): String? = unwrap(this).getDescription()

  public fun desiredState(): String? = unwrap(this).getDesiredState()

  public fun endpointName(): String

  public fun kmsKey(): String? = unwrap(this).getKmsKey()

  public fun modelVariants(): Any

  public fun name(): String

  public fun roleArn(): String

  public fun schedule(): Any? = unwrap(this).getSchedule()

  public fun shadowModeConfig(): Any? = unwrap(this).getShadowModeConfig()

  public fun statusReason(): String? = unwrap(this).getStatusReason()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun dataStorageConfig(dataStorageConfig: IResolvable)

    public
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230de13e9a1326e3c3c66b31ad41473b32f19c7f6ad5768f3a53b6aa39ec0d55")
    public
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun desiredState(desiredState: String)

    public fun endpointName(endpointName: String)

    public fun kmsKey(kmsKey: String)

    public fun modelVariants(modelVariants: IResolvable)

    public fun modelVariants(modelVariants: List<Any>)

    public fun modelVariants(vararg modelVariants: Any)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e096285ae42483363fa6d87de9717d6cd427622fa505d51be7713b8161daecad")
    public
        fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder.() -> Unit)

    public fun shadowModeConfig(shadowModeConfig: IResolvable)

    public fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d6081dbb5198770f8528460e240bd952c1cd9291f29d6271d7e138c9da1af6")
    public
        fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty.Builder.() -> Unit)

    public fun statusReason(statusReason: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps.builder()

    override fun dataStorageConfig(dataStorageConfig: IResolvable) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(IResolvable::unwrap))
    }

    override
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(CfnInferenceExperiment.DataStorageConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230de13e9a1326e3c3c66b31ad41473b32f19c7f6ad5768f3a53b6aa39ec0d55")
    override
        fun dataStorageConfig(dataStorageConfig: CfnInferenceExperiment.DataStorageConfigProperty.Builder.() -> Unit):
        Unit =
        dataStorageConfig(CfnInferenceExperiment.DataStorageConfigProperty(dataStorageConfig))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    override fun modelVariants(modelVariants: IResolvable) {
      cdkBuilder.modelVariants(modelVariants.let(IResolvable::unwrap))
    }

    override fun modelVariants(modelVariants: List<Any>) {
      cdkBuilder.modelVariants(modelVariants)
    }

    override fun modelVariants(vararg modelVariants: Any): Unit =
        modelVariants(modelVariants.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnInferenceExperiment.InferenceExperimentScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e096285ae42483363fa6d87de9717d6cd427622fa505d51be7713b8161daecad")
    override
        fun schedule(schedule: CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder.() -> Unit):
        Unit = schedule(CfnInferenceExperiment.InferenceExperimentScheduleProperty(schedule))

    override fun shadowModeConfig(shadowModeConfig: IResolvable) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(IResolvable::unwrap))
    }

    override
        fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(CfnInferenceExperiment.ShadowModeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d6081dbb5198770f8528460e240bd952c1cd9291f29d6271d7e138c9da1af6")
    override
        fun shadowModeConfig(shadowModeConfig: CfnInferenceExperiment.ShadowModeConfigProperty.Builder.() -> Unit):
        Unit = shadowModeConfig(CfnInferenceExperiment.ShadowModeConfigProperty(shadowModeConfig))

    override fun statusReason(statusReason: String) {
      cdkBuilder.statusReason(statusReason)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps,
  ) : CdkObject(cdkObject), CfnInferenceExperimentProps {
    override fun dataStorageConfig(): Any? = unwrap(this).getDataStorageConfig()

    override fun description(): String? = unwrap(this).getDescription()

    override fun desiredState(): String? = unwrap(this).getDesiredState()

    override fun endpointName(): String = unwrap(this).getEndpointName()

    override fun kmsKey(): String? = unwrap(this).getKmsKey()

    override fun modelVariants(): Any = unwrap(this).getModelVariants()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun schedule(): Any? = unwrap(this).getSchedule()

    override fun shadowModeConfig(): Any? = unwrap(this).getShadowModeConfig()

    override fun statusReason(): String? = unwrap(this).getStatusReason()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInferenceExperimentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps):
        CfnInferenceExperimentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceExperimentProps):
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps
  }
}
