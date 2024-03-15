@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDevicePoolProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun maxDevices(): Number? = unwrap(this).getMaxDevices()

  public fun name(): String

  public fun projectArn(): String

  public fun rules(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun maxDevices(maxDevices: Number)

    public fun name(name: String)

    public fun projectArn(projectArn: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun maxDevices(maxDevices: Number) {
      cdkBuilder.maxDevices(maxDevices)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps,
  ) : CdkObject(cdkObject), CfnDevicePoolProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun maxDevices(): Number? = unwrap(this).getMaxDevices()

    override fun name(): String = unwrap(this).getName()

    override fun projectArn(): String = unwrap(this).getProjectArn()

    override fun rules(): Any = unwrap(this).getRules()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDevicePoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps):
        CfnDevicePoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDevicePoolProps):
        software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps
  }
}
