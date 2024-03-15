@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFunctionDefinitionProps {
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public fun name(): String

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ce3effc729fa61fc995b8c4d7d6360357337c4c933a2d5205ee5f513ad8cded")
    public
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps.builder()

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnFunctionDefinition.FunctionDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ce3effc729fa61fc995b8c4d7d6360357337c4c933a2d5205ee5f513ad8cded")
    override
        fun initialVersion(initialVersion: CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder.() -> Unit):
        Unit =
        initialVersion(CfnFunctionDefinition.FunctionDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps,
  ) : CdkObject(cdkObject), CfnFunctionDefinitionProps {
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps):
        CfnFunctionDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps
  }
}
