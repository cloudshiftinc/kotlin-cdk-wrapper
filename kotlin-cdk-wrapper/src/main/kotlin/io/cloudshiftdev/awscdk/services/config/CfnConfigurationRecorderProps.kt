@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConfigurationRecorderProps {
  public fun name(): String? = unwrap(this).getName()

  public fun recordingGroup(): Any? = unwrap(this).getRecordingGroup()

  public fun recordingMode(): Any? = unwrap(this).getRecordingMode()

  public fun roleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun recordingGroup(recordingGroup: IResolvable)

    public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d07c861dfc7844a316aa9149574d7c25c0c0eb903a0b025847098b8536a501c")
    public
        fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit)

    public fun recordingMode(recordingMode: IResolvable)

    public fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c37cbed818ebfce8cbed37118534cb9818eb79e17f095e9146ccee1f331b41b6")
    public
        fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder =
        software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recordingGroup(recordingGroup: IResolvable) {
      cdkBuilder.recordingGroup(recordingGroup.let(IResolvable::unwrap))
    }

    override fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
      cdkBuilder.recordingGroup(recordingGroup.let(CfnConfigurationRecorder.RecordingGroupProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d07c861dfc7844a316aa9149574d7c25c0c0eb903a0b025847098b8536a501c")
    override
        fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit):
        Unit = recordingGroup(CfnConfigurationRecorder.RecordingGroupProperty(recordingGroup))

    override fun recordingMode(recordingMode: IResolvable) {
      cdkBuilder.recordingMode(recordingMode.let(IResolvable::unwrap))
    }

    override fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty) {
      cdkBuilder.recordingMode(recordingMode.let(CfnConfigurationRecorder.RecordingModeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c37cbed818ebfce8cbed37118534cb9818eb79e17f095e9146ccee1f331b41b6")
    override
        fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty.Builder.() -> Unit):
        Unit = recordingMode(CfnConfigurationRecorder.RecordingModeProperty(recordingMode))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationRecorderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorderProps,
  ) : CdkObject(cdkObject), CfnConfigurationRecorderProps {
    override fun name(): String? = unwrap(this).getName()

    override fun recordingGroup(): Any? = unwrap(this).getRecordingGroup()

    override fun recordingMode(): Any? = unwrap(this).getRecordingMode()

    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationRecorderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorderProps):
        CfnConfigurationRecorderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationRecorderProps):
        software.amazon.awscdk.services.config.CfnConfigurationRecorderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
  }
}
