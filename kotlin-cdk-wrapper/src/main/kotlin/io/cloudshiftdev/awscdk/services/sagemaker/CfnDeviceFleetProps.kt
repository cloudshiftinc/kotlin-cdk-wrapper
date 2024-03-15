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

public interface CfnDeviceFleetProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun deviceFleetName(): String

  public fun outputConfig(): Any

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun deviceFleetName(deviceFleetName: String)

    public fun outputConfig(outputConfig: IResolvable)

    public fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daffec862206a87e02d56b15c666c335c0e75534e9d3debb7dceabca1235918f")
    public
        fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    override fun outputConfig(outputConfig: IResolvable) {
      cdkBuilder.outputConfig(outputConfig.let(IResolvable::unwrap))
    }

    override fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty) {
      cdkBuilder.outputConfig(outputConfig.let(CfnDeviceFleet.EdgeOutputConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daffec862206a87e02d56b15c666c335c0e75534e9d3debb7dceabca1235918f")
    override
        fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty.Builder.() -> Unit):
        Unit = outputConfig(CfnDeviceFleet.EdgeOutputConfigProperty(outputConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps,
  ) : CdkObject(cdkObject), CfnDeviceFleetProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

    override fun outputConfig(): Any = unwrap(this).getOutputConfig()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps):
        CfnDeviceFleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceFleetProps):
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps
  }
}
