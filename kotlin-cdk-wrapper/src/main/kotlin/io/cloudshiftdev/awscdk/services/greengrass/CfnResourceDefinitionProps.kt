@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnResourceDefinitionProps {
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public fun name(): String

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25aa5059095f95a5b51e1d5cf4fe020f7e29e43f6c40a6eca7db8fc2096ff0b")
    public
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps.builder()

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnResourceDefinition.ResourceDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25aa5059095f95a5b51e1d5cf4fe020f7e29e43f6c40a6eca7db8fc2096ff0b")
    override
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder.() -> Unit):
        Unit =
        initialVersion(CfnResourceDefinition.ResourceDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps,
  ) : CdkObject(cdkObject), CfnResourceDefinitionProps {
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps):
        CfnResourceDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps
  }
}
