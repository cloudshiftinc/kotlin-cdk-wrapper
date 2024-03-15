@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnLoggerDefinitionProps {
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public fun name(): String

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0283d0b843567426931c81eca4b9f68f6f5a61ef4ddce9fd741eb7d5f70cfdca")
    public
        fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps.builder()

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override
        fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnLoggerDefinition.LoggerDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0283d0b843567426931c81eca4b9f68f6f5a61ef4ddce9fd741eb7d5f70cfdca")
    override
        fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CfnLoggerDefinition.LoggerDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps,
  ) : CdkObject(cdkObject), CfnLoggerDefinitionProps {
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggerDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps):
        CfnLoggerDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggerDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
  }
}
