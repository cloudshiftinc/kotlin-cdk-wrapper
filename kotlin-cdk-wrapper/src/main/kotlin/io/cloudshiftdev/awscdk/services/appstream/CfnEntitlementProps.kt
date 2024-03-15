@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEntitlementProps {
  public fun appVisibility(): String

  public fun attributes(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun stackName(): String

  @CdkDslMarker
  public interface Builder {
    public fun appVisibility(appVisibility: String)

    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: List<Any>)

    public fun attributes(vararg attributes: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun stackName(stackName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnEntitlementProps.Builder =
        software.amazon.awscdk.services.appstream.CfnEntitlementProps.builder()

    override fun appVisibility(appVisibility: String) {
      cdkBuilder.appVisibility(appVisibility)
    }

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: List<Any>) {
      cdkBuilder.attributes(attributes)
    }

    override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnEntitlementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlementProps,
  ) : CdkObject(cdkObject), CfnEntitlementProps {
    override fun appVisibility(): String = unwrap(this).getAppVisibility()

    override fun attributes(): Any = unwrap(this).getAttributes()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun stackName(): String = unwrap(this).getStackName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEntitlementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlementProps):
        CfnEntitlementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEntitlementProps):
        software.amazon.awscdk.services.appstream.CfnEntitlementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnEntitlementProps
  }
}
