@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDeviceDefinitionProps {
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public fun name(): String

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: CfnDeviceDefinition.DeviceDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("690c75c6a9437be0336307fb32c291d442d815e8129c1b3591914fe10e4c2233")
    public
        fun initialVersion(initialVersion: CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps.builder()

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override
        fun initialVersion(initialVersion: CfnDeviceDefinition.DeviceDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnDeviceDefinition.DeviceDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("690c75c6a9437be0336307fb32c291d442d815e8129c1b3591914fe10e4c2233")
    override
        fun initialVersion(initialVersion: CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CfnDeviceDefinition.DeviceDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps,
  ) : CdkObject(cdkObject), CfnDeviceDefinitionProps {
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps):
        CfnDeviceDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps
  }
}
