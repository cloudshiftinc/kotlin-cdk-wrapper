@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.comprehend

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFlywheelProps {
  public fun activeModelArn(): String? = unwrap(this).getActiveModelArn()

  public fun dataAccessRoleArn(): String

  public fun dataLakeS3Uri(): String

  public fun dataSecurityConfig(): Any? = unwrap(this).getDataSecurityConfig()

  public fun flywheelName(): String

  public fun modelType(): String? = unwrap(this).getModelType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun taskConfig(): Any? = unwrap(this).getTaskConfig()

  @CdkDslMarker
  public interface Builder {
    public fun activeModelArn(activeModelArn: String)

    public fun dataAccessRoleArn(dataAccessRoleArn: String)

    public fun dataLakeS3Uri(dataLakeS3Uri: String)

    public fun dataSecurityConfig(dataSecurityConfig: IResolvable)

    public fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f18de2912081bb4e7a28dc7d6104e9981ab7a6ce1da1fc281d32971aa37b8ba")
    public
        fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty.Builder.() -> Unit)

    public fun flywheelName(flywheelName: String)

    public fun modelType(modelType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskConfig(taskConfig: IResolvable)

    public fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65d278bec051cfcb9344fe0b5f7a5e05eab667458ae6963dc2e118848bf9009d")
    public fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.comprehend.CfnFlywheelProps.Builder =
        software.amazon.awscdk.services.comprehend.CfnFlywheelProps.builder()

    override fun activeModelArn(activeModelArn: String) {
      cdkBuilder.activeModelArn(activeModelArn)
    }

    override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    override fun dataLakeS3Uri(dataLakeS3Uri: String) {
      cdkBuilder.dataLakeS3Uri(dataLakeS3Uri)
    }

    override fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(IResolvable::unwrap))
    }

    override fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(CfnFlywheel.DataSecurityConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f18de2912081bb4e7a28dc7d6104e9981ab7a6ce1da1fc281d32971aa37b8ba")
    override
        fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty.Builder.() -> Unit):
        Unit = dataSecurityConfig(CfnFlywheel.DataSecurityConfigProperty(dataSecurityConfig))

    override fun flywheelName(flywheelName: String) {
      cdkBuilder.flywheelName(flywheelName)
    }

    override fun modelType(modelType: String) {
      cdkBuilder.modelType(modelType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun taskConfig(taskConfig: IResolvable) {
      cdkBuilder.taskConfig(taskConfig.let(IResolvable::unwrap))
    }

    override fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty) {
      cdkBuilder.taskConfig(taskConfig.let(CfnFlywheel.TaskConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65d278bec051cfcb9344fe0b5f7a5e05eab667458ae6963dc2e118848bf9009d")
    override fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty.Builder.() -> Unit): Unit =
        taskConfig(CfnFlywheel.TaskConfigProperty(taskConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheelProps,
  ) : CdkObject(cdkObject), CfnFlywheelProps {
    override fun activeModelArn(): String? = unwrap(this).getActiveModelArn()

    override fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

    override fun dataLakeS3Uri(): String = unwrap(this).getDataLakeS3Uri()

    override fun dataSecurityConfig(): Any? = unwrap(this).getDataSecurityConfig()

    override fun flywheelName(): String = unwrap(this).getFlywheelName()

    override fun modelType(): String? = unwrap(this).getModelType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun taskConfig(): Any? = unwrap(this).getTaskConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlywheelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheelProps):
        CfnFlywheelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlywheelProps):
        software.amazon.awscdk.services.comprehend.CfnFlywheelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.comprehend.CfnFlywheelProps
  }
}
