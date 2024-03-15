@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lookoutequipment

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInferenceSchedulerProps {
  public fun dataDelayOffsetInMinutes(): Number? = unwrap(this).getDataDelayOffsetInMinutes()

  public fun dataInputConfiguration(): Any

  public fun dataOutputConfiguration(): Any

  public fun dataUploadFrequency(): String

  public fun inferenceSchedulerName(): String? = unwrap(this).getInferenceSchedulerName()

  public fun modelName(): String

  public fun roleArn(): String

  public fun serverSideKmsKeyId(): String? = unwrap(this).getServerSideKmsKeyId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number)

    public fun dataInputConfiguration(dataInputConfiguration: Any)

    public fun dataOutputConfiguration(dataOutputConfiguration: Any)

    public fun dataUploadFrequency(dataUploadFrequency: String)

    public fun inferenceSchedulerName(inferenceSchedulerName: String)

    public fun modelName(modelName: String)

    public fun roleArn(roleArn: String)

    public fun serverSideKmsKeyId(serverSideKmsKeyId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps.Builder =
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps.builder()

    override fun dataDelayOffsetInMinutes(dataDelayOffsetInMinutes: Number) {
      cdkBuilder.dataDelayOffsetInMinutes(dataDelayOffsetInMinutes)
    }

    override fun dataInputConfiguration(dataInputConfiguration: Any) {
      cdkBuilder.dataInputConfiguration(dataInputConfiguration)
    }

    override fun dataOutputConfiguration(dataOutputConfiguration: Any) {
      cdkBuilder.dataOutputConfiguration(dataOutputConfiguration)
    }

    override fun dataUploadFrequency(dataUploadFrequency: String) {
      cdkBuilder.dataUploadFrequency(dataUploadFrequency)
    }

    override fun inferenceSchedulerName(inferenceSchedulerName: String) {
      cdkBuilder.inferenceSchedulerName(inferenceSchedulerName)
    }

    override fun modelName(modelName: String) {
      cdkBuilder.modelName(modelName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun serverSideKmsKeyId(serverSideKmsKeyId: String) {
      cdkBuilder.serverSideKmsKeyId(serverSideKmsKeyId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps,
  ) : CdkObject(cdkObject), CfnInferenceSchedulerProps {
    override fun dataDelayOffsetInMinutes(): Number? = unwrap(this).getDataDelayOffsetInMinutes()

    override fun dataInputConfiguration(): Any = unwrap(this).getDataInputConfiguration()

    override fun dataOutputConfiguration(): Any = unwrap(this).getDataOutputConfiguration()

    override fun dataUploadFrequency(): String = unwrap(this).getDataUploadFrequency()

    override fun inferenceSchedulerName(): String? = unwrap(this).getInferenceSchedulerName()

    override fun modelName(): String = unwrap(this).getModelName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun serverSideKmsKeyId(): String? = unwrap(this).getServerSideKmsKeyId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInferenceSchedulerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps):
        CfnInferenceSchedulerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceSchedulerProps):
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
  }
}
