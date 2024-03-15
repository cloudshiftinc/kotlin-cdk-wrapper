@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWirelessDeviceImportTaskProps {
  public fun destinationName(): String

  public fun sidewalk(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun destinationName(destinationName: String)

    public fun sidewalk(sidewalk: IResolvable)

    public fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3acd147cb1564d5956888f90f52255eca986a3d8e64ae9bd2222b16e3e4dda45")
    public fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps.builder()

    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable::unwrap))
    }

    override fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty) {
      cdkBuilder.sidewalk(sidewalk.let(CfnWirelessDeviceImportTask.SidewalkProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3acd147cb1564d5956888f90f52255eca986a3d8e64ae9bd2222b16e3e4dda45")
    override
        fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty.Builder.() -> Unit):
        Unit = sidewalk(CfnWirelessDeviceImportTask.SidewalkProperty(sidewalk))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps,
  ) : CdkObject(cdkObject), CfnWirelessDeviceImportTaskProps {
    override fun destinationName(): String = unwrap(this).getDestinationName()

    override fun sidewalk(): Any = unwrap(this).getSidewalk()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWirelessDeviceImportTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps):
        CfnWirelessDeviceImportTaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessDeviceImportTaskProps):
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
  }
}
