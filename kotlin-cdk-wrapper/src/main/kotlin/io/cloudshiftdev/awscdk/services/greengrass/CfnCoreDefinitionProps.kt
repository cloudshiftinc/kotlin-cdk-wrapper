@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCoreDefinitionProps {
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public fun name(): String

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: CfnCoreDefinition.CoreDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("155f1a16580ddc36d6af0cc36c4e39d53b5d76f362fa2470895bc3c456d6e784")
    public
        fun initialVersion(initialVersion: CfnCoreDefinition.CoreDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps.builder()

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override fun initialVersion(initialVersion: CfnCoreDefinition.CoreDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnCoreDefinition.CoreDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("155f1a16580ddc36d6af0cc36c4e39d53b5d76f362fa2470895bc3c456d6e784")
    override
        fun initialVersion(initialVersion: CfnCoreDefinition.CoreDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CfnCoreDefinition.CoreDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps,
  ) : CdkObject(cdkObject), CfnCoreDefinitionProps {
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCoreDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps):
        CfnCoreDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCoreDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps
  }
}
