@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectorDefinitionProps {
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public fun name(): String

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5ac19e80b4d53be9291bac9410a56b0853e6f8f03c25b8bf40ae0c36431d34")
    public
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps.builder()

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnConnectorDefinition.ConnectorDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5ac19e80b4d53be9291bac9410a56b0853e6f8f03c25b8bf40ae0c36431d34")
    override
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder.() -> Unit):
        Unit =
        initialVersion(CfnConnectorDefinition.ConnectorDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps,
  ) : CdkObject(cdkObject), CfnConnectorDefinitionProps {
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps):
        CfnConnectorDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps
  }
}
