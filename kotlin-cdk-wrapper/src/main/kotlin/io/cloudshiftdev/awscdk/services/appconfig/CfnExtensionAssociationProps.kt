@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnExtensionAssociationProps {
  public fun extensionIdentifier(): String? = unwrap(this).getExtensionIdentifier()

  public fun extensionVersionNumber(): Number? = unwrap(this).getExtensionVersionNumber()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun extensionIdentifier(extensionIdentifier: String)

    public fun extensionVersionNumber(extensionVersionNumber: Number)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, String>)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps.builder()

    override fun extensionIdentifier(extensionIdentifier: String) {
      cdkBuilder.extensionIdentifier(extensionIdentifier)
    }

    override fun extensionVersionNumber(extensionVersionNumber: Number) {
      cdkBuilder.extensionVersionNumber(extensionVersionNumber)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps,
  ) : CdkObject(cdkObject), CfnExtensionAssociationProps {
    override fun extensionIdentifier(): String? = unwrap(this).getExtensionIdentifier()

    override fun extensionVersionNumber(): Number? = unwrap(this).getExtensionVersionNumber()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExtensionAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps):
        CfnExtensionAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExtensionAssociationProps):
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps
  }
}
